package org.docksidestage.postgresql.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.docksidestage.postgresql.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.postgresql.dbflute.exentity.*;

/**
 * The entity of white_type_mapping_point as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteTypeMappingPoint extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** type_mapping_point_id: {PK, NotNull, int8(19)} */
    protected Long _typeMappingPointId;

    /** type_mapping_point_name: {varchar(200)} */
    protected String _typeMappingPointName;

    /** normal_integer: {int4(10)} */
    protected Integer _normalInteger;

    /** normal_long: {int8(19)} */
    protected Long _normalLong;

    /** normal_date: {date(13)} */
    protected java.time.LocalDate _normalDate;

    /** normal_datetime: {timestamp(26, 3)} */
    protected java.time.LocalDateTime _normalDatetime;

    /** point_long_integer: {int8(19)} */
    protected Integer _pointLongInteger;

    /** point_datetime_date: {timestamp(26, 3)} */
    protected java.time.LocalDate _pointDatetimeDate;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "white_type_mapping_point";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_typeMappingPointId == null) { return false; }
        return true;
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
        if (obj instanceof BsWhiteTypeMappingPoint) {
            BsWhiteTypeMappingPoint other = (BsWhiteTypeMappingPoint)obj;
            if (!xSV(_typeMappingPointId, other._typeMappingPointId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _typeMappingPointId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_typeMappingPointId));
        sb.append(dm).append(xfND(_typeMappingPointName));
        sb.append(dm).append(xfND(_normalInteger));
        sb.append(dm).append(xfND(_normalLong));
        sb.append(dm).append(xfND(_normalDate));
        sb.append(dm).append(xfND(_normalDatetime));
        sb.append(dm).append(xfND(_pointLongInteger));
        sb.append(dm).append(xfND(_pointDatetimeDate));
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
    public WhiteTypeMappingPoint clone() {
        return (WhiteTypeMappingPoint)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] type_mapping_point_id: {PK, NotNull, int8(19)} <br>
     * @return The value of the column 'type_mapping_point_id'. (basically NotNull if selected: for the constraint)
     */
    public Long getTypeMappingPointId() {
        checkSpecifiedProperty("typeMappingPointId");
        return _typeMappingPointId;
    }

    /**
     * [set] type_mapping_point_id: {PK, NotNull, int8(19)} <br>
     * @param typeMappingPointId The value of the column 'type_mapping_point_id'. (basically NotNull if update: for the constraint)
     */
    public void setTypeMappingPointId(Long typeMappingPointId) {
        registerModifiedProperty("typeMappingPointId");
        _typeMappingPointId = typeMappingPointId;
    }

    /**
     * [get] type_mapping_point_name: {varchar(200)} <br>
     * @return The value of the column 'type_mapping_point_name'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeMappingPointName() {
        checkSpecifiedProperty("typeMappingPointName");
        return _typeMappingPointName;
    }

    /**
     * [set] type_mapping_point_name: {varchar(200)} <br>
     * @param typeMappingPointName The value of the column 'type_mapping_point_name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeMappingPointName(String typeMappingPointName) {
        registerModifiedProperty("typeMappingPointName");
        _typeMappingPointName = typeMappingPointName;
    }

    /**
     * [get] normal_integer: {int4(10)} <br>
     * @return The value of the column 'normal_integer'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getNormalInteger() {
        checkSpecifiedProperty("normalInteger");
        return _normalInteger;
    }

    /**
     * [set] normal_integer: {int4(10)} <br>
     * @param normalInteger The value of the column 'normal_integer'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNormalInteger(Integer normalInteger) {
        registerModifiedProperty("normalInteger");
        _normalInteger = normalInteger;
    }

    /**
     * [get] normal_long: {int8(19)} <br>
     * @return The value of the column 'normal_long'. (NullAllowed even if selected: for no constraint)
     */
    public Long getNormalLong() {
        checkSpecifiedProperty("normalLong");
        return _normalLong;
    }

    /**
     * [set] normal_long: {int8(19)} <br>
     * @param normalLong The value of the column 'normal_long'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNormalLong(Long normalLong) {
        registerModifiedProperty("normalLong");
        _normalLong = normalLong;
    }

    /**
     * [get] normal_date: {date(13)} <br>
     * @return The value of the column 'normal_date'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDate getNormalDate() {
        checkSpecifiedProperty("normalDate");
        return _normalDate;
    }

    /**
     * [set] normal_date: {date(13)} <br>
     * @param normalDate The value of the column 'normal_date'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNormalDate(java.time.LocalDate normalDate) {
        registerModifiedProperty("normalDate");
        _normalDate = normalDate;
    }

    /**
     * [get] normal_datetime: {timestamp(26, 3)} <br>
     * @return The value of the column 'normal_datetime'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getNormalDatetime() {
        checkSpecifiedProperty("normalDatetime");
        return _normalDatetime;
    }

    /**
     * [set] normal_datetime: {timestamp(26, 3)} <br>
     * @param normalDatetime The value of the column 'normal_datetime'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNormalDatetime(java.time.LocalDateTime normalDatetime) {
        registerModifiedProperty("normalDatetime");
        _normalDatetime = normalDatetime;
    }

    /**
     * [get] point_long_integer: {int8(19)} <br>
     * @return The value of the column 'point_long_integer'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getPointLongInteger() {
        checkSpecifiedProperty("pointLongInteger");
        return _pointLongInteger;
    }

    /**
     * [set] point_long_integer: {int8(19)} <br>
     * @param pointLongInteger The value of the column 'point_long_integer'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPointLongInteger(Integer pointLongInteger) {
        registerModifiedProperty("pointLongInteger");
        _pointLongInteger = pointLongInteger;
    }

    /**
     * [get] point_datetime_date: {timestamp(26, 3)} <br>
     * @return The value of the column 'point_datetime_date'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDate getPointDatetimeDate() {
        checkSpecifiedProperty("pointDatetimeDate");
        return _pointDatetimeDate;
    }

    /**
     * [set] point_datetime_date: {timestamp(26, 3)} <br>
     * @param pointDatetimeDate The value of the column 'point_datetime_date'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPointDatetimeDate(java.time.LocalDate pointDatetimeDate) {
        registerModifiedProperty("pointDatetimeDate");
        _pointDatetimeDate = pointDatetimeDate;
    }
}
