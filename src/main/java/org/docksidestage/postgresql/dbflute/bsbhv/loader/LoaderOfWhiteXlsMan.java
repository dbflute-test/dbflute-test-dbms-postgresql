package org.docksidestage.postgresql.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.docksidestage.postgresql.dbflute.exbhv.*;
import org.docksidestage.postgresql.dbflute.exentity.*;

/**
 * The referrer loader of white_xls_man as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteXlsMan {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteXlsMan> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteXlsManBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteXlsMan ready(List<WhiteXlsMan> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteXlsManBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteXlsManBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteXlsMan> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
