package org.docksidestage.postgresql.dbflute.topic;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import org.docksidestage.postgresql.dbflute.allcommon.CDef;
import org.docksidestage.postgresql.dbflute.exbhv.MemberLoginBhv;
import org.docksidestage.postgresql.dbflute.exbhv.VendorCheckBhv;
import org.docksidestage.postgresql.dbflute.exbhv.pmbean.FnInOutParameterPmb;
import org.docksidestage.postgresql.dbflute.exbhv.pmbean.FnNextInOutParameterPmb;
import org.docksidestage.postgresql.dbflute.exbhv.pmbean.FnNextNoParameterPmb;
import org.docksidestage.postgresql.dbflute.exbhv.pmbean.FnResultSetParameterMorePmb;
import org.docksidestage.postgresql.dbflute.exbhv.pmbean.FnResultSetParameterPmb;
import org.docksidestage.postgresql.dbflute.exbhv.pmbean.FnReturnParameterPmb;
import org.docksidestage.postgresql.dbflute.exbhv.pmbean.FnReturnResultSetPmb;
import org.docksidestage.postgresql.dbflute.exbhv.pmbean.FnReturnResultSetWithPmb;
import org.docksidestage.postgresql.dbflute.exbhv.pmbean.FnTransactionInheritPmb;
import org.docksidestage.postgresql.dbflute.exbhv.pmbean.FnVariousTypeParameterPmb;
import org.docksidestage.postgresql.dbflute.exbhv.pmbean.FncamelcaseprocedurePmb;
import org.docksidestage.postgresql.dbflute.exentity.customize.FnResultSetParameterCurMember;
import org.docksidestage.postgresql.dbflute.exentity.customize.FnResultSetParameterMoreCurMember;
import org.docksidestage.postgresql.dbflute.exentity.customize.FnResultSetParameterMoreCurMemberStatus;
import org.docksidestage.postgresql.dbflute.exentity.customize.FnReturnResultSetReturnValue;
import org.docksidestage.postgresql.dbflute.exentity.customize.FnReturnResultSetWithReturnValue;
import org.docksidestage.postgresql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.6.1 (2008/01/23 Wednesday)
 */
