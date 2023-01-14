package org.docksidestage.postgresql.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.docksidestage.postgresql.dbflute.exbhv.*;
import org.docksidestage.postgresql.dbflute.exentity.*;

/**
 * The referrer loader of vendor_part_man_high as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfVendorPartManHigh {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<VendorPartManHigh> _selectedList;
    protected BehaviorSelector _selector;
    protected VendorPartManHighBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfVendorPartManHigh ready(List<VendorPartManHigh> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected VendorPartManHighBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(VendorPartManHighBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<VendorPartManHigh> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
