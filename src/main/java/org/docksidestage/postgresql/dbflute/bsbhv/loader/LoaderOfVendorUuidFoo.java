package org.docksidestage.postgresql.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.docksidestage.postgresql.dbflute.exbhv.*;
import org.docksidestage.postgresql.dbflute.exentity.*;

/**
 * The referrer loader of vendor_uuid_foo as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfVendorUuidFoo {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<VendorUuidFoo> _selectedList;
    protected BehaviorSelector _selector;
    protected VendorUuidFooBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfVendorUuidFoo ready(List<VendorUuidFoo> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected VendorUuidFooBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(VendorUuidFooBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfVendorUuidBar _foreignVendorUuidBarLoader;
    public LoaderOfVendorUuidBar pulloutVendorUuidBar() {
        if (_foreignVendorUuidBarLoader == null)
        { _foreignVendorUuidBarLoader = new LoaderOfVendorUuidBar().ready(myBhv().pulloutVendorUuidBar(_selectedList), _selector); }
        return _foreignVendorUuidBarLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<VendorUuidFoo> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
