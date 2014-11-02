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
 * The DB meta of nextschema.white_same_name. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class NextschemaWhiteSameNameDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final NextschemaWhiteSameNameDbm _instance = new NextschemaWhiteSameNameDbm();
    private NextschemaWhiteSameNameDbm() {}
    public static NextschemaWhiteSameNameDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((NextschemaWhiteSameName)et).getSameNameId(), (et, vl) -> ((NextschemaWhiteSameName)et).setSameNameId(cti(vl)), "sameNameId");
        setupEpg(_epgMap, et -> ((NextschemaWhiteSameName)et).getSameNameName(), (et, vl) -> ((NextschemaWhiteSameName)et).setSameNameName((String)vl), "sameNameName");
        setupEpg(_epgMap, et -> ((NextschemaWhiteSameName)et).getSameNameLong(), (et, vl) -> ((NextschemaWhiteSameName)et).setSameNameLong(ctl(vl)), "sameNameLong");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "nextschema.white_same_name";
    protected final String _tablePropertyName = "whiteSameName";
    protected final TableSqlName _tableSqlName = new TableSqlName("nextschema.white_same_name", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnSameNameId = cci("same_name_id", "same_name_id", null, null, Integer.class, "sameNameId", null, true, false, true, "int4", 10, 0, null, false, null, null, null, "whiteSameNameRefList", null);
    protected final ColumnInfo _columnSameNameName = cci("same_name_name", "same_name_name", null, null, String.class, "sameNameName", null, false, false, false, "varchar", 100, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnSameNameLong = cci("same_name_long", "same_name_long", null, null, Long.class, "sameNameLong", null, false, false, false, "int8", 19, 0, null, false, null, null, null, null, null);

    /**
     * same_name_id: {PK, NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSameNameId() { return _columnSameNameId; }
    /**
     * same_name_name: {varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSameNameName() { return _columnSameNameName; }
    /**
     * same_name_long: {int8(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSameNameLong() { return _columnSameNameLong; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnSameNameId());
        ls.add(columnSameNameName());
        ls.add(columnSameNameLong());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnSameNameId()); }
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
     * nextschema.white_same_name_ref by same_name_id, named 'whiteSameNameRefList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWhiteSameNameRefList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSameNameId(), NextschemaWhiteSameNameRefDbm.getInstance().columnSameNameId());
        return cri("fk_white_same_name_ref", "whiteSameNameRefList", this, NextschemaWhiteSameNameRefDbm.getInstance(), mp, false, "whiteSameName");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.postgresql.dbflute.exentity.NextschemaWhiteSameName"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.postgresql.dbflute.cbean.NextschemaWhiteSameNameCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.postgresql.dbflute.exbhv.NextschemaWhiteSameNameBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<NextschemaWhiteSameName> getEntityType() { return NextschemaWhiteSameName.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public NextschemaWhiteSameName newEntity() { return new NextschemaWhiteSameName(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((NextschemaWhiteSameName)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((NextschemaWhiteSameName)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
