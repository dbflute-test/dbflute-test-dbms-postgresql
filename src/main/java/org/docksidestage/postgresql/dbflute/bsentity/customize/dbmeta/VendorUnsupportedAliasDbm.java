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
 * The DB meta of VendorUnsupportedAlias. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class VendorUnsupportedAliasDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final VendorUnsupportedAliasDbm _instance = new VendorUnsupportedAliasDbm();
    private VendorUnsupportedAliasDbm() {}
    public static VendorUnsupportedAliasDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((VendorUnsupportedAlias)et).getVendorCheckId(), (et, vl) -> ((VendorUnsupportedAlias)et).setVendorCheckId(ctl(vl)), "vendorCheckId");
        setupEpg(_epgMap, et -> ((VendorUnsupportedAlias)et).getHyphen_exists(), (et, vl) -> ((VendorUnsupportedAlias)et).setHyphen_exists((String)vl), "hyphen_exists");
        setupEpg(_epgMap, et -> ((VendorUnsupportedAlias)et).getSpace_exists(), (et, vl) -> ((VendorUnsupportedAlias)et).setSpace_exists(cti(vl)), "space_exists");
        setupEpg(_epgMap, et -> ((VendorUnsupportedAlias)et).getDollar$exists(), (et, vl) -> ((VendorUnsupportedAlias)et).setDollar$exists(ctld(vl)), "dollar$exists");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "VendorUnsupportedAlias";
    protected final String _tablePropertyName = "vendorUnsupportedAlias";
    protected final TableSqlName _tableSqlName = new TableSqlName("VendorUnsupportedAlias", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnVendorCheckId = cci("vendor_check_id", "vendor_check_id", null, null, Long.class, "vendorCheckId", null, false, false, false, "numeric", 16, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHyphen_exists = cci("HYPHEN-EXISTS", "\"HYPHEN-EXISTS\"", null, null, String.class, "hyphen_exists", null, false, false, false, "varchar", 2147483647, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpace_exists = cci("SPACE EXISTS", "\"SPACE EXISTS\"", null, null, Integer.class, "space_exists", null, false, false, false, "int4", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDollar$exists = cci("DOLLAR$EXISTS", "DOLLAR$EXISTS", null, null, java.time.LocalDate.class, "dollar$exists", null, false, false, false, "date", 13, 0, null, false, null, null, null, null, null, false);

    /**
     * vendor_check_id: {numeric(16), refers to vendor_check.vendor_check_id}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVendorCheckId() { return _columnVendorCheckId; }
    /**
     * HYPHEN-EXISTS: {varchar(2147483647), refers to vendor_check}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHyphen_exists() { return _columnHyphen_exists; }
    /**
     * SPACE EXISTS: {int4(10), refers to vendor_check}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSpace_exists() { return _columnSpace_exists; }
    /**
     * DOLLAR$EXISTS: {date(13), refers to vendor_check}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDollar$exists() { return _columnDollar$exists; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnVendorCheckId());
        ls.add(columnHyphen_exists());
        ls.add(columnSpace_exists());
        ls.add(columnDollar$exists());
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
    public String getEntityTypeName() { return "org.docksidestage.postgresql.dbflute.exentity.customize.VendorUnsupportedAlias"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<VendorUnsupportedAlias> getEntityType() { return VendorUnsupportedAlias.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public VendorUnsupportedAlias newEntity() { return new VendorUnsupportedAlias(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((VendorUnsupportedAlias)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((VendorUnsupportedAlias)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
