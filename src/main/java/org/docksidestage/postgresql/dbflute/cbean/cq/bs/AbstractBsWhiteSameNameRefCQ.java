package org.docksidestage.postgresql.dbflute.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import org.docksidestage.postgresql.dbflute.allcommon.*;
import org.docksidestage.postgresql.dbflute.cbean.*;
import org.docksidestage.postgresql.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of white_same_name_ref.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteSameNameRefCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteSameNameRefCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "white_same_name_ref";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * same_name_ref_id: {PK, NotNull, int4(10)}
     * @param sameNameRefId The value of sameNameRefId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSameNameRefId_Equal(Integer sameNameRefId) {
        doSetSameNameRefId_Equal(sameNameRefId);
    }

    protected void doSetSameNameRefId_Equal(Integer sameNameRefId) {
        regSameNameRefId(CK_EQ, sameNameRefId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * same_name_ref_id: {PK, NotNull, int4(10)}
     * @param sameNameRefId The value of sameNameRefId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSameNameRefId_GreaterThan(Integer sameNameRefId) {
        regSameNameRefId(CK_GT, sameNameRefId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * same_name_ref_id: {PK, NotNull, int4(10)}
     * @param sameNameRefId The value of sameNameRefId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSameNameRefId_LessThan(Integer sameNameRefId) {
        regSameNameRefId(CK_LT, sameNameRefId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * same_name_ref_id: {PK, NotNull, int4(10)}
     * @param sameNameRefId The value of sameNameRefId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSameNameRefId_GreaterEqual(Integer sameNameRefId) {
        regSameNameRefId(CK_GE, sameNameRefId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * same_name_ref_id: {PK, NotNull, int4(10)}
     * @param sameNameRefId The value of sameNameRefId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSameNameRefId_LessEqual(Integer sameNameRefId) {
        regSameNameRefId(CK_LE, sameNameRefId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * same_name_ref_id: {PK, NotNull, int4(10)}
     * @param minNumber The min number of sameNameRefId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sameNameRefId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setSameNameRefId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setSameNameRefId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * same_name_ref_id: {PK, NotNull, int4(10)}
     * @param minNumber The min number of sameNameRefId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sameNameRefId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setSameNameRefId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSameNameRefId(), "same_name_ref_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * same_name_ref_id: {PK, NotNull, int4(10)}
     * @param sameNameRefIdList The collection of sameNameRefId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSameNameRefId_InScope(Collection<Integer> sameNameRefIdList) {
        doSetSameNameRefId_InScope(sameNameRefIdList);
    }

    protected void doSetSameNameRefId_InScope(Collection<Integer> sameNameRefIdList) {
        regINS(CK_INS, cTL(sameNameRefIdList), xgetCValueSameNameRefId(), "same_name_ref_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * same_name_ref_id: {PK, NotNull, int4(10)}
     * @param sameNameRefIdList The collection of sameNameRefId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSameNameRefId_NotInScope(Collection<Integer> sameNameRefIdList) {
        doSetSameNameRefId_NotInScope(sameNameRefIdList);
    }

    protected void doSetSameNameRefId_NotInScope(Collection<Integer> sameNameRefIdList) {
        regINS(CK_NINS, cTL(sameNameRefIdList), xgetCValueSameNameRefId(), "same_name_ref_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * same_name_ref_id: {PK, NotNull, int4(10)}
     */
    public void setSameNameRefId_IsNull() { regSameNameRefId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * same_name_ref_id: {PK, NotNull, int4(10)}
     */
    public void setSameNameRefId_IsNotNull() { regSameNameRefId(CK_ISNN, DOBJ); }

    protected void regSameNameRefId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSameNameRefId(), "same_name_ref_id"); }
    protected abstract ConditionValue xgetCValueSameNameRefId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * same_name_id: {NotNull, int8(19), FK to white_same_name}
     * @param sameNameId The value of sameNameId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSameNameId_Equal(Long sameNameId) {
        doSetSameNameId_Equal(sameNameId);
    }

    protected void doSetSameNameId_Equal(Long sameNameId) {
        regSameNameId(CK_EQ, sameNameId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * same_name_id: {NotNull, int8(19), FK to white_same_name}
     * @param sameNameId The value of sameNameId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSameNameId_GreaterThan(Long sameNameId) {
        regSameNameId(CK_GT, sameNameId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * same_name_id: {NotNull, int8(19), FK to white_same_name}
     * @param sameNameId The value of sameNameId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSameNameId_LessThan(Long sameNameId) {
        regSameNameId(CK_LT, sameNameId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * same_name_id: {NotNull, int8(19), FK to white_same_name}
     * @param sameNameId The value of sameNameId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSameNameId_GreaterEqual(Long sameNameId) {
        regSameNameId(CK_GE, sameNameId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * same_name_id: {NotNull, int8(19), FK to white_same_name}
     * @param sameNameId The value of sameNameId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSameNameId_LessEqual(Long sameNameId) {
        regSameNameId(CK_LE, sameNameId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * same_name_id: {NotNull, int8(19), FK to white_same_name}
     * @param minNumber The min number of sameNameId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sameNameId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setSameNameId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setSameNameId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * same_name_id: {NotNull, int8(19), FK to white_same_name}
     * @param minNumber The min number of sameNameId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sameNameId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setSameNameId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSameNameId(), "same_name_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * same_name_id: {NotNull, int8(19), FK to white_same_name}
     * @param sameNameIdList The collection of sameNameId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSameNameId_InScope(Collection<Long> sameNameIdList) {
        doSetSameNameId_InScope(sameNameIdList);
    }

    protected void doSetSameNameId_InScope(Collection<Long> sameNameIdList) {
        regINS(CK_INS, cTL(sameNameIdList), xgetCValueSameNameId(), "same_name_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * same_name_id: {NotNull, int8(19), FK to white_same_name}
     * @param sameNameIdList The collection of sameNameId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSameNameId_NotInScope(Collection<Long> sameNameIdList) {
        doSetSameNameId_NotInScope(sameNameIdList);
    }

    protected void doSetSameNameId_NotInScope(Collection<Long> sameNameIdList) {
        regINS(CK_NINS, cTL(sameNameIdList), xgetCValueSameNameId(), "same_name_id");
    }

    protected void regSameNameId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSameNameId(), "same_name_id"); }
    protected abstract ConditionValue xgetCValueSameNameId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * next_same_name_id: {NotNull, int8(19)}
     * @param nextSameNameId The value of nextSameNameId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNextSameNameId_Equal(Long nextSameNameId) {
        doSetNextSameNameId_Equal(nextSameNameId);
    }

    protected void doSetNextSameNameId_Equal(Long nextSameNameId) {
        regNextSameNameId(CK_EQ, nextSameNameId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * next_same_name_id: {NotNull, int8(19)}
     * @param nextSameNameId The value of nextSameNameId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNextSameNameId_GreaterThan(Long nextSameNameId) {
        regNextSameNameId(CK_GT, nextSameNameId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * next_same_name_id: {NotNull, int8(19)}
     * @param nextSameNameId The value of nextSameNameId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNextSameNameId_LessThan(Long nextSameNameId) {
        regNextSameNameId(CK_LT, nextSameNameId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * next_same_name_id: {NotNull, int8(19)}
     * @param nextSameNameId The value of nextSameNameId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNextSameNameId_GreaterEqual(Long nextSameNameId) {
        regNextSameNameId(CK_GE, nextSameNameId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * next_same_name_id: {NotNull, int8(19)}
     * @param nextSameNameId The value of nextSameNameId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNextSameNameId_LessEqual(Long nextSameNameId) {
        regNextSameNameId(CK_LE, nextSameNameId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * next_same_name_id: {NotNull, int8(19)}
     * @param minNumber The min number of nextSameNameId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of nextSameNameId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setNextSameNameId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setNextSameNameId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * next_same_name_id: {NotNull, int8(19)}
     * @param minNumber The min number of nextSameNameId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of nextSameNameId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setNextSameNameId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNextSameNameId(), "next_same_name_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * next_same_name_id: {NotNull, int8(19)}
     * @param nextSameNameIdList The collection of nextSameNameId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNextSameNameId_InScope(Collection<Long> nextSameNameIdList) {
        doSetNextSameNameId_InScope(nextSameNameIdList);
    }

    protected void doSetNextSameNameId_InScope(Collection<Long> nextSameNameIdList) {
        regINS(CK_INS, cTL(nextSameNameIdList), xgetCValueNextSameNameId(), "next_same_name_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * next_same_name_id: {NotNull, int8(19)}
     * @param nextSameNameIdList The collection of nextSameNameId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNextSameNameId_NotInScope(Collection<Long> nextSameNameIdList) {
        doSetNextSameNameId_NotInScope(nextSameNameIdList);
    }

    protected void doSetNextSameNameId_NotInScope(Collection<Long> nextSameNameIdList) {
        regINS(CK_NINS, cTL(nextSameNameIdList), xgetCValueNextSameNameId(), "next_same_name_id");
    }

    protected void regNextSameNameId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNextSameNameId(), "next_same_name_id"); }
    protected abstract ConditionValue xgetCValueNextSameNameId();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteSameNameRefCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteSameNameRefCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteSameNameRefCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteSameNameRefCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteSameNameRefCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteSameNameRefCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteSameNameRefCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteSameNameRefCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteSameNameRefCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteSameNameRefCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteSameNameRefCB&gt;() {
     *     public void query(WhiteSameNameRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteSameNameRefCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteSameNameRefCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSameNameRefCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteSameNameRefCQ sq);

    protected WhiteSameNameRefCB xcreateScalarConditionCB() {
        WhiteSameNameRefCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteSameNameRefCB xcreateScalarConditionPartitionByCB() {
        WhiteSameNameRefCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteSameNameRefCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSameNameRefCB cb = new WhiteSameNameRefCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "same_name_ref_id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteSameNameRefCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteSameNameRefCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteSameNameRefCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSameNameRefCB cb = new WhiteSameNameRefCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "same_name_ref_id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteSameNameRefCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteSameNameRefCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteSameNameRefCB cb = new WhiteSameNameRefCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteSameNameRefCQ sq);

    // ===================================================================================
    //                                                                    Full Text Search
    //                                                                    ================
    /**
     * Match for full-text search. <br>
     * @param textColumn The text column. (NotNull, StringColumn, TargetTableColumn)
     * @param conditionValue The condition value. (NullAllowed: if null or empty, no condition)
     */
    public void match(org.dbflute.dbmeta.info.ColumnInfo textColumn, String conditionValue) {
        assertObjectNotNull("textColumn", textColumn);
        match(newArrayList(textColumn), conditionValue);
    }

    /**
     * Match for full-text search. <br>
     * @param textColumnList The list of text column. (NotNull, NotEmpty, StringColumn, TargetTableColumn)
     * @param conditionValue The condition value. (NullAllowed: if null or empty, no condition)
     */
    public void match(List<org.dbflute.dbmeta.info.ColumnInfo> textColumnList, String conditionValue) {
        xdoMatchByLikeSearch(textColumnList, conditionValue);
    }

    @Override
    protected String xescapeFullTextSearchValue(String conditionValue) {
        return conditionValue; // non escape
    }

    @Override
    protected LikeSearchOption xcreateMatchLikeSearch() {
        return new PostgreSQLMatchLikeSearch();
    }

    @Override
    protected org.dbflute.dbway.topic.ExtensionOperand xgetPostgreSQLMatchOperand() {
        return DBFluteConfig.getInstance().getFullTextSearchOperand();
    }

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    /**
     * Order along manual ordering information.
     * <pre>
     * ManualOrderOption mop = new ManualOrderOption();
     * mop.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder(mop)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * ManualOrderOption mop = new ManualOrderOption();
     * mop.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     * mop.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     * mop.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder(mop)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param option The option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOption option) { // is user public!
        xdoWithManualOrder(option);
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected WhiteSameNameRefCB newMyCB() {
        return new WhiteSameNameRefCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteSameNameRefCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
