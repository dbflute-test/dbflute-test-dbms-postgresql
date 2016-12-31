package org.docksidestage.postgresql.dbflute.vendor;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Types;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;

import javax.sql.DataSource;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.cbean.scoping.UnionQuery;
import org.dbflute.exception.SQLFailureException;
import org.dbflute.util.DfTypeUtil;
import org.docksidestage.postgresql.dbflute.bsentity.dbmeta.VendorUuidFooDbm;
import org.docksidestage.postgresql.dbflute.cbean.MemberCB;
import org.docksidestage.postgresql.dbflute.cbean.MemberWithdrawalCB;
import org.docksidestage.postgresql.dbflute.cbean.VendorCheckCB;
import org.docksidestage.postgresql.dbflute.cbean.VendorUuidBarCB;
import org.docksidestage.postgresql.dbflute.cbean.VendorUuidFooCB;
import org.docksidestage.postgresql.dbflute.exbhv.MemberBhv;
import org.docksidestage.postgresql.dbflute.exbhv.MemberWithdrawalBhv;
import org.docksidestage.postgresql.dbflute.exbhv.VendorCheckBhv;
import org.docksidestage.postgresql.dbflute.exbhv.VendorUuidBarBhv;
import org.docksidestage.postgresql.dbflute.exbhv.VendorUuidFooBhv;
import org.docksidestage.postgresql.dbflute.exbhv.cursor.VendorCheckCursorCursor;
import org.docksidestage.postgresql.dbflute.exbhv.cursor.VendorCheckCursorCursorHandler;
import org.docksidestage.postgresql.dbflute.exbhv.pmbean.CompareDatePmb;
import org.docksidestage.postgresql.dbflute.exentity.Member;
import org.docksidestage.postgresql.dbflute.exentity.MemberWithdrawal;
import org.docksidestage.postgresql.dbflute.exentity.VendorCheck;
import org.docksidestage.postgresql.dbflute.exentity.VendorUuidBar;
import org.docksidestage.postgresql.dbflute.exentity.VendorUuidFoo;
import org.docksidestage.postgresql.dbflute.exentity.customize.SimpleVendorCheck;
import org.docksidestage.postgresql.dbflute.exentity.customize.VendorNumericDecimalSum;
import org.docksidestage.postgresql.dbflute.exentity.customize.VendorNumericIntegerSum;
import org.docksidestage.postgresql.mytype.MyArray;
import org.docksidestage.postgresql.mytype.MyJSON;
import org.docksidestage.postgresql.mytype.MyXML;
import org.docksidestage.postgresql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.6.1 (2008/01/23 Wednesday)
 */
