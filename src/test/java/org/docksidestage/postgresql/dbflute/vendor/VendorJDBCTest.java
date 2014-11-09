package org.docksidestage.postgresql.dbflute.vendor;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import javax.sql.DataSource;

import org.dbflute.bhv.core.BehaviorCommandMeta;
import org.dbflute.bhv.proposal.callback.SimpleTraceableSqlStringFilter;
import org.dbflute.bhv.proposal.callback.TraceableSqlAdditionalInfoProvider;
import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.exception.SQLFailureException;
import org.dbflute.hook.CallbackContext;
import org.dbflute.hook.SqlLogHandler;
import org.dbflute.hook.SqlLogInfo;
import org.dbflute.utflute.core.cannonball.CannonballCar;
import org.dbflute.utflute.core.cannonball.CannonballOption;
import org.dbflute.utflute.core.cannonball.CannonballRun;
import org.dbflute.utflute.core.transaction.TransactionPerformer;
import org.dbflute.util.DfReflectionUtil;
import org.docksidestage.postgresql.dbflute.allcommon.CDef;
import org.docksidestage.postgresql.dbflute.bsentity.dbmeta.MemberDbm;
import org.docksidestage.postgresql.dbflute.cbean.MemberCB;
import org.docksidestage.postgresql.dbflute.exbhv.MemberBhv;
import org.docksidestage.postgresql.dbflute.exbhv.VendorCheckBhv;
import org.docksidestage.postgresql.dbflute.exbhv.cursor.PurchaseSummaryMemberCursor;
import org.docksidestage.postgresql.dbflute.exbhv.cursor.PurchaseSummaryMemberCursorHandler;
import org.docksidestage.postgresql.dbflute.exbhv.pmbean.PurchaseMaxPriceMemberPmb;
import org.docksidestage.postgresql.dbflute.exbhv.pmbean.PurchaseSummaryMemberPmb;
import org.docksidestage.postgresql.dbflute.exbhv.pmbean.SpInOutParameterPmb;
import org.docksidestage.postgresql.dbflute.exentity.Member;
import org.docksidestage.postgresql.dbflute.exentity.VendorCheck;
import org.docksidestage.postgresql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.9.3F (2012/04/05 Thursday)
 */
