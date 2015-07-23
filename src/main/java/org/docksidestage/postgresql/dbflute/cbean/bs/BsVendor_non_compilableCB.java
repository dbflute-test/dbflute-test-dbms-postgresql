package org.docksidestage.postgresql.dbflute.cbean.bs;

import org.dbflute.cbean.AbstractConditionBean;
import org.dbflute.cbean.ConditionBean;
import org.dbflute.cbean.ConditionQuery;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.dream.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.cbean.sqlclause.SqlClauseCreator;
import org.dbflute.cbean.scoping.*;
import org.dbflute.dbmeta.DBMetaProvider;
import org.dbflute.twowaysql.factory.SqlAnalyzerFactory;
import org.dbflute.twowaysql.style.BoundDateDisplayTimeZoneProvider;
import org.docksidestage.postgresql.dbflute.allcommon.DBFluteConfig;
import org.docksidestage.postgresql.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.postgresql.dbflute.allcommon.ImplementedInvokerAssistant;
import org.docksidestage.postgresql.dbflute.allcommon.ImplementedSqlClauseCreator;
import org.docksidestage.postgresql.dbflute.cbean.*;
import org.docksidestage.postgresql.dbflute.cbean.cq.*;
import org.docksidestage.postgresql.dbflute.cbean.nss.*;

/**
 * The base condition-bean of VENDOR-NON COMPILABLE.
 * @author DBFlute(AutoGenerator)
 */
