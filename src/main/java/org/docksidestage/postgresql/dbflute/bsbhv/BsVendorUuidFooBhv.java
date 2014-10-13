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
 * The behavior of vendor_uuid_foo as TABLE. <br />
 * <pre>
 * [primary key]
 *     foo_id
 *
 * [column]
 *     foo_id, foo_name, bar_id
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
 *     vendor_uuid_bar
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     vendorUuidBar
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendorUuidFooBhv extends AbstractBehaviorWritable<VendorUuidFoo, VendorUuidFooCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public VendorUuidFooDbm getDBMeta() { return VendorUuidFooDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public VendorUuidFooCB newConditionBean() { return new VendorUuidFooCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * VendorUuidFooCB cb = new VendorUuidFooCB();
     * cb.query().setFoo...(value);
     * int count = vendorUuidFooBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of VendorUuidFoo. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<VendorUuidFooCB> cbLambda) {
        return facadeSelectCount(handleCBCall(cbLambda));
    }

    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * VendorUuidFooCB cb = new VendorUuidFooCB();
     * cb.query().setFoo...(value);
     * int count = vendorUuidFooBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of VendorUuidFoo. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(VendorUuidFooCB cb) {
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
     * VendorUuidFooCB cb = new VendorUuidFooCB();
     * cb.query().setFoo...(value);
     * VendorUuidFoo vendorUuidFoo = vendorUuidFooBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (vendorUuidFoo != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = vendorUuidFoo.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of VendorUuidFoo. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorUuidFoo selectEntity(CBCall<VendorUuidFooCB> cbLambda) {
        return facadeSelectEntity(handleCBCall(cbLambda));
    }

    /**
     * Select the entity by the condition-bean. #beforejava8 <br />
     * <span style="color: #AD4747; font-size: 120%">The return might be null if no data, so you should have null check.</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, use selectEntityWithDeletedCheck().</span>
     * <pre>
     * VendorUuidFooCB cb = new VendorUuidFooCB();
     * cb.query().setFoo...(value);
     * VendorUuidFoo vendorUuidFoo = vendorUuidFooBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (vendorUuidFoo != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = vendorUuidFoo.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of VendorUuidFoo. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorUuidFoo selectEntity(VendorUuidFooCB cb) {
        return facadeSelectEntity(cb);
    }

    protected VendorUuidFoo facadeSelectEntity(VendorUuidFooCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorUuidFoo> OptionalEntity<ENTITY> doSelectOptionalEntity(VendorUuidFooCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * VendorUuidFooCB cb = new VendorUuidFooCB();
     * cb.query().setFoo...(value);
     * VendorUuidFoo vendorUuidFoo = vendorUuidFooBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = vendorUuidFoo.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of VendorUuidFoo. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorUuidFoo selectEntityWithDeletedCheck(CBCall<VendorUuidFooCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(handleCBCall(cbLambda));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * VendorUuidFooCB cb = new VendorUuidFooCB();
     * cb.query().setFoo...(value);
     * VendorUuidFoo vendorUuidFoo = vendorUuidFooBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = vendorUuidFoo.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of VendorUuidFoo. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorUuidFoo selectEntityWithDeletedCheck(VendorUuidFooCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param fooId : PK, NotNull, uuid(2147483647). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorUuidFoo selectByPK(java.util.UUID fooId) {
        return facadeSelectByPK(fooId);
    }

    protected VendorUuidFoo facadeSelectByPK(java.util.UUID fooId) {
        return doSelectByPK(fooId, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorUuidFoo> ENTITY doSelectByPK(java.util.UUID fooId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(fooId), tp);
    }

    protected <ENTITY extends VendorUuidFoo> OptionalEntity<ENTITY> doSelectOptionalByPK(java.util.UUID fooId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(fooId, tp), fooId);
    }

    protected VendorUuidFooCB xprepareCBAsPK(java.util.UUID fooId) {
        assertObjectNotNull("fooId", fooId);
        return newConditionBean().acceptPK(fooId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * VendorUuidFooCB cb = new VendorUuidFooCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;VendorUuidFoo&gt; vendorUuidFooList = vendorUuidFooBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (VendorUuidFoo vendorUuidFoo : vendorUuidFooList) {
     *     ... = vendorUuidFoo.get...();
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of VendorUuidFoo. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<VendorUuidFoo> selectList(CBCall<VendorUuidFooCB> cbLambda) {
        return facadeSelectList(handleCBCall(cbLambda));
    }

    /**
     * Select the list as result bean.
     * <pre>
     * VendorUuidFooCB cb = new VendorUuidFooCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;VendorUuidFoo&gt; vendorUuidFooList = vendorUuidFooBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (VendorUuidFoo vendorUuidFoo : vendorUuidFooList) {
     *     ... = vendorUuidFoo.get...();
     * }
     * </pre>
     * @param cb The condition-bean of VendorUuidFoo. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<VendorUuidFoo> selectList(VendorUuidFooCB cb) {
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
     * VendorUuidFooCB cb = new VendorUuidFooCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;VendorUuidFoo&gt; page = vendorUuidFooBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (VendorUuidFoo vendorUuidFoo : page) {
     *     ... = vendorUuidFoo.get...();
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of VendorUuidFoo. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<VendorUuidFoo> selectPage(CBCall<VendorUuidFooCB> cbLambda) {
        return facadeSelectPage(handleCBCall(cbLambda));
    }

    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * VendorUuidFooCB cb = new VendorUuidFooCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;VendorUuidFoo&gt; page = vendorUuidFooBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (VendorUuidFoo vendorUuidFoo : page) {
     *     ... = vendorUuidFoo.get...();
     * }
     * </pre>
     * @param cb The condition-bean of VendorUuidFoo. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<VendorUuidFoo> selectPage(VendorUuidFooCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * VendorUuidFooCB cb = new VendorUuidFooCB();
     * cb.query().setFoo...(value);
     * vendorUuidFooBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;VendorUuidFoo&gt;() {
     *     public void handle(VendorUuidFoo entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of VendorUuidFoo. (NotNull)
     * @param entityLambda The handler of entity row of VendorUuidFoo. (NotNull)
     */
    public void selectCursor(CBCall<VendorUuidFooCB> cbLambda, EntityRowHandler<VendorUuidFoo> entityLambda) {
        facadeSelectCursor(handleCBCall(cbLambda), entityLambda);
    }

    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * VendorUuidFooCB cb = new VendorUuidFooCB();
     * cb.query().setFoo...(value);
     * vendorUuidFooBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;VendorUuidFoo&gt;() {
     *     public void handle(VendorUuidFoo entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of VendorUuidFoo. (NotNull)
     * @param entityRowHandler The handler of entity row of VendorUuidFoo. (NotNull)
     */
    public void selectCursor(VendorUuidFooCB cb, EntityRowHandler<VendorUuidFoo> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * vendorUuidFooBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(VendorUuidFooCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<VendorUuidFooCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param vendorUuidFooList The entity list of vendorUuidFoo. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<VendorUuidFoo> vendorUuidFooList, ReferrerLoaderHandler<LoaderOfVendorUuidFoo> loaderLambda) {
        xassLRArg(vendorUuidFooList, loaderLambda);
        loaderLambda.handle(new LoaderOfVendorUuidFoo().ready(vendorUuidFooList, _behaviorSelector));
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
     * @param vendorUuidFoo The entity of vendorUuidFoo. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(VendorUuidFoo vendorUuidFoo, ReferrerLoaderHandler<LoaderOfVendorUuidFoo> loaderLambda) {
        xassLRArg(vendorUuidFoo, loaderLambda);
        loaderLambda.handle(new LoaderOfVendorUuidFoo().ready(xnewLRAryLs(vendorUuidFoo), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'VendorUuidBar'.
     * @param vendorUuidFooList The list of vendorUuidFoo. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<VendorUuidBar> pulloutVendorUuidBar(List<VendorUuidFoo> vendorUuidFooList)
    { return helpPulloutInternally(vendorUuidFooList, "vendorUuidBar"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key fooId.
     * @param vendorUuidFooList The list of vendorUuidFoo. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<java.util.UUID> extractFooIdList(List<VendorUuidFoo> vendorUuidFooList)
    { return helpExtractListInternally(vendorUuidFooList, "fooId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * VendorUuidFoo vendorUuidFoo = new VendorUuidFoo();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorUuidFoo.setFoo...(value);
     * vendorUuidFoo.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorUuidFoo.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorUuidFoo.set...;</span>
     * vendorUuidFooBhv.<span style="color: #DD4747">insert</span>(vendorUuidFoo);
     * ... = vendorUuidFoo.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param vendorUuidFoo The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(VendorUuidFoo vendorUuidFoo) {
        doInsert(vendorUuidFoo, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * VendorUuidFoo vendorUuidFoo = new VendorUuidFoo();
     * vendorUuidFoo.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorUuidFoo.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorUuidFoo.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorUuidFoo.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorUuidFoo.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     vendorUuidFooBhv.<span style="color: #DD4747">update</span>(vendorUuidFoo);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorUuidFoo The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(VendorUuidFoo vendorUuidFoo) {
        doUpdate(vendorUuidFoo, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param vendorUuidFoo The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(VendorUuidFoo vendorUuidFoo) {
        doInsertOrUpdate(vendorUuidFoo, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * VendorUuidFoo vendorUuidFoo = new VendorUuidFoo();
     * vendorUuidFoo.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorUuidFoo.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     vendorUuidFooBhv.<span style="color: #DD4747">delete</span>(vendorUuidFoo);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorUuidFoo The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(VendorUuidFoo vendorUuidFoo) {
        doDelete(vendorUuidFoo, null);
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
     *     VendorUuidFoo vendorUuidFoo = new VendorUuidFoo();
     *     vendorUuidFoo.setFooName("foo");
     *     if (...) {
     *         vendorUuidFoo.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     vendorUuidFooList.add(vendorUuidFoo);
     * }
     * vendorUuidFooBhv.<span style="color: #DD4747">batchInsert</span>(vendorUuidFooList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param vendorUuidFooList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<VendorUuidFoo> vendorUuidFooList) {
        return doBatchInsert(vendorUuidFooList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     VendorUuidFoo vendorUuidFoo = new VendorUuidFoo();
     *     vendorUuidFoo.setFooName("foo");
     *     if (...) {
     *         vendorUuidFoo.setFooPrice(123);
     *     } else {
     *         vendorUuidFoo.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//vendorUuidFoo.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     vendorUuidFooList.add(vendorUuidFoo);
     * }
     * vendorUuidFooBhv.<span style="color: #DD4747">batchUpdate</span>(vendorUuidFooList);
     * </pre>
     * @param vendorUuidFooList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<VendorUuidFoo> vendorUuidFooList) {
        return doBatchUpdate(vendorUuidFooList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param vendorUuidFooList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<VendorUuidFoo> vendorUuidFooList) {
        return doBatchDelete(vendorUuidFooList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * vendorUuidFooBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;VendorUuidFoo, VendorUuidFooCB&gt;() {
     *     public ConditionBean setup(VendorUuidFoo entity, VendorUuidFooCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<VendorUuidFoo, VendorUuidFooCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * VendorUuidFoo vendorUuidFoo = new VendorUuidFoo();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorUuidFoo.setPK...(value);</span>
     * vendorUuidFoo.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorUuidFoo.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorUuidFoo.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorUuidFoo.setVersionNo(value);</span>
     * VendorUuidFooCB cb = new VendorUuidFooCB();
     * cb.query().setFoo...(value);
     * vendorUuidFooBhv.<span style="color: #DD4747">queryUpdate</span>(vendorUuidFoo, cb);
     * </pre>
     * @param vendorUuidFoo The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of VendorUuidFoo. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(VendorUuidFoo vendorUuidFoo, CBCall<VendorUuidFooCB> cbLambda) {
        return doQueryUpdate(vendorUuidFoo, handleCBCall(cbLambda), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * VendorUuidFoo vendorUuidFoo = new VendorUuidFoo();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorUuidFoo.setPK...(value);</span>
     * vendorUuidFoo.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorUuidFoo.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorUuidFoo.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorUuidFoo.setVersionNo(value);</span>
     * VendorUuidFooCB cb = new VendorUuidFooCB();
     * cb.query().setFoo...(value);
     * vendorUuidFooBhv.<span style="color: #DD4747">queryUpdate</span>(vendorUuidFoo, cb);
     * </pre>
     * @param vendorUuidFoo The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of VendorUuidFoo. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(VendorUuidFoo vendorUuidFoo, VendorUuidFooCB cb) {
        return doQueryUpdate(vendorUuidFoo, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * VendorUuidFooCB cb = new VendorUuidFooCB();
     * cb.query().setFoo...(value);
     * vendorUuidFooBhv.<span style="color: #DD4747">queryDelete</span>(vendorUuidFoo, cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of VendorUuidFoo. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<VendorUuidFooCB> cbLambda) {
        return doQueryDelete(handleCBCall(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * VendorUuidFooCB cb = new VendorUuidFooCB();
     * cb.query().setFoo...(value);
     * vendorUuidFooBhv.<span style="color: #DD4747">queryDelete</span>(vendorUuidFoo, cb);
     * </pre>
     * @param cb The condition-bean of VendorUuidFoo. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(VendorUuidFooCB cb) {
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
     * VendorUuidFoo vendorUuidFoo = new VendorUuidFoo();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorUuidFoo.setFoo...(value);
     * vendorUuidFoo.setBar...(value);
     * InsertOption<VendorUuidFooCB> option = new InsertOption<VendorUuidFooCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * vendorUuidFooBhv.<span style="color: #DD4747">varyingInsert</span>(vendorUuidFoo, option);
     * ... = vendorUuidFoo.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param vendorUuidFoo The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(VendorUuidFoo vendorUuidFoo, WOptionCall<VendorUuidFooCB, InsertOption<VendorUuidFooCB>> opLambda) {
        doInsert(vendorUuidFoo, handleInsertOpCall(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * VendorUuidFoo vendorUuidFoo = new VendorUuidFoo();
     * vendorUuidFoo.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorUuidFoo.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorUuidFoo.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;VendorUuidFooCB&gt; option = new UpdateOption&lt;VendorUuidFooCB&gt;();
     *     option.self(new SpecifyQuery&lt;VendorUuidFooCB&gt;() {
     *         public void specify(VendorUuidFooCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     vendorUuidFooBhv.<span style="color: #DD4747">varyingUpdate</span>(vendorUuidFoo, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorUuidFoo The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(VendorUuidFoo vendorUuidFoo, WOptionCall<VendorUuidFooCB, UpdateOption<VendorUuidFooCB>> opLambda) {
        doUpdate(vendorUuidFoo, handleUpdateOpCall(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param vendorUuidFoo The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(VendorUuidFoo vendorUuidFoo, WOptionCall<VendorUuidFooCB, InsertOption<VendorUuidFooCB>> insertOpLambda, WOptionCall<VendorUuidFooCB, UpdateOption<VendorUuidFooCB>> updateOpLambda) {
        doInsertOrUpdate(vendorUuidFoo, handleInsertOpCall(insertOpLambda), handleUpdateOpCall(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param vendorUuidFoo The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(VendorUuidFoo vendorUuidFoo, WOptionCall<VendorUuidFooCB, DeleteOption<VendorUuidFooCB>> opLambda) {
        doDelete(vendorUuidFoo, handleDeleteOpCall(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param vendorUuidFooList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<VendorUuidFoo> vendorUuidFooList, WOptionCall<VendorUuidFooCB, InsertOption<VendorUuidFooCB>> opLambda) {
        return doBatchInsert(vendorUuidFooList, handleInsertOpCall(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param vendorUuidFooList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<VendorUuidFoo> vendorUuidFooList, WOptionCall<VendorUuidFooCB, UpdateOption<VendorUuidFooCB>> opLambda) {
        return doBatchUpdate(vendorUuidFooList, handleUpdateOpCall(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param vendorUuidFooList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<VendorUuidFoo> vendorUuidFooList, WOptionCall<VendorUuidFooCB, DeleteOption<VendorUuidFooCB>> opLambda) {
        return doBatchDelete(vendorUuidFooList, handleDeleteOpCall(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<VendorUuidFoo, VendorUuidFooCB> manyArgLambda, WOptionCall<VendorUuidFooCB, InsertOption<VendorUuidFooCB>> opLambda) {
        return doQueryInsert(manyArgLambda, handleInsertOpCall(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * VendorUuidFoo vendorUuidFoo = new VendorUuidFoo();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorUuidFoo.setPK...(value);</span>
     * vendorUuidFoo.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorUuidFoo.setVersionNo(value);</span>
     * VendorUuidFooCB cb = new VendorUuidFooCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;VendorUuidFooCB&gt; option = new UpdateOption&lt;VendorUuidFooCB&gt;();
     * option.self(new SpecifyQuery&lt;VendorUuidFooCB&gt;() {
     *     public void specify(VendorUuidFooCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * vendorUuidFooBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(vendorUuidFoo, cb, option);
     * </pre>
     * @param vendorUuidFoo The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of VendorUuidFoo. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(VendorUuidFoo vendorUuidFoo, CBCall<VendorUuidFooCB> cbLambda, WOptionCall<VendorUuidFooCB, UpdateOption<VendorUuidFooCB>> opLambda) {
        return doQueryUpdate(vendorUuidFoo, handleCBCall(cbLambda), handleUpdateOpCall(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * VendorUuidFoo vendorUuidFoo = new VendorUuidFoo();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorUuidFoo.setPK...(value);</span>
     * vendorUuidFoo.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorUuidFoo.setVersionNo(value);</span>
     * VendorUuidFooCB cb = new VendorUuidFooCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;VendorUuidFooCB&gt; option = new UpdateOption&lt;VendorUuidFooCB&gt;();
     * option.self(new SpecifyQuery&lt;VendorUuidFooCB&gt;() {
     *     public void specify(VendorUuidFooCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * vendorUuidFooBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(vendorUuidFoo, cb, option);
     * </pre>
     * @param vendorUuidFoo The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of VendorUuidFoo. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(VendorUuidFoo vendorUuidFoo, VendorUuidFooCB cb, WOptionCall<VendorUuidFooCB, UpdateOption<VendorUuidFooCB>> opLambda) {
        return doQueryUpdate(vendorUuidFoo, cb, handleUpdateOpCall(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cbLambda The callback for condition-bean of VendorUuidFoo. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<VendorUuidFooCB> cbLambda, WOptionCall<VendorUuidFooCB, DeleteOption<VendorUuidFooCB>> opLambda) {
        return doQueryDelete(handleCBCall(cbLambda), handleDeleteOpCall(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of VendorUuidFoo. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(VendorUuidFooCB cb, WOptionCall<VendorUuidFooCB, DeleteOption<VendorUuidFooCB>> opLambda) {
        return doQueryDelete(cb, handleDeleteOpCall(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span> 
     * vendorUuidFooBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span> 
     * vendorUuidFooBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * vendorUuidFooBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * vendorUuidFooBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * vendorUuidFooBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * vendorUuidFooBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * vendorUuidFooBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span> 
     * vendorUuidFooBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * vendorUuidFooBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * vendorUuidFooBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * vendorUuidFooBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * vendorUuidFooBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * vendorUuidFooBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span> 
     * vendorUuidFooBhv.outideSql().removeBlockComment().selectList()
     * vendorUuidFooBhv.outideSql().removeLineComment().selectList()
     * vendorUuidFooBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<VendorUuidFooBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<VendorUuidFooBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends VendorUuidFoo> typeOfSelectedEntity() { return VendorUuidFoo.class; }
    protected Class<VendorUuidFoo> typeOfHandlingEntity() { return VendorUuidFoo.class; }
    protected Class<VendorUuidFooCB> typeOfHandlingConditionBean() { return VendorUuidFooCB.class; }
}
