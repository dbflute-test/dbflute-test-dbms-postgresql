package org.docksidestage.postgresql.dbflute.whitebox.dfprop;

import org.docksidestage.postgresql.dbflute.exbhv.MemberStatusBhv;
import org.docksidestage.postgresql.dbflute.exbhv.PurchaseBhv;
import org.docksidestage.postgresql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.7.8 (2010/12/17 Friday)
 */
public class WxSubColumnSequenceTest extends UnitContainerTestCase {

    private MemberStatusBhv memberStatusBhv;
    private PurchaseBhv purchaseBhv;

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    public void test_SubSequence_default() {
        Integer first = memberStatusBhv.selectNextValForDisplayOrder();
        Integer second = memberStatusBhv.selectNextValForDisplayOrder();
        assertEquals(Integer.valueOf(first + 1), second);
    }

    public void test_SubSequence_overrideForCache() {
        for (int i = 0; i < 1000; i++) {
            Integer first = purchaseBhv.selectNextValForPurchaseCount();
            Integer second = purchaseBhv.selectNextValForPurchaseCount();
            assertEquals(Integer.valueOf(first + 1), second);
        }
    }
}