public class VendorJDBCTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;
    private VendorCheckBhv vendorCheckBhv;

    // ===================================================================================
    //                                                                          Fetch Size
    //                                                                          ==========
    public void test_ResultSet_rowData_defaultFetchSize() {
        // ## Arrange ##
        PurchaseSummaryMemberPmb pmb = new PurchaseSummaryMemberPmb();

        // ## Act ##
        PurchaseSummaryMemberCursorHandler handler = new PurchaseSummaryMemberCursorHandler() {
            @Override
            protected Object fetchCursor(PurchaseSummaryMemberCursor cursor) throws SQLException {
                // ## Assert ##
                ResultSet rs = cursor.cursor();
                assertDbAccess();
                rs.next(); // 1
                assertDbAccess();
                Set<Integer> memberIdList = new LinkedHashSet<Integer>();
                memberIdList.add(cursor.getMemberId());

                log("ResultSet   = " + rs.getClass());
                org.postgresql.jdbc3.Jdbc3ResultSet physicalRs = extractPhysicalRs(rs);
                log("Physical    = " + physicalRs.getClass());
                Vector<?> rows = extractRowsOnResultSet(physicalRs);

                log("1: rows.size() = " + rows.size());
                assertEquals(20, rows.size());
                rs.next(); // 2
                memberIdList.add(cursor.getMemberId());
                rs.next(); // 3
                memberIdList.add(cursor.getMemberId());
                rs.next(); // 4
                memberIdList.add(cursor.getMemberId());
                log("2: rows.size() = " + rows.size());
                assertEquals(20, rows.size());

                log("memberIdList = " + memberIdList);
                assertEquals(4, memberIdList.size());
                return null;
            }
        };
        memberBhv.outsideSql().selectCursor(pmb, handler);
    }

    public void test_ResultSet_rowData_specifyFetchSize() {
        // ## Arrange ##
        PurchaseSummaryMemberPmb pmb = new PurchaseSummaryMemberPmb();

        // ## Act ##
        PurchaseSummaryMemberCursorHandler handler = new PurchaseSummaryMemberCursorHandler() {
            @Override
            protected Object fetchCursor(PurchaseSummaryMemberCursor cursor) throws SQLException {
                // ## Assert ##
                ResultSet rs = cursor.cursor();
                assertDbAccess();
                rs.next(); // 1
                assertDbAccess();
                Set<Integer> memberIdList = new LinkedHashSet<Integer>();
                memberIdList.add(cursor.getMemberId());

                log("ResultSet   = " + rs.getClass());
                org.postgresql.jdbc3.Jdbc3ResultSet physicalRs = extractPhysicalRs(rs);
                log("Physical    = " + physicalRs.getClass());
                Vector<?> rows = extractRowsOnResultSet(physicalRs);

                log("1: rows.size() = " + rows.size());
                assertEquals(3, rows.size());
                rs.next(); // 2
                memberIdList.add(cursor.getMemberId());
                rs.next(); // 3
                memberIdList.add(cursor.getMemberId());
                rs.next(); // 4
                memberIdList.add(cursor.getMemberId());
                log("2: rows.size() = " + rows.size());
                assertEquals(3, rows.size());

                log("memberIdList = " + memberIdList);
                assertEquals(4, memberIdList.size());
                return null;
            }
        };
        memberBhv.outsideSql().configure(conf -> conf.fetchSize(3)).selectCursor(pmb, handler); // and transaction is required for fetching
    }

    protected int assertDbAccess() {
        return memberBhv.selectCount(new MemberCB());
    }

    protected org.postgresql.jdbc3.Jdbc3ResultSet extractPhysicalRs(ResultSet rs) { // nested
        Field field = DfReflectionUtil.getWholeField(org.apache.commons.dbcp.DelegatingResultSet.class, "_res");
        ResultSet firstRs = (ResultSet) DfReflectionUtil.getValueForcedly(field, rs);
        return (org.postgresql.jdbc3.Jdbc3ResultSet) DfReflectionUtil.getValueForcedly(field, firstRs);
    }

    protected Vector<?> extractRowsOnResultSet(org.postgresql.jdbc3.Jdbc3ResultSet rs) {
        Field physicalRsField = DfReflectionUtil.getWholeField(org.postgresql.jdbc3.Jdbc3ResultSet.class, "rows");
        return (Vector<?>) DfReflectionUtil.getValueForcedly(physicalRsField, rs);
    }

    // ===================================================================================
    //                                                             Sensitive-or-not Cursor
    //                                                             =======================
    public void test_ResultSet_sensitiveOrNot_typeForwardOnly() {
        doTest_ResultSet_sensitiveOrNot(TestingResultSetType.FORWARD_ONLY);
    }

    public void test_ResultSet_sensitiveOrNot_typeScrollInsensitive() {
        doTest_ResultSet_sensitiveOrNot(TestingResultSetType.SCROLL_INSENSITIVE);
    }

    public void test_ResultSet_sensitiveOrNot_typeScrollSensitive() {
        doTest_ResultSet_sensitiveOrNot(TestingResultSetType.SCROLL_SENSITIVE);
    }

    public void doTest_ResultSet_sensitiveOrNot(final TestingResultSetType resultSetType) {
        // ## Arrange ##
        final ListResultBean<Member> beforeList = memberBhv.selectList(new MemberCB());
        final LocalDate updateDate = currentLocalDate();
        final boolean sensitive = TestingResultSetType.SCROLL_SENSITIVE.equals(resultSetType);

        // ## Act ##
        cannonball(new CannonballRun() {
            public void drive(CannonballCar car) {
                long threadId = car.getThreadId();
                log("threadId: " + threadId);
                if (threadId % 2 == 0) {
                    PurchaseSummaryMemberPmb pmb = new PurchaseSummaryMemberPmb();
                    PurchaseSummaryMemberCursorHandler handler = new PurchaseSummaryMemberCursorHandler() {
                        @Override
                        protected Object fetchCursor(PurchaseSummaryMemberCursor cursor) throws SQLException {
                            // ## Assert ##
                            assertEquals(resultSetType.type(), cursor.cursor().getType());
                            cursor.next();
                            log(cursor.getMemberName(), cursor.getBirthdate());
                            sleep(2000);
                            while (cursor.next()) {
                                LocalDate birthdate = cursor.getBirthdate();
                                log(cursor.getMemberName(), birthdate);
                                if (birthdate != null) {
                                    assertNotSame(updateDate, birthdate); // always insensitive on PostgreSQL
                                }
                            }
                            return null;
                        }
                    };
                    memberBhv.outsideSql().configure(conf -> {
                        conf.fetchSize(4);
                        if (TestingResultSetType.FORWARD_ONLY.equals(resultSetType)) {
                            conf.typeForwardOnly();
                        } else if (TestingResultSetType.SCROLL_INSENSITIVE.equals(resultSetType)) {
                            conf.typeScrollInsensitive();
                        } else if (sensitive) {
                            conf.typeScrollSensitive();
                        } else {
                            fail();
                        }
                    }).selectCursor(pmb, handler);
                } else {
                    sleep(500);
                    MemberCB cb = new MemberCB();
                    Member member = new Member();
                    member.setBirthdate(updateDate);
                    memberBhv.varyingQueryUpdate(member, cb, op -> op.allowNonQueryUpdate());
                }
            }
        }, new CannonballOption().commitTx().threadCount(2).repeatCount(1));
        performNewTransaction(new TransactionPerformer() {
            public boolean perform() {
                memberBhv.varyingBatchUpdateNonstrict(beforeList, op -> op.specify(colCB -> {
                    colCB.specify().columnBirthdate();
                    colCB.specify().columnUpdateUser();
                    colCB.specify().columnUpdateDatetime();
                    colCB.specify().columnUpdateProcess();
                }));
                return true;
            }
        });
    }

    private enum TestingResultSetType {
        FORWARD_ONLY(ResultSet.TYPE_FORWARD_ONLY), SCROLL_INSENSITIVE(ResultSet.TYPE_SCROLL_INSENSITIVE), SCROLL_SENSITIVE(
                ResultSet.TYPE_SCROLL_SENSITIVE);
        private int type;

        private TestingResultSetType(int type) {
            this.type = type;
        }

        public int type() {
            return type;
        }
    }

    // ===================================================================================
    //                                                                       Query Timeout
    //                                                                       =============
    public void test_QueryTimeout_insert() throws Exception {
        cannonball(new CannonballRun() {
            public void drive(CannonballCar car) {
                final long threadId = Thread.currentThread().getId();
                if (threadId % 2 == 0) {
                    Member member = new Member();
                    member.setMemberName("lock");
                    member.setMemberAccount("same");
                    member.setMemberStatusCode_Formalized();
                    memberBhv.insert(member);
                    sleep(3000);
                } else {
                    Member member = new Member();
                    member.setMemberName("wait");
                    member.setMemberAccount("same"); // same value to wait for lock
                    member.setMemberStatusCode_Formalized();
                    sleep(1000);
                    memberBhv.varyingInsert(member, op -> op.configure(conf -> conf.queryTimeout(1)));
                }
            }
        }, new CannonballOption().threadCount(2).repeatCount(1).expectExceptionAny("Jdbc3PreparedStatement.setQueryTimeout(int)"));
        // org.postgresql.jdbc3.Jdbc3PreparedStatement.setQueryTimeout(int) unsupported
    }

    // ===================================================================================
    //                                                                  First Line Comment 
    //                                                                  ==================
    public void test_FirstLineComment_all_front() throws Exception {
        doTest_FirstLineComment_all(true);
    }

    public void test_FirstLineComment_all_rear() throws Exception {
        doTest_FirstLineComment_all(false);
    }

    protected void doTest_FirstLineComment_all(boolean front) throws Exception {
        // ## Arrange ##
        final List<SqlLogInfo> infoList = new ArrayList<SqlLogInfo>();
        CallbackContext.setSqlLogHandlerOnThread(new SqlLogHandler() {
            public void handle(SqlLogInfo info) {
                infoList.add(info);
            }
        });
        Method actionMethod = MemberDbm.getInstance().columnBirthdate().getWriteMethod();
        SimpleTraceableSqlStringFilter filter = new SimpleTraceableSqlStringFilter(actionMethod, new TraceableSqlAdditionalInfoProvider() {
            public String provide() {
                return "marks:{?*@;+()[]'&%$#\"!\\>=<_^~-|.,}";
            }
        }) {

            public String filterOutsideSql(BehaviorCommandMeta meta, String executedSql) {
                return markingSql(executedSql);
            }

            public String filterProcedure(BehaviorCommandMeta meta, String executedSql) {
                return markingSql(executedSql);
            }
        };
        if (front) {
            filter.markingAtFront();
        }
        CallbackContext.setSqlStringFilterOnThread(filter);

        try {
            // ## Act ##
            {
                MemberCB cb = new MemberCB();
                memberBhv.selectList(cb);
            }
            {
                Member member = new Member();
                member.setMemberId(3);
                member.setBirthdate(currentLocalDate());
                memberBhv.updateNonstrict(member);
            }
            {
                MemberCB cb = new MemberCB();
                cb.query().setMemberStatusCode_Equal_Provisional();
                Member member = new Member();
                memberBhv.queryUpdate(member, cb);
            }
            {
                PurchaseMaxPriceMemberPmb pmb = new PurchaseMaxPriceMemberPmb();
                pmb.paging(3, 2);
                memberBhv.outsideSql().selectPage(pmb);
            }
            {
                SpInOutParameterPmb spPmb = new SpInOutParameterPmb();
                spPmb.setVInVarchar("foo");
                spPmb.setVInoutVarchar("bar");
                try {
                    memberBhv.outsideSql().call(spPmb);
                    fail();
                } catch (SQLFailureException e) { // no comment when procedure on PostgreSQL
                    log(e.getMessage());
                }
            }
            // ## Assert ##
        } finally {
            CallbackContext.clearSqlStringFilterOnThread();
        }
    }

    // ===================================================================================
    //                                                                  Plain ENUM Binding
    //                                                                  ==================
    public void test_plain_enum_binding() throws SQLException {
        // ## Arrange ##
        List<Integer> prepared = executeEnumBindSql(CDef.MemberStatus.Formalized.code());
        assertFalse(prepared.isEmpty());
        log(prepared);

        // ## Act ##
        try {
            executeEnumBindSql(TestPlainStatus.FML);

            // ## Assert ##
            fail();
        } catch (SQLException e) {
            // OK
            log(e.getMessage());
        }
    }

    private List<Integer> executeEnumBindSql(Object value) throws SQLException {
        DataSource ds = getDataSource();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = ds.getConnection();
            String sql = "select * from MEMBER where MEMBER_STATUS_CODE = ?";
            log(sql);
            ps = conn.prepareStatement(sql);
            ps.setObject(1, value);
            rs = ps.executeQuery();
            List<Integer> idList = new ArrayList<Integer>();
            while (rs.next()) {
                idList.add(rs.getInt("MEMBER_ID"));
            }
            return idList;
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }

    private static enum TestPlainStatus {
        FML, PRV, WDL
    }

    // ===================================================================================
    //                                                                     Cursor Handling
    //                                                                     ===============
    public void test_insert_in_plainCursor() throws Exception {
        // ## Arrange ##
        Connection conn = null;
        PreparedStatement ps = null;
        PreparedStatement ps4insert = null;
        ResultSet rs = null;
        try {
            // ## Act ##
            conn = getDataSource().getConnection();
            String selectSql = "select * from MEMBER_STATUS";
            log(selectSql);
            ps = conn.prepareStatement(selectSql);
            rs = ps.executeQuery();
            assertTrue(rs.next());
            assertNotNull(rs.getString("MEMBER_STATUS_NAME"));
            String insertSql = "insert into MEMBER_STATUS values('FOO', 'BAR', 'DES', 999)";
            log(insertSql);
            ps4insert = conn.prepareStatement(insertSql);
            ps4insert.executeUpdate();

            // ## Assert ##
            assertTrue(rs.next());
            assertNotNull(rs.getString("MEMBER_STATUS_NAME"));
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (ps4insert != null) {
                ps4insert.close();
            }
            if (conn != null) {
                conn.rollback();
                conn.close();
            }
        }
    }

    // ===================================================================================
    //                                                                   PreparedStatement
    //                                                                   =================
    public void test_PreparedStatement_with_DifferenceType() throws Exception {
        // ## Arrange ##
        registerTestData_for_TypeOfInt();

        final String sql = "select * from VENDOR_CHECK where TYPE_OF_INT4 > ?";
        final Connection conn = getDataSource().getConnection();
        final PreparedStatement ps = conn.prepareStatement(sql);

        // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        // TYPE_OF_INT4 is Integer but it uses setString() of PreparedStatement!
        // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        // ## Act ##
        ps.setString(1, "2");

        // ## Assert ##
        try {
            log(sql);
            ps.executeQuery();

            fail("PostgreSQL must throw the SQLException!");
        } catch (SQLException e) {
            // OK
            log("/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
            log(e.getMessage());
            if (e.getCause() != null) {
                log(e.getCause().getMessage());
            }
            log("* * * * * * * * * */");
        }
    }

    public void test_PreparedStatement_with_SameType() throws Exception {
        // ## Arrange ##
        registerTestData_for_TypeOfInt();

        final String sql = "select * from VENDOR_CHECK where TYPE_OF_INT4 = ?";
        final Connection conn = getDataSource().getConnection();
        final PreparedStatement ps = conn.prepareStatement(sql);

        // ## Act ##
        ps.setInt(1, 2);

        // ## Assert ##
        log(sql);
        ps.executeQuery();// Expect no exception!
    }

    protected void registerTestData_for_TypeOfInt() {
        {
            VendorCheck vendorCheck = new VendorCheck();
            vendorCheck.setVendorCheckId(88881L);
            vendorCheck.setTypeOfDate(currentLocalDate());
            vendorCheck.setTypeOfInt4(1);
            vendorCheckBhv.insert(vendorCheck);
        }
        {
            VendorCheck vendorCheck = new VendorCheck();
            vendorCheck.setVendorCheckId(88882L);
            vendorCheck.setTypeOfDate(currentLocalDate());
            vendorCheck.setTypeOfInt4(3);
            vendorCheckBhv.insert(vendorCheck);
        }
    }

    // ===================================================================================
    //                                                                   CallableStatement
    //                                                                   =================
    public void test_CallableStatement_ResultSet_returnValue() throws SQLException {
        doTest_CallableResultSet("{? = call SP_RETURN_RESULT_SET()}", new CallableResultSetCallback() {
            public ResultSet call(CallableStatement cs) throws SQLException {
                cs.registerOutParameter(1, Types.OTHER);
                boolean executed = cs.execute();
                log("executed = " + executed);
                assertFalse(executed);
                assertNull(cs.getResultSet());
                assertFalse(cs.getMoreResults());
                assertNull(cs.getResultSet());
                return (ResultSet) cs.getObject(1);
            }

            public void post(CallableStatement cs, ResultSet rs) throws SQLException {
            }
        });
    }

    private void doTest_CallableResultSet(String sql, CallableResultSetCallback callback) throws SQLException {
        Connection conn = null;
        CallableStatement cs = null;
        ResultSet rs = null;
        try {
            conn = getDataSource().getConnection();
            cs = conn.prepareCall(sql);
            rs = callback.call(cs);
            assertNotNull(rs);
            boolean exists = false;
            StringBuilder sb = new StringBuilder();
            while (rs.next()) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(rs.getString(1));
                exists = true;
            }
            log("first columns = " + sb);
            assertTrue(exists);
            callback.post(cs, rs);
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (cs != null) {
                cs.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }

    private static interface CallableResultSetCallback {
        ResultSet call(CallableStatement cs) throws SQLException;

        void post(CallableStatement cs, ResultSet rs) throws SQLException;
    }

    // ===================================================================================
    //                                                                           ResultSet
    //                                                                           =========
    public void test_ResultSet_sameColumn_twiceGetting() throws SQLException {
        String sql = "select MEMBER_ID, MEMBER_NAME from MEMBER";
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            conn = getDataSource().getConnection();
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            boolean exists = false;
            while (rs.next()) {
                exists = true;
                String first = rs.getString("MEMBER_NAME");
                String second = rs.getString("MEMBER_NAME");
                assertEquals(first, second);
            }
            assertTrue(exists);
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (st != null) {
                st.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }

    public void test_ResultSet_defaultResultSetType() throws SQLException {
        String sql = "select * from VENDOR_CHECK";
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            conn = getDataSource().getConnection();
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            int resultSetType = rs.getType();
            log("/* * * * * * * * * * * * * * * * * *");
            if (resultSetType == ResultSet.TYPE_FORWARD_ONLY) {
                log("resultSetType=TYPE_FORWARD_ONLY");
            } else if (resultSetType == ResultSet.TYPE_SCROLL_INSENSITIVE) {
                log("resultSetType=TYPE_SCROLL_INSENSITIVE");
            } else if (resultSetType == ResultSet.TYPE_SCROLL_SENSITIVE) {
                log("resultSetType=TYPE_SCROLL_SENSITIVE");
            } else {
                log("resultSetType=UNKNOWN:" + resultSetType);
            }
            log("* * * * * * * * * */");
            assertEquals(ResultSet.TYPE_FORWARD_ONLY, resultSetType);
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (st != null) {
                st.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }
}
