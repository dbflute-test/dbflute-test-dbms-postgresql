package org.docksidestage.postgresql.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import org.docksidestage.postgresql.dbflute.allcommon.*;
import org.docksidestage.postgresql.dbflute.exentity.*;

/**
 * The DB meta of vendor_large_data_ref. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class VendorLargeDataRefDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final VendorLargeDataRefDbm _instance = new VendorLargeDataRefDbm();
    private VendorLargeDataRefDbm() {}
    public static VendorLargeDataRefDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((VendorLargeDataRef)et).getLargeDataRefId(), (et, vl) -> ((VendorLargeDataRef)et).setLargeDataRefId(ctl(vl)), "largeDataRefId");
        setupEpg(_epgMap, et -> ((VendorLargeDataRef)et).getLargeDataId(), (et, vl) -> ((VendorLargeDataRef)et).setLargeDataId(ctl(vl)), "largeDataId");
        setupEpg(_epgMap, et -> ((VendorLargeDataRef)et).getDateIndex(), (et, vl) -> ((VendorLargeDataRef)et).setDateIndex((java.time.LocalDate)vl), "dateIndex");
        setupEpg(_epgMap, et -> ((VendorLargeDataRef)et).getDateNoIndex(), (et, vl) -> ((VendorLargeDataRef)et).setDateNoIndex((java.time.LocalDate)vl), "dateNoIndex");
        setupEpg(_epgMap, et -> ((VendorLargeDataRef)et).getTimestampIndex(), (et, vl) -> ((VendorLargeDataRef)et).setTimestampIndex((java.time.LocalDateTime)vl), "timestampIndex");
        setupEpg(_epgMap, et -> ((VendorLargeDataRef)et).getTimestampNoIndex(), (et, vl) -> ((VendorLargeDataRef)et).setTimestampNoIndex((java.time.LocalDateTime)vl), "timestampNoIndex");
        setupEpg(_epgMap, et -> ((VendorLargeDataRef)et).getNullableDecimalIndex(), (et, vl) -> ((VendorLargeDataRef)et).setNullableDecimalIndex(ctb(vl)), "nullableDecimalIndex");
        setupEpg(_epgMap, et -> ((VendorLargeDataRef)et).getNullableDecimalNoIndex(), (et, vl) -> ((VendorLargeDataRef)et).setNullableDecimalNoIndex(ctb(vl)), "nullableDecimalNoIndex");
        setupEpg(_epgMap, et -> ((VendorLargeDataRef)et).getSelfParentId(), (et, vl) -> ((VendorLargeDataRef)et).setSelfParentId(ctl(vl)), "selfParentId");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    @SuppressWarnings("unchecked")
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((VendorLargeDataRef)et).getVendorLargeData(), (et, vl) -> ((VendorLargeDataRef)et).setVendorLargeData((OptionalEntity<VendorLargeData>)vl), "vendorLargeData");
        setupEfpg(_efpgMap, et -> ((VendorLargeDataRef)et).getVendorLargeDataRefSelf(), (et, vl) -> ((VendorLargeDataRef)et).setVendorLargeDataRefSelf((OptionalEntity<VendorLargeDataRef>)vl), "vendorLargeDataRefSelf");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "vendor_large_data_ref";
    protected final String _tablePropertyName = "vendorLargeDataRef";
    protected final TableSqlName _tableSqlName = new TableSqlName("vendor_large_data_ref", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnLargeDataRefId = cci("large_data_ref_id", "large_data_ref_id", null, null, Long.class, "largeDataRefId", null, true, false, true, "int8", 19, 0, null, false, null, null, null, "vendorLargeDataRefSelfList", null, false);
    protected final ColumnInfo _columnLargeDataId = cci("large_data_id", "large_data_id", null, null, Long.class, "largeDataId", null, false, false, true, "int8", 19, 0, null, false, null, null, "vendorLargeData", null, null, false);
    protected final ColumnInfo _columnDateIndex = cci("date_index", "date_index", null, null, java.time.LocalDate.class, "dateIndex", null, false, false, true, "date", 13, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDateNoIndex = cci("date_no_index", "date_no_index", null, null, java.time.LocalDate.class, "dateNoIndex", null, false, false, true, "date", 13, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTimestampIndex = cci("timestamp_index", "timestamp_index", null, null, java.time.LocalDateTime.class, "timestampIndex", null, false, false, true, "timestamp", 26, 3, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTimestampNoIndex = cci("timestamp_no_index", "timestamp_no_index", null, null, java.time.LocalDateTime.class, "timestampNoIndex", null, false, false, true, "timestamp", 26, 3, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNullableDecimalIndex = cci("nullable_decimal_index", "nullable_decimal_index", null, null, java.math.BigDecimal.class, "nullableDecimalIndex", null, false, false, false, "numeric", 12, 3, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNullableDecimalNoIndex = cci("nullable_decimal_no_index", "nullable_decimal_no_index", null, null, java.math.BigDecimal.class, "nullableDecimalNoIndex", null, false, false, false, "numeric", 12, 3, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSelfParentId = cci("self_parent_id", "self_parent_id", null, null, Long.class, "selfParentId", null, false, false, false, "int8", 19, 0, null, false, null, null, "vendorLargeDataRefSelf", null, null, false);

    /**
     * large_data_ref_id: {PK, NotNull, int8(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLargeDataRefId() { return _columnLargeDataRefId; }
    /**
     * large_data_id: {NotNull, int8(19), FK to vendor_large_data}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLargeDataId() { return _columnLargeDataId; }
    /**
     * date_index: {IX, NotNull, date(13)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDateIndex() { return _columnDateIndex; }
    /**
     * date_no_index: {NotNull, date(13)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDateNoIndex() { return _columnDateNoIndex; }
    /**
     * timestamp_index: {IX, NotNull, timestamp(26, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTimestampIndex() { return _columnTimestampIndex; }
    /**
     * timestamp_no_index: {NotNull, timestamp(26, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTimestampNoIndex() { return _columnTimestampNoIndex; }
    /**
     * nullable_decimal_index: {IX, numeric(12, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNullableDecimalIndex() { return _columnNullableDecimalIndex; }
    /**
     * nullable_decimal_no_index: {numeric(12, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNullableDecimalNoIndex() { return _columnNullableDecimalNoIndex; }
    /**
     * self_parent_id: {int8(19), FK to vendor_large_data_ref}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSelfParentId() { return _columnSelfParentId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnLargeDataRefId());
        ls.add(columnLargeDataId());
        ls.add(columnDateIndex());
        ls.add(columnDateNoIndex());
        ls.add(columnTimestampIndex());
        ls.add(columnTimestampNoIndex());
        ls.add(columnNullableDecimalIndex());
        ls.add(columnNullableDecimalNoIndex());
        ls.add(columnSelfParentId());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnLargeDataRefId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * vendor_large_data by my large_data_id, named 'vendorLargeData'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignVendorLargeData() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLargeDataId(), VendorLargeDataDbm.getInstance().columnLargeDataId());
        return cfi("fk_vendor_large_data_ref_data", "vendorLargeData", this, VendorLargeDataDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "vendorLargeDataRefList", false);
    }
    /**
     * vendor_large_data_ref by my self_parent_id, named 'vendorLargeDataRefSelf'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignVendorLargeDataRefSelf() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSelfParentId(), VendorLargeDataRefDbm.getInstance().columnLargeDataRefId());
        return cfi("fk_vendor_large_data_ref_self", "vendorLargeDataRefSelf", this, VendorLargeDataRefDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "vendorLargeDataRefSelfList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * vendor_large_data_ref by self_parent_id, named 'vendorLargeDataRefSelfList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerVendorLargeDataRefSelfList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLargeDataRefId(), VendorLargeDataRefDbm.getInstance().columnSelfParentId());
        return cri("fk_vendor_large_data_ref_self", "vendorLargeDataRefSelfList", this, VendorLargeDataRefDbm.getInstance(), mp, false, "vendorLargeDataRefSelf");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.postgresql.dbflute.exentity.VendorLargeDataRef"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.postgresql.dbflute.cbean.VendorLargeDataRefCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.postgresql.dbflute.exbhv.VendorLargeDataRefBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<VendorLargeDataRef> getEntityType() { return VendorLargeDataRef.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public VendorLargeDataRef newEntity() { return new VendorLargeDataRef(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((VendorLargeDataRef)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((VendorLargeDataRef)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
