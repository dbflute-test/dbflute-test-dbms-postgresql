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
 * The behavior of (購入)purchase as TABLE. <br>
 * <pre>
 * [primary key]
 *     purchase_id
 *
 * [column]
 *     purchase_id, member_id, product_id, purchase_datetime, purchase_count, purchase_price, payment_complete_flg, register_datetime, register_user, register_process, update_datetime, update_user, update_process, version_no
 *
 * [sequence]
 *     SEQ_PURCHASE
 *
 * [identity]
 *     
 *
 * [version-no]
 *     version_no
 *
 * [foreign table]
 *     member, product
 *
 * [referrer table]
 *     purchase_payment
 *
 * [foreign property]
 *     member, product
 *
 * [referrer property]
 *     purchasePaymentList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsPurchaseBhv extends AbstractBehaviorWritable<Purchase, PurchaseCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public PurchaseDbm getDBMeta() { return PurchaseDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public PurchaseCB newConditionBean() { return new PurchaseCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">purchaseBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of Purchase. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<PurchaseCB> cbLambda) {
        return facadeSelectCount(createCB(cbLambda));
    }

    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * PurchaseCB cb = <span style="color: #70226C">new</span> PurchaseCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">purchaseBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of Purchase. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(PurchaseCB cb) {
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
     * Purchase purchase = <span style="color: #0000C0">purchaseBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * <span style="color: #70226C">if</span> (purchase != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = purchase.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of Purchase. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public Purchase selectEntity(CBCall<PurchaseCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean. #beforejava8 <br>
     * <span style="color: #AD4747; font-size: 120%">The return might be null if no data, so you should have null check.</span> <br>
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, use selectEntityWithDeletedCheck().</span>
     * <pre>
     * PurchaseCB cb = <span style="color: #70226C">new</span> PurchaseCB();
     * cb.query().setFoo...(value);
     * Purchase purchase = <span style="color: #0000C0">purchaseBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (purchase != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = purchase.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of Purchase. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public Purchase selectEntity(PurchaseCB cb) {
        return facadeSelectEntity(cb);
    }

    protected Purchase facadeSelectEntity(PurchaseCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends Purchase> OptionalEntity<ENTITY> doSelectOptionalEntity(PurchaseCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * Purchase <span style="color: #553000">purchase</span> = <span style="color: #0000C0">purchaseBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">purchase</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of Purchase. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public Purchase selectEntityWithDeletedCheck(CBCall<PurchaseCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * PurchaseCB cb = <span style="color: #70226C">new</span> PurchaseCB();
     * cb.query().set...;
     * Purchase purchase = <span style="color: #0000C0">purchaseBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = purchase.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of Purchase. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public Purchase selectEntityWithDeletedCheck(PurchaseCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param purchaseId : PK, ID, NotNull, bigserial(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public Purchase selectByPK(Long purchaseId) {
        return facadeSelectByPK(purchaseId);
    }

    protected Purchase facadeSelectByPK(Long purchaseId) {
        return doSelectByPK(purchaseId, typeOfSelectedEntity());
    }

    protected <ENTITY extends Purchase> ENTITY doSelectByPK(Long purchaseId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(purchaseId), tp);
    }

    protected <ENTITY extends Purchase> OptionalEntity<ENTITY> doSelectOptionalByPK(Long purchaseId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(purchaseId, tp), purchaseId);
    }

    protected PurchaseCB xprepareCBAsPK(Long purchaseId) {
        assertObjectNotNull("purchaseId", purchaseId);
        return newConditionBean().acceptPK(purchaseId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param memberId (会員ID): UQ+, NotNull, int4(10), FK to member. (NotNull)
     * @param productId (商品ID): +UQ, IX+, NotNull, int4(10), FK to product. (NotNull)
     * @param purchaseDatetime (購入日時): +UQ, IX+, NotNull, timestamp(26, 3). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<Purchase> selectByUniqueOf(Integer memberId, Integer productId, java.sql.Timestamp purchaseDatetime) {
        return facadeSelectByUniqueOf(memberId, productId, purchaseDatetime);
    }

    protected OptionalEntity<Purchase> facadeSelectByUniqueOf(Integer memberId, Integer productId, java.sql.Timestamp purchaseDatetime) {
        return doSelectByUniqueOf(memberId, productId, purchaseDatetime, typeOfSelectedEntity());
    }

    protected <ENTITY extends Purchase> OptionalEntity<ENTITY> doSelectByUniqueOf(Integer memberId, Integer productId, java.sql.Timestamp purchaseDatetime, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(memberId, productId, purchaseDatetime), tp), memberId, productId, purchaseDatetime);
    }

    protected PurchaseCB xprepareCBAsUniqueOf(Integer memberId, Integer productId, java.sql.Timestamp purchaseDatetime) {
        assertObjectNotNull("memberId", memberId);assertObjectNotNull("productId", productId);assertObjectNotNull("purchaseDatetime", purchaseDatetime);
        return newConditionBean().acceptUniqueOf(memberId, productId, purchaseDatetime);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;Purchase&gt; <span style="color: #553000">purchaseList</span> = <span style="color: #0000C0">purchaseBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * <span style="color: #70226C">for</span> (Purchase <span style="color: #553000">purchase</span> : <span style="color: #553000">purchaseList</span>) {
     *     ... = <span style="color: #553000">purchase</span>.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of Purchase. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<Purchase> selectList(CBCall<PurchaseCB> cbLambda) {
        return facadeSelectList(createCB(cbLambda));
    }

    /**
     * Select the list as result bean.
     * <pre>
     * PurchaseCB cb = <span style="color: #70226C">new</span> PurchaseCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;Purchase&gt; <span style="color: #553000">purchaseList</span> = <span style="color: #0000C0">purchaseBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (Purchase purchase : <span style="color: #553000">purchaseList</span>) {
     *     ... = purchase.get...;
     * }
     * </pre>
     * @param cb The condition-bean of Purchase. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<Purchase> selectList(PurchaseCB cb) {
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
     * PagingResultBean&lt;Purchase&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">purchaseBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (Purchase purchase : <span style="color: #553000">page</span>) {
     *     ... = purchase.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of Purchase. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<Purchase> selectPage(CBCall<PurchaseCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * PurchaseCB cb = <span style="color: #70226C">new</span> PurchaseCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;Purchase&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">purchaseBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (Purchase purchase : <span style="color: #553000">page</span>) {
     *     ... = purchase.get...();
     * }
     * </pre>
     * @param cb The condition-bean of Purchase. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<Purchase> selectPage(PurchaseCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">purchaseBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of Purchase. (NotNull)
     * @param entityLambda The handler of entity row of Purchase. (NotNull)
     */
    public void selectCursor(CBCall<PurchaseCB> cbLambda, EntityRowHandler<Purchase> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * PurchaseCB cb = <span style="color: #70226C">new</span> PurchaseCB();
     * cb.query().set...
     * <span style="color: #0000C0">purchaseBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of Purchase. (NotNull)
     * @param entityRowHandler The handler of entity row of Purchase. (NotNull)
     */
    public void selectCursor(PurchaseCB cb, EntityRowHandler<Purchase> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">purchaseBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<PurchaseCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    // ===================================================================================
    //                                                                            Sequence
    //                                                                            ========
    /**
     * Select the next value as sequence. <br>
     * This method is called when insert() and set to primary-key automatically.
     * So you don't need to call this as long as you need to get next value before insert().
     * @return The next value. (NotNull)
     */
    public Long selectNextVal() {
        return facadeSelectNextVal();
    }

    protected Long facadeSelectNextVal() {
        return doSelectNextVal(Long.class);
    }

    protected <RESULT> RESULT doSelectNextVal(Class<RESULT> tp) {
        return delegateSelectNextVal(tp);
    }

    @Override
    protected Number doReadNextVal() {
        return facadeSelectNextVal();
    }

    public Integer selectNextValForPurchaseCount() {
        return facadeSelectNextValForPurchaseCount();
    }

    protected Integer facadeSelectNextValForPurchaseCount() {
        return doSelectNextValForPurchaseCount(null, null); // sequence cache is unsupported by default
    }

    protected Integer doSelectNextValForPurchaseCount(Integer incrementSize, Integer cacheSize) {
        return delegateSelectNextValSub(Integer.class, "purchase_count", "SEQ_SUB_PURCHASE_COUNT", incrementSize, cacheSize);
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
     * @param purchaseList The entity list of purchase. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<Purchase> purchaseList, ReferrerLoaderHandler<LoaderOfPurchase> loaderLambda) {
        xassLRArg(purchaseList, loaderLambda);
        loaderLambda.handle(new LoaderOfPurchase().ready(purchaseList, _behaviorSelector));
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
     * @param purchase The entity of purchase. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(Purchase purchase, ReferrerLoaderHandler<LoaderOfPurchase> loaderLambda) {
        xassLRArg(purchase, loaderLambda);
        loaderLambda.handle(new LoaderOfPurchase().ready(xnewLRAryLs(purchase), _behaviorSelector));
    }

    /**
     * Load referrer of purchasePaymentList by the set-upper of referrer. <br>
     * (購入支払)purchase_payment by purchase_id, named 'purchasePaymentList'.
     * <pre>
     * <span style="color: #0000C0">purchaseBhv</span>.<span style="color: #CC4747">loadPurchasePaymentList</span>(<span style="color: #553000">purchaseList</span>, <span style="color: #553000">paymentCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">paymentCB</span>.setupSelect...
     *     <span style="color: #553000">paymentCB</span>.query().set...
     *     <span style="color: #553000">paymentCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (Purchase purchase : <span style="color: #553000">purchaseList</span>) {
     *     ... = purchase.<span style="color: #CC4747">getPurchasePaymentList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPurchaseId_InScope(pkList);
     * cb.query().addOrderBy_PurchaseId_Asc();
     * </pre>
     * @param purchaseList The entity list of purchase. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<PurchasePayment> loadPurchasePaymentList(List<Purchase> purchaseList, ConditionBeanSetupper<PurchasePaymentCB> refCBLambda) {
        xassLRArg(purchaseList, refCBLambda);
        return doLoadPurchasePaymentList(purchaseList, new LoadReferrerOption<PurchasePaymentCB, PurchasePayment>().xinit(refCBLambda));
    }

    /**
     * Load referrer of purchasePaymentList by the set-upper of referrer. <br>
     * (購入支払)purchase_payment by purchase_id, named 'purchasePaymentList'.
     * <pre>
     * <span style="color: #0000C0">purchaseBhv</span>.<span style="color: #CC4747">loadPurchasePaymentList</span>(<span style="color: #553000">purchase</span>, <span style="color: #553000">paymentCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">paymentCB</span>.setupSelect...
     *     <span style="color: #553000">paymentCB</span>.query().set...
     *     <span style="color: #553000">paymentCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">purchase</span>.<span style="color: #CC4747">getPurchasePaymentList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPurchaseId_InScope(pkList);
     * cb.query().addOrderBy_PurchaseId_Asc();
     * </pre>
     * @param purchase The entity of purchase. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<PurchasePayment> loadPurchasePaymentList(Purchase purchase, ConditionBeanSetupper<PurchasePaymentCB> refCBLambda) {
        xassLRArg(purchase, refCBLambda);
        return doLoadPurchasePaymentList(xnewLRLs(purchase), new LoadReferrerOption<PurchasePaymentCB, PurchasePayment>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param purchase The entity of purchase. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<PurchasePayment> loadPurchasePaymentList(Purchase purchase, LoadReferrerOption<PurchasePaymentCB, PurchasePayment> loadReferrerOption) {
        xassLRArg(purchase, loadReferrerOption);
        return loadPurchasePaymentList(xnewLRLs(purchase), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param purchaseList The entity list of purchase. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<PurchasePayment> loadPurchasePaymentList(List<Purchase> purchaseList, LoadReferrerOption<PurchasePaymentCB, PurchasePayment> loadReferrerOption) {
        xassLRArg(purchaseList, loadReferrerOption);
        if (purchaseList.isEmpty()) { return (NestedReferrerListGateway<PurchasePayment>)EMPTY_NREF_LGWAY; }
        return doLoadPurchasePaymentList(purchaseList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<PurchasePayment> doLoadPurchasePaymentList(List<Purchase> purchaseList, LoadReferrerOption<PurchasePaymentCB, PurchasePayment> option) {
        return helpLoadReferrerInternally(purchaseList, option, "purchasePaymentList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'Member'.
     * @param purchaseList The list of purchase. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Member> pulloutMember(List<Purchase> purchaseList)
    { return helpPulloutInternally(purchaseList, "member"); }

    /**
     * Pull out the list of foreign table 'Product'.
     * @param purchaseList The list of purchase. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Product> pulloutProduct(List<Purchase> purchaseList)
    { return helpPulloutInternally(purchaseList, "product"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key purchaseId.
     * @param purchaseList The list of purchase. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractPurchaseIdList(List<Purchase> purchaseList)
    { return helpExtractListInternally(purchaseList, "purchaseId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * Purchase purchase = <span style="color: #70226C">new</span> Purchase();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * purchase.setFoo...(value);
     * purchase.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//purchase.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//purchase.set...;</span>
     * <span style="color: #0000C0">purchaseBhv</span>.<span style="color: #CC4747">insert</span>(purchase);
     * ... = purchase.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param purchase The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(Purchase purchase) {
        doInsert(purchase, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * Purchase purchase = <span style="color: #70226C">new</span> Purchase();
     * purchase.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * purchase.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//purchase.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//purchase.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * purchase.<span style="color: #CC4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #0000C0">purchaseBhv</span>.<span style="color: #CC4747">update</span>(purchase);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param purchase The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(Purchase purchase) {
        doUpdate(purchase, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * Purchase purchase = <span style="color: #70226C">new</span> Purchase();
     * purchase.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * purchase.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//purchase.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//purchase.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//purchase.setVersionNo(value);</span>
     * <span style="color: #0000C0">purchaseBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(purchase);
     * </pre>
     * @param purchase The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(Purchase purchase) {
        doUpdateNonstrict(purchase, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #CC4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param purchase The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(Purchase purchase) {
        doInsertOrUpdate(purchase, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #CC4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param purchase The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(Purchase purchase) {
        doInsertOrUpdateNonstrict(purchase, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * Purchase purchase = <span style="color: #70226C">new</span> Purchase();
     * purchase.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * purchase.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">purchaseBhv</span>.<span style="color: #CC4747">delete</span>(purchase);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param purchase The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(Purchase purchase) {
        doDelete(purchase, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * Purchase purchase = <span style="color: #70226C">new</span> Purchase();
     * purchase.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//purchase.setVersionNo(value);</span>
     * <span style="color: #0000C0">purchaseBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(purchase);
     * </pre>
     * @param purchase The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(Purchase purchase) {
        doDeleteNonstrict(purchase, null);
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
     *     Purchase purchase = <span style="color: #70226C">new</span> Purchase();
     *     purchase.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         purchase.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     purchaseList.add(purchase);
     * }
     * <span style="color: #0000C0">purchaseBhv</span>.<span style="color: #CC4747">batchInsert</span>(purchaseList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param purchaseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<Purchase> purchaseList) {
        return doBatchInsert(purchaseList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     Purchase purchase = <span style="color: #70226C">new</span> Purchase();
     *     purchase.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         purchase.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         purchase.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//purchase.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     purchaseList.add(purchase);
     * }
     * <span style="color: #0000C0">purchaseBhv</span>.<span style="color: #CC4747">batchUpdate</span>(purchaseList);
     * </pre>
     * @param purchaseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<Purchase> purchaseList) {
        return doBatchUpdate(purchaseList, null);
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     Purchase purchase = <span style="color: #70226C">new</span> Purchase();
     *     purchase.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         purchase.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         purchase.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//purchase.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     purchaseList.add(purchase);
     * }
     * <span style="color: #0000C0">purchaseBhv</span>.<span style="color: #CC4747">batchUpdate</span>(purchaseList);
     * </pre>
     * @param purchaseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<Purchase> purchaseList) {
        return doBatchUpdateNonstrict(purchaseList, null);
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param purchaseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<Purchase> purchaseList) {
        return doBatchDelete(purchaseList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param purchaseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<Purchase> purchaseList) {
        return doBatchDeleteNonstrict(purchaseList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">purchaseBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;Purchase, PurchaseCB&gt;() {
     *     public ConditionBean setup(Purchase entity, PurchaseCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<Purchase, PurchaseCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * Purchase purchase = <span style="color: #70226C">new</span> Purchase();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//purchase.setPK...(value);</span>
     * purchase.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//purchase.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//purchase.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//purchase.setVersionNo(value);</span>
     * PurchaseCB cb = <span style="color: #70226C">new</span> PurchaseCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">purchaseBhv</span>.<span style="color: #CC4747">queryUpdate</span>(purchase, cb);
     * </pre>
     * @param purchase The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of Purchase. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(Purchase purchase, CBCall<PurchaseCB> cbLambda) {
        return doQueryUpdate(purchase, createCB(cbLambda), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * Purchase purchase = <span style="color: #70226C">new</span> Purchase();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//purchase.setPK...(value);</span>
     * purchase.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//purchase.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//purchase.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//purchase.setVersionNo(value);</span>
     * PurchaseCB cb = <span style="color: #70226C">new</span> PurchaseCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">purchaseBhv</span>.<span style="color: #CC4747">queryUpdate</span>(purchase, cb);
     * </pre>
     * @param purchase The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of Purchase. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(Purchase purchase, PurchaseCB cb) {
        return doQueryUpdate(purchase, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * PurchaseCB cb = new PurchaseCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">purchaseBhv</span>.<span style="color: #CC4747">queryDelete</span>(purchase, cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of Purchase. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<PurchaseCB> cbLambda) {
        return doQueryDelete(createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * PurchaseCB cb = new PurchaseCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">purchaseBhv</span>.<span style="color: #CC4747">queryDelete</span>(purchase, cb);
     * </pre>
     * @param cb The condition-bean of Purchase. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(PurchaseCB cb) {
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
     * Purchase purchase = <span style="color: #70226C">new</span> Purchase();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * purchase.setFoo...(value);
     * purchase.setBar...(value);
     * InsertOption&lt;PurchaseCB&gt; option = new InsertOption&lt;PurchaseCB&gt;();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * <span style="color: #0000C0">purchaseBhv</span>.<span style="color: #CC4747">varyingInsert</span>(purchase, option);
     * ... = purchase.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param purchase The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(Purchase purchase, WritableOptionCall<PurchaseCB, InsertOption<PurchaseCB>> opLambda) {
        doInsert(purchase, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * Purchase purchase = <span style="color: #70226C">new</span> Purchase();
     * purchase.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * purchase.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * purchase.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;PurchaseCB&gt; option = new UpdateOption&lt;PurchaseCB&gt;();
     *     option.self(new SpecifyQuery&lt;PurchaseCB&gt;() {
     *         public void specify(PurchaseCB cb) {
     *             cb.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     <span style="color: #0000C0">purchaseBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(purchase, option);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param purchase The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(Purchase purchase, WritableOptionCall<PurchaseCB, UpdateOption<PurchaseCB>> opLambda) {
        doUpdate(purchase, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * Purchase purchase = <span style="color: #70226C">new</span> Purchase();
     * purchase.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * purchase.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//purchase.setVersionNo(value);</span>
     * UpdateOption&lt;PurchaseCB&gt; option = <span style="color: #70226C">new</span> UpdateOption&lt;PurchaseCB&gt;();
     * option.self(new SpecifyQuery&lt;PurchaseCB&gt;() {
     *     public void specify(PurchaseCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * <span style="color: #0000C0">purchaseBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(purchase, option);
     * </pre>
     * @param purchase The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(Purchase purchase, WritableOptionCall<PurchaseCB, UpdateOption<PurchaseCB>> opLambda) {
        doUpdateNonstrict(purchase, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param purchase The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(Purchase purchase, WritableOptionCall<PurchaseCB, InsertOption<PurchaseCB>> insertOpLambda, WritableOptionCall<PurchaseCB, UpdateOption<PurchaseCB>> updateOpLambda) {
        doInsertOrUpdate(purchase, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param purchase The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(Purchase purchase, WritableOptionCall<PurchaseCB, InsertOption<PurchaseCB>> insertOpLambda, WritableOptionCall<PurchaseCB, UpdateOption<PurchaseCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(purchase, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param purchase The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(Purchase purchase, WritableOptionCall<PurchaseCB, DeleteOption<PurchaseCB>> opLambda) {
        doDelete(purchase, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param purchase The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(Purchase purchase, WritableOptionCall<PurchaseCB, DeleteOption<PurchaseCB>> opLambda) {
        doDeleteNonstrict(purchase, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param purchaseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<Purchase> purchaseList, WritableOptionCall<PurchaseCB, InsertOption<PurchaseCB>> opLambda) {
        return doBatchInsert(purchaseList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param purchaseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<Purchase> purchaseList, WritableOptionCall<PurchaseCB, UpdateOption<PurchaseCB>> opLambda) {
        return doBatchUpdate(purchaseList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param purchaseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<Purchase> purchaseList, WritableOptionCall<PurchaseCB, UpdateOption<PurchaseCB>> opLambda) {
        return doBatchUpdateNonstrict(purchaseList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param purchaseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<Purchase> purchaseList, WritableOptionCall<PurchaseCB, DeleteOption<PurchaseCB>> opLambda) {
        return doBatchDelete(purchaseList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param purchaseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<Purchase> purchaseList, WritableOptionCall<PurchaseCB, DeleteOption<PurchaseCB>> opLambda) {
        return doBatchDeleteNonstrict(purchaseList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<Purchase, PurchaseCB> manyArgLambda, WritableOptionCall<PurchaseCB, InsertOption<PurchaseCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * Purchase purchase = <span style="color: #70226C">new</span> Purchase();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//purchase.setPK...(value);</span>
     * purchase.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//purchase.setVersionNo(value);</span>
     * PurchaseCB cb = new PurchaseCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;PurchaseCB&gt; option = <span style="color: #70226C">new</span> UpdateOption&lt;PurchaseCB&gt;();
     * option.self(new SpecifyQuery&lt;PurchaseCB&gt;() {
     *     public void specify(PurchaseCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * <span style="color: #0000C0">purchaseBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(purchase, cb, option);
     * </pre>
     * @param purchase The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of Purchase. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(Purchase purchase, CBCall<PurchaseCB> cbLambda, WritableOptionCall<PurchaseCB, UpdateOption<PurchaseCB>> opLambda) {
        return doQueryUpdate(purchase, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * Purchase purchase = <span style="color: #70226C">new</span> Purchase();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//purchase.setPK...(value);</span>
     * purchase.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//purchase.setVersionNo(value);</span>
     * PurchaseCB cb = <span style="color: #70226C">new</span> PurchaseCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;PurchaseCB&gt; option = <span style="color: #70226C">new</span> UpdateOption&lt;PurchaseCB&gt;();
     * option.self(new SpecifyQuery&lt;PurchaseCB&gt;() {
     *     public void specify(PurchaseCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * <span style="color: #0000C0">purchaseBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(purchase, cb, option);
     * </pre>
     * @param purchase The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of Purchase. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(Purchase purchase, PurchaseCB cb, WritableOptionCall<PurchaseCB, UpdateOption<PurchaseCB>> opLambda) {
        return doQueryUpdate(purchase, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cbLambda The callback for condition-bean of Purchase. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<PurchaseCB> cbLambda, WritableOptionCall<PurchaseCB, DeleteOption<PurchaseCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of Purchase. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(PurchaseCB cb, WritableOptionCall<PurchaseCB, DeleteOption<PurchaseCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span> 
     * purchaseBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span> 
     * purchaseBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * purchaseBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * purchaseBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * purchaseBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * purchaseBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * purchaseBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span> 
     * purchaseBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * purchaseBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * purchaseBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * purchaseBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * purchaseBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * purchaseBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span> 
     * purchaseBhv.outideSql().removeBlockComment().selectList()
     * purchaseBhv.outideSql().removeLineComment().selectList()
     * purchaseBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<PurchaseBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<PurchaseBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor(); // variable to resolve generic type
    }

    // ===================================================================================
    //                                                                Optimistic Lock Info
    //                                                                ====================
    @Override
    protected boolean hasVersionNoValue(Entity et) { return downcast(et).getVersionNo() != null; }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends Purchase> typeOfSelectedEntity() { return Purchase.class; }
    protected Class<Purchase> typeOfHandlingEntity() { return Purchase.class; }
    protected Class<PurchaseCB> typeOfHandlingConditionBean() { return PurchaseCB.class; }
}
