package org.docksidestage.postgresql.dbflute.cbean.nss;

import org.docksidestage.postgresql.dbflute.cbean.cq.Vendor_non_compilableCQ;

/**
 * The nest select set-upper of VENDOR-NON COMPILABLE.
 * @author DBFlute(AutoGenerator)
 */
public class Vendor_non_compilableNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected Vendor_non_compilableCQ _query;
    public Vendor_non_compilableNss(Vendor_non_compilableCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * VENDOR-NON COMPILABLE by my Next_ParentID, named 'vendor_non_compilableByNextParentidSelf'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public Vendor_non_compilableNss withVendor_non_compilableByNextParentidSelf() {
        _query.xdoNss(() -> _query.queryVendor_non_compilableByNextParentidSelf());
        return new Vendor_non_compilableNss(_query.queryVendor_non_compilableByNextParentidSelf());
    }
    /**
     * With nested relation columns to select clause. <br>
     * VENDOR-NON COMPILABLE by my PARENT-ID, named 'vendor_non_compilableByParent_idSelf'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public Vendor_non_compilableNss withVendor_non_compilableByParent_idSelf() {
        _query.xdoNss(() -> _query.queryVendor_non_compilableByParent_idSelf());
        return new Vendor_non_compilableNss(_query.queryVendor_non_compilableByParent_idSelf());
    }
}
