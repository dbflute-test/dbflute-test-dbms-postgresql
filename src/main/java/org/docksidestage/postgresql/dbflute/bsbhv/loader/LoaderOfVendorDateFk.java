package org.docksidestage.postgresql.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.docksidestage.postgresql.dbflute.exbhv.*;
import org.docksidestage.postgresql.dbflute.exentity.*;

/**
 * The referrer loader of vendor_date_fk as TABLE. <br />
 * <pre>
 * [primary key]
 *     bar_id
 *
 * [column]
 *     bar_id, bar_date
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     vendor_date_pk
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     vendorDatePk
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfVendorDateFk {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<VendorDateFk> _selectedList;
    protected BehaviorSelector _selector;
    protected VendorDateFkBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfVendorDateFk ready(List<VendorDateFk> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected VendorDateFkBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(VendorDateFkBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfVendorDatePk _foreignVendorDatePkLoader;
    public LoaderOfVendorDatePk pulloutVendorDatePk() {
        if (_foreignVendorDatePkLoader == null)
        { _foreignVendorDatePkLoader = new LoaderOfVendorDatePk().ready(myBhv().pulloutVendorDatePk(_selectedList), _selector); }
        return _foreignVendorDatePkLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<VendorDateFk> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
