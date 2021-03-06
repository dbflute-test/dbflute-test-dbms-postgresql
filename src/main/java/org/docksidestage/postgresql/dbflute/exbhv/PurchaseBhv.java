package org.docksidestage.postgresql.dbflute.exbhv;

import org.docksidestage.postgresql.dbflute.bsbhv.BsPurchaseBhv;

/**
 * The behavior of purchase.
 * <p>
 * You can implement your original methods here.
 * This class is NOT overridden when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
@org.springframework.stereotype.Component("purchaseBhv")
public class PurchaseBhv extends BsPurchaseBhv {

    @Override
    public Integer selectNextValForPurchaseCount() {
        return doSelectNextValForPurchaseCount(1, 10);
    }
}
