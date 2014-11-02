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
 * The DB meta of white_same_name_ref. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteSameNameRefDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteSameNameRefDbm _instance = new WhiteSameNameRefDbm();
    private WhiteSameNameRefDbm() {}
    public static WhiteSameNameRefDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteSameNameRef)et).getSameNameRefId(), (et, vl) -> ((WhiteSameNameRef)et).setSameNameRefId(cti(vl)), "sameNameRefId");
        setupEpg(_epgMap, et -> ((WhiteSameNameRef)et).getSameNameId(), (et, vl) -> ((WhiteSameNameRef)et).setSameNameId(ctl(vl)), "sameNameId");
        setupEpg(_epgMap, et -> ((WhiteSameNameRef)et).getNextSameNameId(), (et, vl) -> ((WhiteSameNameRef)et).setNextSameNameId(ctl(vl)), "nextSameNameId");
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
        setupEfpg(_efpgMap, et -> ((WhiteSameNameRef)et).getWhiteSameName(), (et, vl) -> ((WhiteSameNameRef)et).setWhiteSameName((OptionalEntity<WhiteSameName>)vl), "whiteSameName");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_same_name_ref";
    protected final String _tablePropertyName = "whiteSameNameRef";
    protected final TableSqlName _tableSqlName = new TableSqlName("white_same_name_ref", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnSameNameRefId = cci("same_name_ref_id", "same_name_ref_id", null, null, Integer.class, "sameNameRefId", null, true, false, true, "int4", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnSameNameId = cci("same_name_id", "same_name_id", null, null, Long.class, "sameNameId", null, false, false, true, "int8", 19, 0, null, false, null, null, "whiteSameName", null, null);
    protected final ColumnInfo _columnNextSameNameId = cci("next_same_name_id", "next_same_name_id", null, null, Long.class, "nextSameNameId", null, false, false, true, "int8", 19, 0, null, false, null, null, null, null, null);

    /**
     * same_name_ref_id: {PK, NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSameNameRefId() { return _columnSameNameRefId; }
    /**
     * same_name_id: {NotNull, int8(19), FK to white_same_name}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSameNameId() { return _columnSameNameId; }
    /**
     * next_same_name_id: {NotNull, int8(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNextSameNameId() { return _columnNextSameNameId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnSameNameRefId());
        ls.add(columnSameNameId());
        ls.add(columnNextSameNameId());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnSameNameRefId()); }
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
     * white_same_name by my same_name_id, named 'whiteSameName'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignWhiteSameName() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSameNameId(), WhiteSameNameDbm.getInstance().columnSameNameId());
        return cfi("fk_white_same_name_ref", "whiteSameName", this, WhiteSameNameDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "whiteSameNameRefList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.postgresql.dbflute.exentity.WhiteSameNameRef"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.postgresql.dbflute.cbean.WhiteSameNameRefCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.postgresql.dbflute.exbhv.WhiteSameNameRefBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteSameNameRef> getEntityType() { return WhiteSameNameRef.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteSameNameRef newEntity() { return new WhiteSameNameRef(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteSameNameRef)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteSameNameRef)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
