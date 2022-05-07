package org.docksidestage.postgresql.dbflute.bsbhv.cursor;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.dbflute.jdbc.CursorAccessor;
import org.dbflute.jdbc.ValueType;
import org.dbflute.s2dao.valuetype.TnValueTypes;

/**
 * The cursor of VendorCheckCursor. <br>
 * @author DBFlute(AutoGenerator)
 */
public class BsVendorCheckCursorCursor implements CursorAccessor {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    // -----------------------------------------------------
    //                                        Column DB Name
    //                                        --------------
    /** DB name of vendor_check_id. */
    public static final String DB_NAME_vendor_check_id = "vendor_check_id";

    /** DB name of type_of_char. */
    public static final String DB_NAME_type_of_char = "type_of_char";

    /** DB name of type_of_varchar. */
    public static final String DB_NAME_type_of_varchar = "type_of_varchar";

    /** DB name of type_of_vc_array. */
    public static final String DB_NAME_type_of_vc_array = "type_of_vc_array";

    /** DB name of type_of_text. */
    public static final String DB_NAME_type_of_text = "type_of_text";

    /** DB name of type_of_numeric_integer. */
    public static final String DB_NAME_type_of_numeric_integer = "type_of_numeric_integer";

    /** DB name of type_of_numeric_bigint. */
    public static final String DB_NAME_type_of_numeric_bigint = "type_of_numeric_bigint";

    /** DB name of type_of_numeric_decimal. */
    public static final String DB_NAME_type_of_numeric_decimal = "type_of_numeric_decimal";

    /** DB name of type_of_decimal. */
    public static final String DB_NAME_type_of_decimal = "type_of_decimal";

    /** DB name of type_of_int. */
    public static final String DB_NAME_type_of_int = "type_of_int";

    /** DB name of type_of_int_array. */
    public static final String DB_NAME_type_of_int_array = "type_of_int_array";

    /** DB name of type_of_int4. */
    public static final String DB_NAME_type_of_int4 = "type_of_int4";

    /** DB name of type_of_int4_array. */
    public static final String DB_NAME_type_of_int4_array = "type_of_int4_array";

    /** DB name of type_of_int8. */
    public static final String DB_NAME_type_of_int8 = "type_of_int8";

    /** DB name of type_of_int8_array. */
    public static final String DB_NAME_type_of_int8_array = "type_of_int8_array";

    /** DB name of type_of_bigint. */
    public static final String DB_NAME_type_of_bigint = "type_of_bigint";

    /** DB name of type_of_real. */
    public static final String DB_NAME_type_of_real = "type_of_real";

    /** DB name of type_of_float. */
    public static final String DB_NAME_type_of_float = "type_of_float";

    /** DB name of type_of_money. */
    public static final String DB_NAME_type_of_money = "type_of_money";

    /** DB name of type_of_date. */
    public static final String DB_NAME_type_of_date = "type_of_date";

    /** DB name of type_of_timestamp. */
    public static final String DB_NAME_type_of_timestamp = "type_of_timestamp";

    /** DB name of type_of_time. */
    public static final String DB_NAME_type_of_time = "type_of_time";

    /** DB name of type_of_timetz. */
    public static final String DB_NAME_type_of_timetz = "type_of_timetz";

    /** DB name of type_of_interval. */
    public static final String DB_NAME_type_of_interval = "type_of_interval";

    /** DB name of type_of_bool. */
    public static final String DB_NAME_type_of_bool = "type_of_bool";

    /** DB name of type_of_bit. */
    public static final String DB_NAME_type_of_bit = "type_of_bit";

    /** DB name of type_of_bytea. */
    public static final String DB_NAME_type_of_bytea = "type_of_bytea";

    /** DB name of type_of_oid. */
    public static final String DB_NAME_type_of_oid = "type_of_oid";

    /** DB name of type_of_uuid. */
    public static final String DB_NAME_type_of_uuid = "type_of_uuid";

    /** DB name of type_of_xml. */
    public static final String DB_NAME_type_of_xml = "type_of_xml";

    /** DB name of type_of_json. */
    public static final String DB_NAME_type_of_json = "type_of_json";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** Wrapped result set. */
    protected ResultSet _rs;

