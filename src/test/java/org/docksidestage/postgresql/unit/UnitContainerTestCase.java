package org.docksidestage.postgresql.unit;

import org.dbflute.bhv.BehaviorSelector;
import org.dbflute.bhv.BehaviorWritable;
import org.dbflute.bhv.writable.DeleteOption;
import org.dbflute.cbean.ConditionBean;
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
}