public class VendorDataTypeTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private VendorCheckBhv vendorCheckBhv;
    private MemberBhv memberBhv;
    private MemberWithdrawalBhv memberWithdrawalBhv;
    private VendorUuidFooBhv vendorUuidFooBhv;
    private VendorUuidBarBhv vendorUuidBarBhv;

    // ===================================================================================
    //                                                                         String Type
    //                                                                         ===========
    // -----------------------------------------------------
    //                                                  CHAR
    //                                                  ----
    public void test_CHAR() throws Exception {
        // ## Arrange ##
        VendorCheck vendorCheck = createVendorCheck();
        vendorCheck.setTypeOfChar("foo");

        // ## Act ##
        vendorCheckBhv.insert(vendorCheck);

        // ## Assert ##
        VendorCheck actual = vendorCheckBhv.selectByPK(vendorCheck.getVendorCheckId()).get();
        assertEquals(vendorCheck.getTypeOfChar(), actual.getTypeOfChar());

        // no needs fixed length string handling at entity
        // (PostgreSQL's procedure needs it)
    }

    public void test_TEXT_union() {
        // ## Arrange ##
        MemberWithdrawalCB cb = new MemberWithdrawalCB();
        cb.specify().columnWithdrawalReasonInputText();
        cb.union(new UnionQuery<MemberWithdrawalCB>() {
            public void query(MemberWithdrawalCB unionCB) {
            }
        });

        // ## Act ##
        ListResultBean<MemberWithdrawal> withdrawalList = memberWithdrawalBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, withdrawalList.size());
    }

    // ===================================================================================
    //                                                                         Number Type
    //                                                                         ===========
    // -----------------------------------------------------
    //                                               NUMERIC
    //                                               -------
    public void test_NUMERIC_autoMapping_tx() throws Exception {
        // ## Arrange ##
        VendorCheck vendorCheck = createVendorCheck();
        vendorCheck.setTypeOfNumericInteger(123);
        vendorCheck.setTypeOfNumericBigint(2345L);
        vendorCheck.setTypeOfNumericDecimal(new BigDecimal("12.345"));

        // ## Act ##
        vendorCheckBhv.insert(vendorCheck);

        // ## Assert ##
        VendorCheck actual = vendorCheckBhv.selectByPK(vendorCheck.getVendorCheckId()).get();
        assertEquals(vendorCheck.getTypeOfNumericInteger(), actual.getTypeOfNumericInteger());
        assertEquals(vendorCheck.getTypeOfNumericBigint(), actual.getTypeOfNumericBigint());
        assertEquals(vendorCheck.getTypeOfNumericDecimal(), actual.getTypeOfNumericDecimal());

        // no needs object binding big-decimal handling at entity
        // (PostgreSQL's procedure needs it)
    }

    // -----------------------------------------------------
    //                                               DECIMAL
    //                                               -------
    public void test_DECIMAL_no_size() throws Exception {
        // ## Arrange ##
        VendorCheck vendorCheck = createVendorCheck();
        vendorCheck.setTypeOfDecimal(new BigDecimal("123.456"));

        // ## Act ##
        vendorCheckBhv.insert(vendorCheck);

        // ## Assert ##
        VendorCheck actual = vendorCheckBhv.selectByPK(vendorCheck.getVendorCheckId()).get();
        assertEquals(vendorCheck.getTypeOfDecimal(), actual.getTypeOfDecimal());
    }

    // -----------------------------------------------------
    //                                                 MONEY
    //                                                 -----
    public void test_MONEY_insert_select() {
        // ## Arrange ##
        BigDecimal expected = new BigDecimal(3);
        VendorCheck vendorCheck = createVendorCheck();
        vendorCheck.setTypeOfMoney(expected);

        // ## Act ##
        vendorCheckBhv.insert(vendorCheck);

        // ## Assert ##
        VendorCheck actual = vendorCheckBhv.selectByPK(vendorCheck.getVendorCheckId()).get();
        BigDecimal actualMoney = actual.getTypeOfMoney();
        assertNotNull(actualMoney);
        assertEquals(expected.intValue(), actualMoney.intValue());
    }

    public void test_MONEY_update_select_null() {
        // ## Arrange ##
        VendorCheck vendorCheck = createVendorCheck();
        vendorCheck.setTypeOfMoney(null);
        vendorCheckBhv.insert(vendorCheck);
        BigDecimal expected = new BigDecimal(3);

        // ## Act ##
        vendorCheck.setTypeOfMoney(expected);
        vendorCheckBhv.update(vendorCheck);

        // ## Assert ##
        VendorCheck actual = vendorCheckBhv.selectByPK(vendorCheck.getVendorCheckId()).get();
        BigDecimal actualMoney = actual.getTypeOfMoney();
        assertNotNull(actualMoney);
        assertEquals(expected.intValue(), actualMoney.intValue());
    }

    // ===================================================================================
    //                                                                           Date Type
    //                                                                           =========
    // -----------------------------------------------------
    //                                                  DATE
    //                                                  ----
    public void test_DATE_HHmmss_conditionBean() { // *Important!
        // ## Arrange ##
        Calendar cal = Calendar.getInstance();
        cal.set(2008, 5, 15, 12, 34, 56);
        cal.set(Calendar.MILLISECOND, 123);
        Member member = new Member();
        member.setMemberId(3);
        member.setBirthdate(toLocalDate(cal));
        memberBhv.updateNonstrict(member);

        // ## Act ##
        cal.set(2008, 5, 15, 12, 34, 57);
        {
            MemberCB cb = new MemberCB();
            cb.query().setMemberId_Equal(3);
            cb.query().setBirthdate_GreaterEqual(toLocalDate(cal));
            Member actual = memberBhv.selectEntityWithDeletedCheck(cb);

            // ## Assert ##
            LocalDate actualValue = actual.getBirthdate();
            String formatted = toString(actualValue, "yyyy/MM/dd");
            log("actualValue = " + formatted);
            assertEquals("2008/06/15", formatted);
        }
        {
            MemberCB cb = new MemberCB();
            cb.query().setMemberId_Equal(3);
            cb.query().setBirthdate_GreaterEqual(toLocalDate(cal));
            Member actual = memberBhv.selectEntityWithDeletedCheck(cb);

            // ## Assert ##
            LocalDate actualValue = actual.getBirthdate();
            String formatted = toString(actualValue, "yyyy/MM/dd");
            log("actualValue = " + formatted);
            assertEquals("2008/06/15", formatted);
        }
        {
            MemberCB cb = new MemberCB();
            cb.query().setMemberId_Equal(3);
            cb.query().setBirthdate_GreaterEqual(toLocalDate(cal.getTimeInMillis()));
            Member actual = memberBhv.selectEntityWithDeletedCheck(cb);

            // ## Assert ##
            LocalDate actualValue = actual.getBirthdate();
            String formatted = toString(actualValue, "yyyy/MM/dd");
            log("actualValue = " + formatted);
            assertEquals("2008/06/15", formatted);
        }
    }

    public void test_DATE_HHmmss_outsideSql() throws Exception {
        // ## Arrange ##
        Calendar cal = Calendar.getInstance();
        cal.set(9001, 5, 15, 12, 34, 56);
        cal.set(Calendar.MILLISECOND, 0);
        Member member = new Member();
        member.setMemberId(3);
        member.setBirthdate(toLocalDate(cal.getTimeInMillis()));
        memberBhv.updateNonstrict(member);

        String path = MemberBhv.PATH_whitebox_pmbean_selectCompareDate;

        CompareDatePmb pmb = new CompareDatePmb();
        pmb.setMemberId(3);
        cal.set(9001, 5, 15, 23, 45, 57);
        pmb.setBirthdateFrom(toLocalDate(cal.getTimeInMillis()));

        Class<Member> entityType = Member.class;

        // ## Act ##
        List<Member> memberList = memberBhv.outsideSql().traditionalStyle().selectList(path, pmb, entityType);

        // ## Assert ##
        assertNotSame(0, memberList.size());
        for (Member actual : memberList) {
            log(actual.getMemberName() + " : " + actual.getBirthdate());
        }
    }

    public void test_DATE_selectPureDate() { // *Important!
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.query().setBirthdate_IsNotNull();

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, memberList.size());
        for (Member member : memberList) {
            LocalDate birthdate = member.getBirthdate();
            assertTrue(LocalDate.class.equals(birthdate.getClass()));
            assertTrue(birthdate instanceof LocalDate);
        }
    }

    public void test_DATE_SqlDate_HHmmss_outsideSql() throws Exception {
        // ## Arrange ##
        Calendar cal = Calendar.getInstance();
        cal.set(9001, 5, 15, 12, 34, 56);
        cal.set(Calendar.MILLISECOND, 0);
        Member member = new Member();
        member.setMemberId(3);
        member.setBirthdate(toLocalDate(cal.getTimeInMillis()));
        memberBhv.updateNonstrict(member);

        String path = MemberBhv.PATH_whitebox_pmbean_selectCompareDate;

        CompareDatePmb pmb = new CompareDatePmb();
        pmb.setMemberId(3);
        cal.set(9001, 5, 15, 23, 45, 57);
        pmb.setBirthdateFrom(toLocalDate(cal.getTimeInMillis()));

        Class<Member> entityType = Member.class;

        // ## Act ##
        Member actual = memberBhv.outsideSql().traditionalStyle().selectEntity(path, pmb, entityType).get();

        // ## Assert ##
        LocalDate actualValue = actual.getBirthdate();
        String formatted = toString(actualValue, "yyyy/MM/dd");
        log("actualValue = " + formatted);
        assertEquals("9001/06/15", formatted);
    }

    // -----------------------------------------------------
    //                                               DATE BC
    //                                               -------
    public void test_DATE_BC_date() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.query().setBirthdate_IsNotNull();
        cb.fetchFirst(1);
        cb.addOrderBy_PK_Asc();
        Member member = memberBhv.selectEntity(cb).get();
        member.setBirthdate(toLocalDate("BC1234/12/25"));

        // ## Act ##
        memberBhv.update(member);

        // ## Assert ##
        Member actual = memberBhv.selectByPK(member.getMemberId()).get();
        log(actual.getBirthdate());
        assertTrue(DfTypeUtil.isDateBC(toUtilDate(actual.getBirthdate())));
        String formatted = toString(actual.getBirthdate(), "Gyyyy/MM/dd");
        assertTrue("formatted=" + formatted, formatted.contains("1234/12/24")); // 12/24???
    }

    public void test_DATE_BC_datetime() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.query().setFormalizedDatetime_IsNotNull();
        cb.fetchFirst(1);
        cb.addOrderBy_PK_Asc();
        Member member = memberBhv.selectEntity(cb).get();
        member.setFormalizedDatetime(toLocalDateTime("BC1234/12/25 12:34:56.147"));

        // ## Act ##
        memberBhv.update(member);

        // ## Assert ##
        Member actual = memberBhv.selectByPK(member.getMemberId()).get();
        log(actual.getFormalizedDatetime());
        assertTrue(DfTypeUtil.isDateBC(toUtilDate(actual.getFormalizedDatetime())));
        assertTrue(toString(actual.getFormalizedDatetime(), "Gyyyy/MM/dd").contains("1234/12/25"));
    }

    // -----------------------------------------------------
    //                                                  TIME
    //                                                  ----
    public void test_TIME_insert_select() {
        // ## Arrange ##
        Calendar cal = Calendar.getInstance();
        cal.set(2002, 5, 15, 12, 34, 56);
        Time specifiedTime = new Time(cal.getTimeInMillis());
        cal.set(2002, 5, 15, 12, 34, 55);
        Time oneSecondBeforeTime = new Time(cal.getTimeInMillis());
        cal.set(2002, 5, 15, 12, 34, 57);
        Time oneSecondAfterTime = new Time(cal.getTimeInMillis());

        VendorCheck vendorCheck = createVendorCheck();
        vendorCheck.setTypeOfTime(toLocalTime(specifiedTime));
        vendorCheckBhv.insert(vendorCheck);

        VendorCheckCB cb = new VendorCheckCB();
        cb.query().setVendorCheckId_Equal(vendorCheck.getVendorCheckId());
        cb.query().setTypeOfTime_GreaterThan(toLocalTime(oneSecondBeforeTime));
        cb.query().setTypeOfTime_LessThan(toLocalTime(oneSecondAfterTime));

        // ## Act ##
        VendorCheck actual = vendorCheckBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        LocalTime actualTime = actual.getTypeOfTime();
        log("actualTime=" + actualTime);
        assertNotNull(actualTime);
        assertEquals(specifiedTime.toString(), actualTime.toString());
    }

    public void test_TIME_replaceSchema() {
        // ## Arrange ##
        VendorCheckCB cb = new VendorCheckCB();

        // ## Act ##
        List<VendorCheck> vendorCheckList = vendorCheckBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, vendorCheckList.size());
        for (VendorCheck vendorCheck : vendorCheckList) {
            LocalTime typeOfTime = vendorCheck.getTypeOfTime();
            log("typeOfTime=" + toString(typeOfTime, "HH:mm:ss.SSS"));
        }
    }

    // -----------------------------------------------------
    //                                                TIMETZ
    //                                                ------
    public void test_TIMETZ_insert_select() {
        // ## Arrange ##
        Calendar cal = Calendar.getInstance();
        cal.set(2002, 5, 15, 12, 34, 56);
        Time specifiedTime = new Time(cal.getTimeInMillis());
        cal.set(2002, 5, 15, 12, 34, 55);
        Time oneSecondBeforeTime = new Time(cal.getTimeInMillis());
        cal.set(2002, 5, 15, 12, 34, 57);
        Time oneSecondAfterTime = new Time(cal.getTimeInMillis());

        VendorCheck vendorCheck = new VendorCheck();
        vendorCheck.setVendorCheckId(new Long(99999));
        vendorCheck.setTypeOfBool_True();
        vendorCheck.setTypeOfTimetz(toLocalTime(specifiedTime));
        vendorCheckBhv.insert(vendorCheck);

        VendorCheckCB cb = new VendorCheckCB();
        cb.query().setVendorCheckId_Equal(new Long(99999));
        cb.query().setTypeOfTimetz_GreaterThan(toLocalTime(oneSecondBeforeTime));
        cb.query().setTypeOfTimetz_LessThan(toLocalTime(oneSecondAfterTime));

        // ## Act ##
        VendorCheck actual = vendorCheckBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        LocalTime actualTime = actual.getTypeOfTimetz();
        log("actualTime=" + actualTime);
        assertNotNull(actualTime);
        assertEquals(specifiedTime.toString(), actualTime.toString());
    }

    // -----------------------------------------------------
    //                                              INTERVAL
    //                                              --------
    public void test_INTERVAL_insert_select() {
        // ## Arrange ##
        String expected = "12:34:56";

        VendorCheck vendorCheck = createVendorCheck();
        vendorCheck.setTypeOfInterval(expected);

        // ## Act ##
        try {
            vendorCheckBhv.insert(vendorCheck);
            VendorCheckCB cb = new VendorCheckCB();
            cb.query().setVendorCheckId_Equal(vendorCheck.getVendorCheckId());
            cb.query().setTypeOfInterval_Equal(expected);
            VendorCheck selected = vendorCheckBhv.selectEntityWithDeletedCheck(cb);

            // ## Assert ##
            String actual = selected.getTypeOfInterval();
            log("actual=" + actual);
            assertNotNull(actual);
            String pattern = "HH:mm:ss";
            assertEquals(DfTypeUtil.toString(expected, pattern), DfTypeUtil.toString(actual, pattern));
        } catch (SQLFailureException e) {
            log(e.getMessage()); // unsupported now
        }
    }

    // ===================================================================================
    //                                                                        Boolean Type
    //                                                                        ============
    public void test_BOOLEAN_insert_select() {
        // ## Arrange ##
        VendorCheckCB deleteCB = new VendorCheckCB();
        deleteCB.query().setTypeOfBool_Equal_True();
        log("deleted(true)=" + vendorCheckBhv.queryDelete(deleteCB));
        deleteCB.enableOverridingQuery(() -> {
            deleteCB.query().setTypeOfBool_Equal_False();
        });
        log("deleted(false)=" + vendorCheckBhv.queryDelete(deleteCB));

        VendorCheck vendorCheck = new VendorCheck();
        vendorCheck.setVendorCheckId(new Long(8881));
        vendorCheck.setTypeOfText("abc");
        vendorCheck.setTypeOfBool_True();

        // ## Act ##
        vendorCheckBhv.insert(vendorCheck);
        {
            VendorCheck twice = new VendorCheck();
            twice.setVendorCheckId(new Long(8882));
            twice.setTypeOfText("abc");
            twice.setTypeOfBool_False();
            vendorCheckBhv.insert(twice);
        }
        VendorCheckCB cb = new VendorCheckCB();
        cb.query().setTypeOfBool_Equal_True();
        VendorCheck selected = vendorCheckBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        log(selected);
        assertEquals(vendorCheck.getVendorCheckId(), selected.getVendorCheckId());
        assertEquals(vendorCheck.getTypeOfBool(), selected.getTypeOfBool());
    }

    public void test_BIT_insert_select() {
        // ## Arrange ##
        VendorCheck vendorCheck = new VendorCheck();
        vendorCheck.setVendorCheckId(new Long(8881));
        vendorCheck.setTypeOfText("abc");
        vendorCheck.setTypeOfBit(true);

        // ## Act ##
        try {
            vendorCheckBhv.insert(vendorCheck);

            // ## Assert ##
            fail();
        } catch (SQLFailureException e) {
            // OK
            log(e.getMessage());
        }
    }

    // ===================================================================================
    //                                                                         Binary Type
    //                                                                         ===========
    // -----------------------------------------------------
    //                                                 BYTEA
    //                                                 -----
    public void test_BYTEA_insert_select() {
        // ## Arrange ##
        String expected = "foo";
        Member member = memberBhv.selectByPK(3).get();
        member.setMemberName(expected);
        VendorCheck vendorCheck = createVendorCheck();
        vendorCheck.setTypeOfBytea(serialize(member));

        // ## Act ##
        vendorCheckBhv.insert(vendorCheck);
        VendorCheckCB cb = new VendorCheckCB();
        cb.query().setVendorCheckId_Equal(vendorCheck.getVendorCheckId());
        VendorCheck selected = vendorCheckBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        byte[] bytes = selected.getTypeOfBytea();
        assertNotNull(bytes);
        Member deserialized = (Member) deserialize(bytes);
        log("deserialized=" + deserialized);
        assertEquals(expected, deserialized.getMemberName());
    }

    public void test_BYTEA_update_and_select() throws UnsupportedEncodingException {
        // ## Arrange ##
        String expected = "foo";
        byte[] insertedBytea = "bar".getBytes("UTF-8");
        byte[] expectedBytea = expected.getBytes("UTF-8");
        VendorCheck vendorCheck = createVendorCheck();
        vendorCheck.setTypeOfBytea(insertedBytea);

        // ## Act ##
        vendorCheckBhv.insert(vendorCheck);
        vendorCheck.setTypeOfBytea(expectedBytea);
        vendorCheckBhv.update(vendorCheck);
        VendorCheckCB cb = new VendorCheckCB();
        cb.query().setVendorCheckId_Equal(vendorCheck.getVendorCheckId());
        VendorCheck selected = vendorCheckBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        byte[] actual = selected.getTypeOfBytea();
        log("actual=" + actual);
        assertNotNull(actual);
        String actualByteaString = new String(actual, "UTF-8");
        log("actualByteaString=" + actualByteaString);
        assertEquals(expected, actualByteaString);
    }

    // -----------------------------------------------------
    //                                                   OID
    //                                                   ---
    /**
     * Previous version files of OID is not deleted so you should delete yourself.
     */
    public void test_OID_insert_select() {
        // ## Arrange ##
        Member expectedMember = new Member();
        expectedMember.setMemberId(3);
        expectedMember.setMemberName("Test");
        byte[] specifiedOid = serialize(expectedMember);
        VendorCheck vendorCheck = createVendorCheck();
        vendorCheck.setTypeOfOid(specifiedOid);

        // ## Act ##
        vendorCheckBhv.insert(vendorCheck);
        VendorCheckCB cb = new VendorCheckCB();
        cb.query().setVendorCheckId_Equal(vendorCheck.getVendorCheckId());
        VendorCheck selected = vendorCheckBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        byte[] actual = selected.getTypeOfOid();
        log("actual=" + actual);
        assertNotNull(actual);
        Member actualMember = (Member) deserialize(actual);
        log("actualMember=" + actualMember);
        assertNotNull(actualMember);
        assertEquals(expectedMember, actualMember);
    }

    public void test_OID_update_and_select() {
        // ## Arrange ##
        Member expectedMember = new Member();
        expectedMember.setMemberId(3);
        expectedMember.setMemberName("Insert");
        byte[] specifiedOid = serialize(expectedMember);
        VendorCheck vendorCheck = createVendorCheck();
        vendorCheck.setTypeOfOid(specifiedOid);

        // ## Act ##
        vendorCheckBhv.insert(vendorCheck);
        expectedMember.setMemberName("Update");
        byte[] updatedOid = serialize(expectedMember);
        vendorCheck.setTypeOfOid(updatedOid);
        vendorCheckBhv.update(vendorCheck);
        VendorCheckCB cb = new VendorCheckCB();
        cb.query().setVendorCheckId_Equal(vendorCheck.getVendorCheckId());
        VendorCheck selected = vendorCheckBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        byte[] actual = selected.getTypeOfOid();
        log("actual=" + actual);
        assertNotNull(actual);
        Member actualMember = (Member) deserialize(actual);
        log("actualMember=" + actualMember);
        assertNotNull(actualMember);
        assertEquals(expectedMember, actualMember);
    }

    public void test_OID_queryUpdate() {
        // ## Arrange ##
        Member specifiedMember = new Member();
        specifiedMember.setMemberId(3);
        specifiedMember.setMemberName("Insert");
        byte[] specifiedOid = serialize(specifiedMember);
        VendorCheck vendorCheck = createVendorCheck();
        vendorCheck.setTypeOfOid(specifiedOid);

        // ## Act ##
        vendorCheckBhv.insert(vendorCheck);
        specifiedMember.setMemberName("QueryUpdate");
        byte[] updatedOid = serialize(specifiedMember);
        vendorCheck.setTypeOfOid(updatedOid);
        VendorCheckCB queryCB = new VendorCheckCB();
        queryCB.query().setVendorCheckId_Equal(vendorCheck.getVendorCheckId());
        vendorCheckBhv.queryUpdate(vendorCheck, queryCB);
        VendorCheckCB cb = new VendorCheckCB();
        cb.query().setVendorCheckId_Equal(vendorCheck.getVendorCheckId());
        VendorCheck actual = vendorCheckBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        byte[] actualOid = actual.getTypeOfOid();
        log("actualOid=" + actualOid);
        assertNotNull(actualOid);
        Member actualMember = (Member) deserialize(actualOid);
        log("actualMember=" + actualMember);
        assertNotNull(actualMember);
        assertEquals(specifiedMember, actualMember);
    }

    // ===================================================================================
    //                                                                        Various Type
    //                                                                        ============
    // -----------------------------------------------------
    //                                                  UUID
    //                                                  ----
    public void test_UUID_insert_select() {
        // ## Arrange ##
        UUID expected = UUID.fromString("A0EEBC99-9C0B-4EF8-BB6D-6BB9BD380A11");
        VendorCheck vendorCheck = createVendorCheck();
        vendorCheck.setTypeOfUuid(expected);

        // ## Act ##
        vendorCheckBhv.insert(vendorCheck);
        VendorCheckCB cb = new VendorCheckCB();
        cb.query().setTypeOfUuid_Equal(expected);
        VendorCheck selected = vendorCheckBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        assertEquals(expected, selected.getTypeOfUuid());
    }

    public void test_UUID_update_and_select() {
        // ## Arrange ##
        UUID expected = UUID.fromString("A0EEBC99-9C0B-4EF8-BB6D-6BB9BD380A11");
        VendorCheck vendorCheck = createVendorCheck();
        vendorCheck.setTypeOfUuid(expected);
        vendorCheckBhv.insert(vendorCheck);

        // ## Act ##
        expected = UUID.fromString("B0EEBC99-9C0B-4EF8-BB6D-6BB9BD380A11");
        vendorCheck.setTypeOfUuid(expected);
        vendorCheckBhv.update(vendorCheck);
        VendorCheckCB cb = new VendorCheckCB();
        cb.query().setTypeOfUuid_Equal(expected);
        VendorCheck actual = vendorCheckBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        assertEquals(expected, actual.getTypeOfUuid());
    }

    public void test_UUID_PK_acceptPrimaryKeyMapString() {
        // ## Arrange ##
        VendorUuidFooCB cb = new VendorUuidFooCB();
        String columnName = VendorUuidFooDbm.getInstance().columnFooId().getColumnDbName();
        String uuid = "A0EEBC99-9C0B-4EF8-BB6D-6BB9BD380A11";

        // ## Act ##
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put(columnName, uuid);
        cb.acceptPrimaryKeyMap(map);

        // ## Assert ##
        log(cb.toDisplaySql());
        assertTrue(cb.toDisplaySql().contains(columnName + " = '"));
    }

    public void test_UUID_PK_loadReferrer() {
        // ## Arrange ##
        UUID barId = UUID.fromString("A0EEBC99-9C0B-4EF8-BB6D-6BB9BD380A11");
        UUID fooId = UUID.fromString("B0EEBC99-9C0B-4EF8-BB6D-6BB9BD380A11");
        VendorUuidBar bar = new VendorUuidBar();
        bar.setBarId(barId);
        bar.setBarName("barName");
        vendorUuidBarBhv.insert(bar);
        VendorUuidFoo foo = new VendorUuidFoo();
        foo.setFooId(fooId);
        foo.setFooName("fooName");
        foo.setBarId(barId);
        vendorUuidFooBhv.insert(foo);
        VendorUuidBarCB cb = new VendorUuidBarCB();
        cb.query().setBarId_Equal(barId);

        // ## Act ##
        VendorUuidBar actual = vendorUuidBarBhv.selectEntityWithDeletedCheck(cb);
        vendorUuidBarBhv.loadVendorUuidFoo(actual, new ConditionBeanSetupper<VendorUuidFooCB>() {
            public void setup(VendorUuidFooCB fooCB) {
                fooCB.query().addOrderBy_FooId_Desc();
            }
        });

        // ## Assert ##
        List<VendorUuidFoo> fooList = actual.getVendorUuidFooList();
        assertEquals(1, fooList.size());
        assertEquals("fooName", fooList.get(0).getFooName());
    }

    public void test_UUID_insertByJDBC() throws Exception {
        // ## Arrange ##
        UUID uuid = UUID.randomUUID();
        final Connection conn = getDataSource().getConnection();
        try {
            PreparedStatement ps;
            {
                String sql = "insert into vendor_check";
                sql = sql + " (type_of_uuid, vendor_check_id)";
                sql = sql + " values (?, ?)";
                ps = conn.prepareStatement(sql);
                log(sql);
            }

            // ## Act ##
            ps.setObject(1, uuid, Types.OTHER);
            ps.setObject(2, 99991L);
            ps.executeUpdate(); // Expect no exception!

            ps.setNull(1, Types.OTHER);
            ps.setObject(2, 99992L);
            ps.executeUpdate(); // Expect no exception!

            // ## Assert ##
            {
                final String sql = "select TYPE_OF_UUID from VENDOR_CHECK where TYPE_OF_UUID = ?";
                ps = conn.prepareStatement(sql);
                ps.setObject(1, uuid, Types.OTHER);
                ResultSet rs = ps.executeQuery();
                rs.next();
                String actual = rs.getString(1);
                log("actual=" + actual);
                assertNotNull(actual);
                assertEquals(uuid, UUID.fromString(actual));
            }
            {
                final String sql = "select TYPE_OF_UUID from VENDOR_CHECK where VENDOR_CHECK_ID = ? and TYPE_OF_UUID is null";
                ps = conn.prepareStatement(sql);
                ps.setObject(1, 99992L);
                ResultSet rs = ps.executeQuery();
                rs.next();
                String actual = rs.getString(1);
                log("actual=" + actual);
                assertNull(actual);
            }
        } finally {
            conn.rollback();
        }
    }

    // -----------------------------------------------------
    //                                                 ARRAY
    //                                                 -----
    public void test_ARRAY_of_varchar_type_select() throws Exception {
        // ## Arrange ##
        VendorCheckCB cb = new VendorCheckCB();
        cb.query().setVendorCheckId_Equal(34567L);

        // ## Act ##
        VendorCheck actual = vendorCheckBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        // Basically unsupported type on DBFlute
        assertEquals("{aaa,bbb,ccc}", actual.getTypeOfVcArray().toString());
    }

    public void test_ARRAY_of_int_type_select() throws Exception {
        // ## Arrange ##
        VendorCheckCB cb = new VendorCheckCB();
        cb.query().setVendorCheckId_Equal(34568L);

        // ## Act ##
        VendorCheck actual = vendorCheckBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        // Basically unsupported type on DBFlute
        assertEquals("{1,2,3}", actual.getTypeOfIntArray().toString());
    }

    public void test_ARRAY_type_insert() throws Exception {
        // ## Arrange ##
        VendorCheck vendorCheck = createVendorCheck(88881);
        vendorCheck.setTypeOfVcArray(new MyArray().setup("{aaa, bbb, ccc}"));

        // ## Act ##
        vendorCheckBhv.insert(vendorCheck);

        // ## Assert ##
        VendorCheckCB cb = new VendorCheckCB();
        cb.query().setVendorCheckId_Equal(88881L);
        VendorCheck actual = vendorCheckBhv.selectEntityWithDeletedCheck(cb);
        assertNotNull(actual.getTypeOfVcArray());
        assertEquals("{aaa,bbb,ccc}", actual.getTypeOfVcArray().toString());
    }

    public void test_ARRAY_type_JDBC_check() throws Exception {
        DataSource ds = getDataSource();
        Connection conn = ds.getConnection();
        Statement st = conn.createStatement();
        String sql = "select type_of_vc_array from vendor_check where vendor_check_id = 34567";
        Array array;
        {
            ResultSet rs = st.executeQuery(sql);
            rs.next();
            array = rs.getArray("type_of_vc_array");
        }
        ResultSet rs = array.getResultSet();
        ResultSetMetaData metaData = rs.getMetaData();
        List<String> columnList = new ArrayList<String>();
        for (int i = 1; i <= metaData.getColumnCount(); i++) {
            String columnLabel = metaData.getColumnLabel(i);
            columnList.add(columnLabel);
        }
        log("columnList: " + columnList);
        List<List<String>> valueList = new ArrayList<List<String>>();
        while (rs.next()) {
            List<String> elementList = new ArrayList<String>();
            for (String column : columnList) {
                elementList.add(rs.getString(column));
            }
            valueList.add(elementList);
        }
        log("valueList: " + valueList);
        assertNotSame(0, valueList.size());
    }

    public void test_ARRAY_type_JDBC_mapping_test() throws Exception {
        DataSource ds = getDataSource();
        Connection conn = ds.getConnection();
        Statement st = conn.createStatement();
        String sql = "select type_of_vc_array from vendor_check where vendor_check_id = 34567";
        Array array;
        {
            ResultSet rs = st.executeQuery(sql);
            rs.next();
            array = rs.getArray("type_of_vc_array");
        }
        ResultSet rs = array.getResultSet();
        SimpleArray simpleArray = new SimpleArray();
        while (rs.next()) {
            simpleArray.put(rs.getString("INDEX"), rs.getString("VALUE"));
        }
        log("simpleArray: " + simpleArray);
        assertNotSame(0, simpleArray.size());
    }

    // [in checking]: Should we select before update for getting the instance of array???
    //    public void test_array_type_JDBC_update_test() throws Exception {
    //        // ## Arrange ##
    //        DataSource ds = getDataSource();
    //        Connection conn = ds.getConnection();
    //        String sql = "update vendor_check set type_of_vc_array = ? where vendor_check_id = 34567";
    //        PreparedStatement ps = conn.prepareStatement(sql);
    //        Array array = new Array();
    //        ps.setArray(1, array);
    //        
    //        // ## Act ##
    //        ps.executeUpdate();
    //        
    //        // ## Assert ##
    //        VendorCheckCB cb = new VendorCheckCB();
    //        cb.query().setVendorCheckId_Equal(34567L);
    //        VendorCheck actual = vendorCheckBhv.selectEntityWithDeletedCheck(cb);
    //        assertEquals("{aaa,bbb,ccc}", actual.getTypeOfVcArray());
    //    }

    private static class SimpleArray extends LinkedHashMap<String, String> {
        private static final long serialVersionUID = 1L;
    }

    // -----------------------------------------------------
    //                                                   XML
    //                                                   ---
    public void test_XML_of_type_select() throws Exception {
        // ## Arrange ##
        VendorCheck vendorCheck = createVendorCheck(88881);
        vendorCheck.setTypeOfXml(new MyXML().setup("{aaa,bbb,ccc,xml}"));

        // ## Act ##
        vendorCheckBhv.insert(vendorCheck);

        // ## Assert ##
        // Basically unsupported type on DBFlute
        VendorCheckCB cb = new VendorCheckCB();
        cb.query().setVendorCheckId_Equal(88881L);
        VendorCheck actual = vendorCheckBhv.selectEntityWithDeletedCheck(cb);
        MyXML xml = actual.getTypeOfXml();
        assertEquals("{aaa,bbb,ccc,xml}", xml.toString());
    }

    // -----------------------------------------------------
    //                                                 JSON
    //                                                ------
    public void test_JSON_of_varchar_type_select() throws Exception {
        // ## Arrange ##
        VendorCheck vendorCheck = createVendorCheck(88881);
        vendorCheck.setTypeOfJson(new MyJSON().setup("{\"sea\": \"mystic\", \"land\": \"oneman\"}"));
        // Caused by: org.postgresql.util.PSQLException: ERROR: column
        // "type_of_json" is of type json but expression is of type character varying
        // hint: You will need to rewrite or cast the expression.
        //vendorCheck.setTypeOfJson("{\"sea\": \"mystic\", \"land\": \"oneman\"}");
        // ## Act ##
        vendorCheckBhv.insert(vendorCheck);

        // ## Assert ##
        // Basically unsupported type on DBFlute
        VendorCheckCB cb = new VendorCheckCB();
        cb.query().setVendorCheckId_Equal(88881L);
        VendorCheck actual = vendorCheckBhv.selectEntityWithDeletedCheck(cb);
        MyJSON json = actual.getTypeOfJson();
        assertEquals("{\"sea\": \"mystic\", \"land\": \"oneman\"}", json.toString());
    }

    // ===================================================================================
    //                                                                       Function Type
    //                                                                       =============
    // -----------------------------------------------------
    //                                         SUM(function)
    //                                         -------------
    @SuppressWarnings("unused")
    public void test_SUM_of_function() throws Exception {
        {
            VendorNumericDecimalSum vendorCheck = new VendorNumericDecimalSum();
            BigDecimal integerNonDigit = vendorCheck.getDecimalDigitSum();
        }
        {
            VendorNumericIntegerSum vendorCheck = new VendorNumericIntegerSum();
            BigDecimal integerNonDigit = vendorCheck.getIntegerNonDigitSum();
        }
    }

    // ===================================================================================
    //                                                                       Type Handling
    //                                                                       =============
    @SuppressWarnings("unused")
    public void test_various_types() throws Exception {
        {
            VendorCheck vendorCheck = new VendorCheck();
            String typeOfVarchar = vendorCheck.getTypeOfVarchar();
            MyArray typeOfVcArray = vendorCheck.getTypeOfVcArray();
            UUID typeOfUuid = vendorCheck.getTypeOfUuid();
            Long typeOfBigint = vendorCheck.getTypeOfBigint();
            Long typeOfInt8 = vendorCheck.getTypeOfInt8();
            Integer typeOfInt4 = vendorCheck.getTypeOfInt4();
            MyArray typeOfIntArray = vendorCheck.getTypeOfIntArray();
            BigDecimal typeOfDecimal = vendorCheck.getTypeOfDecimal();
            Integer typeOfNumericInteger = vendorCheck.getTypeOfNumericInteger();
            Long typeOfNumericBigint = vendorCheck.getTypeOfNumericBigint();
            BigDecimal typeOfNumericDecimal = vendorCheck.getTypeOfNumericDecimal();
            LocalDate typeOfDate = vendorCheck.getTypeOfDate();
            LocalTime typeOfTime = vendorCheck.getTypeOfTime();
            LocalDateTime typeOfTimestamp = vendorCheck.getTypeOfTimestamp();
            String typeOfInterval = vendorCheck.getTypeOfInterval();
            LocalTime typeOfTimetz = vendorCheck.getTypeOfTimetz();
            BigDecimal typeOfMoney = vendorCheck.getTypeOfMoney();
            Boolean typeOfBool = vendorCheck.getTypeOfBool();
            Boolean typeOfBit = vendorCheck.getTypeOfBit();
            byte[] typeOfBytea = vendorCheck.getTypeOfBytea();
            MyXML typeOfXml = vendorCheck.getTypeOfXml();
        }
        {
            SimpleVendorCheck vendorCheck = new SimpleVendorCheck();
            String typeOfVarchar = vendorCheck.getTypeOfVarchar();
            MyArray typeOfVcArray = vendorCheck.getTypeOfVcArray();
            UUID typeOfUuid = vendorCheck.getTypeOfUuid();
            Long typeOfBigint = vendorCheck.getTypeOfBigint();
            Long typeOfInt8 = vendorCheck.getTypeOfInt8();
            Integer typeOfInt4 = vendorCheck.getTypeOfInt4();
            MyArray typeOfIntArray = vendorCheck.getTypeOfIntArray();
            Integer typeOfNumericInteger = vendorCheck.getTypeOfNumericInteger();
            Long typeOfNumericBigint = vendorCheck.getTypeOfNumericBigint();
            BigDecimal typeOfNumericDecimal = vendorCheck.getTypeOfNumericDecimal();
            LocalDate typeOfDate = vendorCheck.getTypeOfDate();
            LocalTime typeOfTime = vendorCheck.getTypeOfTime();
            LocalDateTime typeOfTimestamp = vendorCheck.getTypeOfTimestamp();
            String typeOfInterval = vendorCheck.getTypeOfInterval();
            LocalTime typeOfTimetz = vendorCheck.getTypeOfTimetz();
            BigDecimal typeOfMoney = vendorCheck.getTypeOfMoney();
            Boolean typeOfBool = vendorCheck.getTypeOfBool();
            Boolean typeOfBit = vendorCheck.getTypeOfBit();
            byte[] typeOfBytea = vendorCheck.getTypeOfBytea();
            MyXML typeOfXml = vendorCheck.getTypeOfXml();
        }
    }

    public void test_various_types_in_cursor() throws Exception {
        // ## Arrange ##
        final UUID uuid = UUID.fromString("A0EEBC99-9C0B-4EF8-BB6D-6BB9BD380A11");
        final MyArray myArray = new MyArray().setup("{foo,bar}");
        vendorCheckBhv.varyingQueryDelete(new VendorCheckCB(), op -> op.allowNonQueryDelete());
        VendorCheck vendorCheck = createVendorCheck();
        Member specifiedMember = new Member();
        specifiedMember.setMemberId(3);
        specifiedMember.setMemberName("Test");
        final byte[] oid = serialize(specifiedMember);
        vendorCheck.setTypeOfOid(oid);
        vendorCheck.setTypeOfUuid(uuid);
        vendorCheck.setTypeOfVcArray(myArray);
        vendorCheckBhv.insert(vendorCheck);
        String path = VendorCheckBhv.PATH_whitebox_vendorcheck_selectVendorCheckCursor;

        // ## Act ##
        vendorCheckBhv.outsideSql().traditionalStyle().selectCursor(path, null, new VendorCheckCursorCursorHandler() {
            @Override
            protected Object fetchCursor(VendorCheckCursorCursor cursor) throws SQLException {
                while (cursor.next()) {
                    Long vendorCheckId = cursor.getVendorCheckId();
                    byte[] typeOfOid = cursor.getTypeOfOid();
                    Member actualOid = (Member) deserialize(typeOfOid);
                    UUID actualUuid = cursor.getTypeOfUuid();
                    MyArray actualVcArray = cursor.getTypeOfVcArray();

                    // ## Assert ##
                    log(vendorCheckId + ", " + actualOid.getMemberName() + ", " + actualUuid + ", " + actualVcArray);
                    assertEquals("Test", actualOid.getMemberName());
                    assertEquals(uuid, actualUuid);
                    assertEquals(myArray.toString(), actualVcArray.toString());
                }
                return null;
            }
        });
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected VendorCheck createVendorCheck() {
        VendorCheck vendorCheck = new VendorCheck();
        vendorCheck.setVendorCheckId(new Long(99999));
        return vendorCheck;
    }

    protected VendorCheck createVendorCheck(Integer id) {
        VendorCheck vendorCheck = new VendorCheck();
        vendorCheck.setVendorCheckId(new Long(id));
        return vendorCheck;
    }

    protected byte[] serialize(Serializable obj) {
        return DfTypeUtil.toBinary(obj);
    }

    protected Serializable deserialize(byte[] bytes) {
        return DfTypeUtil.toSerializable(bytes);
    }
}
