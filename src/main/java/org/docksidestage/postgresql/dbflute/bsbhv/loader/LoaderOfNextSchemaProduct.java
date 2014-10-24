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

    /**
     * Load referrer of whiteSameNameList by the set-upper of referrer. <br />
     * white_same_name by next_schema_product_id, named 'whiteSameNameList'.
     * <pre>
     * <span style="color: #0000C0">nextSchemaProductBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">nextSchemaProductList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadWhiteSameNameList</span>(<span style="color: #553000">nameCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">nameCB</span>.setupSelect...
     *         <span style="color: #553000">nameCB</span>.query().set...
     *         <span style="color: #553000">nameCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">nameLoader</span> -&gt {</span>
     *     <span style="color: #3F7E5E">//    nameLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (NextSchemaProduct nextSchemaProduct : <span style="color: #553000">nextSchemaProductList</span>) {
     *     ... = nextSchemaProduct.<span style="color: #CC4747">getWhiteSameNameList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setNextSchemaProductId_InScope(pkList);
     * cb.query().addOrderBy_NextSchemaProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWhiteSameName> loadWhiteSameNameList(ConditionBeanSetupper<WhiteSameNameCB> refCBLambda) {
        myBhv().loadWhiteSameNameList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWhiteSameNameList = refLs);
        return hd -> hd.handle(new LoaderOfWhiteSameName().ready(_referrerWhiteSameNameList, _selector));
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
