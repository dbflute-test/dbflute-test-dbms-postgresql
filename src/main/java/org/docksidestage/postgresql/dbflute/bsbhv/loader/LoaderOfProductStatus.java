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
