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
 * The abstract condition-query of purchase_payment.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsPurchasePaymentCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsPurchasePaymentCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "purchase_payment";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (購入支払ID)purchase_payment_id: {PK, ID, NotNull, bigserial(19)}
     * @param purchasePaymentId The value of purchasePaymentId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchasePaymentId_Equal(Long purchasePaymentId) {
        doSetPurchasePaymentId_Equal(purchasePaymentId);
    }

    protected void doSetPurchasePaymentId_Equal(Long purchasePaymentId) {
        regPurchasePaymentId(CK_EQ, purchasePaymentId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (購入支払ID)purchase_payment_id: {PK, ID, NotNull, bigserial(19)}
     * @param purchasePaymentId The value of purchasePaymentId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchasePaymentId_GreaterThan(Long purchasePaymentId) {
        regPurchasePaymentId(CK_GT, purchasePaymentId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (購入支払ID)purchase_payment_id: {PK, ID, NotNull, bigserial(19)}
     * @param purchasePaymentId The value of purchasePaymentId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchasePaymentId_LessThan(Long purchasePaymentId) {
        regPurchasePaymentId(CK_LT, purchasePaymentId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (購入支払ID)purchase_payment_id: {PK, ID, NotNull, bigserial(19)}
     * @param purchasePaymentId The value of purchasePaymentId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchasePaymentId_GreaterEqual(Long purchasePaymentId) {
        regPurchasePaymentId(CK_GE, purchasePaymentId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (購入支払ID)purchase_payment_id: {PK, ID, NotNull, bigserial(19)}
     * @param purchasePaymentId The value of purchasePaymentId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchasePaymentId_LessEqual(Long purchasePaymentId) {
        regPurchasePaymentId(CK_LE, purchasePaymentId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (購入支払ID)purchase_payment_id: {PK, ID, NotNull, bigserial(19)}
     * @param minNumber The min number of purchasePaymentId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of purchasePaymentId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setPurchasePaymentId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setPurchasePaymentId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (購入支払ID)purchase_payment_id: {PK, ID, NotNull, bigserial(19)}
     * @param minNumber The min number of purchasePaymentId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of purchasePaymentId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setPurchasePaymentId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePurchasePaymentId(), "purchase_payment_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (購入支払ID)purchase_payment_id: {PK, ID, NotNull, bigserial(19)}
     * @param purchasePaymentIdList The collection of purchasePaymentId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchasePaymentId_InScope(Collection<Long> purchasePaymentIdList) {
        doSetPurchasePaymentId_InScope(purchasePaymentIdList);
    }

    protected void doSetPurchasePaymentId_InScope(Collection<Long> purchasePaymentIdList) {
        regINS(CK_INS, cTL(purchasePaymentIdList), xgetCValuePurchasePaymentId(), "purchase_payment_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (購入支払ID)purchase_payment_id: {PK, ID, NotNull, bigserial(19)}
     * @param purchasePaymentIdList The collection of purchasePaymentId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchasePaymentId_NotInScope(Collection<Long> purchasePaymentIdList) {
        doSetPurchasePaymentId_NotInScope(purchasePaymentIdList);
    }

    protected void doSetPurchasePaymentId_NotInScope(Collection<Long> purchasePaymentIdList) {
        regINS(CK_NINS, cTL(purchasePaymentIdList), xgetCValuePurchasePaymentId(), "purchase_payment_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (購入支払ID)purchase_payment_id: {PK, ID, NotNull, bigserial(19)}
     */
    public void setPurchasePaymentId_IsNull() { regPurchasePaymentId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (購入支払ID)purchase_payment_id: {PK, ID, NotNull, bigserial(19)}
     */
    public void setPurchasePaymentId_IsNotNull() { regPurchasePaymentId(CK_ISNN, DOBJ); }

    protected void regPurchasePaymentId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePurchasePaymentId(), "purchase_payment_id"); }
    protected abstract ConditionValue xgetCValuePurchasePaymentId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (購入ID)purchase_id: {NotNull, int8(19), FK to purchase}
     * @param purchaseId The value of purchaseId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchaseId_Equal(Long purchaseId) {
        doSetPurchaseId_Equal(purchaseId);
    }

    protected void doSetPurchaseId_Equal(Long purchaseId) {
        regPurchaseId(CK_EQ, purchaseId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (購入ID)purchase_id: {NotNull, int8(19), FK to purchase}
     * @param purchaseId The value of purchaseId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchaseId_GreaterThan(Long purchaseId) {
        regPurchaseId(CK_GT, purchaseId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (購入ID)purchase_id: {NotNull, int8(19), FK to purchase}
     * @param purchaseId The value of purchaseId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchaseId_LessThan(Long purchaseId) {
        regPurchaseId(CK_LT, purchaseId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (購入ID)purchase_id: {NotNull, int8(19), FK to purchase}
     * @param purchaseId The value of purchaseId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchaseId_GreaterEqual(Long purchaseId) {
        regPurchaseId(CK_GE, purchaseId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (購入ID)purchase_id: {NotNull, int8(19), FK to purchase}
     * @param purchaseId The value of purchaseId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPurchaseId_LessEqual(Long purchaseId) {
        regPurchaseId(CK_LE, purchaseId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (購入ID)purchase_id: {NotNull, int8(19), FK to purchase}
     * @param minNumber The min number of purchaseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of purchaseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setPurchaseId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setPurchaseId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (購入ID)purchase_id: {NotNull, int8(19), FK to purchase}
     * @param minNumber The min number of purchaseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of purchaseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setPurchaseId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePurchaseId(), "purchase_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (購入ID)purchase_id: {NotNull, int8(19), FK to purchase}
     * @param purchaseIdList The collection of purchaseId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchaseId_InScope(Collection<Long> purchaseIdList) {
        doSetPurchaseId_InScope(purchaseIdList);
    }

    protected void doSetPurchaseId_InScope(Collection<Long> purchaseIdList) {
        regINS(CK_INS, cTL(purchaseIdList), xgetCValuePurchaseId(), "purchase_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (購入ID)purchase_id: {NotNull, int8(19), FK to purchase}
     * @param purchaseIdList The collection of purchaseId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchaseId_NotInScope(Collection<Long> purchaseIdList) {
        doSetPurchaseId_NotInScope(purchaseIdList);
    }

    protected void doSetPurchaseId_NotInScope(Collection<Long> purchaseIdList) {
        regINS(CK_NINS, cTL(purchaseIdList), xgetCValuePurchaseId(), "purchase_id");
    }

    protected void regPurchaseId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePurchaseId(), "purchase_id"); }
    protected abstract ConditionValue xgetCValuePurchaseId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (支払金額)payment_amount: {NotNull, numeric(10, 2)}
     * @param paymentAmount The value of paymentAmount as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPaymentAmount_Equal(java.math.BigDecimal paymentAmount) {
        doSetPaymentAmount_Equal(paymentAmount);
    }

    protected void doSetPaymentAmount_Equal(java.math.BigDecimal paymentAmount) {
        regPaymentAmount(CK_EQ, paymentAmount);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (支払金額)payment_amount: {NotNull, numeric(10, 2)}
     * @param paymentAmount The value of paymentAmount as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPaymentAmount_GreaterThan(java.math.BigDecimal paymentAmount) {
        regPaymentAmount(CK_GT, paymentAmount);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (支払金額)payment_amount: {NotNull, numeric(10, 2)}
     * @param paymentAmount The value of paymentAmount as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPaymentAmount_LessThan(java.math.BigDecimal paymentAmount) {
        regPaymentAmount(CK_LT, paymentAmount);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (支払金額)payment_amount: {NotNull, numeric(10, 2)}
     * @param paymentAmount The value of paymentAmount as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPaymentAmount_GreaterEqual(java.math.BigDecimal paymentAmount) {
        regPaymentAmount(CK_GE, paymentAmount);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (支払金額)payment_amount: {NotNull, numeric(10, 2)}
     * @param paymentAmount The value of paymentAmount as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPaymentAmount_LessEqual(java.math.BigDecimal paymentAmount) {
        regPaymentAmount(CK_LE, paymentAmount);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (支払金額)payment_amount: {NotNull, numeric(10, 2)}
     * @param minNumber The min number of paymentAmount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of paymentAmount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setPaymentAmount_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setPaymentAmount_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (支払金額)payment_amount: {NotNull, numeric(10, 2)}
     * @param minNumber The min number of paymentAmount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of paymentAmount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setPaymentAmount_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePaymentAmount(), "payment_amount", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (支払金額)payment_amount: {NotNull, numeric(10, 2)}
     * @param paymentAmountList The collection of paymentAmount as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentAmount_InScope(Collection<java.math.BigDecimal> paymentAmountList) {
        doSetPaymentAmount_InScope(paymentAmountList);
    }

    protected void doSetPaymentAmount_InScope(Collection<java.math.BigDecimal> paymentAmountList) {
        regINS(CK_INS, cTL(paymentAmountList), xgetCValuePaymentAmount(), "payment_amount");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (支払金額)payment_amount: {NotNull, numeric(10, 2)}
     * @param paymentAmountList The collection of paymentAmount as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentAmount_NotInScope(Collection<java.math.BigDecimal> paymentAmountList) {
        doSetPaymentAmount_NotInScope(paymentAmountList);
    }

    protected void doSetPaymentAmount_NotInScope(Collection<java.math.BigDecimal> paymentAmountList) {
        regINS(CK_NINS, cTL(paymentAmountList), xgetCValuePaymentAmount(), "payment_amount");
    }

    protected void regPaymentAmount(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePaymentAmount(), "payment_amount"); }
    protected abstract ConditionValue xgetCValuePaymentAmount();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (支払日時)payment_datetime: {IX+, NotNull, timestamp(26, 3)}
     * @param paymentDatetime The value of paymentDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPaymentDatetime_Equal(java.time.LocalDateTime paymentDatetime) {
        regPaymentDatetime(CK_EQ,  paymentDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (支払日時)payment_datetime: {IX+, NotNull, timestamp(26, 3)}
     * @param paymentDatetime The value of paymentDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPaymentDatetime_GreaterThan(java.time.LocalDateTime paymentDatetime) {
        regPaymentDatetime(CK_GT,  paymentDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (支払日時)payment_datetime: {IX+, NotNull, timestamp(26, 3)}
     * @param paymentDatetime The value of paymentDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPaymentDatetime_LessThan(java.time.LocalDateTime paymentDatetime) {
        regPaymentDatetime(CK_LT,  paymentDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (支払日時)payment_datetime: {IX+, NotNull, timestamp(26, 3)}
     * @param paymentDatetime The value of paymentDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPaymentDatetime_GreaterEqual(java.time.LocalDateTime paymentDatetime) {
        regPaymentDatetime(CK_GE,  paymentDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (支払日時)payment_datetime: {IX+, NotNull, timestamp(26, 3)}
     * @param paymentDatetime The value of paymentDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPaymentDatetime_LessEqual(java.time.LocalDateTime paymentDatetime) {
        regPaymentDatetime(CK_LE, paymentDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (支払日時)payment_datetime: {IX+, NotNull, timestamp(26, 3)}
     * <pre>e.g. setPaymentDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of paymentDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of paymentDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setPaymentDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setPaymentDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (支払日時)payment_datetime: {IX+, NotNull, timestamp(26, 3)}
     * <pre>e.g. setPaymentDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of paymentDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of paymentDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setPaymentDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "payment_datetime"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValuePaymentDatetime(), nm, op);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (支払日時)payment_datetime: {IX+, NotNull, timestamp(26, 3)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of paymentDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of paymentDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setPaymentDatetime_DateFromTo(java.time.LocalDateTime fromDate, java.time.LocalDateTime toDate) {
        setPaymentDatetime_FromTo(fromDate, toDate, xcDFTOP());
    }

    protected void regPaymentDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePaymentDatetime(), "payment_datetime"); }
    protected abstract ConditionValue xgetCValuePaymentDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (支払方法コード)payment_method_code: {NotNull, bpchar(3), classification=PaymentMethod}
     * @param paymentMethodCode The value of paymentMethodCode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setPaymentMethodCode_Equal(String paymentMethodCode) {
        doSetPaymentMethodCode_Equal(fRES(paymentMethodCode));
    }

    /**
     * Equal(=). As PaymentMethod. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (支払方法コード)payment_method_code: {NotNull, bpchar(3), classification=PaymentMethod} <br>
     * method of payment for purchase
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPaymentMethodCode_Equal_AsPaymentMethod(CDef.PaymentMethod cdef) {
        doSetPaymentMethodCode_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As ByHand (HAN). And OnlyOnceRegistered. <br>
     * by hand: payment by hand, face-to-face
     */
    public void setPaymentMethodCode_Equal_ByHand() {
        setPaymentMethodCode_Equal_AsPaymentMethod(CDef.PaymentMethod.ByHand);
    }

    /**
     * Equal(=). As BankTransfer (BAK). And OnlyOnceRegistered. <br>
     * bank transfer: bank transfer payment
     */
    public void setPaymentMethodCode_Equal_BankTransfer() {
        setPaymentMethodCode_Equal_AsPaymentMethod(CDef.PaymentMethod.BankTransfer);
    }

    /**
     * Equal(=). As CreditCard (CRC). And OnlyOnceRegistered. <br>
     * credit card: credit card payment
     */
    public void setPaymentMethodCode_Equal_CreditCard() {
        setPaymentMethodCode_Equal_AsPaymentMethod(CDef.PaymentMethod.CreditCard);
    }

    protected void doSetPaymentMethodCode_Equal(String paymentMethodCode) {
        regPaymentMethodCode(CK_EQ, paymentMethodCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (支払方法コード)payment_method_code: {NotNull, bpchar(3), classification=PaymentMethod}
     * @param paymentMethodCode The value of paymentMethodCode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setPaymentMethodCode_NotEqual(String paymentMethodCode) {
        doSetPaymentMethodCode_NotEqual(fRES(paymentMethodCode));
    }

    /**
     * NotEqual(&lt;&gt;). As PaymentMethod. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (支払方法コード)payment_method_code: {NotNull, bpchar(3), classification=PaymentMethod} <br>
     * method of payment for purchase
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPaymentMethodCode_NotEqual_AsPaymentMethod(CDef.PaymentMethod cdef) {
        doSetPaymentMethodCode_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As ByHand (HAN). And OnlyOnceRegistered. <br>
     * by hand: payment by hand, face-to-face
     */
    public void setPaymentMethodCode_NotEqual_ByHand() {
        setPaymentMethodCode_NotEqual_AsPaymentMethod(CDef.PaymentMethod.ByHand);
    }

    /**
     * NotEqual(&lt;&gt;). As BankTransfer (BAK). And OnlyOnceRegistered. <br>
     * bank transfer: bank transfer payment
     */
    public void setPaymentMethodCode_NotEqual_BankTransfer() {
        setPaymentMethodCode_NotEqual_AsPaymentMethod(CDef.PaymentMethod.BankTransfer);
    }

    /**
     * NotEqual(&lt;&gt;). As CreditCard (CRC). And OnlyOnceRegistered. <br>
     * credit card: credit card payment
     */
    public void setPaymentMethodCode_NotEqual_CreditCard() {
        setPaymentMethodCode_NotEqual_AsPaymentMethod(CDef.PaymentMethod.CreditCard);
    }

    protected void doSetPaymentMethodCode_NotEqual(String paymentMethodCode) {
        regPaymentMethodCode(CK_NES, paymentMethodCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (支払方法コード)payment_method_code: {NotNull, bpchar(3), classification=PaymentMethod}
     * @param paymentMethodCodeList The collection of paymentMethodCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setPaymentMethodCode_InScope(Collection<String> paymentMethodCodeList) {
        doSetPaymentMethodCode_InScope(paymentMethodCodeList);
    }

    /**
     * InScope {in ('a', 'b')}. As PaymentMethod. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (支払方法コード)payment_method_code: {NotNull, bpchar(3), classification=PaymentMethod} <br>
     * method of payment for purchase
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentMethodCode_InScope_AsPaymentMethod(Collection<CDef.PaymentMethod> cdefList) {
        doSetPaymentMethodCode_InScope(cTStrL(cdefList));
    }

    /**
     * InScope {in ('a', 'b')}. As PaymentMethod. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * method of payment for purchase <br>
     * the most recommended method <br>
     * The group elements:[ByHand]
     */
    public void setPaymentMethodCode_InScope_Recommended() {
        setPaymentMethodCode_InScope_AsPaymentMethod(CDef.PaymentMethod.listOfRecommended());
    }

    protected void doSetPaymentMethodCode_InScope(Collection<String> paymentMethodCodeList) {
        regINS(CK_INS, cTL(paymentMethodCodeList), xgetCValuePaymentMethodCode(), "payment_method_code");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (支払方法コード)payment_method_code: {NotNull, bpchar(3), classification=PaymentMethod}
     * @param paymentMethodCodeList The collection of paymentMethodCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setPaymentMethodCode_NotInScope(Collection<String> paymentMethodCodeList) {
        doSetPaymentMethodCode_NotInScope(paymentMethodCodeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As PaymentMethod. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (支払方法コード)payment_method_code: {NotNull, bpchar(3), classification=PaymentMethod} <br>
     * method of payment for purchase
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentMethodCode_NotInScope_AsPaymentMethod(Collection<CDef.PaymentMethod> cdefList) {
        doSetPaymentMethodCode_NotInScope(cTStrL(cdefList));
    }

    protected void doSetPaymentMethodCode_NotInScope(Collection<String> paymentMethodCodeList) {
        regINS(CK_NINS, cTL(paymentMethodCodeList), xgetCValuePaymentMethodCode(), "payment_method_code");
    }

    protected void regPaymentMethodCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePaymentMethodCode(), "payment_method_code"); }
    protected abstract ConditionValue xgetCValuePaymentMethodCode();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, timestamp(26, 3)}
     * @param registerDatetime The value of registerDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_Equal(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_EQ,  registerDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, timestamp(26, 3)}
     * @param registerDatetime The value of registerDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_GreaterThan(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_GT,  registerDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, timestamp(26, 3)}
     * @param registerDatetime The value of registerDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_LessThan(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_LT,  registerDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, timestamp(26, 3)}
     * @param registerDatetime The value of registerDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_GreaterEqual(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_GE,  registerDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, timestamp(26, 3)}
     * @param registerDatetime The value of registerDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_LessEqual(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_LE, registerDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, timestamp(26, 3)}
     * <pre>e.g. setRegisterDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setRegisterDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setRegisterDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, timestamp(26, 3)}
     * <pre>e.g. setRegisterDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setRegisterDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "register_datetime"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueRegisterDatetime(), nm, op);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, timestamp(26, 3)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setRegisterDatetime_DateFromTo(java.time.LocalDateTime fromDate, java.time.LocalDateTime toDate) {
        setRegisterDatetime_FromTo(fromDate, toDate, xcDFTOP());
    }

    protected void regRegisterDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegisterDatetime(), "register_datetime"); }
    protected abstract ConditionValue xgetCValueRegisterDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * register_user: {NotNull, varchar(200)}
     * @param registerUser The value of registerUser as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterUser_Equal(String registerUser) {
        doSetRegisterUser_Equal(fRES(registerUser));
    }

    protected void doSetRegisterUser_Equal(String registerUser) {
        regRegisterUser(CK_EQ, registerUser);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * register_user: {NotNull, varchar(200)}
     * @param registerUser The value of registerUser as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterUser_NotEqual(String registerUser) {
        doSetRegisterUser_NotEqual(fRES(registerUser));
    }

    protected void doSetRegisterUser_NotEqual(String registerUser) {
        regRegisterUser(CK_NES, registerUser);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * register_user: {NotNull, varchar(200)}
     * @param registerUserList The collection of registerUser as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterUser_InScope(Collection<String> registerUserList) {
        doSetRegisterUser_InScope(registerUserList);
    }

    protected void doSetRegisterUser_InScope(Collection<String> registerUserList) {
        regINS(CK_INS, cTL(registerUserList), xgetCValueRegisterUser(), "register_user");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * register_user: {NotNull, varchar(200)}
     * @param registerUserList The collection of registerUser as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterUser_NotInScope(Collection<String> registerUserList) {
        doSetRegisterUser_NotInScope(registerUserList);
    }

    protected void doSetRegisterUser_NotInScope(Collection<String> registerUserList) {
        regINS(CK_NINS, cTL(registerUserList), xgetCValueRegisterUser(), "register_user");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * register_user: {NotNull, varchar(200)} <br>
     * <pre>e.g. setRegisterUser_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param registerUser The value of registerUser as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRegisterUser_LikeSearch(String registerUser, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRegisterUser_LikeSearch(registerUser, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * register_user: {NotNull, varchar(200)} <br>
     * <pre>e.g. setRegisterUser_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param registerUser The value of registerUser as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setRegisterUser_LikeSearch(String registerUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(registerUser), xgetCValueRegisterUser(), "register_user", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * register_user: {NotNull, varchar(200)}
     * @param registerUser The value of registerUser as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRegisterUser_NotLikeSearch(String registerUser, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRegisterUser_NotLikeSearch(registerUser, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * register_user: {NotNull, varchar(200)}
     * @param registerUser The value of registerUser as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setRegisterUser_NotLikeSearch(String registerUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(registerUser), xgetCValueRegisterUser(), "register_user", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * register_user: {NotNull, varchar(200)}
     * @param registerUser The value of registerUser as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegisterUser_PrefixSearch(String registerUser) {
        setRegisterUser_LikeSearch(registerUser, xcLSOPPre());
    }

    protected void regRegisterUser(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegisterUser(), "register_user"); }
    protected abstract ConditionValue xgetCValueRegisterUser();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {NotNull, timestamp(26, 3)}
     * @param updateDatetime The value of updateDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_Equal(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_EQ,  updateDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {NotNull, timestamp(26, 3)}
     * @param updateDatetime The value of updateDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_GreaterThan(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_GT,  updateDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {NotNull, timestamp(26, 3)}
     * @param updateDatetime The value of updateDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_LessThan(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_LT,  updateDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {NotNull, timestamp(26, 3)}
     * @param updateDatetime The value of updateDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_GreaterEqual(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_GE,  updateDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {NotNull, timestamp(26, 3)}
     * @param updateDatetime The value of updateDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_LessEqual(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_LE, updateDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {NotNull, timestamp(26, 3)}
     * <pre>e.g. setUpdateDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setUpdateDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setUpdateDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {NotNull, timestamp(26, 3)}
     * <pre>e.g. setUpdateDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setUpdateDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "update_datetime"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueUpdateDatetime(), nm, op);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {NotNull, timestamp(26, 3)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setUpdateDatetime_DateFromTo(java.time.LocalDateTime fromDate, java.time.LocalDateTime toDate) {
        setUpdateDatetime_FromTo(fromDate, toDate, xcDFTOP());
    }

    protected void regUpdateDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdateDatetime(), "update_datetime"); }
    protected abstract ConditionValue xgetCValueUpdateDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * update_user: {NotNull, varchar(200)}
     * @param updateUser The value of updateUser as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateUser_Equal(String updateUser) {
        doSetUpdateUser_Equal(fRES(updateUser));
    }

    protected void doSetUpdateUser_Equal(String updateUser) {
        regUpdateUser(CK_EQ, updateUser);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * update_user: {NotNull, varchar(200)}
     * @param updateUser The value of updateUser as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateUser_NotEqual(String updateUser) {
        doSetUpdateUser_NotEqual(fRES(updateUser));
    }

    protected void doSetUpdateUser_NotEqual(String updateUser) {
        regUpdateUser(CK_NES, updateUser);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * update_user: {NotNull, varchar(200)}
     * @param updateUserList The collection of updateUser as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateUser_InScope(Collection<String> updateUserList) {
        doSetUpdateUser_InScope(updateUserList);
    }

    protected void doSetUpdateUser_InScope(Collection<String> updateUserList) {
        regINS(CK_INS, cTL(updateUserList), xgetCValueUpdateUser(), "update_user");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * update_user: {NotNull, varchar(200)}
     * @param updateUserList The collection of updateUser as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateUser_NotInScope(Collection<String> updateUserList) {
        doSetUpdateUser_NotInScope(updateUserList);
    }

    protected void doSetUpdateUser_NotInScope(Collection<String> updateUserList) {
        regINS(CK_NINS, cTL(updateUserList), xgetCValueUpdateUser(), "update_user");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * update_user: {NotNull, varchar(200)} <br>
     * <pre>e.g. setUpdateUser_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param updateUser The value of updateUser as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUpdateUser_LikeSearch(String updateUser, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUpdateUser_LikeSearch(updateUser, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * update_user: {NotNull, varchar(200)} <br>
     * <pre>e.g. setUpdateUser_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param updateUser The value of updateUser as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setUpdateUser_LikeSearch(String updateUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(updateUser), xgetCValueUpdateUser(), "update_user", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * update_user: {NotNull, varchar(200)}
     * @param updateUser The value of updateUser as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUpdateUser_NotLikeSearch(String updateUser, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUpdateUser_NotLikeSearch(updateUser, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * update_user: {NotNull, varchar(200)}
     * @param updateUser The value of updateUser as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setUpdateUser_NotLikeSearch(String updateUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(updateUser), xgetCValueUpdateUser(), "update_user", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * update_user: {NotNull, varchar(200)}
     * @param updateUser The value of updateUser as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdateUser_PrefixSearch(String updateUser) {
        setUpdateUser_LikeSearch(updateUser, xcLSOPPre());
    }

    protected void regUpdateUser(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdateUser(), "update_user"); }
    protected abstract ConditionValue xgetCValueUpdateUser();

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
    public HpSLCFunction<PurchasePaymentCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, PurchasePaymentCB.class);
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
    public HpSLCFunction<PurchasePaymentCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, PurchasePaymentCB.class);
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
    public HpSLCFunction<PurchasePaymentCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, PurchasePaymentCB.class);
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
    public HpSLCFunction<PurchasePaymentCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, PurchasePaymentCB.class);
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
    public HpSLCFunction<PurchasePaymentCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, PurchasePaymentCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;PurchasePaymentCB&gt;() {
     *     public void query(PurchasePaymentCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<PurchasePaymentCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, PurchasePaymentCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        PurchasePaymentCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(PurchasePaymentCQ sq);

    protected PurchasePaymentCB xcreateScalarConditionCB() {
        PurchasePaymentCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected PurchasePaymentCB xcreateScalarConditionPartitionByCB() {
        PurchasePaymentCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<PurchasePaymentCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PurchasePaymentCB cb = new PurchasePaymentCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "purchase_payment_id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(PurchasePaymentCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<PurchasePaymentCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(PurchasePaymentCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PurchasePaymentCB cb = new PurchasePaymentCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "purchase_payment_id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(PurchasePaymentCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<PurchasePaymentCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PurchasePaymentCB cb = new PurchasePaymentCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(PurchasePaymentCQ sq);

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
    protected PurchasePaymentCB newMyCB() {
        return new PurchasePaymentCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return PurchasePaymentCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
