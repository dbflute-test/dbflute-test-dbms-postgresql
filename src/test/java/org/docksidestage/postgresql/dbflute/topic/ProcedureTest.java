package org.docksidestage.postgresql.dbflute.topic;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import org.dbflute.exception.SQLFailureException;
import org.docksidestage.postgresql.dbflute.exbhv.VendorCheckBhv;
import org.docksidestage.postgresql.dbflute.exbhv.pmbean.SpInOutParameterPmb;
import org.docksidestage.postgresql.dbflute.exbhv.pmbean.SpNoParameterPmb;
import org.docksidestage.postgresql.dbflute.exbhv.pmbean.SpResultSetParameterMorePmb;
import org.docksidestage.postgresql.dbflute.exbhv.pmbean.SpResultSetParameterPmb;
import org.docksidestage.postgresql.dbflute.exbhv.pmbean.SpVariousTypeParameterPmb;
import org.docksidestage.postgresql.dbflute.exbhv.pmbean.SpcamelcaseprocedurePmb;
import org.docksidestage.postgresql.dbflute.exentity.customize.SpResultSetParameterCurMember;
import org.docksidestage.postgresql.dbflute.exentity.customize.SpResultSetParameterMoreCurMember;
import org.docksidestage.postgresql.dbflute.exentity.customize.SpResultSetParameterMoreCurMemberStatus;
import org.docksidestage.postgresql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.6.1 (2008/01/23 Wednesday)
 */
public class ProcedureTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private VendorCheckBhv vendorCheckBhv;

    // ===================================================================================
    //                                                                               Basic
    //                                                                               =====
    public void test_call_Procedure_NoParameter() {
        // ## Arrange ##
        SpNoParameterPmb pmb = new SpNoParameterPmb() {
            @Override
            public boolean isEscapeStatement() {
                return determineEscape();
            }
        };

        // ## Act & Assert ##
        // done jflute why return value exists? (2022/04/10)
        //  -> remove void return by DBFlute Engine (2022/04/10)
        vendorCheckBhv.outsideSql().call(pmb); // expect no exception
    }

    public void test_call_Procedure_InOutParameter() {
        // ## Arrange ##
        SpInOutParameterPmb pmb = new SpInOutParameterPmb() {
            @Override
            public boolean isEscapeStatement() {
                return determineEscape();
            }
        };
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

    public void test_call_Procedure_VariousTypeParameter() throws Exception {
        // ## Arrange ##
        SpVariousTypeParameterPmb pmb = new SpVariousTypeParameterPmb() {
            @Override
            public boolean isEscapeStatement() {
                return determineEscape();
            }
        };
        pmb.setVInVarchar("foo");
        pmb.setVOutVarchar("bar");
        pmb.setVOutChar("baz");
        pmb.setVInText("abcdefghij");
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
        // done jflute why this error? (2022/04/10)
        // org.postgresql.util.PSQLException
        // ERROR: invalid input syntax for type numeric: "null"
        //   場所: unnamed portal parameter $9 = '...'
        //  -> it works well on JDBC 42.3.3 so runtime JDBC version should be latest
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
    public void test_call_Procedure_ResultSetParameter() {
        // ## Arrange ##
        SpResultSetParameterPmb pmb = new SpResultSetParameterPmb() {
            @Override
            public boolean isEscapeStatement() {
                return determineEscape();
            }
        };

        // ## Act ##
        vendorCheckBhv.outsideSql().call(pmb);

        // ## Assert ##
        List<SpResultSetParameterCurMember> memberList = pmb.getCurMember();
        assertTrue(memberList.size() > 0);
        boolean existsBirthdate = false;
        boolean existsFormalizedDatetime = false;
        for (SpResultSetParameterCurMember member : memberList) {
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

    public void test_call_Procedure_ResultSetParameter_more() {
        // ## Arrange ##
        SpResultSetParameterMorePmb pmb = new SpResultSetParameterMorePmb() {
            @Override
            public boolean isEscapeStatement() {
                return determineEscape();
            }
        };

        // ## Act ##
        vendorCheckBhv.outsideSql().call(pmb);

        // ## Assert ##
        List<SpResultSetParameterMoreCurMember> memberList = pmb.getCurMember();
        assertTrue(memberList.size() > 0);
        for (SpResultSetParameterMoreCurMember member : memberList) {
            log(member);
            assertNotNull(member.getMemberId());
            assertNotNull(member.getMemberName());
        }
        List<SpResultSetParameterMoreCurMemberStatus> statusList = pmb.getCurMemberStatus();
        assertTrue(statusList.size() > 0);
        for (SpResultSetParameterMoreCurMemberStatus status : statusList) {
            log(status);
            assertNotNull(status.getMemberStatusCode());
            assertNotNull(status.getMemberStatusName());
        }
    }

    // ===================================================================================
    //                                                                         Transaction
    //                                                                         ===========
    // #thinking jflute same as NoParameter (2022/04/10)
    //public void test_call_Procedure_Transaction_inherit() {
    //    // ## Arrange ##
    //    int before = memberLoginBhv.selectCount(memberLoginBhv.newConditionBean());
    //    assertNotSame(0, before);
    //    SpTransactionInheritPmb pmb = new SpTransactionInheritPmb() {
    //        @Override
    //        public boolean isEscapeStatement() {
    //            return determineEscape();
    //        }
    //    };
    //
    //    // ## Act ##
    //    vendorCheckBhv.outsideSql().call(pmb);
    //
    //    // ## Assert ##
    //    int after = memberLoginBhv.selectCount(memberLoginBhv.newConditionBean());
    //    log("before = " + before);
    //    log("after  = " + after);
    //    assertEquals(0, after);
    //}
    //
    //public void test_call_Procedure_Transaction_Inherit_thenAfter() {
    //    int thenAfter = memberLoginBhv.selectCount(memberLoginBhv.newConditionBean());
    //    assertNotSame(0, thenAfter);
    //    log("thenAfter = " + thenAfter);
    //}

    // ===================================================================================
    //                                                                              Naming
    //                                                                              ======
    public void test_call_Procedure_CamelCaseProcedure() {
        // ## Arrange ##
        SpcamelcaseprocedurePmb pmb = new SpcamelcaseprocedurePmb() {
            @Override
            public boolean isEscapeStatement() {
                return determineEscape();
            }
        };
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
    //                                                                         JDBC Escape
    //                                                                         ===========
    public void test_call_Procedure_jdbcEscape() {
        // ## Arrange ##
        SpNoParameterPmb pmb = new SpNoParameterPmb() {
            @Override
            public boolean isEscapeStatement() {
                return true;
            }
        };

        // ## Act & Assert ##
        // #for_now jflute real procedure cannot use JDBC escape on (at least) 42.3.3 (2022/04/10)
        assertException(SQLFailureException.class, () -> {
            vendorCheckBhv.outsideSql().call(pmb);
        }).handle(cause -> {
            assertContains(cause.getMessage(), "To call a procedure, use CALL.");
        });
    }

    // ===================================================================================
    //                                                                        Assist Logic
    //                                                                        ============
    private boolean determineEscape() {
        // #for_now jflute PostgreSQL JDBC 42.2.10 cannot execute {call procedures} that has escape braces (2022/04/10)
        return false;
    }
}
