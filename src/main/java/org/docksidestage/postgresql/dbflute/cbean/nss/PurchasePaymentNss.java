package org.docksidestage.postgresql.dbflute.cbean.nss;

import org.docksidestage.postgresql.dbflute.cbean.cq.PurchasePaymentCQ;

/**
 * The nest select set-upper of purchase_payment.
 * @author DBFlute(AutoGenerator)
 */
public class PurchasePaymentNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final PurchasePaymentCQ _query;
    public PurchasePaymentNss(PurchasePaymentCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * (購入)purchase by my purchase_id, named 'purchase'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public PurchaseNss withPurchase() {
        _query.xdoNss(() -> _query.queryPurchase());
        return new PurchaseNss(_query.queryPurchase());
    }
}
