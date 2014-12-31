package org.docksidestage.postgresql.dbflute.bsentity.customize.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import org.docksidestage.postgresql.dbflute.allcommon.*;
import org.docksidestage.postgresql.dbflute.exentity.customize.*;

/**
 * The DB meta of LargeAutoPaging. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class LargeAutoPagingDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final LargeAutoPagingDbm _instance = new LargeAutoPagingDbm();
    private LargeAutoPagingDbm() {}
    public static LargeAutoPagingDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
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
        setupEpg(_epgMap, et -> ((LargeAutoPaging)et).getLargeDataRefId(), (et, vl) -> ((LargeAutoPaging)et).setLargeDataRefId(ctl(vl)), "largeDataRefId");
        setupEpg(_epgMap, et -> ((LargeAutoPaging)et).getLargeDataId(), (et, vl) -> ((LargeAutoPaging)et).setLargeDataId(ctl(vl)), "largeDataId");
        setupEpg(_epgMap, et -> ((LargeAutoPaging)et).getDateIndex(), (et, vl) -> ((LargeAutoPaging)et).setDateIndex(ctld(vl)), "dateIndex");
        setupEpg(_epgMap, et -> ((LargeAutoPaging)et).getDateNoIndex(), (et, vl) -> ((LargeAutoPaging)et).setDateNoIndex(ctld(vl)), "dateNoIndex");
        setupEpg(_epgMap, et -> ((LargeAutoPaging)et).getTimestampIndex(), (et, vl) -> ((LargeAutoPaging)et).setTimestampIndex(ctldt(vl)), "timestampIndex");
        setupEpg(_epgMap, et -> ((LargeAutoPaging)et).getTimestampNoIndex(), (et, vl) -> ((LargeAutoPaging)et).setTimestampNoIndex(ctldt(vl)), "timestampNoIndex");
        setupEpg(_epgMap, et -> ((LargeAutoPaging)et).getNullableDecimalIndex(), (et, vl) -> ((LargeAutoPaging)et).setNullableDecimalIndex(ctb(vl)), "nullableDecimalIndex");
        setupEpg(_epgMap, et -> ((LargeAutoPaging)et).getNullableDecimalNoIndex(), (et, vl) -> ((LargeAutoPaging)et).setNullableDecimalNoIndex(ctb(vl)), "nullableDecimalNoIndex");
        setupEpg(_epgMap, et -> ((LargeAutoPaging)et).getSelfParentId(), (et, vl) -> ((LargeAutoPaging)et).setSelfParentId(ctl(vl)), "selfParentId");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "LargeAutoPaging";
    protected final String _tablePropertyName = "largeAutoPaging";
    protected final TableSqlName _tableSqlName = new TableSqlName("LargeAutoPaging", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnLargeDataRefId = cci("large_data_ref_id", "large_data_ref_id", null, null, Long.class, "largeDataRefId", null, false, false, false, "int8", 19, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLargeDataId = cci("large_data_id", "large_data_id", null, null, Long.class, "largeDataId", null, false, false, false, "int8", 19, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDateIndex = cci("date_index", "date_index", null, null, java.time.LocalDate.class, "dateIndex", null, false, false, false, "date", 13, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDateNoIndex = cci("date_no_index", "date_no_index", null, null, java.time.LocalDate.class, "dateNoIndex", null, false, false, false, "date", 13, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTimestampIndex = cci("timestamp_index", "timestamp_index", null, null, java.time.LocalDateTime.class, "timestampIndex", null, false, false, false, "timestamp", 26, 3, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTimestampNoIndex = cci("timestamp_no_index", "timestamp_no_index", null, null, java.time.LocalDateTime.class, "timestampNoIndex", null, false, false, false, "timestamp", 26, 3, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNullableDecimalIndex = cci("nullable_decimal_index", "nullable_decimal_index", null, null, java.math.BigDecimal.class, "nullableDecimalIndex", null, false, false, false, "numeric", 12, 3, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNullableDecimalNoIndex = cci("nullable_decimal_no_index", "nullable_decimal_no_index", null, null, java.math.BigDecimal.class, "nullableDecimalNoIndex", null, false, false, false, "numeric", 12, 3, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSelfParentId = cci("self_parent_id", "self_parent_id", null, null, Long.class, "selfParentId", null, false, false, false, "int8", 19, 0, null, false, null, null, null, null, null, false);

    /**
     * large_data_ref_id: {int8(19), refers to vendor_large_data_ref.large_data_ref_id}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLargeDataRefId() { return _columnLargeDataRefId; }
    /**
     * large_data_id: {int8(19), refers to vendor_large_data_ref.large_data_id}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLargeDataId() { return _columnLargeDataId; }
    /**
     * date_index: {date(13), refers to vendor_large_data_ref.date_index}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDateIndex() { return _columnDateIndex; }
    /**
     * date_no_index: {date(13), refers to vendor_large_data_ref.date_no_index}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDateNoIndex() { return _columnDateNoIndex; }
    /**
     * timestamp_index: {timestamp(26, 3), refers to vendor_large_data_ref.timestamp_index}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTimestampIndex() { return _columnTimestampIndex; }
    /**
     * timestamp_no_index: {timestamp(26, 3), refers to vendor_large_data_ref.timestamp_no_index}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTimestampNoIndex() { return _columnTimestampNoIndex; }
    /**
     * nullable_decimal_index: {numeric(12, 3), refers to vendor_large_data_ref.nullable_decimal_index}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNullableDecimalIndex() { return _columnNullableDecimalIndex; }
    /**
     * nullable_decimal_no_index: {numeric(12, 3), refers to vendor_large_data_ref.nullable_decimal_no_index}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNullableDecimalNoIndex() { return _columnNullableDecimalNoIndex; }
    /**
     * self_parent_id: {int8(19), refers to vendor_large_data_ref.self_parent_id}
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
    protected UniqueInfo cpui() {
        throw new UnsupportedOperationException("The table does not have primary key: " + getTableDbName());
    }
    public boolean hasPrimaryKey() { return false; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.postgresql.dbflute.exentity.customize.LargeAutoPaging"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<LargeAutoPaging> getEntityType() { return LargeAutoPaging.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public LargeAutoPaging newEntity() { return new LargeAutoPaging(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((LargeAutoPaging)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((LargeAutoPaging)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
