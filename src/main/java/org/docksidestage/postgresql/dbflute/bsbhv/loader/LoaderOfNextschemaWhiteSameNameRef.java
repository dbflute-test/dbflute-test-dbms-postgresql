package org.docksidestage.postgresql.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.docksidestage.postgresql.dbflute.exbhv.*;
import org.docksidestage.postgresql.dbflute.exentity.*;

/**
 * The referrer loader of nextschema.white_same_name_ref as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfNextschemaWhiteSameNameRef {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<NextschemaWhiteSameNameRef> _selectedList;
    protected BehaviorSelector _selector;
    protected NextschemaWhiteSameNameRefBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfNextschemaWhiteSameNameRef ready(List<NextschemaWhiteSameNameRef> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected NextschemaWhiteSameNameRefBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(NextschemaWhiteSameNameRefBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfNextschemaWhiteSameName _foreignWhiteSameNameLoader;
    public LoaderOfNextschemaWhiteSameName pulloutWhiteSameName() {
        if (_foreignWhiteSameNameLoader == null)
        { _foreignWhiteSameNameLoader = new LoaderOfNextschemaWhiteSameName().ready(myBhv().pulloutWhiteSameName(_selectedList), _selector); }
        return _foreignWhiteSameNameLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<NextschemaWhiteSameNameRef> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
