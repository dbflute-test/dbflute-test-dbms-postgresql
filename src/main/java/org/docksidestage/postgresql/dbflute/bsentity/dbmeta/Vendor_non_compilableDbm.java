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
 * The DB meta of VENDOR-NON COMPILABLE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class Vendor_non_compilableDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final Vendor_non_compilableDbm _instance = new Vendor_non_compilableDbm();
    private Vendor_non_compilableDbm() {}
    public static Vendor_non_compilableDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((Vendor_non_compilable)et).getNon_compilable_id(), (et, vl) -> ((Vendor_non_compilable)et).setNon_compilable_id(cti(vl)), "non_compilable_id");
        setupEpg(_epgMap, et -> ((Vendor_non_compilable)et).getNon_compilable_name(), (et, vl) -> ((Vendor_non_compilable)et).setNon_compilable_name((String)vl), "non_compilable_name");
        setupEpg(_epgMap, et -> ((Vendor_non_compilable)et).getParent_id(), (et, vl) -> ((Vendor_non_compilable)et).setParent_id(cti(vl)), "parent_id");
        setupEpg(_epgMap, et -> ((Vendor_non_compilable)et).getNextParentid(), (et, vl) -> ((Vendor_non_compilable)et).setNextParentid(cti(vl)), "nextParentid");
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
        setupEfpg(_efpgMap, et -> ((Vendor_non_compilable)et).getVendor_non_compilableByNextParentidSelf(), (et, vl) -> ((Vendor_non_compilable)et).setVendor_non_compilableByNextParentidSelf((OptionalEntity<Vendor_non_compilable>)vl), "vendor_non_compilableByNextParentidSelf");
        setupEfpg(_efpgMap, et -> ((Vendor_non_compilable)et).getVendor_non_compilableByParent_idSelf(), (et, vl) -> ((Vendor_non_compilable)et).setVendor_non_compilableByParent_idSelf((OptionalEntity<Vendor_non_compilable>)vl), "vendor_non_compilableByParent_idSelf");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "VENDOR-NON COMPILABLE";
    protected final String _tableDispName = "VENDOR-NON COMPILABLE";
    protected final String _tablePropertyName = "vendor_non_compilable";
    protected final TableSqlName _tableSqlName = new TableSqlName("\"VENDOR-NON COMPILABLE\"", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnNon_compilable_id = cci("NON-COMPILABLE ID", "\"NON-COMPILABLE ID\"", null, null, Integer.class, "non_compilable_id", null, true, false, true, "int4", 10, 0, null, null, false, null, null, null, "vendor_non_compilableByNextParentidSelfList,vendor_non_compilableByParent_idSelfList", null, false);
    protected final ColumnInfo _columnNon_compilable_name = cci("NON COMPILABLE-NAME", "\"NON COMPILABLE-NAME\"", null, null, String.class, "non_compilable_name", null, false, false, false, "varchar", 64, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnParent_id = cci("PARENT-ID", "\"PARENT-ID\"", null, null, Integer.class, "parent_id", null, false, false, false, "int4", 10, 0, null, null, false, null, null, "vendor_non_compilableByParent_idSelf", null, null, false);
    protected final ColumnInfo _columnNextParentid = cci("Next_ParentID", "\"Next_ParentID\"", null, null, Integer.class, "nextParentid", null, false, false, false, "int4", 10, 0, null, null, false, null, null, "vendor_non_compilableByNextParentidSelf", null, null, false);

    /**
     * NON-COMPILABLE ID: {PK, NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNon_compilable_id() { return _columnNon_compilable_id; }
    /**
     * NON COMPILABLE-NAME: {varchar(64)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNon_compilable_name() { return _columnNon_compilable_name; }
    /**
     * PARENT-ID: {int4(10), FK to VENDOR-NON COMPILABLE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnParent_id() { return _columnParent_id; }
    /**
     * Next_ParentID: {IX, int4(10), FK to VENDOR-NON COMPILABLE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNextParentid() { return _columnNextParentid; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnNon_compilable_id());
        ls.add(columnNon_compilable_name());
        ls.add(columnParent_id());
        ls.add(columnNextParentid());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnNon_compilable_id()); }
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
     * VENDOR-NON COMPILABLE by my Next_ParentID, named 'vendor_non_compilableByNextParentidSelf'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignVendor_non_compilableByNextParentidSelf() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnNextParentid(), Vendor_non_compilableDbm.getInstance().columnNon_compilable_id());
        return cfi("Fk_Vendor_ForeignKey_NAME_CaseCrisis", "vendor_non_compilableByNextParentidSelf", this, Vendor_non_compilableDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "vendor_non_compilableByNextParentidSelfList", false);
    }
    /**
     * VENDOR-NON COMPILABLE by my PARENT-ID, named 'vendor_non_compilableByParent_idSelf'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignVendor_non_compilableByParent_idSelf() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnParent_id(), Vendor_non_compilableDbm.getInstance().columnNon_compilable_id());
        return cfi("fk_vendor_non_comppilable_self", "vendor_non_compilableByParent_idSelf", this, Vendor_non_compilableDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "vendor_non_compilableByParent_idSelfList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * VENDOR-NON COMPILABLE by Next_ParentID, named 'vendor_non_compilableByNextParentidSelfList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerVendor_non_compilableByNextParentidSelfList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnNon_compilable_id(), Vendor_non_compilableDbm.getInstance().columnNextParentid());
        return cri("Fk_Vendor_ForeignKey_NAME_CaseCrisis", "vendor_non_compilableByNextParentidSelfList", this, Vendor_non_compilableDbm.getInstance(), mp, false, "vendor_non_compilableByNextParentidSelf");
    }
    /**
     * VENDOR-NON COMPILABLE by PARENT-ID, named 'vendor_non_compilableByParent_idSelfList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerVendor_non_compilableByParent_idSelfList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnNon_compilable_id(), Vendor_non_compilableDbm.getInstance().columnParent_id());
        return cri("fk_vendor_non_comppilable_self", "vendor_non_compilableByParent_idSelfList", this, Vendor_non_compilableDbm.getInstance(), mp, false, "vendor_non_compilableByParent_idSelf");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.postgresql.dbflute.exentity.Vendor_non_compilable"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.postgresql.dbflute.cbean.Vendor_non_compilableCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.postgresql.dbflute.exbhv.Vendor_non_compilableBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Vendor_non_compilable> getEntityType() { return Vendor_non_compilable.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Vendor_non_compilable newEntity() { return new Vendor_non_compilable(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Vendor_non_compilable)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Vendor_non_compilable)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
