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
 * The behavior of (会員住所情報)member_address as TABLE. <br />
 * <pre>
 * [primary key]
 *     member_address_id
 *
 * [column]
 *     member_address_id, member_id, valid_begin_date, valid_end_date, address, region_id, register_datetime, register_process, register_user, update_datetime, update_process, update_user, version_no
 *
 * [sequence]
 *     member_address_member_address_id_seq
 *
 * [identity]
 *     
 *
 * [version-no]
 *     version_no
 *
 * [foreign table]
 *     member, region
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     member, region
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMemberAddressBhv extends AbstractBehaviorWritable<MemberAddress, MemberAddressCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public MemberAddressDbm getDBMeta() { return MemberAddressDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public MemberAddressCB newConditionBean() { return new MemberAddressCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * MemberAddressCB cb = new MemberAddressCB();
     * cb.query().setFoo...(value);
     * int count = memberAddressBhv.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of MemberAddress. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<MemberAddressCB> cbLambda) {
        return facadeSelectCount(createCB(cbLambda));
    }

    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * MemberAddressCB cb = new MemberAddressCB();
     * cb.query().setFoo...(value);
     * int count = memberAddressBhv.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of MemberAddress. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(MemberAddressCB cb) {
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
     * MemberAddress memberAddress = memberAddressBhv.<span style="color: #CC4747">selectEntity</span>(cb -&gt; {
     *     cb.query().set...
     * });
     * if (memberAddress != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = memberAddress.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of MemberAddress. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MemberAddress selectEntity(CBCall<MemberAddressCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean. #beforejava8 <br />
     * <span style="color: #AD4747; font-size: 120%">The return might be null if no data, so you should have null check.</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, use selectEntityWithDeletedCheck().</span>
     * <pre>
     * MemberAddressCB cb = new MemberAddressCB();
     * cb.query().setFoo...(value);
     * MemberAddress memberAddress = memberAddressBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (memberAddress != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = memberAddress.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of MemberAddress. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MemberAddress selectEntity(MemberAddressCB cb) {
        return facadeSelectEntity(cb);
    }

    protected MemberAddress facadeSelectEntity(MemberAddressCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends MemberAddress> OptionalEntity<ENTITY> doSelectOptionalEntity(MemberAddressCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * MemberAddressCB cb = new MemberAddressCB();
     * cb.query().setFoo...(value);
     * MemberAddress memberAddress = memberAddressBhv.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = memberAddress.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of MemberAddress. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MemberAddress selectEntityWithDeletedCheck(CBCall<MemberAddressCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * MemberAddressCB cb = new MemberAddressCB();
     * cb.query().setFoo...(value);
     * MemberAddress memberAddress = memberAddressBhv.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = memberAddress.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of MemberAddress. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MemberAddress selectEntityWithDeletedCheck(MemberAddressCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param memberAddressId (会員住所ID): PK, ID, NotNull, serial(10). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MemberAddress selectByPK(Integer memberAddressId) {
        return facadeSelectByPK(memberAddressId);
    }

    protected MemberAddress facadeSelectByPK(Integer memberAddressId) {
        return doSelectByPK(memberAddressId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MemberAddress> ENTITY doSelectByPK(Integer memberAddressId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(memberAddressId), tp);
    }

    protected <ENTITY extends MemberAddress> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer memberAddressId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(memberAddressId, tp), memberAddressId);
    }

    protected MemberAddressCB xprepareCBAsPK(Integer memberAddressId) {
        assertObjectNotNull("memberAddressId", memberAddressId);
        return newConditionBean().acceptPK(memberAddressId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param memberId (会員ID): UQ+, NotNull, int4(10), FK to member. (NotNull)
     * @param validBeginDate (有効開始日): +UQ, NotNull, date(13). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<MemberAddress> selectByUniqueOf(Integer memberId, java.util.Date validBeginDate) {
        return facadeSelectByUniqueOf(memberId, validBeginDate);
    }

    protected OptionalEntity<MemberAddress> facadeSelectByUniqueOf(Integer memberId, java.util.Date validBeginDate) {
        return doSelectByUniqueOf(memberId, validBeginDate, typeOfSelectedEntity());
    }

    protected <ENTITY extends MemberAddress> OptionalEntity<ENTITY> doSelectByUniqueOf(Integer memberId, java.util.Date validBeginDate, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(memberId, validBeginDate), tp), memberId, validBeginDate);
    }

    protected MemberAddressCB xprepareCBAsUniqueOf(Integer memberId, java.util.Date validBeginDate) {
        assertObjectNotNull("memberId", memberId);assertObjectNotNull("validBeginDate", validBeginDate);
        return newConditionBean().acceptUniqueOf(memberId, validBeginDate);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;MemberAddress&gt; memberAddressList = memberAddressBhv.<span style="color: #CC4747">selectList</span>(cb -&gt; {
     *     cb.query().set...;
     *     cb.query().addOrderBy...;
     * });
     * memberAddressList.forEach(memberAddress -&gt; {
     *     ... = memberAddress.get...();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of MemberAddress. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<MemberAddress> selectList(CBCall<MemberAddressCB> cbLambda) {
        return facadeSelectList(createCB(cbLambda));
    }

    /**
     * Select the list as result bean.
     * <pre>
     * MemberAddressCB cb = new MemberAddressCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;MemberAddress&gt; memberAddressList = memberAddressBhv.<span style="color: #CC4747">selectList</span>(cb);
     * for (MemberAddress memberAddress : memberAddressList) {
     *     ... = memberAddress.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MemberAddress. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<MemberAddress> selectList(MemberAddressCB cb) {
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
     * MemberAddressCB cb = new MemberAddressCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;MemberAddress&gt; page = memberAddressBhv.<span style="color: #CC4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (MemberAddress memberAddress : page) {
     *     ... = memberAddress.get...();
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of MemberAddress. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<MemberAddress> selectPage(CBCall<MemberAddressCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * MemberAddressCB cb = new MemberAddressCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;MemberAddress&gt; page = memberAddressBhv.<span style="color: #CC4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (MemberAddress memberAddress : page) {
     *     ... = memberAddress.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MemberAddress. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<MemberAddress> selectPage(MemberAddressCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * MemberAddressCB cb = new MemberAddressCB();
     * cb.query().setFoo...(value);
     * memberAddressBhv.<span style="color: #CC4747">selectCursor</span>(cb, new EntityRowHandler&lt;MemberAddress&gt;() {
     *     public void handle(MemberAddress entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of MemberAddress. (NotNull)
     * @param entityLambda The handler of entity row of MemberAddress. (NotNull)
     */
    public void selectCursor(CBCall<MemberAddressCB> cbLambda, EntityRowHandler<MemberAddress> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * MemberAddressCB cb = new MemberAddressCB();
     * cb.query().setFoo...(value);
     * memberAddressBhv.<span style="color: #CC4747">selectCursor</span>(cb, new EntityRowHandler&lt;MemberAddress&gt;() {
     *     public void handle(MemberAddress entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of MemberAddress. (NotNull)
     * @param entityRowHandler The handler of entity row of MemberAddress. (NotNull)
     */
    public void selectCursor(MemberAddressCB cb, EntityRowHandler<MemberAddress> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * memberAddressBhv.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(MemberAddressCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MemberAddressCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    // ===================================================================================
    //                                                                            Sequence
    //                                                                            ========
    /**
     * Select the next value as sequence. <br />
     * This method is called when insert() and set to primary-key automatically.
     * So you don't need to call this as long as you need to get next value before insert().
     * @return The next value. (NotNull)
     */
    public Integer selectNextVal() {
        return facadeSelectNextVal();
    }

    protected Integer facadeSelectNextVal() {
        return doSelectNextVal(Integer.class);
    }

    protected <RESULT> RESULT doSelectNextVal(Class<RESULT> tp) {
        return delegateSelectNextVal(tp);
    }

    @Override
    protected Number doReadNextVal() {
        return facadeSelectNextVal();
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
     * memberBhv.<span style="color: #CC4747">load</span>(memberList, loader -&gt; {
     *     loader.<span style="color: #CC4747">loadPurchaseList</span>(purchaseCB -&gt; {
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
     *     List&lt;Purchase&gt; purchaseList = member.<span style="color: #CC4747">getPurchaseList()</span>;
     *     for (Purchase purchase : purchaseList) {
     *         ...
     *     }
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param memberAddressList The entity list of memberAddress. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<MemberAddress> memberAddressList, ReferrerLoaderHandler<LoaderOfMemberAddress> loaderLambda) {
        xassLRArg(memberAddressList, loaderLambda);
        loaderLambda.handle(new LoaderOfMemberAddress().ready(memberAddressList, _behaviorSelector));
    }

    /**
     * Load referrer of ${referrer.referrerJavaBeansRulePropertyName} by the referrer loader. <br />
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.query().set...
     * Member member = memberBhv.selectEntityWithDeletedCheck(cb);
     * memberBhv.<span style="color: #CC4747">load</span>(member, loader -&gt; {
     *     loader.<span style="color: #CC4747">loadPurchaseList</span>(purchaseCB -&gt; {
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
     *     List&lt;Purchase&gt; purchaseList = member.<span style="color: #CC4747">getPurchaseList()</span>;
     *     for (Purchase purchase : purchaseList) {
     *         ...
     *     }
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param memberAddress The entity of memberAddress. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(MemberAddress memberAddress, ReferrerLoaderHandler<LoaderOfMemberAddress> loaderLambda) {
        xassLRArg(memberAddress, loaderLambda);
        loaderLambda.handle(new LoaderOfMemberAddress().ready(xnewLRAryLs(memberAddress), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'Member'.
     * @param memberAddressList The list of memberAddress. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Member> pulloutMember(List<MemberAddress> memberAddressList)
    { return helpPulloutInternally(memberAddressList, "member"); }

    /**
     * Pull out the list of foreign table 'Region'.
     * @param memberAddressList The list of memberAddress. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Region> pulloutRegion(List<MemberAddress> memberAddressList)
    { return helpPulloutInternally(memberAddressList, "region"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key memberAddressId.
     * @param memberAddressList The list of memberAddress. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractMemberAddressIdList(List<MemberAddress> memberAddressList)
    { return helpExtractListInternally(memberAddressList, "memberAddressId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * MemberAddress memberAddress = new MemberAddress();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * memberAddress.setFoo...(value);
     * memberAddress.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//memberAddress.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//memberAddress.set...;</span>
     * memberAddressBhv.<span style="color: #CC4747">insert</span>(memberAddress);
     * ... = memberAddress.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param memberAddress The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(MemberAddress memberAddress) {
        doInsert(memberAddress, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * MemberAddress memberAddress = new MemberAddress();
     * memberAddress.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * memberAddress.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//memberAddress.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//memberAddress.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * memberAddress.<span style="color: #CC4747">setVersionNo</span>(value);
     * try {
     *     memberAddressBhv.<span style="color: #CC4747">update</span>(memberAddress);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param memberAddress The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(MemberAddress memberAddress) {
        doUpdate(memberAddress, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * MemberAddress memberAddress = new MemberAddress();
     * memberAddress.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * memberAddress.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//memberAddress.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//memberAddress.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//memberAddress.setVersionNo(value);</span>
     * memberAddressBhv.<span style="color: #CC4747">updateNonstrict</span>(memberAddress);
     * </pre>
     * @param memberAddress The entity of update. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(MemberAddress memberAddress) {
        doUpdateNonstrict(memberAddress, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #CC4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param memberAddress The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(MemberAddress memberAddress) {
        doInsertOrUpdate(memberAddress, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #CC4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param memberAddress The entity of insert or update. (NotNull, ...depends on insert or update)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(MemberAddress memberAddress) {
        doInsertOrUpdateNonstrict(memberAddress, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * MemberAddress memberAddress = new MemberAddress();
     * memberAddress.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * memberAddress.<span style="color: #CC4747">setVersionNo</span>(value);
     * try {
     *     memberAddressBhv.<span style="color: #CC4747">delete</span>(memberAddress);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param memberAddress The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(MemberAddress memberAddress) {
        doDelete(memberAddress, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * MemberAddress memberAddress = new MemberAddress();
     * memberAddress.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//memberAddress.setVersionNo(value);</span>
     * memberAddressBhv.<span style="color: #CC4747">deleteNonstrict</span>(memberAddress);
     * </pre>
     * @param memberAddress The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(MemberAddress memberAddress) {
        doDeleteNonstrict(memberAddress, null);
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
     *     MemberAddress memberAddress = new MemberAddress();
     *     memberAddress.setFooName("foo");
     *     if (...) {
     *         memberAddress.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     memberAddressList.add(memberAddress);
     * }
     * memberAddressBhv.<span style="color: #CC4747">batchInsert</span>(memberAddressList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param memberAddressList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<MemberAddress> memberAddressList) {
        return doBatchInsert(memberAddressList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     MemberAddress memberAddress = new MemberAddress();
     *     memberAddress.setFooName("foo");
     *     if (...) {
     *         memberAddress.setFooPrice(123);
     *     } else {
     *         memberAddress.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//memberAddress.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     memberAddressList.add(memberAddress);
     * }
     * memberAddressBhv.<span style="color: #CC4747">batchUpdate</span>(memberAddressList);
     * </pre>
     * @param memberAddressList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MemberAddress> memberAddressList) {
        return doBatchUpdate(memberAddressList, null);
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     MemberAddress memberAddress = new MemberAddress();
     *     memberAddress.setFooName("foo");
     *     if (...) {
     *         memberAddress.setFooPrice(123);
     *     } else {
     *         memberAddress.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//memberAddress.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     memberAddressList.add(memberAddress);
     * }
     * memberAddressBhv.<span style="color: #CC4747">batchUpdate</span>(memberAddressList);
     * </pre>
     * @param memberAddressList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MemberAddress> memberAddressList) {
        return doBatchUpdateNonstrict(memberAddressList, null);
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param memberAddressList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<MemberAddress> memberAddressList) {
        return doBatchDelete(memberAddressList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param memberAddressList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<MemberAddress> memberAddressList) {
        return doBatchDeleteNonstrict(memberAddressList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * memberAddressBhv.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;MemberAddress, MemberAddressCB&gt;() {
     *     public ConditionBean setup(MemberAddress entity, MemberAddressCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<MemberAddress, MemberAddressCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * MemberAddress memberAddress = new MemberAddress();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//memberAddress.setPK...(value);</span>
     * memberAddress.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//memberAddress.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//memberAddress.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//memberAddress.setVersionNo(value);</span>
     * MemberAddressCB cb = new MemberAddressCB();
     * cb.query().setFoo...(value);
     * memberAddressBhv.<span style="color: #CC4747">queryUpdate</span>(memberAddress, cb);
     * </pre>
     * @param memberAddress The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of MemberAddress. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(MemberAddress memberAddress, CBCall<MemberAddressCB> cbLambda) {
        return doQueryUpdate(memberAddress, createCB(cbLambda), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * MemberAddress memberAddress = new MemberAddress();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//memberAddress.setPK...(value);</span>
     * memberAddress.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//memberAddress.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//memberAddress.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//memberAddress.setVersionNo(value);</span>
     * MemberAddressCB cb = new MemberAddressCB();
     * cb.query().setFoo...(value);
     * memberAddressBhv.<span style="color: #CC4747">queryUpdate</span>(memberAddress, cb);
     * </pre>
     * @param memberAddress The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of MemberAddress. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(MemberAddress memberAddress, MemberAddressCB cb) {
        return doQueryUpdate(memberAddress, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * MemberAddressCB cb = new MemberAddressCB();
     * cb.query().setFoo...(value);
     * memberAddressBhv.<span style="color: #CC4747">queryDelete</span>(memberAddress, cb);
     * </pre>
     * @param cbLambda The callback for condition-bean of MemberAddress. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<MemberAddressCB> cbLambda) {
        return doQueryDelete(createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * MemberAddressCB cb = new MemberAddressCB();
     * cb.query().setFoo...(value);
     * memberAddressBhv.<span style="color: #CC4747">queryDelete</span>(memberAddress, cb);
     * </pre>
     * @param cb The condition-bean of MemberAddress. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(MemberAddressCB cb) {
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
     * MemberAddress memberAddress = new MemberAddress();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * memberAddress.setFoo...(value);
     * memberAddress.setBar...(value);
     * InsertOption<MemberAddressCB> option = new InsertOption<MemberAddressCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * memberAddressBhv.<span style="color: #CC4747">varyingInsert</span>(memberAddress, option);
     * ... = memberAddress.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param memberAddress The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(MemberAddress memberAddress, WritableOptionCall<MemberAddressCB, InsertOption<MemberAddressCB>> opLambda) {
        doInsert(memberAddress, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * MemberAddress memberAddress = new MemberAddress();
     * memberAddress.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * memberAddress.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * memberAddress.<span style="color: #CC4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;MemberAddressCB&gt; option = new UpdateOption&lt;MemberAddressCB&gt;();
     *     option.self(new SpecifyQuery&lt;MemberAddressCB&gt;() {
     *         public void specify(MemberAddressCB cb) {
     *             cb.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     memberAddressBhv.<span style="color: #CC4747">varyingUpdate</span>(memberAddress, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param memberAddress The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(MemberAddress memberAddress, WritableOptionCall<MemberAddressCB, UpdateOption<MemberAddressCB>> opLambda) {
        doUpdate(memberAddress, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MemberAddress memberAddress = new MemberAddress();
     * memberAddress.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * memberAddress.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//memberAddress.setVersionNo(value);</span>
     * UpdateOption&lt;MemberAddressCB&gt; option = new UpdateOption&lt;MemberAddressCB&gt;();
     * option.self(new SpecifyQuery&lt;MemberAddressCB&gt;() {
     *     public void specify(MemberAddressCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * memberAddressBhv.<span style="color: #CC4747">varyingUpdateNonstrict</span>(memberAddress, option);
     * </pre>
     * @param memberAddress The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(MemberAddress memberAddress, WritableOptionCall<MemberAddressCB, UpdateOption<MemberAddressCB>> opLambda) {
        doUpdateNonstrict(memberAddress, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param memberAddress The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(MemberAddress memberAddress, WritableOptionCall<MemberAddressCB, InsertOption<MemberAddressCB>> insertOpLambda, WritableOptionCall<MemberAddressCB, UpdateOption<MemberAddressCB>> updateOpLambda) {
        doInsertOrUpdate(memberAddress, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param memberAddress The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(MemberAddress memberAddress, WritableOptionCall<MemberAddressCB, InsertOption<MemberAddressCB>> insertOpLambda, WritableOptionCall<MemberAddressCB, UpdateOption<MemberAddressCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(memberAddress, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param memberAddress The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(MemberAddress memberAddress, WritableOptionCall<MemberAddressCB, DeleteOption<MemberAddressCB>> opLambda) {
        doDelete(memberAddress, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as deleteNonstrict(entity).
     * @param memberAddress The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(MemberAddress memberAddress, WritableOptionCall<MemberAddressCB, DeleteOption<MemberAddressCB>> opLambda) {
        doDeleteNonstrict(memberAddress, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param memberAddressList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<MemberAddress> memberAddressList, WritableOptionCall<MemberAddressCB, InsertOption<MemberAddressCB>> opLambda) {
        return doBatchInsert(memberAddressList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param memberAddressList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<MemberAddress> memberAddressList, WritableOptionCall<MemberAddressCB, UpdateOption<MemberAddressCB>> opLambda) {
        return doBatchUpdate(memberAddressList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param memberAddressList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<MemberAddress> memberAddressList, WritableOptionCall<MemberAddressCB, UpdateOption<MemberAddressCB>> opLambda) {
        return doBatchUpdateNonstrict(memberAddressList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param memberAddressList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<MemberAddress> memberAddressList, WritableOptionCall<MemberAddressCB, DeleteOption<MemberAddressCB>> opLambda) {
        return doBatchDelete(memberAddressList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param memberAddressList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<MemberAddress> memberAddressList, WritableOptionCall<MemberAddressCB, DeleteOption<MemberAddressCB>> opLambda) {
        return doBatchDeleteNonstrict(memberAddressList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<MemberAddress, MemberAddressCB> manyArgLambda, WritableOptionCall<MemberAddressCB, InsertOption<MemberAddressCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MemberAddress memberAddress = new MemberAddress();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//memberAddress.setPK...(value);</span>
     * memberAddress.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//memberAddress.setVersionNo(value);</span>
     * MemberAddressCB cb = new MemberAddressCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;MemberAddressCB&gt; option = new UpdateOption&lt;MemberAddressCB&gt;();
     * option.self(new SpecifyQuery&lt;MemberAddressCB&gt;() {
     *     public void specify(MemberAddressCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * memberAddressBhv.<span style="color: #CC4747">varyingQueryUpdate</span>(memberAddress, cb, option);
     * </pre>
     * @param memberAddress The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of MemberAddress. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(MemberAddress memberAddress, CBCall<MemberAddressCB> cbLambda, WritableOptionCall<MemberAddressCB, UpdateOption<MemberAddressCB>> opLambda) {
        return doQueryUpdate(memberAddress, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MemberAddress memberAddress = new MemberAddress();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//memberAddress.setPK...(value);</span>
     * memberAddress.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//memberAddress.setVersionNo(value);</span>
     * MemberAddressCB cb = new MemberAddressCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;MemberAddressCB&gt; option = new UpdateOption&lt;MemberAddressCB&gt;();
     * option.self(new SpecifyQuery&lt;MemberAddressCB&gt;() {
     *     public void specify(MemberAddressCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * memberAddressBhv.<span style="color: #CC4747">varyingQueryUpdate</span>(memberAddress, cb, option);
     * </pre>
     * @param memberAddress The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of MemberAddress. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(MemberAddress memberAddress, MemberAddressCB cb, WritableOptionCall<MemberAddressCB, UpdateOption<MemberAddressCB>> opLambda) {
        return doQueryUpdate(memberAddress, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cbLambda The callback for condition-bean of MemberAddress. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<MemberAddressCB> cbLambda, WritableOptionCall<MemberAddressCB, DeleteOption<MemberAddressCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of MemberAddress. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(MemberAddressCB cb, WritableOptionCall<MemberAddressCB, DeleteOption<MemberAddressCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span> 
     * memberAddressBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span> 
     * memberAddressBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * memberAddressBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * memberAddressBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * memberAddressBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * memberAddressBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * memberAddressBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span> 
     * memberAddressBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * memberAddressBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * memberAddressBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * memberAddressBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * memberAddressBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * memberAddressBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span> 
     * memberAddressBhv.outideSql().removeBlockComment().selectList()
     * memberAddressBhv.outideSql().removeLineComment().selectList()
     * memberAddressBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<MemberAddressBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<MemberAddressBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends MemberAddress> typeOfSelectedEntity() { return MemberAddress.class; }
    protected Class<MemberAddress> typeOfHandlingEntity() { return MemberAddress.class; }
    protected Class<MemberAddressCB> typeOfHandlingConditionBean() { return MemberAddressCB.class; }
}
