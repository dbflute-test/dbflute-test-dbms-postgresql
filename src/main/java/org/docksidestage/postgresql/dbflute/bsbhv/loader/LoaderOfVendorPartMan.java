package org.docksidestage.postgresql.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.docksidestage.postgresql.dbflute.exbhv.*;
import org.docksidestage.postgresql.dbflute.exentity.*;

/**
 * The referrer loader of vendor_part_man as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfVendorPartMan {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<VendorPartMan> _selectedList;
    protected BehaviorSelector _selector;
    protected VendorPartManBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfVendorPartMan ready(List<VendorPartMan> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected VendorPartManBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(VendorPartManBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<VendorPartMan> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
