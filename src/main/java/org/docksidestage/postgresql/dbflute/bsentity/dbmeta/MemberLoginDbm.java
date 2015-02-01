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
 * The DB meta of member_login. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MemberLoginDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MemberLoginDbm _instance = new MemberLoginDbm();
    private MemberLoginDbm() {}
    public static MemberLoginDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MemberLogin)et).getMemberLoginId(), (et, vl) -> ((MemberLogin)et).setMemberLoginId(ctl(vl)), "memberLoginId");
        setupEpg(_epgMap, et -> ((MemberLogin)et).getMemberId(), (et, vl) -> ((MemberLogin)et).setMemberId(cti(vl)), "memberId");
        setupEpg(_epgMap, et -> ((MemberLogin)et).getLoginDatetime(), (et, vl) -> ((MemberLogin)et).setLoginDatetime(ctldt(vl)), "loginDatetime");
        setupEpg(_epgMap, et -> ((MemberLogin)et).getMobileLoginFlg(), (et, vl) -> {
            ColumnInfo col = columnMobileLoginFlg();
            CDef.Flg cls = (CDef.Flg)gcls(col, vl);
            if (cls != null) {
                ((MemberLogin)et).setMobileLoginFlgAsFlg(cls);
            } else {
                ((MemberLogin)et).mynativeMappingMobileLoginFlg(ctn(vl, Integer.class));
            }
        }, "mobileLoginFlg");
        setupEpg(_epgMap, et -> ((MemberLogin)et).getLoginMemberStatusCode(), (et, vl) -> {
            ColumnInfo col = columnLoginMemberStatusCode();
            CDef.MemberStatus cls = (CDef.MemberStatus)gcls(col, vl);
            if (cls != null) {
                ((MemberLogin)et).setLoginMemberStatusCodeAsMemberStatus(cls);
            } else {
                ((MemberLogin)et).mynativeMappingLoginMemberStatusCode((String)vl);
            }
        }, "loginMemberStatusCode");
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
        setupEfpg(_efpgMap, et -> ((MemberLogin)et).getMemberStatus(), (et, vl) -> ((MemberLogin)et).setMemberStatus((OptionalEntity<MemberStatus>)vl), "memberStatus");
        setupEfpg(_efpgMap, et -> ((MemberLogin)et).getMember(), (et, vl) -> ((MemberLogin)et).setMember((OptionalEntity<Member>)vl), "member");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "member_login";
    protected final String _tableDispName = "member_login";
    protected final String _tablePropertyName = "memberLogin";
    protected final TableSqlName _tableSqlName = new TableSqlName("member_login", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "会員ログイン";
    public String getTableAlias() { return _tableAlias; }
    protected final String _tableComment = "ログインするたびに登録されるログイン履歴。\n登録されたら更新されるも削除されることもない。さらには登録する人もプログラムもはっきりしているので、ここでは共通カラムは(紙面の都合上もあって)省略している。";
    public String getTableComment() { return _tableComment; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberLoginId = cci("member_login_id", "member_login_id", null, "会員ログインID", Long.class, "memberLoginId", null, true, true, true, "bigserial", 19, 0, "nextval('member_login_member_login_id_seq'::regclass)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMemberId = cci("member_id", "member_id", null, "会員ID", Integer.class, "memberId", null, false, false, true, "int4", 10, 0, null, false, null, null, "member", null, null, false);
    protected final ColumnInfo _columnLoginDatetime = cci("login_datetime", "login_datetime", null, "ログイン日時", java.time.LocalDateTime.class, "loginDatetime", null, false, false, true, "timestamp", 26, 3, null, false, null, "ログインした瞬間の日時。", null, null, null, false);
    protected final ColumnInfo _columnMobileLoginFlg = cci("mobile_login_flg", "mobile_login_flg", null, "モバイルログインフラグ", Integer.class, "mobileLoginFlg", null, false, false, true, "int4", 10, 0, null, false, null, "モバイル機器からのログインか否か。", null, null, CDef.DefMeta.Flg, false);
    protected final ColumnInfo _columnLoginMemberStatusCode = cci("login_member_status_code", "login_member_status_code", null, "ログイン会員ステータスコード", String.class, "loginMemberStatusCode", null, false, false, true, "bpchar", 3, 0, null, false, null, "ログイン時の会員ステータス", "memberStatus", null, CDef.DefMeta.MemberStatus, false);

    /**
     * (会員ログインID)member_login_id: {PK, ID, NotNull, bigserial(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberLoginId() { return _columnMemberLoginId; }
    /**
     * (会員ID)member_id: {UQ+, NotNull, int4(10), FK to member}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberId() { return _columnMemberId; }
    /**
     * (ログイン日時)login_datetime: {+UQ, IX, NotNull, timestamp(26, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLoginDatetime() { return _columnLoginDatetime; }
    /**
     * (モバイルログインフラグ)mobile_login_flg: {NotNull, int4(10), classification=Flg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMobileLoginFlg() { return _columnMobileLoginFlg; }
    /**
     * (ログイン会員ステータスコード)login_member_status_code: {NotNull, bpchar(3), FK to member_status, classification=MemberStatus}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLoginMemberStatusCode() { return _columnLoginMemberStatusCode; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMemberLoginId());
        ls.add(columnMemberId());
        ls.add(columnLoginDatetime());
        ls.add(columnMobileLoginFlg());
        ls.add(columnLoginMemberStatusCode());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnMemberLoginId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnMemberId());
        ls.add(columnLoginDatetime());
        return hpcui(ls);
    }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * (会員ステータス)member_status by my login_member_status_code, named 'memberStatus'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMemberStatus() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLoginMemberStatusCode(), MemberStatusDbm.getInstance().columnMemberStatusCode());
        return cfi("fk_member_login_member_status", "memberStatus", this, MemberStatusDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "memberLoginList", false);
    }
    /**
     * (会員)member by my member_id, named 'member'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMember() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberDbm.getInstance().columnMemberId());
        return cfi("fk_member_login_member", "member", this, MemberDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "memberLoginList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasSequence() { return true; }
    public String getSequenceName() { return "member_login_member_login_id_seq"; }
    public Integer getSequenceIncrementSize() { return 1; }
    public Integer getSequenceCacheSize() { return 10; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.postgresql.dbflute.exentity.MemberLogin"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.postgresql.dbflute.cbean.MemberLoginCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.postgresql.dbflute.exbhv.MemberLoginBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MemberLogin> getEntityType() { return MemberLogin.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MemberLogin newEntity() { return new MemberLogin(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MemberLogin)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MemberLogin)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
