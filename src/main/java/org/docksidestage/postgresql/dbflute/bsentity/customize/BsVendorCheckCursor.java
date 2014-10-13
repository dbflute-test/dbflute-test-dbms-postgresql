package org.docksidestage.postgresql.dbflute.bsentity.customize;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.Date;
import java.util.TimeZone;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.MappingValueType;
import org.dbflute.dbmeta.derived.DerivedMappable;
import org.docksidestage.postgresql.dbflute.allcommon.CDef;
import org.docksidestage.postgresql.dbflute.exentity.customize.*;

/**
 * The entity of VendorCheckCursor. <br />
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
public abstract class BsVendorCheckCursor implements Entity, Serializable, Cloneable, DerivedMappable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
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

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The unique-driven properties for this entity. (NotNull) */
    protected final EntityUniqueDrivenProperties __uniqueDrivenProperties = newUniqueDrivenProperties();

    /** The modified properties for this entity. (NotNull) */
    protected final EntityModifiedProperties __modifiedProperties = newModifiedProperties();

    /** The map of derived value, key is alias name. (NullAllowed: lazy-loaded) */
    protected EntityDerivedMap __derivedMap;

    /** Is the entity created by DBFlute select process? */
    protected boolean __createdBySelect;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "VendorCheckCursor";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "vendorCheckCursor";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /**
     * {@inheritDoc}
     */
    public DBMeta getDBMeta() {
        return org.docksidestage.postgresql.dbflute.bsentity.customize.dbmeta.VendorCheckCursorDbm.getInstance();
    }

    // ===================================================================================
    //                                                                         Primary Key
    //                                                                         ===========
    /**
     * {@inheritDoc}
     */
    public boolean hasPrimaryKeyValue() {
        return false;
    }

    /**
     * {@inheritDoc}
     */
    public Set<String> myuniqueDrivenProperties() {
        return __uniqueDrivenProperties.getPropertyNames();
    }

    protected EntityUniqueDrivenProperties newUniqueDrivenProperties() {
        return new EntityUniqueDrivenProperties();
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of typeOfBool as the classification of TrueFalse. <br />
     * type_of_bool: {bool(1), refers to vendor_check.type_of_bool, classification=TrueFalse} <br />
     * boolean type classification
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.TrueFalse getTypeOfBoolAsTrueFalse() {
        return CDef.TrueFalse.codeOf(getTypeOfBool());
    }

    /**
     * Set the value of typeOfBool as the classification of TrueFalse. <br />
     * type_of_bool: {bool(1), refers to vendor_check.type_of_bool, classification=TrueFalse} <br />
     * boolean type classification
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setTypeOfBoolAsTrueFalse(CDef.TrueFalse cdef) {
        setTypeOfBool(cdef != null ? FunCustodial.toBoolean(cdef.code()) : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of typeOfBool as True (true). <br />
     * Yes: means valid
     */
    public void setTypeOfBool_True() {
        setTypeOfBoolAsTrueFalse(CDef.TrueFalse.True);
    }

    /**
     * Set the value of typeOfBool as False (false). <br />
     * No: means invalid
     */
    public void setTypeOfBool_False() {
        setTypeOfBoolAsTrueFalse(CDef.TrueFalse.False);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of typeOfBool True? <br />
     * Yes: means valid
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTypeOfBoolTrue() {
        CDef.TrueFalse cdef = getTypeOfBoolAsTrueFalse();
        return cdef != null ? cdef.equals(CDef.TrueFalse.True) : false;
    }

    /**
     * Is the value of typeOfBool False? <br />
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
    //                                                                 Modified Properties
    //                                                                 ===================
    /**
     * {@inheritDoc}
     */
    public Set<String> modifiedProperties() {
        return __modifiedProperties.getPropertyNames();
    }

    /**
     * {@inheritDoc}
     */
    public void clearModifiedInfo() {
        __modifiedProperties.clear();
    }

    /**
     * {@inheritDoc}
     */
    public boolean hasModification() {
        return !__modifiedProperties.isEmpty();
    }

    protected EntityModifiedProperties newModifiedProperties() {
        return new EntityModifiedProperties();
    }

    // ===================================================================================
    //                                                                     Birthplace Mark
    //                                                                     ===============
    /**
     * {@inheritDoc}
     */
    public void markAsSelect() {
        __createdBySelect = true;
    }

    /**
     * {@inheritDoc}
     */
    public boolean createdBySelect() {
        return __createdBySelect;
    }

    // ===================================================================================
    //                                                                    Derived Mappable
    //                                                                    ================
    /**
     * {@inheritDoc}
     */
    public void registerDerivedValue(String aliasName, Object selectedValue) {
        if (__derivedMap == null) { __derivedMap = newDerivedMap(); }
        __derivedMap.registerDerivedValue(aliasName, selectedValue);
    }

    /**
     * Find the derived value from derived map.
     * <pre>
     * mapping type:
     *  count()      : Integer
     *  max(), min() : (same as property type of the column)
     *  sum(), avg() : BigDecimal
     *
     * e.g. use count()
     *  Integer loginCount = member.derived("$LOGIN_COUNT");
     * </pre>
     * @param <VALUE> The type of the value.
     * @param aliasName The alias name of derived-referrer. (NotNull)
     * @return The derived value found in the map. (NullAllowed: when null selected)
     */
    public <VALUE> VALUE derived(String aliasName) {
        if (__derivedMap == null) { __derivedMap = newDerivedMap(); }
        return __derivedMap.findDerivedValue(aliasName);
    }

    protected EntityDerivedMap newDerivedMap() {
        return new EntityDerivedMap();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * Determine the object is equal with this. <br />
     * If primary-keys or columns of the other are same as this one, returns true.
     * @param obj The object as other entity. (NullAllowed: if null, returns false fixedly)
     * @return Comparing result.
     */
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BsVendorCheckCursor)) { return false; }
        BsVendorCheckCursor other = (BsVendorCheckCursor)obj;
        if (!xSV(getVendorCheckId(), other.getVendorCheckId())) { return false; }
        if (!xSV(getTypeOfChar(), other.getTypeOfChar())) { return false; }
        if (!xSV(getTypeOfVarchar(), other.getTypeOfVarchar())) { return false; }
        if (!xSV(getTypeOfVcArray(), other.getTypeOfVcArray())) { return false; }
        if (!xSV(getTypeOfText(), other.getTypeOfText())) { return false; }
        if (!xSV(getTypeOfNumericInteger(), other.getTypeOfNumericInteger())) { return false; }
        if (!xSV(getTypeOfNumericBigint(), other.getTypeOfNumericBigint())) { return false; }
        if (!xSV(getTypeOfNumericDecimal(), other.getTypeOfNumericDecimal())) { return false; }
        if (!xSV(getTypeOfDecimal(), other.getTypeOfDecimal())) { return false; }
        if (!xSV(getTypeOfInt8(), other.getTypeOfInt8())) { return false; }
        if (!xSV(getTypeOfIntArray(), other.getTypeOfIntArray())) { return false; }
        if (!xSV(getTypeOfInt4(), other.getTypeOfInt4())) { return false; }
        if (!xSV(getTypeOfBigint(), other.getTypeOfBigint())) { return false; }
        if (!xSV(getTypeOfReal(), other.getTypeOfReal())) { return false; }
        if (!xSV(getTypeOfFloat(), other.getTypeOfFloat())) { return false; }
        if (!xSV(getTypeOfMoney(), other.getTypeOfMoney())) { return false; }
        if (!xSV(getTypeOfDate(), other.getTypeOfDate())) { return false; }
        if (!xSV(getTypeOfTimestamp(), other.getTypeOfTimestamp())) { return false; }
        if (!xSV(getTypeOfTime(), other.getTypeOfTime())) { return false; }
        if (!xSV(getTypeOfTimetz(), other.getTypeOfTimetz())) { return false; }
        if (!xSV(getTypeOfInterval(), other.getTypeOfInterval())) { return false; }
        if (!xSV(getTypeOfBool(), other.getTypeOfBool())) { return false; }
        if (!xSV(getTypeOfBit(), other.getTypeOfBit())) { return false; }
        if (!xSV(getTypeOfBytea(), other.getTypeOfBytea())) { return false; }
        if (!xSV(getTypeOfOid(), other.getTypeOfOid())) { return false; }
        if (!xSV(getTypeOfUuid(), other.getTypeOfUuid())) { return false; }
        if (!xSV(getTypeOfXml(), other.getTypeOfXml())) { return false; }
        return true;
    }
    protected boolean xSV(Object v1, Object v2) {
        return FunCustodial.isSameValue(v1, v2);
    }

    /**
     * Calculate the hash-code from primary-keys or columns.
     * @return The hash-code from primary-key or columns.
     */
    public int hashCode() {
        int hs = 17;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, getVendorCheckId());
        hs = xCH(hs, getTypeOfChar());
        hs = xCH(hs, getTypeOfVarchar());
        hs = xCH(hs, getTypeOfVcArray());
        hs = xCH(hs, getTypeOfText());
        hs = xCH(hs, getTypeOfNumericInteger());
        hs = xCH(hs, getTypeOfNumericBigint());
        hs = xCH(hs, getTypeOfNumericDecimal());
        hs = xCH(hs, getTypeOfDecimal());
        hs = xCH(hs, getTypeOfInt8());
        hs = xCH(hs, getTypeOfIntArray());
        hs = xCH(hs, getTypeOfInt4());
        hs = xCH(hs, getTypeOfBigint());
        hs = xCH(hs, getTypeOfReal());
        hs = xCH(hs, getTypeOfFloat());
        hs = xCH(hs, getTypeOfMoney());
        hs = xCH(hs, getTypeOfDate());
        hs = xCH(hs, getTypeOfTimestamp());
        hs = xCH(hs, getTypeOfTime());
        hs = xCH(hs, getTypeOfTimetz());
        hs = xCH(hs, getTypeOfInterval());
        hs = xCH(hs, getTypeOfBool());
        hs = xCH(hs, getTypeOfBit());
        hs = xCH(hs, getTypeOfBytea());
        hs = xCH(hs, getTypeOfOid());
        hs = xCH(hs, getTypeOfUuid());
        hs = xCH(hs, getTypeOfXml());
        return hs;
    }
    protected int xCH(int hs, Object vl) {
        return FunCustodial.calculateHashcode(hs, vl);
    }

    /**
     * {@inheritDoc}
     */
    public int instanceHash() {
        return super.hashCode();
    }

    /**
     * Convert to display string of entity's data. (no relation data)
     * @return The display string of all columns and relation existences. (NotNull)
     */
    public String toString() {
        return buildDisplayString(FunCustodial.toClassTitle(this), true, true);
    }

    /**
     * {@inheritDoc}
     */
    public String toStringWithRelation() {
        StringBuilder sb = new StringBuilder();
        sb.append(toString());
        return sb.toString();
    }

    /**
     * {@inheritDoc}
     */
    public String buildDisplayString(String name, boolean column, boolean relation) {
        StringBuilder sb = new StringBuilder();
        if (name != null) { sb.append(name).append(column || relation ? ":" : ""); }
        if (column) { sb.append(buildColumnString()); }
        if (relation) { sb.append(buildRelationString()); }
        sb.append("@").append(Integer.toHexString(hashCode()));
        return sb.toString();
    }
    protected String buildColumnString() {
        StringBuilder sb = new StringBuilder();
        String dm = ", ";
        sb.append(dm).append(getVendorCheckId());
        sb.append(dm).append(getTypeOfChar());
        sb.append(dm).append(getTypeOfVarchar());
        sb.append(dm).append(getTypeOfVcArray());
        sb.append(dm).append(getTypeOfText());
        sb.append(dm).append(getTypeOfNumericInteger());
        sb.append(dm).append(getTypeOfNumericBigint());
        sb.append(dm).append(getTypeOfNumericDecimal());
        sb.append(dm).append(getTypeOfDecimal());
        sb.append(dm).append(getTypeOfInt8());
        sb.append(dm).append(getTypeOfIntArray());
        sb.append(dm).append(getTypeOfInt4());
        sb.append(dm).append(getTypeOfBigint());
        sb.append(dm).append(getTypeOfReal());
        sb.append(dm).append(getTypeOfFloat());
        sb.append(dm).append(getTypeOfMoney());
        sb.append(dm).append(xfUD(getTypeOfDate()));
        sb.append(dm).append(getTypeOfTimestamp());
        sb.append(dm).append(getTypeOfTime());
        sb.append(dm).append(getTypeOfTimetz());
        sb.append(dm).append(getTypeOfInterval());
        sb.append(dm).append(getTypeOfBool());
        sb.append(dm).append(getTypeOfBit());
        sb.append(dm).append(xfBA(getTypeOfBytea()));
        sb.append(dm).append(xfBA(getTypeOfOid()));
        sb.append(dm).append(getTypeOfUuid());
        sb.append(dm).append(getTypeOfXml());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String xfUD(Date date) { // formatUtilDate()
        return FunCustodial.toStringDate(date, xgDP(), mytimeZone());
    }
    protected String xgDP() { // getDatePattern()
        return "yyyy-MM-dd";
    }
    protected TimeZone mytimeZone() {
        return null; // as default
    }
    protected String xfBA(byte[] bytes) { // formatByteArray()
        return FunCustodial.toStringBytes(bytes);
    }
    protected String buildRelationString() {
        return "";
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public VendorCheckCursor clone() {
        try {
            return (VendorCheckCursor)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] vendor_check_id: {numeric(16), refers to vendor_check.vendor_check_id} <br />
     * @return The value of the column 'vendor_check_id'. (NullAllowed even if selected: for no constraint)
     */
    public Long getVendorCheckId() {
        return _vendorCheckId;
    }

    /**
     * [set] vendor_check_id: {numeric(16), refers to vendor_check.vendor_check_id} <br />
     * @param vendorCheckId The value of the column 'vendor_check_id'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVendorCheckId(Long vendorCheckId) {
        __modifiedProperties.addPropertyName("vendorCheckId");
        _vendorCheckId = vendorCheckId;
    }

    /**
     * [get] type_of_char: {bpchar(3), refers to vendor_check.type_of_char} <br />
     * @return The value of the column 'type_of_char'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfChar() {
        return _typeOfChar;
    }

    /**
     * [set] type_of_char: {bpchar(3), refers to vendor_check.type_of_char} <br />
     * @param typeOfChar The value of the column 'type_of_char'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfChar(String typeOfChar) {
        __modifiedProperties.addPropertyName("typeOfChar");
        _typeOfChar = typeOfChar;
    }

    /**
     * [get] type_of_varchar: {varchar(2147483647), refers to vendor_check.type_of_varchar} <br />
     * @return The value of the column 'type_of_varchar'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfVarchar() {
        return _typeOfVarchar;
    }

    /**
     * [set] type_of_varchar: {varchar(2147483647), refers to vendor_check.type_of_varchar} <br />
     * @param typeOfVarchar The value of the column 'type_of_varchar'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfVarchar(String typeOfVarchar) {
        __modifiedProperties.addPropertyName("typeOfVarchar");
        _typeOfVarchar = typeOfVarchar;
    }

    /**
     * [get] type_of_vc_array: {_varchar(2147483647), refers to vendor_check.type_of_vc_array} <br />
     * @return The value of the column 'type_of_vc_array'. (NullAllowed even if selected: for no constraint)
     */
    public org.docksidestage.postgresql.mytype.MyArray getTypeOfVcArray() {
        return _typeOfVcArray;
    }

    /**
     * [set] type_of_vc_array: {_varchar(2147483647), refers to vendor_check.type_of_vc_array} <br />
     * @param typeOfVcArray The value of the column 'type_of_vc_array'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfVcArray(org.docksidestage.postgresql.mytype.MyArray typeOfVcArray) {
        __modifiedProperties.addPropertyName("typeOfVcArray");
        _typeOfVcArray = typeOfVcArray;
    }

    /**
     * [get] type_of_text: {text(2147483647), refers to vendor_check.type_of_text} <br />
     * @return The value of the column 'type_of_text'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfText() {
        return _typeOfText;
    }

    /**
     * [set] type_of_text: {text(2147483647), refers to vendor_check.type_of_text} <br />
     * @param typeOfText The value of the column 'type_of_text'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfText(String typeOfText) {
        __modifiedProperties.addPropertyName("typeOfText");
        _typeOfText = typeOfText;
    }

    /**
     * [get] type_of_numeric_integer: {numeric(5), refers to vendor_check.type_of_numeric_integer} <br />
     * @return The value of the column 'type_of_numeric_integer'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getTypeOfNumericInteger() {
        return _typeOfNumericInteger;
    }

    /**
     * [set] type_of_numeric_integer: {numeric(5), refers to vendor_check.type_of_numeric_integer} <br />
     * @param typeOfNumericInteger The value of the column 'type_of_numeric_integer'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfNumericInteger(Integer typeOfNumericInteger) {
        __modifiedProperties.addPropertyName("typeOfNumericInteger");
        _typeOfNumericInteger = typeOfNumericInteger;
    }

    /**
     * [get] type_of_numeric_bigint: {numeric(12), refers to vendor_check.type_of_numeric_bigint} <br />
     * @return The value of the column 'type_of_numeric_bigint'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTypeOfNumericBigint() {
        return _typeOfNumericBigint;
    }

    /**
     * [set] type_of_numeric_bigint: {numeric(12), refers to vendor_check.type_of_numeric_bigint} <br />
     * @param typeOfNumericBigint The value of the column 'type_of_numeric_bigint'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfNumericBigint(Long typeOfNumericBigint) {
        __modifiedProperties.addPropertyName("typeOfNumericBigint");
        _typeOfNumericBigint = typeOfNumericBigint;
    }

    /**
     * [get] type_of_numeric_decimal: {numeric(5, 3), refers to vendor_check.type_of_numeric_decimal} <br />
     * @return The value of the column 'type_of_numeric_decimal'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTypeOfNumericDecimal() {
        return _typeOfNumericDecimal;
    }

    /**
     * [set] type_of_numeric_decimal: {numeric(5, 3), refers to vendor_check.type_of_numeric_decimal} <br />
     * @param typeOfNumericDecimal The value of the column 'type_of_numeric_decimal'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfNumericDecimal(java.math.BigDecimal typeOfNumericDecimal) {
        __modifiedProperties.addPropertyName("typeOfNumericDecimal");
        _typeOfNumericDecimal = typeOfNumericDecimal;
    }

    /**
     * [get] type_of_decimal: {numeric(131089), refers to vendor_check.type_of_decimal} <br />
     * @return The value of the column 'type_of_decimal'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTypeOfDecimal() {
        return _typeOfDecimal;
    }

    /**
     * [set] type_of_decimal: {numeric(131089), refers to vendor_check.type_of_decimal} <br />
     * @param typeOfDecimal The value of the column 'type_of_decimal'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfDecimal(java.math.BigDecimal typeOfDecimal) {
        __modifiedProperties.addPropertyName("typeOfDecimal");
        _typeOfDecimal = typeOfDecimal;
    }

    /**
     * [get] type_of_int8: {int8(19), refers to vendor_check.type_of_int8} <br />
     * @return The value of the column 'type_of_int8'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTypeOfInt8() {
        return _typeOfInt8;
    }

    /**
     * [set] type_of_int8: {int8(19), refers to vendor_check.type_of_int8} <br />
     * @param typeOfInt8 The value of the column 'type_of_int8'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfInt8(Long typeOfInt8) {
        __modifiedProperties.addPropertyName("typeOfInt8");
        _typeOfInt8 = typeOfInt8;
    }

    /**
     * [get] type_of_int_array: {_int8(19), refers to vendor_check.type_of_int_array} <br />
     * @return The value of the column 'type_of_int_array'. (NullAllowed even if selected: for no constraint)
     */
    public org.docksidestage.postgresql.mytype.MyArray getTypeOfIntArray() {
        return _typeOfIntArray;
    }

    /**
     * [set] type_of_int_array: {_int8(19), refers to vendor_check.type_of_int_array} <br />
     * @param typeOfIntArray The value of the column 'type_of_int_array'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfIntArray(org.docksidestage.postgresql.mytype.MyArray typeOfIntArray) {
        __modifiedProperties.addPropertyName("typeOfIntArray");
        _typeOfIntArray = typeOfIntArray;
    }

    /**
     * [get] type_of_int4: {int4(10), refers to vendor_check.type_of_int4} <br />
     * @return The value of the column 'type_of_int4'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getTypeOfInt4() {
        return _typeOfInt4;
    }

    /**
     * [set] type_of_int4: {int4(10), refers to vendor_check.type_of_int4} <br />
     * @param typeOfInt4 The value of the column 'type_of_int4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfInt4(Integer typeOfInt4) {
        __modifiedProperties.addPropertyName("typeOfInt4");
        _typeOfInt4 = typeOfInt4;
    }

    /**
     * [get] type_of_bigint: {int8(19), refers to vendor_check.type_of_bigint} <br />
     * @return The value of the column 'type_of_bigint'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTypeOfBigint() {
        return _typeOfBigint;
    }

    /**
     * [set] type_of_bigint: {int8(19), refers to vendor_check.type_of_bigint} <br />
     * @param typeOfBigint The value of the column 'type_of_bigint'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfBigint(Long typeOfBigint) {
        __modifiedProperties.addPropertyName("typeOfBigint");
        _typeOfBigint = typeOfBigint;
    }

    /**
     * [get] type_of_real: {float4(8, 8), refers to vendor_check.type_of_real} <br />
     * @return The value of the column 'type_of_real'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTypeOfReal() {
        return _typeOfReal;
    }

    /**
     * [set] type_of_real: {float4(8, 8), refers to vendor_check.type_of_real} <br />
     * @param typeOfReal The value of the column 'type_of_real'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfReal(java.math.BigDecimal typeOfReal) {
        __modifiedProperties.addPropertyName("typeOfReal");
        _typeOfReal = typeOfReal;
    }

    /**
     * [get] type_of_float: {float8(17, 17), refers to vendor_check.type_of_float} <br />
     * @return The value of the column 'type_of_float'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTypeOfFloat() {
        return _typeOfFloat;
    }

    /**
     * [set] type_of_float: {float8(17, 17), refers to vendor_check.type_of_float} <br />
     * @param typeOfFloat The value of the column 'type_of_float'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfFloat(java.math.BigDecimal typeOfFloat) {
        __modifiedProperties.addPropertyName("typeOfFloat");
        _typeOfFloat = typeOfFloat;
    }

    /**
     * [get] type_of_money: {money(2147483647), refers to vendor_check.type_of_money} <br />
     * @return The value of the column 'type_of_money'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTypeOfMoney() {
        return _typeOfMoney;
    }

    /**
     * [set] type_of_money: {money(2147483647), refers to vendor_check.type_of_money} <br />
     * @param typeOfMoney The value of the column 'type_of_money'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfMoney(java.math.BigDecimal typeOfMoney) {
        __modifiedProperties.addPropertyName("typeOfMoney");
        _typeOfMoney = typeOfMoney;
    }

    /**
     * [get] type_of_date: {date(13), refers to vendor_check.type_of_date} <br />
     * @return The value of the column 'type_of_date'. (NullAllowed even if selected: for no constraint)
     */
    public java.util.Date getTypeOfDate() {
        return _typeOfDate;
    }

    /**
     * [set] type_of_date: {date(13), refers to vendor_check.type_of_date} <br />
     * @param typeOfDate The value of the column 'type_of_date'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfDate(java.util.Date typeOfDate) {
        __modifiedProperties.addPropertyName("typeOfDate");
        _typeOfDate = typeOfDate;
    }

    /**
     * [get] type_of_timestamp: {timestamp(29, 6), refers to vendor_check.type_of_timestamp} <br />
     * @return The value of the column 'type_of_timestamp'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getTypeOfTimestamp() {
        return _typeOfTimestamp;
    }

    /**
     * [set] type_of_timestamp: {timestamp(29, 6), refers to vendor_check.type_of_timestamp} <br />
     * @param typeOfTimestamp The value of the column 'type_of_timestamp'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfTimestamp(java.sql.Timestamp typeOfTimestamp) {
        __modifiedProperties.addPropertyName("typeOfTimestamp");
        _typeOfTimestamp = typeOfTimestamp;
    }

    /**
     * [get] type_of_time: {time(15, 6), refers to vendor_check.type_of_time} <br />
     * @return The value of the column 'type_of_time'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Time getTypeOfTime() {
        return _typeOfTime;
    }

    /**
     * [set] type_of_time: {time(15, 6), refers to vendor_check.type_of_time} <br />
     * @param typeOfTime The value of the column 'type_of_time'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfTime(java.sql.Time typeOfTime) {
        __modifiedProperties.addPropertyName("typeOfTime");
        _typeOfTime = typeOfTime;
    }

    /**
     * [get] type_of_timetz: {timetz(21, 6), refers to vendor_check.type_of_timetz} <br />
     * @return The value of the column 'type_of_timetz'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Time getTypeOfTimetz() {
        return _typeOfTimetz;
    }

    /**
     * [set] type_of_timetz: {timetz(21, 6), refers to vendor_check.type_of_timetz} <br />
     * @param typeOfTimetz The value of the column 'type_of_timetz'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfTimetz(java.sql.Time typeOfTimetz) {
        __modifiedProperties.addPropertyName("typeOfTimetz");
        _typeOfTimetz = typeOfTimetz;
    }

    /**
     * [get] type_of_interval: {interval(49, 6), refers to vendor_check.type_of_interval} <br />
     * @return The value of the column 'type_of_interval'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfInterval() {
        return _typeOfInterval;
    }

    /**
     * [set] type_of_interval: {interval(49, 6), refers to vendor_check.type_of_interval} <br />
     * @param typeOfInterval The value of the column 'type_of_interval'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfInterval(String typeOfInterval) {
        __modifiedProperties.addPropertyName("typeOfInterval");
        _typeOfInterval = typeOfInterval;
    }

    /**
     * [get] type_of_bool: {bool(1), refers to vendor_check.type_of_bool, classification=TrueFalse} <br />
     * @return The value of the column 'type_of_bool'. (NullAllowed even if selected: for no constraint)
     */
    public Boolean getTypeOfBool() {
        return _typeOfBool;
    }

    /**
     * [set] type_of_bool: {bool(1), refers to vendor_check.type_of_bool, classification=TrueFalse} <br />
     * @param typeOfBool The value of the column 'type_of_bool'. (NullAllowed: null update allowed for no constraint)
     */
    protected void setTypeOfBool(Boolean typeOfBool) {
        checkClassificationCode("type_of_bool", CDef.DefMeta.TrueFalse, typeOfBool);
        __modifiedProperties.addPropertyName("typeOfBool");
        _typeOfBool = typeOfBool;
    }

    /**
     * [get] type_of_bit: {bit(1), refers to vendor_check.type_of_bit} <br />
     * @return The value of the column 'type_of_bit'. (NullAllowed even if selected: for no constraint)
     */
    public Boolean getTypeOfBit() {
        return _typeOfBit;
    }

    /**
     * [set] type_of_bit: {bit(1), refers to vendor_check.type_of_bit} <br />
     * @param typeOfBit The value of the column 'type_of_bit'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfBit(Boolean typeOfBit) {
        __modifiedProperties.addPropertyName("typeOfBit");
        _typeOfBit = typeOfBit;
    }

    /**
     * [get] type_of_bytea: {bytea(2147483647), refers to vendor_check.type_of_bytea} <br />
     * @return The value of the column 'type_of_bytea'. (NullAllowed even if selected: for no constraint)
     */
    public byte[] getTypeOfBytea() {
        return _typeOfBytea;
    }

    /**
     * [set] type_of_bytea: {bytea(2147483647), refers to vendor_check.type_of_bytea} <br />
     * @param typeOfBytea The value of the column 'type_of_bytea'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfBytea(byte[] typeOfBytea) {
        __modifiedProperties.addPropertyName("typeOfBytea");
        _typeOfBytea = typeOfBytea;
    }

    /**
     * [get] type_of_oid: {oid(10), refers to vendor_check.type_of_oid} <br />
     * @return The value of the column 'type_of_oid'. (NullAllowed even if selected: for no constraint)
     */
    @MappingValueType(keyName = "bytesOidType")
    public byte[] getTypeOfOid() {
        return _typeOfOid;
    }

    /**
     * [set] type_of_oid: {oid(10), refers to vendor_check.type_of_oid} <br />
     * @param typeOfOid The value of the column 'type_of_oid'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfOid(byte[] typeOfOid) {
        __modifiedProperties.addPropertyName("typeOfOid");
        _typeOfOid = typeOfOid;
    }

    /**
     * [get] type_of_uuid: {uuid(2147483647), refers to vendor_check.type_of_uuid} <br />
     * @return The value of the column 'type_of_uuid'. (NullAllowed even if selected: for no constraint)
     */
    public java.util.UUID getTypeOfUuid() {
        return _typeOfUuid;
    }

    /**
     * [set] type_of_uuid: {uuid(2147483647), refers to vendor_check.type_of_uuid} <br />
     * @param typeOfUuid The value of the column 'type_of_uuid'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfUuid(java.util.UUID typeOfUuid) {
        __modifiedProperties.addPropertyName("typeOfUuid");
        _typeOfUuid = typeOfUuid;
    }

    /**
     * [get] type_of_xml: {xml(2147483647), refers to vendor_check.type_of_xml} <br />
     * @return The value of the column 'type_of_xml'. (NullAllowed even if selected: for no constraint)
     */
    public org.docksidestage.postgresql.mytype.MyXML getTypeOfXml() {
        return _typeOfXml;
    }

    /**
     * [set] type_of_xml: {xml(2147483647), refers to vendor_check.type_of_xml} <br />
     * @param typeOfXml The value of the column 'type_of_xml'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfXml(org.docksidestage.postgresql.mytype.MyXML typeOfXml) {
        __modifiedProperties.addPropertyName("typeOfXml");
        _typeOfXml = typeOfXml;
    }

    /**
     * For framework so basically DON'T use this method.
     * @param typeOfBool The value of the column 'type_of_bool'. (NullAllowed: null update allowed for no constraint)
     */
    public void mynativeMappingTypeOfBool(Boolean typeOfBool) {
        setTypeOfBool(typeOfBool);
    }

    protected void checkClassificationCode(String columnDbName, CDef.DefMeta meta, Object value) {
        FunCustodial.checkClassificationCode(this, columnDbName, meta, value);
    }
}
