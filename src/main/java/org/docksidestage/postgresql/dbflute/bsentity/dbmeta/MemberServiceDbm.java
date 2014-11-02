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
 * The DB meta of member_service. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MemberServiceDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MemberServiceDbm _instance = new MemberServiceDbm();
    private MemberServiceDbm() {}
    public static MemberServiceDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MemberService)et).getMemberServiceId(), (et, vl) -> ((MemberService)et).setMemberServiceId(cti(vl)), "memberServiceId");
        setupEpg(_epgMap, et -> ((MemberService)et).getMemberId(), (et, vl) -> ((MemberService)et).setMemberId(cti(vl)), "memberId");
        setupEpg(_epgMap, et -> ((MemberService)et).getServicePointCount(), (et, vl) -> ((MemberService)et).setServicePointCount(cti(vl)), "servicePointCount");
        setupEpg(_epgMap, et -> ((MemberService)et).getServiceRankCode(), (et, vl) -> {
            ColumnInfo col = columnServiceRankCode();
            CDef.ServiceRank cls = (CDef.ServiceRank)gcls(col, vl);
            if (cls != null) {
                ((MemberService)et).setServiceRankCodeAsServiceRank(cls);
            } else {
                ((MemberService)et).mynativeMappingServiceRankCode((String)vl);
            }
        }, "serviceRankCode");
        setupEpg(_epgMap, et -> ((MemberService)et).getRegisterDatetime(), (et, vl) -> ((MemberService)et).setRegisterDatetime((java.time.LocalDateTime)vl), "registerDatetime");
        setupEpg(_epgMap, et -> ((MemberService)et).getRegisterProcess(), (et, vl) -> ((MemberService)et).setRegisterProcess((String)vl), "registerProcess");
        setupEpg(_epgMap, et -> ((MemberService)et).getRegisterUser(), (et, vl) -> ((MemberService)et).setRegisterUser((String)vl), "registerUser");
        setupEpg(_epgMap, et -> ((MemberService)et).getUpdateDatetime(), (et, vl) -> ((MemberService)et).setUpdateDatetime((java.time.LocalDateTime)vl), "updateDatetime");
        setupEpg(_epgMap, et -> ((MemberService)et).getUpdateProcess(), (et, vl) -> ((MemberService)et).setUpdateProcess((String)vl), "updateProcess");
        setupEpg(_epgMap, et -> ((MemberService)et).getUpdateUser(), (et, vl) -> ((MemberService)et).setUpdateUser((String)vl), "updateUser");
        setupEpg(_epgMap, et -> ((MemberService)et).getVersionNo(), (et, vl) -> ((MemberService)et).setVersionNo(ctl(vl)), "versionNo");
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
        setupEfpg(_efpgMap, et -> ((MemberService)et).getMember(), (et, vl) -> ((MemberService)et).setMember((OptionalEntity<Member>)vl), "member");
        setupEfpg(_efpgMap, et -> ((MemberService)et).getServiceRank(), (et, vl) -> ((MemberService)et).setServiceRank((OptionalEntity<ServiceRank>)vl), "serviceRank");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "member_service";
    protected final String _tablePropertyName = "memberService";
    protected final TableSqlName _tableSqlName = new TableSqlName("member_service", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "会員サービス";
    public String getTableAlias() { return _tableAlias; }
    protected final String _tableComment = "会員のサービス情報（ポイントサービスなど）。\nExampleDBとして、あえて統一性を崩してユニーク制約経由の one-to-one を表現している。";
    public String getTableComment() { return _tableComment; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberServiceId = cci("member_service_id", "member_service_id", null, "会員サービスID", Integer.class, "memberServiceId", null, true, true, true, "serial", 10, 0, "nextval('member_service_member_service_id_seq'::regclass)", false, null, "独立した主キーとなるが、実質的に会員IDとは one-to-one である。", null, null, null);
    protected final ColumnInfo _columnMemberId = cci("member_id", "member_id", null, "会員ID", Integer.class, "memberId", null, false, false, true, "int4", 10, 0, null, false, null, "会員を参照するID。ユニークなので、会員とは one-to-one の関係に。", "member", null, null);
    protected final ColumnInfo _columnServicePointCount = cci("service_point_count", "service_point_count", null, "サービスポイント数", Integer.class, "servicePointCount", null, false, false, true, "int4", 10, 0, null, false, null, "会員が現在利用できるサービスポイントの数。\n基本的に、購入時には増えてポイントを使ったら減る。", null, null, null);
    protected final ColumnInfo _columnServiceRankCode = cci("service_rank_code", "service_rank_code", null, "サービスランクコード", String.class, "serviceRankCode", null, false, false, true, "bpchar", 3, 0, null, false, null, "サービスランクを参照するコード。\nどんなランクがあるのかドキドキですね。", "serviceRank", null, CDef.DefMeta.ServiceRank);
    protected final ColumnInfo _columnRegisterDatetime = cci("register_datetime", "register_datetime", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "timestamp", 26, 3, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnRegisterProcess = cci("register_process", "register_process", null, null, String.class, "registerProcess", null, false, false, true, "varchar", 200, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnRegisterUser = cci("register_user", "register_user", null, null, String.class, "registerUser", null, false, false, true, "varchar", 200, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnUpdateDatetime = cci("update_datetime", "update_datetime", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "timestamp", 26, 3, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnUpdateProcess = cci("update_process", "update_process", null, null, String.class, "updateProcess", null, false, false, true, "varchar", 200, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnUpdateUser = cci("update_user", "update_user", null, null, String.class, "updateUser", null, false, false, true, "varchar", 200, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnVersionNo = cci("version_no", "version_no", null, null, Long.class, "versionNo", null, false, false, true, "int8", 19, 0, null, false, OptimisticLockType.VERSION_NO, null, null, null, null);

    /**
     * (会員サービスID)member_service_id: {PK, ID, NotNull, serial(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberServiceId() { return _columnMemberServiceId; }
    /**
     * (会員ID)member_id: {UQ, NotNull, int4(10), FK to member}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberId() { return _columnMemberId; }
    /**
     * (サービスポイント数)service_point_count: {IX, NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnServicePointCount() { return _columnServicePointCount; }
    /**
     * (サービスランクコード)service_rank_code: {NotNull, bpchar(3), FK to service_rank, classification=ServiceRank}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnServiceRankCode() { return _columnServiceRankCode; }
    /**
     * register_datetime: {NotNull, timestamp(26, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterDatetime() { return _columnRegisterDatetime; }
    /**
     * register_process: {NotNull, varchar(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterProcess() { return _columnRegisterProcess; }
    /**
     * register_user: {NotNull, varchar(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterUser() { return _columnRegisterUser; }
    /**
     * update_datetime: {NotNull, timestamp(26, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateDatetime() { return _columnUpdateDatetime; }
    /**
     * update_process: {NotNull, varchar(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateProcess() { return _columnUpdateProcess; }
    /**
     * update_user: {NotNull, varchar(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateUser() { return _columnUpdateUser; }
    /**
     * version_no: {NotNull, int8(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMemberServiceId());
        ls.add(columnMemberId());
        ls.add(columnServicePointCount());
        ls.add(columnServiceRankCode());
        ls.add(columnRegisterDatetime());
        ls.add(columnRegisterProcess());
        ls.add(columnRegisterUser());
        ls.add(columnUpdateDatetime());
        ls.add(columnUpdateProcess());
        ls.add(columnUpdateUser());
        ls.add(columnVersionNo());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnMemberServiceId()); }
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
     * (会員)member by my member_id, named 'member'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMember() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberDbm.getInstance().columnMemberId());
        return cfi("fk_member_service_member", "member", this, MemberDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, true, false, false, false, null, null, false, "memberServiceAsOne");
    }
    /**
     * (サービスランク)service_rank by my service_rank_code, named 'serviceRank'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignServiceRank() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnServiceRankCode(), ServiceRankDbm.getInstance().columnServiceRankCode());
        return cfi("fk_member_service_service_rank_code", "serviceRank", this, ServiceRankDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "memberServiceList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasSequence() { return true; }
    public String getSequenceName() { return "member_service_member_service_id_seq"; }
    public Integer getSequenceIncrementSize() { return 1; }
    public Integer getSequenceCacheSize() { return null; }
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }
    public boolean hasCommonColumn() { return true; }
    public List<ColumnInfo> getCommonColumnInfoList()
    { return newArrayList(columnRegisterDatetime(), columnRegisterUser(), columnRegisterProcess(), columnUpdateDatetime(), columnUpdateUser(), columnUpdateProcess()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnRegisterDatetime(), columnRegisterUser(), columnRegisterProcess(), columnUpdateDatetime(), columnUpdateUser(), columnUpdateProcess()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(columnUpdateDatetime(), columnUpdateUser(), columnUpdateProcess()); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.postgresql.dbflute.exentity.MemberService"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.postgresql.dbflute.cbean.MemberServiceCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.postgresql.dbflute.exbhv.MemberServiceBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MemberService> getEntityType() { return MemberService.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MemberService newEntity() { return new MemberService(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MemberService)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MemberService)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
