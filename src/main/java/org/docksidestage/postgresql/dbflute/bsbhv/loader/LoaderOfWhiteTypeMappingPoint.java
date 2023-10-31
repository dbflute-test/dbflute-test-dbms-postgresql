package org.docksidestage.postgresql.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.docksidestage.postgresql.dbflute.exbhv.*;
import org.docksidestage.postgresql.dbflute.exentity.*;

/**
 * The referrer loader of white_type_mapping_point as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteTypeMappingPoint {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteTypeMappingPoint> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteTypeMappingPointBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteTypeMappingPoint ready(List<WhiteTypeMappingPoint> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteTypeMappingPointBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteTypeMappingPointBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteTypeMappingPoint> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
