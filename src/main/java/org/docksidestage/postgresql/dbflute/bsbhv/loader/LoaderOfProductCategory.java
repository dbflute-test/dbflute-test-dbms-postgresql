package org.docksidestage.postgresql.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import org.docksidestage.postgresql.dbflute.exbhv.*;
import org.docksidestage.postgresql.dbflute.exentity.*;
import org.docksidestage.postgresql.dbflute.cbean.*;

/**
 * The referrer loader of (商品カテゴリ)product_category as TABLE. <br />
 * <pre>
 * [primary key]
 *     product_category_code
 *
 * [column]
 *     product_category_code, product_category_name, parent_category_code
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
 *     product_category
 *
 * [referrer table]
 *     product, product_category
 *
 * [foreign property]
 *     productCategorySelf
 *
 * [referrer property]
 *     productList, productCategorySelfList
 * </pre>
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
    protected List<Product> _referrerProductList;
    public NestedReferrerLoaderGateway<LoaderOfProduct> loadProductList(ConditionBeanSetupper<ProductCB> refCBLambda) {
        myBhv().loadProductList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerProductList = refLs);
        return hd -> hd.handle(new LoaderOfProduct().ready(_referrerProductList, _selector));
    }

    protected List<ProductCategory> _referrerProductCategorySelfList;
    public NestedReferrerLoaderGateway<LoaderOfProductCategory> loadProductCategorySelfList(ConditionBeanSetupper<ProductCategoryCB> refCBLambda) {
        myBhv().loadProductCategorySelfList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerProductCategorySelfList = refLs);
        return hd -> hd.handle(new LoaderOfProductCategory().ready(_referrerProductCategorySelfList, _selector));
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
