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
 * The base condition-query of vendor_large_data.
 * @author DBFlute(AutoGenerator)
 */
public class BsVendorLargeDataCQ extends AbstractBsVendorLargeDataCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected VendorLargeDataCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsVendorLargeDataCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from vendor_large_data) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public VendorLargeDataCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected VendorLargeDataCIQ xcreateCIQ() {
        VendorLargeDataCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected VendorLargeDataCIQ xnewCIQ() {
        return new VendorLargeDataCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join vendor_large_data on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public VendorLargeDataCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        VendorLargeDataCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _largeDataId;
    public ConditionValue getLargeDataId()
    { if (_largeDataId == null) { _largeDataId = nCV(); }
      return _largeDataId; }
    protected ConditionValue getCValueLargeDataId() { return getLargeDataId(); }

    public Map<String, VendorLargeDataRefCQ> getLargeDataId_ExistsReferrer_VendorLargeDataRefList() { return xgetSQueMap("largeDataId_ExistsReferrer_VendorLargeDataRefList"); }
    public String keepLargeDataId_ExistsReferrer_VendorLargeDataRefList(VendorLargeDataRefCQ sq) { return xkeepSQue("largeDataId_ExistsReferrer_VendorLargeDataRefList", sq); }

    public Map<String, VendorLargeDataRefCQ> getLargeDataId_NotExistsReferrer_VendorLargeDataRefList() { return xgetSQueMap("largeDataId_NotExistsReferrer_VendorLargeDataRefList"); }
    public String keepLargeDataId_NotExistsReferrer_VendorLargeDataRefList(VendorLargeDataRefCQ sq) { return xkeepSQue("largeDataId_NotExistsReferrer_VendorLargeDataRefList", sq); }

    public Map<String, VendorLargeDataRefCQ> getLargeDataId_SpecifyDerivedReferrer_VendorLargeDataRefList() { return xgetSQueMap("largeDataId_SpecifyDerivedReferrer_VendorLargeDataRefList"); }
    public String keepLargeDataId_SpecifyDerivedReferrer_VendorLargeDataRefList(VendorLargeDataRefCQ sq) { return xkeepSQue("largeDataId_SpecifyDerivedReferrer_VendorLargeDataRefList", sq); }

    public Map<String, VendorLargeDataRefCQ> getLargeDataId_QueryDerivedReferrer_VendorLargeDataRefList() { return xgetSQueMap("largeDataId_QueryDerivedReferrer_VendorLargeDataRefList"); }
    public String keepLargeDataId_QueryDerivedReferrer_VendorLargeDataRefList(VendorLargeDataRefCQ sq) { return xkeepSQue("largeDataId_QueryDerivedReferrer_VendorLargeDataRefList", sq); }
    public Map<String, Object> getLargeDataId_QueryDerivedReferrer_VendorLargeDataRefListParameter() { return xgetSQuePmMap("largeDataId_QueryDerivedReferrer_VendorLargeDataRefList"); }
    public String keepLargeDataId_QueryDerivedReferrer_VendorLargeDataRefListParameter(Object pm) { return xkeepSQuePm("largeDataId_QueryDerivedReferrer_VendorLargeDataRefList", pm); }

    /** 
     * Add order-by as ascend. <br />
     * large_data_id: {PK, NotNull, int8(19)}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataCQ addOrderBy_LargeDataId_Asc() { regOBA("large_data_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * large_data_id: {PK, NotNull, int8(19)}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataCQ addOrderBy_LargeDataId_Desc() { regOBD("large_data_id"); return this; }

    protected ConditionValue _stringIndex;
    public ConditionValue getStringIndex()
    { if (_stringIndex == null) { _stringIndex = nCV(); }
      return _stringIndex; }
    protected ConditionValue getCValueStringIndex() { return getStringIndex(); }

    /** 
     * Add order-by as ascend. <br />
     * string_index: {IX, NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataCQ addOrderBy_StringIndex_Asc() { regOBA("string_index"); return this; }

    /**
     * Add order-by as descend. <br />
     * string_index: {IX, NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataCQ addOrderBy_StringIndex_Desc() { regOBD("string_index"); return this; }

    protected ConditionValue _stringNoIndex;
    public ConditionValue getStringNoIndex()
    { if (_stringNoIndex == null) { _stringNoIndex = nCV(); }
      return _stringNoIndex; }
    protected ConditionValue getCValueStringNoIndex() { return getStringNoIndex(); }

    /** 
     * Add order-by as ascend. <br />
     * string_no_index: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataCQ addOrderBy_StringNoIndex_Asc() { regOBA("string_no_index"); return this; }

    /**
     * Add order-by as descend. <br />
     * string_no_index: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataCQ addOrderBy_StringNoIndex_Desc() { regOBD("string_no_index"); return this; }

    protected ConditionValue _stringUniqueIndex;
    public ConditionValue getStringUniqueIndex()
    { if (_stringUniqueIndex == null) { _stringUniqueIndex = nCV(); }
      return _stringUniqueIndex; }
    protected ConditionValue getCValueStringUniqueIndex() { return getStringUniqueIndex(); }

    /** 
     * Add order-by as ascend. <br />
     * string_unique_index: {UQ, NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataCQ addOrderBy_StringUniqueIndex_Asc() { regOBA("string_unique_index"); return this; }

    /**
     * Add order-by as descend. <br />
     * string_unique_index: {UQ, NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataCQ addOrderBy_StringUniqueIndex_Desc() { regOBD("string_unique_index"); return this; }

    protected ConditionValue _intflgIndex;
    public ConditionValue getIntflgIndex()
    { if (_intflgIndex == null) { _intflgIndex = nCV(); }
      return _intflgIndex; }
    protected ConditionValue getCValueIntflgIndex() { return getIntflgIndex(); }

    /** 
     * Add order-by as ascend. <br />
     * intflg_index: {NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataCQ addOrderBy_IntflgIndex_Asc() { regOBA("intflg_index"); return this; }

    /**
     * Add order-by as descend. <br />
     * intflg_index: {NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataCQ addOrderBy_IntflgIndex_Desc() { regOBD("intflg_index"); return this; }

    protected ConditionValue _numericIntegerIndex;
    public ConditionValue getNumericIntegerIndex()
    { if (_numericIntegerIndex == null) { _numericIntegerIndex = nCV(); }
      return _numericIntegerIndex; }
    protected ConditionValue getCValueNumericIntegerIndex() { return getNumericIntegerIndex(); }

    /** 
     * Add order-by as ascend. <br />
     * numeric_integer_index: {IX, NotNull, numeric(8)}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataCQ addOrderBy_NumericIntegerIndex_Asc() { regOBA("numeric_integer_index"); return this; }

    /**
     * Add order-by as descend. <br />
     * numeric_integer_index: {IX, NotNull, numeric(8)}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataCQ addOrderBy_NumericIntegerIndex_Desc() { regOBD("numeric_integer_index"); return this; }

    protected ConditionValue _numericIntegerNoIndex;
    public ConditionValue getNumericIntegerNoIndex()
    { if (_numericIntegerNoIndex == null) { _numericIntegerNoIndex = nCV(); }
      return _numericIntegerNoIndex; }
    protected ConditionValue getCValueNumericIntegerNoIndex() { return getNumericIntegerNoIndex(); }

    /** 
     * Add order-by as ascend. <br />
     * numeric_integer_no_index: {NotNull, numeric(8)}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataCQ addOrderBy_NumericIntegerNoIndex_Asc() { regOBA("numeric_integer_no_index"); return this; }

    /**
     * Add order-by as descend. <br />
     * numeric_integer_no_index: {NotNull, numeric(8)}
     * @return this. (NotNull)
     */
    public BsVendorLargeDataCQ addOrderBy_NumericIntegerNoIndex_Desc() { regOBD("numeric_integer_no_index"); return this; }

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
    public BsVendorLargeDataCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsVendorLargeDataCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, VendorLargeDataCQ> getScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(VendorLargeDataCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, VendorLargeDataCQ> getSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(VendorLargeDataCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, VendorLargeDataCQ> getQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(VendorLargeDataCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> getQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, VendorLargeDataCQ> _myselfExistsMap;
    public Map<String, VendorLargeDataCQ> getMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(VendorLargeDataCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, VendorLargeDataCQ> getMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(VendorLargeDataCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return VendorLargeDataCB.class.getName(); }
    protected String xCQ() { return VendorLargeDataCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
