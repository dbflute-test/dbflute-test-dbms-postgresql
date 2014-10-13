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
 * The behavior of vendor_inherit_inu as TABLE. <br />
 * <pre>
 * [primary key]
 *     inu_id
 *
 * [column]
 *     inu_id, inu_name, inu_date
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
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendorInheritInuBhv extends AbstractBehaviorWritable<VendorInheritInu, VendorInheritInuCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public VendorInheritInuDbm getDBMeta() { return VendorInheritInuDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public VendorInheritInuCB newConditionBean() { return new VendorInheritInuCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * VendorInheritInuCB cb = new VendorInheritInuCB();
     * cb.query().setFoo...(value);
     * int count = vendorInheritInuBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of VendorInheritInu. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<VendorInheritInuCB> cbLambda) {
        return facadeSelectCount(handleCBCall(cbLambda));
    }

    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * VendorInheritInuCB cb = new VendorInheritInuCB();
     * cb.query().setFoo...(value);
     * int count = vendorInheritInuBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of VendorInheritInu. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(VendorInheritInuCB cb) {
        return facadeSelectCount(cb);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean. #beforejava8 <br />
     * <span style="color: #AD4747; font-size: 120%">The return might be null if no data, so you should have null check.</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, use selectEntityWithDeletedCheck().</span>
     * <pre>
     * VendorInheritInuCB cb = new VendorInheritInuCB();
     * cb.query().setFoo...(value);
     * VendorInheritInu vendorInheritInu = vendorInheritInuBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (vendorInheritInu != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = vendorInheritInu.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of VendorInheritInu. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorInheritInu selectEntity(CBCall<VendorInheritInuCB> cbLambda) {
        return facadeSelectEntity(handleCBCall(cbLambda));
    }

    /**
     * Select the entity by the condition-bean. #beforejava8 <br />
     * <span style="color: #AD4747; font-size: 120%">The return might be null if no data, so you should have null check.</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, use selectEntityWithDeletedCheck().</span>
     * <pre>
     * VendorInheritInuCB cb = new VendorInheritInuCB();
     * cb.query().setFoo...(value);
     * VendorInheritInu vendorInheritInu = vendorInheritInuBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (vendorInheritInu != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = vendorInheritInu.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of VendorInheritInu. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorInheritInu selectEntity(VendorInheritInuCB cb) {
        return facadeSelectEntity(cb);
    }

    protected VendorInheritInu facadeSelectEntity(VendorInheritInuCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorInheritInu> OptionalEntity<ENTITY> doSelectOptionalEntity(VendorInheritInuCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * VendorInheritInuCB cb = new VendorInheritInuCB();
     * cb.query().setFoo...(value);
     * VendorInheritInu vendorInheritInu = vendorInheritInuBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = vendorInheritInu.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of VendorInheritInu. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorInheritInu selectEntityWithDeletedCheck(CBCall<VendorInheritInuCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(handleCBCall(cbLambda));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * VendorInheritInuCB cb = new VendorInheritInuCB();
     * cb.query().setFoo...(value);
     * VendorInheritInu vendorInheritInu = vendorInheritInuBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = vendorInheritInu.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of VendorInheritInu. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorInheritInu selectEntityWithDeletedCheck(VendorInheritInuCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param inuId : PK, NotNull, int4(10). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorInheritInu selectByPK(Integer inuId) {
        return facadeSelectByPK(inuId);
    }

    protected VendorInheritInu facadeSelectByPK(Integer inuId) {
        return doSelectByPK(inuId, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorInheritInu> ENTITY doSelectByPK(Integer inuId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(inuId), tp);
    }

    protected <ENTITY extends VendorInheritInu> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer inuId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(inuId, tp), inuId);
    }

    protected VendorInheritInuCB xprepareCBAsPK(Integer inuId) {
        assertObjectNotNull("inuId", inuId);
        return newConditionBean().acceptPK(inuId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * VendorInheritInuCB cb = new VendorInheritInuCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;VendorInheritInu&gt; vendorInheritInuList = vendorInheritInuBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (VendorInheritInu vendorInheritInu : vendorInheritInuList) {
     *     ... = vendorInheritInu.get...();
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of VendorInheritInu. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<VendorInheritInu> selectList(CBCall<VendorInheritInuCB> cbLambda) {
        return facadeSelectList(handleCBCall(cbLambda));
    }

    /**
     * Select the list as result bean.
     * <pre>
     * VendorInheritInuCB cb = new VendorInheritInuCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;VendorInheritInu&gt; vendorInheritInuList = vendorInheritInuBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (VendorInheritInu vendorInheritInu : vendorInheritInuList) {
     *     ... = vendorInheritInu.get...();
     * }
     * </pre>
     * @param cb The condition-bean of VendorInheritInu. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<VendorInheritInu> selectList(VendorInheritInuCB cb) {
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
     * VendorInheritInuCB cb = new VendorInheritInuCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;VendorInheritInu&gt; page = vendorInheritInuBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (VendorInheritInu vendorInheritInu : page) {
     *     ... = vendorInheritInu.get...();
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of VendorInheritInu. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<VendorInheritInu> selectPage(CBCall<VendorInheritInuCB> cbLambda) {
        return facadeSelectPage(handleCBCall(cbLambda));
    }

    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * VendorInheritInuCB cb = new VendorInheritInuCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;VendorInheritInu&gt; page = vendorInheritInuBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (VendorInheritInu vendorInheritInu : page) {
     *     ... = vendorInheritInu.get...();
     * }
     * </pre>
     * @param cb The condition-bean of VendorInheritInu. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<VendorInheritInu> selectPage(VendorInheritInuCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * VendorInheritInuCB cb = new VendorInheritInuCB();
     * cb.query().setFoo...(value);
     * vendorInheritInuBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;VendorInheritInu&gt;() {
     *     public void handle(VendorInheritInu entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of VendorInheritInu. (NotNull)
     * @param entityLambda The handler of entity row of VendorInheritInu. (NotNull)
     */
    public void selectCursor(CBCall<VendorInheritInuCB> cbLambda, EntityRowHandler<VendorInheritInu> entityLambda) {
        facadeSelectCursor(handleCBCall(cbLambda), entityLambda);
    }

    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * VendorInheritInuCB cb = new VendorInheritInuCB();
     * cb.query().setFoo...(value);
     * vendorInheritInuBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;VendorInheritInu&gt;() {
     *     public void handle(VendorInheritInu entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of VendorInheritInu. (NotNull)
     * @param entityRowHandler The handler of entity row of VendorInheritInu. (NotNull)
     */
    public void selectCursor(VendorInheritInuCB cb, EntityRowHandler<VendorInheritInu> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * vendorInheritInuBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(VendorInheritInuCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<VendorInheritInuCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * Load referrer by the the referrer loader. <br />
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.query().set...
     * List&lt;Member&gt; memberList = memberBhv.selectList(cb);
     * memberBhv.<span style="color: #DD4747">load</span>(memberList, loader -&gt; {
     *     loader.<span style="color: #DD4747">loadPurchaseList</span>(purchaseCB -&gt; {
     *         purchaseCB.query().set...
     *         purchaseCB.query().addOrderBy_PurchasePrice_Desc();
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedList(purchaseLoader -&gt {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePaymentList(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//loader.pulloutMemberStatus().loadMemberLoginList(...)</span>
     * }
     * for (Member member : memberList) {
     *     List&lt;Purchase&gt; purchaseList = member.<span style="color: #DD4747">getPurchaseList()</span>;
     *     for (Purchase purchase : purchaseList) {
     *         ...
     *     }
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param vendorInheritInuList The entity list of vendorInheritInu. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<VendorInheritInu> vendorInheritInuList, ReferrerLoaderHandler<LoaderOfVendorInheritInu> loaderLambda) {
        xassLRArg(vendorInheritInuList, loaderLambda);
        loaderLambda.handle(new LoaderOfVendorInheritInu().ready(vendorInheritInuList, _behaviorSelector));
    }

    /**
     * Load referrer of ${referrer.referrerJavaBeansRulePropertyName} by the referrer loader. <br />
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.query().set...
     * Member member = memberBhv.selectEntityWithDeletedCheck(cb);
     * memberBhv.<span style="color: #DD4747">load</span>(member, loader -&gt; {
     *     loader.<span style="color: #DD4747">loadPurchaseList</span>(purchaseCB -&gt; {
     *         purchaseCB.query().set...
     *         purchaseCB.query().addOrderBy_PurchasePrice_Desc();
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedList(purchaseLoader -&gt {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePaymentList(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//loader.pulloutMemberStatus().loadMemberLoginList(...)</span>
     * }
     * for (Member member : memberList) {
     *     List&lt;Purchase&gt; purchaseList = member.<span style="color: #DD4747">getPurchaseList()</span>;
     *     for (Purchase purchase : purchaseList) {
     *         ...
     *     }
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param vendorInheritInu The entity of vendorInheritInu. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(VendorInheritInu vendorInheritInu, ReferrerLoaderHandler<LoaderOfVendorInheritInu> loaderLambda) {
        xassLRArg(vendorInheritInu, loaderLambda);
        loaderLambda.handle(new LoaderOfVendorInheritInu().ready(xnewLRAryLs(vendorInheritInu), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key inuId.
     * @param vendorInheritInuList The list of vendorInheritInu. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractInuIdList(List<VendorInheritInu> vendorInheritInuList)
    { return helpExtractListInternally(vendorInheritInuList, "inuId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * VendorInheritInu vendorInheritInu = new VendorInheritInu();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorInheritInu.setFoo...(value);
     * vendorInheritInu.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorInheritInu.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorInheritInu.set...;</span>
     * vendorInheritInuBhv.<span style="color: #DD4747">insert</span>(vendorInheritInu);
     * ... = vendorInheritInu.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param vendorInheritInu The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(VendorInheritInu vendorInheritInu) {
        doInsert(vendorInheritInu, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * VendorInheritInu vendorInheritInu = new VendorInheritInu();
     * vendorInheritInu.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorInheritInu.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorInheritInu.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorInheritInu.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorInheritInu.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     vendorInheritInuBhv.<span style="color: #DD4747">update</span>(vendorInheritInu);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorInheritInu The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(VendorInheritInu vendorInheritInu) {
        doUpdate(vendorInheritInu, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param vendorInheritInu The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(VendorInheritInu vendorInheritInu) {
        doInsertOrUpdate(vendorInheritInu, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * VendorInheritInu vendorInheritInu = new VendorInheritInu();
     * vendorInheritInu.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorInheritInu.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     vendorInheritInuBhv.<span style="color: #DD4747">delete</span>(vendorInheritInu);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorInheritInu The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(VendorInheritInu vendorInheritInu) {
        doDelete(vendorInheritInu, null);
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch-insert the entity list modified-only of same-set columns. (DefaultConstraintsEnabled) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <p><span style="color: #DD4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
     * <pre>
     * for (... : ...) {
     *     VendorInheritInu vendorInheritInu = new VendorInheritInu();
     *     vendorInheritInu.setFooName("foo");
     *     if (...) {
     *         vendorInheritInu.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     vendorInheritInuList.add(vendorInheritInu);
     * }
     * vendorInheritInuBhv.<span style="color: #DD4747">batchInsert</span>(vendorInheritInuList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param vendorInheritInuList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<VendorInheritInu> vendorInheritInuList) {
        return doBatchInsert(vendorInheritInuList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     VendorInheritInu vendorInheritInu = new VendorInheritInu();
     *     vendorInheritInu.setFooName("foo");
     *     if (...) {
     *         vendorInheritInu.setFooPrice(123);
     *     } else {
     *         vendorInheritInu.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//vendorInheritInu.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     vendorInheritInuList.add(vendorInheritInu);
     * }
     * vendorInheritInuBhv.<span style="color: #DD4747">batchUpdate</span>(vendorInheritInuList);
     * </pre>
     * @param vendorInheritInuList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<VendorInheritInu> vendorInheritInuList) {
        return doBatchUpdate(vendorInheritInuList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param vendorInheritInuList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<VendorInheritInu> vendorInheritInuList) {
        return doBatchDelete(vendorInheritInuList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * vendorInheritInuBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;VendorInheritInu, VendorInheritInuCB&gt;() {
     *     public ConditionBean setup(VendorInheritInu entity, VendorInheritInuCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<VendorInheritInu, VendorInheritInuCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * VendorInheritInu vendorInheritInu = new VendorInheritInu();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorInheritInu.setPK...(value);</span>
     * vendorInheritInu.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorInheritInu.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorInheritInu.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorInheritInu.setVersionNo(value);</span>
     * VendorInheritInuCB cb = new VendorInheritInuCB();
     * cb.query().setFoo...(value);
     * vendorInheritInuBhv.<span style="color: #DD4747">queryUpdate</span>(vendorInheritInu, cb);
     * </pre>
     * @param vendorInheritInu The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of VendorInheritInu. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(VendorInheritInu vendorInheritInu, CBCall<VendorInheritInuCB> cbLambda) {
        return doQueryUpdate(vendorInheritInu, handleCBCall(cbLambda), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * VendorInheritInu vendorInheritInu = new VendorInheritInu();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorInheritInu.setPK...(value);</span>
     * vendorInheritInu.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorInheritInu.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorInheritInu.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorInheritInu.setVersionNo(value);</span>
     * VendorInheritInuCB cb = new VendorInheritInuCB();
     * cb.query().setFoo...(value);
     * vendorInheritInuBhv.<span style="color: #DD4747">queryUpdate</span>(vendorInheritInu, cb);
     * </pre>
     * @param vendorInheritInu The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of VendorInheritInu. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(VendorInheritInu vendorInheritInu, VendorInheritInuCB cb) {
        return doQueryUpdate(vendorInheritInu, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * VendorInheritInuCB cb = new VendorInheritInuCB();
     * cb.query().setFoo...(value);
     * vendorInheritInuBhv.<span style="color: #DD4747">queryDelete</span>(vendorInheritInu, cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of VendorInheritInu. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<VendorInheritInuCB> cbLambda) {
        return doQueryDelete(handleCBCall(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * VendorInheritInuCB cb = new VendorInheritInuCB();
     * cb.query().setFoo...(value);
     * vendorInheritInuBhv.<span style="color: #DD4747">queryDelete</span>(vendorInheritInu, cb);
     * </pre>
     * @param cb The condition-bean of VendorInheritInu. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(VendorInheritInuCB cb) {
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
     * VendorInheritInu vendorInheritInu = new VendorInheritInu();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorInheritInu.setFoo...(value);
     * vendorInheritInu.setBar...(value);
     * InsertOption<VendorInheritInuCB> option = new InsertOption<VendorInheritInuCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * vendorInheritInuBhv.<span style="color: #DD4747">varyingInsert</span>(vendorInheritInu, option);
     * ... = vendorInheritInu.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param vendorInheritInu The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(VendorInheritInu vendorInheritInu, WOptionCall<VendorInheritInuCB, InsertOption<VendorInheritInuCB>> opLambda) {
        doInsert(vendorInheritInu, handleInsertOpCall(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * VendorInheritInu vendorInheritInu = new VendorInheritInu();
     * vendorInheritInu.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorInheritInu.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorInheritInu.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;VendorInheritInuCB&gt; option = new UpdateOption&lt;VendorInheritInuCB&gt;();
     *     option.self(new SpecifyQuery&lt;VendorInheritInuCB&gt;() {
     *         public void specify(VendorInheritInuCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     vendorInheritInuBhv.<span style="color: #DD4747">varyingUpdate</span>(vendorInheritInu, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorInheritInu The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(VendorInheritInu vendorInheritInu, WOptionCall<VendorInheritInuCB, UpdateOption<VendorInheritInuCB>> opLambda) {
        doUpdate(vendorInheritInu, handleUpdateOpCall(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param vendorInheritInu The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(VendorInheritInu vendorInheritInu, WOptionCall<VendorInheritInuCB, InsertOption<VendorInheritInuCB>> insertOpLambda, WOptionCall<VendorInheritInuCB, UpdateOption<VendorInheritInuCB>> updateOpLambda) {
        doInsertOrUpdate(vendorInheritInu, handleInsertOpCall(insertOpLambda), handleUpdateOpCall(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param vendorInheritInu The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(VendorInheritInu vendorInheritInu, WOptionCall<VendorInheritInuCB, DeleteOption<VendorInheritInuCB>> opLambda) {
        doDelete(vendorInheritInu, handleDeleteOpCall(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param vendorInheritInuList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<VendorInheritInu> vendorInheritInuList, WOptionCall<VendorInheritInuCB, InsertOption<VendorInheritInuCB>> opLambda) {
        return doBatchInsert(vendorInheritInuList, handleInsertOpCall(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param vendorInheritInuList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<VendorInheritInu> vendorInheritInuList, WOptionCall<VendorInheritInuCB, UpdateOption<VendorInheritInuCB>> opLambda) {
        return doBatchUpdate(vendorInheritInuList, handleUpdateOpCall(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param vendorInheritInuList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<VendorInheritInu> vendorInheritInuList, WOptionCall<VendorInheritInuCB, DeleteOption<VendorInheritInuCB>> opLambda) {
        return doBatchDelete(vendorInheritInuList, handleDeleteOpCall(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<VendorInheritInu, VendorInheritInuCB> manyArgLambda, WOptionCall<VendorInheritInuCB, InsertOption<VendorInheritInuCB>> opLambda) {
        return doQueryInsert(manyArgLambda, handleInsertOpCall(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * VendorInheritInu vendorInheritInu = new VendorInheritInu();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorInheritInu.setPK...(value);</span>
     * vendorInheritInu.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorInheritInu.setVersionNo(value);</span>
     * VendorInheritInuCB cb = new VendorInheritInuCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;VendorInheritInuCB&gt; option = new UpdateOption&lt;VendorInheritInuCB&gt;();
     * option.self(new SpecifyQuery&lt;VendorInheritInuCB&gt;() {
     *     public void specify(VendorInheritInuCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * vendorInheritInuBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(vendorInheritInu, cb, option);
     * </pre>
     * @param vendorInheritInu The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of VendorInheritInu. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(VendorInheritInu vendorInheritInu, CBCall<VendorInheritInuCB> cbLambda, WOptionCall<VendorInheritInuCB, UpdateOption<VendorInheritInuCB>> opLambda) {
        return doQueryUpdate(vendorInheritInu, handleCBCall(cbLambda), handleUpdateOpCall(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * VendorInheritInu vendorInheritInu = new VendorInheritInu();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorInheritInu.setPK...(value);</span>
     * vendorInheritInu.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorInheritInu.setVersionNo(value);</span>
     * VendorInheritInuCB cb = new VendorInheritInuCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;VendorInheritInuCB&gt; option = new UpdateOption&lt;VendorInheritInuCB&gt;();
     * option.self(new SpecifyQuery&lt;VendorInheritInuCB&gt;() {
     *     public void specify(VendorInheritInuCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * vendorInheritInuBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(vendorInheritInu, cb, option);
     * </pre>
     * @param vendorInheritInu The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of VendorInheritInu. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(VendorInheritInu vendorInheritInu, VendorInheritInuCB cb, WOptionCall<VendorInheritInuCB, UpdateOption<VendorInheritInuCB>> opLambda) {
        return doQueryUpdate(vendorInheritInu, cb, handleUpdateOpCall(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cbLambda The callback for condition-bean of VendorInheritInu. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<VendorInheritInuCB> cbLambda, WOptionCall<VendorInheritInuCB, DeleteOption<VendorInheritInuCB>> opLambda) {
        return doQueryDelete(handleCBCall(cbLambda), handleDeleteOpCall(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of VendorInheritInu. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(VendorInheritInuCB cb, WOptionCall<VendorInheritInuCB, DeleteOption<VendorInheritInuCB>> opLambda) {
        return doQueryDelete(cb, handleDeleteOpCall(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span> 
     * vendorInheritInuBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span> 
     * vendorInheritInuBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * vendorInheritInuBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * vendorInheritInuBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * vendorInheritInuBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * vendorInheritInuBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * vendorInheritInuBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span> 
     * vendorInheritInuBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * vendorInheritInuBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * vendorInheritInuBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * vendorInheritInuBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * vendorInheritInuBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * vendorInheritInuBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span> 
     * vendorInheritInuBhv.outideSql().removeBlockComment().selectList()
     * vendorInheritInuBhv.outideSql().removeLineComment().selectList()
     * vendorInheritInuBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<VendorInheritInuBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<VendorInheritInuBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends VendorInheritInu> typeOfSelectedEntity() { return VendorInheritInu.class; }
    protected Class<VendorInheritInu> typeOfHandlingEntity() { return VendorInheritInu.class; }
    protected Class<VendorInheritInuCB> typeOfHandlingConditionBean() { return VendorInheritInuCB.class; }
}
