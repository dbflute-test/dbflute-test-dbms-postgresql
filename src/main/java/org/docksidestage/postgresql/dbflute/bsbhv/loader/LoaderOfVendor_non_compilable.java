package org.docksidestage.postgresql.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import org.docksidestage.postgresql.dbflute.exbhv.*;
import org.docksidestage.postgresql.dbflute.exentity.*;
import org.docksidestage.postgresql.dbflute.cbean.*;

/**
 * The referrer loader of VENDOR-NON COMPILABLE as TABLE. <br />
 * <pre>
 * [primary key]
 *     NON-COMPILABLE ID
 *
 * [column]
 *     NON-COMPILABLE ID, NON COMPILABLE-NAME, PARENT-ID, Next_ParentID
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
 *     VENDOR-NON COMPILABLE
 *
 * [referrer table]
 *     VENDOR-NON COMPILABLE
 *
 * [foreign property]
 *     vendor_non_compilableByNextParentidSelf, vendor_non_compilableByParent_idSelf
 *
 * [referrer property]
 *     vendor_non_compilableByNextParentidSelfList, vendor_non_compilableByParent_idSelfList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfVendor_non_compilable {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Vendor_non_compilable> _selectedList;
    protected BehaviorSelector _selector;
    protected Vendor_non_compilableBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfVendor_non_compilable ready(List<Vendor_non_compilable> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected Vendor_non_compilableBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(Vendor_non_compilableBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<Vendor_non_compilable> _referrerVendor_non_compilableByNextParentidSelfList;
    public NestedReferrerLoaderGateway<LoaderOfVendor_non_compilable> loadVendor_non_compilableByNextParentidSelfList(ConditionBeanSetupper<Vendor_non_compilableCB> refCBLambda) {
        myBhv().loadVendor_non_compilableByNextParentidSelfList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerVendor_non_compilableByNextParentidSelfList = refLs);
        return hd -> hd.handle(new LoaderOfVendor_non_compilable().ready(_referrerVendor_non_compilableByNextParentidSelfList, _selector));
    }

    protected List<Vendor_non_compilable> _referrerVendor_non_compilableByParent_idSelfList;
    public NestedReferrerLoaderGateway<LoaderOfVendor_non_compilable> loadVendor_non_compilableByParent_idSelfList(ConditionBeanSetupper<Vendor_non_compilableCB> refCBLambda) {
        myBhv().loadVendor_non_compilableByParent_idSelfList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerVendor_non_compilableByParent_idSelfList = refLs);
        return hd -> hd.handle(new LoaderOfVendor_non_compilable().ready(_referrerVendor_non_compilableByParent_idSelfList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfVendor_non_compilable _foreignVendor_non_compilableByNextParentidSelfLoader;
    public LoaderOfVendor_non_compilable pulloutVendor_non_compilableByNextParentidSelf() {
        if (_foreignVendor_non_compilableByNextParentidSelfLoader == null)
        { _foreignVendor_non_compilableByNextParentidSelfLoader = new LoaderOfVendor_non_compilable().ready(myBhv().pulloutVendor_non_compilableByNextParentidSelf(_selectedList), _selector); }
        return _foreignVendor_non_compilableByNextParentidSelfLoader;
    }

    protected LoaderOfVendor_non_compilable _foreignVendor_non_compilableByParent_idSelfLoader;
    public LoaderOfVendor_non_compilable pulloutVendor_non_compilableByParent_idSelf() {
        if (_foreignVendor_non_compilableByParent_idSelfLoader == null)
        { _foreignVendor_non_compilableByParent_idSelfLoader = new LoaderOfVendor_non_compilable().ready(myBhv().pulloutVendor_non_compilableByParent_idSelf(_selectedList), _selector); }
        return _foreignVendor_non_compilableByParent_idSelfLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Vendor_non_compilable> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
