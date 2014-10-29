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
 * The behavior of nextschema.white_same_name as TABLE. <br />
 * <pre>
 * [primary key]
 *     same_name_id
 *
 * [column]
 *     same_name_id, same_name_name, same_name_long
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
 *     nextschema.white_same_name_ref
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteSameNameRefList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsNextschemaWhiteSameNameBhv extends AbstractBehaviorWritable<NextschemaWhiteSameName, NextschemaWhiteSameNameCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public NextschemaWhiteSameNameDbm getDBMeta() { return NextschemaWhiteSameNameDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public NextschemaWhiteSameNameCB newConditionBean() { return new NextschemaWhiteSameNameCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * int count = <span style="color: #0000C0">whiteSameNameBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of NextschemaWhiteSameName. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<NextschemaWhiteSameNameCB> cbLambda) {
        return facadeSelectCount(createCB(cbLambda));
    }

    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * NextschemaWhiteSameNameCB cb = new NextschemaWhiteSameNameCB();
     * cb.query().setFoo...(value);
     * int count = <span style="color: #0000C0">whiteSameNameBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of NextschemaWhiteSameName. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(NextschemaWhiteSameNameCB cb) {
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
     * NextschemaWhiteSameName whiteSameName = <span style="color: #0000C0">whiteSameNameBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * if (whiteSameName != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whiteSameName.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of NextschemaWhiteSameName. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public NextschemaWhiteSameName selectEntity(CBCall<NextschemaWhiteSameNameCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean. #beforejava8 <br />
     * <span style="color: #AD4747; font-size: 120%">The return might be null if no data, so you should have null check.</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, use selectEntityWithDeletedCheck().</span>
     * <pre>
     * NextschemaWhiteSameNameCB cb = new NextschemaWhiteSameNameCB();
     * cb.query().setFoo...(value);
     * NextschemaWhiteSameName whiteSameName = <span style="color: #0000C0">whiteSameNameBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (whiteSameName != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = whiteSameName.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of NextschemaWhiteSameName. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public NextschemaWhiteSameName selectEntity(NextschemaWhiteSameNameCB cb) {
        return facadeSelectEntity(cb);
    }

    protected NextschemaWhiteSameName facadeSelectEntity(NextschemaWhiteSameNameCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends NextschemaWhiteSameName> OptionalEntity<ENTITY> doSelectOptionalEntity(NextschemaWhiteSameNameCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * NextschemaWhiteSameName <span style="color: #553000">whiteSameName</span> = <span style="color: #0000C0">whiteSameNameBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">whiteSameName</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of NextschemaWhiteSameName. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public NextschemaWhiteSameName selectEntityWithDeletedCheck(CBCall<NextschemaWhiteSameNameCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * NextschemaWhiteSameNameCB cb = new NextschemaWhiteSameNameCB();
     * cb.query().set...;
     * NextschemaWhiteSameName whiteSameName = <span style="color: #0000C0">whiteSameNameBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteSameName.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of NextschemaWhiteSameName. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public NextschemaWhiteSameName selectEntityWithDeletedCheck(NextschemaWhiteSameNameCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param sameNameId : PK, NotNull, int4(10). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public NextschemaWhiteSameName selectByPK(Integer sameNameId) {
        return facadeSelectByPK(sameNameId);
    }

    protected NextschemaWhiteSameName facadeSelectByPK(Integer sameNameId) {
        return doSelectByPK(sameNameId, typeOfSelectedEntity());
    }

    protected <ENTITY extends NextschemaWhiteSameName> ENTITY doSelectByPK(Integer sameNameId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(sameNameId), tp);
    }

    protected <ENTITY extends NextschemaWhiteSameName> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer sameNameId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(sameNameId, tp), sameNameId);
    }

    protected NextschemaWhiteSameNameCB xprepareCBAsPK(Integer sameNameId) {
        assertObjectNotNull("sameNameId", sameNameId);
        return newConditionBean().acceptPK(sameNameId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;NextschemaWhiteSameName&gt; <span style="color: #553000">whiteSameNameList</span> = <span style="color: #0000C0">whiteSameNameBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * for (NextschemaWhiteSameName <span style="color: #553000">whiteSameName</span> : <span style="color: #553000">whiteSameNameList</span>) {
     *     ... = <span style="color: #553000">whiteSameName</span>.get...();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of NextschemaWhiteSameName. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<NextschemaWhiteSameName> selectList(CBCall<NextschemaWhiteSameNameCB> cbLambda) {
        return facadeSelectList(createCB(cbLambda));
    }

    /**
     * Select the list as result bean.
     * <pre>
     * NextschemaWhiteSameNameCB cb = new NextschemaWhiteSameNameCB();
     * cb.query().set...;
     * cb.query().addOrderBy...();
     * ListResultBean&lt;NextschemaWhiteSameName&gt; <span style="color: #553000">whiteSameNameList</span> = <span style="color: #0000C0">whiteSameNameBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * for (NextschemaWhiteSameName whiteSameName : <span style="color: #553000">whiteSameNameList</span>) {
     *     ... = whiteSameName.get...();
     * }
     * </pre>
     * @param cb The condition-bean of NextschemaWhiteSameName. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<NextschemaWhiteSameName> selectList(NextschemaWhiteSameNameCB cb) {
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
     * PagingResultBean&lt;NextschemaWhiteSameName&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">whiteSameNameBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * int allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * int allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * boolean isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * boolean isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * for (NextschemaWhiteSameName whiteSameName : <span style="color: #553000">page</span>) {
     *     ... = whiteSameName.get...();
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of NextschemaWhiteSameName. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<NextschemaWhiteSameName> selectPage(CBCall<NextschemaWhiteSameNameCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * NextschemaWhiteSameNameCB cb = new NextschemaWhiteSameNameCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;NextschemaWhiteSameName&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">whiteSameNameBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * int allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * int allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * boolean isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * boolean isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * for (NextschemaWhiteSameName whiteSameName : <span style="color: #553000">page</span>) {
     *     ... = whiteSameName.get...();
     * }
     * </pre>
     * @param cb The condition-bean of NextschemaWhiteSameName. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<NextschemaWhiteSameName> selectPage(NextschemaWhiteSameNameCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">whiteSameNameBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of NextschemaWhiteSameName. (NotNull)
     * @param entityLambda The handler of entity row of NextschemaWhiteSameName. (NotNull)
     */
    public void selectCursor(CBCall<NextschemaWhiteSameNameCB> cbLambda, EntityRowHandler<NextschemaWhiteSameName> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * NextschemaWhiteSameNameCB cb = new NextschemaWhiteSameNameCB();
     * cb.query().set...
     * <span style="color: #0000C0">whiteSameNameBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, new EntityRowHandler&lt;NextschemaWhiteSameName&gt;() {
     *     public void handle(NextschemaWhiteSameName entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of NextschemaWhiteSameName. (NotNull)
     * @param entityRowHandler The handler of entity row of NextschemaWhiteSameName. (NotNull)
     */
    public void selectCursor(NextschemaWhiteSameNameCB cb, EntityRowHandler<NextschemaWhiteSameName> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">whiteSameNameBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...()</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<NextschemaWhiteSameNameCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param whiteSameNameList The entity list of whiteSameName. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<NextschemaWhiteSameName> whiteSameNameList, ReferrerLoaderHandler<LoaderOfNextschemaWhiteSameName> loaderLambda) {
        xassLRArg(whiteSameNameList, loaderLambda);
        loaderLambda.handle(new LoaderOfNextschemaWhiteSameName().ready(whiteSameNameList, _behaviorSelector));
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
     * @param whiteSameName The entity of whiteSameName. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(NextschemaWhiteSameName whiteSameName, ReferrerLoaderHandler<LoaderOfNextschemaWhiteSameName> loaderLambda) {
        xassLRArg(whiteSameName, loaderLambda);
        loaderLambda.handle(new LoaderOfNextschemaWhiteSameName().ready(xnewLRAryLs(whiteSameName), _behaviorSelector));
    }

    /**
     * Load referrer of whiteSameNameRefList by the set-upper of referrer. <br />
     * nextschema.white_same_name_ref by same_name_id, named 'whiteSameNameRefList'.
     * <pre>
     * <span style="color: #0000C0">whiteSameNameBhv</span>.<span style="color: #CC4747">loadWhiteSameNameRefList</span>(<span style="color: #553000">whiteSameNameList</span>, <span style="color: #553000">refCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">refCB</span>.setupSelect...
     *     <span style="color: #553000">refCB</span>.query().set...
     *     <span style="color: #553000">refCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (NextschemaWhiteSameName whiteSameName : <span style="color: #553000">whiteSameNameList</span>) {
     *     ... = whiteSameName.<span style="color: #CC4747">getWhiteSameNameRefList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSameNameId_InScope(pkList);
     * cb.query().addOrderBy_SameNameId_Asc();
     * </pre>
     * @param whiteSameNameList The entity list of whiteSameName. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<NextschemaWhiteSameNameRef> loadWhiteSameNameRefList(List<NextschemaWhiteSameName> whiteSameNameList, ConditionBeanSetupper<NextschemaWhiteSameNameRefCB> refCBLambda) {
        xassLRArg(whiteSameNameList, refCBLambda);
        return doLoadWhiteSameNameRefList(whiteSameNameList, new LoadReferrerOption<NextschemaWhiteSameNameRefCB, NextschemaWhiteSameNameRef>().xinit(refCBLambda));
    }

    /**
     * Load referrer of whiteSameNameRefList by the set-upper of referrer. <br />
     * nextschema.white_same_name_ref by same_name_id, named 'whiteSameNameRefList'.
     * <pre>
     * <span style="color: #0000C0">whiteSameNameBhv</span>.<span style="color: #CC4747">loadWhiteSameNameRefList</span>(<span style="color: #553000">whiteSameName</span>, <span style="color: #553000">refCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">refCB</span>.setupSelect...
     *     <span style="color: #553000">refCB</span>.query().set...
     *     <span style="color: #553000">refCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">whiteSameName</span>.<span style="color: #CC4747">getWhiteSameNameRefList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSameNameId_InScope(pkList);
     * cb.query().addOrderBy_SameNameId_Asc();
     * </pre>
     * @param whiteSameName The entity of whiteSameName. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<NextschemaWhiteSameNameRef> loadWhiteSameNameRefList(NextschemaWhiteSameName whiteSameName, ConditionBeanSetupper<NextschemaWhiteSameNameRefCB> refCBLambda) {
        xassLRArg(whiteSameName, refCBLambda);
        return doLoadWhiteSameNameRefList(xnewLRLs(whiteSameName), new LoadReferrerOption<NextschemaWhiteSameNameRefCB, NextschemaWhiteSameNameRef>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param whiteSameName The entity of whiteSameName. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<NextschemaWhiteSameNameRef> loadWhiteSameNameRefList(NextschemaWhiteSameName whiteSameName, LoadReferrerOption<NextschemaWhiteSameNameRefCB, NextschemaWhiteSameNameRef> loadReferrerOption) {
        xassLRArg(whiteSameName, loadReferrerOption);
        return loadWhiteSameNameRefList(xnewLRLs(whiteSameName), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param whiteSameNameList The entity list of whiteSameName. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<NextschemaWhiteSameNameRef> loadWhiteSameNameRefList(List<NextschemaWhiteSameName> whiteSameNameList, LoadReferrerOption<NextschemaWhiteSameNameRefCB, NextschemaWhiteSameNameRef> loadReferrerOption) {
        xassLRArg(whiteSameNameList, loadReferrerOption);
        if (whiteSameNameList.isEmpty()) { return (NestedReferrerListGateway<NextschemaWhiteSameNameRef>)EMPTY_NREF_LGWAY; }
        return doLoadWhiteSameNameRefList(whiteSameNameList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<NextschemaWhiteSameNameRef> doLoadWhiteSameNameRefList(List<NextschemaWhiteSameName> whiteSameNameList, LoadReferrerOption<NextschemaWhiteSameNameRefCB, NextschemaWhiteSameNameRef> option) {
        return helpLoadReferrerInternally(whiteSameNameList, option, "whiteSameNameRefList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key sameNameId.
     * @param whiteSameNameList The list of whiteSameName. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractSameNameIdList(List<NextschemaWhiteSameName> whiteSameNameList)
    { return helpExtractListInternally(whiteSameNameList, "sameNameId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * NextschemaWhiteSameName whiteSameName = new NextschemaWhiteSameName();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteSameName.setFoo...(value);
     * whiteSameName.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSameName.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSameName.set...;</span>
     * <span style="color: #0000C0">whiteSameNameBhv</span>.<span style="color: #CC4747">insert</span>(whiteSameName);
     * ... = whiteSameName.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteSameName The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(NextschemaWhiteSameName whiteSameName) {
        doInsert(whiteSameName, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * NextschemaWhiteSameName whiteSameName = new NextschemaWhiteSameName();
     * whiteSameName.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteSameName.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSameName.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSameName.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteSameName.<span style="color: #CC4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #0000C0">whiteSameNameBhv</span>.<span style="color: #CC4747">update</span>(whiteSameName);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSameName The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(NextschemaWhiteSameName whiteSameName) {
        doUpdate(whiteSameName, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #CC4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param whiteSameName The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(NextschemaWhiteSameName whiteSameName) {
        doInsertOrUpdate(whiteSameName, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * NextschemaWhiteSameName whiteSameName = new NextschemaWhiteSameName();
     * whiteSameName.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteSameName.<span style="color: #CC4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #0000C0">whiteSameNameBhv</span>.<span style="color: #CC4747">delete</span>(whiteSameName);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSameName The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(NextschemaWhiteSameName whiteSameName) {
        doDelete(whiteSameName, null);
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
     *     NextschemaWhiteSameName whiteSameName = new NextschemaWhiteSameName();
     *     whiteSameName.setFooName("foo");
     *     if (...) {
     *         whiteSameName.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteSameNameList.add(whiteSameName);
     * }
     * <span style="color: #0000C0">whiteSameNameBhv</span>.<span style="color: #CC4747">batchInsert</span>(whiteSameNameList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteSameNameList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<NextschemaWhiteSameName> whiteSameNameList) {
        return doBatchInsert(whiteSameNameList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     NextschemaWhiteSameName whiteSameName = new NextschemaWhiteSameName();
     *     whiteSameName.setFooName("foo");
     *     if (...) {
     *         whiteSameName.setFooPrice(123);
     *     } else {
     *         whiteSameName.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteSameName.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteSameNameList.add(whiteSameName);
     * }
     * <span style="color: #0000C0">whiteSameNameBhv</span>.<span style="color: #CC4747">batchUpdate</span>(whiteSameNameList);
     * </pre>
     * @param whiteSameNameList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<NextschemaWhiteSameName> whiteSameNameList) {
        return doBatchUpdate(whiteSameNameList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteSameNameList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<NextschemaWhiteSameName> whiteSameNameList) {
        return doBatchDelete(whiteSameNameList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">whiteSameNameBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;NextschemaWhiteSameName, NextschemaWhiteSameNameCB&gt;() {
     *     public ConditionBean setup(NextschemaWhiteSameName entity, NextschemaWhiteSameNameCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<NextschemaWhiteSameName, NextschemaWhiteSameNameCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * NextschemaWhiteSameName whiteSameName = new NextschemaWhiteSameName();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSameName.setPK...(value);</span>
     * whiteSameName.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSameName.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSameName.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSameName.setVersionNo(value);</span>
     * NextschemaWhiteSameNameCB cb = new NextschemaWhiteSameNameCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whiteSameNameBhv</span>.<span style="color: #CC4747">queryUpdate</span>(whiteSameName, cb);
     * </pre>
     * @param whiteSameName The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of NextschemaWhiteSameName. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(NextschemaWhiteSameName whiteSameName, CBCall<NextschemaWhiteSameNameCB> cbLambda) {
        return doQueryUpdate(whiteSameName, createCB(cbLambda), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * NextschemaWhiteSameName whiteSameName = new NextschemaWhiteSameName();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSameName.setPK...(value);</span>
     * whiteSameName.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSameName.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSameName.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSameName.setVersionNo(value);</span>
     * NextschemaWhiteSameNameCB cb = new NextschemaWhiteSameNameCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whiteSameNameBhv</span>.<span style="color: #CC4747">queryUpdate</span>(whiteSameName, cb);
     * </pre>
     * @param whiteSameName The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of NextschemaWhiteSameName. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(NextschemaWhiteSameName whiteSameName, NextschemaWhiteSameNameCB cb) {
        return doQueryUpdate(whiteSameName, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * NextschemaWhiteSameNameCB cb = new NextschemaWhiteSameNameCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whiteSameNameBhv</span>.<span style="color: #CC4747">queryDelete</span>(whiteSameName, cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of NextschemaWhiteSameName. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<NextschemaWhiteSameNameCB> cbLambda) {
        return doQueryDelete(createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * NextschemaWhiteSameNameCB cb = new NextschemaWhiteSameNameCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whiteSameNameBhv</span>.<span style="color: #CC4747">queryDelete</span>(whiteSameName, cb);
     * </pre>
     * @param cb The condition-bean of NextschemaWhiteSameName. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(NextschemaWhiteSameNameCB cb) {
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
     * NextschemaWhiteSameName whiteSameName = new NextschemaWhiteSameName();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteSameName.setFoo...(value);
     * whiteSameName.setBar...(value);
     * InsertOption<NextschemaWhiteSameNameCB> option = new InsertOption<NextschemaWhiteSameNameCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * <span style="color: #0000C0">whiteSameNameBhv</span>.<span style="color: #CC4747">varyingInsert</span>(whiteSameName, option);
     * ... = whiteSameName.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteSameName The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(NextschemaWhiteSameName whiteSameName, WritableOptionCall<NextschemaWhiteSameNameCB, InsertOption<NextschemaWhiteSameNameCB>> opLambda) {
        doInsert(whiteSameName, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * NextschemaWhiteSameName whiteSameName = new NextschemaWhiteSameName();
     * whiteSameName.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteSameName.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteSameName.<span style="color: #CC4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;NextschemaWhiteSameNameCB&gt; option = new UpdateOption&lt;NextschemaWhiteSameNameCB&gt;();
     *     option.self(new SpecifyQuery&lt;NextschemaWhiteSameNameCB&gt;() {
     *         public void specify(NextschemaWhiteSameNameCB cb) {
     *             cb.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     <span style="color: #0000C0">whiteSameNameBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(whiteSameName, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSameName The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(NextschemaWhiteSameName whiteSameName, WritableOptionCall<NextschemaWhiteSameNameCB, UpdateOption<NextschemaWhiteSameNameCB>> opLambda) {
        doUpdate(whiteSameName, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteSameName The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(NextschemaWhiteSameName whiteSameName, WritableOptionCall<NextschemaWhiteSameNameCB, InsertOption<NextschemaWhiteSameNameCB>> insertOpLambda, WritableOptionCall<NextschemaWhiteSameNameCB, UpdateOption<NextschemaWhiteSameNameCB>> updateOpLambda) {
        doInsertOrUpdate(whiteSameName, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param whiteSameName The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(NextschemaWhiteSameName whiteSameName, WritableOptionCall<NextschemaWhiteSameNameCB, DeleteOption<NextschemaWhiteSameNameCB>> opLambda) {
        doDelete(whiteSameName, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param whiteSameNameList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<NextschemaWhiteSameName> whiteSameNameList, WritableOptionCall<NextschemaWhiteSameNameCB, InsertOption<NextschemaWhiteSameNameCB>> opLambda) {
        return doBatchInsert(whiteSameNameList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteSameNameList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<NextschemaWhiteSameName> whiteSameNameList, WritableOptionCall<NextschemaWhiteSameNameCB, UpdateOption<NextschemaWhiteSameNameCB>> opLambda) {
        return doBatchUpdate(whiteSameNameList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param whiteSameNameList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<NextschemaWhiteSameName> whiteSameNameList, WritableOptionCall<NextschemaWhiteSameNameCB, DeleteOption<NextschemaWhiteSameNameCB>> opLambda) {
        return doBatchDelete(whiteSameNameList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<NextschemaWhiteSameName, NextschemaWhiteSameNameCB> manyArgLambda, WritableOptionCall<NextschemaWhiteSameNameCB, InsertOption<NextschemaWhiteSameNameCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * NextschemaWhiteSameName whiteSameName = new NextschemaWhiteSameName();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSameName.setPK...(value);</span>
     * whiteSameName.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSameName.setVersionNo(value);</span>
     * NextschemaWhiteSameNameCB cb = new NextschemaWhiteSameNameCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;NextschemaWhiteSameNameCB&gt; option = new UpdateOption&lt;NextschemaWhiteSameNameCB&gt;();
     * option.self(new SpecifyQuery&lt;NextschemaWhiteSameNameCB&gt;() {
     *     public void specify(NextschemaWhiteSameNameCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * <span style="color: #0000C0">whiteSameNameBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(whiteSameName, cb, option);
     * </pre>
     * @param whiteSameName The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of NextschemaWhiteSameName. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(NextschemaWhiteSameName whiteSameName, CBCall<NextschemaWhiteSameNameCB> cbLambda, WritableOptionCall<NextschemaWhiteSameNameCB, UpdateOption<NextschemaWhiteSameNameCB>> opLambda) {
        return doQueryUpdate(whiteSameName, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * NextschemaWhiteSameName whiteSameName = new NextschemaWhiteSameName();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSameName.setPK...(value);</span>
     * whiteSameName.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSameName.setVersionNo(value);</span>
     * NextschemaWhiteSameNameCB cb = new NextschemaWhiteSameNameCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;NextschemaWhiteSameNameCB&gt; option = new UpdateOption&lt;NextschemaWhiteSameNameCB&gt;();
     * option.self(new SpecifyQuery&lt;NextschemaWhiteSameNameCB&gt;() {
     *     public void specify(NextschemaWhiteSameNameCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * <span style="color: #0000C0">whiteSameNameBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(whiteSameName, cb, option);
     * </pre>
     * @param whiteSameName The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of NextschemaWhiteSameName. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(NextschemaWhiteSameName whiteSameName, NextschemaWhiteSameNameCB cb, WritableOptionCall<NextschemaWhiteSameNameCB, UpdateOption<NextschemaWhiteSameNameCB>> opLambda) {
        return doQueryUpdate(whiteSameName, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cbLambda The callback for condition-bean of NextschemaWhiteSameName. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<NextschemaWhiteSameNameCB> cbLambda, WritableOptionCall<NextschemaWhiteSameNameCB, DeleteOption<NextschemaWhiteSameNameCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of NextschemaWhiteSameName. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(NextschemaWhiteSameNameCB cb, WritableOptionCall<NextschemaWhiteSameNameCB, DeleteOption<NextschemaWhiteSameNameCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span> 
     * whiteSameNameBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span> 
     * whiteSameNameBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteSameNameBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * whiteSameNameBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteSameNameBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * whiteSameNameBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * whiteSameNameBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span> 
     * whiteSameNameBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * whiteSameNameBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * whiteSameNameBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * whiteSameNameBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * whiteSameNameBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * whiteSameNameBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span> 
     * whiteSameNameBhv.outideSql().removeBlockComment().selectList()
     * whiteSameNameBhv.outideSql().removeLineComment().selectList()
     * whiteSameNameBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<NextschemaWhiteSameNameBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<NextschemaWhiteSameNameBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor(); // variable to resolve generic type
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends NextschemaWhiteSameName> typeOfSelectedEntity() { return NextschemaWhiteSameName.class; }
    protected Class<NextschemaWhiteSameName> typeOfHandlingEntity() { return NextschemaWhiteSameName.class; }
    protected Class<NextschemaWhiteSameNameCB> typeOfHandlingConditionBean() { return NextschemaWhiteSameNameCB.class; }
}
