package org.docksidestage.postgresql.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.docksidestage.postgresql.dbflute.exbhv.*;
import org.docksidestage.postgresql.dbflute.exentity.*;

/**
 * The referrer loader of vendor_inherit_inu as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfVendorInheritInu {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<VendorInheritInu> _selectedList;
    protected BehaviorSelector _selector;
    protected VendorInheritInuBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfVendorInheritInu ready(List<VendorInheritInu> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected VendorInheritInuBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(VendorInheritInuBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<VendorInheritInu> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
