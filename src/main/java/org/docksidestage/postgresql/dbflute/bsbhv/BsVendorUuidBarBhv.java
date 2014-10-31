package org.docksidestage.postgresql.dbflute.bsbhv;

import java.util.List;

import org.dbflute.*;
import org.dbflute.bhv.*;
import org.dbflute.bhv.readable.*;
import org.dbflute.bhv.writable.*;
import org.dbflute.bhv.referrer.*;
import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.HpSLSFunction;
import org.dbflute.cbean.result.*;
import org.dbflute.exception.*;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.outsidesql.executor.*;
import org.docksidestage.postgresql.dbflute.exbhv.*;
import org.docksidestage.postgresql.dbflute.bsbhv.loader.*;
import org.docksidestage.postgresql.dbflute.exentity.*;
import org.docksidestage.postgresql.dbflute.bsentity.dbmeta.*;
import org.docksidestage.postgresql.dbflute.cbean.*;

/**
 * The behavior of vendor_uuid_bar as TABLE. <br>
 * <pre>
 * [primary key]
 *     bar_id
 *
 * [column]
 *     bar_id, bar_name
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
 *     vendor_uuid_foo
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     vendorUuidFooList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendorUuidBarBhv extends AbstractBehaviorWritable<VendorUuidBar, VendorUuidBarCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public VendorUuidBarDbm getDBMeta() { return VendorUuidBarDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public VendorUuidBarCB newConditionBean() { return new VendorUuidBarCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">vendorUuidBarBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of VendorUuidBar. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<VendorUuidBarCB> cbLambda) {
        return facadeSelectCount(createCB(cbLambda));
    }

    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * VendorUuidBarCB cb = <span style="color: #70226C">new</span> VendorUuidBarCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">vendorUuidBarBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of VendorUuidBar. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(VendorUuidBarCB cb) {
        return facadeSelectCount(cb);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean. #beforejava8 <br>
     * <span style="color: #AD4747; font-size: 120%">The return might be null if no data, so you should have null check.</span> <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, use selectEntityWithDeletedCheck().</span>
     * <pre>
     * VendorUuidBar vendorUuidBar = <span style="color: #0000C0">vendorUuidBarBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * <span style="color: #70226C">if</span> (vendorUuidBar != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = vendorUuidBar.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of VendorUuidBar. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorUuidBar selectEntity(CBCall<VendorUuidBarCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean. #beforejava8 <br>
     * <span style="color: #AD4747; font-size: 120%">The return might be null if no data, so you should have null check.</span> <br>
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, use selectEntityWithDeletedCheck().</span>
     * <pre>
     * VendorUuidBarCB cb = <span style="color: #70226C">new</span> VendorUuidBarCB();
     * cb.query().setFoo...(value);
     * VendorUuidBar vendorUuidBar = <span style="color: #0000C0">vendorUuidBarBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (vendorUuidBar != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = vendorUuidBar.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of VendorUuidBar. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorUuidBar selectEntity(VendorUuidBarCB cb) {
        return facadeSelectEntity(cb);
    }

    protected VendorUuidBar facadeSelectEntity(VendorUuidBarCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorUuidBar> OptionalEntity<ENTITY> doSelectOptionalEntity(VendorUuidBarCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * VendorUuidBar <span style="color: #553000">vendorUuidBar</span> = <span style="color: #0000C0">vendorUuidBarBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">vendorUuidBar</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of VendorUuidBar. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorUuidBar selectEntityWithDeletedCheck(CBCall<VendorUuidBarCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * VendorUuidBarCB cb = <span style="color: #70226C">new</span> VendorUuidBarCB();
     * cb.query().set...;
     * VendorUuidBar vendorUuidBar = <span style="color: #0000C0">vendorUuidBarBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = vendorUuidBar.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of VendorUuidBar. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorUuidBar selectEntityWithDeletedCheck(VendorUuidBarCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param barId : PK, NotNull, uuid(2147483647). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorUuidBar selectByPK(java.util.UUID barId) {
        return facadeSelectByPK(barId);
    }

    protected VendorUuidBar facadeSelectByPK(java.util.UUID barId) {
        return doSelectByPK(barId, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorUuidBar> ENTITY doSelectByPK(java.util.UUID barId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(barId), tp);
    }

    protected <ENTITY extends VendorUuidBar> OptionalEntity<ENTITY> doSelectOptionalByPK(java.util.UUID barId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(barId, tp), barId);
    }

    protected VendorUuidBarCB xprepareCBAsPK(java.util.UUID barId) {
        assertObjectNotNull("barId", barId);
        return newConditionBean().acceptPK(barId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;VendorUuidBar&gt; <span style="color: #553000">vendorUuidBarList</span> = <span style="color: #0000C0">vendorUuidBarBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * <span style="color: #70226C">for</span> (VendorUuidBar <span style="color: #553000">vendorUuidBar</span> : <span style="color: #553000">vendorUuidBarList</span>) {
     *     ... = <span style="color: #553000">vendorUuidBar</span>.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of VendorUuidBar. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<VendorUuidBar> selectList(CBCall<VendorUuidBarCB> cbLambda) {
        return facadeSelectList(createCB(cbLambda));
    }

    /**
     * Select the list as result bean.
     * <pre>
     * VendorUuidBarCB cb = <span style="color: #70226C">new</span> VendorUuidBarCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;VendorUuidBar&gt; <span style="color: #553000">vendorUuidBarList</span> = <span style="color: #0000C0">vendorUuidBarBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (VendorUuidBar vendorUuidBar : <span style="color: #553000">vendorUuidBarList</span>) {
     *     ... = vendorUuidBar.get...;
     * }
     * </pre>
     * @param cb The condition-bean of VendorUuidBar. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<VendorUuidBar> selectList(VendorUuidBarCB cb) {
        return facadeSelectList(cb);
    }

    @Override
    protected boolean isEntityDerivedMappable() { return true; }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * PagingResultBean&lt;VendorUuidBar&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">vendorUuidBarBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (VendorUuidBar vendorUuidBar : <span style="color: #553000">page</span>) {
     *     ... = vendorUuidBar.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of VendorUuidBar. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<VendorUuidBar> selectPage(CBCall<VendorUuidBarCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * VendorUuidBarCB cb = <span style="color: #70226C">new</span> VendorUuidBarCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;VendorUuidBar&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">vendorUuidBarBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (VendorUuidBar vendorUuidBar : <span style="color: #553000">page</span>) {
     *     ... = vendorUuidBar.get...();
     * }
     * </pre>
     * @param cb The condition-bean of VendorUuidBar. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<VendorUuidBar> selectPage(VendorUuidBarCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">vendorUuidBarBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of VendorUuidBar. (NotNull)
     * @param entityLambda The handler of entity row of VendorUuidBar. (NotNull)
     */
    public void selectCursor(CBCall<VendorUuidBarCB> cbLambda, EntityRowHandler<VendorUuidBar> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * VendorUuidBarCB cb = <span style="color: #70226C">new</span> VendorUuidBarCB();
     * cb.query().set...
     * <span style="color: #0000C0">vendorUuidBarBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of VendorUuidBar. (NotNull)
     * @param entityRowHandler The handler of entity row of VendorUuidBar. (NotNull)
     */
    public void selectCursor(VendorUuidBarCB cb, EntityRowHandler<VendorUuidBar> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">vendorUuidBarBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<VendorUuidBarCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    // ===================================================================================
    //                                                                            Sequence
    //                                                                            ========
    @Override
    protected Number doReadNextVal() {
        String msg = "This table is NOT related to sequence: " + getTableDbName();
        throw new UnsupportedOperationException(msg);
    }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    /**
     * Load referrer for the list by the the referrer loader.
     * <pre>
     * List&lt;Member&gt; <span style="color: #553000">memberList</span> = <span style="color: #0000C0">memberBhv</span>.selectList(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * memberBhv.<span style="color: #CC4747">load</span>(<span style="color: #553000">memberList</span>, <span style="color: #553000">memberLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberLoader</span>.<span style="color: #CC4747">loadPurchase</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">purchaseCB</span>.setupSelect...
     *         <span style="color: #553000">purchaseCB</span>.query().set...
     *         <span style="color: #553000">purchaseCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(purchaseLoader -&gt; {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePayment(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//memberLoader.pulloutMemberStatus().loadMemberLogin(...)</span>
     * });
     * <span style="color: #70226C">for</span> (Member member : <span style="color: #553000">memberList</span>) {
     *     List&lt;Purchase&gt; purchaseList = member.<span style="color: #CC4747">getPurchaseList()</span>;
     *     <span style="color: #70226C">for</span> (Purchase purchase : purchaseList) {
     *         ...
     *     }
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param vendorUuidBarList The entity list of vendorUuidBar. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<VendorUuidBar> vendorUuidBarList, ReferrerLoaderHandler<LoaderOfVendorUuidBar> loaderLambda) {
        xassLRArg(vendorUuidBarList, loaderLambda);
        loaderLambda.handle(new LoaderOfVendorUuidBar().ready(vendorUuidBarList, _behaviorSelector));
    }

    /**
     * Load referrer for the entity by the referrer loader.
     * <pre>
     * Member <span style="color: #553000">member</span> = <span style="color: #0000C0">memberBhv</span>.selectEntityWithDeletedCheck(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> <span style="color: #553000">cb</span>.acceptPK(1));
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">load</span>(<span style="color: #553000">member</span>, <span style="color: #553000">memberLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberLoader</span>.<span style="color: #CC4747">loadPurchase</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">purchaseCB</span>.setupSelect...
     *         <span style="color: #553000">purchaseCB</span>.query().set...
     *         <span style="color: #553000">purchaseCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(purchaseLoader -&gt; {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePayment(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//memberLoader.pulloutMemberStatus().loadMemberLogin(...)</span>
     * });
     * List&lt;Purchase&gt; purchaseList = <span style="color: #553000">member</span>.<span style="color: #CC4747">getPurchaseList()</span>;
     * <span style="color: #70226C">for</span> (Purchase purchase : purchaseList) {
     *     ...
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param vendorUuidBar The entity of vendorUuidBar. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(VendorUuidBar vendorUuidBar, ReferrerLoaderHandler<LoaderOfVendorUuidBar> loaderLambda) {
        xassLRArg(vendorUuidBar, loaderLambda);
        loaderLambda.handle(new LoaderOfVendorUuidBar().ready(xnewLRAryLs(vendorUuidBar), _behaviorSelector));
    }

    /**
     * Load referrer of vendorUuidFooList by the set-upper of referrer. <br>
     * vendor_uuid_foo by bar_id, named 'vendorUuidFooList'.
     * <pre>
     * <span style="color: #0000C0">vendorUuidBarBhv</span>.<span style="color: #CC4747">loadVendorUuidFooList</span>(<span style="color: #553000">vendorUuidBarList</span>, <span style="color: #553000">fooCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">fooCB</span>.setupSelect...
     *     <span style="color: #553000">fooCB</span>.query().set...
     *     <span style="color: #553000">fooCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (VendorUuidBar vendorUuidBar : <span style="color: #553000">vendorUuidBarList</span>) {
     *     ... = vendorUuidBar.<span style="color: #CC4747">getVendorUuidFooList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setBarId_InScope(pkList);
     * cb.query().addOrderBy_BarId_Asc();
     * </pre>
     * @param vendorUuidBarList The entity list of vendorUuidBar. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<VendorUuidFoo> loadVendorUuidFooList(List<VendorUuidBar> vendorUuidBarList, ConditionBeanSetupper<VendorUuidFooCB> refCBLambda) {
        xassLRArg(vendorUuidBarList, refCBLambda);
        return doLoadVendorUuidFooList(vendorUuidBarList, new LoadReferrerOption<VendorUuidFooCB, VendorUuidFoo>().xinit(refCBLambda));
    }

    /**
     * Load referrer of vendorUuidFooList by the set-upper of referrer. <br>
     * vendor_uuid_foo by bar_id, named 'vendorUuidFooList'.
     * <pre>
     * <span style="color: #0000C0">vendorUuidBarBhv</span>.<span style="color: #CC4747">loadVendorUuidFooList</span>(<span style="color: #553000">vendorUuidBar</span>, <span style="color: #553000">fooCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">fooCB</span>.setupSelect...
     *     <span style="color: #553000">fooCB</span>.query().set...
     *     <span style="color: #553000">fooCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">vendorUuidBar</span>.<span style="color: #CC4747">getVendorUuidFooList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setBarId_InScope(pkList);
     * cb.query().addOrderBy_BarId_Asc();
     * </pre>
     * @param vendorUuidBar The entity of vendorUuidBar. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<VendorUuidFoo> loadVendorUuidFooList(VendorUuidBar vendorUuidBar, ConditionBeanSetupper<VendorUuidFooCB> refCBLambda) {
        xassLRArg(vendorUuidBar, refCBLambda);
        return doLoadVendorUuidFooList(xnewLRLs(vendorUuidBar), new LoadReferrerOption<VendorUuidFooCB, VendorUuidFoo>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param vendorUuidBar The entity of vendorUuidBar. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<VendorUuidFoo> loadVendorUuidFooList(VendorUuidBar vendorUuidBar, LoadReferrerOption<VendorUuidFooCB, VendorUuidFoo> loadReferrerOption) {
        xassLRArg(vendorUuidBar, loadReferrerOption);
        return loadVendorUuidFooList(xnewLRLs(vendorUuidBar), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param vendorUuidBarList The entity list of vendorUuidBar. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<VendorUuidFoo> loadVendorUuidFooList(List<VendorUuidBar> vendorUuidBarList, LoadReferrerOption<VendorUuidFooCB, VendorUuidFoo> loadReferrerOption) {
        xassLRArg(vendorUuidBarList, loadReferrerOption);
        if (vendorUuidBarList.isEmpty()) { return (NestedReferrerListGateway<VendorUuidFoo>)EMPTY_NREF_LGWAY; }
        return doLoadVendorUuidFooList(vendorUuidBarList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<VendorUuidFoo> doLoadVendorUuidFooList(List<VendorUuidBar> vendorUuidBarList, LoadReferrerOption<VendorUuidFooCB, VendorUuidFoo> option) {
        return helpLoadReferrerInternally(vendorUuidBarList, option, "vendorUuidFooList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key barId.
     * @param vendorUuidBarList The list of vendorUuidBar. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<java.util.UUID> extractBarIdList(List<VendorUuidBar> vendorUuidBarList)
    { return helpExtractListInternally(vendorUuidBarList, "barId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * VendorUuidBar vendorUuidBar = <span style="color: #70226C">new</span> VendorUuidBar();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorUuidBar.setFoo...(value);
     * vendorUuidBar.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorUuidBar.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorUuidBar.set...;</span>
     * <span style="color: #0000C0">vendorUuidBarBhv</span>.<span style="color: #CC4747">insert</span>(vendorUuidBar);
     * ... = vendorUuidBar.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param vendorUuidBar The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(VendorUuidBar vendorUuidBar) {
        doInsert(vendorUuidBar, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * VendorUuidBar vendorUuidBar = <span style="color: #70226C">new</span> VendorUuidBar();
     * vendorUuidBar.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorUuidBar.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorUuidBar.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorUuidBar.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorUuidBar.<span style="color: #CC4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #0000C0">vendorUuidBarBhv</span>.<span style="color: #CC4747">update</span>(vendorUuidBar);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorUuidBar The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(VendorUuidBar vendorUuidBar) {
        doUpdate(vendorUuidBar, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #CC4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param vendorUuidBar The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(VendorUuidBar vendorUuidBar) {
        doInsertOrUpdate(vendorUuidBar, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * VendorUuidBar vendorUuidBar = <span style="color: #70226C">new</span> VendorUuidBar();
     * vendorUuidBar.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorUuidBar.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">vendorUuidBarBhv</span>.<span style="color: #CC4747">delete</span>(vendorUuidBar);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorUuidBar The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(VendorUuidBar vendorUuidBar) {
        doDelete(vendorUuidBar, null);
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch-insert the entity list modified-only of same-set columns. (DefaultConstraintsEnabled) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <p><span style="color: #CC4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     VendorUuidBar vendorUuidBar = <span style="color: #70226C">new</span> VendorUuidBar();
     *     vendorUuidBar.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         vendorUuidBar.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     vendorUuidBarList.add(vendorUuidBar);
     * }
     * <span style="color: #0000C0">vendorUuidBarBhv</span>.<span style="color: #CC4747">batchInsert</span>(vendorUuidBarList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param vendorUuidBarList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<VendorUuidBar> vendorUuidBarList) {
        return doBatchInsert(vendorUuidBarList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     VendorUuidBar vendorUuidBar = <span style="color: #70226C">new</span> VendorUuidBar();
     *     vendorUuidBar.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         vendorUuidBar.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         vendorUuidBar.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//vendorUuidBar.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     vendorUuidBarList.add(vendorUuidBar);
     * }
     * <span style="color: #0000C0">vendorUuidBarBhv</span>.<span style="color: #CC4747">batchUpdate</span>(vendorUuidBarList);
     * </pre>
     * @param vendorUuidBarList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<VendorUuidBar> vendorUuidBarList) {
        return doBatchUpdate(vendorUuidBarList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param vendorUuidBarList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<VendorUuidBar> vendorUuidBarList) {
        return doBatchDelete(vendorUuidBarList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">vendorUuidBarBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;VendorUuidBar, VendorUuidBarCB&gt;() {
     *     public ConditionBean setup(VendorUuidBar entity, VendorUuidBarCB intoCB) {
     *         FooCB cb = FooCB();
     *         cb.setupSelect_Bar();
     *
     *         <span style="color: #3F7E5E">// mapping</span>
     *         intoCB.specify().columnMyName().mappedFrom(cb.specify().columnFooName());
     *         intoCB.specify().columnMyCount().mappedFrom(cb.specify().columnFooCount());
     *         intoCB.specify().columnMyDate().mappedFrom(cb.specify().specifyBar().columnBarDate());
     *         entity.setMyFixedValue("foo"); <span style="color: #3F7E5E">// fixed value</span>
     *         <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     *         <span style="color: #3F7E5E">//entity.setRegisterUser(value);</span>
     *         <span style="color: #3F7E5E">//entity.set...;</span>
     *         <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     *         <span style="color: #3F7E5E">//entity.setVersionNo(value);</span>
     *
     *         return cb;
     *     }
     * });
     * </pre>
     * @param manyArgLambda The callback to set up query-insert. (NotNull)
     * @return The inserted count.
     */
    public int queryInsert(QueryInsertSetupper<VendorUuidBar, VendorUuidBarCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * VendorUuidBar vendorUuidBar = <span style="color: #70226C">new</span> VendorUuidBar();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorUuidBar.setPK...(value);</span>
     * vendorUuidBar.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorUuidBar.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorUuidBar.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorUuidBar.setVersionNo(value);</span>
     * VendorUuidBarCB cb = <span style="color: #70226C">new</span> VendorUuidBarCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">vendorUuidBarBhv</span>.<span style="color: #CC4747">queryUpdate</span>(vendorUuidBar, cb);
     * </pre>
     * @param vendorUuidBar The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of VendorUuidBar. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(VendorUuidBar vendorUuidBar, CBCall<VendorUuidBarCB> cbLambda) {
        return doQueryUpdate(vendorUuidBar, createCB(cbLambda), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * VendorUuidBar vendorUuidBar = <span style="color: #70226C">new</span> VendorUuidBar();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorUuidBar.setPK...(value);</span>
     * vendorUuidBar.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorUuidBar.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorUuidBar.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorUuidBar.setVersionNo(value);</span>
     * VendorUuidBarCB cb = <span style="color: #70226C">new</span> VendorUuidBarCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">vendorUuidBarBhv</span>.<span style="color: #CC4747">queryUpdate</span>(vendorUuidBar, cb);
     * </pre>
     * @param vendorUuidBar The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of VendorUuidBar. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(VendorUuidBar vendorUuidBar, VendorUuidBarCB cb) {
        return doQueryUpdate(vendorUuidBar, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * VendorUuidBarCB cb = new VendorUuidBarCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">vendorUuidBarBhv</span>.<span style="color: #CC4747">queryDelete</span>(vendorUuidBar, cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of VendorUuidBar. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<VendorUuidBarCB> cbLambda) {
        return doQueryDelete(createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * VendorUuidBarCB cb = new VendorUuidBarCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">vendorUuidBarBhv</span>.<span style="color: #CC4747">queryDelete</span>(vendorUuidBar, cb);
     * </pre>
     * @param cb The condition-bean of VendorUuidBar. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(VendorUuidBarCB cb) {
        return doQueryDelete(cb, null);
    }

    // ===================================================================================
    //                                                                      Varying Update
    //                                                                      ==============
    // -----------------------------------------------------
    //                                         Entity Update
    //                                         -------------
    /**
     * Insert the entity with varying requests. <br>
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br>
     * Other specifications are same as insert(entity).
     * <pre>
     * VendorUuidBar vendorUuidBar = <span style="color: #70226C">new</span> VendorUuidBar();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorUuidBar.setFoo...(value);
     * vendorUuidBar.setBar...(value);
     * InsertOption&lt;VendorUuidBarCB&gt; option = new InsertOption&lt;VendorUuidBarCB&gt;();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * <span style="color: #0000C0">vendorUuidBarBhv</span>.<span style="color: #CC4747">varyingInsert</span>(vendorUuidBar, option);
     * ... = vendorUuidBar.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param vendorUuidBar The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(VendorUuidBar vendorUuidBar, WritableOptionCall<VendorUuidBarCB, InsertOption<VendorUuidBarCB>> opLambda) {
        doInsert(vendorUuidBar, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * VendorUuidBar vendorUuidBar = <span style="color: #70226C">new</span> VendorUuidBar();
     * vendorUuidBar.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorUuidBar.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorUuidBar.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;VendorUuidBarCB&gt; option = new UpdateOption&lt;VendorUuidBarCB&gt;();
     *     option.self(new SpecifyQuery&lt;VendorUuidBarCB&gt;() {
     *         public void specify(VendorUuidBarCB cb) {
     *             cb.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     <span style="color: #0000C0">vendorUuidBarBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(vendorUuidBar, option);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorUuidBar The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(VendorUuidBar vendorUuidBar, WritableOptionCall<VendorUuidBarCB, UpdateOption<VendorUuidBarCB>> opLambda) {
        doUpdate(vendorUuidBar, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param vendorUuidBar The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(VendorUuidBar vendorUuidBar, WritableOptionCall<VendorUuidBarCB, InsertOption<VendorUuidBarCB>> insertOpLambda, WritableOptionCall<VendorUuidBarCB, UpdateOption<VendorUuidBarCB>> updateOpLambda) {
        doInsertOrUpdate(vendorUuidBar, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param vendorUuidBar The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(VendorUuidBar vendorUuidBar, WritableOptionCall<VendorUuidBarCB, DeleteOption<VendorUuidBarCB>> opLambda) {
        doDelete(vendorUuidBar, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param vendorUuidBarList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<VendorUuidBar> vendorUuidBarList, WritableOptionCall<VendorUuidBarCB, InsertOption<VendorUuidBarCB>> opLambda) {
        return doBatchInsert(vendorUuidBarList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param vendorUuidBarList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<VendorUuidBar> vendorUuidBarList, WritableOptionCall<VendorUuidBarCB, UpdateOption<VendorUuidBarCB>> opLambda) {
        return doBatchUpdate(vendorUuidBarList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param vendorUuidBarList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<VendorUuidBar> vendorUuidBarList, WritableOptionCall<VendorUuidBarCB, DeleteOption<VendorUuidBarCB>> opLambda) {
        return doBatchDelete(vendorUuidBarList, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Query Update
    //                                          ------------
    /**
     * Insert the several entities by query with varying requests (modified-only for fixed value). <br>
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br>
     * Other specifications are same as queryInsert(entity, setupper).
     * @param manyArgLambda The set-upper of query-insert. (NotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The inserted count.
     */
    public int varyingQueryInsert(QueryInsertSetupper<VendorUuidBar, VendorUuidBarCB> manyArgLambda, WritableOptionCall<VendorUuidBarCB, InsertOption<VendorUuidBarCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * VendorUuidBar vendorUuidBar = <span style="color: #70226C">new</span> VendorUuidBar();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorUuidBar.setPK...(value);</span>
     * vendorUuidBar.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorUuidBar.setVersionNo(value);</span>
     * VendorUuidBarCB cb = new VendorUuidBarCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;VendorUuidBarCB&gt; option = <span style="color: #70226C">new</span> UpdateOption&lt;VendorUuidBarCB&gt;();
     * option.self(new SpecifyQuery&lt;VendorUuidBarCB&gt;() {
     *     public void specify(VendorUuidBarCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * <span style="color: #0000C0">vendorUuidBarBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(vendorUuidBar, cb, option);
     * </pre>
     * @param vendorUuidBar The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of VendorUuidBar. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(VendorUuidBar vendorUuidBar, CBCall<VendorUuidBarCB> cbLambda, WritableOptionCall<VendorUuidBarCB, UpdateOption<VendorUuidBarCB>> opLambda) {
        return doQueryUpdate(vendorUuidBar, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * VendorUuidBar vendorUuidBar = <span style="color: #70226C">new</span> VendorUuidBar();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorUuidBar.setPK...(value);</span>
     * vendorUuidBar.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorUuidBar.setVersionNo(value);</span>
     * VendorUuidBarCB cb = <span style="color: #70226C">new</span> VendorUuidBarCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;VendorUuidBarCB&gt; option = <span style="color: #70226C">new</span> UpdateOption&lt;VendorUuidBarCB&gt;();
     * option.self(new SpecifyQuery&lt;VendorUuidBarCB&gt;() {
     *     public void specify(VendorUuidBarCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * <span style="color: #0000C0">vendorUuidBarBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(vendorUuidBar, cb, option);
     * </pre>
     * @param vendorUuidBar The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of VendorUuidBar. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(VendorUuidBar vendorUuidBar, VendorUuidBarCB cb, WritableOptionCall<VendorUuidBarCB, UpdateOption<VendorUuidBarCB>> opLambda) {
        return doQueryUpdate(vendorUuidBar, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cbLambda The callback for condition-bean of VendorUuidBar. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<VendorUuidBarCB> cbLambda, WritableOptionCall<VendorUuidBarCB, DeleteOption<VendorUuidBarCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of VendorUuidBar. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(VendorUuidBarCB cb, WritableOptionCall<VendorUuidBarCB, DeleteOption<VendorUuidBarCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span> 
     * vendorUuidBarBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span> 
     * vendorUuidBarBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * vendorUuidBarBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * vendorUuidBarBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * vendorUuidBarBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * vendorUuidBarBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * vendorUuidBarBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span> 
     * vendorUuidBarBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * vendorUuidBarBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * vendorUuidBarBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * vendorUuidBarBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * vendorUuidBarBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * vendorUuidBarBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span> 
     * vendorUuidBarBhv.outideSql().removeBlockComment().selectList()
     * vendorUuidBarBhv.outideSql().removeLineComment().selectList()
     * vendorUuidBarBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<VendorUuidBarBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<VendorUuidBarBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor(); // variable to resolve generic type
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends VendorUuidBar> typeOfSelectedEntity() { return VendorUuidBar.class; }
    protected Class<VendorUuidBar> typeOfHandlingEntity() { return VendorUuidBar.class; }
    protected Class<VendorUuidBarCB> typeOfHandlingConditionBean() { return VendorUuidBarCB.class; }
}
