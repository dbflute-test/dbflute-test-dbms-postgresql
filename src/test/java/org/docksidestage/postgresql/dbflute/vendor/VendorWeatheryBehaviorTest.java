package org.docksidestage.postgresql.dbflute.vendor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.dbflute.bhv.core.context.ConditionBeanContext;
import org.dbflute.bhv.core.context.ContextStack;
import org.dbflute.bhv.readable.EntityRowHandler;
import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.cbean.ConditionQuery;
import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.cbean.result.PagingResultBean;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.cbean.sqlclause.SqlClausePostgreSql;
import org.dbflute.dbmeta.info.ColumnInfo;
import org.dbflute.exception.BatchEntityAlreadyUpdatedException;
import org.dbflute.exception.EntityAlreadyDeletedException;
import org.dbflute.exception.EntityAlreadyUpdatedException;
import org.dbflute.outsidesql.OutsideSqlContext;
import org.dbflute.util.DfCollectionUtil;
import org.dbflute.util.DfReflectionUtil;
import org.docksidestage.postgresql.dbflute.bsentity.dbmeta.MemberStatusDbm;
import org.docksidestage.postgresql.dbflute.cbean.MemberCB;
import org.docksidestage.postgresql.dbflute.cbean.MemberStatusCB;
import org.docksidestage.postgresql.dbflute.cbean.VendorCheckCB;
import org.docksidestage.postgresql.dbflute.cbean.VendorDateFkCB;
import org.docksidestage.postgresql.dbflute.cbean.VendorDatePkCB;
import org.docksidestage.postgresql.dbflute.cbean.cq.VendorCheckCQ;
import org.docksidestage.postgresql.dbflute.exbhv.MemberBhv;
import org.docksidestage.postgresql.dbflute.exbhv.MemberStatusBhv;
import org.docksidestage.postgresql.dbflute.exbhv.VendorCheckBhv;
import org.docksidestage.postgresql.dbflute.exbhv.VendorDateFkBhv;
import org.docksidestage.postgresql.dbflute.exbhv.VendorDatePkBhv;
import org.docksidestage.postgresql.dbflute.exentity.Member;
import org.docksidestage.postgresql.dbflute.exentity.MemberStatus;
import org.docksidestage.postgresql.dbflute.exentity.VendorCheck;
import org.docksidestage.postgresql.dbflute.exentity.VendorDateFk;
import org.docksidestage.postgresql.dbflute.exentity.VendorDatePk;
import org.docksidestage.postgresql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.6.1 (2008/01/23 Wednesday)
 */
public class VendorWeatheryBehaviorTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;
    private MemberStatusBhv memberStatusBhv;
    private VendorCheckBhv vendorCheckBhv;
    private VendorDatePkBhv vendorDatePkBhv;
    private VendorDateFkBhv vendorDateFkBhv;

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    public void test_batchUpdate_and_batchDelete_AlreadyUpdated() {
        // ## Arrange ##
        List<Integer> memberIdList = new ArrayList<Integer>();
        memberIdList.add(1);
        memberIdList.add(3);
        memberIdList.add(7);
        MemberCB cb = new MemberCB();
        cb.query().setMemberId_InScope(memberIdList);
        ListResultBean<Member> memberList = memberBhv.selectList(cb);
        int count = 0;
        for (Member member : memberList) {
            member.setMemberName("testName" + count);
            member.setMemberAccount("testAccount" + count);
            member.setMemberStatusCode_Provisional();
            member.setFormalizedDatetime(currentLocalDateTime());
            member.setBirthdate(currentLocalDate());
            if (count == 1) {
                member.setVersionNo(999999999L);
            } else {
                member.setVersionNo(member.getVersionNo()); // to keep same-set columns
            }
            ++count;
        }

        // ## Act & Assert ##
        try {
            memberBhv.batchUpdate(memberList);
            fail();
        } catch (EntityAlreadyUpdatedException e) {
            // OK
            log(e.getMessage());
            assertTrue(e instanceof BatchEntityAlreadyUpdatedException);
            log("batchUpdateCount=" + ((BatchEntityAlreadyUpdatedException) e).getBatchUpdateCount());
        }
        deleteMemberReferrer();
        try {
            memberBhv.batchDelete(memberList);
            fail();
        } catch (EntityAlreadyUpdatedException e) {
            // OK
            log(e.getMessage());
            assertTrue(e instanceof BatchEntityAlreadyUpdatedException);
            log("batchUpdateCount=" + ((BatchEntityAlreadyUpdatedException) e).getBatchUpdateCount());
        }
    }

    public void test_batchUpdateNonstrict_and_batchDeleteNonstrict_AlreadyDeleted() {
        // ## Arrange ##
        List<Integer> memberIdList = new ArrayList<Integer>();
        memberIdList.add(1);
        memberIdList.add(3);
        memberIdList.add(7);
        MemberCB cb = new MemberCB();
        cb.query().setMemberId_InScope(memberIdList);
        ListResultBean<Member> memberList = memberBhv.selectList(cb);
        int count = 0;
        for (Member member : memberList) {
            member.setMemberName("testName" + count);
            member.setMemberAccount("testAccount" + count);
            member.setMemberStatusCode_Provisional();
            member.setFormalizedDatetime(currentLocalDateTime());
            member.setBirthdate(currentLocalDate());
            if (count == 1) {
                member.setMemberId(9999999);
            } else {
                member.setMemberId(member.getMemberId()); // to keep same-set
            }
            ++count;
        }

        // ## Act & Assert ##
        try {
            memberBhv.batchUpdateNonstrict(memberList);
            fail();
        } catch (EntityAlreadyDeletedException e) {
            // OK
            log(e.getMessage());
        }
        deleteMemberReferrer();
        try {
            memberBhv.batchDeleteNonstrict(memberList);
            fail();
        } catch (EntityAlreadyDeletedException e) {
            // OK
            log(e.getMessage());
        }
    }

    // ===================================================================================
    //                                                                    Insert in Cursor
    //                                                                    ================
    public void test_insert_in_selectCursor_of_conditionBean_sameTable() throws Exception {
        // ## Arrange ##
        final List<Integer> memberIdList = new ArrayList<Integer>();
        MemberCB cb = new MemberCB();

        // ## Act ##
        memberBhv.selectCursor(cb, new EntityRowHandler<Member>() {
            int count = 0;

            public void handle(Member entity) {
                if (count == 0) {
                    assertFalse(ContextStack.isExistContextStackOnThread());
                } else {
                    assertTrue(ContextStack.isExistContextStackOnThread());
                    assertTrue(ContextStack.getContextStackOnThread().isEmpty());
                }
                assertTrue(ConditionBeanContext.isExistConditionBeanOnThread());
                String memberName = entity.getMemberName();
                Member member = new Member();
                member.setMemberName(memberName + count);
                member.setMemberAccount(memberName + count);
                member.setMemberStatusCode_Formalized();
                memberBhv.insert(member);
                memberIdList.add(member.getMemberId());
                assertTrue(ConditionBeanContext.isExistConditionBeanOnThread());
                ++count;
            }
        });

        // ## Assert ##
        assertFalse(ContextStack.isExistContextStackOnThread());
        assertFalse(ConditionBeanContext.isExistConditionBeanOnThread());
        assertFalse(OutsideSqlContext.isExistOutsideSqlContextOnThread());
        cb.query().setMemberId_InScope(memberIdList);
        assertNotSame(0, memberBhv.selectCount(cb));
    }

    public void test_insert_in_selectCursor_of_conditionBean_diffTable() throws Exception {
        // ## Arrange ##
        final List<String> codeList = new ArrayList<String>();
        MemberCB cb = new MemberCB();

        // ## Act ##
        memberBhv.selectCursor(cb, new EntityRowHandler<Member>() {
            int count = 0;

            public void handle(Member entity) {
                if (count == 0) {
                    assertFalse(ContextStack.isExistContextStackOnThread());
                } else {
                    assertTrue(ContextStack.isExistContextStackOnThread());
                    assertTrue(ContextStack.getContextStackOnThread().isEmpty());
                }
                assertTrue(ConditionBeanContext.isExistConditionBeanOnThread());
                String memberName = entity.getMemberName();
                MemberStatus memberStatus = new MemberStatus();
                String memberStatusCode;
                if (count >= 100) {
                    memberStatusCode = String.valueOf(count);
                } else if (count >= 10) {
                    memberStatusCode = "0" + count;
                } else {
                    memberStatusCode = "00" + count;
                }

                // because it forces classification setting at this project
                //memberStatus.setMemberStatusCode(memberStatusCode);
                ColumnInfo columnMemberStatusCode = MemberStatusDbm.getInstance().columnMemberStatusCode();
                DfReflectionUtil.invokeForcedly(columnMemberStatusCode.getWriteMethod(), memberStatus, new Object[] { memberStatusCode });

                memberStatus.setMemberStatusName(memberName + count);
                memberStatus.setDescription("foo");
                memberStatus.setDisplayOrder(99999 + count);
                memberStatusBhv.insert(memberStatus);
                codeList.add(memberStatus.getMemberStatusCode());
                assertTrue(ConditionBeanContext.isExistConditionBeanOnThread());
                ++count;
            }
        });

        // ## Assert ##
        assertFalse(ContextStack.isExistContextStackOnThread());
        assertFalse(ConditionBeanContext.isExistConditionBeanOnThread());
        assertFalse(OutsideSqlContext.isExistOutsideSqlContextOnThread());
        MemberStatusCB statusCB = new MemberStatusCB();
        statusCB.query().invokeQuery("MemberStatusCode", "InScope", codeList);
        assertNotSame(0, memberStatusBhv.selectCount(statusCB));
    }

    // *Not Repro!
    //    // ===================================================================================
    //    //                                                                   Performance Check
    //    //                                                                   =================
    //    private VendorSimpleFooBhv vendorSimpleFooBhv;
    //    private VendorSimpleBarBhv vendorSimpleBarBhv;
    //    public void test_PerformanceCheck() {
    //        List<VendorSimpleBar> vendorSimpleBarList = new ArrayList<VendorSimpleBar>();
    //        for (int i = 0; i < 3000; i++) {
    //            VendorSimpleBar bar = new VendorSimpleBar();
    //            bar.setBarName("name");
    //            vendorSimpleBarList.add(bar);
    //        }
    //        vendorSimpleBarBhv.batchInsert(vendorSimpleBarList);
    //        VendorSimpleBarCB barCB = new VendorSimpleBarCB();
    //        barCB.fetchFirst(1);
    //        Integer barId = vendorSimpleBarBhv.selectEntityWithDeletedCheck(barCB).getBarId();
    //
    //        List<VendorSimpleFoo> vendorSimpleFooList = new ArrayList<VendorSimpleFoo>();
    //        for (int i = 0; i < 15000; i++) {
    //            VendorSimpleFoo foo = new VendorSimpleFoo();
    //            foo.setFooName("name");
    //            foo.setBarId(barId);
    //            vendorSimpleFooList.add(foo);
    //        }
    //        vendorSimpleFooBhv.batchInsert(vendorSimpleFooList);
    //
    //        VendorSimpleFooCB fooCB = new VendorSimpleFooCB();
    //        vendorSimpleFooBhv.selectList(fooCB);
    //        vendorSimpleFooBhv.selectList(fooCB);
    //
    //        fooCB.setupSelect_VendorSimpleBar();
    //        vendorSimpleFooBhv.selectList(fooCB);
    //
    //        fooCB.query().setFooName_NotEqual("AAA");
    //        fooCB.query().queryVendorSimpleBar().on().setBarName_Equal("name");
    //        fooCB.query().queryVendorSimpleBar().on().setBarId_LessEqual(99999999);
    //        vendorSimpleFooBhv.selectList(fooCB);
    //    }

    // ===================================================================================
    //                                                                        Date InScope
    //                                                                        ============
    public void test_dateInScope_query() {
        // ## Arrange ##
        LocalDate date = toLocalDate("1965-03-03");
        {
            VendorDatePk vendorDatePk = new VendorDatePk();
            vendorDatePk.setFooDate(date);
            vendorDatePk.setFooName("test data");
            vendorDatePkBhv.insert(vendorDatePk);
        }

        VendorDatePkCB cb = new VendorDatePkCB();
        cb.query().setFooDate_InScope(DfCollectionUtil.newArrayList(date));

        // ## Act ##
        VendorDatePk actual = vendorDatePkBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        assertEquals("1965/03/03", toString(actual.getFooDate(), "yyyy/MM/dd"));
    }

    public void test_dateInScope_LoadReferrer() {
        // ## Arrange ##
        LocalDate date = toLocalDate("1965-03-03");
        {
            VendorDatePk vendorDatePk = new VendorDatePk();
            vendorDatePk.setFooDate(date);
            vendorDatePk.setFooName("test data");
            vendorDatePkBhv.insert(vendorDatePk);
            VendorDateFk vendorDateFk = new VendorDateFk();
            vendorDateFk.setBarId(99991);
            vendorDateFk.setBarDate(date);
            vendorDateFkBhv.insert(vendorDateFk);
            vendorDateFk.setBarId(99992);
            vendorDateFk.setBarDate(date);
            vendorDateFkBhv.insert(vendorDateFk);
        }
        VendorDatePkCB cb = new VendorDatePkCB();
        cb.query().setFooDate_InScope(DfCollectionUtil.newArrayList(date));
        VendorDatePk pk = vendorDatePkBhv.selectEntityWithDeletedCheck(cb);

        // ## Act ##
        vendorDatePkBhv.loadVendorDateFk(pk, new ConditionBeanSetupper<VendorDateFkCB>() {
            public void setup(VendorDateFkCB cb) {
                cb.query().addOrderBy_BarId_Asc();
            }
        });

        // ## Assert ##
        List<VendorDateFk> vendorDateFkList = pk.getVendorDateFkList();
        assertEquals(Integer.valueOf(99991), vendorDateFkList.get(0).getBarId());
        assertEquals(Integer.valueOf(99992), vendorDateFkList.get(1).getBarId());
    }

    // ===================================================================================
    //                                                                      Paging Binding
    //                                                                      ==============
    public void test_paging_binding_basic() {
        doTest_paging_binding(false);
    }

    public void test_paging_binding_suppress() {
        doTest_paging_binding(true);
    }

    public void doTest_paging_binding(boolean suppress) {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        if (suppress) {
            ((SqlClausePostgreSql) cb.getSqlClause()).suppressPagingBinding();
        }
        cb.query().addOrderBy_MemberId_Asc();
        cb.paging(4, 3);
        assertEquals(3, cb.getFetchPageNumber());

        // ## Act ##
        PagingResultBean<Member> page = memberBhv.selectPage(cb); // re-select

        // ## Assert ##
        assertEquals(4, page.size());
        log("PagingResultBean.toString():" + ln() + " " + page);
        assertEquals(3, page.getCurrentPageNumber());
        assertEquals(20, page.getAllRecordCount());
        assertEquals(5, page.getAllPageCount());
        assertEquals(Integer.valueOf(9), page.get(0).getMemberId());

        String clause = cb.getSqlClause().getClause();
        log(ln() + clause);
        if (suppress) {
            assertTrue(clause.contains("limit 4 offset 8"));
        } else {
            assertTrue(clause.contains("limit /*pmb.sqlClause.pagingBindingLimit*/0 offset /*pmb.sqlClause.pagingBindingOffset*/0"));
        }
    }

    // ===================================================================================
    //                                                                          Short Char
    //                                                                          ==========
    public void test_shortChar_inout_trimmed_value() {
        // *This test does not depend on shortCharHandlingMode of DBFlute 
        // ## Arrange ##
        String code = "AB";

        VendorCheck vendorCheck = new VendorCheck();
        vendorCheck.setVendorCheckId(99999L);
        vendorCheck.setTypeOfChar(code);
        vendorCheckBhv.insert(vendorCheck);

        VendorCheckCB cb = new VendorCheckCB();
        cb.query().setVendorCheckId_Equal(99999L);
        cb.query().setTypeOfChar_Equal(code + " ");

        // ## Act ##
        VendorCheck actual = vendorCheckBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        assertEquals(code + " ", actual.getTypeOfChar()); // DB remains it
    }

    public void test_shortChar_inout_filled_value() {
        // *This test does not depend on shortCharHandlingMode of DBFlute 
        // ## Arrange ##
        String code = "AB ";

        VendorCheck vendorCheck = new VendorCheck();
        vendorCheck.setVendorCheckId(99999L);
        vendorCheck.setTypeOfChar(code);
        vendorCheckBhv.insert(vendorCheck);

        VendorCheckCB cb = new VendorCheckCB();
        cb.query().setVendorCheckId_Equal(99999L);
        cb.query().setTypeOfChar_Equal(code);

        // ## Act ##
        VendorCheck actual = vendorCheckBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        assertEquals(code, actual.getTypeOfChar()); // DB remains it
    }

    public void test_shortChar_condition() {
        // *This test does not depend on shortCharHandlingMode of DBFlute 
        // ## Arrange ##
        String code = "AB ";

        VendorCheck vendorCheck = new VendorCheck();
        vendorCheck.setVendorCheckId(99999L);
        vendorCheck.setTypeOfChar(code);
        vendorCheckBhv.insert(vendorCheck);

        VendorCheckCB cb = new VendorCheckCB() {
            // internal manipulation (Don't mimic it)
            @Override
            protected VendorCheckCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
                return new VendorCheckCQ(childQuery, sqlClause, aliasName, nestLevel) {
                    @Override
                    protected String hSC(String propertyName, String value, Integer size, String modeCode) {
                        return value; // do nothing for not depending on shortCharHandlingMode
                    }
                };
            }
        };
        cb.query().setVendorCheckId_Equal(99999L);
        cb.query().setTypeOfChar_Equal(code.trim());
        assertTrue(cb.toDisplaySql().contains("'AB'"));

        // ## Act ##
        VendorCheck actual = vendorCheckBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        assertEquals(code, actual.getTypeOfChar());
    }
}
