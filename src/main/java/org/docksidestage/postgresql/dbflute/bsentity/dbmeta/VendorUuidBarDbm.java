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
 * The DB meta of vendor_uuid_bar. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class VendorUuidBarDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final VendorUuidBarDbm _instance = new VendorUuidBarDbm();
    private VendorUuidBarDbm() {}
    public static VendorUuidBarDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((VendorUuidBar)et).getBarId(), (et, vl) -> ((VendorUuidBar)et).setBarId((java.util.UUID)vl), "barId");
        setupEpg(_epgMap, et -> ((VendorUuidBar)et).getBarName(), (et, vl) -> ((VendorUuidBar)et).setBarName((String)vl), "barName");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "vendor_uuid_bar";
    protected final String _tableDispName = "vendor_uuid_bar";
    protected final String _tablePropertyName = "vendorUuidBar";
    protected final TableSqlName _tableSqlName = new TableSqlName("vendor_uuid_bar", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnBarId = cci("bar_id", "bar_id", null, null, java.util.UUID.class, "barId", null, true, false, true, "uuid", 2147483647, 0, null, null, false, null, null, null, "vendorUuidFooList", null, false);
    protected final ColumnInfo _columnBarName = cci("bar_name", "bar_name", null, null, String.class, "barName", null, false, false, true, "varchar", 2147483647, 0, null, null, false, null, null, null, null, null, false);

    /**
     * bar_id: {PK, NotNull, uuid(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBarId() { return _columnBarId; }
    /**
     * bar_name: {NotNull, varchar(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBarName() { return _columnBarName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnBarId());
        ls.add(columnBarName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnBarId()); }
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
    /**
     * vendor_uuid_foo by bar_id, named 'vendorUuidFooList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerVendorUuidFooList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnBarId(), VendorUuidFooDbm.getInstance().columnBarId());
        return cri("fk_vendor_uuid_foo_bar", "vendorUuidFooList", this, VendorUuidFooDbm.getInstance(), mp, false, "vendorUuidBar");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.postgresql.dbflute.exentity.VendorUuidBar"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.postgresql.dbflute.cbean.VendorUuidBarCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.postgresql.dbflute.exbhv.VendorUuidBarBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<VendorUuidBar> getEntityType() { return VendorUuidBar.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public VendorUuidBar newEntity() { return new VendorUuidBar(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((VendorUuidBar)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((VendorUuidBar)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