    protected ValueType _vtVendorCheckId = vt(Long.class);
    protected ValueType _vtTypeOfChar = vt(String.class);
    protected ValueType _vtTypeOfVarchar = vt(String.class);
    protected ValueType _vtTypeOfVcArray = vt(org.docksidestage.postgresql.mytype.MyArray.class);
    protected ValueType _vtTypeOfText = vt(String.class);
    protected ValueType _vtTypeOfNumericInteger = vt(Integer.class);
    protected ValueType _vtTypeOfNumericBigint = vt(Long.class);
    protected ValueType _vtTypeOfNumericDecimal = vt(java.math.BigDecimal.class);
    protected ValueType _vtTypeOfDecimal = vt(java.math.BigDecimal.class);
    protected ValueType _vtTypeOfInt = vt(Integer.class);
    protected ValueType _vtTypeOfIntArray = vt(org.docksidestage.postgresql.mytype.MyArray.class);
    protected ValueType _vtTypeOfInt4 = vt(Integer.class);
    protected ValueType _vtTypeOfInt4Array = vt(org.docksidestage.postgresql.mytype.MyArray.class);
    protected ValueType _vtTypeOfInt8 = vt(Long.class);
    protected ValueType _vtTypeOfInt8Array = vt(org.docksidestage.postgresql.mytype.MyArray.class);
    protected ValueType _vtTypeOfBigint = vt(Long.class);
    protected ValueType _vtTypeOfReal = vt(java.math.BigDecimal.class);
    protected ValueType _vtTypeOfFloat = vt(java.math.BigDecimal.class);
    protected ValueType _vtTypeOfMoney = vt(java.math.BigDecimal.class);
    protected ValueType _vtTypeOfDate = vt(java.time.LocalDate.class);
    protected ValueType _vtTypeOfTimestamp = vt(java.time.LocalDateTime.class);
    protected ValueType _vtTypeOfTime = vt(java.time.LocalTime.class);
    protected ValueType _vtTypeOfTimetz = vt(java.time.LocalTime.class);
    protected ValueType _vtTypeOfInterval = vt(String.class);
    protected ValueType _vtTypeOfBool = vt(Boolean.class);
    protected ValueType _vtTypeOfBit = vt(Boolean.class);
    protected ValueType _vtTypeOfBytea = vt(byte[].class);
    protected ValueType _vtTypeOfOid = vt(byte[].class);
    protected ValueType _vtTypeOfUuid = vt(java.util.UUID.class);
    protected ValueType _vtTypeOfXml = vt(org.docksidestage.postgresql.mytype.MyXML.class);
    protected ValueType _vtTypeOfJson = vt(org.docksidestage.postgresql.mytype.MyJSON.class);

    protected ValueType vt(Class<?> type) {
        return TnValueTypes.getValueType(type);
    }

    protected ValueType vt(Class<?> type, String name) {
        ValueType valueType = TnValueTypes.getPluginValueType(name);
        return valueType != null ? valueType : vt(type);
    }

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsVendorCheckCursorCursor() {
    }

    // ===================================================================================
    //                                                                             Prepare
    //                                                                             =======
    /** {@inheritDoc} */
    public void accept(ResultSet rs) {
        this._rs = rs;
    }

    // ===================================================================================
    //                                                                              Direct
    //                                                                              ======
    /** {@inheritDoc} */
    public ResultSet cursor() {
        return _rs;
    }

    // ===================================================================================
    //                                                                            Delegate
    //                                                                            ========
    /** {@inheritDoc} */
    public boolean next() throws SQLException {
        return _rs.next();
    }

    // ===================================================================================
    //                                                                  Type Safe Accessor
    //                                                                  ==================
    /**
     * [get] vendor_check_id: {numeric(16), refers to vendor_check.vendor_check_id} <br>
     * @return The value of vendorCheckId. (NullAllowed)
     * @throws SQLException When it fails to get the value from result set.
     */
    public Long getVendorCheckId() throws SQLException {
        return (Long)_vtVendorCheckId.getValue(_rs, DB_NAME_vendor_check_id);
    }

    /**
     * [get] type_of_char: {bpchar(3), refers to vendor_check.type_of_char} <br>
     * @return The value of typeOfChar. (NullAllowed)
     * @throws SQLException When it fails to get the value from result set.
     */
    public String getTypeOfChar() throws SQLException {
        return (String)_vtTypeOfChar.getValue(_rs, DB_NAME_type_of_char);
    }

