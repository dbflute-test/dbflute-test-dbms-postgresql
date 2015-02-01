package org.docksidestage.postgresql.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import org.docksidestage.postgresql.dbflute.exentity.customize.*;

/**
 * The entity of LargeManualPaging. <br>
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     large_data_ref_id, large_data_id, date_index, date_no_index, timestamp_index, timestamp_no_index, nullable_decimal_index, nullable_decimal_no_index, self_parent_id
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
 * Long largeDataRefId = entity.getLargeDataRefId();
 * Long largeDataId = entity.getLargeDataId();
 * java.time.LocalDate dateIndex = entity.getDateIndex();
 * java.time.LocalDate dateNoIndex = entity.getDateNoIndex();
 * java.time.LocalDateTime timestampIndex = entity.getTimestampIndex();
 * java.time.LocalDateTime timestampNoIndex = entity.getTimestampNoIndex();
 * java.math.BigDecimal nullableDecimalIndex = entity.getNullableDecimalIndex();
 * java.math.BigDecimal nullableDecimalNoIndex = entity.getNullableDecimalNoIndex();
 * Long selfParentId = entity.getSelfParentId();
 * entity.setLargeDataRefId(largeDataRefId);
 * entity.setLargeDataId(largeDataId);
 * entity.setDateIndex(dateIndex);
 * entity.setDateNoIndex(dateNoIndex);
 * entity.setTimestampIndex(timestampIndex);
 * entity.setTimestampNoIndex(timestampNoIndex);
 * entity.setNullableDecimalIndex(nullableDecimalIndex);
 * entity.setNullableDecimalNoIndex(nullableDecimalNoIndex);
 * entity.setSelfParentId(selfParentId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsLargeManualPaging extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** large_data_ref_id: {int8(19), refers to vendor_large_data_ref.large_data_ref_id} */
    protected Long _largeDataRefId;

    /** large_data_id: {int8(19), refers to vendor_large_data_ref.large_data_id} */
    protected Long _largeDataId;

    /** date_index: {date(13), refers to vendor_large_data_ref.date_index} */
    protected java.time.LocalDate _dateIndex;

    /** date_no_index: {date(13), refers to vendor_large_data_ref.date_no_index} */
    protected java.time.LocalDate _dateNoIndex;

    /** timestamp_index: {timestamp(26, 3), refers to vendor_large_data_ref.timestamp_index} */
    protected java.time.LocalDateTime _timestampIndex;

    /** timestamp_no_index: {timestamp(26, 3), refers to vendor_large_data_ref.timestamp_no_index} */
    protected java.time.LocalDateTime _timestampNoIndex;

    /** nullable_decimal_index: {numeric(12, 3), refers to vendor_large_data_ref.nullable_decimal_index} */
    protected java.math.BigDecimal _nullableDecimalIndex;

    /** nullable_decimal_no_index: {numeric(12, 3), refers to vendor_large_data_ref.nullable_decimal_no_index} */
    protected java.math.BigDecimal _nullableDecimalNoIndex;

    /** self_parent_id: {int8(19), refers to vendor_large_data_ref.self_parent_id} */
    protected Long _selfParentId;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return org.docksidestage.postgresql.dbflute.bsentity.customize.dbmeta.LargeManualPagingDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "LargeManualPaging";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        return false;
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
        if (obj instanceof BsLargeManualPaging) {
            BsLargeManualPaging other = (BsLargeManualPaging)obj;
            if (!xSV(_largeDataRefId, other._largeDataRefId)) { return false; }
            if (!xSV(_largeDataId, other._largeDataId)) { return false; }
            if (!xSV(_dateIndex, other._dateIndex)) { return false; }
            if (!xSV(_dateNoIndex, other._dateNoIndex)) { return false; }
            if (!xSV(_timestampIndex, other._timestampIndex)) { return false; }
            if (!xSV(_timestampNoIndex, other._timestampNoIndex)) { return false; }
            if (!xSV(_nullableDecimalIndex, other._nullableDecimalIndex)) { return false; }
            if (!xSV(_nullableDecimalNoIndex, other._nullableDecimalNoIndex)) { return false; }
            if (!xSV(_selfParentId, other._selfParentId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _largeDataRefId);
        hs = xCH(hs, _largeDataId);
        hs = xCH(hs, _dateIndex);
        hs = xCH(hs, _dateNoIndex);
        hs = xCH(hs, _timestampIndex);
        hs = xCH(hs, _timestampNoIndex);
        hs = xCH(hs, _nullableDecimalIndex);
        hs = xCH(hs, _nullableDecimalNoIndex);
        hs = xCH(hs, _selfParentId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_largeDataRefId));
        sb.append(dm).append(xfND(_largeDataId));
        sb.append(dm).append(xfND(_dateIndex));
        sb.append(dm).append(xfND(_dateNoIndex));
        sb.append(dm).append(xfND(_timestampIndex));
        sb.append(dm).append(xfND(_timestampNoIndex));
        sb.append(dm).append(xfND(_nullableDecimalIndex));
        sb.append(dm).append(xfND(_nullableDecimalNoIndex));
        sb.append(dm).append(xfND(_selfParentId));
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
    public LargeManualPaging clone() {
        return (LargeManualPaging)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] large_data_ref_id: {int8(19), refers to vendor_large_data_ref.large_data_ref_id} <br>
     * @return The value of the column 'large_data_ref_id'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLargeDataRefId() {
        checkSpecifiedProperty("largeDataRefId");
        return _largeDataRefId;
    }

    /**
     * [set] large_data_ref_id: {int8(19), refers to vendor_large_data_ref.large_data_ref_id} <br>
     * @param largeDataRefId The value of the column 'large_data_ref_id'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLargeDataRefId(Long largeDataRefId) {
        registerModifiedProperty("largeDataRefId");
        _largeDataRefId = largeDataRefId;
    }

    /**
     * [get] large_data_id: {int8(19), refers to vendor_large_data_ref.large_data_id} <br>
     * @return The value of the column 'large_data_id'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLargeDataId() {
        checkSpecifiedProperty("largeDataId");
        return _largeDataId;
    }

    /**
     * [set] large_data_id: {int8(19), refers to vendor_large_data_ref.large_data_id} <br>
     * @param largeDataId The value of the column 'large_data_id'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLargeDataId(Long largeDataId) {
        registerModifiedProperty("largeDataId");
        _largeDataId = largeDataId;
    }

    /**
     * [get] date_index: {date(13), refers to vendor_large_data_ref.date_index} <br>
     * @return The value of the column 'date_index'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDate getDateIndex() {
        checkSpecifiedProperty("dateIndex");
        return _dateIndex;
    }

    /**
     * [set] date_index: {date(13), refers to vendor_large_data_ref.date_index} <br>
     * @param dateIndex The value of the column 'date_index'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDateIndex(java.time.LocalDate dateIndex) {
        registerModifiedProperty("dateIndex");
        _dateIndex = dateIndex;
    }

    /**
     * [get] date_no_index: {date(13), refers to vendor_large_data_ref.date_no_index} <br>
     * @return The value of the column 'date_no_index'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDate getDateNoIndex() {
        checkSpecifiedProperty("dateNoIndex");
        return _dateNoIndex;
    }

    /**
     * [set] date_no_index: {date(13), refers to vendor_large_data_ref.date_no_index} <br>
     * @param dateNoIndex The value of the column 'date_no_index'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDateNoIndex(java.time.LocalDate dateNoIndex) {
        registerModifiedProperty("dateNoIndex");
        _dateNoIndex = dateNoIndex;
    }

    /**
     * [get] timestamp_index: {timestamp(26, 3), refers to vendor_large_data_ref.timestamp_index} <br>
     * @return The value of the column 'timestamp_index'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getTimestampIndex() {
        checkSpecifiedProperty("timestampIndex");
        return _timestampIndex;
    }

    /**
     * [set] timestamp_index: {timestamp(26, 3), refers to vendor_large_data_ref.timestamp_index} <br>
     * @param timestampIndex The value of the column 'timestamp_index'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTimestampIndex(java.time.LocalDateTime timestampIndex) {
        registerModifiedProperty("timestampIndex");
        _timestampIndex = timestampIndex;
    }

    /**
     * [get] timestamp_no_index: {timestamp(26, 3), refers to vendor_large_data_ref.timestamp_no_index} <br>
     * @return The value of the column 'timestamp_no_index'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getTimestampNoIndex() {
        checkSpecifiedProperty("timestampNoIndex");
        return _timestampNoIndex;
    }

    /**
     * [set] timestamp_no_index: {timestamp(26, 3), refers to vendor_large_data_ref.timestamp_no_index} <br>
     * @param timestampNoIndex The value of the column 'timestamp_no_index'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTimestampNoIndex(java.time.LocalDateTime timestampNoIndex) {
        registerModifiedProperty("timestampNoIndex");
        _timestampNoIndex = timestampNoIndex;
    }

    /**
     * [get] nullable_decimal_index: {numeric(12, 3), refers to vendor_large_data_ref.nullable_decimal_index} <br>
     * @return The value of the column 'nullable_decimal_index'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getNullableDecimalIndex() {
        checkSpecifiedProperty("nullableDecimalIndex");
        return _nullableDecimalIndex;
    }

    /**
     * [set] nullable_decimal_index: {numeric(12, 3), refers to vendor_large_data_ref.nullable_decimal_index} <br>
     * @param nullableDecimalIndex The value of the column 'nullable_decimal_index'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNullableDecimalIndex(java.math.BigDecimal nullableDecimalIndex) {
        registerModifiedProperty("nullableDecimalIndex");
        _nullableDecimalIndex = nullableDecimalIndex;
    }

    /**
     * [get] nullable_decimal_no_index: {numeric(12, 3), refers to vendor_large_data_ref.nullable_decimal_no_index} <br>
     * @return The value of the column 'nullable_decimal_no_index'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getNullableDecimalNoIndex() {
        checkSpecifiedProperty("nullableDecimalNoIndex");
        return _nullableDecimalNoIndex;
    }

    /**
     * [set] nullable_decimal_no_index: {numeric(12, 3), refers to vendor_large_data_ref.nullable_decimal_no_index} <br>
     * @param nullableDecimalNoIndex The value of the column 'nullable_decimal_no_index'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNullableDecimalNoIndex(java.math.BigDecimal nullableDecimalNoIndex) {
        registerModifiedProperty("nullableDecimalNoIndex");
        _nullableDecimalNoIndex = nullableDecimalNoIndex;
    }

    /**
     * [get] self_parent_id: {int8(19), refers to vendor_large_data_ref.self_parent_id} <br>
     * @return The value of the column 'self_parent_id'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSelfParentId() {
        checkSpecifiedProperty("selfParentId");
        return _selfParentId;
    }

    /**
     * [set] self_parent_id: {int8(19), refers to vendor_large_data_ref.self_parent_id} <br>
     * @param selfParentId The value of the column 'self_parent_id'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSelfParentId(Long selfParentId) {
        registerModifiedProperty("selfParentId");
        _selfParentId = selfParentId;
    }
}
