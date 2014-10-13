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
 * The behavior of vendor_date_pk as TABLE. <br />
 * <pre>
 * [primary key]
 *     foo_date
 *
 * [column]
 *     foo_date, foo_name
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
 *     vendor_date_fk
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     vendorDateFkList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendorDatePkBhv extends AbstractBehaviorWritable<VendorDatePk, VendorDatePkCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public VendorDatePkDbm getDBMeta() { return VendorDatePkDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public VendorDatePkCB newConditionBean() { return new VendorDatePkCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * VendorDatePkCB cb = new VendorDatePkCB();
     * cb.query().setFoo...(value);
     * int count = vendorDatePkBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of VendorDatePk. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<VendorDatePkCB> cbLambda) {
        return facadeSelectCount(handleCBCall(cbLambda));
    }

    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * VendorDatePkCB cb = new VendorDatePkCB();
     * cb.query().setFoo...(value);
     * int count = vendorDatePkBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of VendorDatePk. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(VendorDatePkCB cb) {
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
     * VendorDatePkCB cb = new VendorDatePkCB();
     * cb.query().setFoo...(value);
     * VendorDatePk vendorDatePk = vendorDatePkBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (vendorDatePk != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = vendorDatePk.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of VendorDatePk. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorDatePk selectEntity(CBCall<VendorDatePkCB> cbLambda) {
        return facadeSelectEntity(handleCBCall(cbLambda));
    }

    /**
     * Select the entity by the condition-bean. #beforejava8 <br />
     * <span style="color: #AD4747; font-size: 120%">The return might be null if no data, so you should have null check.</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, use selectEntityWithDeletedCheck().</span>
     * <pre>
     * VendorDatePkCB cb = new VendorDatePkCB();
     * cb.query().setFoo...(value);
     * VendorDatePk vendorDatePk = vendorDatePkBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (vendorDatePk != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = vendorDatePk.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of VendorDatePk. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorDatePk selectEntity(VendorDatePkCB cb) {
        return facadeSelectEntity(cb);
    }

    protected VendorDatePk facadeSelectEntity(VendorDatePkCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorDatePk> OptionalEntity<ENTITY> doSelectOptionalEntity(VendorDatePkCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * VendorDatePkCB cb = new VendorDatePkCB();
     * cb.query().setFoo...(value);
     * VendorDatePk vendorDatePk = vendorDatePkBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = vendorDatePk.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of VendorDatePk. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorDatePk selectEntityWithDeletedCheck(CBCall<VendorDatePkCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(handleCBCall(cbLambda));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * VendorDatePkCB cb = new VendorDatePkCB();
     * cb.query().setFoo...(value);
     * VendorDatePk vendorDatePk = vendorDatePkBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = vendorDatePk.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of VendorDatePk. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorDatePk selectEntityWithDeletedCheck(VendorDatePkCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param fooDate : PK, NotNull, date(13). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public VendorDatePk selectByPK(java.util.Date fooDate) {
        return facadeSelectByPK(fooDate);
    }

    protected VendorDatePk facadeSelectByPK(java.util.Date fooDate) {
        return doSelectByPK(fooDate, typeOfSelectedEntity());
    }

    protected <ENTITY extends VendorDatePk> ENTITY doSelectByPK(java.util.Date fooDate, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(fooDate), tp);
    }

    protected <ENTITY extends VendorDatePk> OptionalEntity<ENTITY> doSelectOptionalByPK(java.util.Date fooDate, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(fooDate, tp), fooDate);
    }

    protected VendorDatePkCB xprepareCBAsPK(java.util.Date fooDate) {
        assertObjectNotNull("fooDate", fooDate);
        return newConditionBean().acceptPK(fooDate);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * VendorDatePkCB cb = new VendorDatePkCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;VendorDatePk&gt; vendorDatePkList = vendorDatePkBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (VendorDatePk vendorDatePk : vendorDatePkList) {
     *     ... = vendorDatePk.get...();
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of VendorDatePk. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<VendorDatePk> selectList(CBCall<VendorDatePkCB> cbLambda) {
        return facadeSelectList(handleCBCall(cbLambda));
    }

    /**
     * Select the list as result bean.
     * <pre>
     * VendorDatePkCB cb = new VendorDatePkCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;VendorDatePk&gt; vendorDatePkList = vendorDatePkBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (VendorDatePk vendorDatePk : vendorDatePkList) {
     *     ... = vendorDatePk.get...();
     * }
     * </pre>
     * @param cb The condition-bean of VendorDatePk. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<VendorDatePk> selectList(VendorDatePkCB cb) {
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
     * VendorDatePkCB cb = new VendorDatePkCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;VendorDatePk&gt; page = vendorDatePkBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (VendorDatePk vendorDatePk : page) {
     *     ... = vendorDatePk.get...();
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of VendorDatePk. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<VendorDatePk> selectPage(CBCall<VendorDatePkCB> cbLambda) {
        return facadeSelectPage(handleCBCall(cbLambda));
    }

    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * VendorDatePkCB cb = new VendorDatePkCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;VendorDatePk&gt; page = vendorDatePkBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (VendorDatePk vendorDatePk : page) {
     *     ... = vendorDatePk.get...();
     * }
     * </pre>
     * @param cb The condition-bean of VendorDatePk. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<VendorDatePk> selectPage(VendorDatePkCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * VendorDatePkCB cb = new VendorDatePkCB();
     * cb.query().setFoo...(value);
     * vendorDatePkBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;VendorDatePk&gt;() {
     *     public void handle(VendorDatePk entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of VendorDatePk. (NotNull)
     * @param entityLambda The handler of entity row of VendorDatePk. (NotNull)
     */
    public void selectCursor(CBCall<VendorDatePkCB> cbLambda, EntityRowHandler<VendorDatePk> entityLambda) {
        facadeSelectCursor(handleCBCall(cbLambda), entityLambda);
    }

    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * VendorDatePkCB cb = new VendorDatePkCB();
     * cb.query().setFoo...(value);
     * vendorDatePkBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;VendorDatePk&gt;() {
     *     public void handle(VendorDatePk entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of VendorDatePk. (NotNull)
     * @param entityRowHandler The handler of entity row of VendorDatePk. (NotNull)
     */
    public void selectCursor(VendorDatePkCB cb, EntityRowHandler<VendorDatePk> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * vendorDatePkBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(VendorDatePkCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<VendorDatePkCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param vendorDatePkList The entity list of vendorDatePk. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<VendorDatePk> vendorDatePkList, ReferrerLoaderHandler<LoaderOfVendorDatePk> loaderLambda) {
        xassLRArg(vendorDatePkList, loaderLambda);
        loaderLambda.handle(new LoaderOfVendorDatePk().ready(vendorDatePkList, _behaviorSelector));
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
     * @param vendorDatePk The entity of vendorDatePk. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(VendorDatePk vendorDatePk, ReferrerLoaderHandler<LoaderOfVendorDatePk> loaderLambda) {
        xassLRArg(vendorDatePk, loaderLambda);
        loaderLambda.handle(new LoaderOfVendorDatePk().ready(xnewLRAryLs(vendorDatePk), _behaviorSelector));
    }

    /**
     * Load referrer of vendorDateFkList by the set-upper of referrer. <br />
     * vendor_date_fk by bar_date, named 'vendorDateFkList'.
     * <pre>
     * vendorDatePkBhv.<span style="color: #DD4747">loadVendorDateFkList</span>(vendorDatePkList, fkCB -&gt; {
     *     fkCB.setupSelect...();
     *     fkCB.query().setFoo...(value);
     *     fkCB.query().addOrderBy_Bar...();
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (VendorDatePk vendorDatePk : vendorDatePkList) {
     *     ... = vendorDatePk.<span style="color: #DD4747">getVendorDateFkList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setBarDate_InScope(pkList);
     * cb.query().addOrderBy_BarDate_Asc();
     * </pre>
     * @param vendorDatePkList The entity list of vendorDatePk. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<VendorDateFk> loadVendorDateFkList(List<VendorDatePk> vendorDatePkList, ConditionBeanSetupper<VendorDateFkCB> refCBLambda) {
        xassLRArg(vendorDatePkList, refCBLambda);
        return doLoadVendorDateFkList(vendorDatePkList, new LoadReferrerOption<VendorDateFkCB, VendorDateFk>().xinit(refCBLambda));
    }

    /**
     * Load referrer of vendorDateFkList by the set-upper of referrer. <br />
     * vendor_date_fk by bar_date, named 'vendorDateFkList'.
     * <pre>
     * vendorDatePkBhv.<span style="color: #DD4747">loadVendorDateFkList</span>(vendorDatePkList, fkCB -&gt; {
     *     fkCB.setupSelect...();
     *     fkCB.query().setFoo...(value);
     *     fkCB.query().addOrderBy_Bar...();
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = vendorDatePk.<span style="color: #DD4747">getVendorDateFkList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setBarDate_InScope(pkList);
     * cb.query().addOrderBy_BarDate_Asc();
     * </pre>
     * @param vendorDatePk The entity of vendorDatePk. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<VendorDateFk> loadVendorDateFkList(VendorDatePk vendorDatePk, ConditionBeanSetupper<VendorDateFkCB> refCBLambda) {
        xassLRArg(vendorDatePk, refCBLambda);
        return doLoadVendorDateFkList(xnewLRLs(vendorDatePk), new LoadReferrerOption<VendorDateFkCB, VendorDateFk>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param vendorDatePk The entity of vendorDatePk. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<VendorDateFk> loadVendorDateFkList(VendorDatePk vendorDatePk, LoadReferrerOption<VendorDateFkCB, VendorDateFk> loadReferrerOption) {
        xassLRArg(vendorDatePk, loadReferrerOption);
        return loadVendorDateFkList(xnewLRLs(vendorDatePk), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param vendorDatePkList The entity list of vendorDatePk. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<VendorDateFk> loadVendorDateFkList(List<VendorDatePk> vendorDatePkList, LoadReferrerOption<VendorDateFkCB, VendorDateFk> loadReferrerOption) {
        xassLRArg(vendorDatePkList, loadReferrerOption);
        if (vendorDatePkList.isEmpty()) { return (NestedReferrerListGateway<VendorDateFk>)EMPTY_NREF_LGWAY; }
        return doLoadVendorDateFkList(vendorDatePkList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<VendorDateFk> doLoadVendorDateFkList(List<VendorDatePk> vendorDatePkList, LoadReferrerOption<VendorDateFkCB, VendorDateFk> option) {
        return helpLoadReferrerInternally(vendorDatePkList, option, "vendorDateFkList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key fooDate.
     * @param vendorDatePkList The list of vendorDatePk. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<java.util.Date> extractFooDateList(List<VendorDatePk> vendorDatePkList)
    { return helpExtractListInternally(vendorDatePkList, "fooDate"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * VendorDatePk vendorDatePk = new VendorDatePk();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorDatePk.setFoo...(value);
     * vendorDatePk.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorDatePk.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorDatePk.set...;</span>
     * vendorDatePkBhv.<span style="color: #DD4747">insert</span>(vendorDatePk);
     * ... = vendorDatePk.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param vendorDatePk The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(VendorDatePk vendorDatePk) {
        doInsert(vendorDatePk, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * VendorDatePk vendorDatePk = new VendorDatePk();
     * vendorDatePk.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorDatePk.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorDatePk.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorDatePk.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorDatePk.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     vendorDatePkBhv.<span style="color: #DD4747">update</span>(vendorDatePk);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorDatePk The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(VendorDatePk vendorDatePk) {
        doUpdate(vendorDatePk, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param vendorDatePk The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(VendorDatePk vendorDatePk) {
        doInsertOrUpdate(vendorDatePk, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * VendorDatePk vendorDatePk = new VendorDatePk();
     * vendorDatePk.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorDatePk.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     vendorDatePkBhv.<span style="color: #DD4747">delete</span>(vendorDatePk);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorDatePk The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(VendorDatePk vendorDatePk) {
        doDelete(vendorDatePk, null);
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
     *     VendorDatePk vendorDatePk = new VendorDatePk();
     *     vendorDatePk.setFooName("foo");
     *     if (...) {
     *         vendorDatePk.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     vendorDatePkList.add(vendorDatePk);
     * }
     * vendorDatePkBhv.<span style="color: #DD4747">batchInsert</span>(vendorDatePkList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param vendorDatePkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<VendorDatePk> vendorDatePkList) {
        return doBatchInsert(vendorDatePkList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     VendorDatePk vendorDatePk = new VendorDatePk();
     *     vendorDatePk.setFooName("foo");
     *     if (...) {
     *         vendorDatePk.setFooPrice(123);
     *     } else {
     *         vendorDatePk.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//vendorDatePk.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     vendorDatePkList.add(vendorDatePk);
     * }
     * vendorDatePkBhv.<span style="color: #DD4747">batchUpdate</span>(vendorDatePkList);
     * </pre>
     * @param vendorDatePkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<VendorDatePk> vendorDatePkList) {
        return doBatchUpdate(vendorDatePkList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param vendorDatePkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<VendorDatePk> vendorDatePkList) {
        return doBatchDelete(vendorDatePkList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * vendorDatePkBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;VendorDatePk, VendorDatePkCB&gt;() {
     *     public ConditionBean setup(VendorDatePk entity, VendorDatePkCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<VendorDatePk, VendorDatePkCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * VendorDatePk vendorDatePk = new VendorDatePk();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorDatePk.setPK...(value);</span>
     * vendorDatePk.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorDatePk.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorDatePk.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorDatePk.setVersionNo(value);</span>
     * VendorDatePkCB cb = new VendorDatePkCB();
     * cb.query().setFoo...(value);
     * vendorDatePkBhv.<span style="color: #DD4747">queryUpdate</span>(vendorDatePk, cb);
     * </pre>
     * @param vendorDatePk The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of VendorDatePk. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(VendorDatePk vendorDatePk, CBCall<VendorDatePkCB> cbLambda) {
        return doQueryUpdate(vendorDatePk, handleCBCall(cbLambda), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * VendorDatePk vendorDatePk = new VendorDatePk();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorDatePk.setPK...(value);</span>
     * vendorDatePk.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorDatePk.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorDatePk.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorDatePk.setVersionNo(value);</span>
     * VendorDatePkCB cb = new VendorDatePkCB();
     * cb.query().setFoo...(value);
     * vendorDatePkBhv.<span style="color: #DD4747">queryUpdate</span>(vendorDatePk, cb);
     * </pre>
     * @param vendorDatePk The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of VendorDatePk. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(VendorDatePk vendorDatePk, VendorDatePkCB cb) {
        return doQueryUpdate(vendorDatePk, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * VendorDatePkCB cb = new VendorDatePkCB();
     * cb.query().setFoo...(value);
     * vendorDatePkBhv.<span style="color: #DD4747">queryDelete</span>(vendorDatePk, cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of VendorDatePk. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<VendorDatePkCB> cbLambda) {
        return doQueryDelete(handleCBCall(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * VendorDatePkCB cb = new VendorDatePkCB();
     * cb.query().setFoo...(value);
     * vendorDatePkBhv.<span style="color: #DD4747">queryDelete</span>(vendorDatePk, cb);
     * </pre>
     * @param cb The condition-bean of VendorDatePk. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(VendorDatePkCB cb) {
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
     * VendorDatePk vendorDatePk = new VendorDatePk();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorDatePk.setFoo...(value);
     * vendorDatePk.setBar...(value);
     * InsertOption<VendorDatePkCB> option = new InsertOption<VendorDatePkCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * vendorDatePkBhv.<span style="color: #DD4747">varyingInsert</span>(vendorDatePk, option);
     * ... = vendorDatePk.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param vendorDatePk The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(VendorDatePk vendorDatePk, WOptionCall<VendorDatePkCB, InsertOption<VendorDatePkCB>> opLambda) {
        doInsert(vendorDatePk, handleInsertOpCall(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * VendorDatePk vendorDatePk = new VendorDatePk();
     * vendorDatePk.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorDatePk.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorDatePk.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;VendorDatePkCB&gt; option = new UpdateOption&lt;VendorDatePkCB&gt;();
     *     option.self(new SpecifyQuery&lt;VendorDatePkCB&gt;() {
     *         public void specify(VendorDatePkCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     vendorDatePkBhv.<span style="color: #DD4747">varyingUpdate</span>(vendorDatePk, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param vendorDatePk The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(VendorDatePk vendorDatePk, WOptionCall<VendorDatePkCB, UpdateOption<VendorDatePkCB>> opLambda) {
        doUpdate(vendorDatePk, handleUpdateOpCall(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param vendorDatePk The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(VendorDatePk vendorDatePk, WOptionCall<VendorDatePkCB, InsertOption<VendorDatePkCB>> insertOpLambda, WOptionCall<VendorDatePkCB, UpdateOption<VendorDatePkCB>> updateOpLambda) {
        doInsertOrUpdate(vendorDatePk, handleInsertOpCall(insertOpLambda), handleUpdateOpCall(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param vendorDatePk The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(VendorDatePk vendorDatePk, WOptionCall<VendorDatePkCB, DeleteOption<VendorDatePkCB>> opLambda) {
        doDelete(vendorDatePk, handleDeleteOpCall(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param vendorDatePkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<VendorDatePk> vendorDatePkList, WOptionCall<VendorDatePkCB, InsertOption<VendorDatePkCB>> opLambda) {
        return doBatchInsert(vendorDatePkList, handleInsertOpCall(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param vendorDatePkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<VendorDatePk> vendorDatePkList, WOptionCall<VendorDatePkCB, UpdateOption<VendorDatePkCB>> opLambda) {
        return doBatchUpdate(vendorDatePkList, handleUpdateOpCall(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param vendorDatePkList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<VendorDatePk> vendorDatePkList, WOptionCall<VendorDatePkCB, DeleteOption<VendorDatePkCB>> opLambda) {
        return doBatchDelete(vendorDatePkList, handleDeleteOpCall(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<VendorDatePk, VendorDatePkCB> manyArgLambda, WOptionCall<VendorDatePkCB, InsertOption<VendorDatePkCB>> opLambda) {
        return doQueryInsert(manyArgLambda, handleInsertOpCall(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * VendorDatePk vendorDatePk = new VendorDatePk();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorDatePk.setPK...(value);</span>
     * vendorDatePk.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorDatePk.setVersionNo(value);</span>
     * VendorDatePkCB cb = new VendorDatePkCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;VendorDatePkCB&gt; option = new UpdateOption&lt;VendorDatePkCB&gt;();
     * option.self(new SpecifyQuery&lt;VendorDatePkCB&gt;() {
     *     public void specify(VendorDatePkCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * vendorDatePkBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(vendorDatePk, cb, option);
     * </pre>
     * @param vendorDatePk The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of VendorDatePk. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(VendorDatePk vendorDatePk, CBCall<VendorDatePkCB> cbLambda, WOptionCall<VendorDatePkCB, UpdateOption<VendorDatePkCB>> opLambda) {
        return doQueryUpdate(vendorDatePk, handleCBCall(cbLambda), handleUpdateOpCall(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * VendorDatePk vendorDatePk = new VendorDatePk();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorDatePk.setPK...(value);</span>
     * vendorDatePk.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorDatePk.setVersionNo(value);</span>
     * VendorDatePkCB cb = new VendorDatePkCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;VendorDatePkCB&gt; option = new UpdateOption&lt;VendorDatePkCB&gt;();
     * option.self(new SpecifyQuery&lt;VendorDatePkCB&gt;() {
     *     public void specify(VendorDatePkCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * vendorDatePkBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(vendorDatePk, cb, option);
     * </pre>
     * @param vendorDatePk The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of VendorDatePk. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(VendorDatePk vendorDatePk, VendorDatePkCB cb, WOptionCall<VendorDatePkCB, UpdateOption<VendorDatePkCB>> opLambda) {
        return doQueryUpdate(vendorDatePk, cb, handleUpdateOpCall(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cbLambda The callback for condition-bean of VendorDatePk. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<VendorDatePkCB> cbLambda, WOptionCall<VendorDatePkCB, DeleteOption<VendorDatePkCB>> opLambda) {
        return doQueryDelete(handleCBCall(cbLambda), handleDeleteOpCall(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of VendorDatePk. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(VendorDatePkCB cb, WOptionCall<VendorDatePkCB, DeleteOption<VendorDatePkCB>> opLambda) {
        return doQueryDelete(cb, handleDeleteOpCall(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span> 
     * vendorDatePkBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span> 
     * vendorDatePkBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * vendorDatePkBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * vendorDatePkBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * vendorDatePkBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * vendorDatePkBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * vendorDatePkBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span> 
     * vendorDatePkBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * vendorDatePkBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * vendorDatePkBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * vendorDatePkBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * vendorDatePkBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * vendorDatePkBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span> 
     * vendorDatePkBhv.outideSql().removeBlockComment().selectList()
     * vendorDatePkBhv.outideSql().removeLineComment().selectList()
     * vendorDatePkBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<VendorDatePkBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<VendorDatePkBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends VendorDatePk> typeOfSelectedEntity() { return VendorDatePk.class; }
    protected Class<VendorDatePk> typeOfHandlingEntity() { return VendorDatePk.class; }
    protected Class<VendorDatePkCB> typeOfHandlingConditionBean() { return VendorDatePkCB.class; }
}
