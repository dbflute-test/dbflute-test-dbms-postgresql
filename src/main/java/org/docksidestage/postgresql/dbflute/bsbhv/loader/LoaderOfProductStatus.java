package org.docksidestage.postgresql.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import org.docksidestage.postgresql.dbflute.exbhv.*;
import org.docksidestage.postgresql.dbflute.exentity.*;
import org.docksidestage.postgresql.dbflute.cbean.*;

/**
 * The referrer loader of (商品ステータス)product_status as TABLE. <br />
 * <pre>
 * [primary key]
 *     product_status_code
 *
 * [column]
 *     product_status_code, product_status_name, display_order
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
 *     product
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     productList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfProductStatus {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<ProductStatus> _selectedList;
    protected BehaviorSelector _selector;
    protected ProductStatusBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfProductStatus ready(List<ProductStatus> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ProductStatusBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ProductStatusBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<Product> _referrerProductList;

    /**
     * Load referrer of productList by the set-upper of referrer. <br />
     * (商品)product by product_status_code, named 'productList'.
     * <pre>
     * <span style="color: #0000C0">productStatusBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">productStatusList</span>, <span style="color: #553000">statusLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">statusLoader</span>.<span style="color: #CC4747">loadProductList</span>(<span style="color: #553000">productCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">productCB</span>.setupSelect...
     *         <span style="color: #553000">productCB</span>.query().set...
     *         <span style="color: #553000">productCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">productLoader</span> -&gt {</span>
     *     <span style="color: #3F7E5E">//    productLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (ProductStatus productStatus : <span style="color: #553000">productStatusList</span>) {
     *     ... = productStatus.<span style="color: #CC4747">getProductList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductStatusCode_InScope(pkList);
     * cb.query().addOrderBy_ProductStatusCode_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfProduct> loadProductList(ConditionBeanSetupper<ProductCB> refCBLambda) {
        myBhv().loadProductList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerProductList = refLs);
        return hd -> hd.handle(new LoaderOfProduct().ready(_referrerProductList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<ProductStatus> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
