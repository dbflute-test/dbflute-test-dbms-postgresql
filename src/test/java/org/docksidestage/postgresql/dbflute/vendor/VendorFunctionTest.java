package org.docksidestage.postgresql.dbflute.vendor;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.cbean.scoping.SpecifyQuery;
import org.dbflute.cbean.scoping.SubQuery;
import org.dbflute.util.DfTypeUtil;
import org.dbflute.util.Srl;
import org.docksidestage.postgresql.dbflute.cbean.MemberCB;
import org.docksidestage.postgresql.dbflute.cbean.MemberLoginCB;
import org.docksidestage.postgresql.dbflute.cbean.PurchaseCB;
import org.docksidestage.postgresql.dbflute.exbhv.MemberBhv;
import org.docksidestage.postgresql.dbflute.exentity.Member;
import org.docksidestage.postgresql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.7.4 (2010/09/11 Saturday)
 */
public class VendorFunctionTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;

    // ===================================================================================
    //                                                                            Coalesce
    //                                                                            ========
    public void test_SepcifyDerivedReferrer_option_coalesce_basic() throws Exception {
        // ## Arrange ##
        int countAll;
        {
            MemberCB cb = new MemberCB();
            countAll = memberBhv.selectCount(cb);
        }
        {
            MemberCB cb = new MemberCB();
            cb.query().derivedMemberLogin().count(new SubQuery<MemberLoginCB>() {
                public void query(MemberLoginCB subCB) {
                    subCB.specify().columnMemberLoginId();
                }
            }).equal(0);
            assertNotSame(0, memberBhv.selectCount(cb));
        }
        MemberCB cb = new MemberCB();
        cb.specify().derivedMemberLogin().max(new SubQuery<MemberLoginCB>() {
            public void query(MemberLoginCB subCB) {
                subCB.specify().columnLoginDatetime();
            }
        }, Member.ALIAS_latestLoginDatetime, op -> op.coalesce("1970-01-01"));
        assertTrue(cb.toDisplaySql().contains("coalesce("));

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, memberList.size());
        assertEquals(countAll, memberList.size());
        boolean exists = false;
        for (Member member : memberList) {
            Date latestLoginDatetime = member.getLatestLoginDatetime();
            String loginDateView = DfTypeUtil.toString(latestLoginDatetime, "yyyy-MM-dd");
            log(member.getMemberName() + ": " + loginDateView);
            if ("1970-01-01".equals(loginDateView)) {
                exists = true;
            }
        }
        assertTrue(exists);
    }

    // ===================================================================================
    //                                                                               Round
    //                                                                               =====
    public void test_SepcifyDerivedReferrer_option_round_basic() throws Exception {
        // ## Arrange ##
        int countAll;
        {
            MemberCB cb = new MemberCB();
            countAll = memberBhv.selectCount(cb);
        }
        MemberCB cb = new MemberCB();
        cb.specify().derivedPurchase().avg(new SubQuery<PurchaseCB>() {
            public void query(PurchaseCB subCB) {
                subCB.specify().columnPurchaseCount();
            }
        }, Member.ALIAS_productKindCount, op -> op.round(0));
        assertTrue(cb.toDisplaySql().contains("round("));

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, memberList.size());
        assertEquals(countAll, memberList.size());
        boolean existsNotNull = true;
        boolean existsNull = true;
        for (Member member : memberList) {
            log(member.getMemberName() + ": " + member.getProductKindCount());
            if (member.getProductKindCount() != null) {
                existsNotNull = true;
            } else {
                existsNull = true;
            }
        }
        assertTrue(existsNotNull);
        assertTrue(existsNull);
    }

    // ===================================================================================
    //                                                                               Trunc
    //                                                                               =====
    public void test_SepcifyDerivedReferrer_option_trunc_basic() throws Exception {
        // ## Arrange ##
        int countAll;
        {
            MemberCB cb = new MemberCB();
            countAll = memberBhv.selectCount(cb);
        }
        MemberCB cb = new MemberCB();
        cb.specify().derivedPurchase().avg(new SubQuery<PurchaseCB>() {
            public void query(PurchaseCB subCB) {
                subCB.specify().columnPurchaseCount();
            }
        }, Member.ALIAS_productKindCount, op -> op.trunc(0));
        assertTrue(cb.toDisplaySql().contains("trunc("));

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, memberList.size());
        assertEquals(countAll, memberList.size());
        boolean existsNotNull = true;
        boolean existsNull = true;
        for (Member member : memberList) {
            log(member.getMemberName() + ": " + member.getProductKindCount());
            if (member.getProductKindCount() != null) {
                existsNotNull = true;
            } else {
                existsNull = true;
            }
        }
        assertTrue(existsNotNull);
        assertTrue(existsNull);
    }

    public void test_SepcifyDerivedReferrer_option_trunc_date() throws Exception {
        // ## Arrange ##
        int countAll;
        {
            MemberCB cb = new MemberCB();
            countAll = memberBhv.selectCount(cb);
        }
        String coalesce = "1985-09-11 12:34:56.789";
        MemberCB cb = new MemberCB();
        cb.specify().derivedPurchase().max(new SubQuery<PurchaseCB>() {
            public void query(PurchaseCB subCB) {
                subCB.specify().columnPurchaseDatetime();
            }
        }, Member.ALIAS_latestLoginDatetime, op -> op.coalesce(coalesce).trunc("hour"));

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, memberList.size());
        assertEquals(countAll, memberList.size());
        boolean exists = false;
        for (Member member : memberList) {
            Timestamp loginDatetime = member.getLatestLoginDatetime();
            String formatted = toString(loginDatetime, "yyyy-MM-dd HH:mm:ss.SSS");
            log(member.getMemberName() + ": " + formatted);
            assertTrue(formatted.endsWith(":00:00.000"));
            if (formatted.startsWith("1985-09-11")) {
                assertTrue("formatted=" + formatted, formatted.endsWith("12:00:00.000"));
                exists = true;
            }
        }
        assertTrue(cb.toDisplaySql().contains(", (select date_trunc('hour'"));
        assertTrue(cb.toDisplaySql().contains(", coalesce(max(sub1loc.purchase_datetime), '1985-09-11 12:34:56.789'))"));
        assertTrue(exists);
    }

    // -----------------------------------------------------
    //                                         Purpose Style
    //                                         -------------
    public void test_ColumnQuery_truncMonth_right() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.specify().derivedPurchase().max(new SubQuery<PurchaseCB>() {
            public void query(PurchaseCB subCB) {
                subCB.specify().columnPurchaseDatetime();
            }
        }, Member.ALIAS_latestLoginDatetime, op -> op.truncMonth());
        cb.columnQuery(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.specify().columnFormalizedDatetime();
            }
        }).notEqual(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.specify().columnFormalizedDatetime();
            }
        }).convert(op -> op.truncMonth());

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb); // expect no exception

        // ## Assert ##
        assertFalse(memberList.isEmpty());
        boolean exists = false;
        for (Member member : memberList) {
            Timestamp loginDatetime = member.getLatestLoginDatetime();
            log(member.getMemberName() + ", " + loginDatetime);
            if (loginDatetime != null) {
                assertEquals("0101 00:00:00", DfTypeUtil.toString(loginDatetime, "MMdd HH:mm:ss"));
                if (!DfTypeUtil.toString(loginDatetime, "yyyy").equals("0001")) { // means not truncated
                    exists = true;
                }
            }
        }
        assertTrue(exists);
        String sql = cb.toDisplaySql();
        assertTrue(Srl.contains(sql, " <> date_trunc('year', dfloc.formalized_datetime)"));
    }

    public void test_ColumnQuery_truncDay_right() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.specify().derivedPurchase().max(new SubQuery<PurchaseCB>() {
            public void query(PurchaseCB subCB) {
                subCB.specify().columnPurchaseDatetime();
            }
        }, Member.ALIAS_latestLoginDatetime, op -> op.truncDay());
        cb.columnQuery(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.specify().columnFormalizedDatetime();
            }
        }).notEqual(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.specify().columnFormalizedDatetime();
            }
        }).convert(op -> op.truncDay());

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb); // expect no exception

        // ## Assert ##
        assertFalse(memberList.isEmpty());
        boolean exists = false;
        for (Member member : memberList) {
            Timestamp loginDatetime = member.getLatestLoginDatetime();
            log(member.getMemberName() + ", " + loginDatetime);
            if (loginDatetime != null) {
                assertEquals("01 00:00:00", DfTypeUtil.toString(loginDatetime, "dd HH:mm:ss"));
                if (!DfTypeUtil.toString(loginDatetime, "MM").equals("01")) { // means not truncated
                    exists = true;
                }
            }
        }
        assertTrue(exists);
        String sql = cb.toDisplaySql();
        assertTrue(Srl.contains(sql, " <> date_trunc('month', dfloc.formalized_datetime)"));
    }

    public void test_ColumnQuery_truncDay_date() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.columnQuery(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.specify().columnBirthdate();
            }
        }).notEqual(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.specify().columnBirthdate();
            }
        }).convert(op -> op.truncDay());

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb); // expect no exception

        // ## Assert ##
        assertFalse(memberList.isEmpty());
    }

    public void test_ColumnQuery_truncTime_right() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.specify().derivedPurchase().max(new SubQuery<PurchaseCB>() {
            public void query(PurchaseCB subCB) {
                subCB.specify().columnPurchaseDatetime();
            }
        }, Member.ALIAS_latestLoginDatetime, op -> op.truncTime());
        cb.columnQuery(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.specify().columnFormalizedDatetime();
            }
        }).notEqual(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.specify().columnFormalizedDatetime();
            }
        }).convert(op -> op.truncTime());

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb); // expect no exception

        // ## Assert ##
        assertFalse(memberList.isEmpty());
        boolean exists = false;
        for (Member member : memberList) {
            Timestamp loginDatetime = member.getLatestLoginDatetime();
            if (loginDatetime != null) {
                assertEquals("00:00:00", DfTypeUtil.toString(loginDatetime, "HH:mm:ss"));
                if (!DfTypeUtil.toString(loginDatetime, "dd").equals("01")) { // means not truncated
                    exists = true;
                }
            }
        }
        assertTrue(exists);
        String sql = cb.toDisplaySql();
        assertTrue(Srl.contains(sql, " <> date_trunc('day', dfloc.formalized_datetime)"));
        assertTrue(Srl.contains(sql, "date_trunc('day', max(sub1loc.purchase_datetime))")); // check format
    }

    // ===================================================================================
    //                                                                             DateAdd
    //                                                                             =======
    // -----------------------------------------------------
    //                              (Specify)DerivedReferrer
    //                              ------------------------
    public void test_SepcifyDerivedReferrer_option_dateAdd() {
        // ## Arrange ##
        ListResultBean<Member> plainList;
        {
            MemberCB cb = new MemberCB();
            cb.specify().derivedPurchase().max(new SubQuery<PurchaseCB>() {
                public void query(PurchaseCB subCB) {
                    subCB.specify().columnPurchaseDatetime();
                }
            }, Member.ALIAS_latestLoginDatetime);
            plainList = memberBhv.selectList(cb);
        }
        MemberCB cb = new MemberCB();
        cb.specify().derivedPurchase().max(new SubQuery<PurchaseCB>() {
            public void query(PurchaseCB subCB) {
                subCB.specify().columnPurchaseDatetime();
            }
        }, Member.ALIAS_latestLoginDatetime, op -> op.addYear(10).addMonth(3).addDay(7).addHour(5).addMinute(20).addSecond(50));

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertFalse(memberList.isEmpty());
        boolean exists = false;
        for (int i = 0; i < memberList.size(); i++) {
            Member member = memberList.get(i);
            Member plain = plainList.get(i);
            Timestamp latestTime = member.getLatestLoginDatetime();
            Timestamp plainTime = plain.getLatestLoginDatetime();
            log(member.getMemberName() + ", " + latestTime + ", " + plainTime);
            if (latestTime != null) {
                exists = true;
                Calendar cal = Calendar.getInstance();
                cal.setTime(plainTime);
                cal.add(Calendar.YEAR, 10);
                cal.add(Calendar.MONTH, 3);
                cal.add(Calendar.DAY_OF_MONTH, 7);
                cal.add(Calendar.HOUR_OF_DAY, 5);
                cal.add(Calendar.MINUTE, 20);
                cal.add(Calendar.SECOND, 50);
                Timestamp moved = new Timestamp(cal.getTimeInMillis());
                assertEquals(moved, latestTime);
            }
        }
        assertTrue(exists);
        String sql = cb.toDisplaySql();
        assertTrue(Srl.contains(sql, "max(sub1loc.purchase_datetime) + '10 years' + '3 months'"));
        assertTrue(Srl.contains(sql, "months' + '7 days' + '5 hours' + '20 minutes' + '50 seconds'"));
    }

    public void test_SpecifyDerivedReferrer_dateAdd_lastDay() {
        // ## Arrange ##
        ListResultBean<Member> plainList;
        {
            MemberCB cb = new MemberCB();
            cb.specify().derivedPurchase().max(new SubQuery<PurchaseCB>() {
                public void query(PurchaseCB subCB) {
                    subCB.specify().columnPurchaseDatetime();
                }
            }, Member.ALIAS_latestLoginDatetime);
            plainList = memberBhv.selectList(cb);
        }
        MemberCB cb = new MemberCB();
        cb.specify().derivedPurchase().max(new SubQuery<PurchaseCB>() {
            public void query(PurchaseCB subCB) {
                subCB.specify().columnPurchaseDatetime();
            }
        }, Member.ALIAS_latestLoginDatetime, op -> op.addMonth(1).truncDay().addDay(-1)); // means last_day

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb); // expect no exception

        // ## Assert ##
        assertFalse(memberList.isEmpty());
        boolean exists = false;
        for (int i = 0; i < memberList.size(); i++) {
            Member member = memberList.get(i);
            Member plain = plainList.get(i);
            Timestamp latestTime = member.getLatestLoginDatetime();
            Timestamp plainTime = plain.getLatestLoginDatetime();
            log(member.getMemberName() + ", " + latestTime + ", " + plainTime);
            if (latestTime != null) {
                exists = true;
                Calendar cal = Calendar.getInstance();
                cal.setTime(plainTime);
                cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
                cal.set(Calendar.HOUR_OF_DAY, 0);
                cal.set(Calendar.MINUTE, 0);
                cal.set(Calendar.SECOND, 0);
                cal.set(Calendar.MILLISECOND, 0);
                Timestamp moved = new Timestamp(cal.getTimeInMillis());
                assertEquals(moved, latestTime);
            }
        }
        assertTrue(exists);
    }

    // -----------------------------------------------------
    //                                (Query)DerivedReferrer
    //                                ----------------------
    public void test_QueryDerivedReferrer_dateAdd_right() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.query().derivedPurchase().max(new SubQuery<PurchaseCB>() {
            public void query(PurchaseCB subCB) {
                subCB.specify().columnPurchaseDatetime();
            }
        }, op -> op.addYear(-80).addMonth(3).addDay(7).addHour(5).addMinute(20).addSecond(50)).lessThan(DfTypeUtil.toDate("1970/06/25"));

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb); // expect no exception

        // ## Assert ##
        assertFalse(memberList.isEmpty());
    }

    // -----------------------------------------------------
    //                                           ColumnQuery
    //                                           -----------
    public void test_ColumnQuery_dateAdd_right() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.columnQuery(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.specify().columnBirthdate();
            }
        }).lessEqual(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.specify().columnBirthdate();
            }
        }).convert(op -> op.addYear(10).addMonth(3).addDay(7).addHour(5).addMinute(20).addSecond(50));

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb); // expect no exception

        // ## Assert ##
        assertFalse(memberList.isEmpty());
        String sql = cb.toDisplaySql();
        assertTrue(Srl.contains(sql, "where dfloc.birthdate <= cast(cast(cast(cast(cast(cast("));
        assertTrue(Srl.contains(sql, "cast(dfloc.birthdate as timestamp) + '10 years' as timestamp) + '3"));
        assertTrue(Srl.contains(sql, " + '3 months' as timestamp) + '7 days' as timestamp) + '5"));
        assertTrue(Srl.contains(sql, " + '5 hours' as timestamp) + '20 minutes' as timestamp) + '50"));
        assertTrue(Srl.contains(sql, " + '50 seconds'"));
    }

    public void test_ColumnQuery_dateAdd_left() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.columnQuery(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.specify().columnBirthdate();
            }
        }).greaterEqual(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.specify().columnBirthdate();
            }
        }).left().convert(op -> op.addYear(10).addMonth(3).addDay(7).addHour(5).addMinute(20).addSecond(50));

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb); // expect no exception

        // ## Assert ##
        assertFalse(memberList.isEmpty());
        String sql = cb.toDisplaySql();
        assertTrue(Srl.contains(sql, "cast(cast(cast(cast(cast(cast("));
        assertTrue(Srl.contains(sql, "cast(dfloc.birthdate as timestamp) + '10 years' as timestamp) + '3"));
        assertTrue(Srl.contains(sql, " + '3 months' as timestamp) + '7 days' as timestamp) + '5"));
        assertTrue(Srl.contains(sql, " + '5 hours' as timestamp) + '20 minutes' as timestamp) + '50"));
        assertTrue(Srl.contains(sql, " + '50 seconds' >= dfloc.birthdate"));
    }

    public void test_ColumnQuery_dateAdd_collaboration() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.columnQuery(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.specify().columnBirthdate();
            }
        }).lessEqual(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.specify().columnFormalizedDatetime();
            }
        }).plus(123).convert(op -> op.addDay(7).truncTime()).minus(789);

        // ## Act ##
        //memberBhv.selectList(cb); // bacause of exception

        // ## Assert ##
        //assertFalse(memberList.isEmpty());
        String sql = cb.toDisplaySql();
        log(ln() + sql);
        assertTrue(Srl.contains(sql, "(date_trunc('day', (dfloc.formalized_datetime + 123) + '7 days')) - 789"));
    }

    public void test_ColumnQuery_dateAdd_derived() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.columnQuery(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.specify().columnBirthdate();
            }
        }).greaterEqual(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.specify().derivedPurchase().max(new SubQuery<PurchaseCB>() {
                    public void query(PurchaseCB subCB) {
                        subCB.specify().columnPurchaseDatetime();
                    }
                }, null);
            }
        }).convert(op -> op.addDay(3).truncTime());
        cb.query().queryMemberStatus().existsMember(new SubQuery<MemberCB>() {
            public void query(MemberCB subCB) {
                subCB.columnQuery(new SpecifyQuery<MemberCB>() {
                    public void specify(MemberCB cb) {
                        cb.specify().columnBirthdate();
                    }
                }).greaterEqual(new SpecifyQuery<MemberCB>() {
                    public void specify(MemberCB cb) {
                        cb.specify().derivedPurchase().max(new SubQuery<PurchaseCB>() {
                            public void query(PurchaseCB subCB) {
                                subCB.specify().columnPurchaseDatetime();
                            }
                        }, null);
                    }
                }).convert(op -> op.addDay(3).truncTime());

            }
        }); // formatting check

        // ## Act ##
        memberBhv.selectList(cb); // expect no exception

        // ## Assert ##
        String sql = cb.toDisplaySql();
        assertTrue(Srl.contains(sql, "date_trunc('day'" + ln()));
        assertTrue(Srl.contains(sql, " , (select max(sub1loc.purchase_datetime)"));
        assertTrue(Srl.contains(sql, ")) + '3 days'"));
    }

    public void test_ColumnQuery_dateAdd_derived_bothSide() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.specify().derivedPurchase().max(new SubQuery<PurchaseCB>() {
            public void query(PurchaseCB subCB) {
                subCB.specify().columnPurchaseDatetime();
            }
        }, Member.ALIAS_latestLoginDatetime, op -> op.addYear(1000));
        cb.columnQuery(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.specify().derivedPurchase().max(new SubQuery<PurchaseCB>() {
                    public void query(PurchaseCB subCB) {
                        subCB.specify().columnPurchaseDatetime();
                    }
                }, null);
            }
        }).equal(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.specify().derivedPurchase().max(new SubQuery<PurchaseCB>() {
                    public void query(PurchaseCB subCB) {
                        subCB.specify().columnPurchaseDatetime();
                    }
                }, null);
            }
        }).left().convert(op -> op.addDay(-3)).right().convert(op -> op.addDay(-3));

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb); // expect no exception

        // ## Assert ##
        assertFalse(memberList.isEmpty());
        for (Member member : memberList) {
            Timestamp maxPurchaseDatetime = member.getLatestLoginDatetime();
            log(member.getMemberName() + ", " + maxPurchaseDatetime);
        }
        String sql = cb.toDisplaySql();
        assertTrue(Srl.contains(sql, "+ '1000 years'"));
        assertEquals(2, Srl.count(sql, "+ '-3 days'"));
    }
}