    /**
     * [get] type_of_varchar: {varchar(2147483647), refers to vendor_check.type_of_varchar} <br>
     * @return The value of typeOfVarchar. (NullAllowed)
     * @throws SQLException When it fails to get the value from result set.
     */
    public String getTypeOfVarchar() throws SQLException {
        return (String)_vtTypeOfVarchar.getValue(_rs, DB_NAME_type_of_varchar);
    }

    /**
     * [get] type_of_vc_array: {_varchar(2147483647), refers to vendor_check.type_of_vc_array} <br>
     * @return The value of typeOfVcArray. (NullAllowed)
     * @throws SQLException When it fails to get the value from result set.
     */
    public org.docksidestage.postgresql.mytype.MyArray getTypeOfVcArray() throws SQLException {
        return (org.docksidestage.postgresql.mytype.MyArray)_vtTypeOfVcArray.getValue(_rs, DB_NAME_type_of_vc_array);
    }

    /**
     * [get] type_of_text: {text(2147483647), refers to vendor_check.type_of_text} <br>
     * @return The value of typeOfText. (NullAllowed)
     * @throws SQLException When it fails to get the value from result set.
     */
    public String getTypeOfText() throws SQLException {
        return (String)_vtTypeOfText.getValue(_rs, DB_NAME_type_of_text);
    }

    /**
     * [get] type_of_numeric_integer: {numeric(5), refers to vendor_check.type_of_numeric_integer} <br>
     * @return The value of typeOfNumericInteger. (NullAllowed)
     * @throws SQLException When it fails to get the value from result set.
     */
    public Integer getTypeOfNumericInteger() throws SQLException {
        return (Integer)_vtTypeOfNumericInteger.getValue(_rs, DB_NAME_type_of_numeric_integer);
    }

    /**
     * [get] type_of_numeric_bigint: {numeric(12), refers to vendor_check.type_of_numeric_bigint} <br>
     * @return The value of typeOfNumericBigint. (NullAllowed)
     * @throws SQLException When it fails to get the value from result set.
     */
    public Long getTypeOfNumericBigint() throws SQLException {
        return (Long)_vtTypeOfNumericBigint.getValue(_rs, DB_NAME_type_of_numeric_bigint);
    }

    /**
     * [get] type_of_numeric_decimal: {numeric(5, 3), refers to vendor_check.type_of_numeric_decimal} <br>
     * @return The value of typeOfNumericDecimal. (NullAllowed)
     * @throws SQLException When it fails to get the value from result set.
     */
    public java.math.BigDecimal getTypeOfNumericDecimal() throws SQLException {
        return (java.math.BigDecimal)_vtTypeOfNumericDecimal.getValue(_rs, DB_NAME_type_of_numeric_decimal);
    }

    /**
     * [get] type_of_decimal: {numeric(131089), refers to vendor_check.type_of_decimal} <br>
     * @return The value of typeOfDecimal. (NullAllowed)
     * @throws SQLException When it fails to get the value from result set.
     */
    public java.math.BigDecimal getTypeOfDecimal() throws SQLException {
        return (java.math.BigDecimal)_vtTypeOfDecimal.getValue(_rs, DB_NAME_type_of_decimal);
    }

    /**
     * [get] type_of_int: {int4(10), refers to vendor_check.type_of_int} <br>
     * @return The value of typeOfInt. (NullAllowed)
     * @throws SQLException When it fails to get the value from result set.
     */
    public Integer getTypeOfInt() throws SQLException {
        return (Integer)_vtTypeOfInt.getValue(_rs, DB_NAME_type_of_int);
    }

    /**
     * [get] type_of_int_array: {_int4(10), refers to vendor_check.type_of_int_array} <br>
     * @return The value of typeOfIntArray. (NullAllowed)
     * @throws SQLException When it fails to get the value from result set.
     */
    public org.docksidestage.postgresql.mytype.MyArray getTypeOfIntArray() throws SQLException {
        return (org.docksidestage.postgresql.mytype.MyArray)_vtTypeOfIntArray.getValue(_rs, DB_NAME_type_of_int_array);
    }