public class FunctionTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private VendorCheckBhv vendorCheckBhv;
    private MemberLoginBhv memberLoginBhv;

    // ===================================================================================
    //                                                                               Basic
    //                                                                               =====
    // PostgreSQL's function needs a parameter or a return parameter
    // so SP_NO_PARAMETER does not exist

    public void test_call_Function_InOutParameter() {
        // ## Arrange ##
        FnInOutParameterPmb pmb = new FnInOutParameterPmb();
        pmb.setVInVarchar("foo");
        pmb.setVOutVarchar("bar"); // basically no point (for test, expects overridden later)
        pmb.setVInoutVarchar("baz"); // can set as IN and get as OUT

        // ## Act ##
        vendorCheckBhv.outsideSql().call(pmb);

        // ## Assert ##
        log("in=" + pmb.getVInVarchar() + ", out=" + pmb.getVOutVarchar() + ", inout=" + pmb.getVInoutVarchar());
        assertEquals("foo", pmb.getVInVarchar()); // remains
        assertEquals("baz", pmb.getVOutVarchar()); // overridden in procedure
        assertEquals("foo", pmb.getVInoutVarchar()); // overridden in procedure
    }

    public void test_call_Function_ReturnParameter() {
        // ## Arrange ##
        FnReturnParameterPmb pmb = new FnReturnParameterPmb();

        // ## Act ##
        vendorCheckBhv.outsideSql().call(pmb); // expect no exception

        // ## Assert ##
        assertEquals((Integer) 1, pmb.getReturnValue());
    }

    public void test_call_Function_VariousTypeParameter() throws Exception {
        // ## Arrange ##
        FnVariousTypeParameterPmb pmb = new FnVariousTypeParameterPmb();
        pmb.setVInVarchar("foo");
        pmb.setVOutVarchar("bar");
        pmb.setVOutChar("baz");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sb.append("abcdefghij");
        }
        pmb.setVInText(sb.toString());
        assertNull(pmb.getVOutText());
        pmb.setVvInNumericInteger(new BigDecimal(123));
        pmb.setVvInNumericBigint(new BigDecimal(234));
        pmb.setVvInNumericDecimal(new BigDecimal("34.567"));
        assertNull(pmb.getVvOutDecimal());
        pmb.setVvOutInteger(1234);
        pmb.setVvInoutInteger(2345);
        pmb.setVvOutBigint(3456L);
        pmb.setVvInoutBigint(4567L);
        pmb.setVvvInDate(currentLocalDate());
        assertNull(pmb.getVvvOutTimestamp());
        pmb.setVvvInTime(toLocalTime(currentLocalDate()));
        pmb.setVvvvInBool(true);
        pmb.setVvvvInBytea("corge".getBytes("UTF-8"));
        pmb.setVvvvInUuid(UUID.fromString("A0EEBC99-9C0B-4EF8-BB6D-6BB9BD380A11"));
        pmb.setVvvvInOid("grault".getBytes("UTF-8"));

        // ## Act ##
        vendorCheckBhv.outsideSql().call(pmb);

        // ## Assert ##
        log(pmb.toString());
        assertEquals("foo", pmb.getVOutVarchar());
        assertEquals("qux", pmb.getVOutChar().trim()); // needs to trim
        assertEquals(pmb.getVInText(), pmb.getVOutText());
        assertEquals(new BigDecimal("987.654"), pmb.getVvOutDecimal());
        assertEquals(Integer.valueOf(6789), pmb.getVvOutInteger());
        assertEquals(Integer.valueOf(4567), pmb.getVvInoutInteger());
        assertEquals(Long.valueOf(2345), pmb.getVvOutBigint());
        assertNull(pmb.getVvInoutBigint());
        // expect no changed
        assertEquals(pmb.getVvvvInBool(), pmb.getVvvvInBool());
        assertEquals(pmb.getVvvvInBytea(), pmb.getVvvvInBytea());
        assertEquals(pmb.getVvvvInUuid(), pmb.getVvvvInUuid());
        assertEquals(pmb.getVvvvInOid(), pmb.getVvvvInOid());
    }

    // ===================================================================================
    //                                                                 ResultSet Parameter
    //                                                                 ===================
    // /- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // if no transaction, PSQLException: ERROR: cursor "<unnamed portal 1>" does not exist
    // I don't know why
    // - - - - - - - - - -/
    public void test_call_Function_ResultSetParameter() {
        // ## Arrange ##
        FnResultSetParameterPmb pmb = new FnResultSetParameterPmb();

        // ## Act ##
        vendorCheckBhv.outsideSql().call(pmb);

        // ## Assert ##
        List<FnResultSetParameterCurMember> memberList = pmb.getCurMember();
        assertTrue(memberList.size() > 0);
        boolean existsBirthdate = false;
        boolean existsFormalizedDatetime = false;
        for (FnResultSetParameterCurMember member : memberList) {
            log(member);
            Integer memberId = member.getMemberId();
            String memberName = member.getMemberName();
            LocalDate birthdate = member.getBirthdate();
            if (birthdate != null) {
                existsBirthdate = true;
            }
            LocalDateTime formalizedDatetime = member.getFormalizedDatetime();
            if (formalizedDatetime != null) {
                existsFormalizedDatetime = true;
            }
            String memberStatusCode = member.getMemberStatusCode();
            assertNotNull(memberId);
            assertNotNull(memberName);
            assertNotNull(memberStatusCode);
        }
        assertTrue(existsBirthdate);
        assertTrue(existsFormalizedDatetime);
    }

    public void test_call_Function_ResultSetParameter_more() {
        // ## Arrange ##
        FnResultSetParameterMorePmb pmb = new FnResultSetParameterMorePmb();

        // ## Act ##
        vendorCheckBhv.outsideSql().call(pmb);

        // ## Assert ##
        List<FnResultSetParameterMoreCurMember> memberList = pmb.getCurMember();
        assertTrue(memberList.size() > 0);
        for (FnResultSetParameterMoreCurMember member : memberList) {
            log(member);
            assertNotNull(member.getMemberId());
            assertNotNull(member.getMemberName());
        }
        List<FnResultSetParameterMoreCurMemberStatus> statusList = pmb.getCurMemberStatus();
        assertTrue(statusList.size() > 0);
        for (FnResultSetParameterMoreCurMemberStatus status : statusList) {
            log(status);
            assertNotNull(status.getMemberStatusCode());
            assertNotNull(status.getMemberStatusName());
        }
    }

    // ===================================================================================
    //                                                                    Return ResultSet
    //                                                                    ================
    public void test_call_Function_ReturnResultSet() {
        // ## Arrange ##
        FnReturnResultSetPmb pmb = new FnReturnResultSetPmb();

        // ## Act ##
        vendorCheckBhv.outsideSql().call(pmb);

        // ## Assert ##
        List<FnReturnResultSetReturnValue> memberList = pmb.getReturnValue();
        assertTrue(memberList.size() > 0);
        for (FnReturnResultSetReturnValue member : memberList) {
            log(member);
            assertNotNull(member.getMemberId());
            assertNotNull(member.getMemberName());
        }
    }

    public void test_call_Function_ReturnResultSet_with() {
        // ## Arrange ##
        FnReturnResultSetWithPmb pmb = new FnReturnResultSetWithPmb();
        pmb.setVInChar(CDef.MemberStatus.Formalized.code());
        pmb.setVOutVarchar("bbb");
        pmb.setVInoutVarchar("ccc");

        // ## Act ##
        vendorCheckBhv.outsideSql().call(pmb);

        // ## Assert ##
        List<FnReturnResultSetWithReturnValue> memberList = pmb.getReturnValue();
        assertTrue(memberList.size() > 0);
        for (FnReturnResultSetWithReturnValue member : memberList) {
            log(member);
            assertNotNull(member.getMemberId());
            assertNotNull(member.getMemberName());
        }
        // It causes an error when creating the procedure
        // if it overrides out-parameter in the procedure. 
        //assertEquals("ddd", pmb.getVOutVarchar());
        //assertEquals("eee", pmb.getVInoutVarchar());
        assertEquals("bbb", pmb.getVOutVarchar()); // no handled out-parameter
        assertEquals("ccc", pmb.getVInoutVarchar());
    }

    // ===================================================================================
    //                                                                          NextSchema
    //                                                                          ==========
    public void test_call_Function_NextNoParameter() {
        // ## Arrange ##
        FnNextNoParameterPmb pmb = new FnNextNoParameterPmb();

        // ## Act ##
        vendorCheckBhv.outsideSql().call(pmb); // expect no exception

        // ## Assert ##
        assertEquals((Integer) 1, pmb.getReturnValue());
    }

    public void test_call_Function_NextInOutParameter() {
        // ## Arrange ##
        FnNextInOutParameterPmb pmb = new FnNextInOutParameterPmb();
        pmb.setVInVarchar("aaa");
        pmb.setVOutVarchar("bbb");
        pmb.setVInoutVarchar("ccc");

        // ## Act ##
        vendorCheckBhv.outsideSql().call(pmb);

        // ## Assert ##
        log("in=" + pmb.getVInVarchar() + ", out=" + pmb.getVOutVarchar() + ", inout=" + pmb.getVInoutVarchar());
        assertEquals("ddd", pmb.getVOutVarchar());
        assertEquals("eee", pmb.getVInoutVarchar());
    }

    // ===================================================================================
    //                                                                         Transaction
    //                                                                         ===========
    public void test_call_Function_Transaction_inherit() {
        // ## Arrange ##
        int before = memberLoginBhv.selectCount(memberLoginBhv.newConditionBean());
        assertNotSame(0, before);
        FnTransactionInheritPmb pmb = new FnTransactionInheritPmb();

        // ## Act ##
        vendorCheckBhv.outsideSql().call(pmb);

        // ## Assert ##
        int after = memberLoginBhv.selectCount(memberLoginBhv.newConditionBean());
        log("before = " + before);
        log("after  = " + after);
        assertEquals(0, after);
    }

    public void test_call_Function_Transaction_Inherit_thenAfter() {
        int thenAfter = memberLoginBhv.selectCount(memberLoginBhv.newConditionBean());
        assertNotSame(0, thenAfter);
        log("thenAfter = " + thenAfter);
    }

    // ===================================================================================
    //                                                                              Naming
    //                                                                              ======
    public void test_call_Function_CamelCaseProcedure() {
        // ## Arrange ##
        FncamelcaseprocedurePmb pmb = new FncamelcaseprocedurePmb();
        pmb.setFooparam("foo");
        pmb.setBarparam("bar");
        pmb.setVdonparam("don");
        pmb.setVheeparam("hee");
        pmb.setPooParamname("poo");

        // ## Act ##
        vendorCheckBhv.outsideSql().call(pmb);

        // ## Assert ##
        assertEquals("ddd", pmb.getVdonparam());
        assertEquals("eee", pmb.getPooParamname());
    }

    // ===================================================================================
    //                                                                             Trigger
    //                                                                             =======
    // #thinking jflute Sql2Entity warning, no problem but hope to resolve this (2022/04/10)
    /* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
    Failed to execute the procedure for getting meta data.
    
    [SQL]
    {? = call part_man_insert_trigger()}
    
    [Parameter]
    returnValue: trigger as Return
    
    [Test Value]
    {}
    
    [Exception Message]
    ERROR: function "part_man_insert_trigger" in FROM has unsupported return type trigger
      位置: 15
    
    [Retry Exception]
    Failed to register OUT parameter(1|1111): returnValue - trigger as Return :: org.dbflute.s2dao.valuetype.basic.ObjectType
    このステートメントは、OUTパラメータを宣言していません。{ ?= call ... } を使って宣言して下さい。
    * * * * * * * * * */
}
