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
 * The abstract condition-query of white_not_pk.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteNotPkCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteNotPkCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_not_pk";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * not_pk_id: {NotNull, int8(19)}
     * @param notPkId The value of notPkId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNotPkId_Equal(Long notPkId) {
        doSetNotPkId_Equal(notPkId);
    }

    protected void doSetNotPkId_Equal(Long notPkId) {
        regNotPkId(CK_EQ, notPkId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * not_pk_id: {NotNull, int8(19)}
     * @param notPkId The value of notPkId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNotPkId_GreaterThan(Long notPkId) {
        regNotPkId(CK_GT, notPkId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * not_pk_id: {NotNull, int8(19)}
     * @param notPkId The value of notPkId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNotPkId_LessThan(Long notPkId) {
        regNotPkId(CK_LT, notPkId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * not_pk_id: {NotNull, int8(19)}
     * @param notPkId The value of notPkId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNotPkId_GreaterEqual(Long notPkId) {
        regNotPkId(CK_GE, notPkId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * not_pk_id: {NotNull, int8(19)}
     * @param notPkId The value of notPkId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNotPkId_LessEqual(Long notPkId) {
        regNotPkId(CK_LE, notPkId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * not_pk_id: {NotNull, int8(19)}
     * @param minNumber The min number of notPkId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of notPkId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setNotPkId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setNotPkId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * not_pk_id: {NotNull, int8(19)}
     * @param minNumber The min number of notPkId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of notPkId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNotPkId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNotPkId(), "not_pk_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * not_pk_id: {NotNull, int8(19)}
     * @param notPkIdList The collection of notPkId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotPkId_InScope(Collection<Long> notPkIdList) {
        doSetNotPkId_InScope(notPkIdList);
    }

    protected void doSetNotPkId_InScope(Collection<Long> notPkIdList) {
        regINS(CK_INS, cTL(notPkIdList), xgetCValueNotPkId(), "not_pk_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * not_pk_id: {NotNull, int8(19)}
     * @param notPkIdList The collection of notPkId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotPkId_NotInScope(Collection<Long> notPkIdList) {
        doSetNotPkId_NotInScope(notPkIdList);
    }

    protected void doSetNotPkId_NotInScope(Collection<Long> notPkIdList) {
        regINS(CK_NINS, cTL(notPkIdList), xgetCValueNotPkId(), "not_pk_id");
    }

    protected void regNotPkId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNotPkId(), "not_pk_id"); }
    protected abstract ConditionValue xgetCValueNotPkId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * not_pk_name: {varchar(2147483647)}
     * @param notPkName The value of notPkName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotPkName_Equal(String notPkName) {
        doSetNotPkName_Equal(fRES(notPkName));
    }

    protected void doSetNotPkName_Equal(String notPkName) {
        regNotPkName(CK_EQ, notPkName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * not_pk_name: {varchar(2147483647)}
     * @param notPkName The value of notPkName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotPkName_NotEqual(String notPkName) {
        doSetNotPkName_NotEqual(fRES(notPkName));
    }

    protected void doSetNotPkName_NotEqual(String notPkName) {
        regNotPkName(CK_NES, notPkName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * not_pk_name: {varchar(2147483647)}
     * @param notPkNameList The collection of notPkName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotPkName_InScope(Collection<String> notPkNameList) {
        doSetNotPkName_InScope(notPkNameList);
    }

    protected void doSetNotPkName_InScope(Collection<String> notPkNameList) {
        regINS(CK_INS, cTL(notPkNameList), xgetCValueNotPkName(), "not_pk_name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * not_pk_name: {varchar(2147483647)}
     * @param notPkNameList The collection of notPkName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotPkName_NotInScope(Collection<String> notPkNameList) {
        doSetNotPkName_NotInScope(notPkNameList);
    }

    protected void doSetNotPkName_NotInScope(Collection<String> notPkNameList) {
        regINS(CK_NINS, cTL(notPkNameList), xgetCValueNotPkName(), "not_pk_name");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * not_pk_name: {varchar(2147483647)} <br>
     * <pre>e.g. setNotPkName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param notPkName The value of notPkName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setNotPkName_LikeSearch(String notPkName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setNotPkName_LikeSearch(notPkName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * not_pk_name: {varchar(2147483647)} <br>
     * <pre>e.g. setNotPkName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param notPkName The value of notPkName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNotPkName_LikeSearch(String notPkName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(notPkName), xgetCValueNotPkName(), "not_pk_name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * not_pk_name: {varchar(2147483647)}
     * @param notPkName The value of notPkName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setNotPkName_NotLikeSearch(String notPkName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setNotPkName_NotLikeSearch(notPkName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * not_pk_name: {varchar(2147483647)}
     * @param notPkName The value of notPkName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNotPkName_NotLikeSearch(String notPkName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(notPkName), xgetCValueNotPkName(), "not_pk_name", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * not_pk_name: {varchar(2147483647)}
     * @param notPkName The value of notPkName as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotPkName_PrefixSearch(String notPkName) {
        setNotPkName_LikeSearch(notPkName, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * not_pk_name: {varchar(2147483647)}
     */
    public void setNotPkName_IsNull() { regNotPkName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * not_pk_name: {varchar(2147483647)}
     */
    public void setNotPkName_IsNullOrEmpty() { regNotPkName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * not_pk_name: {varchar(2147483647)}
     */
    public void setNotPkName_IsNotNull() { regNotPkName(CK_ISNN, DOBJ); }

    protected void regNotPkName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNotPkName(), "not_pk_name"); }
    protected abstract ConditionValue xgetCValueNotPkName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * not_pk_integer: {int4(10)}
     * @param notPkInteger The value of notPkInteger as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNotPkInteger_Equal(Integer notPkInteger) {
        doSetNotPkInteger_Equal(notPkInteger);
    }

    protected void doSetNotPkInteger_Equal(Integer notPkInteger) {
        regNotPkInteger(CK_EQ, notPkInteger);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * not_pk_integer: {int4(10)}
     * @param notPkInteger The value of notPkInteger as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNotPkInteger_GreaterThan(Integer notPkInteger) {
        regNotPkInteger(CK_GT, notPkInteger);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * not_pk_integer: {int4(10)}
     * @param notPkInteger The value of notPkInteger as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNotPkInteger_LessThan(Integer notPkInteger) {
        regNotPkInteger(CK_LT, notPkInteger);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * not_pk_integer: {int4(10)}
     * @param notPkInteger The value of notPkInteger as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNotPkInteger_GreaterEqual(Integer notPkInteger) {
        regNotPkInteger(CK_GE, notPkInteger);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * not_pk_integer: {int4(10)}
     * @param notPkInteger The value of notPkInteger as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNotPkInteger_LessEqual(Integer notPkInteger) {
        regNotPkInteger(CK_LE, notPkInteger);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * not_pk_integer: {int4(10)}
     * @param minNumber The min number of notPkInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of notPkInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setNotPkInteger_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setNotPkInteger_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * not_pk_integer: {int4(10)}
     * @param minNumber The min number of notPkInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of notPkInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNotPkInteger_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNotPkInteger(), "not_pk_integer", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * not_pk_integer: {int4(10)}
     * @param notPkIntegerList The collection of notPkInteger as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotPkInteger_InScope(Collection<Integer> notPkIntegerList) {
        doSetNotPkInteger_InScope(notPkIntegerList);
    }

    protected void doSetNotPkInteger_InScope(Collection<Integer> notPkIntegerList) {
        regINS(CK_INS, cTL(notPkIntegerList), xgetCValueNotPkInteger(), "not_pk_integer");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * not_pk_integer: {int4(10)}
     * @param notPkIntegerList The collection of notPkInteger as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotPkInteger_NotInScope(Collection<Integer> notPkIntegerList) {
        doSetNotPkInteger_NotInScope(notPkIntegerList);
    }

    protected void doSetNotPkInteger_NotInScope(Collection<Integer> notPkIntegerList) {
        regINS(CK_NINS, cTL(notPkIntegerList), xgetCValueNotPkInteger(), "not_pk_integer");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * not_pk_integer: {int4(10)}
     */
    public void setNotPkInteger_IsNull() { regNotPkInteger(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * not_pk_integer: {int4(10)}
     */
    public void setNotPkInteger_IsNotNull() { regNotPkInteger(CK_ISNN, DOBJ); }

    protected void regNotPkInteger(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNotPkInteger(), "not_pk_integer"); }
    protected abstract ConditionValue xgetCValueNotPkInteger();

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
    public HpSLCFunction<WhiteNotPkCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteNotPkCB.class);
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
    public HpSLCFunction<WhiteNotPkCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteNotPkCB.class);
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
    public HpSLCFunction<WhiteNotPkCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteNotPkCB.class);
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
    public HpSLCFunction<WhiteNotPkCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteNotPkCB.class);
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
    public HpSLCFunction<WhiteNotPkCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteNotPkCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteNotPkCB&gt;() {
     *     public void query(WhiteNotPkCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteNotPkCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteNotPkCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteNotPkCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteNotPkCQ sq);

    protected WhiteNotPkCB xcreateScalarConditionCB() {
        WhiteNotPkCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteNotPkCB xcreateScalarConditionPartitionByCB() {
        WhiteNotPkCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

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
    protected WhiteNotPkCB newMyCB() {
        return new WhiteNotPkCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteNotPkCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
