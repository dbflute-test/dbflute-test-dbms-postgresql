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
 * The base condition-bean of member.
 * @author DBFlute(AutoGenerator)
 */
public class BsMemberCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MemberCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMemberCB() {
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
    //                                                                     DBMeta Provider
    //                                                                     ===============
    @Override
    protected DBMetaProvider getDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider(); // as default
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "member";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param memberId (会員ID): PK, ID, NotNull, serial(10), FK to MEMBER_ADDRESS. (NotNull)
     * @return this. (NotNull)
     */
    public MemberCB acceptPK(Integer memberId) {
        assertObjectNotNull("memberId", memberId);
        BsMemberCB cb = this;
        cb.query().setMemberId_Equal(memberId);
        return (MemberCB)this;
    }

    /**
     * Accept the query condition of unique key as equal.
     * @param memberAccount (会員アカウント): UQ, NotNull, varchar(50). (NotNull)
     * @return this. (NotNull)
     */
    public MemberCB acceptUniqueOf(String memberAccount) {
        assertObjectNotNull("memberAccount", memberAccount);
        BsMemberCB cb = this;
        cb.query().setMemberAccount_Equal(memberAccount);
        return (MemberCB)this;
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_MemberId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_MemberId_Desc();
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
    public MemberCQ query() {
        assertQueryPurpose(); // assert only when user-public query 
        return doGetConditionQuery();
    }

    public MemberCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected MemberCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected MemberCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected MemberCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        MemberCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected MemberCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new MemberCQ(childQuery, sqlClause, aliasName, nestLevel);
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
    public void union(UnionQuery<MemberCB> unionCBLambda) {
        final MemberCB cb = new MemberCB(); cb.xsetupForUnion(this); xsyncUQ(cb); 
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final MemberCQ cq = cb.query(); query().xsetUnionQuery(cq);
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
    public void unionAll(UnionQuery<MemberCB> unionCBLambda) {
        final MemberCB cb = new MemberCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final MemberCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
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
    protected MemberStatusNss _nssMemberStatus;
    public MemberStatusNss xdfgetNssMemberStatus() {
        if (_nssMemberStatus == null) { _nssMemberStatus = new MemberStatusNss(null); }
        return _nssMemberStatus;
    }
    /**
     * Set up relation columns to select clause. <br>
     * (会員ステータス)member_status by my member_status_code, named 'memberStatus'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MemberStatus()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.<span style="color: #CC4747">getMemberStatus()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberStatusNss setupSelect_MemberStatus() {
        assertSetupSelectPurpose("memberStatus");
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnMemberStatusCode();
        }
        doSetupSelect(() -> query().queryMemberStatus());
        if (_nssMemberStatus == null || !_nssMemberStatus.hasConditionQuery())
        { _nssMemberStatus = new MemberStatusNss(query().queryMemberStatus()); }
        return _nssMemberStatus;
    }

    protected MemberAddressNss _nssMemberAddressAsValid;
    public MemberAddressNss xdfgetNssMemberAddressAsValid() {
        if (_nssMemberAddressAsValid == null) { _nssMemberAddressAsValid = new MemberAddressNss(null); }
        return _nssMemberAddressAsValid;
    }
    /**
     * Set up relation columns to select clause. <br>
     * (会員住所情報)member_address by my member_id, named 'memberAddressAsValid'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MemberAddressAsValid(targetDate)</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.<span style="color: #CC4747">getMemberAddressAsValid()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberAddressNss setupSelect_MemberAddressAsValid(final java.time.LocalDate targetDate) {
        assertSetupSelectPurpose("memberAddressAsValid");
        doSetupSelect(() -> query().queryMemberAddressAsValid(targetDate));
        if (_nssMemberAddressAsValid == null || !_nssMemberAddressAsValid.hasConditionQuery())
        { _nssMemberAddressAsValid = new MemberAddressNss(query().queryMemberAddressAsValid(targetDate)); }
        return _nssMemberAddressAsValid;
    }

    protected MemberLoginNss _nssMemberLoginAsLatest;
    public MemberLoginNss xdfgetNssMemberLoginAsLatest() {
        if (_nssMemberLoginAsLatest == null) { _nssMemberLoginAsLatest = new MemberLoginNss(null); }
        return _nssMemberLoginAsLatest;
    }
    /**
     * Set up relation columns to select clause. <br>
     * (会員ログイン)member_login by my member_id, named 'memberLoginAsLatest'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MemberLoginAsLatest()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.<span style="color: #CC4747">getMemberLoginAsLatest()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberLoginNss setupSelect_MemberLoginAsLatest() {
        assertSetupSelectPurpose("memberLoginAsLatest");
        doSetupSelect(() -> query().queryMemberLoginAsLatest());
        if (_nssMemberLoginAsLatest == null || !_nssMemberLoginAsLatest.hasConditionQuery())
        { _nssMemberLoginAsLatest = new MemberLoginNss(query().queryMemberLoginAsLatest()); }
        return _nssMemberLoginAsLatest;
    }

    protected MemberSecurityNss _nssMemberSecurityAsOne;
    public MemberSecurityNss xdfgetNssMemberSecurityAsOne() {
        if (_nssMemberSecurityAsOne == null) { _nssMemberSecurityAsOne = new MemberSecurityNss(null); }
        return _nssMemberSecurityAsOne;
    }
    /**
     * Set up relation columns to select clause. <br>
     * (会員セキュリティ情報)member_security by member_id, named 'memberSecurityAsOne'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MemberSecurityAsOne()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.<span style="color: #CC4747">getMemberSecurityAsOne()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberSecurityNss setupSelect_MemberSecurityAsOne() {
        assertSetupSelectPurpose("memberSecurityAsOne");
        doSetupSelect(() -> query().queryMemberSecurityAsOne());
        if (_nssMemberSecurityAsOne == null || !_nssMemberSecurityAsOne.hasConditionQuery()) { _nssMemberSecurityAsOne = new MemberSecurityNss(query().queryMemberSecurityAsOne()); }
        return _nssMemberSecurityAsOne;
    }

    protected MemberServiceNss _nssMemberServiceAsOne;
    public MemberServiceNss xdfgetNssMemberServiceAsOne() {
        if (_nssMemberServiceAsOne == null) { _nssMemberServiceAsOne = new MemberServiceNss(null); }
        return _nssMemberServiceAsOne;
    }
    /**
     * Set up relation columns to select clause. <br>
     * (会員サービス)member_service by member_id, named 'memberServiceAsOne'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MemberServiceAsOne()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.<span style="color: #CC4747">getMemberServiceAsOne()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberServiceNss setupSelect_MemberServiceAsOne() {
        assertSetupSelectPurpose("memberServiceAsOne");
        doSetupSelect(() -> query().queryMemberServiceAsOne());
        if (_nssMemberServiceAsOne == null || !_nssMemberServiceAsOne.hasConditionQuery()) { _nssMemberServiceAsOne = new MemberServiceNss(query().queryMemberServiceAsOne()); }
        return _nssMemberServiceAsOne;
    }

    protected MemberWithdrawalNss _nssMemberWithdrawalAsOne;
    public MemberWithdrawalNss xdfgetNssMemberWithdrawalAsOne() {
        if (_nssMemberWithdrawalAsOne == null) { _nssMemberWithdrawalAsOne = new MemberWithdrawalNss(null); }
        return _nssMemberWithdrawalAsOne;
    }
    /**
     * Set up relation columns to select clause. <br>
     * (会員退会情報)member_withdrawal by member_id, named 'memberWithdrawalAsOne'.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MemberWithdrawalAsOne()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.<span style="color: #CC4747">getMemberWithdrawalAsOne()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MemberWithdrawalNss setupSelect_MemberWithdrawalAsOne() {
        assertSetupSelectPurpose("memberWithdrawalAsOne");
        doSetupSelect(() -> query().queryMemberWithdrawalAsOne());
        if (_nssMemberWithdrawalAsOne == null || !_nssMemberWithdrawalAsOne.hasConditionQuery()) { _nssMemberWithdrawalAsOne = new MemberWithdrawalNss(query().queryMemberWithdrawalAsOne()); }
        return _nssMemberWithdrawalAsOne;
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

    public boolean hasSpecifiedColumn() {
        return _specification != null && _specification.isAlreadySpecifiedRequiredColumn();
    }

    public static class HpSpecification extends HpAbstractSpecification<MemberCQ> {
        protected MemberStatusCB.HpSpecification _memberStatus;
        protected MemberAddressCB.HpSpecification _memberAddressAsValid;
        protected MemberLoginCB.HpSpecification _memberLoginAsLatest;
        protected MemberSecurityCB.HpSpecification _memberSecurityAsOne;
        protected MemberServiceCB.HpSpecification _memberServiceAsOne;
        protected MemberWithdrawalCB.HpSpecification _memberWithdrawalAsOne;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<MemberCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * (会員ID)member_id: {PK, ID, NotNull, serial(10), FK to MEMBER_ADDRESS}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMemberId() { return doColumn("member_id"); }
        /**
         * (会員名称)member_name: {IX, NotNull, varchar(200)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMemberName() { return doColumn("member_name"); }
        /**
         * (会員アカウント)member_account: {UQ, NotNull, varchar(50)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMemberAccount() { return doColumn("member_account"); }
        /**
         * (会員ステータスコード)member_status_code: {NotNull, bpchar(3), FK to member_status, classification=MemberStatus}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMemberStatusCode() { return doColumn("member_status_code"); }
        /**
         * (正式会員日時)formalized_datetime: {IX, timestamp(26, 3)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnFormalizedDatetime() { return doColumn("formalized_datetime"); }
        /**
         * (生年月日)birthdate: {date(13)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBirthdate() { return doColumn("birthdate"); }
        /**
         * (登録日時)register_datetime: {NotNull, timestamp(26, 3)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnRegisterDatetime() { return doColumn("register_datetime"); }
        /**
         * (登録ユーザ)register_user: {NotNull, varchar(200)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnRegisterUser() { return doColumn("register_user"); }
        /**
         * register_process: {NotNull, varchar(200)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnRegisterProcess() { return doColumn("register_process"); }
        /**
         * (更新日時)update_datetime: {NotNull, timestamp(26, 3)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUpdateDatetime() { return doColumn("update_datetime"); }
        /**
         * (更新ユーザ)update_user: {NotNull, varchar(200)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUpdateUser() { return doColumn("update_user"); }
        /**
         * update_process: {NotNull, varchar(200)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUpdateProcess() { return doColumn("update_process"); }
        /**
         * (バージョンNO)version_no: {NotNull, int8(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnVersionNo() { return doColumn("version_no"); }
        public void everyColumn() { doEveryColumn(); }
        public void exceptRecordMetaColumn() { doExceptRecordMetaColumn(); }
        @Override
        protected void doSpecifyRequiredColumn() {
            columnMemberId(); // PK
            if (qyCall().qy().hasConditionQueryMemberStatus()
                    || qyCall().qy().xgetReferrerQuery() instanceof MemberStatusCQ) {
                columnMemberStatusCode(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "member"; }
        /**
         * Prepare to specify functions about relation table. <br>
         * (会員ステータス)member_status by my member_status_code, named 'memberStatus'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberStatusCB.HpSpecification specifyMemberStatus() {
            assertRelation("memberStatus");
            if (_memberStatus == null) {
                _memberStatus = new MemberStatusCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMemberStatus()
                                    , () -> _qyCall.qy().queryMemberStatus())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _memberStatus.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberStatus()
                      , () -> xsyncQyCall().qy().queryMemberStatus()));
                }
            }
            return _memberStatus;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (会員住所情報)member_address by my member_id, named 'memberAddressAsValid'.
         * @param targetDate The bind parameter of fixed condition for targetDate. (NotNull)
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberAddressCB.HpSpecification specifyMemberAddressAsValid(final java.time.LocalDate targetDate) {
            assertRelation("memberAddressAsValid");
            if (_memberAddressAsValid == null) {
                _memberAddressAsValid = new MemberAddressCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMemberAddressAsValid()
                                    , () -> _qyCall.qy().queryMemberAddressAsValid(targetDate))
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _memberAddressAsValid.xsetSyncQyCall(new HpSpQyCall<MemberAddressCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberAddressAsValid(); }
                        public MemberAddressCQ qy() { return xsyncQyCall().qy().queryMemberAddressAsValid(targetDate); }
                    });
                }
            }
            return _memberAddressAsValid;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (会員住所情報)member_address by my member_id, named 'memberAddressAsValid'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberAddressCB.HpSpecification specifyMemberAddressAsValid() {
            assertRelation("memberAddressAsValid");
            if (_memberAddressAsValid == null) {
                _memberAddressAsValid = new MemberAddressCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMemberAddressAsValid()
                                    , () -> _qyCall.qy().xdfgetConditionQueryMemberAddressAsValid())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _memberAddressAsValid.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberAddressAsValid()
                      , () -> xsyncQyCall().qy().xdfgetConditionQueryMemberAddressAsValid()));
                }
            }
            return _memberAddressAsValid;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (会員ログイン)member_login by my member_id, named 'memberLoginAsLatest'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberLoginCB.HpSpecification specifyMemberLoginAsLatest() {
            assertRelation("memberLoginAsLatest");
            if (_memberLoginAsLatest == null) {
                _memberLoginAsLatest = new MemberLoginCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMemberLoginAsLatest()
                                    , () -> _qyCall.qy().queryMemberLoginAsLatest())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _memberLoginAsLatest.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberLoginAsLatest()
                      , () -> xsyncQyCall().qy().queryMemberLoginAsLatest()));
                }
            }
            return _memberLoginAsLatest;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (会員セキュリティ情報)member_security by member_id, named 'memberSecurityAsOne'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberSecurityCB.HpSpecification specifyMemberSecurityAsOne() {
            assertRelation("memberSecurityAsOne");
            if (_memberSecurityAsOne == null) {
                _memberSecurityAsOne = new MemberSecurityCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMemberSecurityAsOne()
                                    , () -> _qyCall.qy().queryMemberSecurityAsOne())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _memberSecurityAsOne.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberSecurityAsOne()
                      , () -> xsyncQyCall().qy().queryMemberSecurityAsOne()));
                }
            }
            return _memberSecurityAsOne;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (会員サービス)member_service by member_id, named 'memberServiceAsOne'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberServiceCB.HpSpecification specifyMemberServiceAsOne() {
            assertRelation("memberServiceAsOne");
            if (_memberServiceAsOne == null) {
                _memberServiceAsOne = new MemberServiceCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMemberServiceAsOne()
                                    , () -> _qyCall.qy().queryMemberServiceAsOne())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _memberServiceAsOne.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberServiceAsOne()
                      , () -> xsyncQyCall().qy().queryMemberServiceAsOne()));
                }
            }
            return _memberServiceAsOne;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (会員退会情報)member_withdrawal by member_id, named 'memberWithdrawalAsOne'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MemberWithdrawalCB.HpSpecification specifyMemberWithdrawalAsOne() {
            assertRelation("memberWithdrawalAsOne");
            if (_memberWithdrawalAsOne == null) {
                _memberWithdrawalAsOne = new MemberWithdrawalCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMemberWithdrawalAsOne()
                                    , () -> _qyCall.qy().queryMemberWithdrawalAsOne())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _memberWithdrawalAsOne.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberWithdrawalAsOne()
                      , () -> xsyncQyCall().qy().queryMemberWithdrawalAsOne()));
                }
            }
            return _memberWithdrawalAsOne;
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from member_address where ...) as FOO_MAX} <br>
         * (会員住所情報)member_address by member_id, named 'memberAddressList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(addressCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     addressCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     addressCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MemberAddress.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MemberAddressCB, MemberCQ> derivedMemberAddress() {
            assertDerived("memberAddressList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (fn, sq, cq, al, op) -> cq.xsderiveMemberAddressList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from member_login where ...) as FOO_MAX} <br>
         * (会員ログイン)member_login by member_id, named 'memberLoginList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(loginCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     loginCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     loginCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MemberLogin.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MemberLoginCB, MemberCQ> derivedMemberLogin() {
            assertDerived("memberLoginList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (fn, sq, cq, al, op) -> cq.xsderiveMemberLoginList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from purchase where ...) as FOO_MAX} <br>
         * (購入)purchase by member_id, named 'purchaseList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(purchaseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     purchaseCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     purchaseCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, Purchase.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<PurchaseCB, MemberCQ> derivedPurchase() {
            assertDerived("purchaseList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (fn, sq, cq, al, op) -> cq.xsderivePurchaseList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<MemberCB, MemberCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (fn, sq, cq, al, op) -> cq.xsmyselfDerive(fn, sq, al, op), _dbmetaProvider);
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
    public MemberCB dreamCruiseCB() {
        MemberCB cb = new MemberCB();
        cb.xsetupForDreamCruise((MemberCB) this);
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
     * cb.<span style="color: #CC4747">columnQuery</span>(new SpecifyQuery&lt;MemberCB&gt;() {
     *     public void query(MemberCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     *     }
     * }).lessThan(new SpecifyQuery&lt;MemberCB&gt;() {
     *     public void query(MemberCB cb) {
     *         cb.specify().<span style="color: #CC4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param colCBLambda The callback for specify-query of left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand<MemberCB> columnQuery(final SpecifyQuery<MemberCB> colCBLambda) {
        return xcreateColQyOperand((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected MemberCB xcreateColumnQueryCB() {
        MemberCB cb = new MemberCB();
        cb.xsetupForColumnQuery((MemberCB)this);
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
     * cb.<span style="color: #CC4747">orScopeQuery</span>(new OrQuery&lt;MemberCB&gt;() {
     *     public void query(MemberCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.query().setBAR_Equal...
     *     }
     * });
     * </pre>
     * @param orCBLambda The callback for query of or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<MemberCB> orCBLambda) {
        xorSQ((MemberCB)this, orCBLambda);
    }

    /**
     * Set up the and-part of or-scope. <br>
     * (However nested or-scope query and as-or-split of like-search in and-part are unsupported)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or (BAR = '...' and QUX = '...'))</span>
     * cb.<span style="color: #CC4747">orScopeQuery</span>(new OrQuery&lt;MemberCB&gt;() {
     *     public void query(MemberCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.<span style="color: #CC4747">orScopeQueryAndPart</span>(new AndQuery&lt;MemberCB&gt;() {
     *             public void query(MemberCB andCB) {
     *                 andCB.query().setBar_...
     *                 andCB.query().setQux_...
     *             }
     *         });
     *     }
     * });
     * </pre>
     * @param andCBLambda The callback for query of and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<MemberCB> andCBLambda) {
        xorSQAP((MemberCB)this, andCBLambda);
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
        final MemberCB cb;
        if (mainCB != null) {
            cb = (MemberCB)mainCB;
        } else {
            cb = new MemberCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return MemberCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return MemberCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
