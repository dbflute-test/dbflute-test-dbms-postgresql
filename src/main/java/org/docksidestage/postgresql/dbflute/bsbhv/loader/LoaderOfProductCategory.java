package org.docksidestage.postgresql.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import org.docksidestage.postgresql.dbflute.exbhv.*;
import org.docksidestage.postgresql.dbflute.exentity.*;
import org.docksidestage.postgresql.dbflute.cbean.*;

/**
 * The referrer loader of (商品カテゴリ)product_category as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfProductCategory {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<ProductCategory> _selectedList;
    protected BehaviorSelector _selector;
    protected ProductCategoryBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfProductCategory ready(List<ProductCategory> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ProductCategoryBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ProductCategoryBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<Product> _referrerProduct;

    /**
     * Load referrer of productList by the set-upper of referrer. <br>
     * (商品)product by product_category_code, named 'productList'.
     * <pre>
     * <span style="color: #0000C0">productCategoryBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">productCategoryList</span>, <span style="color: #553000">categoryLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">categoryLoader</span>.<span style="color: #CC4747">loadProduct</span>(<span style="color: #553000">productCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">productCB</span>.setupSelect...
     *         <span style="color: #553000">productCB</span>.query().set...
     *         <span style="color: #553000">productCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">productLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    productLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (ProductCategory productCategory : <span style="color: #553000">productCategoryList</span>) {
     *     ... = productCategory.<span style="color: #CC4747">getProductList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductCategoryCode_InScope(pkList);
     * cb.query().addOrderBy_ProductCategoryCode_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfProduct> loadProduct(ConditionBeanSetupper<ProductCB> refCBLambda) {
        myBhv().loadProduct(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerProduct = refLs);
        return hd -> hd.handle(new LoaderOfProduct().ready(_referrerProduct, _selector));
    }

    protected List<ProductCategory> _referrerProductCategorySelf;

    /**
     * Load referrer of productCategorySelfList by the set-upper of referrer. <br>
     * (商品カテゴリ)product_category by parent_category_code, named 'productCategorySelfList'.
     * <pre>
     * <span style="color: #0000C0">productCategoryBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">productCategoryList</span>, <span style="color: #553000">categoryLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">categoryLoader</span>.<span style="color: #CC4747">loadProductCategorySelf</span>(<span style="color: #553000">categoryCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">categoryCB</span>.setupSelect...
     *         <span style="color: #553000">categoryCB</span>.query().set...
     *         <span style="color: #553000">categoryCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">categoryLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    categoryLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (ProductCategory productCategory : <span style="color: #553000">productCategoryList</span>) {
     *     ... = productCategory.<span style="color: #CC4747">getProductCategorySelfList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setParentCategoryCode_InScope(pkList);
     * cb.query().addOrderBy_ParentCategoryCode_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfProductCategory> loadProductCategorySelf(ConditionBeanSetupper<ProductCategoryCB> refCBLambda) {
        myBhv().loadProductCategorySelf(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerProductCategorySelf = refLs);
        return hd -> hd.handle(new LoaderOfProductCategory().ready(_referrerProductCategorySelf, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfProductCategory _foreignProductCategorySelfLoader;
    public LoaderOfProductCategory pulloutProductCategorySelf() {
        if (_foreignProductCategorySelfLoader == null)
        { _foreignProductCategorySelfLoader = new LoaderOfProductCategory().ready(myBhv().pulloutProductCategorySelf(_selectedList), _selector); }
        return _foreignProductCategorySelfLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<ProductCategory> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
