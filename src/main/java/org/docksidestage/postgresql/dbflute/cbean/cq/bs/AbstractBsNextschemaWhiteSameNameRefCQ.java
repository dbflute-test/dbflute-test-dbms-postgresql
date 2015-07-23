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
 * The abstract condition-query of nextschema.white_same_name_ref.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsNextschemaWhiteSameNameRefCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsNextschemaWhiteSameNameRefCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "nextschema.white_same_name_ref";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * same_name_ref_id: {PK, NotNull, int8(19)}
     * @param sameNameRefId The value of sameNameRefId as equal. (NullAllowed: if null, no condition)
     */
    public void setSameNameRefId_Equal(Long sameNameRefId) {
        doSetSameNameRefId_Equal(sameNameRefId);
    }

    protected void doSetSameNameRefId_Equal(Long sameNameRefId) {
        regSameNameRefId(CK_EQ, sameNameRefId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * same_name_ref_id: {PK, NotNull, int8(19)}
     * @param sameNameRefId The value of sameNameRefId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setSameNameRefId_GreaterThan(Long sameNameRefId) {
        regSameNameRefId(CK_GT, sameNameRefId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * same_name_ref_id: {PK, NotNull, int8(19)}
     * @param sameNameRefId The value of sameNameRefId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setSameNameRefId_LessThan(Long sameNameRefId) {
        regSameNameRefId(CK_LT, sameNameRefId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * same_name_ref_id: {PK, NotNull, int8(19)}
     * @param sameNameRefId The value of sameNameRefId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setSameNameRefId_GreaterEqual(Long sameNameRefId) {
        regSameNameRefId(CK_GE, sameNameRefId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * same_name_ref_id: {PK, NotNull, int8(19)}
     * @param sameNameRefId The value of sameNameRefId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setSameNameRefId_LessEqual(Long sameNameRefId) {
        regSameNameRefId(CK_LE, sameNameRefId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * same_name_ref_id: {PK, NotNull, int8(19)}
     * @param minNumber The min number of sameNameRefId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of sameNameRefId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setSameNameRefId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setSameNameRefId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * same_name_ref_id: {PK, NotNull, int8(19)}
     * @param minNumber The min number of sameNameRefId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of sameNameRefId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSameNameRefId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSameNameRefId(), "same_name_ref_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * same_name_ref_id: {PK, NotNull, int8(19)}
     * @param sameNameRefIdList The collection of sameNameRefId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSameNameRefId_InScope(Collection<Long> sameNameRefIdList) {
        doSetSameNameRefId_InScope(sameNameRefIdList);
    }

    protected void doSetSameNameRefId_InScope(Collection<Long> sameNameRefIdList) {
        regINS(CK_INS, cTL(sameNameRefIdList), xgetCValueSameNameRefId(), "same_name_ref_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * same_name_ref_id: {PK, NotNull, int8(19)}
     * @param sameNameRefIdList The collection of sameNameRefId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSameNameRefId_NotInScope(Collection<Long> sameNameRefIdList) {
        doSetSameNameRefId_NotInScope(sameNameRefIdList);
    }

    protected void doSetSameNameRefId_NotInScope(Collection<Long> sameNameRefIdList) {
        regINS(CK_NINS, cTL(sameNameRefIdList), xgetCValueSameNameRefId(), "same_name_ref_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * same_name_ref_id: {PK, NotNull, int8(19)}
     */
    public void setSameNameRefId_IsNull() { regSameNameRefId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * same_name_ref_id: {PK, NotNull, int8(19)}
     */
    public void setSameNameRefId_IsNotNull() { regSameNameRefId(CK_ISNN, DOBJ); }

    protected void regSameNameRefId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSameNameRefId(), "same_name_ref_id"); }
    protected abstract ConditionValue xgetCValueSameNameRefId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * same_name_id: {NotNull, int4(10), FK to white_same_name}
     * @param sameNameId The value of sameNameId as equal. (NullAllowed: if null, no condition)
     */
    public void setSameNameId_Equal(Integer sameNameId) {
        doSetSameNameId_Equal(sameNameId);
    }

    protected void doSetSameNameId_Equal(Integer sameNameId) {
        regSameNameId(CK_EQ, sameNameId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * same_name_id: {NotNull, int4(10), FK to white_same_name}
     * @param sameNameId The value of sameNameId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setSameNameId_GreaterThan(Integer sameNameId) {
        regSameNameId(CK_GT, sameNameId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * same_name_id: {NotNull, int4(10), FK to white_same_name}
     * @param sameNameId The value of sameNameId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setSameNameId_LessThan(Integer sameNameId) {
        regSameNameId(CK_LT, sameNameId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * same_name_id: {NotNull, int4(10), FK to white_same_name}
     * @param sameNameId The value of sameNameId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setSameNameId_GreaterEqual(Integer sameNameId) {
        regSameNameId(CK_GE, sameNameId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * same_name_id: {NotNull, int4(10), FK to white_same_name}
     * @param sameNameId The value of sameNameId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setSameNameId_LessEqual(Integer sameNameId) {
        regSameNameId(CK_LE, sameNameId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * same_name_id: {NotNull, int4(10), FK to white_same_name}
     * @param minNumber The min number of sameNameId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of sameNameId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setSameNameId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setSameNameId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * same_name_id: {NotNull, int4(10), FK to white_same_name}
     * @param minNumber The min number of sameNameId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of sameNameId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSameNameId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSameNameId(), "same_name_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * same_name_id: {NotNull, int4(10), FK to white_same_name}
     * @param sameNameIdList The collection of sameNameId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSameNameId_InScope(Collection<Integer> sameNameIdList) {
        doSetSameNameId_InScope(sameNameIdList);
    }

    protected void doSetSameNameId_InScope(Collection<Integer> sameNameIdList) {
        regINS(CK_INS, cTL(sameNameIdList), xgetCValueSameNameId(), "same_name_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * same_name_id: {NotNull, int4(10), FK to white_same_name}
     * @param sameNameIdList The collection of sameNameId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSameNameId_NotInScope(Collection<Integer> sameNameIdList) {
        doSetSameNameId_NotInScope(sameNameIdList);
    }

    protected void doSetSameNameId_NotInScope(Collection<Integer> sameNameIdList) {
        regINS(CK_NINS, cTL(sameNameIdList), xgetCValueSameNameId(), "same_name_id");
    }

    protected void regSameNameId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSameNameId(), "same_name_id"); }
    protected abstract ConditionValue xgetCValueSameNameId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * next_ref_date: {date(13)}
     * @param nextRefDate The value of nextRefDate as equal. (NullAllowed: if null, no condition)
     */
    public void setNextRefDate_Equal(java.time.LocalDate nextRefDate) {
        regNextRefDate(CK_EQ,  nextRefDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * next_ref_date: {date(13)}
     * @param nextRefDate The value of nextRefDate as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setNextRefDate_GreaterThan(java.time.LocalDate nextRefDate) {
        regNextRefDate(CK_GT,  nextRefDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * next_ref_date: {date(13)}
     * @param nextRefDate The value of nextRefDate as lessThan. (NullAllowed: if null, no condition)
     */
    public void setNextRefDate_LessThan(java.time.LocalDate nextRefDate) {
        regNextRefDate(CK_LT,  nextRefDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * next_ref_date: {date(13)}
     * @param nextRefDate The value of nextRefDate as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setNextRefDate_GreaterEqual(java.time.LocalDate nextRefDate) {
        regNextRefDate(CK_GE,  nextRefDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * next_ref_date: {date(13)}
     * @param nextRefDate The value of nextRefDate as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setNextRefDate_LessEqual(java.time.LocalDate nextRefDate) {
        regNextRefDate(CK_LE, nextRefDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * next_ref_date: {date(13)}
     * <pre>e.g. setNextRefDate_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of nextRefDate. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of nextRefDate. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setNextRefDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setNextRefDate_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * next_ref_date: {date(13)}
     * <pre>e.g. setNextRefDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of nextRefDate. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of nextRefDate. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setNextRefDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "next_ref_date"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueNextRefDate(), nm, op);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * next_ref_date: {date(13)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of nextRefDate. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of nextRefDate. (NullAllowed: if null, no to-condition)
     */
    public void setNextRefDate_DateFromTo(java.time.LocalDate fromDate, java.time.LocalDate toDate) {
        setNextRefDate_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * next_ref_date: {date(13)}
     */
    public void setNextRefDate_IsNull() { regNextRefDate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * next_ref_date: {date(13)}
     */
    public void setNextRefDate_IsNotNull() { regNextRefDate(CK_ISNN, DOBJ); }

    protected void regNextRefDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNextRefDate(), "next_ref_date"); }
    protected abstract ConditionValue xgetCValueNextRefDate();

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
    public HpSLCFunction<NextschemaWhiteSameNameRefCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, NextschemaWhiteSameNameRefCB.class);
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
    public HpSLCFunction<NextschemaWhiteSameNameRefCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, NextschemaWhiteSameNameRefCB.class);
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
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<NextschemaWhiteSameNameRefCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, NextschemaWhiteSameNameRefCB.class);
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
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<NextschemaWhiteSameNameRefCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, NextschemaWhiteSameNameRefCB.class);
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
    public HpSLCFunction<NextschemaWhiteSameNameRefCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, NextschemaWhiteSameNameRefCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;NextschemaWhiteSameNameRefCB&gt;() {
     *     public void query(NextschemaWhiteSameNameRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<NextschemaWhiteSameNameRefCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, NextschemaWhiteSameNameRefCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        NextschemaWhiteSameNameRefCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(NextschemaWhiteSameNameRefCQ sq);

    protected NextschemaWhiteSameNameRefCB xcreateScalarConditionCB() {
        NextschemaWhiteSameNameRefCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected NextschemaWhiteSameNameRefCB xcreateScalarConditionPartitionByCB() {
        NextschemaWhiteSameNameRefCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<NextschemaWhiteSameNameRefCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        NextschemaWhiteSameNameRefCB cb = new NextschemaWhiteSameNameRefCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "same_name_ref_id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(NextschemaWhiteSameNameRefCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<NextschemaWhiteSameNameRefCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(NextschemaWhiteSameNameRefCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        NextschemaWhiteSameNameRefCB cb = new NextschemaWhiteSameNameRefCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "same_name_ref_id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(NextschemaWhiteSameNameRefCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<NextschemaWhiteSameNameRefCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        NextschemaWhiteSameNameRefCB cb = new NextschemaWhiteSameNameRefCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(NextschemaWhiteSameNameRefCQ sq);

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
    protected org.dbflute.dbway.ExtensionOperand xgetPostgreSQLMatchOperand() {
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
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
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
    protected NextschemaWhiteSameNameRefCB newMyCB() {
        return new NextschemaWhiteSameNameRefCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return NextschemaWhiteSameNameRefCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
