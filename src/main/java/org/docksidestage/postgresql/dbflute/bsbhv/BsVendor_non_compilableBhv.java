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
 * The behavior of VENDOR-NON COMPILABLE as TABLE. <br>
 * <pre>
 * [primary key]
 *     NON-COMPILABLE ID
 *
 * [column]
 *     NON-COMPILABLE ID, NON COMPILABLE-NAME, PARENT-ID, Next_ParentID
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
 *     VENDOR-NON COMPILABLE
 *
 * [referrer table]
 *     VENDOR-NON COMPILABLE
 *
 * [foreign property]
 *     vendor_non_compilableByNextParentidSelf, vendor_non_compilableByParent_idSelf
 *
 * [referrer property]
 *     vendor_non_compilableByNextParentidSelfList, vendor_non_compilableByParent_idSelfList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendor_non_compilableBhv extends AbstractBehaviorWritable<Vendor_non_compilable, Vendor_non_compilableCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public Vendor_non_compilableDbm asDBMeta() { return Vendor_non_compilableDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "VENDOR-NON COMPILABLE"; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Vendor_non_compilableCB newConditionBean() { return new Vendor_non_compilableCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">vendor_non_compilableBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of Vendor_non_compilable. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<Vendor_non_compilableCB> cbLambda) {
        return facadeSelectCount(createCB(cbLambda));
    }

    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * Vendor_non_compilableCB cb = <span style="color: #70226C">new</span> Vendor_non_compilableCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">vendor_non_compilableBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of Vendor_non_compilable. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(Vendor_non_compilableCB cb) {
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
     * <span style="color: #0000C0">vendor_non_compilableBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">vendor_non_compilable</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">vendor_non_compilable</span>.get...
     * });
     * 
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">vendor_non_compilableBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">vendor_non_compilable</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">vendor_non_compilable</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of Vendor_non_compilable. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<Vendor_non_compilable> selectEntity(CBCall<Vendor_non_compilableCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean. <br>
     * It returns not-null optional entity, so you should ... <br>
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, alwaysPresent().</span> <br>
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, get() after check by isPresent() or orElse(), ...</span>
     * <pre>
     * Vendor_non_compilableCB cb = <span style="color: #70226C">new</span> Vendor_non_compilableCB();
     * cb.query().set...
     * 
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * <span style="color: #0000C0">vendor_non_compilableBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb)}).<span style="color: #CC4747">alwaysPresent</span>(vendor_non_compilable <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = vendor_non_compilable.get...
     * });
     * 
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">vendor_non_compilableBhv</span>.<span style="color: #CC4747">selectEntity</span>(cb).<span style="color: #CC4747">ifPresent</span>(vendor_non_compilable <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = vendor_non_compilable.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cb The condition-bean of Vendor_non_compilable. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<Vendor_non_compilable> selectEntity(Vendor_non_compilableCB cb) {
        return facadeSelectEntity(cb);
    }

    protected OptionalEntity<Vendor_non_compilable> facadeSelectEntity(Vendor_non_compilableCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends Vendor_non_compilable> OptionalEntity<ENTITY> doSelectOptionalEntity(Vendor_non_compilableCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElse(null); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * Vendor_non_compilable <span style="color: #553000">vendor_non_compilable</span> = <span style="color: #0000C0">vendor_non_compilableBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">vendor_non_compilable</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of Vendor_non_compilable. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public Vendor_non_compilable selectEntityWithDeletedCheck(CBCall<Vendor_non_compilableCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * Vendor_non_compilableCB cb = <span style="color: #70226C">new</span> Vendor_non_compilableCB();
     * cb.query().set...;
     * Vendor_non_compilable vendor_non_compilable = <span style="color: #0000C0">vendor_non_compilableBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = vendor_non_compilable.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of Vendor_non_compilable. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public Vendor_non_compilable selectEntityWithDeletedCheck(Vendor_non_compilableCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param non_compilable_id : PK, NotNull, int4(10). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<Vendor_non_compilable> selectByPK(Integer non_compilable_id) {
        return facadeSelectByPK(non_compilable_id);
    }

    protected OptionalEntity<Vendor_non_compilable> facadeSelectByPK(Integer non_compilable_id) {
        return doSelectOptionalByPK(non_compilable_id, typeOfSelectedEntity());
    }

    protected <ENTITY extends Vendor_non_compilable> ENTITY doSelectByPK(Integer non_compilable_id, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(non_compilable_id), tp);
    }

    protected <ENTITY extends Vendor_non_compilable> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer non_compilable_id, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(non_compilable_id, tp), non_compilable_id);
    }

    protected Vendor_non_compilableCB xprepareCBAsPK(Integer non_compilable_id) {
        assertObjectNotNull("non_compilable_id", non_compilable_id);
        return newConditionBean().acceptPK(non_compilable_id);
    }

    /**
     * Select the entity by the unique-key value.
     * @param non_compilable_id : PK, NotNull, int4(10). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<Vendor_non_compilable> selectByUniqueOf(Integer non_compilable_id) {
        return facadeSelectByUniqueOf(non_compilable_id);
    }

    protected OptionalEntity<Vendor_non_compilable> facadeSelectByUniqueOf(Integer non_compilable_id) {
        return doSelectByUniqueOf(non_compilable_id, typeOfSelectedEntity());
    }

    protected <ENTITY extends Vendor_non_compilable> OptionalEntity<ENTITY> doSelectByUniqueOf(Integer non_compilable_id, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(non_compilable_id), tp), non_compilable_id);
    }

    protected Vendor_non_compilableCB xprepareCBAsUniqueOf(Integer non_compilable_id) {
        assertObjectNotNull("non_compilable_id", non_compilable_id);
        return newConditionBean().acceptUniqueOf(non_compilable_id);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;Vendor_non_compilable&gt; <span style="color: #553000">vendor_non_compilableList</span> = <span style="color: #0000C0">vendor_non_compilableBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * <span style="color: #70226C">for</span> (Vendor_non_compilable <span style="color: #553000">vendor_non_compilable</span> : <span style="color: #553000">vendor_non_compilableList</span>) {
     *     ... = <span style="color: #553000">vendor_non_compilable</span>.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of Vendor_non_compilable. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<Vendor_non_compilable> selectList(CBCall<Vendor_non_compilableCB> cbLambda) {
        return facadeSelectList(createCB(cbLambda));
    }

    /**
     * Select the list as result bean.
     * <pre>
     * Vendor_non_compilableCB cb = <span style="color: #70226C">new</span> Vendor_non_compilableCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;Vendor_non_compilable&gt; <span style="color: #553000">vendor_non_compilableList</span> = <span style="color: #0000C0">vendor_non_compilableBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (Vendor_non_compilable vendor_non_compilable : <span style="color: #553000">vendor_non_compilableList</span>) {
     *     ... = vendor_non_compilable.get...;
     * }
     * </pre>
     * @param cb The condition-bean of Vendor_non_compilable. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<Vendor_non_compilable> selectList(Vendor_non_compilableCB cb) {
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
     * PagingResultBean&lt;Vendor_non_compilable&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">vendor_non_compilableBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (Vendor_non_compilable vendor_non_compilable : <span style="color: #553000">page</span>) {
     *     ... = vendor_non_compilable.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of Vendor_non_compilable. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<Vendor_non_compilable> selectPage(CBCall<Vendor_non_compilableCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * Vendor_non_compilableCB cb = <span style="color: #70226C">new</span> Vendor_non_compilableCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;Vendor_non_compilable&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">vendor_non_compilableBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (Vendor_non_compilable vendor_non_compilable : <span style="color: #553000">page</span>) {
     *     ... = vendor_non_compilable.get...();
     * }
     * </pre>
     * @param cb The condition-bean of Vendor_non_compilable. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<Vendor_non_compilable> selectPage(Vendor_non_compilableCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">vendor_non_compilableBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of Vendor_non_compilable. (NotNull)
     * @param entityLambda The handler of entity row of Vendor_non_compilable. (NotNull)
     */
    public void selectCursor(CBCall<Vendor_non_compilableCB> cbLambda, EntityRowHandler<Vendor_non_compilable> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * Vendor_non_compilableCB cb = <span style="color: #70226C">new</span> Vendor_non_compilableCB();
     * cb.query().set...
     * <span style="color: #0000C0">vendor_non_compilableBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of Vendor_non_compilable. (NotNull)
     * @param entityRowHandler The handler of entity row of Vendor_non_compilable. (NotNull)
     */
    public void selectCursor(Vendor_non_compilableCB cb, EntityRowHandler<Vendor_non_compilable> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">vendor_non_compilableBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<Vendor_non_compilableCB, RESULT> selectScalar(Class<RESULT> resultType) {
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
     * @param vendor_non_compilableList The entity list of vendor_non_compilable. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<Vendor_non_compilable> vendor_non_compilableList, ReferrerLoaderHandler<LoaderOfVendor_non_compilable> loaderLambda) {
        xassLRArg(vendor_non_compilableList, loaderLambda);
        loaderLambda.handle(new LoaderOfVendor_non_compilable().ready(vendor_non_compilableList, _behaviorSelector));
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
     * @param vendor_non_compilable The entity of vendor_non_compilable. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(Vendor_non_compilable vendor_non_compilable, ReferrerLoaderHandler<LoaderOfVendor_non_compilable> loaderLambda) {
        xassLRArg(vendor_non_compilable, loaderLambda);
        loaderLambda.handle(new LoaderOfVendor_non_compilable().ready(xnewLRAryLs(vendor_non_compilable), _behaviorSelector));
    }

    /**
     * Load referrer of vendor_non_compilableByNextParentidSelfList by the set-upper of referrer. <br>
     * VENDOR-NON COMPILABLE by Next_ParentID, named 'vendor_non_compilableByNextParentidSelfList'.
     * <pre>
     * <span style="color: #0000C0">vendor_non_compilableBhv</span>.<span style="color: #CC4747">loadVendor_non_compilableByNextParentidSelf</span>(<span style="color: #553000">vendor_non_compilableList</span>, <span style="color: #553000">entityCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">entityCB</span>.setupSelect...
     *     <span style="color: #553000">entityCB</span>.query().set...
     *     <span style="color: #553000">entityCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (Vendor_non_compilable vendor_non_compilable : <span style="color: #553000">vendor_non_compilableList</span>) {
     *     ... = vendor_non_compilable.<span style="color: #CC4747">getVendor_non_compilableByNextParentidSelfList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setNextParentid_InScope(pkList);
     * cb.query().addOrderBy_NextParentid_Asc();
     * </pre>
     * @param vendor_non_compilableList The entity list of vendor_non_compilable. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<Vendor_non_compilable> loadVendor_non_compilableByNextParentidSelf(List<Vendor_non_compilable> vendor_non_compilableList, ConditionBeanSetupper<Vendor_non_compilableCB> refCBLambda) {
        xassLRArg(vendor_non_compilableList, refCBLambda);
        return doLoadVendor_non_compilableByNextParentidSelf(vendor_non_compilableList, new LoadReferrerOption<Vendor_non_compilableCB, Vendor_non_compilable>().xinit(refCBLambda));
    }

    /**
     * Load referrer of vendor_non_compilableByNextParentidSelfList by the set-upper of referrer. <br>
     * VENDOR-NON COMPILABLE by Next_ParentID, named 'vendor_non_compilableByNextParentidSelfList'.
     * <pre>
     * <span style="color: #0000C0">vendor_non_compilableBhv</span>.<span style="color: #CC4747">loadVendor_non_compilableByNextParentidSelf</span>(<span style="color: #553000">vendor_non_compilable</span>, <span style="color: #553000">entityCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">entityCB</span>.setupSelect...
     *     <span style="color: #553000">entityCB</span>.query().set...
     *     <span style="color: #553000">entityCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">vendor_non_compilable</span>.<span style="color: #CC4747">getVendor_non_compilableByNextParentidSelfList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setNextParentid_InScope(pkList);
     * cb.query().addOrderBy_NextParentid_Asc();
     * </pre>
     * @param vendor_non_compilable The entity of vendor_non_compilable. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<Vendor_non_compilable> loadVendor_non_compilableByNextParentidSelf(Vendor_non_compilable vendor_non_compilable, ConditionBeanSetupper<Vendor_non_compilableCB> refCBLambda) {
        xassLRArg(vendor_non_compilable, refCBLambda);
        return doLoadVendor_non_compilableByNextParentidSelf(xnewLRLs(vendor_non_compilable), new LoadReferrerOption<Vendor_non_compilableCB, Vendor_non_compilable>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param vendor_non_compilable The entity of vendor_non_compilable. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<Vendor_non_compilable> loadVendor_non_compilableByNextParentidSelf(Vendor_non_compilable vendor_non_compilable, LoadReferrerOption<Vendor_non_compilableCB, Vendor_non_compilable> loadReferrerOption) {
        xassLRArg(vendor_non_compilable, loadReferrerOption);
        return loadVendor_non_compilableByNextParentidSelf(xnewLRLs(vendor_non_compilable), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param vendor_non_compilableList The entity list of vendor_non_compilable. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<Vendor_non_compilable> loadVendor_non_compilableByNextParentidSelf(List<Vendor_non_compilable> vendor_non_compilableList, LoadReferrerOption<Vendor_non_compilableCB, Vendor_non_compilable> loadReferrerOption) {
        xassLRArg(vendor_non_compilableList, loadReferrerOption);
        if (vendor_non_compilableList.isEmpty()) { return (NestedReferrerListGateway<Vendor_non_compilable>)EMPTY_NREF_LGWAY; }
        return doLoadVendor_non_compilableByNextParentidSelf(vendor_non_compilableList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<Vendor_non_compilable> doLoadVendor_non_compilableByNextParentidSelf(List<Vendor_non_compilable> vendor_non_compilableList, LoadReferrerOption<Vendor_non_compilableCB, Vendor_non_compilable> option) {
        return helpLoadReferrerInternally(vendor_non_compilableList, option, "vendor_non_compilableByNextParentidSelfList");
    }

    /**
     * Load referrer of vendor_non_compilableByParent_idSelfList by the set-upper of referrer. <br>
     * VENDOR-NON COMPILABLE by PARENT-ID, named 'vendor_non_compilableByParent_idSelfList'.
     * <pre>
     * <span style="color: #0000C0">vendor_non_compilableBhv</span>.<span style="color: #CC4747">loadVendor_non_compilableByParent_idSelf</span>(<span style="color: #553000">vendor_non_compilableList</span>, <span style="color: #553000">entityCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">entityCB</span>.setupSelect...
     *     <span style="color: #553000">entityCB</span>.query().set...
     *     <span style="color: #553000">entityCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (Vendor_non_compilable vendor_non_compilable : <span style="color: #553000">vendor_non_compilableList</span>) {
     *     ... = vendor_non_compilable.<span style="color: #CC4747">getVendor_non_compilableByParent_idSelfList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setParent_id_InScope(pkList);
     * cb.query().addOrderBy_Parent_id_Asc();
     * </pre>
     * @param vendor_non_compilableList The entity list of vendor_non_compilable. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<Vendor_non_compilable> loadVendor_non_compilableByParent_idSelf(List<Vendor_non_compilable> vendor_non_compilableList, ConditionBeanSetupper<Vendor_non_compilableCB> refCBLambda) {
        xassLRArg(vendor_non_compilableList, refCBLambda);
        return doLoadVendor_non_compilableByParent_idSelf(vendor_non_compilableList, new LoadReferrerOption<Vendor_non_compilableCB, Vendor_non_compilable>().xinit(refCBLambda));
    }

    /**
     * Load referrer of vendor_non_compilableByParent_idSelfList by the set-upper of referrer. <br>
     * VENDOR-NON COMPILABLE by PARENT-ID, named 'vendor_non_compilableByParent_idSelfList'.
     * <pre>
     * <span style="color: #0000C0">vendor_non_compilableBhv</span>.<span style="color: #CC4747">loadVendor_non_compilableByParent_idSelf</span>(<span style="color: #553000">vendor_non_compilable</span>, <span style="color: #553000">entityCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">entityCB</span>.setupSelect...
     *     <span style="color: #553000">entityCB</span>.query().set...
     *     <span style="color: #553000">entityCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">vendor_non_compilable</span>.<span style="color: #CC4747">getVendor_non_compilableByParent_idSelfList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setParent_id_InScope(pkList);
     * cb.query().addOrderBy_Parent_id_Asc();
     * </pre>
     * @param vendor_non_compilable The entity of vendor_non_compilable. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<Vendor_non_compilable> loadVendor_non_compilableByParent_idSelf(Vendor_non_compilable vendor_non_compilable, ConditionBeanSetupper<Vendor_non_compilableCB> refCBLambda) {
        xassLRArg(vendor_non_compilable, refCBLambda);
        return doLoadVendor_non_compilableByParent_idSelf(xnewLRLs(vendor_non_compilable), new LoadReferrerOption<Vendor_non_compilableCB, Vendor_non_compilable>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param vendor_non_compilable The entity of vendor_non_compilable. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<Vendor_non_compilable> loadVendor_non_compilableByParent_idSelf(Vendor_non_compilable vendor_non_compilable, LoadReferrerOption<Vendor_non_compilableCB, Vendor_non_compilable> loadReferrerOption) {
        xassLRArg(vendor_non_compilable, loadReferrerOption);
        return loadVendor_non_compilableByParent_idSelf(xnewLRLs(vendor_non_compilable), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param vendor_non_compilableList The entity list of vendor_non_compilable. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<Vendor_non_compilable> loadVendor_non_compilableByParent_idSelf(List<Vendor_non_compilable> vendor_non_compilableList, LoadReferrerOption<Vendor_non_compilableCB, Vendor_non_compilable> loadReferrerOption) {
        xassLRArg(vendor_non_compilableList, loadReferrerOption);
        if (vendor_non_compilableList.isEmpty()) { return (NestedReferrerListGateway<Vendor_non_compilable>)EMPTY_NREF_LGWAY; }
        return doLoadVendor_non_compilableByParent_idSelf(vendor_non_compilableList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<Vendor_non_compilable> doLoadVendor_non_compilableByParent_idSelf(List<Vendor_non_compilable> vendor_non_compilableList, LoadReferrerOption<Vendor_non_compilableCB, Vendor_non_compilable> option) {
        return helpLoadReferrerInternally(vendor_non_compilableList, option, "vendor_non_compilableByParent_idSelfList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'Vendor_non_compilable'.
     * @param vendor_non_compilableList The list of vendor_non_compilable. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Vendor_non_compilable> pulloutVendor_non_compilableByNextParentidSelf(List<Vendor_non_compilable> vendor_non_compilableList)
    { return helpPulloutInternally(vendor_non_compilableList, "vendor_non_compilableByNextParentidSelf"); }

    /**
     * Pull out the list of foreign table 'Vendor_non_compilable'.
     * @param vendor_non_compilableList The list of vendor_non_compilable. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Vendor_non_compilable> pulloutVendor_non_compilableByParent_idSelf(List<Vendor_non_compilable> vendor_non_compilableList)
    { return helpPulloutInternally(vendor_non_compilableList, "vendor_non_compilableByParent_idSelf"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key non_compilable_id.
     * @param vendor_non_compilableList The list of vendor_non_compilable. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractNon_compilable_idList(List<Vendor_non_compilable> vendor_non_compilableList)
    { return helpExtractListInternally(vendor_non_compilableList, "non_compilable_id"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * Vendor_non_compilable vendor_non_compilable = <span style="color: #70226C">new</span> Vendor_non_compilable();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendor_non_compilable.setFoo...(value);
     * vendor_non_compilable.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendor_non_compilable.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendor_non_compilable.set...;</span>
     * <span style="color: #0000C0">vendor_non_compilableBhv</span>.<span style="color: #CC4747">insert</span>(vendor_non_compilable);
     * ... = vendor_non_compilable.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param vendor_non_compilable The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(Vendor_non_compilable vendor_non_compilable) {
        doInsert(vendor_non_compilable, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * Vendor_non_compilable vendor_non_compilable = <span style="color: #70226C">new</span> Vendor_non_compilable();
     * vendor_non_compilable.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendor_non_compilable.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendor_non_compilable.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendor_non_compilable.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendor_non_compilable.<span style="color: #CC4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #0000C0">vendor_non_compilableBhv</span>.<span style="color: #CC4747">update</span>(vendor_non_compilable);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendor_non_compilable The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(Vendor_non_compilable vendor_non_compilable) {
        doUpdate(vendor_non_compilable, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #CC4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param vendor_non_compilable The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(Vendor_non_compilable vendor_non_compilable) {
        doInsertOrUpdate(vendor_non_compilable, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * Vendor_non_compilable vendor_non_compilable = <span style="color: #70226C">new</span> Vendor_non_compilable();
     * vendor_non_compilable.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendor_non_compilable.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">vendor_non_compilableBhv</span>.<span style="color: #CC4747">delete</span>(vendor_non_compilable);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendor_non_compilable The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(Vendor_non_compilable vendor_non_compilable) {
        doDelete(vendor_non_compilable, null);
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
     *     Vendor_non_compilable vendor_non_compilable = <span style="color: #70226C">new</span> Vendor_non_compilable();
     *     vendor_non_compilable.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         vendor_non_compilable.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     vendor_non_compilableList.add(vendor_non_compilable);
     * }
     * <span style="color: #0000C0">vendor_non_compilableBhv</span>.<span style="color: #CC4747">batchInsert</span>(vendor_non_compilableList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param vendor_non_compilableList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<Vendor_non_compilable> vendor_non_compilableList) {
        return doBatchInsert(vendor_non_compilableList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     Vendor_non_compilable vendor_non_compilable = <span style="color: #70226C">new</span> Vendor_non_compilable();
     *     vendor_non_compilable.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         vendor_non_compilable.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         vendor_non_compilable.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//vendor_non_compilable.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     vendor_non_compilableList.add(vendor_non_compilable);
     * }
     * <span style="color: #0000C0">vendor_non_compilableBhv</span>.<span style="color: #CC4747">batchUpdate</span>(vendor_non_compilableList);
     * </pre>
     * @param vendor_non_compilableList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<Vendor_non_compilable> vendor_non_compilableList) {
        return doBatchUpdate(vendor_non_compilableList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param vendor_non_compilableList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<Vendor_non_compilable> vendor_non_compilableList) {
        return doBatchDelete(vendor_non_compilableList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">vendor_non_compilableBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;Vendor_non_compilable, Vendor_non_compilableCB&gt;() {
     *     public ConditionBean setup(Vendor_non_compilable entity, Vendor_non_compilableCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<Vendor_non_compilable, Vendor_non_compilableCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * Vendor_non_compilable vendor_non_compilable = <span style="color: #70226C">new</span> Vendor_non_compilable();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendor_non_compilable.setPK...(value);</span>
     * vendor_non_compilable.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendor_non_compilable.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendor_non_compilable.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendor_non_compilable.setVersionNo(value);</span>
     * Vendor_non_compilableCB cb = <span style="color: #70226C">new</span> Vendor_non_compilableCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">vendor_non_compilableBhv</span>.<span style="color: #CC4747">queryUpdate</span>(vendor_non_compilable, cb);
     * </pre>
     * @param vendor_non_compilable The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of Vendor_non_compilable. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(Vendor_non_compilable vendor_non_compilable, CBCall<Vendor_non_compilableCB> cbLambda) {
        return doQueryUpdate(vendor_non_compilable, createCB(cbLambda), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * Vendor_non_compilable vendor_non_compilable = <span style="color: #70226C">new</span> Vendor_non_compilable();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendor_non_compilable.setPK...(value);</span>
     * vendor_non_compilable.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendor_non_compilable.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendor_non_compilable.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendor_non_compilable.setVersionNo(value);</span>
     * Vendor_non_compilableCB cb = <span style="color: #70226C">new</span> Vendor_non_compilableCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">vendor_non_compilableBhv</span>.<span style="color: #CC4747">queryUpdate</span>(vendor_non_compilable, cb);
     * </pre>
     * @param vendor_non_compilable The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of Vendor_non_compilable. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(Vendor_non_compilable vendor_non_compilable, Vendor_non_compilableCB cb) {
        return doQueryUpdate(vendor_non_compilable, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * Vendor_non_compilableCB cb = new Vendor_non_compilableCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">vendor_non_compilableBhv</span>.<span style="color: #CC4747">queryDelete</span>(vendor_non_compilable, cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of Vendor_non_compilable. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<Vendor_non_compilableCB> cbLambda) {
        return doQueryDelete(createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * Vendor_non_compilableCB cb = new Vendor_non_compilableCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">vendor_non_compilableBhv</span>.<span style="color: #CC4747">queryDelete</span>(vendor_non_compilable, cb);
     * </pre>
     * @param cb The condition-bean of Vendor_non_compilable. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(Vendor_non_compilableCB cb) {
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
     * Vendor_non_compilable vendor_non_compilable = <span style="color: #70226C">new</span> Vendor_non_compilable();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendor_non_compilable.setFoo...(value);
     * vendor_non_compilable.setBar...(value);
     * InsertOption&lt;Vendor_non_compilableCB&gt; option = new InsertOption&lt;Vendor_non_compilableCB&gt;();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * <span style="color: #0000C0">vendor_non_compilableBhv</span>.<span style="color: #CC4747">varyingInsert</span>(vendor_non_compilable, option);
     * ... = vendor_non_compilable.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param vendor_non_compilable The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(Vendor_non_compilable vendor_non_compilable, WritableOptionCall<Vendor_non_compilableCB, InsertOption<Vendor_non_compilableCB>> opLambda) {
        doInsert(vendor_non_compilable, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * Vendor_non_compilable vendor_non_compilable = <span style="color: #70226C">new</span> Vendor_non_compilable();
     * vendor_non_compilable.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendor_non_compilable.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendor_non_compilable.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;Vendor_non_compilableCB&gt; option = new UpdateOption&lt;Vendor_non_compilableCB&gt;();
     *     option.self(new SpecifyQuery&lt;Vendor_non_compilableCB&gt;() {
     *         public void specify(Vendor_non_compilableCB cb) {
     *             cb.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     <span style="color: #0000C0">vendor_non_compilableBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(vendor_non_compilable, option);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendor_non_compilable The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(Vendor_non_compilable vendor_non_compilable, WritableOptionCall<Vendor_non_compilableCB, UpdateOption<Vendor_non_compilableCB>> opLambda) {
        doUpdate(vendor_non_compilable, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param vendor_non_compilable The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(Vendor_non_compilable vendor_non_compilable, WritableOptionCall<Vendor_non_compilableCB, InsertOption<Vendor_non_compilableCB>> insertOpLambda, WritableOptionCall<Vendor_non_compilableCB, UpdateOption<Vendor_non_compilableCB>> updateOpLambda) {
        doInsertOrUpdate(vendor_non_compilable, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param vendor_non_compilable The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(Vendor_non_compilable vendor_non_compilable, WritableOptionCall<Vendor_non_compilableCB, DeleteOption<Vendor_non_compilableCB>> opLambda) {
        doDelete(vendor_non_compilable, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param vendor_non_compilableList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<Vendor_non_compilable> vendor_non_compilableList, WritableOptionCall<Vendor_non_compilableCB, InsertOption<Vendor_non_compilableCB>> opLambda) {
        return doBatchInsert(vendor_non_compilableList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param vendor_non_compilableList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<Vendor_non_compilable> vendor_non_compilableList, WritableOptionCall<Vendor_non_compilableCB, UpdateOption<Vendor_non_compilableCB>> opLambda) {
        return doBatchUpdate(vendor_non_compilableList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param vendor_non_compilableList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<Vendor_non_compilable> vendor_non_compilableList, WritableOptionCall<Vendor_non_compilableCB, DeleteOption<Vendor_non_compilableCB>> opLambda) {
        return doBatchDelete(vendor_non_compilableList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<Vendor_non_compilable, Vendor_non_compilableCB> manyArgLambda, WritableOptionCall<Vendor_non_compilableCB, InsertOption<Vendor_non_compilableCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * Vendor_non_compilable vendor_non_compilable = <span style="color: #70226C">new</span> Vendor_non_compilable();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendor_non_compilable.setPK...(value);</span>
     * vendor_non_compilable.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendor_non_compilable.setVersionNo(value);</span>
     * Vendor_non_compilableCB cb = new Vendor_non_compilableCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;Vendor_non_compilableCB&gt; option = <span style="color: #70226C">new</span> UpdateOption&lt;Vendor_non_compilableCB&gt;();
     * option.self(new SpecifyQuery&lt;Vendor_non_compilableCB&gt;() {
     *     public void specify(Vendor_non_compilableCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * <span style="color: #0000C0">vendor_non_compilableBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(vendor_non_compilable, cb, option);
     * </pre>
     * @param vendor_non_compilable The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of Vendor_non_compilable. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(Vendor_non_compilable vendor_non_compilable, CBCall<Vendor_non_compilableCB> cbLambda, WritableOptionCall<Vendor_non_compilableCB, UpdateOption<Vendor_non_compilableCB>> opLambda) {
        return doQueryUpdate(vendor_non_compilable, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * Vendor_non_compilable vendor_non_compilable = <span style="color: #70226C">new</span> Vendor_non_compilable();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendor_non_compilable.setPK...(value);</span>
     * vendor_non_compilable.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendor_non_compilable.setVersionNo(value);</span>
     * Vendor_non_compilableCB cb = <span style="color: #70226C">new</span> Vendor_non_compilableCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;Vendor_non_compilableCB&gt; option = <span style="color: #70226C">new</span> UpdateOption&lt;Vendor_non_compilableCB&gt;();
     * option.self(new SpecifyQuery&lt;Vendor_non_compilableCB&gt;() {
     *     public void specify(Vendor_non_compilableCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * <span style="color: #0000C0">vendor_non_compilableBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(vendor_non_compilable, cb, option);
     * </pre>
     * @param vendor_non_compilable The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of Vendor_non_compilable. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(Vendor_non_compilable vendor_non_compilable, Vendor_non_compilableCB cb, WritableOptionCall<Vendor_non_compilableCB, UpdateOption<Vendor_non_compilableCB>> opLambda) {
        return doQueryUpdate(vendor_non_compilable, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cbLambda The callback for condition-bean of Vendor_non_compilable. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<Vendor_non_compilableCB> cbLambda, WritableOptionCall<Vendor_non_compilableCB, DeleteOption<Vendor_non_compilableCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of Vendor_non_compilable. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(Vendor_non_compilableCB cb, WritableOptionCall<Vendor_non_compilableCB, DeleteOption<Vendor_non_compilableCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span> 
     * vendor_non_compilableBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span> 
     * vendor_non_compilableBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * vendor_non_compilableBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * vendor_non_compilableBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * vendor_non_compilableBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * vendor_non_compilableBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * vendor_non_compilableBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span> 
     * vendor_non_compilableBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * vendor_non_compilableBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * vendor_non_compilableBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * vendor_non_compilableBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * vendor_non_compilableBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * vendor_non_compilableBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span> 
     * vendor_non_compilableBhv.outideSql().removeBlockComment().selectList()
     * vendor_non_compilableBhv.outideSql().removeLineComment().selectList()
     * vendor_non_compilableBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlAllFacadeExecutor<Vendor_non_compilableBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends Vendor_non_compilable> typeOfSelectedEntity() { return Vendor_non_compilable.class; }
    protected Class<Vendor_non_compilable> typeOfHandlingEntity() { return Vendor_non_compilable.class; }
    protected Class<Vendor_non_compilableCB> typeOfHandlingConditionBean() { return Vendor_non_compilableCB.class; }
}
