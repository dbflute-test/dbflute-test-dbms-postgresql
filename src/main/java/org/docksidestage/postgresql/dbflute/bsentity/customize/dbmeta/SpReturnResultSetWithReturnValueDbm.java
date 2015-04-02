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
 * The DB meta of SpReturnResultSetWithReturnValue. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SpReturnResultSetWithReturnValueDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SpReturnResultSetWithReturnValueDbm _instance = new SpReturnResultSetWithReturnValueDbm();
    private SpReturnResultSetWithReturnValueDbm() {}
    public static SpReturnResultSetWithReturnValueDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SpReturnResultSetWithReturnValue)et).getMemberId(), (et, vl) -> ((SpReturnResultSetWithReturnValue)et).setMemberId(cti(vl)), "memberId");
        setupEpg(_epgMap, et -> ((SpReturnResultSetWithReturnValue)et).getMemberName(), (et, vl) -> ((SpReturnResultSetWithReturnValue)et).setMemberName((String)vl), "memberName");
        setupEpg(_epgMap, et -> ((SpReturnResultSetWithReturnValue)et).getBirthdate(), (et, vl) -> ((SpReturnResultSetWithReturnValue)et).setBirthdate(ctld(vl)), "birthdate");
        setupEpg(_epgMap, et -> ((SpReturnResultSetWithReturnValue)et).getFormalizedDatetime(), (et, vl) -> ((SpReturnResultSetWithReturnValue)et).setFormalizedDatetime(ctldt(vl)), "formalizedDatetime");
        setupEpg(_epgMap, et -> ((SpReturnResultSetWithReturnValue)et).getMemberStatusCode(), (et, vl) -> {
            ColumnInfo col = columnMemberStatusCode();
            CDef.MemberStatus cls = (CDef.MemberStatus)gcls(et, col, vl);
            if (cls != null) {
                ((SpReturnResultSetWithReturnValue)et).setMemberStatusCodeAsMemberStatus(cls);
            } else {
                ((SpReturnResultSetWithReturnValue)et).mynativeMappingMemberStatusCode((String)vl);
            }
        }, "memberStatusCode");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SpReturnResultSetWithReturnValue";
    protected final String _tableDispName = "SpReturnResultSetWithReturnValue";
    protected final String _tablePropertyName = "spReturnResultSetWithReturnValue";
    protected final TableSqlName _tableSqlName = new TableSqlName("SpReturnResultSetWithReturnValue", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberId = cci("member_id", "member_id", null, "会員ID", Integer.class, "memberId", null, false, false, false, "serial", 10, 0, null, false, null, "会員を識別するID。連番として自動採番される。\n（会員IDだけに限らず）採番方法はDBMS次第。", null, null, null, false);
    protected final ColumnInfo _columnMemberName = cci("member_name", "member_name", null, "会員名称", String.class, "memberName", null, false, false, false, "varchar", 200, 0, null, false, null, "会員のフルネームの名称。\n苗字と名前を分けて管理することも多いが、ここでは Example なので単純にひとまとめ。", null, null, null, false);
    protected final ColumnInfo _columnBirthdate = cci("birthdate", "birthdate", null, "生年月日", java.time.LocalDate.class, "birthdate", null, false, false, false, "date", 13, 0, null, false, null, "必須項目ではないので、このデータがない会員もいる。", null, null, null, false);
    protected final ColumnInfo _columnFormalizedDatetime = cci("formalized_datetime", "formalized_datetime", null, "正式会員日時", java.time.LocalDateTime.class, "formalizedDatetime", null, false, false, false, "timestamp", 26, 3, null, false, null, "会員が正式に確定した日時。\n一度確定したら更新されない。", null, null, null, false);
    protected final ColumnInfo _columnMemberStatusCode = cci("member_status_code", "member_status_code", null, "会員ステータスコード", String.class, "memberStatusCode", null, false, false, false, "bpchar", 3, 0, null, false, null, "会員ステータスを参照するコード。\nステータスが変わるたびに、このカラムが更新される。", null, null, CDef.DefMeta.MemberStatus, false);

    /**
     * (会員ID)member_id: {serial(10), refers to member.member_id}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberId() { return _columnMemberId; }
    /**
     * (会員名称)member_name: {varchar(200), refers to member.member_name}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberName() { return _columnMemberName; }
    /**
     * (生年月日)birthdate: {date(13), refers to member.birthdate}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBirthdate() { return _columnBirthdate; }
    /**
     * (正式会員日時)formalized_datetime: {timestamp(26, 3), refers to member.formalized_datetime}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFormalizedDatetime() { return _columnFormalizedDatetime; }
    /**
     * (会員ステータスコード)member_status_code: {bpchar(3), refers to member.member_status_code, classification=MemberStatus}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberStatusCode() { return _columnMemberStatusCode; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMemberId());
        ls.add(columnMemberName());
        ls.add(columnBirthdate());
        ls.add(columnFormalizedDatetime());
        ls.add(columnMemberStatusCode());
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
    public String getEntityTypeName() { return "org.docksidestage.postgresql.dbflute.exentity.customize.SpReturnResultSetWithReturnValue"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SpReturnResultSetWithReturnValue> getEntityType() { return SpReturnResultSetWithReturnValue.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SpReturnResultSetWithReturnValue newEntity() { return new SpReturnResultSetWithReturnValue(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SpReturnResultSetWithReturnValue)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SpReturnResultSetWithReturnValue)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
