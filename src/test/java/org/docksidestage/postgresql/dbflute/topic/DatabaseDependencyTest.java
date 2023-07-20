package org.docksidestage.postgresql.dbflute.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.dbflute.dbmeta.info.ColumnInfo;
import org.dbflute.dbway.topic.ExtensionOperand;
import org.dbflute.exception.SQLFailureException;
import org.docksidestage.postgresql.dbflute.allcommon.DBFluteConfig;
import org.docksidestage.postgresql.dbflute.bsentity.dbmeta.MemberDbm;
import org.docksidestage.postgresql.dbflute.cbean.MemberCB;
import org.docksidestage.postgresql.dbflute.exbhv.MemberBhv;
import org.docksidestage.postgresql.dbflute.exentity.Member;
import org.docksidestage.postgresql.unit.UnitContainerTestCase;

/**
 * The test of the property 'isAvailableDatabaseDependency' in 'littleAdjustmentMap.dfprop'.
 * @author jflute
 * @since 0.9.5 (2009/04/30 Thursday)
 */
public class DatabaseDependencyTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;

    private ExtensionOperand originalFullTextSearchOperand; // to revert change

    // ===================================================================================
    //                                                                            Settings
    //                                                                            ========
    @Override
    public void setUp() throws Exception {
        super.setUp();
        originalFullTextSearchOperand = DBFluteConfig.getInstance().getFullTextSearchOperand();
    }

    @Override
    public void tearDown() throws Exception {
        super.tearDown();
        DBFluteConfig.getInstance().unlock();
        DBFluteConfig.getInstance().setFullTextSearchOperand(originalFullTextSearchOperand);
        originalFullTextSearchOperand = null;
    }

    // ===================================================================================
    //                                                                           Lock Wait
    //                                                                           =========
    public void test_ConditionBean_lockForUpdateNoWait() throws Exception {
        // ## Arrange ##
        final MemberCB cb = new MemberCB();
        cb.query().setMemberId_Equal(1);
        cb.lockForUpdateNoWait();

        // ## Act ##
        final Member member = memberBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        assertNotNull(member);
        assertTrue(cb.toDisplaySql().contains(" for update"));
        assertTrue(cb.toDisplaySql().contains(" nowait"));
    }

    // ===================================================================================
    //                                                                    Full-Text Search
    //                                                                    ================
    // -----------------------------------------------------
    //                                    Mecab TextsearchJa
    //                                    ------------------
    public void test_match_MecabTextsearchJa_basic_singleColumn_nonModifier() {
        // ## Arrange ##
        DBFluteConfig.getInstance().unlock();
        DBFluteConfig.getInstance().useFullTextSearchOperandMecabTextsearchJa();
        MemberCB cb = new MemberCB();
        MemberDbm dbm = MemberDbm.getInstance();

        // ## Act ##
        cb.query().match(dbm.columnMemberName(), "foo");

        // ## Assert ##
        String sql = cb.toDisplaySql();
        log(sql);
        assertTrue(sql.contains(MemberDbm.getInstance().columnMemberName().getColumnDbName() + " @@ "));

        // it works as default PostgreSQL...why?
        //try {
        memberBhv.selectList(cb);
        //    fail();
        //} catch (SQLFailureException e) {
        //    // OK
        //    log(e.getMessage());
        //    assertTrue(e.getMessage().contains("operator does not exist: character varying @@ character varying"));
        //}
    }

    public void test_match_MecabTextsearchJa_duplicateColumn_inBooleanModeModifier() {
        // ## Arrange ##
        DBFluteConfig.getInstance().unlock();
        DBFluteConfig.getInstance().useFullTextSearchOperandMecabTextsearchJa();
        MemberCB cb = new MemberCB();
        MemberDbm dbm = MemberDbm.getInstance();

        // ## Act ##
        cb.query().match(Arrays.asList(dbm.columnMemberName(), dbm.columnMemberAccount()), "foo");

        // ## Assert ##
        String sql = cb.toDisplaySql();
        log(sql);
        assertTrue(sql.contains(MemberDbm.getInstance().columnMemberName().getColumnDbName() + " @@ "));
        assertTrue(sql.contains(" or "));
        assertTrue(sql.contains(MemberDbm.getInstance().columnMemberAccount().getColumnDbName() + " @@ "));

        // it works as default PostgreSQL...why?
        //try {
        memberBhv.selectList(cb);
        //    fail();
        //} catch (SQLFailureException e) {
        //    // OK
        //    log(e.getMessage());
        //    assertTrue(e.getMessage().contains("operator does not exist: character varying @@ character varying"));
        //}
    }

    // -----------------------------------------------------
    //                                              PGroonga
    //                                              --------
    public void test_match_PGroongaBasic_basic_singleColumn_nonModifier() {
        // ## Arrange ##
        DBFluteConfig.getInstance().unlock();
        DBFluteConfig.getInstance().useFullTextSearchOperandPGroongaBasic();
        MemberCB cb = new MemberCB();
        MemberDbm dbm = MemberDbm.getInstance();

        // ## Act ##
        cb.query().match(dbm.columnMemberName(), "foo");

        // ## Assert ##
        String sql = cb.toDisplaySql();
        log(sql);
        assertTrue(sql.contains(MemberDbm.getInstance().columnMemberName().getColumnDbName() + " &@ "));

        try {
            memberBhv.selectList(cb);
            fail();
        } catch (SQLFailureException e) {
            // OK
            log(e.getMessage());
            assertTrue(e.getMessage().contains("operator does not exist: character varying &@ character varying"));
        }
    }

    public void test_match_PGroongaBasic_duplicateColumn_inBooleanModeModifier() {
        // ## Arrange ##
        DBFluteConfig.getInstance().unlock();
        DBFluteConfig.getInstance().useFullTextSearchOperandPGroongaBasic();
        MemberCB cb = new MemberCB();
        MemberDbm dbm = MemberDbm.getInstance();

        // ## Act ##
        cb.query().match(Arrays.asList(dbm.columnMemberName(), dbm.columnMemberAccount()), "foo");

        // ## Assert ##
        String sql = cb.toDisplaySql();
        log(sql);
        assertTrue(sql.contains(MemberDbm.getInstance().columnMemberName().getColumnDbName() + " &@ "));
        assertTrue(sql.contains(" or "));
        assertTrue(sql.contains(MemberDbm.getInstance().columnMemberAccount().getColumnDbName() + " &@ "));

        try {
            memberBhv.selectList(cb);
            fail();
        } catch (SQLFailureException e) {
            // OK
            log(e.getMessage());
            assertTrue(e.getMessage().contains("operator does not exist: character varying &@ character varying"));
        }
    }

    // -----------------------------------------------------
    //                                       Traditional New
    //                                       ---------------
    public void test_match_traditionalNew_basic_singleColumn_nonModifier() {
        // ## Arrange ##
        DBFluteConfig.getInstance().unlock();
        DBFluteConfig.getInstance().useFullTextSearchOperanTraditionalNewFullTextSearch();
        MemberCB cb = new MemberCB();
        MemberDbm dbm = MemberDbm.getInstance();

        // ## Act ##
        cb.query().match(dbm.columnMemberName(), "foo");

        // ## Assert ##
        String sql = cb.toDisplaySql();
        log(sql);
        assertTrue(sql.contains(MemberDbm.getInstance().columnMemberName().getColumnDbName() + " %% "));

        try {
            memberBhv.selectList(cb);
            fail();
        } catch (SQLFailureException e) {
            // OK
            log(e.getMessage());
            assertTrue(e.getMessage().contains("operator does not exist: character varying %% character varying"));
        }
    }

    public void test_match_traditionalNew_duplicateColumn_inBooleanModeModifier() {
        // ## Arrange ##
        DBFluteConfig.getInstance().unlock();
        DBFluteConfig.getInstance().useFullTextSearchOperanTraditionalNewFullTextSearch();
        MemberCB cb = new MemberCB();
        MemberDbm dbm = MemberDbm.getInstance();

        // ## Act ##
        cb.query().match(Arrays.asList(dbm.columnMemberName(), dbm.columnMemberAccount()), "foo");

        // ## Assert ##
        String sql = cb.toDisplaySql();
        log(sql);
        assertTrue(sql.contains(MemberDbm.getInstance().columnMemberName().getColumnDbName() + " %% "));
        assertTrue(sql.contains(" or "));
        assertTrue(sql.contains(MemberDbm.getInstance().columnMemberAccount().getColumnDbName() + " %% "));

        try {
            memberBhv.selectList(cb);
            fail();
        } catch (SQLFailureException e) {
            // OK
            log(e.getMessage());
            assertTrue(e.getMessage().contains("operator does not exist: character varying %% character varying"));
        }
    }

    // -----------------------------------------------------
    //                                       Traditional Old
    //                                       ---------------
    public void test_match_traditionalOld_basic_singleColumn_nonModifier() {
        // ## Arrange ##
        DBFluteConfig.getInstance().unlock();
        DBFluteConfig.getInstance().useFullTextSearchOperanTraditionalOldFullTextSearch();
        MemberCB cb = new MemberCB();
        MemberDbm dbm = MemberDbm.getInstance();

        // ## Act ##
        cb.query().match(dbm.columnMemberName(), "foo");

        // ## Assert ##
        String sql = cb.toDisplaySql();
        log(sql);
        assertTrue(sql.contains(MemberDbm.getInstance().columnMemberName().getColumnDbName() + " @@ "));

        // it works as default PostgreSQL...why?
        //try {
        memberBhv.selectList(cb);
        //    fail();
        //} catch (SQLFailureException e) {
        //    // OK
        //    log(e.getMessage());
        //    assertTrue(e.getMessage().contains("The used table type doesn't support FULLTEXT indexes"));
        //}
    }

    public void test_match_traditionalOld_duplicateColumn_inBooleanModeModifier() {
        // ## Arrange ##
        DBFluteConfig.getInstance().unlock();
        DBFluteConfig.getInstance().useFullTextSearchOperanTraditionalOldFullTextSearch();
        MemberCB cb = new MemberCB();
        MemberDbm dbm = MemberDbm.getInstance();

        // ## Act ##
        cb.query().match(Arrays.asList(dbm.columnMemberName(), dbm.columnMemberAccount()), "foo");

        // ## Assert ##
        String sql = cb.toDisplaySql();
        log(sql);
        assertTrue(sql.contains(MemberDbm.getInstance().columnMemberName().getColumnDbName() + " @@ "));
        assertTrue(sql.contains(" or "));
        assertTrue(sql.contains(MemberDbm.getInstance().columnMemberAccount().getColumnDbName() + " @@ "));

        //try {
        memberBhv.selectList(cb);
        //    fail();
        //} catch (SQLFailureException e) {
        //    // OK
        //    log(e.getMessage());
        //    assertTrue(e.getMessage().contains("The used table type doesn't support FULLTEXT indexes"));
        //}
    }

    // -----------------------------------------------------
    //                                      Generate Default
    //                                      ----------------
    public void test_match_generateDefault_basic_singleColumn_nonModifier() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        MemberDbm dbm = MemberDbm.getInstance();

        // ## Act ##
        cb.query().match(dbm.columnMemberName(), "foo");

        // ## Assert ##
        String sql = cb.toDisplaySql();
        log(sql);
        assertTrue(sql.contains(MemberDbm.getInstance().columnMemberName().getColumnDbName() + " &@ "));

        try {
            memberBhv.selectList(cb);
            fail();
        } catch (SQLFailureException e) {
            // OK
            log(e.getMessage());
            assertTrue(e.getMessage().contains("operator does not exist: character varying &@ character varying"));
        }
    }

    // -----------------------------------------------------
    //                                      Original Operand
    //                                      ----------------
    public void test_match_originalOperand_basic_singleColumn_nonModifier() {
        // ## Arrange ##
        DBFluteConfig.getInstance().unlock();
        DBFluteConfig.getInstance().setFullTextSearchOperand(new ExtensionOperand() {
            public String operand() {
                return "@%&";
            }
        });
        MemberCB cb = new MemberCB();
        MemberDbm dbm = MemberDbm.getInstance();

        // ## Act ##
        cb.query().match(dbm.columnMemberName(), "foo");

        // ## Assert ##
        String sql = cb.toDisplaySql();
        log(sql);
        assertTrue(sql.contains(MemberDbm.getInstance().columnMemberName().getColumnDbName() + " @%& "));

        try {
            memberBhv.selectList(cb);
            fail();
        } catch (SQLFailureException e) {
            // OK
            log(e.getMessage());
            assertTrue(e.getMessage().contains("operator does not exist: character varying @%& character varying"));
        }
    }

    // -----------------------------------------------------
    //                                             Exception
    //                                             ---------
    public void test_match_notStringColumn() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        MemberDbm dbm = MemberDbm.getInstance();
        List<ColumnInfo> textColumnList = new ArrayList<ColumnInfo>();
        textColumnList.add(dbm.columnMemberName());
        textColumnList.add(dbm.columnBirthdate());

        // ## Act ##
        try {
            cb.query().match(textColumnList, "foo");
            // ## Assert ##
            fail();
        } catch (IllegalArgumentException e) {
            // OK
            log(e.getMessage());
        }
    }
}
