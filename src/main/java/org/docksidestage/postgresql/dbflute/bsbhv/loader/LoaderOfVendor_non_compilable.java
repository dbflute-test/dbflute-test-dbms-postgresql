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

    /**
     * Load referrer of vendor_non_compilableByNextParentidSelfList by the set-upper of referrer. <br />
     * VENDOR-NON COMPILABLE by Next_ParentID, named 'vendor_non_compilableByNextParentidSelfList'.
     * <pre>
     * <span style="color: #0000C0">vendor_non_compilableBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">vendor_non_compilableList</span>, <span style="color: #553000">entityLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">entityLoader</span>.<span style="color: #CC4747">loadVendor_non_compilableByNextParentidSelfList</span>(<span style="color: #553000">entityCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">entityCB</span>.setupSelect...
     *         <span style="color: #553000">entityCB</span>.query().set...
     *         <span style="color: #553000">entityCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">entityLoader</span> -&gt {</span>
     *     <span style="color: #3F7E5E">//    entityLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Vendor_non_compilable vendor_non_compilable : <span style="color: #553000">vendor_non_compilableList</span>) {
     *     ... = vendor_non_compilable.<span style="color: #CC4747">getVendor_non_compilableByNextParentidSelfList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setNextParentid_InScope(pkList);
     * cb.query().addOrderBy_NextParentid_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfVendor_non_compilable> loadVendor_non_compilableByNextParentidSelfList(ConditionBeanSetupper<Vendor_non_compilableCB> refCBLambda) {
        myBhv().loadVendor_non_compilableByNextParentidSelfList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerVendor_non_compilableByNextParentidSelfList = refLs);
        return hd -> hd.handle(new LoaderOfVendor_non_compilable().ready(_referrerVendor_non_compilableByNextParentidSelfList, _selector));
    }

    protected List<Vendor_non_compilable> _referrerVendor_non_compilableByParent_idSelfList;

    /**
     * Load referrer of vendor_non_compilableByParent_idSelfList by the set-upper of referrer. <br />
     * VENDOR-NON COMPILABLE by PARENT-ID, named 'vendor_non_compilableByParent_idSelfList'.
     * <pre>
     * <span style="color: #0000C0">vendor_non_compilableBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">vendor_non_compilableList</span>, <span style="color: #553000">entityLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">entityLoader</span>.<span style="color: #CC4747">loadVendor_non_compilableByParent_idSelfList</span>(<span style="color: #553000">entityCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">entityCB</span>.setupSelect...
     *         <span style="color: #553000">entityCB</span>.query().set...
     *         <span style="color: #553000">entityCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">entityLoader</span> -&gt {</span>
     *     <span style="color: #3F7E5E">//    entityLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Vendor_non_compilable vendor_non_compilable : <span style="color: #553000">vendor_non_compilableList</span>) {
     *     ... = vendor_non_compilable.<span style="color: #CC4747">getVendor_non_compilableByParent_idSelfList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setParent_id_InScope(pkList);
     * cb.query().addOrderBy_Parent_id_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
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
