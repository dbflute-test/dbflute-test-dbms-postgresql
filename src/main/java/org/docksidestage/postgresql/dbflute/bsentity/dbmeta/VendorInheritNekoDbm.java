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
 * The DB meta of vendor_inherit_neko. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class VendorInheritNekoDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final VendorInheritNekoDbm _instance = new VendorInheritNekoDbm();
    private VendorInheritNekoDbm() {}
    public static VendorInheritNekoDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((VendorInheritNeko)et).getInuId(), (et, vl) -> ((VendorInheritNeko)et).setInuId(cti(vl)), "inuId");
        setupEpg(_epgMap, et -> ((VendorInheritNeko)et).getInuName(), (et, vl) -> ((VendorInheritNeko)et).setInuName((String)vl), "inuName");
        setupEpg(_epgMap, et -> ((VendorInheritNeko)et).getInuDate(), (et, vl) -> ((VendorInheritNeko)et).setInuDate((java.time.LocalDate)vl), "inuDate");
        setupEpg(_epgMap, et -> ((VendorInheritNeko)et).getNekoId(), (et, vl) -> ((VendorInheritNeko)et).setNekoId(cti(vl)), "nekoId");
        setupEpg(_epgMap, et -> ((VendorInheritNeko)et).getNekoName(), (et, vl) -> ((VendorInheritNeko)et).setNekoName((String)vl), "nekoName");
        setupEpg(_epgMap, et -> ((VendorInheritNeko)et).getNekoDate(), (et, vl) -> ((VendorInheritNeko)et).setNekoDate((java.time.LocalDate)vl), "nekoDate");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "vendor_inherit_neko";
    protected final String _tablePropertyName = "vendorInheritNeko";
    protected final TableSqlName _tableSqlName = new TableSqlName("vendor_inherit_neko", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnInuId = cci("inu_id", "inu_id", null, null, Integer.class, "inuId", null, false, false, true, "int4", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInuName = cci("inu_name", "inu_name", null, null, String.class, "inuName", null, false, false, true, "varchar", 2147483647, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInuDate = cci("inu_date", "inu_date", null, null, java.time.LocalDate.class, "inuDate", null, false, false, false, "date", 13, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNekoId = cci("neko_id", "neko_id", null, null, Integer.class, "nekoId", null, true, false, true, "int4", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNekoName = cci("neko_name", "neko_name", null, null, String.class, "nekoName", null, false, false, true, "varchar", 2147483647, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNekoDate = cci("neko_date", "neko_date", null, null, java.time.LocalDate.class, "nekoDate", null, false, false, false, "date", 13, 0, null, false, null, null, null, null, null, false);

    /**
     * inu_id: {NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInuId() { return _columnInuId; }
    /**
     * inu_name: {NotNull, varchar(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInuName() { return _columnInuName; }
    /**
     * inu_date: {date(13)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInuDate() { return _columnInuDate; }
    /**
     * neko_id: {PK, NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNekoId() { return _columnNekoId; }
    /**
     * neko_name: {NotNull, varchar(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNekoName() { return _columnNekoName; }
    /**
     * neko_date: {date(13)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNekoDate() { return _columnNekoDate; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnInuId());
        ls.add(columnInuName());
        ls.add(columnInuDate());
        ls.add(columnNekoId());
        ls.add(columnNekoName());
        ls.add(columnNekoDate());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnNekoId()); }
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
    public String getEntityTypeName() { return "org.docksidestage.postgresql.dbflute.exentity.VendorInheritNeko"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.postgresql.dbflute.cbean.VendorInheritNekoCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.postgresql.dbflute.exbhv.VendorInheritNekoBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<VendorInheritNeko> getEntityType() { return VendorInheritNeko.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public VendorInheritNeko newEntity() { return new VendorInheritNeko(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((VendorInheritNeko)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((VendorInheritNeko)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
