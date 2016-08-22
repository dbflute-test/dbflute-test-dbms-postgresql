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
 * The abstract condition-query of vendor_part_man_high.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsVendorPartManHighCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsVendorPartManHighCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "vendor_part_man_high";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * part_man_id: {PK, NotNull, int4(10)}
     * @param partManId The value of partManId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPartManId_Equal(Integer partManId) {
        doSetPartManId_Equal(partManId);
    }

    protected void doSetPartManId_Equal(Integer partManId) {
        regPartManId(CK_EQ, partManId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * part_man_id: {PK, NotNull, int4(10)}
     * @param partManId The value of partManId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPartManId_GreaterThan(Integer partManId) {
        regPartManId(CK_GT, partManId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * part_man_id: {PK, NotNull, int4(10)}
     * @param partManId The value of partManId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPartManId_LessThan(Integer partManId) {
        regPartManId(CK_LT, partManId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * part_man_id: {PK, NotNull, int4(10)}
     * @param partManId The value of partManId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPartManId_GreaterEqual(Integer partManId) {
        regPartManId(CK_GE, partManId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * part_man_id: {PK, NotNull, int4(10)}
     * @param partManId The value of partManId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPartManId_LessEqual(Integer partManId) {
        regPartManId(CK_LE, partManId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * part_man_id: {PK, NotNull, int4(10)}
     * @param minNumber The min number of partManId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of partManId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setPartManId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setPartManId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * part_man_id: {PK, NotNull, int4(10)}
     * @param minNumber The min number of partManId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of partManId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPartManId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePartManId(), "part_man_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * part_man_id: {PK, NotNull, int4(10)}
     * @param partManIdList The collection of partManId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPartManId_InScope(Collection<Integer> partManIdList) {
        doSetPartManId_InScope(partManIdList);
    }

    protected void doSetPartManId_InScope(Collection<Integer> partManIdList) {
        regINS(CK_INS, cTL(partManIdList), xgetCValuePartManId(), "part_man_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * part_man_id: {PK, NotNull, int4(10)}
     * @param partManIdList The collection of partManId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPartManId_NotInScope(Collection<Integer> partManIdList) {
        doSetPartManId_NotInScope(partManIdList);
    }

    protected void doSetPartManId_NotInScope(Collection<Integer> partManIdList) {
        regINS(CK_NINS, cTL(partManIdList), xgetCValuePartManId(), "part_man_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * part_man_id: {PK, NotNull, int4(10)}
     */
    public void setPartManId_IsNull() { regPartManId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * part_man_id: {PK, NotNull, int4(10)}
     */
    public void setPartManId_IsNotNull() { regPartManId(CK_ISNN, DOBJ); }

    protected void regPartManId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePartManId(), "part_man_id"); }
    protected abstract ConditionValue xgetCValuePartManId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * part_man_name: {NotNull, varchar(2147483647)}
     * @param partManName The value of partManName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setPartManName_Equal(String partManName) {
        doSetPartManName_Equal(fRES(partManName));
    }

    protected void doSetPartManName_Equal(String partManName) {
        regPartManName(CK_EQ, partManName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * part_man_name: {NotNull, varchar(2147483647)}
     * @param partManName The value of partManName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setPartManName_NotEqual(String partManName) {
        doSetPartManName_NotEqual(fRES(partManName));
    }

    protected void doSetPartManName_NotEqual(String partManName) {
        regPartManName(CK_NES, partManName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * part_man_name: {NotNull, varchar(2147483647)}
     * @param partManNameList The collection of partManName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPartManName_InScope(Collection<String> partManNameList) {
        doSetPartManName_InScope(partManNameList);
    }

    protected void doSetPartManName_InScope(Collection<String> partManNameList) {
        regINS(CK_INS, cTL(partManNameList), xgetCValuePartManName(), "part_man_name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * part_man_name: {NotNull, varchar(2147483647)}
     * @param partManNameList The collection of partManName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPartManName_NotInScope(Collection<String> partManNameList) {
        doSetPartManName_NotInScope(partManNameList);
    }

    protected void doSetPartManName_NotInScope(Collection<String> partManNameList) {
        regINS(CK_NINS, cTL(partManNameList), xgetCValuePartManName(), "part_man_name");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * part_man_name: {NotNull, varchar(2147483647)} <br>
     * <pre>e.g. setPartManName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param partManName The value of partManName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPartManName_LikeSearch(String partManName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPartManName_LikeSearch(partManName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * part_man_name: {NotNull, varchar(2147483647)} <br>
     * <pre>e.g. setPartManName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param partManName The value of partManName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPartManName_LikeSearch(String partManName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(partManName), xgetCValuePartManName(), "part_man_name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * part_man_name: {NotNull, varchar(2147483647)}
     * @param partManName The value of partManName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPartManName_NotLikeSearch(String partManName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPartManName_NotLikeSearch(partManName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * part_man_name: {NotNull, varchar(2147483647)}
     * @param partManName The value of partManName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPartManName_NotLikeSearch(String partManName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(partManName), xgetCValuePartManName(), "part_man_name", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * part_man_name: {NotNull, varchar(2147483647)}
     * @param partManName The value of partManName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setPartManName_PrefixSearch(String partManName) {
        setPartManName_LikeSearch(partManName, xcLSOPPre());
    }

    protected void regPartManName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePartManName(), "part_man_name"); }
    protected abstract ConditionValue xgetCValuePartManName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * part_man_point: {NotNull, int4(10)}
     * @param partManPoint The value of partManPoint as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPartManPoint_Equal(Integer partManPoint) {
        doSetPartManPoint_Equal(partManPoint);
    }

    protected void doSetPartManPoint_Equal(Integer partManPoint) {
        regPartManPoint(CK_EQ, partManPoint);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * part_man_point: {NotNull, int4(10)}
     * @param partManPoint The value of partManPoint as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPartManPoint_GreaterThan(Integer partManPoint) {
        regPartManPoint(CK_GT, partManPoint);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * part_man_point: {NotNull, int4(10)}
     * @param partManPoint The value of partManPoint as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPartManPoint_LessThan(Integer partManPoint) {
        regPartManPoint(CK_LT, partManPoint);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * part_man_point: {NotNull, int4(10)}
     * @param partManPoint The value of partManPoint as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPartManPoint_GreaterEqual(Integer partManPoint) {
        regPartManPoint(CK_GE, partManPoint);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * part_man_point: {NotNull, int4(10)}
     * @param partManPoint The value of partManPoint as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPartManPoint_LessEqual(Integer partManPoint) {
        regPartManPoint(CK_LE, partManPoint);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * part_man_point: {NotNull, int4(10)}
     * @param minNumber The min number of partManPoint. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of partManPoint. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setPartManPoint_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setPartManPoint_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * part_man_point: {NotNull, int4(10)}
     * @param minNumber The min number of partManPoint. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of partManPoint. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPartManPoint_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePartManPoint(), "part_man_point", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * part_man_point: {NotNull, int4(10)}
     * @param partManPointList The collection of partManPoint as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPartManPoint_InScope(Collection<Integer> partManPointList) {
        doSetPartManPoint_InScope(partManPointList);
    }

    protected void doSetPartManPoint_InScope(Collection<Integer> partManPointList) {
        regINS(CK_INS, cTL(partManPointList), xgetCValuePartManPoint(), "part_man_point");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * part_man_point: {NotNull, int4(10)}
     * @param partManPointList The collection of partManPoint as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPartManPoint_NotInScope(Collection<Integer> partManPointList) {
        doSetPartManPoint_NotInScope(partManPointList);
    }

    protected void doSetPartManPoint_NotInScope(Collection<Integer> partManPointList) {
        regINS(CK_NINS, cTL(partManPointList), xgetCValuePartManPoint(), "part_man_point");
    }

    protected void regPartManPoint(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePartManPoint(), "part_man_point"); }
    protected abstract ConditionValue xgetCValuePartManPoint();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * part_man_date: {date(13)}
     * @param partManDate The value of partManDate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPartManDate_Equal(java.time.LocalDate partManDate) {
        regPartManDate(CK_EQ,  partManDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * part_man_date: {date(13)}
     * @param partManDate The value of partManDate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPartManDate_GreaterThan(java.time.LocalDate partManDate) {
        regPartManDate(CK_GT,  partManDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * part_man_date: {date(13)}
     * @param partManDate The value of partManDate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPartManDate_LessThan(java.time.LocalDate partManDate) {
        regPartManDate(CK_LT,  partManDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * part_man_date: {date(13)}
     * @param partManDate The value of partManDate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPartManDate_GreaterEqual(java.time.LocalDate partManDate) {
        regPartManDate(CK_GE,  partManDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * part_man_date: {date(13)}
     * @param partManDate The value of partManDate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPartManDate_LessEqual(java.time.LocalDate partManDate) {
        regPartManDate(CK_LE, partManDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * part_man_date: {date(13)}
     * <pre>e.g. setPartManDate_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of partManDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of partManDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setPartManDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setPartManDate_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * part_man_date: {date(13)}
     * <pre>e.g. setPartManDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of partManDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of partManDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setPartManDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "part_man_date"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValuePartManDate(), nm, op);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * part_man_date: {date(13)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of partManDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of partManDate. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setPartManDate_DateFromTo(java.time.LocalDate fromDate, java.time.LocalDate toDate) {
        setPartManDate_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * part_man_date: {date(13)}
     */
    public void setPartManDate_IsNull() { regPartManDate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * part_man_date: {date(13)}
     */
    public void setPartManDate_IsNotNull() { regPartManDate(CK_ISNN, DOBJ); }

    protected void regPartManDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePartManDate(), "part_man_date"); }
    protected abstract ConditionValue xgetCValuePartManDate();

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
    public HpSLCFunction<VendorPartManHighCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, VendorPartManHighCB.class);
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
    public HpSLCFunction<VendorPartManHighCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, VendorPartManHighCB.class);
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
    public HpSLCFunction<VendorPartManHighCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, VendorPartManHighCB.class);
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
    public HpSLCFunction<VendorPartManHighCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, VendorPartManHighCB.class);
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
    public HpSLCFunction<VendorPartManHighCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, VendorPartManHighCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;VendorPartManHighCB&gt;() {
     *     public void query(VendorPartManHighCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<VendorPartManHighCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, VendorPartManHighCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorPartManHighCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(VendorPartManHighCQ sq);

    protected VendorPartManHighCB xcreateScalarConditionCB() {
        VendorPartManHighCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected VendorPartManHighCB xcreateScalarConditionPartitionByCB() {
        VendorPartManHighCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<VendorPartManHighCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorPartManHighCB cb = new VendorPartManHighCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "part_man_id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(VendorPartManHighCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<VendorPartManHighCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(VendorPartManHighCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorPartManHighCB cb = new VendorPartManHighCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "part_man_id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(VendorPartManHighCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<VendorPartManHighCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        VendorPartManHighCB cb = new VendorPartManHighCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(VendorPartManHighCQ sq);

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
    protected VendorPartManHighCB newMyCB() {
        return new VendorPartManHighCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return VendorPartManHighCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
