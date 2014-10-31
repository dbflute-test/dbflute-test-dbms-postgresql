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
 * The base condition-query of vendor_part_man_high.
 * @author DBFlute(AutoGenerator)
 */
public class BsVendorPartManHighCQ extends AbstractBsVendorPartManHighCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected VendorPartManHighCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsVendorPartManHighCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from vendor_part_man_high) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public VendorPartManHighCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected VendorPartManHighCIQ xcreateCIQ() {
        VendorPartManHighCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected VendorPartManHighCIQ xnewCIQ() {
        return new VendorPartManHighCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join vendor_part_man_high on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public VendorPartManHighCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        VendorPartManHighCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _partManId;
    public ConditionValue xdfgetPartManId()
    { if (_partManId == null) { _partManId = nCV(); }
      return _partManId; }
    protected ConditionValue xgetCValuePartManId() { return xdfgetPartManId(); }

    /** 
     * Add order-by as ascend. <br>
     * part_man_id: {PK, NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsVendorPartManHighCQ addOrderBy_PartManId_Asc() { regOBA("part_man_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * part_man_id: {PK, NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsVendorPartManHighCQ addOrderBy_PartManId_Desc() { regOBD("part_man_id"); return this; }

    protected ConditionValue _partManName;
    public ConditionValue xdfgetPartManName()
    { if (_partManName == null) { _partManName = nCV(); }
      return _partManName; }
    protected ConditionValue xgetCValuePartManName() { return xdfgetPartManName(); }

    /** 
     * Add order-by as ascend. <br>
     * part_man_name: {NotNull, varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsVendorPartManHighCQ addOrderBy_PartManName_Asc() { regOBA("part_man_name"); return this; }

    /**
     * Add order-by as descend. <br>
     * part_man_name: {NotNull, varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsVendorPartManHighCQ addOrderBy_PartManName_Desc() { regOBD("part_man_name"); return this; }

    protected ConditionValue _partManPoint;
    public ConditionValue xdfgetPartManPoint()
    { if (_partManPoint == null) { _partManPoint = nCV(); }
      return _partManPoint; }
    protected ConditionValue xgetCValuePartManPoint() { return xdfgetPartManPoint(); }

    /** 
     * Add order-by as ascend. <br>
     * part_man_point: {NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsVendorPartManHighCQ addOrderBy_PartManPoint_Asc() { regOBA("part_man_point"); return this; }

    /**
     * Add order-by as descend. <br>
     * part_man_point: {NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsVendorPartManHighCQ addOrderBy_PartManPoint_Desc() { regOBD("part_man_point"); return this; }

    protected ConditionValue _partManDate;
    public ConditionValue xdfgetPartManDate()
    { if (_partManDate == null) { _partManDate = nCV(); }
      return _partManDate; }
    protected ConditionValue xgetCValuePartManDate() { return xdfgetPartManDate(); }

    /** 
     * Add order-by as ascend. <br>
     * part_man_date: {date(13)}
     * @return this. (NotNull)
     */
    public BsVendorPartManHighCQ addOrderBy_PartManDate_Asc() { regOBA("part_man_date"); return this; }

    /**
     * Add order-by as descend. <br>
     * part_man_date: {date(13)}
     * @return this. (NotNull)
     */
    public BsVendorPartManHighCQ addOrderBy_PartManDate_Desc() { regOBD("part_man_date"); return this; }

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
    public BsVendorPartManHighCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsVendorPartManHighCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, VendorPartManHighCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(VendorPartManHighCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, VendorPartManHighCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(VendorPartManHighCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, VendorPartManHighCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(VendorPartManHighCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, VendorPartManHighCQ> _myselfExistsMap;
    public Map<String, VendorPartManHighCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(VendorPartManHighCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, VendorPartManHighCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(VendorPartManHighCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return VendorPartManHighCB.class.getName(); }
    protected String xCQ() { return VendorPartManHighCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
