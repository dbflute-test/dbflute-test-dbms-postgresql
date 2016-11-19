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
 * The DB meta of VendorWithWith. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class VendorWithWithDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final VendorWithWithDbm _instance = new VendorWithWithDbm();
    private VendorWithWithDbm() {}
    public static VendorWithWithDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((VendorWithWith)et).getVendorCheckId(), (et, vl) -> ((VendorWithWith)et).setVendorCheckId(ctl(vl)), "vendorCheckId");
        setupEpg(_epgMap, et -> ((VendorWithWith)et).getTypeOfVarchar(), (et, vl) -> ((VendorWithWith)et).setTypeOfVarchar((String)vl), "typeOfVarchar");
        setupEpg(_epgMap, et -> ((VendorWithWith)et).getTypeOfNumericInteger(), (et, vl) -> ((VendorWithWith)et).setTypeOfNumericInteger(cti(vl)), "typeOfNumericInteger");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "VendorWithWith";
    protected final String _tableDispName = "VendorWithWith";
    protected final String _tablePropertyName = "vendorWithWith";
    protected final TableSqlName _tableSqlName = new TableSqlName("VendorWithWith", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnVendorCheckId = cci("vendor_check_id", "vendor_check_id", null, null, Long.class, "vendorCheckId", null, false, false, false, "numeric", 16, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfVarchar = cci("type_of_varchar", "type_of_varchar", null, null, String.class, "typeOfVarchar", null, false, false, false, "varchar", 2147483647, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfNumericInteger = cci("type_of_numeric_integer", "type_of_numeric_integer", null, null, Integer.class, "typeOfNumericInteger", null, false, false, false, "numeric", 5, 0, null, false, null, null, null, null, null, false);

    /**
     * vendor_check_id: {numeric(16), refers to vendor_check.vendor_check_id}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVendorCheckId() { return _columnVendorCheckId; }
    /**
     * type_of_varchar: {varchar(2147483647), refers to vendor_check.type_of_varchar}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfVarchar() { return _columnTypeOfVarchar; }
    /**
     * type_of_numeric_integer: {numeric(5), refers to vendor_check.type_of_numeric_integer}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfNumericInteger() { return _columnTypeOfNumericInteger; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnVendorCheckId());
        ls.add(columnTypeOfVarchar());
        ls.add(columnTypeOfNumericInteger());
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
    public String getEntityTypeName() { return "org.docksidestage.postgresql.dbflute.exentity.customize.VendorWithWith"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<VendorWithWith> getEntityType() { return VendorWithWith.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public VendorWithWith newEntity() { return new VendorWithWith(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((VendorWithWith)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((VendorWithWith)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
