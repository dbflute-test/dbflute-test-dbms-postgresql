package org.docksidestage.postgresql.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import org.docksidestage.postgresql.dbflute.exbhv.*;
import org.docksidestage.postgresql.dbflute.exentity.*;
import org.docksidestage.postgresql.dbflute.cbean.*;

/**
 * The referrer loader of next_schema_product as TABLE. <br />
 * <pre>
 * [primary key]
 *     product_id
 *
 * [column]
 *     product_id, product_name
 *
 * [sequence]
 *     nextschema.next_schema_product_product_id_seq
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
 *     white_same_name
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteSameNameList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfNextSchemaProduct {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<NextSchemaProduct> _selectedList;
    protected BehaviorSelector _selector;
    protected NextSchemaProductBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfNextSchemaProduct ready(List<NextSchemaProduct> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected NextSchemaProductBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(NextSchemaProductBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhiteSameName> _referrerWhiteSameNameList;
    public NestedReferrerLoaderGateway<LoaderOfWhiteSameName> loadWhiteSameNameList(ConditionBeanSetupper<WhiteSameNameCB> refCBLambda) {
        myBhv().loadWhiteSameNameList(_selectedList, refCBLambda).withNestedReferrer(new ReferrerListHandler<WhiteSameName>() {
            public void handle(List<WhiteSameName> referrerList) { _referrerWhiteSameNameList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfWhiteSameName>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfWhiteSameName> handler) {
                handler.handle(new LoaderOfWhiteSameName().ready(_referrerWhiteSameNameList, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<NextSchemaProduct> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