    /**
     * [get] type_of_int4: {int4(10), refers to vendor_check.type_of_int4} <br>
     * @return The value of typeOfInt4. (NullAllowed)
     * @throws SQLException When it fails to get the value from result set.
     */
    public Integer getTypeOfInt4() throws SQLException {
        return (Integer)_vtTypeOfInt4.getValue(_rs, DB_NAME_type_of_int4);
    }

    /**
     * [get] type_of_int4_array: {_int4(10), refers to vendor_check.type_of_int4_array} <br>
     * @return The value of typeOfInt4Array. (NullAllowed)
     * @throws SQLException When it fails to get the value from result set.
     */
    public org.docksidestage.postgresql.mytype.MyArray getTypeOfInt4Array() throws SQLException {
        return (org.docksidestage.postgresql.mytype.MyArray)_vtTypeOfInt4Array.getValue(_rs, DB_NAME_type_of_int4_array);
    }

    /**
     * [get] type_of_int8: {int8(19), refers to vendor_check.type_of_int8} <br>
     * @return The value of typeOfInt8. (NullAllowed)
     * @throws SQLException When it fails to get the value from result set.
     */
    public Long getTypeOfInt8() throws SQLException {
        return (Long)_vtTypeOfInt8.getValue(_rs, DB_NAME_type_of_int8);
    }

    /**
     * [get] type_of_int8_array: {_int8(19), refers to vendor_check.type_of_int8_array} <br>
     * @return The value of typeOfInt8Array. (NullAllowed)
     * @throws SQLException When it fails to get the value from result set.
     */
    public org.docksidestage.postgresql.mytype.MyArray getTypeOfInt8Array() throws SQLException {
        return (org.docksidestage.postgresql.mytype.MyArray)_vtTypeOfInt8Array.getValue(_rs, DB_NAME_type_of_int8_array);
    }

    /**
     * [get] type_of_bigint: {int8(19), refers to vendor_check.type_of_bigint} <br>
     * @return The value of typeOfBigint. (NullAllowed)
     * @throws SQLException When it fails to get the value from result set.
     */
    public Long getTypeOfBigint() throws SQLException {
        return (Long)_vtTypeOfBigint.getValue(_rs, DB_NAME_type_of_bigint);
    }

    /**
     * [get] type_of_real: {float4(8, 8), refers to vendor_check.type_of_real} <br>
     * @return The value of typeOfReal. (NullAllowed)
     * @throws SQLException When it fails to get the value from result set.
     */
    public java.math.BigDecimal getTypeOfReal() throws SQLException {
        return (java.math.BigDecimal)_vtTypeOfReal.getValue(_rs, DB_NAME_type_of_real);
    }

    /**
     * [get] type_of_float: {float8(17, 17), refers to vendor_check.type_of_float} <br>
     * @return The value of typeOfFloat. (NullAllowed)
     * @throws SQLException When it fails to get the value from result set.
     */
    public java.math.BigDecimal getTypeOfFloat() throws SQLException {
        return (java.math.BigDecimal)_vtTypeOfFloat.getValue(_rs, DB_NAME_type_of_float);
    }

    /**
     * [get] type_of_money: {money(2147483647), refers to vendor_check.type_of_money} <br>
     * @return The value of typeOfMoney. (NullAllowed)
     * @throws SQLException When it fails to get the value from result set.
     */
    public java.math.BigDecimal getTypeOfMoney() throws SQLException {
        return (java.math.BigDecimal)_vtTypeOfMoney.getValue(_rs, DB_NAME_type_of_money);
    }

    /**
     * [get] type_of_date: {date(13), refers to vendor_check.type_of_date} <br>
     * @return The value of typeOfDate. (NullAllowed)
     * @throws SQLException When it fails to get the value from result set.
     */
    public java.time.LocalDate getTypeOfDate() throws SQLException {
        return (java.time.LocalDate)_vtTypeOfDate.getValue(_rs, DB_NAME_type_of_date);
    }

    /**
     * [get] type_of_timestamp: {timestamp(29, 6), refers to vendor_check.type_of_timestamp} <br>
     * @return The value of typeOfTimestamp. (NullAllowed)
     * @throws SQLException When it fails to get the value from result set.
     */
    public java.time.LocalDateTime getTypeOfTimestamp() throws SQLException {
        return (java.time.LocalDateTime)_vtTypeOfTimestamp.getValue(_rs, DB_NAME_type_of_timestamp);
    }

