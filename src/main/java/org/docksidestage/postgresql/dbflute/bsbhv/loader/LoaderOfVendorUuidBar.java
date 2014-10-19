package org.docksidestage.postgresql.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import org.docksidestage.postgresql.dbflute.exbhv.*;
import org.docksidestage.postgresql.dbflute.exentity.*;
import org.docksidestage.postgresql.dbflute.cbean.*;

/**
 * The referrer loader of vendor_uuid_bar as TABLE. <br />
 * <pre>
 * [primary key]
 *     bar_id
 *
 * [column]
 *     bar_id, bar_name
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
 *     
 *
 * [referrer table]
 *     vendor_uuid_foo
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     vendorUuidFooList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfVendorUuidBar {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<VendorUuidBar> _selectedList;
    protected BehaviorSelector _selector;
    protected VendorUuidBarBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfVendorUuidBar ready(List<VendorUuidBar> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected VendorUuidBarBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(VendorUuidBarBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<VendorUuidFoo> _referrerVendorUuidFooList;
    public NestedReferrerLoaderGateway<LoaderOfVendorUuidFoo> loadVendorUuidFooList(ConditionBeanSetupper<VendorUuidFooCB> refCBLambda) {
        myBhv().loadVendorUuidFooList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerVendorUuidFooList = refLs);
        return hd -> hd.handle(new LoaderOfVendorUuidFoo().ready(_referrerVendorUuidFooList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<VendorUuidBar> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
