package org.docksidestage.postgresql.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import org.docksidestage.postgresql.dbflute.exbhv.*;
import org.docksidestage.postgresql.dbflute.exentity.*;
import org.docksidestage.postgresql.dbflute.cbean.*;

/**
 * The referrer loader of vendor_date_pk as TABLE. <br>
 * <pre>
 * [primary key]
 *     foo_date
 *
 * [column]
 *     foo_date, foo_name
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
 *     vendor_date_fk
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     vendorDateFkList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfVendorDatePk {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<VendorDatePk> _selectedList;
    protected BehaviorSelector _selector;
    protected VendorDatePkBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfVendorDatePk ready(List<VendorDatePk> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected VendorDatePkBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(VendorDatePkBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<VendorDateFk> _referrerVendorDateFk;

    /**
     * Load referrer of vendorDateFkList by the set-upper of referrer. <br>
     * vendor_date_fk by bar_date, named 'vendorDateFkList'.
     * <pre>
     * <span style="color: #0000C0">vendorDatePkBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">vendorDatePkList</span>, <span style="color: #553000">pkLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">pkLoader</span>.<span style="color: #CC4747">loadVendorDateFk</span>(<span style="color: #553000">fkCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">fkCB</span>.setupSelect...
     *         <span style="color: #553000">fkCB</span>.query().set...
     *         <span style="color: #553000">fkCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">fkLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    fkLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (VendorDatePk vendorDatePk : <span style="color: #553000">vendorDatePkList</span>) {
     *     ... = vendorDatePk.<span style="color: #CC4747">getVendorDateFkList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setBarDate_InScope(pkList);
     * cb.query().addOrderBy_BarDate_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfVendorDateFk> loadVendorDateFk(ConditionBeanSetupper<VendorDateFkCB> refCBLambda) {
        myBhv().loadVendorDateFk(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerVendorDateFk = refLs);
        return hd -> hd.handle(new LoaderOfVendorDateFk().ready(_referrerVendorDateFk, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<VendorDatePk> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
