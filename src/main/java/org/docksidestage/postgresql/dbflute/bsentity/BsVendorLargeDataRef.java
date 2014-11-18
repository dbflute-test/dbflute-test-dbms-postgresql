package org.docksidestage.postgresql.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import org.docksidestage.postgresql.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.postgresql.dbflute.exentity.*;

/**
 * The entity of vendor_large_data_ref as TABLE. <br>
 * <pre>
 * [primary-key]
 *     large_data_ref_id
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
 *     vendor_large_data, vendor_large_data_ref
 * 
 * [referrer table]
 *     vendor_large_data_ref
 * 
 * [foreign property]
 *     vendorLargeData, vendorLargeDataRefSelf
 * 
 * [referrer property]
 *     vendorLargeDataRefSelfList
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
public abstract class BsVendorLargeDataRef extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** large_data_ref_id: {PK, NotNull, int8(19)} */
    protected Long _largeDataRefId;

    /** large_data_id: {NotNull, int8(19), FK to vendor_large_data} */
    protected Long _largeDataId;

    /** date_index: {IX, NotNull, date(13)} */
    protected java.time.LocalDate _dateIndex;

    /** date_no_index: {NotNull, date(13)} */
    protected java.time.LocalDate _dateNoIndex;

    /** timestamp_index: {IX, NotNull, timestamp(26, 3)} */
    protected java.time.LocalDateTime _timestampIndex;

    /** timestamp_no_index: {NotNull, timestamp(26, 3)} */
    protected java.time.LocalDateTime _timestampNoIndex;

    /** nullable_decimal_index: {IX, numeric(12, 3)} */
    protected java.math.BigDecimal _nullableDecimalIndex;

    /** nullable_decimal_no_index: {numeric(12, 3)} */
    protected java.math.BigDecimal _nullableDecimalNoIndex;

    /** self_parent_id: {int8(19), FK to vendor_large_data_ref} */
    protected Long _selfParentId;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "vendor_large_data_ref";
    }

    // ===================================================================================
    //                                                                         Primary Key
    //                                                                         ===========
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_largeDataRefId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** vendor_large_data by my large_data_id, named 'vendorLargeData'. */
    protected OptionalEntity<VendorLargeData> _vendorLargeData;

    /**
     * [get] vendor_large_data by my large_data_id, named 'vendorLargeData'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'vendorLargeData'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<VendorLargeData> getVendorLargeData() {
        if (_vendorLargeData == null) { _vendorLargeData = OptionalEntity.relationEmpty(this, "vendorLargeData"); }
        return _vendorLargeData;
    }

    /**
     * [set] vendor_large_data by my large_data_id, named 'vendorLargeData'.
     * @param vendorLargeData The entity of foreign property 'vendorLargeData'. (NullAllowed)
     */
    public void setVendorLargeData(OptionalEntity<VendorLargeData> vendorLargeData) {
        _vendorLargeData = vendorLargeData;
    }

    /** vendor_large_data_ref by my self_parent_id, named 'vendorLargeDataRefSelf'. */
    protected OptionalEntity<VendorLargeDataRef> _vendorLargeDataRefSelf;

    /**
     * [get] vendor_large_data_ref by my self_parent_id, named 'vendorLargeDataRefSelf'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'vendorLargeDataRefSelf'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<VendorLargeDataRef> getVendorLargeDataRefSelf() {
        if (_vendorLargeDataRefSelf == null) { _vendorLargeDataRefSelf = OptionalEntity.relationEmpty(this, "vendorLargeDataRefSelf"); }
        return _vendorLargeDataRefSelf;
    }

    /**
     * [set] vendor_large_data_ref by my self_parent_id, named 'vendorLargeDataRefSelf'.
     * @param vendorLargeDataRefSelf The entity of foreign property 'vendorLargeDataRefSelf'. (NullAllowed)
     */
    public void setVendorLargeDataRefSelf(OptionalEntity<VendorLargeDataRef> vendorLargeDataRefSelf) {
        _vendorLargeDataRefSelf = vendorLargeDataRefSelf;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** vendor_large_data_ref by self_parent_id, named 'vendorLargeDataRefSelfList'. */
    protected List<VendorLargeDataRef> _vendorLargeDataRefSelfList;

    /**
     * [get] vendor_large_data_ref by self_parent_id, named 'vendorLargeDataRefSelfList'.
     * @return The entity list of referrer property 'vendorLargeDataRefSelfList'. (NotNull: even if no loading, returns empty list)
     */
    public List<VendorLargeDataRef> getVendorLargeDataRefSelfList() {
        if (_vendorLargeDataRefSelfList == null) { _vendorLargeDataRefSelfList = newReferrerList(); }
        return _vendorLargeDataRefSelfList;
    }

    /**
     * [set] vendor_large_data_ref by self_parent_id, named 'vendorLargeDataRefSelfList'.
     * @param vendorLargeDataRefSelfList The entity list of referrer property 'vendorLargeDataRefSelfList'. (NullAllowed)
     */
    public void setVendorLargeDataRefSelfList(List<VendorLargeDataRef> vendorLargeDataRefSelfList) {
        _vendorLargeDataRefSelfList = vendorLargeDataRefSelfList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsVendorLargeDataRef) {
            BsVendorLargeDataRef other = (BsVendorLargeDataRef)obj;
            if (!xSV(_largeDataRefId, other._largeDataRefId)) { return false; }
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
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_vendorLargeData != null && _vendorLargeData.isPresent())
        { sb.append(li).append(xbRDS(_vendorLargeData, "vendorLargeData")); }
        if (_vendorLargeDataRefSelf != null && _vendorLargeDataRefSelf.isPresent())
        { sb.append(li).append(xbRDS(_vendorLargeDataRefSelf, "vendorLargeDataRefSelf")); }
        if (_vendorLargeDataRefSelfList != null) { for (VendorLargeDataRef et : _vendorLargeDataRefSelfList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "vendorLargeDataRefSelfList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
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
        StringBuilder sb = new StringBuilder();
        if (_vendorLargeData != null && _vendorLargeData.isPresent())
        { sb.append(dm).append("vendorLargeData"); }
        if (_vendorLargeDataRefSelf != null && _vendorLargeDataRefSelf.isPresent())
        { sb.append(dm).append("vendorLargeDataRefSelf"); }
        if (_vendorLargeDataRefSelfList != null && !_vendorLargeDataRefSelfList.isEmpty())
        { sb.append(dm).append("vendorLargeDataRefSelfList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public VendorLargeDataRef clone() {
        return (VendorLargeDataRef)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] large_data_ref_id: {PK, NotNull, int8(19)} <br>
     * @return The value of the column 'large_data_ref_id'. (basically NotNull if selected: for the constraint)
     */
    public Long getLargeDataRefId() {
        checkSpecifiedProperty("largeDataRefId");
        return _largeDataRefId;
    }

    /**
     * [set] large_data_ref_id: {PK, NotNull, int8(19)} <br>
     * @param largeDataRefId The value of the column 'large_data_ref_id'. (basically NotNull if update: for the constraint)
     */
    public void setLargeDataRefId(Long largeDataRefId) {
        registerModifiedProperty("largeDataRefId");
        _largeDataRefId = largeDataRefId;
    }

    /**
     * [get] large_data_id: {NotNull, int8(19), FK to vendor_large_data} <br>
     * @return The value of the column 'large_data_id'. (basically NotNull if selected: for the constraint)
     */
    public Long getLargeDataId() {
        checkSpecifiedProperty("largeDataId");
        return _largeDataId;
    }

    /**
     * [set] large_data_id: {NotNull, int8(19), FK to vendor_large_data} <br>
     * @param largeDataId The value of the column 'large_data_id'. (basically NotNull if update: for the constraint)
     */
    public void setLargeDataId(Long largeDataId) {
        registerModifiedProperty("largeDataId");
        _largeDataId = largeDataId;
    }

    /**
     * [get] date_index: {IX, NotNull, date(13)} <br>
     * @return The value of the column 'date_index'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDate getDateIndex() {
        checkSpecifiedProperty("dateIndex");
        return _dateIndex;
    }

    /**
     * [set] date_index: {IX, NotNull, date(13)} <br>
     * @param dateIndex The value of the column 'date_index'. (basically NotNull if update: for the constraint)
     */
    public void setDateIndex(java.time.LocalDate dateIndex) {
        registerModifiedProperty("dateIndex");
        _dateIndex = dateIndex;
    }

    /**
     * [get] date_no_index: {NotNull, date(13)} <br>
     * @return The value of the column 'date_no_index'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDate getDateNoIndex() {
        checkSpecifiedProperty("dateNoIndex");
        return _dateNoIndex;
    }

    /**
     * [set] date_no_index: {NotNull, date(13)} <br>
     * @param dateNoIndex The value of the column 'date_no_index'. (basically NotNull if update: for the constraint)
     */
    public void setDateNoIndex(java.time.LocalDate dateNoIndex) {
        registerModifiedProperty("dateNoIndex");
        _dateNoIndex = dateNoIndex;
    }

    /**
     * [get] timestamp_index: {IX, NotNull, timestamp(26, 3)} <br>
     * @return The value of the column 'timestamp_index'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getTimestampIndex() {
        checkSpecifiedProperty("timestampIndex");
        return _timestampIndex;
    }

    /**
     * [set] timestamp_index: {IX, NotNull, timestamp(26, 3)} <br>
     * @param timestampIndex The value of the column 'timestamp_index'. (basically NotNull if update: for the constraint)
     */
    public void setTimestampIndex(java.time.LocalDateTime timestampIndex) {
        registerModifiedProperty("timestampIndex");
        _timestampIndex = timestampIndex;
    }

    /**
     * [get] timestamp_no_index: {NotNull, timestamp(26, 3)} <br>
     * @return The value of the column 'timestamp_no_index'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getTimestampNoIndex() {
        checkSpecifiedProperty("timestampNoIndex");
        return _timestampNoIndex;
    }

    /**
     * [set] timestamp_no_index: {NotNull, timestamp(26, 3)} <br>
     * @param timestampNoIndex The value of the column 'timestamp_no_index'. (basically NotNull if update: for the constraint)
     */
    public void setTimestampNoIndex(java.time.LocalDateTime timestampNoIndex) {
        registerModifiedProperty("timestampNoIndex");
        _timestampNoIndex = timestampNoIndex;
    }

    /**
     * [get] nullable_decimal_index: {IX, numeric(12, 3)} <br>
     * @return The value of the column 'nullable_decimal_index'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getNullableDecimalIndex() {
        checkSpecifiedProperty("nullableDecimalIndex");
        return _nullableDecimalIndex;
    }

    /**
     * [set] nullable_decimal_index: {IX, numeric(12, 3)} <br>
     * @param nullableDecimalIndex The value of the column 'nullable_decimal_index'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNullableDecimalIndex(java.math.BigDecimal nullableDecimalIndex) {
        registerModifiedProperty("nullableDecimalIndex");
        _nullableDecimalIndex = nullableDecimalIndex;
    }

    /**
     * [get] nullable_decimal_no_index: {numeric(12, 3)} <br>
     * @return The value of the column 'nullable_decimal_no_index'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getNullableDecimalNoIndex() {
        checkSpecifiedProperty("nullableDecimalNoIndex");
        return _nullableDecimalNoIndex;
    }

    /**
     * [set] nullable_decimal_no_index: {numeric(12, 3)} <br>
     * @param nullableDecimalNoIndex The value of the column 'nullable_decimal_no_index'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNullableDecimalNoIndex(java.math.BigDecimal nullableDecimalNoIndex) {
        registerModifiedProperty("nullableDecimalNoIndex");
        _nullableDecimalNoIndex = nullableDecimalNoIndex;
    }

    /**
     * [get] self_parent_id: {int8(19), FK to vendor_large_data_ref} <br>
     * @return The value of the column 'self_parent_id'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSelfParentId() {
        checkSpecifiedProperty("selfParentId");
        return _selfParentId;
    }

    /**
     * [set] self_parent_id: {int8(19), FK to vendor_large_data_ref} <br>
     * @param selfParentId The value of the column 'self_parent_id'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSelfParentId(Long selfParentId) {
        registerModifiedProperty("selfParentId");
        _selfParentId = selfParentId;
    }
}
