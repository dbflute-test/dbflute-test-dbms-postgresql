package org.docksidestage.postgresql.dbflute.bsentity.customize.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.PropertyGateway;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbway.DBDef;
import org.docksidestage.postgresql.dbflute.allcommon.*;
import org.docksidestage.postgresql.dbflute.exentity.customize.*;

/**
 * The DB meta of CommonColumnMember. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class CommonColumnMemberDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final CommonColumnMemberDbm _instance = new CommonColumnMemberDbm();
    private CommonColumnMemberDbm() {}
    public static CommonColumnMemberDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgMemberId(), "memberId");
        setupEpg(_epgMap, new EpgMemberName(), "memberName");
        setupEpg(_epgMap, new EpgRegisterDatetime(), "registerDatetime");
        setupEpg(_epgMap, new EpgRegisterUser(), "registerUser");
        setupEpg(_epgMap, new EpgRegisterProcess(), "registerProcess");
        setupEpg(_epgMap, new EpgUpdateDatetime(), "updateDatetime");
        setupEpg(_epgMap, new EpgUpdateUser(), "updateUser");
        setupEpg(_epgMap, new EpgUpdateProcess(), "updateProcess");
    }
    public static class EpgMemberId implements PropertyGateway {
        public Object read(Entity et) { return ((CommonColumnMember)et).getMemberId(); }
        public void write(Entity et, Object vl) { ((CommonColumnMember)et).setMemberId(cti(vl)); }
    }
    public static class EpgMemberName implements PropertyGateway {
        public Object read(Entity et) { return ((CommonColumnMember)et).getMemberName(); }
        public void write(Entity et, Object vl) { ((CommonColumnMember)et).setMemberName((String)vl); }
    }
    public static class EpgRegisterDatetime implements PropertyGateway {
        public Object read(Entity et) { return ((CommonColumnMember)et).getRegisterDatetime(); }
        public void write(Entity et, Object vl) { ((CommonColumnMember)et).setRegisterDatetime((java.sql.Timestamp)vl); }
    }
    public static class EpgRegisterUser implements PropertyGateway {
        public Object read(Entity et) { return ((CommonColumnMember)et).getRegisterUser(); }
        public void write(Entity et, Object vl) { ((CommonColumnMember)et).setRegisterUser((String)vl); }
    }
    public static class EpgRegisterProcess implements PropertyGateway {
        public Object read(Entity et) { return ((CommonColumnMember)et).getRegisterProcess(); }
        public void write(Entity et, Object vl) { ((CommonColumnMember)et).setRegisterProcess((String)vl); }
    }
    public static class EpgUpdateDatetime implements PropertyGateway {
        public Object read(Entity et) { return ((CommonColumnMember)et).getUpdateDatetime(); }
        public void write(Entity et, Object vl) { ((CommonColumnMember)et).setUpdateDatetime((java.sql.Timestamp)vl); }
    }
    public static class EpgUpdateUser implements PropertyGateway {
        public Object read(Entity et) { return ((CommonColumnMember)et).getUpdateUser(); }
        public void write(Entity et, Object vl) { ((CommonColumnMember)et).setUpdateUser((String)vl); }
    }
    public static class EpgUpdateProcess implements PropertyGateway {
        public Object read(Entity et) { return ((CommonColumnMember)et).getUpdateProcess(); }
        public void write(Entity et, Object vl) { ((CommonColumnMember)et).setUpdateProcess((String)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "CommonColumnMember";
    protected final String _tablePropertyName = "commonColumnMember";
    protected final TableSqlName _tableSqlName = new TableSqlName("CommonColumnMember", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberId = cci("member_id", "member_id", null, "会員ID", Integer.class, "memberId", null, false, false, false, "serial", 10, 0, null, false, null, "会員を識別するID。連番として自動採番される。\n（会員IDだけに限らず）採番方法はDBMS次第。", null, null, null);
    protected final ColumnInfo _columnMemberName = cci("member_name", "member_name", null, "会員名称", String.class, "memberName", null, false, false, false, "varchar", 200, 0, null, false, null, "会員のフルネームの名称。\n苗字と名前を分けて管理することも多いが、ここでは Example なので単純にひとまとめ。", null, null, null);
    protected final ColumnInfo _columnRegisterDatetime = cci("register_datetime", "register_datetime", null, "登録日時", java.sql.Timestamp.class, "registerDatetime", null, false, false, false, "timestamp", 26, 3, null, false, null, "レコードが登録された日時。\n会員が登録された日時とほぼ等しいが、そういった業務的な役割を兼務させるのはあまり推奨されない。\nどのテーブルでも同じなので、共通カラムの説明はこのテーブルでしか書かない。", null, null, null);
    protected final ColumnInfo _columnRegisterUser = cci("register_user", "register_user", null, "登録ユーザ", String.class, "registerUser", null, false, false, false, "varchar", 200, 0, null, false, null, "レコードを登録したユーザ。\n会員テーブルであれば当然、会員自身であるはずだが、他のテーブルの場合では管理画面から運用者による登録など考えられるので、しっかり保持しておく。", null, null, null);
    protected final ColumnInfo _columnRegisterProcess = cci("register_process", "register_process", null, null, String.class, "registerProcess", null, false, false, false, "varchar", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnUpdateDatetime = cci("update_datetime", "update_datetime", null, "更新日時", java.sql.Timestamp.class, "updateDatetime", null, false, false, false, "timestamp", 26, 3, null, false, null, "レコードが（最後に）更新された日時。\n業務的な利用はあまり推奨されないと別項目で説明したが、このカラムはソートの要素としてよく利用される。", null, null, null);
    protected final ColumnInfo _columnUpdateUser = cci("update_user", "update_user", null, "更新ユーザ", String.class, "updateUser", null, false, false, false, "varchar", 200, 0, null, false, null, "レコードを更新したユーザ。\nシステムは誰が何をしたのかちゃんと覚えている。", null, null, null);
    protected final ColumnInfo _columnUpdateProcess = cci("update_process", "update_process", null, null, String.class, "updateProcess", null, false, false, false, "varchar", 200, 0, null, false, null, null, null, null, null);

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
     * (登録日時)register_datetime: {timestamp(26, 3), refers to member.register_datetime}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterDatetime() { return _columnRegisterDatetime; }
    /**
     * (登録ユーザ)register_user: {varchar(200), refers to member.register_user}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterUser() { return _columnRegisterUser; }
    /**
     * register_process: {varchar(200), refers to member.register_process}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterProcess() { return _columnRegisterProcess; }
    /**
     * (更新日時)update_datetime: {timestamp(26, 3), refers to member.update_datetime}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateDatetime() { return _columnUpdateDatetime; }
    /**
     * (更新ユーザ)update_user: {varchar(200), refers to member.update_user}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateUser() { return _columnUpdateUser; }
    /**
     * update_process: {varchar(200), refers to member.update_process}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateProcess() { return _columnUpdateProcess; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMemberId());
        ls.add(columnMemberName());
        ls.add(columnRegisterDatetime());
        ls.add(columnRegisterUser());
        ls.add(columnRegisterProcess());
        ls.add(columnUpdateDatetime());
        ls.add(columnUpdateUser());
        ls.add(columnUpdateProcess());
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
    public String getEntityTypeName() { return "org.docksidestage.postgresql.dbflute.exentity.customize.CommonColumnMember"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<CommonColumnMember> getEntityType() { return CommonColumnMember.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public CommonColumnMember newEntity() { return new CommonColumnMember(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((CommonColumnMember)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((CommonColumnMember)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
