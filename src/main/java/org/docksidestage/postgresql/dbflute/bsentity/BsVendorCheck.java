package org.docksidestage.postgresql.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.dbmeta.accessory.MappingValueType;
import org.docksidestage.postgresql.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.postgresql.dbflute.allcommon.CDef;
import org.docksidestage.postgresql.dbflute.exentity.*;

/**
 * The entity of vendor_check as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendorCheck extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** vendor_check_id: {PK, NotNull, numeric(16)} */
    protected Long _vendorCheckId;

    /** type_of_char: {bpchar(3)} */
    protected String _typeOfChar;

    /** type_of_varchar: {varchar(2147483647)} */
    protected String _typeOfVarchar;

    /** type_of_vc_array: {_varchar(2147483647)} */
    protected org.docksidestage.postgresql.mytype.MyArray _typeOfVcArray;

    /** type_of_text: {text(2147483647)} */
    protected String _typeOfText;

    /** type_of_numeric_integer: {numeric(5)} */
    protected Integer _typeOfNumericInteger;

    /** type_of_numeric_bigint: {numeric(12)} */
    protected Long _typeOfNumericBigint;

    /** type_of_numeric_decimal: {numeric(5, 3)} */
    protected java.math.BigDecimal _typeOfNumericDecimal;

    /** type_of_decimal: {numeric(131089)} */
    protected java.math.BigDecimal _typeOfDecimal;

    /** type_of_int: {int4(10)} */
    protected Integer _typeOfInt;

    /** type_of_int_array: {_int4(10)} */
    protected org.docksidestage.postgresql.mytype.MyArray _typeOfIntArray;

    /** type_of_int4: {int4(10)} */
    protected Integer _typeOfInt4;

    /** type_of_int4_array: {_int4(10)} */
    protected org.docksidestage.postgresql.mytype.MyArray _typeOfInt4Array;

    /** type_of_int8: {int8(19)} */
    protected Long _typeOfInt8;

    /** type_of_int8_array: {_int8(19)} */
    protected org.docksidestage.postgresql.mytype.MyArray _typeOfInt8Array;

    /** type_of_bigint: {int8(19)} */
    protected Long _typeOfBigint;

    /** type_of_real: {float4(8, 8)} */
    protected java.math.BigDecimal _typeOfReal;

    /** type_of_float: {float8(17, 17)} */
    protected java.math.BigDecimal _typeOfFloat;

    /** type_of_money: {money(2147483647)} */
    protected java.math.BigDecimal _typeOfMoney;

    /** type_of_date: {date(13)} */
    protected java.time.LocalDate _typeOfDate;

    /** type_of_timestamp: {timestamp(29, 6)} */
    protected java.time.LocalDateTime _typeOfTimestamp;

    /** type_of_time: {time(15, 6)} */
    protected java.time.LocalTime _typeOfTime;

    /** type_of_timetz: {timetz(21, 6)} */
    protected java.time.LocalTime _typeOfTimetz;

    /** type_of_interval: {interval(49, 6)} */
    protected String _typeOfInterval;

    /** type_of_bool: {bool(1), classification=TrueFalse} */
    protected Boolean _typeOfBool;

    /** type_of_bit: {bit(1)} */
    protected Boolean _typeOfBit;

    /** type_of_bytea: {bytea(2147483647)} */
    protected byte[] _typeOfBytea;

    /** type_of_oid: {oid(10)} */
    protected byte[] _typeOfOid;

    /** type_of_uuid: {uuid(2147483647)} */
    protected java.util.UUID _typeOfUuid;

    /** type_of_xml: {xml(2147483647)} */
    protected org.docksidestage.postgresql.mytype.MyXML _typeOfXml;

    /** type_of_json: {json(2147483647)} */
    protected org.docksidestage.postgresql.mytype.MyJSON _typeOfJson;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "vendor_check";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_vendorCheckId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of typeOfBool as the classification of TrueFalse. <br>
     * type_of_bool: {bool(1), classification=TrueFalse} <br>
     * boolean type classification
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.TrueFalse getTypeOfBoolAsTrueFalse() {
        return CDef.TrueFalse.of(getTypeOfBool()).orElse(null);
    }

    /**
     * Set the value of typeOfBool as the classification of TrueFalse. <br>
     * type_of_bool: {bool(1), classification=TrueFalse} <br>
     * boolean type classification
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setTypeOfBoolAsTrueFalse(CDef.TrueFalse cdef) {
        setTypeOfBool(cdef != null ? toBoolean(cdef.code()) : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of typeOfBool as True (true). <br>
     * Yes: means valid
     */
    public void setTypeOfBool_True() {
        setTypeOfBoolAsTrueFalse(CDef.TrueFalse.True);
    }

    /**
     * Set the value of typeOfBool as False (false). <br>
     * No: means invalid
     */
    public void setTypeOfBool_False() {
        setTypeOfBoolAsTrueFalse(CDef.TrueFalse.False);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of typeOfBool True? <br>
     * Yes: means valid
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTypeOfBoolTrue() {
        CDef.TrueFalse cdef = getTypeOfBoolAsTrueFalse();
        return cdef != null ? cdef.equals(CDef.TrueFalse.True) : false;
    }

    /**
     * Is the value of typeOfBool False? <br>
     * No: means invalid
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTypeOfBoolFalse() {
        CDef.TrueFalse cdef = getTypeOfBoolAsTrueFalse();
        return cdef != null ? cdef.equals(CDef.TrueFalse.False) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'typeOfBool' as classification alias.
     * @return The string of classification alias. (NullAllowed: when the column value is null)
     */
    public String getTypeOfBoolAlias() {
        CDef.TrueFalse cdef = getTypeOfBoolAsTrueFalse();
        return cdef != null ? cdef.alias() : null;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsVendorCheck) {
            BsVendorCheck other = (BsVendorCheck)obj;
            if (!xSV(_vendorCheckId, other._vendorCheckId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _vendorCheckId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_vendorCheckId));
        sb.append(dm).append(xfND(_typeOfChar));
        sb.append(dm).append(xfND(_typeOfVarchar));
        sb.append(dm).append(xfND(_typeOfVcArray));
        sb.append(dm).append(xfND(_typeOfText));
        sb.append(dm).append(xfND(_typeOfNumericInteger));
        sb.append(dm).append(xfND(_typeOfNumericBigint));
        sb.append(dm).append(xfND(_typeOfNumericDecimal));
        sb.append(dm).append(xfND(_typeOfDecimal));
        sb.append(dm).append(xfND(_typeOfInt));
        sb.append(dm).append(xfND(_typeOfIntArray));
        sb.append(dm).append(xfND(_typeOfInt4));
        sb.append(dm).append(xfND(_typeOfInt4Array));
        sb.append(dm).append(xfND(_typeOfInt8));
        sb.append(dm).append(xfND(_typeOfInt8Array));
        sb.append(dm).append(xfND(_typeOfBigint));
        sb.append(dm).append(xfND(_typeOfReal));
        sb.append(dm).append(xfND(_typeOfFloat));
        sb.append(dm).append(xfND(_typeOfMoney));
        sb.append(dm).append(xfND(_typeOfDate));
        sb.append(dm).append(xfND(_typeOfTimestamp));
        sb.append(dm).append(xfND(_typeOfTime));
        sb.append(dm).append(xfND(_typeOfTimetz));
        sb.append(dm).append(xfND(_typeOfInterval));
        sb.append(dm).append(xfND(_typeOfBool));
        sb.append(dm).append(xfND(_typeOfBit));
        sb.append(dm).append(xfBA(_typeOfBytea));
        sb.append(dm).append(xfBA(_typeOfOid));
        sb.append(dm).append(xfND(_typeOfUuid));
        sb.append(dm).append(xfND(_typeOfXml));
        sb.append(dm).append(xfND(_typeOfJson));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public VendorCheck clone() {
        return (VendorCheck)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] vendor_check_id: {PK, NotNull, numeric(16)} <br>
     * @return The value of the column 'vendor_check_id'. (basically NotNull if selected: for the constraint)
     */
    public Long getVendorCheckId() {
        checkSpecifiedProperty("vendorCheckId");
        return _vendorCheckId;
    }

    /**
     * [set] vendor_check_id: {PK, NotNull, numeric(16)} <br>
     * @param vendorCheckId The value of the column 'vendor_check_id'. (basically NotNull if update: for the constraint)
     */
    public void setVendorCheckId(Long vendorCheckId) {
        registerModifiedProperty("vendorCheckId");
        _vendorCheckId = vendorCheckId;
    }

    /**
     * [get] type_of_char: {bpchar(3)} <br>
     * @return The value of the column 'type_of_char'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfChar() {
        checkSpecifiedProperty("typeOfChar");
        return _typeOfChar;
    }

    /**
     * [set] type_of_char: {bpchar(3)} <br>
     * @param typeOfChar The value of the column 'type_of_char'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfChar(String typeOfChar) {
        registerModifiedProperty("typeOfChar");
        _typeOfChar = typeOfChar;
    }

    /**
     * [get] type_of_varchar: {varchar(2147483647)} <br>
     * @return The value of the column 'type_of_varchar'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfVarchar() {
        checkSpecifiedProperty("typeOfVarchar");
        return _typeOfVarchar;
    }

    /**
     * [set] type_of_varchar: {varchar(2147483647)} <br>
     * @param typeOfVarchar The value of the column 'type_of_varchar'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfVarchar(String typeOfVarchar) {
        registerModifiedProperty("typeOfVarchar");
        _typeOfVarchar = typeOfVarchar;
    }

    /**
     * [get] type_of_vc_array: {_varchar(2147483647)} <br>
     * @return The value of the column 'type_of_vc_array'. (NullAllowed even if selected: for no constraint)
     */
    public org.docksidestage.postgresql.mytype.MyArray getTypeOfVcArray() {
        checkSpecifiedProperty("typeOfVcArray");
        return _typeOfVcArray;
    }

    /**
     * [set] type_of_vc_array: {_varchar(2147483647)} <br>
     * @param typeOfVcArray The value of the column 'type_of_vc_array'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfVcArray(org.docksidestage.postgresql.mytype.MyArray typeOfVcArray) {
        registerModifiedProperty("typeOfVcArray");
        _typeOfVcArray = typeOfVcArray;
    }

    /**
     * [get] type_of_text: {text(2147483647)} <br>
     * @return The value of the column 'type_of_text'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfText() {
        checkSpecifiedProperty("typeOfText");
        return _typeOfText;
    }

    /**
     * [set] type_of_text: {text(2147483647)} <br>
     * @param typeOfText The value of the column 'type_of_text'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfText(String typeOfText) {
        registerModifiedProperty("typeOfText");
        _typeOfText = typeOfText;
    }

    /**
     * [get] type_of_numeric_integer: {numeric(5)} <br>
     * @return The value of the column 'type_of_numeric_integer'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getTypeOfNumericInteger() {
        checkSpecifiedProperty("typeOfNumericInteger");
        return _typeOfNumericInteger;
    }

    /**
     * [set] type_of_numeric_integer: {numeric(5)} <br>
     * @param typeOfNumericInteger The value of the column 'type_of_numeric_integer'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfNumericInteger(Integer typeOfNumericInteger) {
        registerModifiedProperty("typeOfNumericInteger");
        _typeOfNumericInteger = typeOfNumericInteger;
    }

    /**
     * [get] type_of_numeric_bigint: {numeric(12)} <br>
     * @return The value of the column 'type_of_numeric_bigint'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTypeOfNumericBigint() {
        checkSpecifiedProperty("typeOfNumericBigint");
        return _typeOfNumericBigint;
    }

    /**
     * [set] type_of_numeric_bigint: {numeric(12)} <br>
     * @param typeOfNumericBigint The value of the column 'type_of_numeric_bigint'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfNumericBigint(Long typeOfNumericBigint) {
        registerModifiedProperty("typeOfNumericBigint");
        _typeOfNumericBigint = typeOfNumericBigint;
    }

    /**
     * [get] type_of_numeric_decimal: {numeric(5, 3)} <br>
     * @return The value of the column 'type_of_numeric_decimal'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTypeOfNumericDecimal() {
        checkSpecifiedProperty("typeOfNumericDecimal");
        return _typeOfNumericDecimal;
    }

    /**
     * [set] type_of_numeric_decimal: {numeric(5, 3)} <br>
     * @param typeOfNumericDecimal The value of the column 'type_of_numeric_decimal'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfNumericDecimal(java.math.BigDecimal typeOfNumericDecimal) {
        registerModifiedProperty("typeOfNumericDecimal");
        _typeOfNumericDecimal = typeOfNumericDecimal;
    }

    /**
     * [get] type_of_decimal: {numeric(131089)} <br>
     * @return The value of the column 'type_of_decimal'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTypeOfDecimal() {
        checkSpecifiedProperty("typeOfDecimal");
        return _typeOfDecimal;
    }

    /**
     * [set] type_of_decimal: {numeric(131089)} <br>
     * @param typeOfDecimal The value of the column 'type_of_decimal'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfDecimal(java.math.BigDecimal typeOfDecimal) {
        registerModifiedProperty("typeOfDecimal");
        _typeOfDecimal = typeOfDecimal;
    }

    /**
     * [get] type_of_int: {int4(10)} <br>
     * @return The value of the column 'type_of_int'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getTypeOfInt() {
        checkSpecifiedProperty("typeOfInt");
        return _typeOfInt;
    }

    /**
     * [set] type_of_int: {int4(10)} <br>
     * @param typeOfInt The value of the column 'type_of_int'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfInt(Integer typeOfInt) {
        registerModifiedProperty("typeOfInt");
        _typeOfInt = typeOfInt;
    }

    /**
     * [get] type_of_int_array: {_int4(10)} <br>
     * @return The value of the column 'type_of_int_array'. (NullAllowed even if selected: for no constraint)
     */
    public org.docksidestage.postgresql.mytype.MyArray getTypeOfIntArray() {
        checkSpecifiedProperty("typeOfIntArray");
        return _typeOfIntArray;
    }

    /**
     * [set] type_of_int_array: {_int4(10)} <br>
     * @param typeOfIntArray The value of the column 'type_of_int_array'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfIntArray(org.docksidestage.postgresql.mytype.MyArray typeOfIntArray) {
        registerModifiedProperty("typeOfIntArray");
        _typeOfIntArray = typeOfIntArray;
    }

    /**
     * [get] type_of_int4: {int4(10)} <br>
     * @return The value of the column 'type_of_int4'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getTypeOfInt4() {
        checkSpecifiedProperty("typeOfInt4");
        return _typeOfInt4;
    }

    /**
     * [set] type_of_int4: {int4(10)} <br>
     * @param typeOfInt4 The value of the column 'type_of_int4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfInt4(Integer typeOfInt4) {
        registerModifiedProperty("typeOfInt4");
        _typeOfInt4 = typeOfInt4;
    }

    /**
     * [get] type_of_int4_array: {_int4(10)} <br>
     * @return The value of the column 'type_of_int4_array'. (NullAllowed even if selected: for no constraint)
     */
    public org.docksidestage.postgresql.mytype.MyArray getTypeOfInt4Array() {
        checkSpecifiedProperty("typeOfInt4Array");
        return _typeOfInt4Array;
    }

    /**
     * [set] type_of_int4_array: {_int4(10)} <br>
     * @param typeOfInt4Array The value of the column 'type_of_int4_array'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfInt4Array(org.docksidestage.postgresql.mytype.MyArray typeOfInt4Array) {
        registerModifiedProperty("typeOfInt4Array");
        _typeOfInt4Array = typeOfInt4Array;
    }

    /**
     * [get] type_of_int8: {int8(19)} <br>
     * @return The value of the column 'type_of_int8'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTypeOfInt8() {
        checkSpecifiedProperty("typeOfInt8");
        return _typeOfInt8;
    }

    /**
     * [set] type_of_int8: {int8(19)} <br>
     * @param typeOfInt8 The value of the column 'type_of_int8'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfInt8(Long typeOfInt8) {
        registerModifiedProperty("typeOfInt8");
        _typeOfInt8 = typeOfInt8;
    }

    /**
     * [get] type_of_int8_array: {_int8(19)} <br>
     * @return The value of the column 'type_of_int8_array'. (NullAllowed even if selected: for no constraint)
     */
    public org.docksidestage.postgresql.mytype.MyArray getTypeOfInt8Array() {
        checkSpecifiedProperty("typeOfInt8Array");
        return _typeOfInt8Array;
    }

    /**
     * [set] type_of_int8_array: {_int8(19)} <br>
     * @param typeOfInt8Array The value of the column 'type_of_int8_array'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfInt8Array(org.docksidestage.postgresql.mytype.MyArray typeOfInt8Array) {
        registerModifiedProperty("typeOfInt8Array");
        _typeOfInt8Array = typeOfInt8Array;
    }

    /**
     * [get] type_of_bigint: {int8(19)} <br>
     * @return The value of the column 'type_of_bigint'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTypeOfBigint() {
        checkSpecifiedProperty("typeOfBigint");
        return _typeOfBigint;
    }

    /**
     * [set] type_of_bigint: {int8(19)} <br>
     * @param typeOfBigint The value of the column 'type_of_bigint'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfBigint(Long typeOfBigint) {
        registerModifiedProperty("typeOfBigint");
        _typeOfBigint = typeOfBigint;
    }

    /**
     * [get] type_of_real: {float4(8, 8)} <br>
     * @return The value of the column 'type_of_real'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTypeOfReal() {
        checkSpecifiedProperty("typeOfReal");
        return _typeOfReal;
    }

    /**
     * [set] type_of_real: {float4(8, 8)} <br>
     * @param typeOfReal The value of the column 'type_of_real'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfReal(java.math.BigDecimal typeOfReal) {
        registerModifiedProperty("typeOfReal");
        _typeOfReal = typeOfReal;
    }

    /**
     * [get] type_of_float: {float8(17, 17)} <br>
     * @return The value of the column 'type_of_float'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTypeOfFloat() {
        checkSpecifiedProperty("typeOfFloat");
        return _typeOfFloat;
    }

    /**
     * [set] type_of_float: {float8(17, 17)} <br>
     * @param typeOfFloat The value of the column 'type_of_float'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfFloat(java.math.BigDecimal typeOfFloat) {
        registerModifiedProperty("typeOfFloat");
        _typeOfFloat = typeOfFloat;
    }

    /**
     * [get] type_of_money: {money(2147483647)} <br>
     * @return The value of the column 'type_of_money'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTypeOfMoney() {
        checkSpecifiedProperty("typeOfMoney");
        return _typeOfMoney;
    }

    /**
     * [set] type_of_money: {money(2147483647)} <br>
     * @param typeOfMoney The value of the column 'type_of_money'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfMoney(java.math.BigDecimal typeOfMoney) {
        registerModifiedProperty("typeOfMoney");
        _typeOfMoney = typeOfMoney;
    }

    /**
     * [get] type_of_date: {date(13)} <br>
     * @return The value of the column 'type_of_date'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDate getTypeOfDate() {
        checkSpecifiedProperty("typeOfDate");
        return _typeOfDate;
    }

    /**
     * [set] type_of_date: {date(13)} <br>
     * @param typeOfDate The value of the column 'type_of_date'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfDate(java.time.LocalDate typeOfDate) {
        registerModifiedProperty("typeOfDate");
        _typeOfDate = typeOfDate;
    }

    /**
     * [get] type_of_timestamp: {timestamp(29, 6)} <br>
     * @return The value of the column 'type_of_timestamp'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getTypeOfTimestamp() {
        checkSpecifiedProperty("typeOfTimestamp");
        return _typeOfTimestamp;
    }

    /**
     * [set] type_of_timestamp: {timestamp(29, 6)} <br>
     * @param typeOfTimestamp The value of the column 'type_of_timestamp'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfTimestamp(java.time.LocalDateTime typeOfTimestamp) {
        registerModifiedProperty("typeOfTimestamp");
        _typeOfTimestamp = typeOfTimestamp;
    }

    /**
     * [get] type_of_time: {time(15, 6)} <br>
     * @return The value of the column 'type_of_time'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalTime getTypeOfTime() {
        checkSpecifiedProperty("typeOfTime");
        return _typeOfTime;
    }

    /**
     * [set] type_of_time: {time(15, 6)} <br>
     * @param typeOfTime The value of the column 'type_of_time'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfTime(java.time.LocalTime typeOfTime) {
        registerModifiedProperty("typeOfTime");
        _typeOfTime = typeOfTime;
    }

    /**
     * [get] type_of_timetz: {timetz(21, 6)} <br>
     * @return The value of the column 'type_of_timetz'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalTime getTypeOfTimetz() {
        checkSpecifiedProperty("typeOfTimetz");
        return _typeOfTimetz;
    }

    /**
     * [set] type_of_timetz: {timetz(21, 6)} <br>
     * @param typeOfTimetz The value of the column 'type_of_timetz'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfTimetz(java.time.LocalTime typeOfTimetz) {
        registerModifiedProperty("typeOfTimetz");
        _typeOfTimetz = typeOfTimetz;
    }

    /**
     * [get] type_of_interval: {interval(49, 6)} <br>
     * @return The value of the column 'type_of_interval'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfInterval() {
        checkSpecifiedProperty("typeOfInterval");
        return _typeOfInterval;
    }

    /**
     * [set] type_of_interval: {interval(49, 6)} <br>
     * @param typeOfInterval The value of the column 'type_of_interval'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfInterval(String typeOfInterval) {
        registerModifiedProperty("typeOfInterval");
        _typeOfInterval = typeOfInterval;
    }

    /**
     * [get] type_of_bool: {bool(1), classification=TrueFalse} <br>
     * @return The value of the column 'type_of_bool'. (NullAllowed even if selected: for no constraint)
     */
    public Boolean getTypeOfBool() {
        checkSpecifiedProperty("typeOfBool");
        return _typeOfBool;
    }

    /**
     * [set] type_of_bool: {bool(1), classification=TrueFalse} <br>
     * @param typeOfBool The value of the column 'type_of_bool'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfBool(Boolean typeOfBool) {
        checkClassificationCode("type_of_bool", CDef.DefMeta.TrueFalse, typeOfBool);
        registerModifiedProperty("typeOfBool");
        _typeOfBool = typeOfBool;
    }

    /**
     * [get] type_of_bit: {bit(1)} <br>
     * @return The value of the column 'type_of_bit'. (NullAllowed even if selected: for no constraint)
     */
    public Boolean getTypeOfBit() {
        checkSpecifiedProperty("typeOfBit");
        return _typeOfBit;
    }

    /**
     * [set] type_of_bit: {bit(1)} <br>
     * @param typeOfBit The value of the column 'type_of_bit'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfBit(Boolean typeOfBit) {
        registerModifiedProperty("typeOfBit");
        _typeOfBit = typeOfBit;
    }

    /**
     * [get] type_of_bytea: {bytea(2147483647)} <br>
     * @return The value of the column 'type_of_bytea'. (NullAllowed even if selected: for no constraint)
     */
    @MappingValueType(keyName = "postgreSqlByteaType")
    public byte[] getTypeOfBytea() {
        checkSpecifiedProperty("typeOfBytea");
        return _typeOfBytea;
    }

    /**
     * [set] type_of_bytea: {bytea(2147483647)} <br>
     * @param typeOfBytea The value of the column 'type_of_bytea'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfBytea(byte[] typeOfBytea) {
        registerModifiedProperty("typeOfBytea");
        _typeOfBytea = typeOfBytea;
    }

    /**
     * [get] type_of_oid: {oid(10)} <br>
     * @return The value of the column 'type_of_oid'. (NullAllowed even if selected: for no constraint)
     */
    @MappingValueType(keyName = "postgreSqlOidType")
    public byte[] getTypeOfOid() {
        checkSpecifiedProperty("typeOfOid");
        return _typeOfOid;
    }

    /**
     * [set] type_of_oid: {oid(10)} <br>
     * @param typeOfOid The value of the column 'type_of_oid'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfOid(byte[] typeOfOid) {
        registerModifiedProperty("typeOfOid");
        _typeOfOid = typeOfOid;
    }

    /**
     * [get] type_of_uuid: {uuid(2147483647)} <br>
     * @return The value of the column 'type_of_uuid'. (NullAllowed even if selected: for no constraint)
     */
    public java.util.UUID getTypeOfUuid() {
        checkSpecifiedProperty("typeOfUuid");
        return _typeOfUuid;
    }

    /**
     * [set] type_of_uuid: {uuid(2147483647)} <br>
     * @param typeOfUuid The value of the column 'type_of_uuid'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfUuid(java.util.UUID typeOfUuid) {
        registerModifiedProperty("typeOfUuid");
        _typeOfUuid = typeOfUuid;
    }

    /**
     * [get] type_of_xml: {xml(2147483647)} <br>
     * @return The value of the column 'type_of_xml'. (NullAllowed even if selected: for no constraint)
     */
    public org.docksidestage.postgresql.mytype.MyXML getTypeOfXml() {
        checkSpecifiedProperty("typeOfXml");
        return _typeOfXml;
    }

    /**
     * [set] type_of_xml: {xml(2147483647)} <br>
     * @param typeOfXml The value of the column 'type_of_xml'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfXml(org.docksidestage.postgresql.mytype.MyXML typeOfXml) {
        registerModifiedProperty("typeOfXml");
        _typeOfXml = typeOfXml;
    }

    /**
     * [get] type_of_json: {json(2147483647)} <br>
     * @return The value of the column 'type_of_json'. (NullAllowed even if selected: for no constraint)
     */
    public org.docksidestage.postgresql.mytype.MyJSON getTypeOfJson() {
        checkSpecifiedProperty("typeOfJson");
        return _typeOfJson;
    }

    /**
     * [set] type_of_json: {json(2147483647)} <br>
     * @param typeOfJson The value of the column 'type_of_json'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfJson(org.docksidestage.postgresql.mytype.MyJSON typeOfJson) {
        registerModifiedProperty("typeOfJson");
        _typeOfJson = typeOfJson;
    }
}
