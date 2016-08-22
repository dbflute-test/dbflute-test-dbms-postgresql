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
 * The DB meta of white_compound_pk_wrong_order. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteCompoundPkWrongOrderDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteCompoundPkWrongOrderDbm _instance = new WhiteCompoundPkWrongOrderDbm();
    private WhiteCompoundPkWrongOrderDbm() {}
    public static WhiteCompoundPkWrongOrderDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteCompoundPkWrongOrder)et).getFirstId(), (et, vl) -> ((WhiteCompoundPkWrongOrder)et).setFirstId(cti(vl)), "firstId");
        setupEpg(_epgMap, et -> ((WhiteCompoundPkWrongOrder)et).getSecondId(), (et, vl) -> ((WhiteCompoundPkWrongOrder)et).setSecondId(cti(vl)), "secondId");
        setupEpg(_epgMap, et -> ((WhiteCompoundPkWrongOrder)et).getThirdId(), (et, vl) -> ((WhiteCompoundPkWrongOrder)et).setThirdId(cti(vl)), "thirdId");
        setupEpg(_epgMap, et -> ((WhiteCompoundPkWrongOrder)et).getWrongName(), (et, vl) -> ((WhiteCompoundPkWrongOrder)et).setWrongName((String)vl), "wrongName");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_compound_pk_wrong_order";
    protected final String _tableDispName = "white_compound_pk_wrong_order";
    protected final String _tablePropertyName = "whiteCompoundPkWrongOrder";
    protected final TableSqlName _tableSqlName = new TableSqlName("white_compound_pk_wrong_order", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnFirstId = cci("first_id", "first_id", null, null, Integer.class, "firstId", null, true, false, true, "int4", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSecondId = cci("second_id", "second_id", null, null, Integer.class, "secondId", null, true, false, true, "int4", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnThirdId = cci("third_id", "third_id", null, null, Integer.class, "thirdId", null, true, false, true, "int4", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWrongName = cci("wrong_name", "wrong_name", null, null, String.class, "wrongName", null, false, false, false, "varchar", 200, 0, null, false, null, null, null, null, null, false);

    /**
     * first_id: {PK, NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFirstId() { return _columnFirstId; }
    /**
     * second_id: {PK, NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSecondId() { return _columnSecondId; }
    /**
     * third_id: {PK, NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnThirdId() { return _columnThirdId; }
    /**
     * wrong_name: {varchar(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWrongName() { return _columnWrongName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnFirstId());
        ls.add(columnSecondId());
        ls.add(columnThirdId());
        ls.add(columnWrongName());
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
        ls.add(columnFirstId());
        ls.add(columnThirdId());
        ls.add(columnSecondId());
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

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.postgresql.dbflute.exentity.WhiteCompoundPkWrongOrder"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.postgresql.dbflute.cbean.WhiteCompoundPkWrongOrderCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.postgresql.dbflute.exbhv.WhiteCompoundPkWrongOrderBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteCompoundPkWrongOrder> getEntityType() { return WhiteCompoundPkWrongOrder.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteCompoundPkWrongOrder newEntity() { return new WhiteCompoundPkWrongOrder(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteCompoundPkWrongOrder)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteCompoundPkWrongOrder)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
