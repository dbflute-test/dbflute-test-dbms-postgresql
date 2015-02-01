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
 * The DB meta of white_compound_pk. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteCompoundPkDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteCompoundPkDbm _instance = new WhiteCompoundPkDbm();
    private WhiteCompoundPkDbm() {}
    public static WhiteCompoundPkDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteCompoundPk)et).getPkFirstId(), (et, vl) -> ((WhiteCompoundPk)et).setPkFirstId(cti(vl)), "pkFirstId");
        setupEpg(_epgMap, et -> ((WhiteCompoundPk)et).getPkSecondId(), (et, vl) -> ((WhiteCompoundPk)et).setPkSecondId(cti(vl)), "pkSecondId");
        setupEpg(_epgMap, et -> ((WhiteCompoundPk)et).getPkName(), (et, vl) -> ((WhiteCompoundPk)et).setPkName((String)vl), "pkName");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_compound_pk";
    protected final String _tableDispName = "white_compound_pk";
    protected final String _tablePropertyName = "whiteCompoundPk";
    protected final TableSqlName _tableSqlName = new TableSqlName("white_compound_pk", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPkFirstId = cci("pk_first_id", "pk_first_id", null, null, Integer.class, "pkFirstId", null, true, false, true, "int4", 10, 0, null, false, null, null, null, "whiteCompoundPkRefList", null, false);
    protected final ColumnInfo _columnPkSecondId = cci("pk_second_id", "pk_second_id", null, null, Integer.class, "pkSecondId", null, true, false, true, "int4", 10, 0, null, false, null, null, null, "whiteCompoundPkRefList", null, false);
    protected final ColumnInfo _columnPkName = cci("pk_name", "pk_name", null, null, String.class, "pkName", null, false, false, true, "varchar", 200, 0, null, false, null, null, null, null, null, false);

    /**
     * pk_first_id: {PK, NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPkFirstId() { return _columnPkFirstId; }
    /**
     * pk_second_id: {PK, NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPkSecondId() { return _columnPkSecondId; }
    /**
     * pk_name: {NotNull, varchar(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPkName() { return _columnPkName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnPkFirstId());
        ls.add(columnPkSecondId());
        ls.add(columnPkName());
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
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnPkFirstId());
        ls.add(columnPkSecondId());
        return hpcpui(ls);
    }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return true; }

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
     * white_compound_pk_ref by ref_first_id, ref_second_id, named 'whiteCompoundPkRefList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWhiteCompoundPkRefList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMapSized(4);
        mp.put(columnPkFirstId(), WhiteCompoundPkRefDbm.getInstance().columnRefFirstId());
        mp.put(columnPkSecondId(), WhiteCompoundPkRefDbm.getInstance().columnRefSecondId());
        return cri("fk_white_compound_pk_ref", "whiteCompoundPkRefList", this, WhiteCompoundPkRefDbm.getInstance(), mp, false, "whiteCompoundPk");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.postgresql.dbflute.exentity.WhiteCompoundPk"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.postgresql.dbflute.cbean.WhiteCompoundPkCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.postgresql.dbflute.exbhv.WhiteCompoundPkBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteCompoundPk> getEntityType() { return WhiteCompoundPk.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteCompoundPk newEntity() { return new WhiteCompoundPk(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteCompoundPk)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteCompoundPk)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
