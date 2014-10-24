package org.docksidestage.postgresql.dbflute.cbean.nss;

import org.docksidestage.postgresql.dbflute.cbean.cq.VendorUuidFooCQ;

/**
 * The nest select set-upper of vendor_uuid_foo.
 * @author DBFlute(AutoGenerator)
 */
public class VendorUuidFooNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected VendorUuidFooCQ _query;
    public VendorUuidFooNss(VendorUuidFooCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * vendor_uuid_bar by my bar_id, named 'vendorUuidBar'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public VendorUuidBarNss withVendorUuidBar() {
        _query.xdoNss(() -> _query.queryVendorUuidBar());
        return new VendorUuidBarNss(_query.queryVendorUuidBar());
    }
}
