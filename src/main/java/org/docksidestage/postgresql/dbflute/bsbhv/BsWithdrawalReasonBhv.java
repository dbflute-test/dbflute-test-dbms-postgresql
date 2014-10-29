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
 * The behavior of (退会理由)withdrawal_reason as TABLE. <br />
 * <pre>
 * [primary key]
 *     withdrawal_reason_code
 *
 * [column]
 *     withdrawal_reason_code, withdrawal_reason_text, display_order
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
 *     member_withdrawal
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     memberWithdrawalList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWithdrawalReasonBhv extends AbstractBehaviorWritable<WithdrawalReason, WithdrawalReasonCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public WithdrawalReasonDbm getDBMeta() { return WithdrawalReasonDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WithdrawalReasonCB newConditionBean() { return new WithdrawalReasonCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * int count = <span style="color: #0000C0">withdrawalReasonBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WithdrawalReason. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<WithdrawalReasonCB> cbLambda) {
        return facadeSelectCount(createCB(cbLambda));
    }

    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WithdrawalReasonCB cb = new WithdrawalReasonCB();
     * cb.query().setFoo...(value);
     * int count = <span style="color: #0000C0">withdrawalReasonBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WithdrawalReason. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WithdrawalReasonCB cb) {
        return facadeSelectCount(cb);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean. #beforejava8 <br />
     * <span style="color: #AD4747; font-size: 120%">The return might be null if no data, so you should have null check.</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, use selectEntityWithDeletedCheck().</span>
     * <pre>
     * WithdrawalReason withdrawalReason = <span style="color: #0000C0">withdrawalReasonBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * if (withdrawalReason != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = withdrawalReason.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WithdrawalReason. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WithdrawalReason selectEntity(CBCall<WithdrawalReasonCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean. #beforejava8 <br />
     * <span style="color: #AD4747; font-size: 120%">The return might be null if no data, so you should have null check.</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, use selectEntityWithDeletedCheck().</span>
     * <pre>
     * WithdrawalReasonCB cb = new WithdrawalReasonCB();
     * cb.query().setFoo...(value);
     * WithdrawalReason withdrawalReason = <span style="color: #0000C0">withdrawalReasonBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (withdrawalReason != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = withdrawalReason.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WithdrawalReason. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WithdrawalReason selectEntity(WithdrawalReasonCB cb) {
        return facadeSelectEntity(cb);
    }

    protected WithdrawalReason facadeSelectEntity(WithdrawalReasonCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WithdrawalReason> OptionalEntity<ENTITY> doSelectOptionalEntity(WithdrawalReasonCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * WithdrawalReason <span style="color: #553000">withdrawalReason</span> = <span style="color: #0000C0">withdrawalReasonBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">withdrawalReason</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of WithdrawalReason. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WithdrawalReason selectEntityWithDeletedCheck(CBCall<WithdrawalReasonCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * WithdrawalReasonCB cb = new WithdrawalReasonCB();
     * cb.query().set...;
     * WithdrawalReason withdrawalReason = <span style="color: #0000C0">withdrawalReasonBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = withdrawalReason.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WithdrawalReason. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WithdrawalReason selectEntityWithDeletedCheck(WithdrawalReasonCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param withdrawalReasonCode (退会理由コード): PK, NotNull, bpchar(3). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WithdrawalReason selectByPK(String withdrawalReasonCode) {
        return facadeSelectByPK(withdrawalReasonCode);
    }

    protected WithdrawalReason facadeSelectByPK(String withdrawalReasonCode) {
        return doSelectByPK(withdrawalReasonCode, typeOfSelectedEntity());
    }

    protected <ENTITY extends WithdrawalReason> ENTITY doSelectByPK(String withdrawalReasonCode, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(withdrawalReasonCode), tp);
    }

    protected <ENTITY extends WithdrawalReason> OptionalEntity<ENTITY> doSelectOptionalByPK(String withdrawalReasonCode, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(withdrawalReasonCode, tp), withdrawalReasonCode);
    }

    protected WithdrawalReasonCB xprepareCBAsPK(String withdrawalReasonCode) {
        assertObjectNotNull("withdrawalReasonCode", withdrawalReasonCode);
        return newConditionBean().acceptPK(withdrawalReasonCode);
    }

    /**
     * Select the entity by the unique-key value.
     * @param displayOrder : UQ, NotNull, int4(10). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WithdrawalReason> selectByUniqueOf(Integer displayOrder) {
        return facadeSelectByUniqueOf(displayOrder);
    }

    protected OptionalEntity<WithdrawalReason> facadeSelectByUniqueOf(Integer displayOrder) {
        return doSelectByUniqueOf(displayOrder, typeOfSelectedEntity());
    }

    protected <ENTITY extends WithdrawalReason> OptionalEntity<ENTITY> doSelectByUniqueOf(Integer displayOrder, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(displayOrder), tp), displayOrder);
    }

    protected WithdrawalReasonCB xprepareCBAsUniqueOf(Integer displayOrder) {
        assertObjectNotNull("displayOrder", displayOrder);
        return newConditionBean().acceptUniqueOf(displayOrder);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;WithdrawalReason&gt; <span style="color: #553000">withdrawalReasonList</span> = <span style="color: #0000C0">withdrawalReasonBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * for (WithdrawalReason <span style="color: #553000">withdrawalReason</span> : <span style="color: #553000">withdrawalReasonList</span>) {
     *     ... = <span style="color: #553000">withdrawalReason</span>.get...();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WithdrawalReason. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WithdrawalReason> selectList(CBCall<WithdrawalReasonCB> cbLambda) {
        return facadeSelectList(createCB(cbLambda));
    }

    /**
     * Select the list as result bean.
     * <pre>
     * WithdrawalReasonCB cb = new WithdrawalReasonCB();
     * cb.query().set...;
     * cb.query().addOrderBy...();
     * ListResultBean&lt;WithdrawalReason&gt; <span style="color: #553000">withdrawalReasonList</span> = <span style="color: #0000C0">withdrawalReasonBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * for (WithdrawalReason withdrawalReason : <span style="color: #553000">withdrawalReasonList</span>) {
     *     ... = withdrawalReason.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WithdrawalReason. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WithdrawalReason> selectList(WithdrawalReasonCB cb) {
        return facadeSelectList(cb);
    }

    @Override
    protected boolean isEntityDerivedMappable() { return true; }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * PagingResultBean&lt;WithdrawalReason&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">withdrawalReasonBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * int allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * int allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * boolean isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * boolean isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * for (WithdrawalReason withdrawalReason : <span style="color: #553000">page</span>) {
     *     ... = withdrawalReason.get...();
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of WithdrawalReason. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WithdrawalReason> selectPage(CBCall<WithdrawalReasonCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * WithdrawalReasonCB cb = new WithdrawalReasonCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WithdrawalReason&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">withdrawalReasonBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * int allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * int allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * boolean isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * boolean isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * for (WithdrawalReason withdrawalReason : <span style="color: #553000">page</span>) {
     *     ... = withdrawalReason.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WithdrawalReason. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WithdrawalReason> selectPage(WithdrawalReasonCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">withdrawalReasonBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of WithdrawalReason. (NotNull)
     * @param entityLambda The handler of entity row of WithdrawalReason. (NotNull)
     */
    public void selectCursor(CBCall<WithdrawalReasonCB> cbLambda, EntityRowHandler<WithdrawalReason> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WithdrawalReasonCB cb = new WithdrawalReasonCB();
     * cb.query().set...
     * <span style="color: #0000C0">withdrawalReasonBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, new EntityRowHandler&lt;WithdrawalReason&gt;() {
     *     public void handle(WithdrawalReason entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of WithdrawalReason. (NotNull)
     * @param entityRowHandler The handler of entity row of WithdrawalReason. (NotNull)
     */
    public void selectCursor(WithdrawalReasonCB cb, EntityRowHandler<WithdrawalReason> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">withdrawalReasonBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...()</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WithdrawalReasonCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(purchaseLoader -&gt {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePayment(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//memberLoader.pulloutMemberStatus().loadMemberLogin(...)</span>
     * });
     * for (Member member : <span style="color: #553000">memberList</span>) {
     *     List&lt;Purchase&gt; purchaseList = member.<span style="color: #CC4747">getPurchaseList()</span>;
     *     for (Purchase purchase : purchaseList) {
     *         ...
     *     }
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param withdrawalReasonList The entity list of withdrawalReason. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WithdrawalReason> withdrawalReasonList, ReferrerLoaderHandler<LoaderOfWithdrawalReason> loaderLambda) {
        xassLRArg(withdrawalReasonList, loaderLambda);
        loaderLambda.handle(new LoaderOfWithdrawalReason().ready(withdrawalReasonList, _behaviorSelector));
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
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(purchaseLoader -&gt {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePayment(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//memberLoader.pulloutMemberStatus().loadMemberLogin(...)</span>
     * });
     * List&lt;Purchase&gt; purchaseList = <span style="color: #553000">member</span>.<span style="color: #CC4747">getPurchaseList()</span>;
     * for (Purchase purchase : purchaseList) {
     *     ...
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param withdrawalReason The entity of withdrawalReason. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WithdrawalReason withdrawalReason, ReferrerLoaderHandler<LoaderOfWithdrawalReason> loaderLambda) {
        xassLRArg(withdrawalReason, loaderLambda);
        loaderLambda.handle(new LoaderOfWithdrawalReason().ready(xnewLRAryLs(withdrawalReason), _behaviorSelector));
    }

    /**
     * Load referrer of memberWithdrawalList by the set-upper of referrer. <br />
     * (会員退会情報)member_withdrawal by withdrawal_reason_code, named 'memberWithdrawalList'.
     * <pre>
     * <span style="color: #0000C0">withdrawalReasonBhv</span>.<span style="color: #CC4747">loadMemberWithdrawalList</span>(<span style="color: #553000">withdrawalReasonList</span>, <span style="color: #553000">withdrawalCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">withdrawalCB</span>.setupSelect...
     *     <span style="color: #553000">withdrawalCB</span>.query().set...
     *     <span style="color: #553000">withdrawalCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (WithdrawalReason withdrawalReason : <span style="color: #553000">withdrawalReasonList</span>) {
     *     ... = withdrawalReason.<span style="color: #CC4747">getMemberWithdrawalList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setWithdrawalReasonCode_InScope(pkList);
     * cb.query().addOrderBy_WithdrawalReasonCode_Asc();
     * </pre>
     * @param withdrawalReasonList The entity list of withdrawalReason. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MemberWithdrawal> loadMemberWithdrawalList(List<WithdrawalReason> withdrawalReasonList, ConditionBeanSetupper<MemberWithdrawalCB> refCBLambda) {
        xassLRArg(withdrawalReasonList, refCBLambda);
        return doLoadMemberWithdrawalList(withdrawalReasonList, new LoadReferrerOption<MemberWithdrawalCB, MemberWithdrawal>().xinit(refCBLambda));
    }

    /**
     * Load referrer of memberWithdrawalList by the set-upper of referrer. <br />
     * (会員退会情報)member_withdrawal by withdrawal_reason_code, named 'memberWithdrawalList'.
     * <pre>
     * <span style="color: #0000C0">withdrawalReasonBhv</span>.<span style="color: #CC4747">loadMemberWithdrawalList</span>(<span style="color: #553000">withdrawalReason</span>, <span style="color: #553000">withdrawalCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">withdrawalCB</span>.setupSelect...
     *     <span style="color: #553000">withdrawalCB</span>.query().set...
     *     <span style="color: #553000">withdrawalCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">withdrawalReason</span>.<span style="color: #CC4747">getMemberWithdrawalList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setWithdrawalReasonCode_InScope(pkList);
     * cb.query().addOrderBy_WithdrawalReasonCode_Asc();
     * </pre>
     * @param withdrawalReason The entity of withdrawalReason. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MemberWithdrawal> loadMemberWithdrawalList(WithdrawalReason withdrawalReason, ConditionBeanSetupper<MemberWithdrawalCB> refCBLambda) {
        xassLRArg(withdrawalReason, refCBLambda);
        return doLoadMemberWithdrawalList(xnewLRLs(withdrawalReason), new LoadReferrerOption<MemberWithdrawalCB, MemberWithdrawal>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param withdrawalReason The entity of withdrawalReason. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MemberWithdrawal> loadMemberWithdrawalList(WithdrawalReason withdrawalReason, LoadReferrerOption<MemberWithdrawalCB, MemberWithdrawal> loadReferrerOption) {
        xassLRArg(withdrawalReason, loadReferrerOption);
        return loadMemberWithdrawalList(xnewLRLs(withdrawalReason), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param withdrawalReasonList The entity list of withdrawalReason. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MemberWithdrawal> loadMemberWithdrawalList(List<WithdrawalReason> withdrawalReasonList, LoadReferrerOption<MemberWithdrawalCB, MemberWithdrawal> loadReferrerOption) {
        xassLRArg(withdrawalReasonList, loadReferrerOption);
        if (withdrawalReasonList.isEmpty()) { return (NestedReferrerListGateway<MemberWithdrawal>)EMPTY_NREF_LGWAY; }
        return doLoadMemberWithdrawalList(withdrawalReasonList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MemberWithdrawal> doLoadMemberWithdrawalList(List<WithdrawalReason> withdrawalReasonList, LoadReferrerOption<MemberWithdrawalCB, MemberWithdrawal> option) {
        return helpLoadReferrerInternally(withdrawalReasonList, option, "memberWithdrawalList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key withdrawalReasonCode.
     * @param withdrawalReasonList The list of withdrawalReason. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractWithdrawalReasonCodeList(List<WithdrawalReason> withdrawalReasonList)
    { return helpExtractListInternally(withdrawalReasonList, "withdrawalReasonCode"); }

    /**
     * Extract the value list of (single) unique key displayOrder.
     * @param withdrawalReasonList The list of withdrawalReason. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractDisplayOrderList(List<WithdrawalReason> withdrawalReasonList)
    { return helpExtractListInternally(withdrawalReasonList, "displayOrder"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WithdrawalReason withdrawalReason = new WithdrawalReason();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * withdrawalReason.setFoo...(value);
     * withdrawalReason.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//withdrawalReason.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//withdrawalReason.set...;</span>
     * <span style="color: #0000C0">withdrawalReasonBhv</span>.<span style="color: #CC4747">insert</span>(withdrawalReason);
     * ... = withdrawalReason.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param withdrawalReason The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WithdrawalReason withdrawalReason) {
        doInsert(withdrawalReason, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WithdrawalReason withdrawalReason = new WithdrawalReason();
     * withdrawalReason.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * withdrawalReason.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//withdrawalReason.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//withdrawalReason.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * withdrawalReason.<span style="color: #CC4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #0000C0">withdrawalReasonBhv</span>.<span style="color: #CC4747">update</span>(withdrawalReason);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param withdrawalReason The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WithdrawalReason withdrawalReason) {
        doUpdate(withdrawalReason, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #CC4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param withdrawalReason The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WithdrawalReason withdrawalReason) {
        doInsertOrUpdate(withdrawalReason, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * WithdrawalReason withdrawalReason = new WithdrawalReason();
     * withdrawalReason.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * withdrawalReason.<span style="color: #CC4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #0000C0">withdrawalReasonBhv</span>.<span style="color: #CC4747">delete</span>(withdrawalReason);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param withdrawalReason The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WithdrawalReason withdrawalReason) {
        doDelete(withdrawalReason, null);
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch-insert the entity list modified-only of same-set columns. (DefaultConstraintsEnabled) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <p><span style="color: #CC4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
     * <pre>
     * for (... : ...) {
     *     WithdrawalReason withdrawalReason = new WithdrawalReason();
     *     withdrawalReason.setFooName("foo");
     *     if (...) {
     *         withdrawalReason.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     withdrawalReasonList.add(withdrawalReason);
     * }
     * <span style="color: #0000C0">withdrawalReasonBhv</span>.<span style="color: #CC4747">batchInsert</span>(withdrawalReasonList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param withdrawalReasonList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WithdrawalReason> withdrawalReasonList) {
        return doBatchInsert(withdrawalReasonList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WithdrawalReason withdrawalReason = new WithdrawalReason();
     *     withdrawalReason.setFooName("foo");
     *     if (...) {
     *         withdrawalReason.setFooPrice(123);
     *     } else {
     *         withdrawalReason.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//withdrawalReason.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     withdrawalReasonList.add(withdrawalReason);
     * }
     * <span style="color: #0000C0">withdrawalReasonBhv</span>.<span style="color: #CC4747">batchUpdate</span>(withdrawalReasonList);
     * </pre>
     * @param withdrawalReasonList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<WithdrawalReason> withdrawalReasonList) {
        return doBatchUpdate(withdrawalReasonList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param withdrawalReasonList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<WithdrawalReason> withdrawalReasonList) {
        return doBatchDelete(withdrawalReasonList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">withdrawalReasonBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;WithdrawalReason, WithdrawalReasonCB&gt;() {
     *     public ConditionBean setup(WithdrawalReason entity, WithdrawalReasonCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WithdrawalReason, WithdrawalReasonCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WithdrawalReason withdrawalReason = new WithdrawalReason();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//withdrawalReason.setPK...(value);</span>
     * withdrawalReason.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//withdrawalReason.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//withdrawalReason.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//withdrawalReason.setVersionNo(value);</span>
     * WithdrawalReasonCB cb = new WithdrawalReasonCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">withdrawalReasonBhv</span>.<span style="color: #CC4747">queryUpdate</span>(withdrawalReason, cb);
     * </pre>
     * @param withdrawalReason The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of WithdrawalReason. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WithdrawalReason withdrawalReason, CBCall<WithdrawalReasonCB> cbLambda) {
        return doQueryUpdate(withdrawalReason, createCB(cbLambda), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WithdrawalReason withdrawalReason = new WithdrawalReason();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//withdrawalReason.setPK...(value);</span>
     * withdrawalReason.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//withdrawalReason.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//withdrawalReason.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//withdrawalReason.setVersionNo(value);</span>
     * WithdrawalReasonCB cb = new WithdrawalReasonCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">withdrawalReasonBhv</span>.<span style="color: #CC4747">queryUpdate</span>(withdrawalReason, cb);
     * </pre>
     * @param withdrawalReason The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WithdrawalReason. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WithdrawalReason withdrawalReason, WithdrawalReasonCB cb) {
        return doQueryUpdate(withdrawalReason, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WithdrawalReasonCB cb = new WithdrawalReasonCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">withdrawalReasonBhv</span>.<span style="color: #CC4747">queryDelete</span>(withdrawalReason, cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of WithdrawalReason. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<WithdrawalReasonCB> cbLambda) {
        return doQueryDelete(createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WithdrawalReasonCB cb = new WithdrawalReasonCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">withdrawalReasonBhv</span>.<span style="color: #CC4747">queryDelete</span>(withdrawalReason, cb);
     * </pre>
     * @param cb The condition-bean of WithdrawalReason. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WithdrawalReasonCB cb) {
        return doQueryDelete(cb, null);
    }

    // ===================================================================================
    //                                                                      Varying Update
    //                                                                      ==============
    // -----------------------------------------------------
    //                                         Entity Update
    //                                         -------------
    /**
     * Insert the entity with varying requests. <br />
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br />
     * Other specifications are same as insert(entity).
     * <pre>
     * WithdrawalReason withdrawalReason = new WithdrawalReason();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * withdrawalReason.setFoo...(value);
     * withdrawalReason.setBar...(value);
     * InsertOption<WithdrawalReasonCB> option = new InsertOption<WithdrawalReasonCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * <span style="color: #0000C0">withdrawalReasonBhv</span>.<span style="color: #CC4747">varyingInsert</span>(withdrawalReason, option);
     * ... = withdrawalReason.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param withdrawalReason The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WithdrawalReason withdrawalReason, WritableOptionCall<WithdrawalReasonCB, InsertOption<WithdrawalReasonCB>> opLambda) {
        doInsert(withdrawalReason, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * WithdrawalReason withdrawalReason = new WithdrawalReason();
     * withdrawalReason.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * withdrawalReason.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * withdrawalReason.<span style="color: #CC4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;WithdrawalReasonCB&gt; option = new UpdateOption&lt;WithdrawalReasonCB&gt;();
     *     option.self(new SpecifyQuery&lt;WithdrawalReasonCB&gt;() {
     *         public void specify(WithdrawalReasonCB cb) {
     *             cb.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     <span style="color: #0000C0">withdrawalReasonBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(withdrawalReason, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param withdrawalReason The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WithdrawalReason withdrawalReason, WritableOptionCall<WithdrawalReasonCB, UpdateOption<WithdrawalReasonCB>> opLambda) {
        doUpdate(withdrawalReason, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param withdrawalReason The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WithdrawalReason withdrawalReason, WritableOptionCall<WithdrawalReasonCB, InsertOption<WithdrawalReasonCB>> insertOpLambda, WritableOptionCall<WithdrawalReasonCB, UpdateOption<WithdrawalReasonCB>> updateOpLambda) {
        doInsertOrUpdate(withdrawalReason, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param withdrawalReason The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WithdrawalReason withdrawalReason, WritableOptionCall<WithdrawalReasonCB, DeleteOption<WithdrawalReasonCB>> opLambda) {
        doDelete(withdrawalReason, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param withdrawalReasonList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WithdrawalReason> withdrawalReasonList, WritableOptionCall<WithdrawalReasonCB, InsertOption<WithdrawalReasonCB>> opLambda) {
        return doBatchInsert(withdrawalReasonList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param withdrawalReasonList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WithdrawalReason> withdrawalReasonList, WritableOptionCall<WithdrawalReasonCB, UpdateOption<WithdrawalReasonCB>> opLambda) {
        return doBatchUpdate(withdrawalReasonList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param withdrawalReasonList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WithdrawalReason> withdrawalReasonList, WritableOptionCall<WithdrawalReasonCB, DeleteOption<WithdrawalReasonCB>> opLambda) {
        return doBatchDelete(withdrawalReasonList, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Query Update
    //                                          ------------
    /**
     * Insert the several entities by query with varying requests (modified-only for fixed value). <br />
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br />
     * Other specifications are same as queryInsert(entity, setupper).
     * @param manyArgLambda The set-upper of query-insert. (NotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The inserted count.
     */
    public int varyingQueryInsert(QueryInsertSetupper<WithdrawalReason, WithdrawalReasonCB> manyArgLambda, WritableOptionCall<WithdrawalReasonCB, InsertOption<WithdrawalReasonCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WithdrawalReason withdrawalReason = new WithdrawalReason();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//withdrawalReason.setPK...(value);</span>
     * withdrawalReason.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//withdrawalReason.setVersionNo(value);</span>
     * WithdrawalReasonCB cb = new WithdrawalReasonCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WithdrawalReasonCB&gt; option = new UpdateOption&lt;WithdrawalReasonCB&gt;();
     * option.self(new SpecifyQuery&lt;WithdrawalReasonCB&gt;() {
     *     public void specify(WithdrawalReasonCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * <span style="color: #0000C0">withdrawalReasonBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(withdrawalReason, cb, option);
     * </pre>
     * @param withdrawalReason The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of WithdrawalReason. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WithdrawalReason withdrawalReason, CBCall<WithdrawalReasonCB> cbLambda, WritableOptionCall<WithdrawalReasonCB, UpdateOption<WithdrawalReasonCB>> opLambda) {
        return doQueryUpdate(withdrawalReason, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WithdrawalReason withdrawalReason = new WithdrawalReason();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//withdrawalReason.setPK...(value);</span>
     * withdrawalReason.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//withdrawalReason.setVersionNo(value);</span>
     * WithdrawalReasonCB cb = new WithdrawalReasonCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;WithdrawalReasonCB&gt; option = new UpdateOption&lt;WithdrawalReasonCB&gt;();
     * option.self(new SpecifyQuery&lt;WithdrawalReasonCB&gt;() {
     *     public void specify(WithdrawalReasonCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * <span style="color: #0000C0">withdrawalReasonBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(withdrawalReason, cb, option);
     * </pre>
     * @param withdrawalReason The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WithdrawalReason. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WithdrawalReason withdrawalReason, WithdrawalReasonCB cb, WritableOptionCall<WithdrawalReasonCB, UpdateOption<WithdrawalReasonCB>> opLambda) {
        return doQueryUpdate(withdrawalReason, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cbLambda The callback for condition-bean of WithdrawalReason. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<WithdrawalReasonCB> cbLambda, WritableOptionCall<WithdrawalReasonCB, DeleteOption<WithdrawalReasonCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of WithdrawalReason. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WithdrawalReasonCB cb, WritableOptionCall<WithdrawalReasonCB, DeleteOption<WithdrawalReasonCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span> 
     * withdrawalReasonBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span> 
     * withdrawalReasonBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * withdrawalReasonBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * withdrawalReasonBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * withdrawalReasonBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * withdrawalReasonBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * withdrawalReasonBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span> 
     * withdrawalReasonBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * withdrawalReasonBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * withdrawalReasonBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * withdrawalReasonBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * withdrawalReasonBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * withdrawalReasonBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span> 
     * withdrawalReasonBhv.outideSql().removeBlockComment().selectList()
     * withdrawalReasonBhv.outideSql().removeLineComment().selectList()
     * withdrawalReasonBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<WithdrawalReasonBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<WithdrawalReasonBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor(); // variable to resolve generic type
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends WithdrawalReason> typeOfSelectedEntity() { return WithdrawalReason.class; }
    protected Class<WithdrawalReason> typeOfHandlingEntity() { return WithdrawalReason.class; }
    protected Class<WithdrawalReasonCB> typeOfHandlingConditionBean() { return WithdrawalReasonCB.class; }
}