    /**
     * [get] type_of_time: {time(15, 6), refers to vendor_check.type_of_time} <br>
     * @return The value of typeOfTime. (NullAllowed)
     * @throws SQLException When it fails to get the value from result set.
     */
    public java.time.LocalTime getTypeOfTime() throws SQLException {
        return (java.time.LocalTime)_vtTypeOfTime.getValue(_rs, DB_NAME_type_of_time);
    }

    /**
     * [get] type_of_timetz: {timetz(21, 6), refers to vendor_check.type_of_timetz} <br>
     * @return The value of typeOfTimetz. (NullAllowed)
     * @throws SQLException When it fails to get the value from result set.
     */
    public java.time.LocalTime getTypeOfTimetz() throws SQLException {
        return (java.time.LocalTime)_vtTypeOfTimetz.getValue(_rs, DB_NAME_type_of_timetz);
    }

    /**
     * [get] type_of_interval: {interval(49, 6), refers to vendor_check.type_of_interval} <br>
     * @return The value of typeOfInterval. (NullAllowed)
     * @throws SQLException When it fails to get the value from result set.
     */
    public String getTypeOfInterval() throws SQLException {
        return (String)_vtTypeOfInterval.getValue(_rs, DB_NAME_type_of_interval);
    }

    /**
     * [get] type_of_bool: {bool(1), refers to vendor_check.type_of_bool, classification=TrueFalse} <br>
     * @return The value of typeOfBool. (NullAllowed)
     * @throws SQLException When it fails to get the value from result set.
     */
    public Boolean getTypeOfBool() throws SQLException {
        return (Boolean)_vtTypeOfBool.getValue(_rs, DB_NAME_type_of_bool);
    }

    /**
     * [get] type_of_bit: {bit(1), refers to vendor_check.type_of_bit} <br>
     * @return The value of typeOfBit. (NullAllowed)
     * @throws SQLException When it fails to get the value from result set.
     */
    public Boolean getTypeOfBit() throws SQLException {
        return (Boolean)_vtTypeOfBit.getValue(_rs, DB_NAME_type_of_bit);
    }

    /**
     * [get] type_of_bytea: {bytea(2147483647), refers to vendor_check.type_of_bytea} <br>
     * @return The value of typeOfBytea. (NullAllowed)
     * @throws SQLException When it fails to get the value from result set.
     */
    public byte[] getTypeOfBytea() throws SQLException {
        return (byte[])_vtTypeOfBytea.getValue(_rs, DB_NAME_type_of_bytea);
    }

    /**
     * [get] type_of_oid: {oid(10), refers to vendor_check.type_of_oid} <br>
     * @return The value of typeOfOid. (NullAllowed)
     * @throws SQLException When it fails to get the value from result set.
     */
    public byte[] getTypeOfOid() throws SQLException {
        return (byte[])_vtTypeOfOid.getValue(_rs, DB_NAME_type_of_oid);
    }

    /**
     * [get] type_of_uuid: {uuid(2147483647), refers to vendor_check.type_of_uuid} <br>
     * @return The value of typeOfUuid. (NullAllowed)
     * @throws SQLException When it fails to get the value from result set.
     */
    public java.util.UUID getTypeOfUuid() throws SQLException {
        return (java.util.UUID)_vtTypeOfUuid.getValue(_rs, DB_NAME_type_of_uuid);
    }

    /**
     * [get] type_of_xml: {xml(2147483647), refers to vendor_check.type_of_xml} <br>
     * @return The value of typeOfXml. (NullAllowed)
     * @throws SQLException When it fails to get the value from result set.
     */
    public org.docksidestage.postgresql.mytype.MyXML getTypeOfXml() throws SQLException {
        return (org.docksidestage.postgresql.mytype.MyXML)_vtTypeOfXml.getValue(_rs, DB_NAME_type_of_xml);
    }

    /**
     * [get] type_of_json: {json(2147483647), refers to vendor_check.type_of_json} <br>
     * @return The value of typeOfJson. (NullAllowed)
     * @throws SQLException When it fails to get the value from result set.
     */
    public org.docksidestage.postgresql.mytype.MyJSON getTypeOfJson() throws SQLException {
        return (org.docksidestage.postgresql.mytype.MyJSON)_vtTypeOfJson.getValue(_rs, DB_NAME_type_of_json);
    }
}
