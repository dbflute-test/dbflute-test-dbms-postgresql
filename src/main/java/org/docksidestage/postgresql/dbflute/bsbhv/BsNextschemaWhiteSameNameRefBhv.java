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
 * The behavior of nextschema.white_same_name_ref as TABLE. <br>
 * <pre>
 * [primary key]
 *     same_name_ref_id
 *
 * [column]
 *     same_name_ref_id, same_name_id, next_ref_date
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
 *     white_same_name
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whiteSameName
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsNextschemaWhiteSameNameRefBhv extends AbstractBehaviorWritable<NextschemaWhiteSameNameRef, NextschemaWhiteSameNameRefCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public NextschemaWhiteSameNameRefDbm asDBMeta() { return NextschemaWhiteSameNameRefDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "nextschema.white_same_name_ref"; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public NextschemaWhiteSameNameRefCB newConditionBean() { return new NextschemaWhiteSameNameRefCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">whiteSameNameRefBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of NextschemaWhiteSameNameRef. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<NextschemaWhiteSameNameRefCB> cbLambda) {
        return facadeSelectCount(createCB(cbLambda));
    }

    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * NextschemaWhiteSameNameRefCB cb = <span style="color: #70226C">new</span> NextschemaWhiteSameNameRefCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">whiteSameNameRefBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of NextschemaWhiteSameNameRef. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(NextschemaWhiteSameNameRefCB cb) {
        return facadeSelectCount(cb);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean. <br>
     * It returns not-null optional entity, so you should ... <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, alwaysPresent().</span> <br>
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, isPresent() and orElse(), ...</span>
     * <pre>
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * <span style="color: #0000C0">whiteSameNameRefBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">whiteSameNameRef</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">whiteSameNameRef</span>.get...
     * });
     * 
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">whiteSameNameRefBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">whiteSameNameRef</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">whiteSameNameRef</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of NextschemaWhiteSameNameRef. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<NextschemaWhiteSameNameRef> selectEntity(CBCall<NextschemaWhiteSameNameRefCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean. <br>
     * It returns not-null optional entity, so you should ... <br>
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, alwaysPresent().</span> <br>
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, get() after check by isPresent() or orElse(), ...</span>
     * <pre>
     * NextschemaWhiteSameNameRefCB cb = <span style="color: #70226C">new</span> NextschemaWhiteSameNameRefCB();
     * cb.query().set...
     * 
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * <span style="color: #0000C0">whiteSameNameRefBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb)}).<span style="color: #CC4747">alwaysPresent</span>(whiteSameNameRef <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = whiteSameNameRef.get...
     * });
     * 
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">whiteSameNameRefBhv</span>.<span style="color: #CC4747">selectEntity</span>(cb).<span style="color: #CC4747">ifPresent</span>(whiteSameNameRef <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = whiteSameNameRef.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cb The condition-bean of NextschemaWhiteSameNameRef. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<NextschemaWhiteSameNameRef> selectEntity(NextschemaWhiteSameNameRefCB cb) {
        return facadeSelectEntity(cb);
    }

    protected OptionalEntity<NextschemaWhiteSameNameRef> facadeSelectEntity(NextschemaWhiteSameNameRefCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends NextschemaWhiteSameNameRef> OptionalEntity<ENTITY> doSelectOptionalEntity(NextschemaWhiteSameNameRefCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElse(null); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * NextschemaWhiteSameNameRef <span style="color: #553000">whiteSameNameRef</span> = <span style="color: #0000C0">whiteSameNameRefBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">whiteSameNameRef</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of NextschemaWhiteSameNameRef. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public NextschemaWhiteSameNameRef selectEntityWithDeletedCheck(CBCall<NextschemaWhiteSameNameRefCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * NextschemaWhiteSameNameRefCB cb = <span style="color: #70226C">new</span> NextschemaWhiteSameNameRefCB();
     * cb.query().set...;
     * NextschemaWhiteSameNameRef whiteSameNameRef = <span style="color: #0000C0">whiteSameNameRefBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = whiteSameNameRef.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of NextschemaWhiteSameNameRef. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public NextschemaWhiteSameNameRef selectEntityWithDeletedCheck(NextschemaWhiteSameNameRefCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param sameNameRefId : PK, NotNull, int8(19). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<NextschemaWhiteSameNameRef> selectByPK(Long sameNameRefId) {
        return facadeSelectByPK(sameNameRefId);
    }

    protected OptionalEntity<NextschemaWhiteSameNameRef> facadeSelectByPK(Long sameNameRefId) {
        return doSelectOptionalByPK(sameNameRefId, typeOfSelectedEntity());
    }

    protected <ENTITY extends NextschemaWhiteSameNameRef> ENTITY doSelectByPK(Long sameNameRefId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(sameNameRefId), tp);
    }

    protected <ENTITY extends NextschemaWhiteSameNameRef> OptionalEntity<ENTITY> doSelectOptionalByPK(Long sameNameRefId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(sameNameRefId, tp), sameNameRefId);
    }

    protected NextschemaWhiteSameNameRefCB xprepareCBAsPK(Long sameNameRefId) {
        assertObjectNotNull("sameNameRefId", sameNameRefId);
        return newConditionBean().acceptPK(sameNameRefId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;NextschemaWhiteSameNameRef&gt; <span style="color: #553000">whiteSameNameRefList</span> = <span style="color: #0000C0">whiteSameNameRefBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * <span style="color: #70226C">for</span> (NextschemaWhiteSameNameRef <span style="color: #553000">whiteSameNameRef</span> : <span style="color: #553000">whiteSameNameRefList</span>) {
     *     ... = <span style="color: #553000">whiteSameNameRef</span>.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of NextschemaWhiteSameNameRef. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<NextschemaWhiteSameNameRef> selectList(CBCall<NextschemaWhiteSameNameRefCB> cbLambda) {
        return facadeSelectList(createCB(cbLambda));
    }

    /**
     * Select the list as result bean.
     * <pre>
     * NextschemaWhiteSameNameRefCB cb = <span style="color: #70226C">new</span> NextschemaWhiteSameNameRefCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;NextschemaWhiteSameNameRef&gt; <span style="color: #553000">whiteSameNameRefList</span> = <span style="color: #0000C0">whiteSameNameRefBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (NextschemaWhiteSameNameRef whiteSameNameRef : <span style="color: #553000">whiteSameNameRefList</span>) {
     *     ... = whiteSameNameRef.get...;
     * }
     * </pre>
     * @param cb The condition-bean of NextschemaWhiteSameNameRef. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<NextschemaWhiteSameNameRef> selectList(NextschemaWhiteSameNameRefCB cb) {
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
     * PagingResultBean&lt;NextschemaWhiteSameNameRef&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">whiteSameNameRefBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (NextschemaWhiteSameNameRef whiteSameNameRef : <span style="color: #553000">page</span>) {
     *     ... = whiteSameNameRef.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of NextschemaWhiteSameNameRef. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<NextschemaWhiteSameNameRef> selectPage(CBCall<NextschemaWhiteSameNameRefCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * NextschemaWhiteSameNameRefCB cb = <span style="color: #70226C">new</span> NextschemaWhiteSameNameRefCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;NextschemaWhiteSameNameRef&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">whiteSameNameRefBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (NextschemaWhiteSameNameRef whiteSameNameRef : <span style="color: #553000">page</span>) {
     *     ... = whiteSameNameRef.get...();
     * }
     * </pre>
     * @param cb The condition-bean of NextschemaWhiteSameNameRef. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<NextschemaWhiteSameNameRef> selectPage(NextschemaWhiteSameNameRefCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">whiteSameNameRefBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of NextschemaWhiteSameNameRef. (NotNull)
     * @param entityLambda The handler of entity row of NextschemaWhiteSameNameRef. (NotNull)
     */
    public void selectCursor(CBCall<NextschemaWhiteSameNameRefCB> cbLambda, EntityRowHandler<NextschemaWhiteSameNameRef> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * NextschemaWhiteSameNameRefCB cb = <span style="color: #70226C">new</span> NextschemaWhiteSameNameRefCB();
     * cb.query().set...
     * <span style="color: #0000C0">whiteSameNameRefBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of NextschemaWhiteSameNameRef. (NotNull)
     * @param entityRowHandler The handler of entity row of NextschemaWhiteSameNameRef. (NotNull)
     */
    public void selectCursor(NextschemaWhiteSameNameRefCB cb, EntityRowHandler<NextschemaWhiteSameNameRef> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">whiteSameNameRefBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<NextschemaWhiteSameNameRefCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    // ===================================================================================
    //                                                                            Sequence
    //                                                                            ========
    @Override
    protected Number doReadNextVal() {
        String msg = "This table is NOT related to sequence: " + asTableDbName();
        throw new UnsupportedOperationException(msg);
    }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    /**
     * Load referrer for the list by the referrer loader.
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
     * @param whiteSameNameRefList The entity list of whiteSameNameRef. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<NextschemaWhiteSameNameRef> whiteSameNameRefList, ReferrerLoaderHandler<LoaderOfNextschemaWhiteSameNameRef> loaderLambda) {
        xassLRArg(whiteSameNameRefList, loaderLambda);
        loaderLambda.handle(new LoaderOfNextschemaWhiteSameNameRef().ready(whiteSameNameRefList, _behaviorSelector));
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
     * @param whiteSameNameRef The entity of whiteSameNameRef. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(NextschemaWhiteSameNameRef whiteSameNameRef, ReferrerLoaderHandler<LoaderOfNextschemaWhiteSameNameRef> loaderLambda) {
        xassLRArg(whiteSameNameRef, loaderLambda);
        loaderLambda.handle(new LoaderOfNextschemaWhiteSameNameRef().ready(xnewLRAryLs(whiteSameNameRef), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'NextschemaWhiteSameName'.
     * @param whiteSameNameRefList The list of whiteSameNameRef. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<NextschemaWhiteSameName> pulloutWhiteSameName(List<NextschemaWhiteSameNameRef> whiteSameNameRefList)
    { return helpPulloutInternally(whiteSameNameRefList, "whiteSameName"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key sameNameRefId.
     * @param whiteSameNameRefList The list of whiteSameNameRef. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractSameNameRefIdList(List<NextschemaWhiteSameNameRef> whiteSameNameRefList)
    { return helpExtractListInternally(whiteSameNameRefList, "sameNameRefId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * NextschemaWhiteSameNameRef whiteSameNameRef = <span style="color: #70226C">new</span> NextschemaWhiteSameNameRef();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteSameNameRef.setFoo...(value);
     * whiteSameNameRef.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSameNameRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSameNameRef.set...;</span>
     * <span style="color: #0000C0">whiteSameNameRefBhv</span>.<span style="color: #CC4747">insert</span>(whiteSameNameRef);
     * ... = whiteSameNameRef.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param whiteSameNameRef The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(NextschemaWhiteSameNameRef whiteSameNameRef) {
        doInsert(whiteSameNameRef, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * NextschemaWhiteSameNameRef whiteSameNameRef = <span style="color: #70226C">new</span> NextschemaWhiteSameNameRef();
     * whiteSameNameRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteSameNameRef.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSameNameRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSameNameRef.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteSameNameRef.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">whiteSameNameRefBhv</span>.<span style="color: #CC4747">update</span>(whiteSameNameRef);
     * </pre>
     * @param whiteSameNameRef The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(NextschemaWhiteSameNameRef whiteSameNameRef) {
        doUpdate(whiteSameNameRef, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param whiteSameNameRef The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(NextschemaWhiteSameNameRef whiteSameNameRef) {
        doInsertOrUpdate(whiteSameNameRef, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * NextschemaWhiteSameNameRef whiteSameNameRef = <span style="color: #70226C">new</span> NextschemaWhiteSameNameRef();
     * whiteSameNameRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteSameNameRef.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">whiteSameNameRefBhv</span>.<span style="color: #CC4747">delete</span>(whiteSameNameRef);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param whiteSameNameRef The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(NextschemaWhiteSameNameRef whiteSameNameRef) {
        doDelete(whiteSameNameRef, null);
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
     *     NextschemaWhiteSameNameRef whiteSameNameRef = <span style="color: #70226C">new</span> NextschemaWhiteSameNameRef();
     *     whiteSameNameRef.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         whiteSameNameRef.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     whiteSameNameRefList.add(whiteSameNameRef);
     * }
     * <span style="color: #0000C0">whiteSameNameRefBhv</span>.<span style="color: #CC4747">batchInsert</span>(whiteSameNameRefList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param whiteSameNameRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<NextschemaWhiteSameNameRef> whiteSameNameRefList) {
        return doBatchInsert(whiteSameNameRefList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     NextschemaWhiteSameNameRef whiteSameNameRef = <span style="color: #70226C">new</span> NextschemaWhiteSameNameRef();
     *     whiteSameNameRef.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         whiteSameNameRef.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         whiteSameNameRef.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//whiteSameNameRef.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     whiteSameNameRefList.add(whiteSameNameRef);
     * }
     * <span style="color: #0000C0">whiteSameNameRefBhv</span>.<span style="color: #CC4747">batchUpdate</span>(whiteSameNameRefList);
     * </pre>
     * @param whiteSameNameRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<NextschemaWhiteSameNameRef> whiteSameNameRefList) {
        return doBatchUpdate(whiteSameNameRefList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param whiteSameNameRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<NextschemaWhiteSameNameRef> whiteSameNameRefList) {
        return doBatchDelete(whiteSameNameRefList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">whiteSameNameRefBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;NextschemaWhiteSameNameRef, NextschemaWhiteSameNameRefCB&gt;() {
     *     public ConditionBean setup(NextschemaWhiteSameNameRef entity, NextschemaWhiteSameNameRefCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<NextschemaWhiteSameNameRef, NextschemaWhiteSameNameRefCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * NextschemaWhiteSameNameRef whiteSameNameRef = <span style="color: #70226C">new</span> NextschemaWhiteSameNameRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSameNameRef.setPK...(value);</span>
     * whiteSameNameRef.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSameNameRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSameNameRef.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSameNameRef.setVersionNo(value);</span>
     * <span style="color: #0000C0">whiteSameNameRefBhv</span>.<span style="color: #CC4747">queryUpdate</span>(whiteSameNameRef, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param whiteSameNameRef The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of NextschemaWhiteSameNameRef. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(NextschemaWhiteSameNameRef whiteSameNameRef, CBCall<NextschemaWhiteSameNameRefCB> cbLambda) {
        return doQueryUpdate(whiteSameNameRef, createCB(cbLambda), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * NextschemaWhiteSameNameRef whiteSameNameRef = <span style="color: #70226C">new</span> NextschemaWhiteSameNameRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSameNameRef.setPK...(value);</span>
     * whiteSameNameRef.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//whiteSameNameRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//whiteSameNameRef.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSameNameRef.setVersionNo(value);</span>
     * NextschemaWhiteSameNameRefCB cb = <span style="color: #70226C">new</span> NextschemaWhiteSameNameRefCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whiteSameNameRefBhv</span>.<span style="color: #CC4747">queryUpdate</span>(whiteSameNameRef, cb);
     * </pre>
     * @param whiteSameNameRef The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of NextschemaWhiteSameNameRef. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(NextschemaWhiteSameNameRef whiteSameNameRef, NextschemaWhiteSameNameRefCB cb) {
        return doQueryUpdate(whiteSameNameRef, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * <span style="color: #0000C0">whiteSameNameRefBhv</span>.<span style="color: #CC4747">queryDelete</span>(whiteSameNameRef, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of NextschemaWhiteSameNameRef. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<NextschemaWhiteSameNameRefCB> cbLambda) {
        return doQueryDelete(createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * NextschemaWhiteSameNameRefCB cb = new NextschemaWhiteSameNameRefCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whiteSameNameRefBhv</span>.<span style="color: #CC4747">queryDelete</span>(whiteSameNameRef, cb);
     * </pre>
     * @param cb The condition-bean of NextschemaWhiteSameNameRef. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(NextschemaWhiteSameNameRefCB cb) {
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
     * NextschemaWhiteSameNameRef whiteSameNameRef = <span style="color: #70226C">new</span> NextschemaWhiteSameNameRef();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * whiteSameNameRef.setFoo...(value);
     * whiteSameNameRef.setBar...(value);
     * <span style="color: #0000C0">whiteSameNameRefBhv</span>.<span style="color: #CC4747">varyingInsert</span>(whiteSameNameRef, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = whiteSameNameRef.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param whiteSameNameRef The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(NextschemaWhiteSameNameRef whiteSameNameRef, WritableOptionCall<NextschemaWhiteSameNameRefCB, InsertOption<NextschemaWhiteSameNameRefCB>> opLambda) {
        doInsert(whiteSameNameRef, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * NextschemaWhiteSameNameRef whiteSameNameRef = <span style="color: #70226C">new</span> NextschemaWhiteSameNameRef();
     * whiteSameNameRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * whiteSameNameRef.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * whiteSameNameRef.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">whiteSameNameRefBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(whiteSameNameRef, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param whiteSameNameRef The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(NextschemaWhiteSameNameRef whiteSameNameRef, WritableOptionCall<NextschemaWhiteSameNameRefCB, UpdateOption<NextschemaWhiteSameNameRefCB>> opLambda) {
        doUpdate(whiteSameNameRef, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param whiteSameNameRef The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(NextschemaWhiteSameNameRef whiteSameNameRef, WritableOptionCall<NextschemaWhiteSameNameRefCB, InsertOption<NextschemaWhiteSameNameRefCB>> insertOpLambda, WritableOptionCall<NextschemaWhiteSameNameRefCB, UpdateOption<NextschemaWhiteSameNameRefCB>> updateOpLambda) {
        doInsertOrUpdate(whiteSameNameRef, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param whiteSameNameRef The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(NextschemaWhiteSameNameRef whiteSameNameRef, WritableOptionCall<NextschemaWhiteSameNameRefCB, DeleteOption<NextschemaWhiteSameNameRefCB>> opLambda) {
        doDelete(whiteSameNameRef, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param whiteSameNameRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<NextschemaWhiteSameNameRef> whiteSameNameRefList, WritableOptionCall<NextschemaWhiteSameNameRefCB, InsertOption<NextschemaWhiteSameNameRefCB>> opLambda) {
        return doBatchInsert(whiteSameNameRefList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param whiteSameNameRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<NextschemaWhiteSameNameRef> whiteSameNameRefList, WritableOptionCall<NextschemaWhiteSameNameRefCB, UpdateOption<NextschemaWhiteSameNameRefCB>> opLambda) {
        return doBatchUpdate(whiteSameNameRefList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param whiteSameNameRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<NextschemaWhiteSameNameRef> whiteSameNameRefList, WritableOptionCall<NextschemaWhiteSameNameRefCB, DeleteOption<NextschemaWhiteSameNameRefCB>> opLambda) {
        return doBatchDelete(whiteSameNameRefList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<NextschemaWhiteSameNameRef, NextschemaWhiteSameNameRefCB> manyArgLambda, WritableOptionCall<NextschemaWhiteSameNameRefCB, InsertOption<NextschemaWhiteSameNameRefCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * NextschemaWhiteSameNameRef whiteSameNameRef = <span style="color: #70226C">new</span> NextschemaWhiteSameNameRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSameNameRef.setPK...(value);</span>
     * whiteSameNameRef.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSameNameRef.setVersionNo(value);</span>
     * <span style="color: #0000C0">whiteSameNameRefBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(whiteSameNameRef, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param whiteSameNameRef The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of NextschemaWhiteSameNameRef. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(NextschemaWhiteSameNameRef whiteSameNameRef, CBCall<NextschemaWhiteSameNameRefCB> cbLambda, WritableOptionCall<NextschemaWhiteSameNameRefCB, UpdateOption<NextschemaWhiteSameNameRefCB>> opLambda) {
        return doQueryUpdate(whiteSameNameRef, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * NextschemaWhiteSameNameRef whiteSameNameRef = <span style="color: #70226C">new</span> NextschemaWhiteSameNameRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//whiteSameNameRef.setPK...(value);</span>
     * whiteSameNameRef.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//whiteSameNameRef.setVersionNo(value);</span>
     * NextschemaWhiteSameNameRefCB cb = <span style="color: #70226C">new</span> NextschemaWhiteSameNameRefCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">whiteSameNameRefBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(whiteSameNameRef, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param whiteSameNameRef The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of NextschemaWhiteSameNameRef. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(NextschemaWhiteSameNameRef whiteSameNameRef, NextschemaWhiteSameNameRefCB cb, WritableOptionCall<NextschemaWhiteSameNameRefCB, UpdateOption<NextschemaWhiteSameNameRefCB>> opLambda) {
        return doQueryUpdate(whiteSameNameRef, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * <pre>
     * <span style="color: #0000C0">whiteSameNameRefBhv</span>.<span style="color: #CC4747">queryDelete</span>(whiteSameNameRef, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of NextschemaWhiteSameNameRef. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<NextschemaWhiteSameNameRefCB> cbLambda, WritableOptionCall<NextschemaWhiteSameNameRefCB, DeleteOption<NextschemaWhiteSameNameRefCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of NextschemaWhiteSameNameRef. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(NextschemaWhiteSameNameRefCB cb, WritableOptionCall<NextschemaWhiteSameNameRefCB, DeleteOption<NextschemaWhiteSameNameRefCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span> 
     * whiteSameNameRefBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span> 
     * whiteSameNameRefBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteSameNameRefBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * whiteSameNameRefBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * whiteSameNameRefBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * whiteSameNameRefBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * whiteSameNameRefBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span> 
     * whiteSameNameRefBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * whiteSameNameRefBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * whiteSameNameRefBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * whiteSameNameRefBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * whiteSameNameRefBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * whiteSameNameRefBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span> 
     * whiteSameNameRefBhv.outideSql().removeBlockComment().selectList()
     * whiteSameNameRefBhv.outideSql().removeLineComment().selectList()
     * whiteSameNameRefBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlAllFacadeExecutor<NextschemaWhiteSameNameRefBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends NextschemaWhiteSameNameRef> typeOfSelectedEntity() { return NextschemaWhiteSameNameRef.class; }
    protected Class<NextschemaWhiteSameNameRef> typeOfHandlingEntity() { return NextschemaWhiteSameNameRef.class; }
    protected Class<NextschemaWhiteSameNameRefCB> typeOfHandlingConditionBean() { return NextschemaWhiteSameNameRefCB.class; }
}
