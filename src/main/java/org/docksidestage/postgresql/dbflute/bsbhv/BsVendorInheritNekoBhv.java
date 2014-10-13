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
 * The behavior of vendor_inherit_neko as TABLE. <br />
 * <pre>
 * [primary key]
 *     neko_id
 *
 * [column]
 *     inu_id, inu_name, inu_date, neko_id, neko_name, neko_date
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
public abstract class BsVendorInheritNekoBhv extends AbstractBehaviorWritable<VendorInheritNeko, VendorInheritNekoCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public VendorInheritNekoDbm getDBMeta() { return VendorInheritNekoDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public VendorInheritNekoCB newConditionBean() { return new VendorInheritNekoCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * VendorInheritNekoCB cb = new VendorInheritNekoCB();
     * cb.query().setFoo...(value);
     * int count = vendorInheritNekoBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of VendorInheritNeko. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<VendorInheritNekoCB> cbLambda) {
        return facadeSelectCount(handleCBCall(cbLambda));
    }

    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * VendorInheritNekoCB cb = new VendorInheritNekoCB();
     * cb.query().setFoo...(value);
     * int count = vendorInheritNekoBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of VendorInheritNeko. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(VendorInheritNekoCB cb) {
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
     * VendorInheritNekoCB cb = new VendorInheritNekoCB();
     * cb.query().setFoo...(value);
     * VendorInheritNeko vendorInheritNeko = vendorInheritNekoBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (vendorInheritNeko != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = vendorInheritNeko.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of VendorInheritNeko. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorInheritNeko selectEntity(CBCall<VendorInheritNekoCB> cbLambda) {
        return facadeSelectEntity(handleCBCall(cbLambda));
    }

    /**
     * Select the entity by the condition-bean. #beforejava8 <br />
     * <span style="color: #AD4747; font-size: 120%">The return might be null if no data, so you should have null check.</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, use selectEntityWithDeletedCheck().</span>
     * <pre>
     * VendorInheritNekoCB cb = new VendorInheritNekoCB();
     * cb.query().setFoo...(value);
     * VendorInheritNeko vendorInheritNeko = vendorInheritNekoBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (vendorInheritNeko != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = vendorInheritNeko.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of VendorInheritNeko. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorInheritNeko selectEntity(VendorInheritNekoCB cb) {
        return facadeSelectEntity(cb);
    }

    protected VendorInheritNeko facadeSelectEntity(VendorInheritNekoCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorInheritNeko> OptionalEntity<ENTITY> doSelectOptionalEntity(VendorInheritNekoCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * VendorInheritNekoCB cb = new VendorInheritNekoCB();
     * cb.query().setFoo...(value);
     * VendorInheritNeko vendorInheritNeko = vendorInheritNekoBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = vendorInheritNeko.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of VendorInheritNeko. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorInheritNeko selectEntityWithDeletedCheck(CBCall<VendorInheritNekoCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(handleCBCall(cbLambda));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * VendorInheritNekoCB cb = new VendorInheritNekoCB();
     * cb.query().setFoo...(value);
     * VendorInheritNeko vendorInheritNeko = vendorInheritNekoBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = vendorInheritNeko.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of VendorInheritNeko. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorInheritNeko selectEntityWithDeletedCheck(VendorInheritNekoCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param nekoId : PK, NotNull, int4(10). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorInheritNeko selectByPK(Integer nekoId) {
        return facadeSelectByPK(nekoId);
    }

    protected VendorInheritNeko facadeSelectByPK(Integer nekoId) {
        return doSelectByPK(nekoId, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorInheritNeko> ENTITY doSelectByPK(Integer nekoId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(nekoId), tp);
    }

    protected <ENTITY extends VendorInheritNeko> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer nekoId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(nekoId, tp), nekoId);
    }

    protected VendorInheritNekoCB xprepareCBAsPK(Integer nekoId) {
        assertObjectNotNull("nekoId", nekoId);
        return newConditionBean().acceptPK(nekoId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * VendorInheritNekoCB cb = new VendorInheritNekoCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;VendorInheritNeko&gt; vendorInheritNekoList = vendorInheritNekoBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (VendorInheritNeko vendorInheritNeko : vendorInheritNekoList) {
     *     ... = vendorInheritNeko.get...();
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of VendorInheritNeko. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<VendorInheritNeko> selectList(CBCall<VendorInheritNekoCB> cbLambda) {
        return facadeSelectList(handleCBCall(cbLambda));
    }

    /**
     * Select the list as result bean.
     * <pre>
     * VendorInheritNekoCB cb = new VendorInheritNekoCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;VendorInheritNeko&gt; vendorInheritNekoList = vendorInheritNekoBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (VendorInheritNeko vendorInheritNeko : vendorInheritNekoList) {
     *     ... = vendorInheritNeko.get...();
     * }
     * </pre>
     * @param cb The condition-bean of VendorInheritNeko. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<VendorInheritNeko> selectList(VendorInheritNekoCB cb) {
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
     * VendorInheritNekoCB cb = new VendorInheritNekoCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;VendorInheritNeko&gt; page = vendorInheritNekoBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (VendorInheritNeko vendorInheritNeko : page) {
     *     ... = vendorInheritNeko.get...();
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of VendorInheritNeko. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<VendorInheritNeko> selectPage(CBCall<VendorInheritNekoCB> cbLambda) {
        return facadeSelectPage(handleCBCall(cbLambda));
    }

    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * VendorInheritNekoCB cb = new VendorInheritNekoCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;VendorInheritNeko&gt; page = vendorInheritNekoBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (VendorInheritNeko vendorInheritNeko : page) {
     *     ... = vendorInheritNeko.get...();
     * }
     * </pre>
     * @param cb The condition-bean of VendorInheritNeko. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<VendorInheritNeko> selectPage(VendorInheritNekoCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * VendorInheritNekoCB cb = new VendorInheritNekoCB();
     * cb.query().setFoo...(value);
     * vendorInheritNekoBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;VendorInheritNeko&gt;() {
     *     public void handle(VendorInheritNeko entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of VendorInheritNeko. (NotNull)
     * @param entityLambda The handler of entity row of VendorInheritNeko. (NotNull)
     */
    public void selectCursor(CBCall<VendorInheritNekoCB> cbLambda, EntityRowHandler<VendorInheritNeko> entityLambda) {
        facadeSelectCursor(handleCBCall(cbLambda), entityLambda);
    }

    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * VendorInheritNekoCB cb = new VendorInheritNekoCB();
     * cb.query().setFoo...(value);
     * vendorInheritNekoBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;VendorInheritNeko&gt;() {
     *     public void handle(VendorInheritNeko entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of VendorInheritNeko. (NotNull)
     * @param entityRowHandler The handler of entity row of VendorInheritNeko. (NotNull)
     */
    public void selectCursor(VendorInheritNekoCB cb, EntityRowHandler<VendorInheritNeko> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * vendorInheritNekoBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(VendorInheritNekoCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<VendorInheritNekoCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param vendorInheritNekoList The entity list of vendorInheritNeko. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<VendorInheritNeko> vendorInheritNekoList, ReferrerLoaderHandler<LoaderOfVendorInheritNeko> loaderLambda) {
        xassLRArg(vendorInheritNekoList, loaderLambda);
        loaderLambda.handle(new LoaderOfVendorInheritNeko().ready(vendorInheritNekoList, _behaviorSelector));
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
     * @param vendorInheritNeko The entity of vendorInheritNeko. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(VendorInheritNeko vendorInheritNeko, ReferrerLoaderHandler<LoaderOfVendorInheritNeko> loaderLambda) {
        xassLRArg(vendorInheritNeko, loaderLambda);
        loaderLambda.handle(new LoaderOfVendorInheritNeko().ready(xnewLRAryLs(vendorInheritNeko), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key nekoId.
     * @param vendorInheritNekoList The list of vendorInheritNeko. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractNekoIdList(List<VendorInheritNeko> vendorInheritNekoList)
    { return helpExtractListInternally(vendorInheritNekoList, "nekoId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * VendorInheritNeko vendorInheritNeko = new VendorInheritNeko();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorInheritNeko.setFoo...(value);
     * vendorInheritNeko.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorInheritNeko.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorInheritNeko.set...;</span>
     * vendorInheritNekoBhv.<span style="color: #DD4747">insert</span>(vendorInheritNeko);
     * ... = vendorInheritNeko.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param vendorInheritNeko The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(VendorInheritNeko vendorInheritNeko) {
        doInsert(vendorInheritNeko, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * VendorInheritNeko vendorInheritNeko = new VendorInheritNeko();
     * vendorInheritNeko.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorInheritNeko.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorInheritNeko.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorInheritNeko.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorInheritNeko.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     vendorInheritNekoBhv.<span style="color: #DD4747">update</span>(vendorInheritNeko);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorInheritNeko The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(VendorInheritNeko vendorInheritNeko) {
        doUpdate(vendorInheritNeko, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param vendorInheritNeko The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(VendorInheritNeko vendorInheritNeko) {
        doInsertOrUpdate(vendorInheritNeko, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * VendorInheritNeko vendorInheritNeko = new VendorInheritNeko();
     * vendorInheritNeko.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorInheritNeko.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     vendorInheritNekoBhv.<span style="color: #DD4747">delete</span>(vendorInheritNeko);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorInheritNeko The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(VendorInheritNeko vendorInheritNeko) {
        doDelete(vendorInheritNeko, null);
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
     *     VendorInheritNeko vendorInheritNeko = new VendorInheritNeko();
     *     vendorInheritNeko.setFooName("foo");
     *     if (...) {
     *         vendorInheritNeko.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     vendorInheritNekoList.add(vendorInheritNeko);
     * }
     * vendorInheritNekoBhv.<span style="color: #DD4747">batchInsert</span>(vendorInheritNekoList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param vendorInheritNekoList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<VendorInheritNeko> vendorInheritNekoList) {
        return doBatchInsert(vendorInheritNekoList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     VendorInheritNeko vendorInheritNeko = new VendorInheritNeko();
     *     vendorInheritNeko.setFooName("foo");
     *     if (...) {
     *         vendorInheritNeko.setFooPrice(123);
     *     } else {
     *         vendorInheritNeko.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//vendorInheritNeko.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     vendorInheritNekoList.add(vendorInheritNeko);
     * }
     * vendorInheritNekoBhv.<span style="color: #DD4747">batchUpdate</span>(vendorInheritNekoList);
     * </pre>
     * @param vendorInheritNekoList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<VendorInheritNeko> vendorInheritNekoList) {
        return doBatchUpdate(vendorInheritNekoList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param vendorInheritNekoList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<VendorInheritNeko> vendorInheritNekoList) {
        return doBatchDelete(vendorInheritNekoList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * vendorInheritNekoBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;VendorInheritNeko, VendorInheritNekoCB&gt;() {
     *     public ConditionBean setup(VendorInheritNeko entity, VendorInheritNekoCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<VendorInheritNeko, VendorInheritNekoCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * VendorInheritNeko vendorInheritNeko = new VendorInheritNeko();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorInheritNeko.setPK...(value);</span>
     * vendorInheritNeko.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorInheritNeko.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorInheritNeko.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorInheritNeko.setVersionNo(value);</span>
     * VendorInheritNekoCB cb = new VendorInheritNekoCB();
     * cb.query().setFoo...(value);
     * vendorInheritNekoBhv.<span style="color: #DD4747">queryUpdate</span>(vendorInheritNeko, cb);
     * </pre>
     * @param vendorInheritNeko The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of VendorInheritNeko. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(VendorInheritNeko vendorInheritNeko, CBCall<VendorInheritNekoCB> cbLambda) {
        return doQueryUpdate(vendorInheritNeko, handleCBCall(cbLambda), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * VendorInheritNeko vendorInheritNeko = new VendorInheritNeko();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorInheritNeko.setPK...(value);</span>
     * vendorInheritNeko.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorInheritNeko.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorInheritNeko.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorInheritNeko.setVersionNo(value);</span>
     * VendorInheritNekoCB cb = new VendorInheritNekoCB();
     * cb.query().setFoo...(value);
     * vendorInheritNekoBhv.<span style="color: #DD4747">queryUpdate</span>(vendorInheritNeko, cb);
     * </pre>
     * @param vendorInheritNeko The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of VendorInheritNeko. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(VendorInheritNeko vendorInheritNeko, VendorInheritNekoCB cb) {
        return doQueryUpdate(vendorInheritNeko, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * VendorInheritNekoCB cb = new VendorInheritNekoCB();
     * cb.query().setFoo...(value);
     * vendorInheritNekoBhv.<span style="color: #DD4747">queryDelete</span>(vendorInheritNeko, cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of VendorInheritNeko. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<VendorInheritNekoCB> cbLambda) {
        return doQueryDelete(handleCBCall(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * VendorInheritNekoCB cb = new VendorInheritNekoCB();
     * cb.query().setFoo...(value);
     * vendorInheritNekoBhv.<span style="color: #DD4747">queryDelete</span>(vendorInheritNeko, cb);
     * </pre>
     * @param cb The condition-bean of VendorInheritNeko. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(VendorInheritNekoCB cb) {
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
     * VendorInheritNeko vendorInheritNeko = new VendorInheritNeko();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorInheritNeko.setFoo...(value);
     * vendorInheritNeko.setBar...(value);
     * InsertOption<VendorInheritNekoCB> option = new InsertOption<VendorInheritNekoCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * vendorInheritNekoBhv.<span style="color: #DD4747">varyingInsert</span>(vendorInheritNeko, option);
     * ... = vendorInheritNeko.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param vendorInheritNeko The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(VendorInheritNeko vendorInheritNeko, WOptionCall<VendorInheritNekoCB, InsertOption<VendorInheritNekoCB>> opLambda) {
        doInsert(vendorInheritNeko, handleInsertOpCall(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * VendorInheritNeko vendorInheritNeko = new VendorInheritNeko();
     * vendorInheritNeko.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorInheritNeko.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorInheritNeko.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;VendorInheritNekoCB&gt; option = new UpdateOption&lt;VendorInheritNekoCB&gt;();
     *     option.self(new SpecifyQuery&lt;VendorInheritNekoCB&gt;() {
     *         public void specify(VendorInheritNekoCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     vendorInheritNekoBhv.<span style="color: #DD4747">varyingUpdate</span>(vendorInheritNeko, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorInheritNeko The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(VendorInheritNeko vendorInheritNeko, WOptionCall<VendorInheritNekoCB, UpdateOption<VendorInheritNekoCB>> opLambda) {
        doUpdate(vendorInheritNeko, handleUpdateOpCall(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param vendorInheritNeko The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(VendorInheritNeko vendorInheritNeko, WOptionCall<VendorInheritNekoCB, InsertOption<VendorInheritNekoCB>> insertOpLambda, WOptionCall<VendorInheritNekoCB, UpdateOption<VendorInheritNekoCB>> updateOpLambda) {
        doInsertOrUpdate(vendorInheritNeko, handleInsertOpCall(insertOpLambda), handleUpdateOpCall(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param vendorInheritNeko The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(VendorInheritNeko vendorInheritNeko, WOptionCall<VendorInheritNekoCB, DeleteOption<VendorInheritNekoCB>> opLambda) {
        doDelete(vendorInheritNeko, handleDeleteOpCall(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param vendorInheritNekoList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<VendorInheritNeko> vendorInheritNekoList, WOptionCall<VendorInheritNekoCB, InsertOption<VendorInheritNekoCB>> opLambda) {
        return doBatchInsert(vendorInheritNekoList, handleInsertOpCall(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param vendorInheritNekoList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<VendorInheritNeko> vendorInheritNekoList, WOptionCall<VendorInheritNekoCB, UpdateOption<VendorInheritNekoCB>> opLambda) {
        return doBatchUpdate(vendorInheritNekoList, handleUpdateOpCall(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param vendorInheritNekoList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<VendorInheritNeko> vendorInheritNekoList, WOptionCall<VendorInheritNekoCB, DeleteOption<VendorInheritNekoCB>> opLambda) {
        return doBatchDelete(vendorInheritNekoList, handleDeleteOpCall(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<VendorInheritNeko, VendorInheritNekoCB> manyArgLambda, WOptionCall<VendorInheritNekoCB, InsertOption<VendorInheritNekoCB>> opLambda) {
        return doQueryInsert(manyArgLambda, handleInsertOpCall(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * VendorInheritNeko vendorInheritNeko = new VendorInheritNeko();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorInheritNeko.setPK...(value);</span>
     * vendorInheritNeko.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorInheritNeko.setVersionNo(value);</span>
     * VendorInheritNekoCB cb = new VendorInheritNekoCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;VendorInheritNekoCB&gt; option = new UpdateOption&lt;VendorInheritNekoCB&gt;();
     * option.self(new SpecifyQuery&lt;VendorInheritNekoCB&gt;() {
     *     public void specify(VendorInheritNekoCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * vendorInheritNekoBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(vendorInheritNeko, cb, option);
     * </pre>
     * @param vendorInheritNeko The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of VendorInheritNeko. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(VendorInheritNeko vendorInheritNeko, CBCall<VendorInheritNekoCB> cbLambda, WOptionCall<VendorInheritNekoCB, UpdateOption<VendorInheritNekoCB>> opLambda) {
        return doQueryUpdate(vendorInheritNeko, handleCBCall(cbLambda), handleUpdateOpCall(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * VendorInheritNeko vendorInheritNeko = new VendorInheritNeko();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorInheritNeko.setPK...(value);</span>
     * vendorInheritNeko.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorInheritNeko.setVersionNo(value);</span>
     * VendorInheritNekoCB cb = new VendorInheritNekoCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;VendorInheritNekoCB&gt; option = new UpdateOption&lt;VendorInheritNekoCB&gt;();
     * option.self(new SpecifyQuery&lt;VendorInheritNekoCB&gt;() {
     *     public void specify(VendorInheritNekoCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * vendorInheritNekoBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(vendorInheritNeko, cb, option);
     * </pre>
     * @param vendorInheritNeko The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of VendorInheritNeko. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(VendorInheritNeko vendorInheritNeko, VendorInheritNekoCB cb, WOptionCall<VendorInheritNekoCB, UpdateOption<VendorInheritNekoCB>> opLambda) {
        return doQueryUpdate(vendorInheritNeko, cb, handleUpdateOpCall(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cbLambda The callback for condition-bean of VendorInheritNeko. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<VendorInheritNekoCB> cbLambda, WOptionCall<VendorInheritNekoCB, DeleteOption<VendorInheritNekoCB>> opLambda) {
        return doQueryDelete(handleCBCall(cbLambda), handleDeleteOpCall(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of VendorInheritNeko. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(VendorInheritNekoCB cb, WOptionCall<VendorInheritNekoCB, DeleteOption<VendorInheritNekoCB>> opLambda) {
        return doQueryDelete(cb, handleDeleteOpCall(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span> 
     * vendorInheritNekoBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span> 
     * vendorInheritNekoBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * vendorInheritNekoBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * vendorInheritNekoBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * vendorInheritNekoBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * vendorInheritNekoBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * vendorInheritNekoBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span> 
     * vendorInheritNekoBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * vendorInheritNekoBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * vendorInheritNekoBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * vendorInheritNekoBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * vendorInheritNekoBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * vendorInheritNekoBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span> 
     * vendorInheritNekoBhv.outideSql().removeBlockComment().selectList()
     * vendorInheritNekoBhv.outideSql().removeLineComment().selectList()
     * vendorInheritNekoBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<VendorInheritNekoBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<VendorInheritNekoBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends VendorInheritNeko> typeOfSelectedEntity() { return VendorInheritNeko.class; }
    protected Class<VendorInheritNeko> typeOfHandlingEntity() { return VendorInheritNeko.class; }
    protected Class<VendorInheritNekoCB> typeOfHandlingConditionBean() { return VendorInheritNekoCB.class; }
}
