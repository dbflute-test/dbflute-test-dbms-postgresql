package org.docksidestage.postgresql.dbflute.whitebox;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.jdbc.StatementConfig;
import org.dbflute.util.DfReflectionUtil;
import org.docksidestage.postgresql.dbflute.allcommon.DBFluteConfig;
import org.docksidestage.postgresql.dbflute.cbean.MemberCB;
import org.docksidestage.postgresql.dbflute.exbhv.MemberBhv;
import org.docksidestage.postgresql.dbflute.exbhv.cursor.PurchaseSummaryMemberCursor;
import org.docksidestage.postgresql.dbflute.exbhv.cursor.PurchaseSummaryMemberCursorHandler;
import org.docksidestage.postgresql.dbflute.exbhv.pmbean.PurchaseSummaryMemberPmb;
import org.docksidestage.postgresql.dbflute.exentity.Member;
import org.docksidestage.postgresql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.9.3F (2012/04/05 Thursday)
 */
public class WxCursorSelectPostgreSQLTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;

    // ===================================================================================
    //                                                                            Settings
    //                                                                            ========
    @Override
    public void setUp() throws Exception {
        DBFluteConfig.getInstance().unlock();
        DBFluteConfig.getInstance().setCursorSelectFetchSize(4);
        super.setUp();
    }

    @Override
    public void tearDown() throws Exception {
        super.tearDown();
        DBFluteConfig.getInstance().unlock();
        DBFluteConfig.getInstance().setCursorSelectFetchSize(null);
        DBFluteConfig.getInstance().lock();
    }

    @Override
    protected boolean isUseOneTimeContainer() {
        return true;
    }

    // ===================================================================================
    //                                                                               Basic
    //                                                                               =====
    public void test_cursorSelectFetchSize_basic() {
        // ## Arrange ##
        PurchaseSummaryMemberPmb pmb = new PurchaseSummaryMemberPmb();
        assertEquals(4, DBFluteConfig.getInstance().getCursorSelectFetchSize());

        PurchaseSummaryMemberCursorHandler handler = new PurchaseSummaryMemberCursorHandler() {
            @Override
            protected Object fetchCursor(PurchaseSummaryMemberCursor cursor) throws SQLException {
                // ## Assert ##
                ResultSet rs = cursor.cursor();
                log("ResultSet   = " + rs.getClass());
                log(rs.getClass());

                Vector<Object> rows = extractRowDataOnResutSet(rs);
                assertEquals(4, rows.size());
                assertDbAccess();

                rs.next(); // select first row

                assertEquals(extractRowDataOnResutSet(rs), rows);
                assertEquals(4, rows.size());
                assertDbAccess();

                rs.next(); // select second row
                rs.next(); // select third row
                rs.next(); // select fourth row

                assertEquals(extractRowDataOnResutSet(rs), rows);
                assertEquals(4, rows.size());

                rs.next(); // select fifth row

                assertFalse(extractRowDataOnResutSet(rs).equals(rows));
                assertEquals(4, rows.size());
                return null;
            }
        };

        // ## Act ##
        memberBhv.outsideSql().selectCursor(pmb, handler);
    }

    protected void assertDbAccess() {
        memberBhv.selectCount(new MemberCB()); // can select in PostgreSQL
    }

    // ===================================================================================
    //                                                                             Default
    //                                                                             =======
    public void test_cursorSelectFetchSize_default() {
        // ## Arrange ##
        PurchaseSummaryMemberPmb pmb = new PurchaseSummaryMemberPmb();

        // ## Act ##
        StatementConfig config = new StatementConfig().suppressDefault();
        memberBhv.outsideSql().configure(config).selectCursor(pmb, new PurchaseSummaryMemberCursorHandler() {
            @Override
            protected Object fetchCursor(PurchaseSummaryMemberCursor cursor) throws SQLException {
                // ## Assert ##
                ResultSet rs = cursor.cursor();
                log("ResultSet   = " + rs.getClass());
                log(rs.getClass());

                Vector<Object> rows = extractRowDataOnResutSet(rs);
                assertEquals(20, rows.size());
                assertDbAccess();

                rs.next(); // select first row

                assertEquals(extractRowDataOnResutSet(rs), rows);
                assertEquals(20, rows.size());
                assertDbAccess();

                rs.next(); // select second row
                rs.next(); // select third row
                rs.next(); // select fourth row

                assertEquals(extractRowDataOnResutSet(rs), rows);
                assertEquals(20, rows.size());

                rs.next(); // select fifth row

                assertEquals(extractRowDataOnResutSet(rs), rows);
                assertEquals(20, rows.size());
                return null;
            }
        });
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    public void test_cursorSelectFetchSize_selectList_success() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        int countAll = memberBhv.selectCount(cb);

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(memberList);
        assertEquals(countAll, memberList.size());
    }

    // ===================================================================================
    //                                                                   Reflection Helper
    //                                                                   =================
    @SuppressWarnings("unchecked")
    protected Vector<Object> extractRowDataOnResutSet(ResultSet rs) {
        Class<? extends ResultSet> rsType = rs.getClass();
        ResultSet nativeRs = null;
        if (org.apache.commons.dbcp.DelegatingResultSet.class.isAssignableFrom(rsType)) {
            nativeRs = ((org.apache.commons.dbcp.DelegatingResultSet) rs).getDelegate();
            if (org.apache.commons.dbcp.DelegatingResultSet.class.isAssignableFrom(nativeRs.getClass())) {
                nativeRs = ((org.apache.commons.dbcp.DelegatingResultSet) nativeRs).getDelegate(); // nested
            }
        } else {
            nativeRs = rs;
        }
        Class<? extends ResultSet> nativeType = nativeRs.getClass();
        log(nativeType);
        Field rowDataField = DfReflectionUtil.getWholeField(nativeType, "rows");
        return (Vector<Object>) DfReflectionUtil.getValueForcedly(rowDataField, nativeRs);
    }
}
