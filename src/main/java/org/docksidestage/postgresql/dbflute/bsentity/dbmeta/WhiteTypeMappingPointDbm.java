package org.docksidestage.postgresql.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import org.docksidestage.postgresql.dbflute.allcommon.*;
import org.docksidestage.postgresql.dbflute.exentity.*;

/**
 * The DB meta of white_type_mapping_point. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteTypeMappingPointDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteTypeMappingPointDbm _instance = new WhiteTypeMappingPointDbm();
    private WhiteTypeMappingPointDbm() {}
    public static WhiteTypeMappingPointDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteTypeMappingPoint)et).getTypeMappingPointId(), (et, vl) -> ((WhiteTypeMappingPoint)et).setTypeMappingPointId(ctl(vl)), "typeMappingPointId");
        setupEpg(_epgMap, et -> ((WhiteTypeMappingPoint)et).getTypeMappingPointName(), (et, vl) -> ((WhiteTypeMappingPoint)et).setTypeMappingPointName((String)vl), "typeMappingPointName");
        setupEpg(_epgMap, et -> ((WhiteTypeMappingPoint)et).getNormalInteger(), (et, vl) -> ((WhiteTypeMappingPoint)et).setNormalInteger(cti(vl)), "normalInteger");
        setupEpg(_epgMap, et -> ((WhiteTypeMappingPoint)et).getNormalLong(), (et, vl) -> ((WhiteTypeMappingPoint)et).setNormalLong(ctl(vl)), "normalLong");
        setupEpg(_epgMap, et -> ((WhiteTypeMappingPoint)et).getNormalDate(), (et, vl) -> ((WhiteTypeMappingPoint)et).setNormalDate(ctld(vl)), "normalDate");
        setupEpg(_epgMap, et -> ((WhiteTypeMappingPoint)et).getNormalDatetime(), (et, vl) -> ((WhiteTypeMappingPoint)et).setNormalDatetime(ctldt(vl)), "normalDatetime");
        setupEpg(_epgMap, et -> ((WhiteTypeMappingPoint)et).getPointLongInteger(), (et, vl) -> ((WhiteTypeMappingPoint)et).setPointLongInteger(cti(vl)), "pointLongInteger");
        setupEpg(_epgMap, et -> ((WhiteTypeMappingPoint)et).getPointDatetimeDate(), (et, vl) -> ((WhiteTypeMappingPoint)et).setPointDatetimeDate(ctld(vl)), "pointDatetimeDate");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_type_mapping_point";
    protected final String _tableDispName = "white_type_mapping_point";
    protected final String _tablePropertyName = "whiteTypeMappingPoint";
    protected final TableSqlName _tableSqlName = new TableSqlName("white_type_mapping_point", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTypeMappingPointId = cci("type_mapping_point_id", "type_mapping_point_id", null, null, Long.class, "typeMappingPointId", null, true, false, true, "int8", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeMappingPointName = cci("type_mapping_point_name", "type_mapping_point_name", null, null, String.class, "typeMappingPointName", null, false, false, false, "varchar", 200, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNormalInteger = cci("normal_integer", "normal_integer", null, null, Integer.class, "normalInteger", null, false, false, false, "int4", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNormalLong = cci("normal_long", "normal_long", null, null, Long.class, "normalLong", null, false, false, false, "int8", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNormalDate = cci("normal_date", "normal_date", null, null, java.time.LocalDate.class, "normalDate", null, false, false, false, "date", 13, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNormalDatetime = cci("normal_datetime", "normal_datetime", null, null, java.time.LocalDateTime.class, "normalDatetime", null, false, false, false, "timestamp", 26, 3, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPointLongInteger = cci("point_long_integer", "point_long_integer", null, null, Integer.class, "pointLongInteger", null, false, false, false, "int8", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPointDatetimeDate = cci("point_datetime_date", "point_datetime_date", null, null, java.time.LocalDate.class, "pointDatetimeDate", null, false, false, false, "timestamp", 26, 3, null, null, false, null, null, null, null, null, false);

    /**
     * type_mapping_point_id: {PK, NotNull, int8(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeMappingPointId() { return _columnTypeMappingPointId; }
    /**
     * type_mapping_point_name: {varchar(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeMappingPointName() { return _columnTypeMappingPointName; }
    /**
     * normal_integer: {int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNormalInteger() { return _columnNormalInteger; }
    /**
     * normal_long: {int8(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNormalLong() { return _columnNormalLong; }
    /**
     * normal_date: {date(13)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNormalDate() { return _columnNormalDate; }
    /**
     * normal_datetime: {timestamp(26, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNormalDatetime() { return _columnNormalDatetime; }
    /**
     * point_long_integer: {int8(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPointLongInteger() { return _columnPointLongInteger; }
    /**
     * point_datetime_date: {timestamp(26, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPointDatetimeDate() { return _columnPointDatetimeDate; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnTypeMappingPointId());
        ls.add(columnTypeMappingPointName());
        ls.add(columnNormalInteger());
        ls.add(columnNormalLong());
        ls.add(columnNormalDate());
        ls.add(columnNormalDatetime());
        ls.add(columnPointLongInteger());
        ls.add(columnPointDatetimeDate());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnTypeMappingPointId()); }
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

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.postgresql.dbflute.exentity.WhiteTypeMappingPoint"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.postgresql.dbflute.cbean.WhiteTypeMappingPointCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.postgresql.dbflute.exbhv.WhiteTypeMappingPointBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteTypeMappingPoint> getEntityType() { return WhiteTypeMappingPoint.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteTypeMappingPoint newEntity() { return new WhiteTypeMappingPoint(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteTypeMappingPoint)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteTypeMappingPoint)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
