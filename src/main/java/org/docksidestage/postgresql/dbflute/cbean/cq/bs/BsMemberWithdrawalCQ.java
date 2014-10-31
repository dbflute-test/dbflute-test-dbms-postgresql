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
 * The base condition-query of member_withdrawal.
 * @author DBFlute(AutoGenerator)
 */
public class BsMemberWithdrawalCQ extends AbstractBsMemberWithdrawalCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MemberWithdrawalCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMemberWithdrawalCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from member_withdrawal) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MemberWithdrawalCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MemberWithdrawalCIQ xcreateCIQ() {
        MemberWithdrawalCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MemberWithdrawalCIQ xnewCIQ() {
        return new MemberWithdrawalCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join member_withdrawal on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MemberWithdrawalCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MemberWithdrawalCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _memberId;
    public ConditionValue xdfgetMemberId()
    { if (_memberId == null) { _memberId = nCV(); }
      return _memberId; }
    protected ConditionValue xgetCValueMemberId() { return xdfgetMemberId(); }

    /** 
     * Add order-by as ascend. <br>
     * member_id: {PK, NotNull, int4(10), FK to member}
     * @return this. (NotNull)
     */
    public BsMemberWithdrawalCQ addOrderBy_MemberId_Asc() { regOBA("member_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * member_id: {PK, NotNull, int4(10), FK to member}
     * @return this. (NotNull)
     */
    public BsMemberWithdrawalCQ addOrderBy_MemberId_Desc() { regOBD("member_id"); return this; }

    protected ConditionValue _withdrawalReasonCode;
    public ConditionValue xdfgetWithdrawalReasonCode()
    { if (_withdrawalReasonCode == null) { _withdrawalReasonCode = nCV(); }
      return _withdrawalReasonCode; }
    protected ConditionValue xgetCValueWithdrawalReasonCode() { return xdfgetWithdrawalReasonCode(); }

    /** 
     * Add order-by as ascend. <br>
     * (退会理由コード)withdrawal_reason_code: {bpchar(3), FK to withdrawal_reason}
     * @return this. (NotNull)
     */
    public BsMemberWithdrawalCQ addOrderBy_WithdrawalReasonCode_Asc() { regOBA("withdrawal_reason_code"); return this; }

    /**
     * Add order-by as descend. <br>
     * (退会理由コード)withdrawal_reason_code: {bpchar(3), FK to withdrawal_reason}
     * @return this. (NotNull)
     */
    public BsMemberWithdrawalCQ addOrderBy_WithdrawalReasonCode_Desc() { regOBD("withdrawal_reason_code"); return this; }

    protected ConditionValue _withdrawalReasonInputText;
    public ConditionValue xdfgetWithdrawalReasonInputText()
    { if (_withdrawalReasonInputText == null) { _withdrawalReasonInputText = nCV(); }
      return _withdrawalReasonInputText; }
    protected ConditionValue xgetCValueWithdrawalReasonInputText() { return xdfgetWithdrawalReasonInputText(); }

    /** 
     * Add order-by as ascend. <br>
     * (退会理由入力テキスト)withdrawal_reason_input_text: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMemberWithdrawalCQ addOrderBy_WithdrawalReasonInputText_Asc() { regOBA("withdrawal_reason_input_text"); return this; }

    /**
     * Add order-by as descend. <br>
     * (退会理由入力テキスト)withdrawal_reason_input_text: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMemberWithdrawalCQ addOrderBy_WithdrawalReasonInputText_Desc() { regOBD("withdrawal_reason_input_text"); return this; }

    protected ConditionValue _withdrawalDatetime;
    public ConditionValue xdfgetWithdrawalDatetime()
    { if (_withdrawalDatetime == null) { _withdrawalDatetime = nCV(); }
      return _withdrawalDatetime; }
    protected ConditionValue xgetCValueWithdrawalDatetime() { return xdfgetWithdrawalDatetime(); }

    /** 
     * Add order-by as ascend. <br>
     * (退会日時)withdrawal_datetime: {NotNull, timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsMemberWithdrawalCQ addOrderBy_WithdrawalDatetime_Asc() { regOBA("withdrawal_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * (退会日時)withdrawal_datetime: {NotNull, timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsMemberWithdrawalCQ addOrderBy_WithdrawalDatetime_Desc() { regOBD("withdrawal_datetime"); return this; }

    protected ConditionValue _registerDatetime;
    public ConditionValue xdfgetRegisterDatetime()
    { if (_registerDatetime == null) { _registerDatetime = nCV(); }
      return _registerDatetime; }
    protected ConditionValue xgetCValueRegisterDatetime() { return xdfgetRegisterDatetime(); }

    /** 
     * Add order-by as ascend. <br>
     * register_datetime: {NotNull, timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsMemberWithdrawalCQ addOrderBy_RegisterDatetime_Asc() { regOBA("register_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_datetime: {NotNull, timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsMemberWithdrawalCQ addOrderBy_RegisterDatetime_Desc() { regOBD("register_datetime"); return this; }

    protected ConditionValue _registerProcess;
    public ConditionValue xdfgetRegisterProcess()
    { if (_registerProcess == null) { _registerProcess = nCV(); }
      return _registerProcess; }
    protected ConditionValue xgetCValueRegisterProcess() { return xdfgetRegisterProcess(); }

    /** 
     * Add order-by as ascend. <br>
     * register_process: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsMemberWithdrawalCQ addOrderBy_RegisterProcess_Asc() { regOBA("register_process"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_process: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsMemberWithdrawalCQ addOrderBy_RegisterProcess_Desc() { regOBD("register_process"); return this; }

    protected ConditionValue _registerUser;
    public ConditionValue xdfgetRegisterUser()
    { if (_registerUser == null) { _registerUser = nCV(); }
      return _registerUser; }
    protected ConditionValue xgetCValueRegisterUser() { return xdfgetRegisterUser(); }

    /** 
     * Add order-by as ascend. <br>
     * register_user: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsMemberWithdrawalCQ addOrderBy_RegisterUser_Asc() { regOBA("register_user"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_user: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsMemberWithdrawalCQ addOrderBy_RegisterUser_Desc() { regOBD("register_user"); return this; }

    protected ConditionValue _updateDatetime;
    public ConditionValue xdfgetUpdateDatetime()
    { if (_updateDatetime == null) { _updateDatetime = nCV(); }
      return _updateDatetime; }
    protected ConditionValue xgetCValueUpdateDatetime() { return xdfgetUpdateDatetime(); }

    /** 
     * Add order-by as ascend. <br>
     * update_datetime: {NotNull, timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsMemberWithdrawalCQ addOrderBy_UpdateDatetime_Asc() { regOBA("update_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_datetime: {NotNull, timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsMemberWithdrawalCQ addOrderBy_UpdateDatetime_Desc() { regOBD("update_datetime"); return this; }

    protected ConditionValue _updateProcess;
    public ConditionValue xdfgetUpdateProcess()
    { if (_updateProcess == null) { _updateProcess = nCV(); }
      return _updateProcess; }
    protected ConditionValue xgetCValueUpdateProcess() { return xdfgetUpdateProcess(); }

    /** 
     * Add order-by as ascend. <br>
     * update_process: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsMemberWithdrawalCQ addOrderBy_UpdateProcess_Asc() { regOBA("update_process"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_process: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsMemberWithdrawalCQ addOrderBy_UpdateProcess_Desc() { regOBD("update_process"); return this; }

    protected ConditionValue _updateUser;
    public ConditionValue xdfgetUpdateUser()
    { if (_updateUser == null) { _updateUser = nCV(); }
      return _updateUser; }
    protected ConditionValue xgetCValueUpdateUser() { return xdfgetUpdateUser(); }

    /** 
     * Add order-by as ascend. <br>
     * update_user: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsMemberWithdrawalCQ addOrderBy_UpdateUser_Asc() { regOBA("update_user"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_user: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsMemberWithdrawalCQ addOrderBy_UpdateUser_Desc() { regOBD("update_user"); return this; }

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
    public BsMemberWithdrawalCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMemberWithdrawalCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MemberWithdrawalCQ bq = (MemberWithdrawalCQ)bqs;
        MemberWithdrawalCQ uq = (MemberWithdrawalCQ)uqs;
        if (bq.hasConditionQueryMember()) {
            uq.queryMember().reflectRelationOnUnionQuery(bq.queryMember(), uq.queryMember());
        }
        if (bq.hasConditionQueryWithdrawalReason()) {
            uq.queryWithdrawalReason().reflectRelationOnUnionQuery(bq.queryWithdrawalReason(), uq.queryWithdrawalReason());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
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
        String nrp = xresolveNRP("member_withdrawal", "member"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MemberCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "member", nrp);
    }
    protected void xsetupOuterJoinMember() { xregOutJo("member"); }
    public boolean hasConditionQueryMember() { return xhasQueRlMap("member"); }

    /**
     * Get the condition-query for relation table. <br>
     * (退会理由)withdrawal_reason by my withdrawal_reason_code, named 'withdrawalReason'.
     * @return The instance of condition-query. (NotNull)
     */
    public WithdrawalReasonCQ queryWithdrawalReason() {
        return xdfgetConditionQueryWithdrawalReason();
    }
    public WithdrawalReasonCQ xdfgetConditionQueryWithdrawalReason() {
        String prop = "withdrawalReason";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryWithdrawalReason()); xsetupOuterJoinWithdrawalReason(); }
        return xgetQueRlMap(prop);
    }
    protected WithdrawalReasonCQ xcreateQueryWithdrawalReason() {
        String nrp = xresolveNRP("member_withdrawal", "withdrawalReason"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new WithdrawalReasonCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "withdrawalReason", nrp);
    }
    protected void xsetupOuterJoinWithdrawalReason() { xregOutJo("withdrawalReason"); }
    public boolean hasConditionQueryWithdrawalReason() { return xhasQueRlMap("withdrawalReason"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MemberWithdrawalCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MemberWithdrawalCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MemberWithdrawalCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MemberWithdrawalCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MemberWithdrawalCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MemberWithdrawalCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MemberWithdrawalCQ> _myselfExistsMap;
    public Map<String, MemberWithdrawalCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MemberWithdrawalCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MemberWithdrawalCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MemberWithdrawalCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MemberWithdrawalCB.class.getName(); }
    protected String xCQ() { return MemberWithdrawalCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
