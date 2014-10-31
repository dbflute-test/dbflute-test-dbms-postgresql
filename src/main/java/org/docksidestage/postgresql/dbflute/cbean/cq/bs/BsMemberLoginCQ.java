package org.docksidestage.postgresql.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import org.docksidestage.postgresql.dbflute.cbean.cq.ciq.*;
import org.docksidestage.postgresql.dbflute.cbean.*;
import org.docksidestage.postgresql.dbflute.cbean.cq.*;

/**
 * The base condition-query of member_login.
 * @author DBFlute(AutoGenerator)
 */
public class BsMemberLoginCQ extends AbstractBsMemberLoginCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MemberLoginCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMemberLoginCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from member_login) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MemberLoginCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MemberLoginCIQ xcreateCIQ() {
        MemberLoginCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MemberLoginCIQ xnewCIQ() {
        return new MemberLoginCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join member_login on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MemberLoginCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MemberLoginCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _memberLoginId;
    public ConditionValue xdfgetMemberLoginId()
    { if (_memberLoginId == null) { _memberLoginId = nCV(); }
      return _memberLoginId; }
    protected ConditionValue xgetCValueMemberLoginId() { return xdfgetMemberLoginId(); }

    /** 
     * Add order-by as ascend. <br>
     * (会員ログインID)member_login_id: {PK, ID, NotNull, bigserial(19)}
     * @return this. (NotNull)
     */
    public BsMemberLoginCQ addOrderBy_MemberLoginId_Asc() { regOBA("member_login_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * (会員ログインID)member_login_id: {PK, ID, NotNull, bigserial(19)}
     * @return this. (NotNull)
     */
    public BsMemberLoginCQ addOrderBy_MemberLoginId_Desc() { regOBD("member_login_id"); return this; }

    protected ConditionValue _memberId;
    public ConditionValue xdfgetMemberId()
    { if (_memberId == null) { _memberId = nCV(); }
      return _memberId; }
    protected ConditionValue xgetCValueMemberId() { return xdfgetMemberId(); }

    /** 
     * Add order-by as ascend. <br>
     * (会員ID)member_id: {UQ+, NotNull, int4(10), FK to member}
     * @return this. (NotNull)
     */
    public BsMemberLoginCQ addOrderBy_MemberId_Asc() { regOBA("member_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * (会員ID)member_id: {UQ+, NotNull, int4(10), FK to member}
     * @return this. (NotNull)
     */
    public BsMemberLoginCQ addOrderBy_MemberId_Desc() { regOBD("member_id"); return this; }

    protected ConditionValue _loginDatetime;
    public ConditionValue xdfgetLoginDatetime()
    { if (_loginDatetime == null) { _loginDatetime = nCV(); }
      return _loginDatetime; }
    protected ConditionValue xgetCValueLoginDatetime() { return xdfgetLoginDatetime(); }

    /** 
     * Add order-by as ascend. <br>
     * (ログイン日時)login_datetime: {+UQ, IX, NotNull, timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsMemberLoginCQ addOrderBy_LoginDatetime_Asc() { regOBA("login_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * (ログイン日時)login_datetime: {+UQ, IX, NotNull, timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsMemberLoginCQ addOrderBy_LoginDatetime_Desc() { regOBD("login_datetime"); return this; }

    protected ConditionValue _mobileLoginFlg;
    public ConditionValue xdfgetMobileLoginFlg()
    { if (_mobileLoginFlg == null) { _mobileLoginFlg = nCV(); }
      return _mobileLoginFlg; }
    protected ConditionValue xgetCValueMobileLoginFlg() { return xdfgetMobileLoginFlg(); }

    /** 
     * Add order-by as ascend. <br>
     * (モバイルログインフラグ)mobile_login_flg: {NotNull, int4(10), classification=Flg}
     * @return this. (NotNull)
     */
    public BsMemberLoginCQ addOrderBy_MobileLoginFlg_Asc() { regOBA("mobile_login_flg"); return this; }

    /**
     * Add order-by as descend. <br>
     * (モバイルログインフラグ)mobile_login_flg: {NotNull, int4(10), classification=Flg}
     * @return this. (NotNull)
     */
    public BsMemberLoginCQ addOrderBy_MobileLoginFlg_Desc() { regOBD("mobile_login_flg"); return this; }

    protected ConditionValue _loginMemberStatusCode;
    public ConditionValue xdfgetLoginMemberStatusCode()
    { if (_loginMemberStatusCode == null) { _loginMemberStatusCode = nCV(); }
      return _loginMemberStatusCode; }
    protected ConditionValue xgetCValueLoginMemberStatusCode() { return xdfgetLoginMemberStatusCode(); }

    /** 
     * Add order-by as ascend. <br>
     * (ログイン会員ステータスコード)login_member_status_code: {NotNull, bpchar(3), FK to member_status, classification=MemberStatus}
     * @return this. (NotNull)
     */
    public BsMemberLoginCQ addOrderBy_LoginMemberStatusCode_Asc() { regOBA("login_member_status_code"); return this; }

    /**
     * Add order-by as descend. <br>
     * (ログイン会員ステータスコード)login_member_status_code: {NotNull, bpchar(3), FK to member_status, classification=MemberStatus}
     * @return this. (NotNull)
     */
    public BsMemberLoginCQ addOrderBy_LoginMemberStatusCode_Desc() { regOBD("login_member_status_code"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsMemberLoginCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsMemberLoginCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MemberLoginCQ bq = (MemberLoginCQ)bqs;
        MemberLoginCQ uq = (MemberLoginCQ)uqs;
        if (bq.hasConditionQueryMemberStatus()) {
            uq.queryMemberStatus().reflectRelationOnUnionQuery(bq.queryMemberStatus(), uq.queryMemberStatus());
        }
        if (bq.hasConditionQueryMember()) {
            uq.queryMember().reflectRelationOnUnionQuery(bq.queryMember(), uq.queryMember());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * (会員ステータス)member_status by my login_member_status_code, named 'memberStatus'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberStatusCQ queryMemberStatus() {
        return xdfgetConditionQueryMemberStatus();
    }
    public MemberStatusCQ xdfgetConditionQueryMemberStatus() {
        String prop = "memberStatus";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMemberStatus()); xsetupOuterJoinMemberStatus(); }
        return xgetQueRlMap(prop);
    }
    protected MemberStatusCQ xcreateQueryMemberStatus() {
        String nrp = xresolveNRP("member_login", "memberStatus"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MemberStatusCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberStatus", nrp);
    }
    protected void xsetupOuterJoinMemberStatus() { xregOutJo("memberStatus"); }
    public boolean hasConditionQueryMemberStatus() { return xhasQueRlMap("memberStatus"); }

    /**
     * Get the condition-query for relation table. <br>
     * (会員)member by my member_id, named 'member'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberCQ queryMember() {
        return xdfgetConditionQueryMember();
    }
    public MemberCQ xdfgetConditionQueryMember() {
        String prop = "member";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMember()); xsetupOuterJoinMember(); }
        return xgetQueRlMap(prop);
    }
    protected MemberCQ xcreateQueryMember() {
        String nrp = xresolveNRP("member_login", "member"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MemberCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "member", nrp);
    }
    protected void xsetupOuterJoinMember() { xregOutJo("member"); }
    public boolean hasConditionQueryMember() { return xhasQueRlMap("member"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MemberLoginCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MemberLoginCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MemberLoginCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MemberLoginCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MemberLoginCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MemberLoginCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MemberLoginCQ> _myselfExistsMap;
    public Map<String, MemberLoginCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MemberLoginCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MemberLoginCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MemberLoginCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MemberLoginCB.class.getName(); }
    protected String xCQ() { return MemberLoginCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
