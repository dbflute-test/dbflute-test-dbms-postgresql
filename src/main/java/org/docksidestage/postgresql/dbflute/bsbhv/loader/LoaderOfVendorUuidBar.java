package org.docksidestage.postgresql.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import org.docksidestage.postgresql.dbflute.exbhv.*;
import org.docksidestage.postgresql.dbflute.exentity.*;
import org.docksidestage.postgresql.dbflute.cbean.*;

/**
 * The referrer loader of vendor_uuid_bar as TABLE.
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
    protected List<VendorUuidFoo> _referrerVendorUuidFoo;

    /**
     * Load referrer of vendorUuidFooList by the set-upper of referrer. <br>
     * vendor_uuid_foo by bar_id, named 'vendorUuidFooList'.
     * <pre>
     * <span style="color: #0000C0">vendorUuidBarBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">vendorUuidBarList</span>, <span style="color: #553000">barLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">barLoader</span>.<span style="color: #CC4747">loadVendorUuidFoo</span>(<span style="color: #553000">fooCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">fooCB</span>.setupSelect...
     *         <span style="color: #553000">fooCB</span>.query().set...
     *         <span style="color: #553000">fooCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">fooLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    fooLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (VendorUuidBar vendorUuidBar : <span style="color: #553000">vendorUuidBarList</span>) {
     *     ... = vendorUuidBar.<span style="color: #CC4747">getVendorUuidFooList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setBarId_InScope(pkList);
     * cb.query().addOrderBy_BarId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfVendorUuidFoo> loadVendorUuidFoo(ConditionBeanSetupper<VendorUuidFooCB> refCBLambda) {
        myBhv().loadVendorUuidFoo(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerVendorUuidFoo = refLs);
        return hd -> hd.handle(new LoaderOfVendorUuidFoo().ready(_referrerVendorUuidFoo, _selector));
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
