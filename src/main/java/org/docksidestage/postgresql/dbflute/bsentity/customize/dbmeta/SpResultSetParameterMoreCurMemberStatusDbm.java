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
 * The DB meta of SpResultSetParameterMoreCurMemberStatus. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SpResultSetParameterMoreCurMemberStatusDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SpResultSetParameterMoreCurMemberStatusDbm _instance = new SpResultSetParameterMoreCurMemberStatusDbm();
    private SpResultSetParameterMoreCurMemberStatusDbm() {}
    public static SpResultSetParameterMoreCurMemberStatusDbm getInstance() { return _instance; }

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
    {
        setupEpg(_epgMap, et -> ((SpResultSetParameterMoreCurMemberStatus)et).getMemberStatusCode(), (et, vl) -> {
            ColumnInfo col = columnMemberStatusCode();
            CDef.MemberStatus cls = (CDef.MemberStatus)gcls(col, vl);
            if (cls != null) {
                ((SpResultSetParameterMoreCurMemberStatus)et).setMemberStatusCodeAsMemberStatus(cls);
            } else {
                ((SpResultSetParameterMoreCurMemberStatus)et).mynativeMappingMemberStatusCode((String)vl);
            }
        }, "memberStatusCode");
        setupEpg(_epgMap, et -> ((SpResultSetParameterMoreCurMemberStatus)et).getMemberStatusName(), (et, vl) -> ((SpResultSetParameterMoreCurMemberStatus)et).setMemberStatusName((String)vl), "memberStatusName");
        setupEpg(_epgMap, et -> ((SpResultSetParameterMoreCurMemberStatus)et).getDescription(), (et, vl) -> ((SpResultSetParameterMoreCurMemberStatus)et).setDescription((String)vl), "description");
        setupEpg(_epgMap, et -> ((SpResultSetParameterMoreCurMemberStatus)et).getDisplayOrder(), (et, vl) -> ((SpResultSetParameterMoreCurMemberStatus)et).setDisplayOrder(cti(vl)), "displayOrder");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SpResultSetParameterMoreCurMemberStatus";
    protected final String _tablePropertyName = "spResultSetParameterMoreCurMemberStatus";
    protected final TableSqlName _tableSqlName = new TableSqlName("SpResultSetParameterMoreCurMemberStatus", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberStatusCode = cci("member_status_code", "member_status_code", null, "会員ステータスコード", String.class, "memberStatusCode", null, false, false, false, "bpchar", 3, 0, null, false, null, "会員ステータスを識別するコード。\n固定的なデータなので、連番とか番号にはせず、\nデータを直接見たときも人が直感的にわかるように、\nこのような３桁のコード形式にしている。", null, null, CDef.DefMeta.MemberStatus);
    protected final ColumnInfo _columnMemberStatusName = cci("member_status_name", "member_status_name", null, "会員ステータス名称", String.class, "memberStatusName", null, false, false, false, "varchar", 50, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnDescription = cci("description", "description", null, "説明", String.class, "description", null, false, false, false, "varchar", 200, 0, null, false, null, "会員ステータスそれぞれの説明。\n気の利いた説明があるとディベロッパーがとても助かる。", null, null, null);
    protected final ColumnInfo _columnDisplayOrder = cci("display_order", "display_order", null, "表示順", Integer.class, "displayOrder", null, false, false, false, "int4", 10, 0, null, false, null, "UI上のステータスの表示順を示すNO。\n並べるときは、このカラムに対して昇順のソート条件にする。", null, null, null);

    /**
     * (会員ステータスコード)member_status_code: {bpchar(3), refers to member_status.member_status_code, classification=MemberStatus}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberStatusCode() { return _columnMemberStatusCode; }
    /**
     * (会員ステータス名称)member_status_name: {varchar(50), refers to member_status.member_status_name}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberStatusName() { return _columnMemberStatusName; }
    /**
     * (説明)description: {varchar(200), refers to member_status.description}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDescription() { return _columnDescription; }
    /**
     * (表示順)display_order: {int4(10), refers to member_status.display_order}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDisplayOrder() { return _columnDisplayOrder; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMemberStatusCode());
        ls.add(columnMemberStatusName());
        ls.add(columnDescription());
        ls.add(columnDisplayOrder());
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
    public String getEntityTypeName() { return "org.docksidestage.postgresql.dbflute.exentity.customize.SpResultSetParameterMoreCurMemberStatus"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SpResultSetParameterMoreCurMemberStatus> getEntityType() { return SpResultSetParameterMoreCurMemberStatus.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SpResultSetParameterMoreCurMemberStatus newEntity() { return new SpResultSetParameterMoreCurMemberStatus(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SpResultSetParameterMoreCurMemberStatus)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SpResultSetParameterMoreCurMemberStatus)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
