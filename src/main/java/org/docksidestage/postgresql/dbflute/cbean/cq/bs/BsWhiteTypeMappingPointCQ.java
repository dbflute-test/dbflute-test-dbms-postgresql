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
 * The base condition-query of white_type_mapping_point.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteTypeMappingPointCQ extends AbstractBsWhiteTypeMappingPointCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteTypeMappingPointCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteTypeMappingPointCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from white_type_mapping_point) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteTypeMappingPointCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteTypeMappingPointCIQ xcreateCIQ() {
        WhiteTypeMappingPointCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteTypeMappingPointCIQ xnewCIQ() {
        return new WhiteTypeMappingPointCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join white_type_mapping_point on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteTypeMappingPointCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteTypeMappingPointCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _typeMappingPointId;
    public ConditionValue xdfgetTypeMappingPointId()
    { if (_typeMappingPointId == null) { _typeMappingPointId = nCV(); }
      return _typeMappingPointId; }
    protected ConditionValue xgetCValueTypeMappingPointId() { return xdfgetTypeMappingPointId(); }

    /**
     * Add order-by as ascend. <br>
     * type_mapping_point_id: {PK, NotNull, int8(19)}
     * @return this. (NotNull)
     */
    public BsWhiteTypeMappingPointCQ addOrderBy_TypeMappingPointId_Asc() { regOBA("type_mapping_point_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * type_mapping_point_id: {PK, NotNull, int8(19)}
     * @return this. (NotNull)
     */
    public BsWhiteTypeMappingPointCQ addOrderBy_TypeMappingPointId_Desc() { regOBD("type_mapping_point_id"); return this; }

    protected ConditionValue _typeMappingPointName;
    public ConditionValue xdfgetTypeMappingPointName()
    { if (_typeMappingPointName == null) { _typeMappingPointName = nCV(); }
      return _typeMappingPointName; }
    protected ConditionValue xgetCValueTypeMappingPointName() { return xdfgetTypeMappingPointName(); }

    /**
     * Add order-by as ascend. <br>
     * type_mapping_point_name: {varchar(200)}
     * @return this. (NotNull)
     */
    public BsWhiteTypeMappingPointCQ addOrderBy_TypeMappingPointName_Asc() { regOBA("type_mapping_point_name"); return this; }

    /**
     * Add order-by as descend. <br>
     * type_mapping_point_name: {varchar(200)}
     * @return this. (NotNull)
     */
    public BsWhiteTypeMappingPointCQ addOrderBy_TypeMappingPointName_Desc() { regOBD("type_mapping_point_name"); return this; }

    protected ConditionValue _normalInteger;
    public ConditionValue xdfgetNormalInteger()
    { if (_normalInteger == null) { _normalInteger = nCV(); }
      return _normalInteger; }
    protected ConditionValue xgetCValueNormalInteger() { return xdfgetNormalInteger(); }

    /**
     * Add order-by as ascend. <br>
     * normal_integer: {int4(10)}
     * @return this. (NotNull)
     */
    public BsWhiteTypeMappingPointCQ addOrderBy_NormalInteger_Asc() { regOBA("normal_integer"); return this; }

    /**
     * Add order-by as descend. <br>
     * normal_integer: {int4(10)}
     * @return this. (NotNull)
     */
    public BsWhiteTypeMappingPointCQ addOrderBy_NormalInteger_Desc() { regOBD("normal_integer"); return this; }

    protected ConditionValue _normalLong;
    public ConditionValue xdfgetNormalLong()
    { if (_normalLong == null) { _normalLong = nCV(); }
      return _normalLong; }
    protected ConditionValue xgetCValueNormalLong() { return xdfgetNormalLong(); }

    /**
     * Add order-by as ascend. <br>
     * normal_long: {int8(19)}
     * @return this. (NotNull)
     */
    public BsWhiteTypeMappingPointCQ addOrderBy_NormalLong_Asc() { regOBA("normal_long"); return this; }

    /**
     * Add order-by as descend. <br>
     * normal_long: {int8(19)}
     * @return this. (NotNull)
     */
    public BsWhiteTypeMappingPointCQ addOrderBy_NormalLong_Desc() { regOBD("normal_long"); return this; }

    protected ConditionValue _normalDate;
    public ConditionValue xdfgetNormalDate()
    { if (_normalDate == null) { _normalDate = nCV(); }
      return _normalDate; }
    protected ConditionValue xgetCValueNormalDate() { return xdfgetNormalDate(); }

    /**
     * Add order-by as ascend. <br>
     * normal_date: {date(13)}
     * @return this. (NotNull)
     */
    public BsWhiteTypeMappingPointCQ addOrderBy_NormalDate_Asc() { regOBA("normal_date"); return this; }

    /**
     * Add order-by as descend. <br>
     * normal_date: {date(13)}
     * @return this. (NotNull)
     */
    public BsWhiteTypeMappingPointCQ addOrderBy_NormalDate_Desc() { regOBD("normal_date"); return this; }

    protected ConditionValue _normalDatetime;
    public ConditionValue xdfgetNormalDatetime()
    { if (_normalDatetime == null) { _normalDatetime = nCV(); }
      return _normalDatetime; }
    protected ConditionValue xgetCValueNormalDatetime() { return xdfgetNormalDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * normal_datetime: {timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsWhiteTypeMappingPointCQ addOrderBy_NormalDatetime_Asc() { regOBA("normal_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * normal_datetime: {timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsWhiteTypeMappingPointCQ addOrderBy_NormalDatetime_Desc() { regOBD("normal_datetime"); return this; }

    protected ConditionValue _pointLongInteger;
    public ConditionValue xdfgetPointLongInteger()
    { if (_pointLongInteger == null) { _pointLongInteger = nCV(); }
      return _pointLongInteger; }
    protected ConditionValue xgetCValuePointLongInteger() { return xdfgetPointLongInteger(); }

    /**
     * Add order-by as ascend. <br>
     * point_long_integer: {int8(19)}
     * @return this. (NotNull)
     */
    public BsWhiteTypeMappingPointCQ addOrderBy_PointLongInteger_Asc() { regOBA("point_long_integer"); return this; }

    /**
     * Add order-by as descend. <br>
     * point_long_integer: {int8(19)}
     * @return this. (NotNull)
     */
    public BsWhiteTypeMappingPointCQ addOrderBy_PointLongInteger_Desc() { regOBD("point_long_integer"); return this; }

    protected ConditionValue _pointDatetimeDate;
    public ConditionValue xdfgetPointDatetimeDate()
    { if (_pointDatetimeDate == null) { _pointDatetimeDate = nCV(); }
      return _pointDatetimeDate; }
    protected ConditionValue xgetCValuePointDatetimeDate() { return xdfgetPointDatetimeDate(); }

    /**
     * Add order-by as ascend. <br>
     * point_datetime_date: {timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsWhiteTypeMappingPointCQ addOrderBy_PointDatetimeDate_Asc() { regOBA("point_datetime_date"); return this; }

    /**
     * Add order-by as descend. <br>
     * point_datetime_date: {timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsWhiteTypeMappingPointCQ addOrderBy_PointDatetimeDate_Desc() { regOBD("point_datetime_date"); return this; }

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
    public BsWhiteTypeMappingPointCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteTypeMappingPointCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, WhiteTypeMappingPointCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteTypeMappingPointCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteTypeMappingPointCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteTypeMappingPointCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteTypeMappingPointCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteTypeMappingPointCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteTypeMappingPointCQ> _myselfExistsMap;
    public Map<String, WhiteTypeMappingPointCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteTypeMappingPointCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteTypeMappingPointCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteTypeMappingPointCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteTypeMappingPointCB.class.getName(); }
    protected String xCQ() { return WhiteTypeMappingPointCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
