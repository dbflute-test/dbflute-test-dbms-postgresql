package org.docksidestage.postgresql.unit;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.dbflute.bhv.BehaviorSelector;
import org.dbflute.bhv.BehaviorWritable;
import org.dbflute.bhv.writable.DeleteOption;
import org.dbflute.cbean.ConditionBean;
import org.dbflute.cbean.scoping.ModeQuery;
import org.dbflute.exception.NonSpecifiedColumnAccessException;
import org.dbflute.utflute.spring.ContainerTestCase;
import org.docksidestage.postgresql.dbflute.exbhv.MemberAddressBhv;
import org.docksidestage.postgresql.dbflute.exbhv.MemberLoginBhv;
import org.docksidestage.postgresql.dbflute.exbhv.MemberSecurityBhv;
import org.docksidestage.postgresql.dbflute.exbhv.MemberServiceBhv;
import org.docksidestage.postgresql.dbflute.exbhv.MemberWithdrawalBhv;
import org.docksidestage.postgresql.dbflute.exbhv.PurchaseBhv;
import org.docksidestage.postgresql.dbflute.exbhv.PurchasePaymentBhv;

/**
 * The test case with container.
 * @author jflute
 * @since 0.6.3 (2008/02/02 Saturday)
 */
public abstract class UnitContainerTestCase extends ContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private BehaviorSelector _behaviorSelector;

    // ===================================================================================
    //                                                                            Settings
    //                                                                            ========
    // because ContextSingletonBeanFactoryLocator is removed since Spring5
    @Override
    protected String[] prepareConfigFiles() {
        return new String[] { "jdbcBeans.xml", "dbfluteBeans.xml" };
    }

    @Override
    protected boolean isUseTestCaseLooseBinding() {
        return true;
    }

    // ===================================================================================
    //                                                                         Data Helper
    //                                                                         ===========
    protected void deleteAll(Class<? extends BehaviorWritable> clazz) {
        BehaviorWritable bhv = _behaviorSelector.select(clazz);
        ConditionBean cb = bhv.newConditionBean();
        bhv.rangeRemove(cb, new DeleteOption<ConditionBean>().allowNonQueryDelete());
    }

    protected void deleteMemberReferrer() {
        // not create yet
        deleteAll(MemberServiceBhv.class);
        //deleteAll(MemberFollowingBhv.class);
        deleteAll(MemberAddressBhv.class);
        deleteAll(MemberLoginBhv.class);
        deleteAll(MemberSecurityBhv.class);
        deleteAll(MemberWithdrawalBhv.class);
        deleteAll(PurchasePaymentBhv.class);
        deleteAll(PurchaseBhv.class);
    }

    // ===================================================================================
    //                                                                       Assert Helper
    //                                                                       =============
    protected void assertNonSpecifiedAccess(ModeQuery noArgInLambda) { // rental interface
        try {
            noArgInLambda.query();
            fail();
        } catch (NonSpecifiedColumnAccessException e) {
            log(e.getMessage());
        }
    }

    // ===================================================================================
    //                                                                     Isolation Level
    //                                                                     ===============
    /**
     * Adjust transaction isolation level to READ COMMITTED on this session. <br>
     * This method depends on the PostgreSQL. (you cannot use for other DBMSs)
     */
    protected void adjustTransactionIsolationLevel_ReadCommitted() {
        doAdjustTransactionIsolationLevelCommitted("READ COMMITTED");
    }

    /**
     * Adjust transaction isolation level to REPEATABLE READ on this session. <br>
     * This method depends on the PostgreSQL. (you cannot use for other DBMSs)
     */
    protected void adjustTransactionIsolationLevel_RepeatableRead() {
        doAdjustTransactionIsolationLevelCommitted("REPEATABLE READ");
    }

    private void doAdjustTransactionIsolationLevelCommitted(String isolationExp) {
        String sql = "SET TRANSACTION ISOLATION LEVEL " + isolationExp;
        DataSource dataSource = getDataSource();
        Connection conn = null;
        Statement st = null;
        try {
            conn = dataSource.getConnection();
            st = conn.createStatement();
            st.execute(sql);
        } catch (SQLException e) {
            throw new IllegalStateException("Failed to execute the SQL: " + sql, e);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ignored) {}
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ignored) {}
            }
        }
    }
}
