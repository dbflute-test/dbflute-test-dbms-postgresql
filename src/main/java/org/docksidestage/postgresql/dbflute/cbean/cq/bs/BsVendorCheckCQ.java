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
 * The base condition-query of vendor_check.
 * @author DBFlute(AutoGenerator)
 */
public class BsVendorCheckCQ extends AbstractBsVendorCheckCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected VendorCheckCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsVendorCheckCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from vendor_check) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public VendorCheckCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected VendorCheckCIQ xcreateCIQ() {
        VendorCheckCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected VendorCheckCIQ xnewCIQ() {
        return new VendorCheckCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join vendor_check on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public VendorCheckCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        VendorCheckCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _vendorCheckId;
    public ConditionValue xdfgetVendorCheckId()
    { if (_vendorCheckId == null) { _vendorCheckId = nCV(); }
      return _vendorCheckId; }
    protected ConditionValue xgetCValueVendorCheckId() { return xdfgetVendorCheckId(); }

    /**
     * Add order-by as ascend. <br>
     * vendor_check_id: {PK, NotNull, numeric(16)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_VendorCheckId_Asc() { regOBA("vendor_check_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * vendor_check_id: {PK, NotNull, numeric(16)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_VendorCheckId_Desc() { regOBD("vendor_check_id"); return this; }

    protected ConditionValue _typeOfChar;
    public ConditionValue xdfgetTypeOfChar()
    { if (_typeOfChar == null) { _typeOfChar = nCV(); }
      return _typeOfChar; }
    protected ConditionValue xgetCValueTypeOfChar() { return xdfgetTypeOfChar(); }

    /**
     * Add order-by as ascend. <br>
     * type_of_char: {bpchar(3)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfChar_Asc() { regOBA("type_of_char"); return this; }

    /**
     * Add order-by as descend. <br>
     * type_of_char: {bpchar(3)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfChar_Desc() { regOBD("type_of_char"); return this; }

    protected ConditionValue _typeOfVarchar;
    public ConditionValue xdfgetTypeOfVarchar()
    { if (_typeOfVarchar == null) { _typeOfVarchar = nCV(); }
      return _typeOfVarchar; }
    protected ConditionValue xgetCValueTypeOfVarchar() { return xdfgetTypeOfVarchar(); }

    /**
     * Add order-by as ascend. <br>
     * type_of_varchar: {varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfVarchar_Asc() { regOBA("type_of_varchar"); return this; }

    /**
     * Add order-by as descend. <br>
     * type_of_varchar: {varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfVarchar_Desc() { regOBD("type_of_varchar"); return this; }

    protected ConditionValue _typeOfVcArray;
    public ConditionValue xdfgetTypeOfVcArray()
    { if (_typeOfVcArray == null) { _typeOfVcArray = nCV(); }
      return _typeOfVcArray; }
    protected ConditionValue xgetCValueTypeOfVcArray() { return xdfgetTypeOfVcArray(); }

    /**
     * Add order-by as ascend. <br>
     * type_of_vc_array: {_varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfVcArray_Asc() { regOBA("type_of_vc_array"); return this; }

    /**
     * Add order-by as descend. <br>
     * type_of_vc_array: {_varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfVcArray_Desc() { regOBD("type_of_vc_array"); return this; }

    protected ConditionValue _typeOfText;
    public ConditionValue xdfgetTypeOfText()
    { if (_typeOfText == null) { _typeOfText = nCV(); }
      return _typeOfText; }
    protected ConditionValue xgetCValueTypeOfText() { return xdfgetTypeOfText(); }

    /**
     * Add order-by as ascend. <br>
     * type_of_text: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfText_Asc() { regOBA("type_of_text"); return this; }

    /**
     * Add order-by as descend. <br>
     * type_of_text: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfText_Desc() { regOBD("type_of_text"); return this; }

    protected ConditionValue _typeOfNumericInteger;
    public ConditionValue xdfgetTypeOfNumericInteger()
    { if (_typeOfNumericInteger == null) { _typeOfNumericInteger = nCV(); }
      return _typeOfNumericInteger; }
    protected ConditionValue xgetCValueTypeOfNumericInteger() { return xdfgetTypeOfNumericInteger(); }

    /**
     * Add order-by as ascend. <br>
     * type_of_numeric_integer: {numeric(5)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumericInteger_Asc() { regOBA("type_of_numeric_integer"); return this; }

    /**
     * Add order-by as descend. <br>
     * type_of_numeric_integer: {numeric(5)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumericInteger_Desc() { regOBD("type_of_numeric_integer"); return this; }

    protected ConditionValue _typeOfNumericBigint;
    public ConditionValue xdfgetTypeOfNumericBigint()
    { if (_typeOfNumericBigint == null) { _typeOfNumericBigint = nCV(); }
      return _typeOfNumericBigint; }
    protected ConditionValue xgetCValueTypeOfNumericBigint() { return xdfgetTypeOfNumericBigint(); }

    /**
     * Add order-by as ascend. <br>
     * type_of_numeric_bigint: {numeric(12)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumericBigint_Asc() { regOBA("type_of_numeric_bigint"); return this; }

    /**
     * Add order-by as descend. <br>
     * type_of_numeric_bigint: {numeric(12)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumericBigint_Desc() { regOBD("type_of_numeric_bigint"); return this; }

    protected ConditionValue _typeOfNumericDecimal;
    public ConditionValue xdfgetTypeOfNumericDecimal()
    { if (_typeOfNumericDecimal == null) { _typeOfNumericDecimal = nCV(); }
      return _typeOfNumericDecimal; }
    protected ConditionValue xgetCValueTypeOfNumericDecimal() { return xdfgetTypeOfNumericDecimal(); }

    /**
     * Add order-by as ascend. <br>
     * type_of_numeric_decimal: {numeric(5, 3)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumericDecimal_Asc() { regOBA("type_of_numeric_decimal"); return this; }

    /**
     * Add order-by as descend. <br>
     * type_of_numeric_decimal: {numeric(5, 3)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfNumericDecimal_Desc() { regOBD("type_of_numeric_decimal"); return this; }

    protected ConditionValue _typeOfDecimal;
    public ConditionValue xdfgetTypeOfDecimal()
    { if (_typeOfDecimal == null) { _typeOfDecimal = nCV(); }
      return _typeOfDecimal; }
    protected ConditionValue xgetCValueTypeOfDecimal() { return xdfgetTypeOfDecimal(); }

    /**
     * Add order-by as ascend. <br>
     * type_of_decimal: {numeric(131089)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfDecimal_Asc() { regOBA("type_of_decimal"); return this; }

    /**
     * Add order-by as descend. <br>
     * type_of_decimal: {numeric(131089)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfDecimal_Desc() { regOBD("type_of_decimal"); return this; }

    protected ConditionValue _typeOfInt;
    public ConditionValue xdfgetTypeOfInt()
    { if (_typeOfInt == null) { _typeOfInt = nCV(); }
      return _typeOfInt; }
    protected ConditionValue xgetCValueTypeOfInt() { return xdfgetTypeOfInt(); }

    /**
     * Add order-by as ascend. <br>
     * type_of_int: {int4(10)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfInt_Asc() { regOBA("type_of_int"); return this; }

    /**
     * Add order-by as descend. <br>
     * type_of_int: {int4(10)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfInt_Desc() { regOBD("type_of_int"); return this; }

    protected ConditionValue _typeOfIntArray;
    public ConditionValue xdfgetTypeOfIntArray()
    { if (_typeOfIntArray == null) { _typeOfIntArray = nCV(); }
      return _typeOfIntArray; }
    protected ConditionValue xgetCValueTypeOfIntArray() { return xdfgetTypeOfIntArray(); }

    /**
     * Add order-by as ascend. <br>
     * type_of_int_array: {_int4(10)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfIntArray_Asc() { regOBA("type_of_int_array"); return this; }

    /**
     * Add order-by as descend. <br>
     * type_of_int_array: {_int4(10)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfIntArray_Desc() { regOBD("type_of_int_array"); return this; }

    protected ConditionValue _typeOfInt4;
    public ConditionValue xdfgetTypeOfInt4()
    { if (_typeOfInt4 == null) { _typeOfInt4 = nCV(); }
      return _typeOfInt4; }
    protected ConditionValue xgetCValueTypeOfInt4() { return xdfgetTypeOfInt4(); }

    /**
     * Add order-by as ascend. <br>
     * type_of_int4: {int4(10)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfInt4_Asc() { regOBA("type_of_int4"); return this; }

    /**
     * Add order-by as descend. <br>
     * type_of_int4: {int4(10)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfInt4_Desc() { regOBD("type_of_int4"); return this; }

    protected ConditionValue _typeOfInt4Array;
    public ConditionValue xdfgetTypeOfInt4Array()
    { if (_typeOfInt4Array == null) { _typeOfInt4Array = nCV(); }
      return _typeOfInt4Array; }
    protected ConditionValue xgetCValueTypeOfInt4Array() { return xdfgetTypeOfInt4Array(); }

    /**
     * Add order-by as ascend. <br>
     * type_of_int4_array: {_int4(10)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfInt4Array_Asc() { regOBA("type_of_int4_array"); return this; }

    /**
     * Add order-by as descend. <br>
     * type_of_int4_array: {_int4(10)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfInt4Array_Desc() { regOBD("type_of_int4_array"); return this; }

    protected ConditionValue _typeOfInt8;
    public ConditionValue xdfgetTypeOfInt8()
    { if (_typeOfInt8 == null) { _typeOfInt8 = nCV(); }
      return _typeOfInt8; }
    protected ConditionValue xgetCValueTypeOfInt8() { return xdfgetTypeOfInt8(); }

    /**
     * Add order-by as ascend. <br>
     * type_of_int8: {int8(19)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfInt8_Asc() { regOBA("type_of_int8"); return this; }

    /**
     * Add order-by as descend. <br>
     * type_of_int8: {int8(19)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfInt8_Desc() { regOBD("type_of_int8"); return this; }

    protected ConditionValue _typeOfInt8Array;
    public ConditionValue xdfgetTypeOfInt8Array()
    { if (_typeOfInt8Array == null) { _typeOfInt8Array = nCV(); }
      return _typeOfInt8Array; }
    protected ConditionValue xgetCValueTypeOfInt8Array() { return xdfgetTypeOfInt8Array(); }

    /**
     * Add order-by as ascend. <br>
     * type_of_int8_array: {_int8(19)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfInt8Array_Asc() { regOBA("type_of_int8_array"); return this; }

    /**
     * Add order-by as descend. <br>
     * type_of_int8_array: {_int8(19)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfInt8Array_Desc() { regOBD("type_of_int8_array"); return this; }

    protected ConditionValue _typeOfBigint;
    public ConditionValue xdfgetTypeOfBigint()
    { if (_typeOfBigint == null) { _typeOfBigint = nCV(); }
      return _typeOfBigint; }
    protected ConditionValue xgetCValueTypeOfBigint() { return xdfgetTypeOfBigint(); }

    /**
     * Add order-by as ascend. <br>
     * type_of_bigint: {int8(19)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfBigint_Asc() { regOBA("type_of_bigint"); return this; }

    /**
     * Add order-by as descend. <br>
     * type_of_bigint: {int8(19)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfBigint_Desc() { regOBD("type_of_bigint"); return this; }

    protected ConditionValue _typeOfReal;
    public ConditionValue xdfgetTypeOfReal()
    { if (_typeOfReal == null) { _typeOfReal = nCV(); }
      return _typeOfReal; }
    protected ConditionValue xgetCValueTypeOfReal() { return xdfgetTypeOfReal(); }

    /**
     * Add order-by as ascend. <br>
     * type_of_real: {float4(8, 8)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfReal_Asc() { regOBA("type_of_real"); return this; }

    /**
     * Add order-by as descend. <br>
     * type_of_real: {float4(8, 8)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfReal_Desc() { regOBD("type_of_real"); return this; }

    protected ConditionValue _typeOfFloat;
    public ConditionValue xdfgetTypeOfFloat()
    { if (_typeOfFloat == null) { _typeOfFloat = nCV(); }
      return _typeOfFloat; }
    protected ConditionValue xgetCValueTypeOfFloat() { return xdfgetTypeOfFloat(); }

    /**
     * Add order-by as ascend. <br>
     * type_of_float: {float8(17, 17)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfFloat_Asc() { regOBA("type_of_float"); return this; }

    /**
     * Add order-by as descend. <br>
     * type_of_float: {float8(17, 17)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfFloat_Desc() { regOBD("type_of_float"); return this; }

    protected ConditionValue _typeOfMoney;
    public ConditionValue xdfgetTypeOfMoney()
    { if (_typeOfMoney == null) { _typeOfMoney = nCV(); }
      return _typeOfMoney; }
    protected ConditionValue xgetCValueTypeOfMoney() { return xdfgetTypeOfMoney(); }

    /**
     * Add order-by as ascend. <br>
     * type_of_money: {money(2147483647)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfMoney_Asc() { regOBA("type_of_money"); return this; }

    /**
     * Add order-by as descend. <br>
     * type_of_money: {money(2147483647)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfMoney_Desc() { regOBD("type_of_money"); return this; }

    protected ConditionValue _typeOfDate;
    public ConditionValue xdfgetTypeOfDate()
    { if (_typeOfDate == null) { _typeOfDate = nCV(); }
      return _typeOfDate; }
    protected ConditionValue xgetCValueTypeOfDate() { return xdfgetTypeOfDate(); }

    /**
     * Add order-by as ascend. <br>
     * type_of_date: {date(13)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfDate_Asc() { regOBA("type_of_date"); return this; }

    /**
     * Add order-by as descend. <br>
     * type_of_date: {date(13)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfDate_Desc() { regOBD("type_of_date"); return this; }

    protected ConditionValue _typeOfTimestamp;
    public ConditionValue xdfgetTypeOfTimestamp()
    { if (_typeOfTimestamp == null) { _typeOfTimestamp = nCV(); }
      return _typeOfTimestamp; }
    protected ConditionValue xgetCValueTypeOfTimestamp() { return xdfgetTypeOfTimestamp(); }

    /**
     * Add order-by as ascend. <br>
     * type_of_timestamp: {timestamp(29, 6)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfTimestamp_Asc() { regOBA("type_of_timestamp"); return this; }

    /**
     * Add order-by as descend. <br>
     * type_of_timestamp: {timestamp(29, 6)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfTimestamp_Desc() { regOBD("type_of_timestamp"); return this; }

    protected ConditionValue _typeOfTime;
    public ConditionValue xdfgetTypeOfTime()
    { if (_typeOfTime == null) { _typeOfTime = nCV(); }
      return _typeOfTime; }
    protected ConditionValue xgetCValueTypeOfTime() { return xdfgetTypeOfTime(); }

    /**
     * Add order-by as ascend. <br>
     * type_of_time: {time(15, 6)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfTime_Asc() { regOBA("type_of_time"); return this; }

    /**
     * Add order-by as descend. <br>
     * type_of_time: {time(15, 6)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfTime_Desc() { regOBD("type_of_time"); return this; }

    protected ConditionValue _typeOfTimetz;
    public ConditionValue xdfgetTypeOfTimetz()
    { if (_typeOfTimetz == null) { _typeOfTimetz = nCV(); }
      return _typeOfTimetz; }
    protected ConditionValue xgetCValueTypeOfTimetz() { return xdfgetTypeOfTimetz(); }

    /**
     * Add order-by as ascend. <br>
     * type_of_timetz: {timetz(21, 6)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfTimetz_Asc() { regOBA("type_of_timetz"); return this; }

    /**
     * Add order-by as descend. <br>
     * type_of_timetz: {timetz(21, 6)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfTimetz_Desc() { regOBD("type_of_timetz"); return this; }

    protected ConditionValue _typeOfInterval;
    public ConditionValue xdfgetTypeOfInterval()
    { if (_typeOfInterval == null) { _typeOfInterval = nCV(); }
      return _typeOfInterval; }
    protected ConditionValue xgetCValueTypeOfInterval() { return xdfgetTypeOfInterval(); }

    /**
     * Add order-by as ascend. <br>
     * type_of_interval: {interval(49, 6)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfInterval_Asc() { regOBA("type_of_interval"); return this; }

    /**
     * Add order-by as descend. <br>
     * type_of_interval: {interval(49, 6)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfInterval_Desc() { regOBD("type_of_interval"); return this; }

    protected ConditionValue _typeOfBool;
    public ConditionValue xdfgetTypeOfBool()
    { if (_typeOfBool == null) { _typeOfBool = nCV(); }
      return _typeOfBool; }
    protected ConditionValue xgetCValueTypeOfBool() { return xdfgetTypeOfBool(); }

    /**
     * Add order-by as ascend. <br>
     * type_of_bool: {bool(1), classification=TrueFalse}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfBool_Asc() { regOBA("type_of_bool"); return this; }

    /**
     * Add order-by as descend. <br>
     * type_of_bool: {bool(1), classification=TrueFalse}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfBool_Desc() { regOBD("type_of_bool"); return this; }

    protected ConditionValue _typeOfBit;
    public ConditionValue xdfgetTypeOfBit()
    { if (_typeOfBit == null) { _typeOfBit = nCV(); }
      return _typeOfBit; }
    protected ConditionValue xgetCValueTypeOfBit() { return xdfgetTypeOfBit(); }

    /**
     * Add order-by as ascend. <br>
     * type_of_bit: {bit(1)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfBit_Asc() { regOBA("type_of_bit"); return this; }

    /**
     * Add order-by as descend. <br>
     * type_of_bit: {bit(1)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfBit_Desc() { regOBD("type_of_bit"); return this; }

    protected ConditionValue _typeOfBytea;
    public ConditionValue xdfgetTypeOfBytea()
    { if (_typeOfBytea == null) { _typeOfBytea = nCV(); }
      return _typeOfBytea; }
    protected ConditionValue xgetCValueTypeOfBytea() { return xdfgetTypeOfBytea(); }

    /**
     * Add order-by as ascend. <br>
     * type_of_bytea: {bytea(2147483647)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfBytea_Asc() { regOBA("type_of_bytea"); return this; }

    /**
     * Add order-by as descend. <br>
     * type_of_bytea: {bytea(2147483647)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfBytea_Desc() { regOBD("type_of_bytea"); return this; }

    protected ConditionValue _typeOfOid;
    public ConditionValue xdfgetTypeOfOid()
    { if (_typeOfOid == null) { _typeOfOid = nCV(); }
      return _typeOfOid; }
    protected ConditionValue xgetCValueTypeOfOid() { return xdfgetTypeOfOid(); }

    /**
     * Add order-by as ascend. <br>
     * type_of_oid: {oid(10)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfOid_Asc() { regOBA("type_of_oid"); return this; }

    /**
     * Add order-by as descend. <br>
     * type_of_oid: {oid(10)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfOid_Desc() { regOBD("type_of_oid"); return this; }

    protected ConditionValue _typeOfUuid;
    public ConditionValue xdfgetTypeOfUuid()
    { if (_typeOfUuid == null) { _typeOfUuid = nCV(); }
      return _typeOfUuid; }
    protected ConditionValue xgetCValueTypeOfUuid() { return xdfgetTypeOfUuid(); }

    /**
     * Add order-by as ascend. <br>
     * type_of_uuid: {uuid(2147483647)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfUuid_Asc() { regOBA("type_of_uuid"); return this; }

    /**
     * Add order-by as descend. <br>
     * type_of_uuid: {uuid(2147483647)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfUuid_Desc() { regOBD("type_of_uuid"); return this; }

    protected ConditionValue _typeOfXml;
    public ConditionValue xdfgetTypeOfXml()
    { if (_typeOfXml == null) { _typeOfXml = nCV(); }
      return _typeOfXml; }
    protected ConditionValue xgetCValueTypeOfXml() { return xdfgetTypeOfXml(); }

    /**
     * Add order-by as ascend. <br>
     * type_of_xml: {xml(2147483647)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfXml_Asc() { regOBA("type_of_xml"); return this; }

    /**
     * Add order-by as descend. <br>
     * type_of_xml: {xml(2147483647)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfXml_Desc() { regOBD("type_of_xml"); return this; }

    protected ConditionValue _typeOfJson;
    public ConditionValue xdfgetTypeOfJson()
    { if (_typeOfJson == null) { _typeOfJson = nCV(); }
      return _typeOfJson; }
    protected ConditionValue xgetCValueTypeOfJson() { return xdfgetTypeOfJson(); }

    /**
     * Add order-by as ascend. <br>
     * type_of_json: {json(2147483647)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfJson_Asc() { regOBA("type_of_json"); return this; }

    /**
     * Add order-by as descend. <br>
     * type_of_json: {json(2147483647)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfJson_Desc() { regOBD("type_of_json"); return this; }

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
    public BsVendorCheckCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsVendorCheckCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, VendorCheckCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(VendorCheckCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, VendorCheckCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(VendorCheckCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, VendorCheckCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(VendorCheckCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, VendorCheckCQ> _myselfExistsMap;
    public Map<String, VendorCheckCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(VendorCheckCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, VendorCheckCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(VendorCheckCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return VendorCheckCB.class.getName(); }
    protected String xCQ() { return VendorCheckCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