public class BsVendor_non_compilableCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected Vendor_non_compilableCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsVendor_non_compilableCB() {
        if (DBFluteConfig.getInstance().isPagingCountLater()) {
            enablePagingCountLater();
        }
        if (DBFluteConfig.getInstance().isPagingCountLeastJoin()) {
            enablePagingCountLeastJoin();
        }
        if (DBFluteConfig.getInstance().isNonSpecifiedColumnAccessAllowed()) {
            enableNonSpecifiedColumnAccess();
        }
        if (DBFluteConfig.getInstance().isQueryUpdateCountPreCheck()) {
            enableQueryUpdateCountPreCheck();
        }
    }

    // ===================================================================================
    //                                                                           SqlClause
    //                                                                           =========
    @Override
    protected SqlClause createSqlClause() {
        SqlClauseCreator creator = DBFluteConfig.getInstance().getSqlClauseCreator();
        if (creator != null) {
            return creator.createSqlClause(this);
        }
        return new ImplementedSqlClauseCreator().createSqlClause(this); // as default
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider getDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider(); // as default
    }

    public String asTableDbName() {
        return "VENDOR-NON COMPILABLE";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param non_compilable_id : PK, NotNull, int4(10). (NotNull)
     * @return this. (NotNull)
     */
    public Vendor_non_compilableCB acceptPK(Integer non_compilable_id) {
        assertObjectNotNull("non_compilable_id", non_compilable_id);
        BsVendor_non_compilableCB cb = this;
        cb.query().setNon_compilable_id_Equal(non_compilable_id);
        return (Vendor_non_compilableCB)this;
    }

    /**
     * Accept the query condition of unique key as equal.
     * @param non_compilable_id : PK, NotNull, int4(10). (NotNull)
     * @return this. (NotNull)
     */
    public Vendor_non_compilableCB acceptUniqueOf(Integer non_compilable_id) {
        assertObjectNotNull("non_compilable_id", non_compilable_id);
        BsVendor_non_compilableCB cb = this;
        cb.query().setNon_compilable_id_Equal(non_compilable_id);
        return (Vendor_non_compilableCB)this;
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_Non_compilable_id_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_Non_compilable_id_Desc();
        return this;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Prepare for various queries. <br>
     * Examples of main functions are following:
     * <pre>
     * <span style="color: #3F7E5E">// Basic Queries</span>
     * cb.query().setMemberId_Equal(value);        <span style="color: #3F7E5E">// =</span>
     * cb.query().setMemberId_NotEqual(value);     <span style="color: #3F7E5E">// !=</span>
     * cb.query().setMemberId_GreaterThan(value);  <span style="color: #3F7E5E">// &gt;</span>
     * cb.query().setMemberId_LessThan(value);     <span style="color: #3F7E5E">// &lt;</span>
     * cb.query().setMemberId_GreaterEqual(value); <span style="color: #3F7E5E">// &gt;=</span>
     * cb.query().setMemberId_LessEqual(value);    <span style="color: #3F7E5E">// &lt;=</span>
     * cb.query().setMemberName_InScope(valueList);    <span style="color: #3F7E5E">// in ('a', 'b')</span>
     * cb.query().setMemberName_NotInScope(valueList); <span style="color: #3F7E5E">// not in ('a', 'b')</span>
     * <span style="color: #3F7E5E">// LikeSearch with various options: (versatile)</span>
     * <span style="color: #3F7E5E">// {like ... [options]}</span>
     * cb.query().setMemberName_LikeSearch(value, option);
     * cb.query().setMemberName_NotLikeSearch(value, option); <span style="color: #3F7E5E">// not like ...</span>
     * <span style="color: #3F7E5E">// FromTo with various options: (versatile)</span>
     * <span style="color: #3F7E5E">// {(default) fromDatetime &lt;= BIRTHDATE &lt;= toDatetime}</span>
     * cb.query().setBirthdate_FromTo(fromDatetime, toDatetime, option);
     * <span style="color: #3F7E5E">// DateFromTo: (Date means yyyy/MM/dd)</span>
     * <span style="color: #3F7E5E">// {fromDate &lt;= BIRTHDATE &lt; toDate + 1 day}</span>
     * cb.query().setBirthdate_IsNull();    <span style="color: #3F7E5E">// is null</span>
     * cb.query().setBirthdate_IsNotNull(); <span style="color: #3F7E5E">// is not null</span>
     * 
     * <span style="color: #3F7E5E">// ExistsReferrer: (correlated sub-query)</span>
     * <span style="color: #3F7E5E">// {where exists (select PURCHASE_ID from PURCHASE where ...)}</span>
     * cb.query().existsPurchase(purchaseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     purchaseCB.query().set... <span style="color: #3F7E5E">// referrer sub-query condition</span>
     * });
     * cb.query().notExistsPurchase...
     * 
     * <span style="color: #3F7E5E">// (Query)DerivedReferrer: (correlated sub-query)</span>
     * cb.query().derivedPurchaseList().max(purchaseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     purchaseCB.specify().columnPurchasePrice(); <span style="color: #3F7E5E">// derived column for function</span>
     *     purchaseCB.query().set... <span style="color: #3F7E5E">// referrer sub-query condition</span>
     * }).greaterEqual(value);
     * 
     * <span style="color: #3F7E5E">// ScalarCondition: (self-table sub-query)</span>
     * cb.query().scalar_Equal().max(scalarCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     scalarCB.specify().columnBirthdate(); <span style="color: #3F7E5E">// derived column for function</span>
     *     scalarCB.query().set... <span style="color: #3F7E5E">// scalar sub-query condition</span>
     * });
     * 
     * <span style="color: #3F7E5E">// OrderBy</span>
     * cb.query().addOrderBy_MemberName_Asc();
     * cb.query().addOrderBy_MemberName_Desc().withManualOrder(option);
     * cb.query().addOrderBy_MemberName_Desc().withNullsFirst();
     * cb.query().addOrderBy_MemberName_Desc().withNullsLast();
     * cb.query().addSpecifiedDerivedOrderBy_Desc(aliasName);
     * 
     * <span style="color: #3F7E5E">// Query(Relation)</span>
     * cb.query().queryMemberStatus()...;
     * cb.query().queryMemberAddressAsValid(targetDate)...;
     * </pre>
     * @return The instance of condition-query for base-point table to set up query. (NotNull)
     */
    public Vendor_non_compilableCQ query() {
        assertQueryPurpose(); // assert only when user-public query 
        return doGetConditionQuery();
    }

    public Vendor_non_compilableCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected Vendor_non_compilableCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected Vendor_non_compilableCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected Vendor_non_compilableCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        Vendor_non_compilableCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected Vendor_non_compilableCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new Vendor_non_compilableCQ(childQuery, sqlClause, aliasName, nestLevel);
    }

    /**
     * {@inheritDoc}
     */
    public ConditionQuery localCQ() {
        return doGetConditionQuery();
    }

    // ===================================================================================
    //                                                                               Union
    //                                                                               =====
    /**
     * Set up 'union' for base-point table. <br>
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #CC4747">union</span>(<span style="color: #553000">unionCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">unionCB</span>.query().set...
     * });
     * </pre>
     * @param unionCBLambda The callback for query of 'union'. (NotNull)
     */
    public void union(UnionQuery<Vendor_non_compilableCB> unionCBLambda) {
        final Vendor_non_compilableCB cb = new Vendor_non_compilableCB(); cb.xsetupForUnion(this); xsyncUQ(cb); 
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final Vendor_non_compilableCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br>
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #CC4747">unionAll</span>(<span style="color: #553000">unionCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">unionCB</span>.query().set...
     * });
     * </pre>
     * @param unionCBLambda The callback for query of 'union all'. (NotNull)
     */
    public void unionAll(UnionQuery<Vendor_non_compilableCB> unionCBLambda) {
        final Vendor_non_compilableCB cb = new Vendor_non_compilableCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final Vendor_non_compilableCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                           Lock Wait
    //                                                                           =========
    public ConditionBean lockForUpdateNoWait()
    { if (xhelpIsSqlClausePostgreSql()) { xhelpGettingSqlClausePostgreSql().lockForUpdateNoWait(); } return this; }

    protected boolean xhelpIsSqlClausePostgreSql() {
        return getSqlClause() instanceof org.dbflute.cbean.sqlclause.SqlClausePostgreSql;
    }

    protected org.dbflute.cbean.sqlclause.SqlClausePostgreSql xhelpGettingSqlClausePostgreSql() {
        return (org.dbflute.cbean.sqlclause.SqlClausePostgreSql)getSqlClause();
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected Vendor_non_compilableNss _nssVendor_non_compilableByNextParentidSelf;
    public Vendor_non_compilableNss xdfgetNssVendor_non_compilableByNextParentidSelf() {
        if (_nssVendor_non_compilableByNextParentidSelf == null) { _nssVendor_non_compilableByNextParentidSelf = new Vendor_non_compilableNss(null); }
        return _nssVendor_non_compilableByNextParentidSelf;
    }
    /**
     * Set up relation columns to select clause. <br>
     * VENDOR-NON COMPILABLE by my Next_ParentID, named 'vendor_non_compilableByNextParentidSelf'.
     * <pre>
     * <span style="color: #0000C0">vendor_non_compilableBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_Vendor_non_compilableByNextParentidSelf()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">vendor_non_compilable</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">vendor_non_compilable</span>.<span style="color: #CC4747">getVendor_non_compilableByNextParentidSelf()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public Vendor_non_compilableNss setupSelect_Vendor_non_compilableByNextParentidSelf() {
        assertSetupSelectPurpose("vendor_non_compilableByNextParentidSelf");
        if (hasSpecifiedLocalColumn()) {
            specify().columnNextParentid();
        }
        doSetupSelect(() -> query().queryVendor_non_compilableByNextParentidSelf());
        if (_nssVendor_non_compilableByNextParentidSelf == null || !_nssVendor_non_compilableByNextParentidSelf.hasConditionQuery())
        { _nssVendor_non_compilableByNextParentidSelf = new Vendor_non_compilableNss(query().queryVendor_non_compilableByNextParentidSelf()); }
        return _nssVendor_non_compilableByNextParentidSelf;
    }

    protected Vendor_non_compilableNss _nssVendor_non_compilableByParent_idSelf;
    public Vendor_non_compilableNss xdfgetNssVendor_non_compilableByParent_idSelf() {
        if (_nssVendor_non_compilableByParent_idSelf == null) { _nssVendor_non_compilableByParent_idSelf = new Vendor_non_compilableNss(null); }
        return _nssVendor_non_compilableByParent_idSelf;
    }
    /**
     * Set up relation columns to select clause. <br>
     * VENDOR-NON COMPILABLE by my PARENT-ID, named 'vendor_non_compilableByParent_idSelf'.
     * <pre>
     * <span style="color: #0000C0">vendor_non_compilableBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_Vendor_non_compilableByParent_idSelf()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">vendor_non_compilable</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">vendor_non_compilable</span>.<span style="color: #CC4747">getVendor_non_compilableByParent_idSelf()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public Vendor_non_compilableNss setupSelect_Vendor_non_compilableByParent_idSelf() {
        assertSetupSelectPurpose("vendor_non_compilableByParent_idSelf");
        if (hasSpecifiedLocalColumn()) {
            specify().columnParent_id();
        }
        doSetupSelect(() -> query().queryVendor_non_compilableByParent_idSelf());
        if (_nssVendor_non_compilableByParent_idSelf == null || !_nssVendor_non_compilableByParent_idSelf.hasConditionQuery())
        { _nssVendor_non_compilableByParent_idSelf = new Vendor_non_compilableNss(query().queryVendor_non_compilableByParent_idSelf()); }
        return _nssVendor_non_compilableByParent_idSelf;
    }

    // [DBFlute-0.7.4]
    // ===================================================================================
    //                                                                             Specify
    //                                                                             =======
    protected HpSpecification _specification;

    /**
     * Prepare for SpecifyColumn, (Specify)DerivedReferrer. <br>
     * This method should be called after SetupSelect.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.setupSelect_MemberStatus(); <span style="color: #3F7E5E">// should be called before specify()</span>
     *     <span style="color: #553000">cb</span>.specify().columnMemberName();
     *     <span style="color: #553000">cb</span>.specify().specifyMemberStatus().columnMemberStatusName();
     *     <span style="color: #553000">cb</span>.specify().derivedPurchaseList().max(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">purchaseCB</span>.specify().columnPurchaseDatetime();
     *         <span style="color: #553000">purchaseCB</span>.query().set...
     *     }, aliasName);
     * }).alwaysPresent(<span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ...
     * });
     * </pre>
     * @return The instance of specification. (NotNull)
     */
    public HpSpecification specify() {
        assertSpecifyPurpose();
        if (_specification == null) { _specification = new HpSpecification(this
            , xcreateSpQyCall(() -> true, () -> xdfgetConditionQuery())
            , _purpose, getDBMetaProvider(), xcSDRFnFc()); }
        return _specification;
    }

    public HpColumnSpHandler localSp() {
        return specify();
    }

    public boolean hasSpecifiedLocalColumn() {
        return _specification != null && _specification.hasSpecifiedColumn();
    }

    public static class HpSpecification extends HpAbstractSpecification<Vendor_non_compilableCQ> {
        protected Vendor_non_compilableCB.HpSpecification _vendor_non_compilableByNextParentidSelf;
        protected Vendor_non_compilableCB.HpSpecification _vendor_non_compilableByParent_idSelf;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<Vendor_non_compilableCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * NON-COMPILABLE ID: {PK, NotNull, int4(10)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnNon_compilable_id() { return doColumn("NON-COMPILABLE ID"); }
        /**
         * NON COMPILABLE-NAME: {varchar(64)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnNon_compilable_name() { return doColumn("NON COMPILABLE-NAME"); }
        /**
         * PARENT-ID: {int4(10), FK to VENDOR-NON COMPILABLE}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnParent_id() { return doColumn("PARENT-ID"); }
        /**
         * Next_ParentID: {int4(10), FK to VENDOR-NON COMPILABLE}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnNextParentid() { return doColumn("Next_ParentID"); }
        public void everyColumn() { doEveryColumn(); }
        public void exceptRecordMetaColumn() { doExceptRecordMetaColumn(); }
        @Override
        protected void doSpecifyRequiredColumn() {
            columnNon_compilable_id(); // PK
            if (qyCall().qy().hasConditionQueryVendor_non_compilableByNextParentidSelf()
                    || qyCall().qy().xgetReferrerQuery() instanceof Vendor_non_compilableCQ) {
                columnNextParentid(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryVendor_non_compilableByParent_idSelf()
                    || qyCall().qy().xgetReferrerQuery() instanceof Vendor_non_compilableCQ) {
                columnParent_id(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "VENDOR-NON COMPILABLE"; }
        /**
         * Prepare to specify functions about relation table. <br>
         * VENDOR-NON COMPILABLE by my Next_ParentID, named 'vendor_non_compilableByNextParentidSelf'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public Vendor_non_compilableCB.HpSpecification specifyVendor_non_compilableByNextParentidSelf() {
            assertRelation("vendor_non_compilableByNextParentidSelf");
            if (_vendor_non_compilableByNextParentidSelf == null) {
                _vendor_non_compilableByNextParentidSelf = new Vendor_non_compilableCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryVendor_non_compilableByNextParentidSelf()
                                    , () -> _qyCall.qy().queryVendor_non_compilableByNextParentidSelf())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _vendor_non_compilableByNextParentidSelf.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryVendor_non_compilableByNextParentidSelf()
                      , () -> xsyncQyCall().qy().queryVendor_non_compilableByNextParentidSelf()));
                }
            }
            return _vendor_non_compilableByNextParentidSelf;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * VENDOR-NON COMPILABLE by my PARENT-ID, named 'vendor_non_compilableByParent_idSelf'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public Vendor_non_compilableCB.HpSpecification specifyVendor_non_compilableByParent_idSelf() {
            assertRelation("vendor_non_compilableByParent_idSelf");
            if (_vendor_non_compilableByParent_idSelf == null) {
                _vendor_non_compilableByParent_idSelf = new Vendor_non_compilableCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryVendor_non_compilableByParent_idSelf()
                                    , () -> _qyCall.qy().queryVendor_non_compilableByParent_idSelf())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _vendor_non_compilableByParent_idSelf.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryVendor_non_compilableByParent_idSelf()
                      , () -> xsyncQyCall().qy().queryVendor_non_compilableByParent_idSelf()));
                }
            }
            return _vendor_non_compilableByParent_idSelf;
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from VENDOR-NON COMPILABLE where ...) as FOO_MAX} <br>
         * VENDOR-NON COMPILABLE by Next_ParentID, named 'vendor_non_compilableByNextParentidSelfList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(entityCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     entityCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     entityCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, Vendor_non_compilable.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<Vendor_non_compilableCB, Vendor_non_compilableCQ> derivedVendor_non_compilableByNextParentidSelf() {
            assertDerived("vendor_non_compilableByNextParentidSelfList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<Vendor_non_compilableCB> sq, Vendor_non_compilableCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveVendor_non_compilableByNextParentidSelfList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from VENDOR-NON COMPILABLE where ...) as FOO_MAX} <br>
         * VENDOR-NON COMPILABLE by PARENT-ID, named 'vendor_non_compilableByParent_idSelfList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(entityCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     entityCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     entityCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, Vendor_non_compilable.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<Vendor_non_compilableCB, Vendor_non_compilableCQ> derivedVendor_non_compilableByParent_idSelf() {
            assertDerived("vendor_non_compilableByParent_idSelfList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<Vendor_non_compilableCB> sq, Vendor_non_compilableCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveVendor_non_compilableByParent_idSelfList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<Vendor_non_compilableCB, Vendor_non_compilableCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<Vendor_non_compilableCB> sq, Vendor_non_compilableCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsmyselfDerive(fn, sq, al, op), _dbmetaProvider);
        }
    }

    // ===================================================================================
    //                                                                        Dream Cruise
    //                                                                        ============
    /**
     * Welcome to the Dream Cruise for condition-bean deep world. <br>
     * This is very specialty so you can get the frontier spirit. Bon voyage!
     * @return The condition-bean for dream cruise, which is linked to main condition-bean.
     */
    public Vendor_non_compilableCB dreamCruiseCB() {
        Vendor_non_compilableCB cb = new Vendor_non_compilableCB();
        cb.xsetupForDreamCruise((Vendor_non_compilableCB) this);
        return cb;
    }

    protected ConditionBean xdoCreateDreamCruiseCB() {
        return dreamCruiseCB();
    }

    // [DBFlute-0.9.5.3]
    // ===================================================================================
    //                                                                        Column Query
    //                                                                        ============
    /**
     * Set up column-query. {column1 = column2}
     * <pre>
     * <span style="color: #3F7E5E">// where FOO &lt; BAR</span>
     * cb.<span style="color: #CC4747">columnQuery</span>(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     * }).lessThan(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param colCBLambda The callback for specify-query of left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand<Vendor_non_compilableCB> columnQuery(final SpecifyQuery<Vendor_non_compilableCB> colCBLambda) {
        return xcreateColQyOperand((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected Vendor_non_compilableCB xcreateColumnQueryCB() {
        Vendor_non_compilableCB cb = new Vendor_non_compilableCB();
        cb.xsetupForColumnQuery((Vendor_non_compilableCB)this);
        return cb;
    }

    // [DBFlute-0.9.6.3]
    // ===================================================================================
    //                                                                       OrScope Query
    //                                                                       =============
    /**
     * Set up the query for or-scope. <br>
     * (Same-column-and-same-condition-key conditions are allowed in or-scope)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or BAR = '...')</span>
     * cb.<span style="color: #CC4747">orScopeQuery</span>(<span style="color: #553000">orCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">orCB</span>.query().setFoo...
     *     <span style="color: #553000">orCB</span>.query().setBar...
     * });
     * </pre>
     * @param orCBLambda The callback for query of or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<Vendor_non_compilableCB> orCBLambda) {
        xorSQ((Vendor_non_compilableCB)this, orCBLambda);
    }

    /**
     * Set up the and-part of or-scope. <br>
     * (However nested or-scope query and as-or-split of like-search in and-part are unsupported)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or (BAR = '...' and QUX = '...'))</span>
     * cb.<span style="color: #994747">orScopeQuery</span>(<span style="color: #553000">orCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">orCB</span>.query().setFoo...
     *     <span style="color: #553000">orCB</span>.<span style="color: #CC4747">orScopeQueryAndPart</span>(<span style="color: #553000">andCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">andCB</span>.query().setBar...
     *         <span style="color: #553000">andCB</span>.query().setQux...
     *     });
     * });
     * </pre>
     * @param andCBLambda The callback for query of and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<Vendor_non_compilableCB> andCBLambda) {
        xorSQAP((Vendor_non_compilableCB)this, andCBLambda);
    }

    // ===================================================================================
    //                                                                          DisplaySQL
    //                                                                          ==========
    @Override
    protected SqlAnalyzerFactory getSqlAnalyzerFactory()
    { return new ImplementedInvokerAssistant().assistSqlAnalyzerFactory(); }
    @Override
    protected String getConfiguredLogDatePattern() { return DBFluteConfig.getInstance().getLogDatePattern(); }
    @Override
    protected String getConfiguredLogTimestampPattern() { return DBFluteConfig.getInstance().getLogTimestampPattern(); }
    @Override
    protected String getConfiguredLogTimePattern() { return DBFluteConfig.getInstance().getLogTimePattern(); }
    @Override
    protected BoundDateDisplayTimeZoneProvider getConfiguredLogTimeZoneProvider() { return DBFluteConfig.getInstance().getLogTimeZoneProvider(); }

    // ===================================================================================
    //                                                                       Meta Handling
    //                                                                       =============
    public boolean hasUnionQueryOrUnionAllQuery() {
        return query().hasUnionQueryOrUnionAllQuery();
    }

    // ===================================================================================
    //                                                                        Purpose Type
    //                                                                        ============
    @Override
    protected void xprepareSyncQyCall(ConditionBean mainCB) {
        final Vendor_non_compilableCB cb;
        if (mainCB != null) {
            cb = (Vendor_non_compilableCB)mainCB;
        } else {
            cb = new Vendor_non_compilableCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return Vendor_non_compilableCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return Vendor_non_compilableCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
