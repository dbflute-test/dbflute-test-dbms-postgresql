package org.docksidestage.postgresql.dbflute.cbean.nss;

import org.docksidestage.postgresql.dbflute.cbean.cq.VendorDateFkCQ;

/**
 * The nest select set-upper of vendor_date_fk.
 * @author DBFlute(AutoGenerator)
 */
public class VendorDateFkNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final VendorDateFkCQ _query;
    public VendorDateFkNss(VendorDateFkCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * vendor_date_pk by my bar_date, named 'vendorDatePk'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public VendorDatePkNss withVendorDatePk() {
        _query.xdoNss(() -> _query.queryVendorDatePk());
        return new VendorDatePkNss(_query.queryVendorDatePk());
    }
}
