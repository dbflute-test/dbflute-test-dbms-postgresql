package org.docksidestage.postgresql.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import org.docksidestage.postgresql.dbflute.exbhv.*;
import org.docksidestage.postgresql.dbflute.exentity.*;
import org.docksidestage.postgresql.dbflute.cbean.*;

/**
 * The referrer loader of vendor_large_data as TABLE. <br>
 * <pre>
 * [primary key]
 *     large_data_id
 *
 * [column]
 *     large_data_id, string_index, string_no_index, string_unique_index, intflg_index, numeric_integer_index, numeric_integer_no_index
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
 *     vendor_large_data_ref
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     vendorLargeDataRefList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfVendorLargeData {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<VendorLargeData> _selectedList;
    protected BehaviorSelector _selector;
    protected VendorLargeDataBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfVendorLargeData ready(List<VendorLargeData> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected VendorLargeDataBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(VendorLargeDataBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<VendorLargeDataRef> _referrerVendorLargeDataRefList;

    /**
     * Load referrer of vendorLargeDataRefList by the set-upper of referrer. <br>
     * vendor_large_data_ref by large_data_id, named 'vendorLargeDataRefList'.
     * <pre>
     * <span style="color: #0000C0">vendorLargeDataBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">vendorLargeDataList</span>, <span style="color: #553000">dataLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">dataLoader</span>.<span style="color: #CC4747">loadVendorLargeDataRefList</span>(<span style="color: #553000">refCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">refCB</span>.setupSelect...
     *         <span style="color: #553000">refCB</span>.query().set...
     *         <span style="color: #553000">refCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">refLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    refLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (VendorLargeData vendorLargeData : <span style="color: #553000">vendorLargeDataList</span>) {
     *     ... = vendorLargeData.<span style="color: #CC4747">getVendorLargeDataRefList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLargeDataId_InScope(pkList);
     * cb.query().addOrderBy_LargeDataId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfVendorLargeDataRef> loadVendorLargeDataRefList(ConditionBeanSetupper<VendorLargeDataRefCB> refCBLambda) {
        myBhv().loadVendorLargeDataRefList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerVendorLargeDataRefList = refLs);
        return hd -> hd.handle(new LoaderOfVendorLargeDataRef().ready(_referrerVendorLargeDataRefList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<VendorLargeData> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
