package org.docksidestage.postgresql.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import org.dbflute.dbmeta.accessory.MappingValueType;
import org.docksidestage.postgresql.dbflute.allcommon.CDef;
import org.docksidestage.postgresql.dbflute.exentity.customize.*;

/**
 * The entity of VendorCheckCursor. <br>
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     vendor_check_id, type_of_char, type_of_varchar, type_of_vc_array, type_of_text, type_of_numeric_integer, type_of_numeric_bigint, type_of_numeric_decimal, type_of_decimal, type_of_int8, type_of_int_array, type_of_int4, type_of_bigint, type_of_real, type_of_float, type_of_money, type_of_date, type_of_timestamp, type_of_time, type_of_timetz, type_of_interval, type_of_bool, type_of_bit, type_of_bytea, type_of_oid, type_of_uuid, type_of_xml
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long vendorCheckId = entity.getVendorCheckId();
 * String typeOfChar = entity.getTypeOfChar();
 * String typeOfVarchar = entity.getTypeOfVarchar();
 * org.docksidestage.postgresql.mytype.MyArray typeOfVcArray = entity.getTypeOfVcArray();
 * String typeOfText = entity.getTypeOfText();
 * Integer typeOfNumericInteger = entity.getTypeOfNumericInteger();
 * Long typeOfNumericBigint = entity.getTypeOfNumericBigint();
 * java.math.BigDecimal typeOfNumericDecimal = entity.getTypeOfNumericDecimal();
 * java.math.BigDecimal typeOfDecimal = entity.getTypeOfDecimal();
 * Long typeOfInt8 = entity.getTypeOfInt8();
 * org.docksidestage.postgresql.mytype.MyArray typeOfIntArray = entity.getTypeOfIntArray();
 * Integer typeOfInt4 = entity.getTypeOfInt4();
 * Long typeOfBigint = entity.getTypeOfBigint();
 * java.math.BigDecimal typeOfReal = entity.getTypeOfReal();
 * java.math.BigDecimal typeOfFloat = entity.getTypeOfFloat();
 * java.math.BigDecimal typeOfMoney = entity.getTypeOfMoney();
 * java.util.Date typeOfDate = entity.getTypeOfDate();
 * java.sql.Timestamp typeOfTimestamp = entity.getTypeOfTimestamp();
 * java.sql.Time typeOfTime = entity.getTypeOfTime();
 * java.sql.Time typeOfTimetz = entity.getTypeOfTimetz();
 * String typeOfInterval = entity.getTypeOfInterval();
 * Boolean typeOfBool = entity.getTypeOfBool();
 * Boolean typeOfBit = entity.getTypeOfBit();
 * byte[] typeOfBytea = entity.getTypeOfBytea();
 * byte[] typeOfOid = entity.getTypeOfOid();
 * java.util.UUID typeOfUuid = entity.getTypeOfUuid();
 * org.docksidestage.postgresql.mytype.MyXML typeOfXml = entity.getTypeOfXml();
 * entity.setVendorCheckId(vendorCheckId);
 * entity.setTypeOfChar(typeOfChar);
 * entity.setTypeOfVarchar(typeOfVarchar);
 * entity.setTypeOfVcArray(typeOfVcArray);
 * entity.setTypeOfText(typeOfText);
 * entity.setTypeOfNumericInteger(typeOfNumericInteger);
 * entity.setTypeOfNumericBigint(typeOfNumericBigint);
 * entity.setTypeOfNumericDecimal(typeOfNumericDecimal);
 * entity.setTypeOfDecimal(typeOfDecimal);
 * entity.setTypeOfInt8(typeOfInt8);
 * entity.setTypeOfIntArray(typeOfIntArray);
 * entity.setTypeOfInt4(typeOfInt4);
 * entity.setTypeOfBigint(typeOfBigint);
 * entity.setTypeOfReal(typeOfReal);
 * entity.setTypeOfFloat(typeOfFloat);
 * entity.setTypeOfMoney(typeOfMoney);
 * entity.setTypeOfDate(typeOfDate);
 * entity.setTypeOfTimestamp(typeOfTimestamp);
 * entity.setTypeOfTime(typeOfTime);
 * entity.setTypeOfTimetz(typeOfTimetz);
 * entity.setTypeOfInterval(typeOfInterval);
 * entity.setTypeOfBool(typeOfBool);
 * entity.setTypeOfBit(typeOfBit);
 * entity.setTypeOfBytea(typeOfBytea);
 * entity.setTypeOfOid(typeOfOid);
 * entity.setTypeOfUuid(typeOfUuid);
 * entity.setTypeOfXml(typeOfXml);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendorCheckCursor extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** vendor_check_id: {numeric(16), refers to vendor_check.vendor_check_id} */
    protected Long _vendorCheckId;

    /** type_of_char: {bpchar(3), refers to vendor_check.type_of_char} */
    protected String _typeOfChar;

    /** type_of_varchar: {varchar(2147483647), refers to vendor_check.type_of_varchar} */
    protected String _typeOfVarchar;

    /** type_of_vc_array: {_varchar(2147483647), refers to vendor_check.type_of_vc_array} */
    protected org.docksidestage.postgresql.mytype.MyArray _typeOfVcArray;

    /** type_of_text: {text(2147483647), refers to vendor_check.type_of_text} */
    protected String _typeOfText;

    /** type_of_numeric_integer: {numeric(5), refers to vendor_check.type_of_numeric_integer} */
    protected Integer _typeOfNumericInteger;

    /** type_of_numeric_bigint: {numeric(12), refers to vendor_check.type_of_numeric_bigint} */
    protected Long _typeOfNumericBigint;

    /** type_of_numeric_decimal: {numeric(5, 3), refers to vendor_check.type_of_numeric_decimal} */
    protected java.math.BigDecimal _typeOfNumericDecimal;

    /** type_of_decimal: {numeric(131089), refers to vendor_check.type_of_decimal} */
    protected java.math.BigDecimal _typeOfDecimal;

    /** type_of_int8: {int8(19), refers to vendor_check.type_of_int8} */
    protected Long _typeOfInt8;

    /** type_of_int_array: {_int8(19), refers to vendor_check.type_of_int_array} */
    protected org.docksidestage.postgresql.mytype.MyArray _typeOfIntArray;

    /** type_of_int4: {int4(10), refers to vendor_check.type_of_int4} */
    protected Integer _typeOfInt4;

    /** type_of_bigint: {int8(19), refers to vendor_check.type_of_bigint} */
    protected Long _typeOfBigint;

    /** type_of_real: {float4(8, 8), refers to vendor_check.type_of_real} */
    protected java.math.BigDecimal _typeOfReal;

    /** type_of_float: {float8(17, 17), refers to vendor_check.type_of_float} */
    protected java.math.BigDecimal _typeOfFloat;

    /** type_of_money: {money(2147483647), refers to vendor_check.type_of_money} */
    protected java.math.BigDecimal _typeOfMoney;

    /** type_of_date: {date(13), refers to vendor_check.type_of_date} */
    protected java.util.Date _typeOfDate;

    /** type_of_timestamp: {timestamp(29, 6), refers to vendor_check.type_of_timestamp} */
    protected java.sql.Timestamp _typeOfTimestamp;

    /** type_of_time: {time(15, 6), refers to vendor_check.type_of_time} */
    protected java.sql.Time _typeOfTime;

    /** type_of_timetz: {timetz(21, 6), refers to vendor_check.type_of_timetz} */
    protected java.sql.Time _typeOfTimetz;

    /** type_of_interval: {interval(49, 6), refers to vendor_check.type_of_interval} */
    protected String _typeOfInterval;

    /** type_of_bool: {bool(1), refers to vendor_check.type_of_bool, classification=TrueFalse} */
    protected Boolean _typeOfBool;

    /** type_of_bit: {bit(1), refers to vendor_check.type_of_bit} */
    protected Boolean _typeOfBit;

    /** type_of_bytea: {bytea(2147483647), refers to vendor_check.type_of_bytea} */
    protected byte[] _typeOfBytea;

    /** type_of_oid: {oid(10), refers to vendor_check.type_of_oid} */
    protected byte[] _typeOfOid;

    /** type_of_uuid: {uuid(2147483647), refers to vendor_check.type_of_uuid} */
    protected java.util.UUID _typeOfUuid;

    /** type_of_xml: {xml(2147483647), refers to vendor_check.type_of_xml} */
    protected org.docksidestage.postgresql.mytype.MyXML _typeOfXml;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /** {@inheritDoc} */
    public String getTableDbName() {
        return "VendorCheckCursor";
    }

    /** {@inheritDoc} */
    public String getTablePropertyName() {
        return "vendorCheckCursor";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public DBMeta getDBMeta() {
        return org.docksidestage.postgresql.dbflute.bsentity.customize.dbmeta.VendorCheckCursorDbm.getInstance();
    }

    // ===================================================================================
    //                                                                         Primary Key
    //                                                                         ===========
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        return false;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of typeOfBool as the classification of TrueFalse. <br>
     * type_of_bool: {bool(1), refers to vendor_check.type_of_bool, classification=TrueFalse} <br>
     * boolean type classification
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.TrueFalse getTypeOfBoolAsTrueFalse() {
        return CDef.TrueFalse.codeOf(getTypeOfBool());
    }

    /**
     * Set the value of typeOfBool as the classification of TrueFalse. <br>
     * type_of_bool: {bool(1), refers to vendor_check.type_of_bool, classification=TrueFalse} <br>
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
    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsVendorCheckCursor) {
            BsVendorCheckCursor other = (BsVendorCheckCursor)obj;
            if (!xSV(_vendorCheckId, other._vendorCheckId)) { return false; }
            if (!xSV(_typeOfChar, other._typeOfChar)) { return false; }
            if (!xSV(_typeOfVarchar, other._typeOfVarchar)) { return false; }
            if (!xSV(_typeOfVcArray, other._typeOfVcArray)) { return false; }
            if (!xSV(_typeOfText, other._typeOfText)) { return false; }
            if (!xSV(_typeOfNumericInteger, other._typeOfNumericInteger)) { return false; }
            if (!xSV(_typeOfNumericBigint, other._typeOfNumericBigint)) { return false; }
            if (!xSV(_typeOfNumericDecimal, other._typeOfNumericDecimal)) { return false; }
            if (!xSV(_typeOfDecimal, other._typeOfDecimal)) { return false; }
            if (!xSV(_typeOfInt8, other._typeOfInt8)) { return false; }
            if (!xSV(_typeOfIntArray, other._typeOfIntArray)) { return false; }
            if (!xSV(_typeOfInt4, other._typeOfInt4)) { return false; }
            if (!xSV(_typeOfBigint, other._typeOfBigint)) { return false; }
            if (!xSV(_typeOfReal, other._typeOfReal)) { return false; }
            if (!xSV(_typeOfFloat, other._typeOfFloat)) { return false; }
            if (!xSV(_typeOfMoney, other._typeOfMoney)) { return false; }
            if (!xSV(_typeOfDate, other._typeOfDate)) { return false; }
            if (!xSV(_typeOfTimestamp, other._typeOfTimestamp)) { return false; }
            if (!xSV(_typeOfTime, other._typeOfTime)) { return false; }
            if (!xSV(_typeOfTimetz, other._typeOfTimetz)) { return false; }
            if (!xSV(_typeOfInterval, other._typeOfInterval)) { return false; }
            if (!xSV(_typeOfBool, other._typeOfBool)) { return false; }
            if (!xSV(_typeOfBit, other._typeOfBit)) { return false; }
            if (!xSV(_typeOfBytea, other._typeOfBytea)) { return false; }
            if (!xSV(_typeOfOid, other._typeOfOid)) { return false; }
            if (!xSV(_typeOfUuid, other._typeOfUuid)) { return false; }
            if (!xSV(_typeOfXml, other._typeOfXml)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _vendorCheckId);
        hs = xCH(hs, _typeOfChar);
        hs = xCH(hs, _typeOfVarchar);
        hs = xCH(hs, _typeOfVcArray);
        hs = xCH(hs, _typeOfText);
        hs = xCH(hs, _typeOfNumericInteger);
        hs = xCH(hs, _typeOfNumericBigint);
        hs = xCH(hs, _typeOfNumericDecimal);
        hs = xCH(hs, _typeOfDecimal);
        hs = xCH(hs, _typeOfInt8);
        hs = xCH(hs, _typeOfIntArray);
        hs = xCH(hs, _typeOfInt4);
        hs = xCH(hs, _typeOfBigint);
        hs = xCH(hs, _typeOfReal);
        hs = xCH(hs, _typeOfFloat);
        hs = xCH(hs, _typeOfMoney);
        hs = xCH(hs, _typeOfDate);
        hs = xCH(hs, _typeOfTimestamp);
        hs = xCH(hs, _typeOfTime);
        hs = xCH(hs, _typeOfTimetz);
        hs = xCH(hs, _typeOfInterval);
        hs = xCH(hs, _typeOfBool);
        hs = xCH(hs, _typeOfBit);
        hs = xCH(hs, _typeOfBytea);
        hs = xCH(hs, _typeOfOid);
        hs = xCH(hs, _typeOfUuid);
        hs = xCH(hs, _typeOfXml);
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
        sb.append(dm).append(xfND(_typeOfInt8));
        sb.append(dm).append(xfND(_typeOfIntArray));
        sb.append(dm).append(xfND(_typeOfInt4));
        sb.append(dm).append(xfND(_typeOfBigint));
        sb.append(dm).append(xfND(_typeOfReal));
        sb.append(dm).append(xfND(_typeOfFloat));
        sb.append(dm).append(xfND(_typeOfMoney));
        sb.append(dm).append(xfUD(_typeOfDate));
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
    public VendorCheckCursor clone() {
        return (VendorCheckCursor)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] vendor_check_id: {numeric(16), refers to vendor_check.vendor_check_id} <br>
     * @return The value of the column 'vendor_check_id'. (NullAllowed even if selected: for no constraint)
     */
    public Long getVendorCheckId() {
        checkSpecifiedProperty("vendorCheckId");
        return _vendorCheckId;
    }

    /**
     * [set] vendor_check_id: {numeric(16), refers to vendor_check.vendor_check_id} <br>
     * @param vendorCheckId The value of the column 'vendor_check_id'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVendorCheckId(Long vendorCheckId) {
        registerModifiedProperty("vendorCheckId");
        _vendorCheckId = vendorCheckId;
    }

    /**
     * [get] type_of_char: {bpchar(3), refers to vendor_check.type_of_char} <br>
     * @return The value of the column 'type_of_char'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfChar() {
        checkSpecifiedProperty("typeOfChar");
        return _typeOfChar;
    }

    /**
     * [set] type_of_char: {bpchar(3), refers to vendor_check.type_of_char} <br>
     * @param typeOfChar The value of the column 'type_of_char'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfChar(String typeOfChar) {
        registerModifiedProperty("typeOfChar");
        _typeOfChar = typeOfChar;
    }

    /**
     * [get] type_of_varchar: {varchar(2147483647), refers to vendor_check.type_of_varchar} <br>
     * @return The value of the column 'type_of_varchar'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfVarchar() {
        checkSpecifiedProperty("typeOfVarchar");
        return _typeOfVarchar;
    }

    /**
     * [set] type_of_varchar: {varchar(2147483647), refers to vendor_check.type_of_varchar} <br>
     * @param typeOfVarchar The value of the column 'type_of_varchar'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfVarchar(String typeOfVarchar) {
        registerModifiedProperty("typeOfVarchar");
        _typeOfVarchar = typeOfVarchar;
    }

    /**
     * [get] type_of_vc_array: {_varchar(2147483647), refers to vendor_check.type_of_vc_array} <br>
     * @return The value of the column 'type_of_vc_array'. (NullAllowed even if selected: for no constraint)
     */
    public org.docksidestage.postgresql.mytype.MyArray getTypeOfVcArray() {
        checkSpecifiedProperty("typeOfVcArray");
        return _typeOfVcArray;
    }

    /**
     * [set] type_of_vc_array: {_varchar(2147483647), refers to vendor_check.type_of_vc_array} <br>
     * @param typeOfVcArray The value of the column 'type_of_vc_array'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfVcArray(org.docksidestage.postgresql.mytype.MyArray typeOfVcArray) {
        registerModifiedProperty("typeOfVcArray");
        _typeOfVcArray = typeOfVcArray;
    }

    /**
     * [get] type_of_text: {text(2147483647), refers to vendor_check.type_of_text} <br>
     * @return The value of the column 'type_of_text'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfText() {
        checkSpecifiedProperty("typeOfText");
        return _typeOfText;
    }

    /**
     * [set] type_of_text: {text(2147483647), refers to vendor_check.type_of_text} <br>
     * @param typeOfText The value of the column 'type_of_text'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfText(String typeOfText) {
        registerModifiedProperty("typeOfText");
        _typeOfText = typeOfText;
    }

    /**
     * [get] type_of_numeric_integer: {numeric(5), refers to vendor_check.type_of_numeric_integer} <br>
     * @return The value of the column 'type_of_numeric_integer'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getTypeOfNumericInteger() {
        checkSpecifiedProperty("typeOfNumericInteger");
        return _typeOfNumericInteger;
    }

    /**
     * [set] type_of_numeric_integer: {numeric(5), refers to vendor_check.type_of_numeric_integer} <br>
     * @param typeOfNumericInteger The value of the column 'type_of_numeric_integer'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfNumericInteger(Integer typeOfNumericInteger) {
        registerModifiedProperty("typeOfNumericInteger");
        _typeOfNumericInteger = typeOfNumericInteger;
    }

    /**
     * [get] type_of_numeric_bigint: {numeric(12), refers to vendor_check.type_of_numeric_bigint} <br>
     * @return The value of the column 'type_of_numeric_bigint'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTypeOfNumericBigint() {
        checkSpecifiedProperty("typeOfNumericBigint");
        return _typeOfNumericBigint;
    }

    /**
     * [set] type_of_numeric_bigint: {numeric(12), refers to vendor_check.type_of_numeric_bigint} <br>
     * @param typeOfNumericBigint The value of the column 'type_of_numeric_bigint'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfNumericBigint(Long typeOfNumericBigint) {
        registerModifiedProperty("typeOfNumericBigint");
        _typeOfNumericBigint = typeOfNumericBigint;
    }

    /**
     * [get] type_of_numeric_decimal: {numeric(5, 3), refers to vendor_check.type_of_numeric_decimal} <br>
     * @return The value of the column 'type_of_numeric_decimal'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTypeOfNumericDecimal() {
        checkSpecifiedProperty("typeOfNumericDecimal");
        return _typeOfNumericDecimal;
    }

    /**
     * [set] type_of_numeric_decimal: {numeric(5, 3), refers to vendor_check.type_of_numeric_decimal} <br>
     * @param typeOfNumericDecimal The value of the column 'type_of_numeric_decimal'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfNumericDecimal(java.math.BigDecimal typeOfNumericDecimal) {
        registerModifiedProperty("typeOfNumericDecimal");
        _typeOfNumericDecimal = typeOfNumericDecimal;
    }

    /**
     * [get] type_of_decimal: {numeric(131089), refers to vendor_check.type_of_decimal} <br>
     * @return The value of the column 'type_of_decimal'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTypeOfDecimal() {
        checkSpecifiedProperty("typeOfDecimal");
        return _typeOfDecimal;
    }

    /**
     * [set] type_of_decimal: {numeric(131089), refers to vendor_check.type_of_decimal} <br>
     * @param typeOfDecimal The value of the column 'type_of_decimal'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfDecimal(java.math.BigDecimal typeOfDecimal) {
        registerModifiedProperty("typeOfDecimal");
        _typeOfDecimal = typeOfDecimal;
    }

    /**
     * [get] type_of_int8: {int8(19), refers to vendor_check.type_of_int8} <br>
     * @return The value of the column 'type_of_int8'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTypeOfInt8() {
        checkSpecifiedProperty("typeOfInt8");
        return _typeOfInt8;
    }

    /**
     * [set] type_of_int8: {int8(19), refers to vendor_check.type_of_int8} <br>
     * @param typeOfInt8 The value of the column 'type_of_int8'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfInt8(Long typeOfInt8) {
        registerModifiedProperty("typeOfInt8");
        _typeOfInt8 = typeOfInt8;
    }

    /**
     * [get] type_of_int_array: {_int8(19), refers to vendor_check.type_of_int_array} <br>
     * @return The value of the column 'type_of_int_array'. (NullAllowed even if selected: for no constraint)
     */
    public org.docksidestage.postgresql.mytype.MyArray getTypeOfIntArray() {
        checkSpecifiedProperty("typeOfIntArray");
        return _typeOfIntArray;
    }

    /**
     * [set] type_of_int_array: {_int8(19), refers to vendor_check.type_of_int_array} <br>
     * @param typeOfIntArray The value of the column 'type_of_int_array'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfIntArray(org.docksidestage.postgresql.mytype.MyArray typeOfIntArray) {
        registerModifiedProperty("typeOfIntArray");
        _typeOfIntArray = typeOfIntArray;
    }

    /**
     * [get] type_of_int4: {int4(10), refers to vendor_check.type_of_int4} <br>
     * @return The value of the column 'type_of_int4'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getTypeOfInt4() {
        checkSpecifiedProperty("typeOfInt4");
        return _typeOfInt4;
    }

    /**
     * [set] type_of_int4: {int4(10), refers to vendor_check.type_of_int4} <br>
     * @param typeOfInt4 The value of the column 'type_of_int4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfInt4(Integer typeOfInt4) {
        registerModifiedProperty("typeOfInt4");
        _typeOfInt4 = typeOfInt4;
    }

    /**
     * [get] type_of_bigint: {int8(19), refers to vendor_check.type_of_bigint} <br>
     * @return The value of the column 'type_of_bigint'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTypeOfBigint() {
        checkSpecifiedProperty("typeOfBigint");
        return _typeOfBigint;
    }

    /**
     * [set] type_of_bigint: {int8(19), refers to vendor_check.type_of_bigint} <br>
     * @param typeOfBigint The value of the column 'type_of_bigint'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfBigint(Long typeOfBigint) {
        registerModifiedProperty("typeOfBigint");
        _typeOfBigint = typeOfBigint;
    }

    /**
     * [get] type_of_real: {float4(8, 8), refers to vendor_check.type_of_real} <br>
     * @return The value of the column 'type_of_real'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTypeOfReal() {
        checkSpecifiedProperty("typeOfReal");
        return _typeOfReal;
    }

    /**
     * [set] type_of_real: {float4(8, 8), refers to vendor_check.type_of_real} <br>
     * @param typeOfReal The value of the column 'type_of_real'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfReal(java.math.BigDecimal typeOfReal) {
        registerModifiedProperty("typeOfReal");
        _typeOfReal = typeOfReal;
    }

    /**
     * [get] type_of_float: {float8(17, 17), refers to vendor_check.type_of_float} <br>
     * @return The value of the column 'type_of_float'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTypeOfFloat() {
        checkSpecifiedProperty("typeOfFloat");
        return _typeOfFloat;
    }

    /**
     * [set] type_of_float: {float8(17, 17), refers to vendor_check.type_of_float} <br>
     * @param typeOfFloat The value of the column 'type_of_float'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfFloat(java.math.BigDecimal typeOfFloat) {
        registerModifiedProperty("typeOfFloat");
        _typeOfFloat = typeOfFloat;
    }

    /**
     * [get] type_of_money: {money(2147483647), refers to vendor_check.type_of_money} <br>
     * @return The value of the column 'type_of_money'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTypeOfMoney() {
        checkSpecifiedProperty("typeOfMoney");
        return _typeOfMoney;
    }

    /**
     * [set] type_of_money: {money(2147483647), refers to vendor_check.type_of_money} <br>
     * @param typeOfMoney The value of the column 'type_of_money'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfMoney(java.math.BigDecimal typeOfMoney) {
        registerModifiedProperty("typeOfMoney");
        _typeOfMoney = typeOfMoney;
    }

    /**
     * [get] type_of_date: {date(13), refers to vendor_check.type_of_date} <br>
     * @return The value of the column 'type_of_date'. (NullAllowed even if selected: for no constraint)
     */
    public java.util.Date getTypeOfDate() {
        checkSpecifiedProperty("typeOfDate");
        return _typeOfDate;
    }

    /**
     * [set] type_of_date: {date(13), refers to vendor_check.type_of_date} <br>
     * @param typeOfDate The value of the column 'type_of_date'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfDate(java.util.Date typeOfDate) {
        registerModifiedProperty("typeOfDate");
        _typeOfDate = typeOfDate;
    }

    /**
     * [get] type_of_timestamp: {timestamp(29, 6), refers to vendor_check.type_of_timestamp} <br>
     * @return The value of the column 'type_of_timestamp'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getTypeOfTimestamp() {
        checkSpecifiedProperty("typeOfTimestamp");
        return _typeOfTimestamp;
    }

    /**
     * [set] type_of_timestamp: {timestamp(29, 6), refers to vendor_check.type_of_timestamp} <br>
     * @param typeOfTimestamp The value of the column 'type_of_timestamp'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfTimestamp(java.sql.Timestamp typeOfTimestamp) {
        registerModifiedProperty("typeOfTimestamp");
        _typeOfTimestamp = typeOfTimestamp;
    }

    /**
     * [get] type_of_time: {time(15, 6), refers to vendor_check.type_of_time} <br>
     * @return The value of the column 'type_of_time'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Time getTypeOfTime() {
        checkSpecifiedProperty("typeOfTime");
        return _typeOfTime;
    }

    /**
     * [set] type_of_time: {time(15, 6), refers to vendor_check.type_of_time} <br>
     * @param typeOfTime The value of the column 'type_of_time'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfTime(java.sql.Time typeOfTime) {
        registerModifiedProperty("typeOfTime");
        _typeOfTime = typeOfTime;
    }

    /**
     * [get] type_of_timetz: {timetz(21, 6), refers to vendor_check.type_of_timetz} <br>
     * @return The value of the column 'type_of_timetz'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Time getTypeOfTimetz() {
        checkSpecifiedProperty("typeOfTimetz");
        return _typeOfTimetz;
    }

    /**
     * [set] type_of_timetz: {timetz(21, 6), refers to vendor_check.type_of_timetz} <br>
     * @param typeOfTimetz The value of the column 'type_of_timetz'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfTimetz(java.sql.Time typeOfTimetz) {
        registerModifiedProperty("typeOfTimetz");
        _typeOfTimetz = typeOfTimetz;
    }

    /**
     * [get] type_of_interval: {interval(49, 6), refers to vendor_check.type_of_interval} <br>
     * @return The value of the column 'type_of_interval'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfInterval() {
        checkSpecifiedProperty("typeOfInterval");
        return _typeOfInterval;
    }

    /**
     * [set] type_of_interval: {interval(49, 6), refers to vendor_check.type_of_interval} <br>
     * @param typeOfInterval The value of the column 'type_of_interval'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfInterval(String typeOfInterval) {
        registerModifiedProperty("typeOfInterval");
        _typeOfInterval = typeOfInterval;
    }

    /**
     * [get] type_of_bool: {bool(1), refers to vendor_check.type_of_bool, classification=TrueFalse} <br>
     * @return The value of the column 'type_of_bool'. (NullAllowed even if selected: for no constraint)
     */
    public Boolean getTypeOfBool() {
        checkSpecifiedProperty("typeOfBool");
        return _typeOfBool;
    }

    /**
     * [set] type_of_bool: {bool(1), refers to vendor_check.type_of_bool, classification=TrueFalse} <br>
     * @param typeOfBool The value of the column 'type_of_bool'. (NullAllowed: null update allowed for no constraint)
     */
    protected void setTypeOfBool(Boolean typeOfBool) {
        checkClassificationCode("type_of_bool", CDef.DefMeta.TrueFalse, typeOfBool);
        registerModifiedProperty("typeOfBool");
        _typeOfBool = typeOfBool;
    }

    /**
     * [get] type_of_bit: {bit(1), refers to vendor_check.type_of_bit} <br>
     * @return The value of the column 'type_of_bit'. (NullAllowed even if selected: for no constraint)
     */
    public Boolean getTypeOfBit() {
        checkSpecifiedProperty("typeOfBit");
        return _typeOfBit;
    }

    /**
     * [set] type_of_bit: {bit(1), refers to vendor_check.type_of_bit} <br>
     * @param typeOfBit The value of the column 'type_of_bit'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfBit(Boolean typeOfBit) {
        registerModifiedProperty("typeOfBit");
        _typeOfBit = typeOfBit;
    }

    /**
     * [get] type_of_bytea: {bytea(2147483647), refers to vendor_check.type_of_bytea} <br>
     * @return The value of the column 'type_of_bytea'. (NullAllowed even if selected: for no constraint)
     */
    public byte[] getTypeOfBytea() {
        checkSpecifiedProperty("typeOfBytea");
        return _typeOfBytea;
    }

    /**
     * [set] type_of_bytea: {bytea(2147483647), refers to vendor_check.type_of_bytea} <br>
     * @param typeOfBytea The value of the column 'type_of_bytea'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfBytea(byte[] typeOfBytea) {
        registerModifiedProperty("typeOfBytea");
        _typeOfBytea = typeOfBytea;
    }

    /**
     * [get] type_of_oid: {oid(10), refers to vendor_check.type_of_oid} <br>
     * @return The value of the column 'type_of_oid'. (NullAllowed even if selected: for no constraint)
     */
    @MappingValueType(keyName = "bytesOidType")
    public byte[] getTypeOfOid() {
        checkSpecifiedProperty("typeOfOid");
        return _typeOfOid;
    }

    /**
     * [set] type_of_oid: {oid(10), refers to vendor_check.type_of_oid} <br>
     * @param typeOfOid The value of the column 'type_of_oid'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfOid(byte[] typeOfOid) {
        registerModifiedProperty("typeOfOid");
        _typeOfOid = typeOfOid;
    }

    /**
     * [get] type_of_uuid: {uuid(2147483647), refers to vendor_check.type_of_uuid} <br>
     * @return The value of the column 'type_of_uuid'. (NullAllowed even if selected: for no constraint)
     */
    public java.util.UUID getTypeOfUuid() {
        checkSpecifiedProperty("typeOfUuid");
        return _typeOfUuid;
    }

    /**
     * [set] type_of_uuid: {uuid(2147483647), refers to vendor_check.type_of_uuid} <br>
     * @param typeOfUuid The value of the column 'type_of_uuid'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfUuid(java.util.UUID typeOfUuid) {
        registerModifiedProperty("typeOfUuid");
        _typeOfUuid = typeOfUuid;
    }

    /**
     * [get] type_of_xml: {xml(2147483647), refers to vendor_check.type_of_xml} <br>
     * @return The value of the column 'type_of_xml'. (NullAllowed even if selected: for no constraint)
     */
    public org.docksidestage.postgresql.mytype.MyXML getTypeOfXml() {
        checkSpecifiedProperty("typeOfXml");
        return _typeOfXml;
    }

    /**
     * [set] type_of_xml: {xml(2147483647), refers to vendor_check.type_of_xml} <br>
     * @param typeOfXml The value of the column 'type_of_xml'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfXml(org.docksidestage.postgresql.mytype.MyXML typeOfXml) {
        registerModifiedProperty("typeOfXml");
        _typeOfXml = typeOfXml;
    }

    /**
     * For framework so basically DON'T use this method.
     * @param typeOfBool The value of the column 'type_of_bool'. (NullAllowed: null update allowed for no constraint)
     */
    public void mynativeMappingTypeOfBool(Boolean typeOfBool) {
        setTypeOfBool(typeOfBool);
    }
}
