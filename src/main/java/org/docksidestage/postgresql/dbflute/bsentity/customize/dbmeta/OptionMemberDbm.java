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
 * The DB meta of OptionMember. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class OptionMemberDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final OptionMemberDbm _instance = new OptionMemberDbm();
    private OptionMemberDbm() {}
    public static OptionMemberDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((OptionMember)et).getMemberId(), (et, vl) -> ((OptionMember)et).setMemberId(cti(vl)), "memberId");
        setupEpg(_epgMap, et -> ((OptionMember)et).getMemberName(), (et, vl) -> ((OptionMember)et).setMemberName((String)vl), "memberName");
        setupEpg(_epgMap, et -> ((OptionMember)et).getBirthdate(), (et, vl) -> ((OptionMember)et).setBirthdate(ctld(vl)), "birthdate");
        setupEpg(_epgMap, et -> ((OptionMember)et).getFormalizedDatetime(), (et, vl) -> ((OptionMember)et).setFormalizedDatetime(ctldt(vl)), "formalizedDatetime");
        setupEpg(_epgMap, et -> ((OptionMember)et).getMemberStatusCode(), (et, vl) -> {
            ColumnInfo col = columnMemberStatusCode();
            CDef.MemberStatus cls = (CDef.MemberStatus)gcls(et, col, vl);
            if (cls != null) {
                ((OptionMember)et).setMemberStatusCodeAsMemberStatus(cls);
            } else {
                ((OptionMember)et).mynativeMappingMemberStatusCode((String)vl);
            }
        }, "memberStatusCode");
        setupEpg(_epgMap, et -> ((OptionMember)et).getMemberStatusName(), (et, vl) -> ((OptionMember)et).setMemberStatusName((String)vl), "memberStatusName");
        setupEpg(_epgMap, et -> ((OptionMember)et).getStatusDisplayOrder(), (et, vl) -> ((OptionMember)et).setStatusDisplayOrder(cti(vl)), "statusDisplayOrder");
        setupEpg(_epgMap, et -> ((OptionMember)et).getDummyFlg(), (et, vl) -> {
            ColumnInfo col = columnDummyFlg();
            CDef.Flg cls = (CDef.Flg)gcls(et, col, vl);
            if (cls != null) {
                ((OptionMember)et).setDummyFlgAsFlg(cls);
            } else {
                ((OptionMember)et).mynativeMappingDummyFlg(ctn(vl, Integer.class));
            }
        }, "dummyFlg");
        setupEpg(_epgMap, et -> ((OptionMember)et).getDummyNoflg(), (et, vl) -> ((OptionMember)et).setDummyNoflg(cti(vl)), "dummyNoflg");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "OptionMember";
    protected final String _tableDispName = "OptionMember";
    protected final String _tablePropertyName = "optionMember";
    protected final TableSqlName _tableSqlName = new TableSqlName("OptionMember", _tableDbName);
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
    protected final ColumnInfo _columnMemberStatusName = cci("member_status_name", "member_status_name", null, "会員ステータス名称", String.class, "memberStatusName", null, false, false, false, "varchar", 50, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStatusDisplayOrder = cci("status_display_order", "status_display_order", null, null, Integer.class, "statusDisplayOrder", null, false, false, false, "int4", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDummyFlg = cci("dummy_flg", "dummy_flg", null, null, Integer.class, "dummyFlg", null, false, false, false, "int4", 10, 0, null, false, null, null, null, null, CDef.DefMeta.Flg, false);
    protected final ColumnInfo _columnDummyNoflg = cci("dummy_noflg", "dummy_noflg", null, null, Integer.class, "dummyNoflg", null, false, false, false, "int4", 10, 0, null, false, null, null, null, null, null, false);

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
    /**
     * (会員ステータス名称)member_status_name: {varchar(50), refers to member_status.member_status_name}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberStatusName() { return _columnMemberStatusName; }
    /**
     * status_display_order: {int4(10), refers to member_status}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStatusDisplayOrder() { return _columnStatusDisplayOrder; }
    /**
     * dummy_flg: {int4(10), classification=Flg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDummyFlg() { return _columnDummyFlg; }
    /**
     * dummy_noflg: {int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDummyNoflg() { return _columnDummyNoflg; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMemberId());
        ls.add(columnMemberName());
        ls.add(columnBirthdate());
        ls.add(columnFormalizedDatetime());
        ls.add(columnMemberStatusCode());
        ls.add(columnMemberStatusName());
        ls.add(columnStatusDisplayOrder());
        ls.add(columnDummyFlg());
        ls.add(columnDummyNoflg());
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
    public String getEntityTypeName() { return "org.docksidestage.postgresql.dbflute.exentity.customize.OptionMember"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<OptionMember> getEntityType() { return OptionMember.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public OptionMember newEntity() { return new OptionMember(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((OptionMember)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((OptionMember)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
