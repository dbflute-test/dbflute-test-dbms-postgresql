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
 * The DB meta of PurchaseMaxPriceMember. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class PurchaseMaxPriceMemberDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final PurchaseMaxPriceMemberDbm _instance = new PurchaseMaxPriceMemberDbm();
    private PurchaseMaxPriceMemberDbm() {}
    public static PurchaseMaxPriceMemberDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgPurchaseMaxPrice(), "purchaseMaxPrice");
        setupEpg(_epgMap, new EpgMemberStatusName(), "memberStatusName");
    }
    public static class EpgMemberId implements PropertyGateway {
        public Object read(Entity et) { return ((PurchaseMaxPriceMember)et).getMemberId(); }
        public void write(Entity et, Object vl) { ((PurchaseMaxPriceMember)et).setMemberId(cti(vl)); }
    }
    public static class EpgMemberName implements PropertyGateway {
        public Object read(Entity et) { return ((PurchaseMaxPriceMember)et).getMemberName(); }
        public void write(Entity et, Object vl) { ((PurchaseMaxPriceMember)et).setMemberName((String)vl); }
    }
    public static class EpgPurchaseMaxPrice implements PropertyGateway {
        public Object read(Entity et) { return ((PurchaseMaxPriceMember)et).getPurchaseMaxPrice(); }
        public void write(Entity et, Object vl) { ((PurchaseMaxPriceMember)et).setPurchaseMaxPrice(cti(vl)); }
    }
    public static class EpgMemberStatusName implements PropertyGateway {
        public Object read(Entity et) { return ((PurchaseMaxPriceMember)et).getMemberStatusName(); }
        public void write(Entity et, Object vl) { ((PurchaseMaxPriceMember)et).setMemberStatusName((String)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "PurchaseMaxPriceMember";
    protected final String _tablePropertyName = "purchaseMaxPriceMember";
    protected final TableSqlName _tableSqlName = new TableSqlName("PurchaseMaxPriceMember", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberId = cci("member_id", "member_id", null, "会員ID", Integer.class, "memberId", null, false, false, false, "serial", 10, 0, null, false, null, "会員を識別するID。連番として自動採番される。\n（会員IDだけに限らず）採番方法はDBMS次第。", null, null, null);
    protected final ColumnInfo _columnMemberName = cci("member_name", "member_name", null, "会員名称", String.class, "memberName", null, false, false, false, "varchar", 200, 0, null, false, null, "会員のフルネームの名称。\n苗字と名前を分けて管理することも多いが、ここでは Example なので単純にひとまとめ。\n// member's name", null, null, null);
    protected final ColumnInfo _columnPurchaseMaxPrice = cci("purchase_max_price", "purchase_max_price", null, null, Integer.class, "purchaseMaxPrice", null, false, false, false, "int4", 10, 0, null, false, null, "// max price of the member's purchases", null, null, null);
    protected final ColumnInfo _columnMemberStatusName = cci("member_status_name", "member_status_name", null, "会員ステータス名称", String.class, "memberStatusName", null, false, false, false, "varchar", 50, 0, null, false, null, null, null, null, null);

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
     * purchase_max_price: {int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchaseMaxPrice() { return _columnPurchaseMaxPrice; }
    /**
     * (会員ステータス名称)member_status_name: {varchar(50), refers to member_status.member_status_name}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberStatusName() { return _columnMemberStatusName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMemberId());
        ls.add(columnMemberName());
        ls.add(columnPurchaseMaxPrice());
        ls.add(columnMemberStatusName());
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
    public String getEntityTypeName() { return "org.docksidestage.postgresql.dbflute.exentity.customize.PurchaseMaxPriceMember"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<PurchaseMaxPriceMember> getEntityType() { return PurchaseMaxPriceMember.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public PurchaseMaxPriceMember newEntity() { return new PurchaseMaxPriceMember(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((PurchaseMaxPriceMember)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((PurchaseMaxPriceMember)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
