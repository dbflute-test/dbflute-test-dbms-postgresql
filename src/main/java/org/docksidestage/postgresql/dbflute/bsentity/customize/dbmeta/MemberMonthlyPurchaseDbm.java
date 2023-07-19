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
 * The DB meta of MemberMonthlyPurchase. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MemberMonthlyPurchaseDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MemberMonthlyPurchaseDbm _instance = new MemberMonthlyPurchaseDbm();
    private MemberMonthlyPurchaseDbm() {}
    public static MemberMonthlyPurchaseDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MemberMonthlyPurchase)et).getMemberId(), (et, vl) -> ((MemberMonthlyPurchase)et).setMemberId(cti(vl)), "memberId");
        setupEpg(_epgMap, et -> ((MemberMonthlyPurchase)et).getMemberName(), (et, vl) -> ((MemberMonthlyPurchase)et).setMemberName((String)vl), "memberName");
        setupEpg(_epgMap, et -> ((MemberMonthlyPurchase)et).getPurchaseMonth(), (et, vl) -> ((MemberMonthlyPurchase)et).setPurchaseMonth(ctldt(vl)), "purchaseMonth");
        setupEpg(_epgMap, et -> ((MemberMonthlyPurchase)et).getPurchasePriceAvg(), (et, vl) -> ((MemberMonthlyPurchase)et).setPurchasePriceAvg(ctb(vl)), "purchasePriceAvg");
        setupEpg(_epgMap, et -> ((MemberMonthlyPurchase)et).getPurchasePriceMax(), (et, vl) -> ((MemberMonthlyPurchase)et).setPurchasePriceMax(cti(vl)), "purchasePriceMax");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "MemberMonthlyPurchase";
    protected final String _tableDispName = "MemberMonthlyPurchase";
    protected final String _tablePropertyName = "memberMonthlyPurchase";
    protected final TableSqlName _tableSqlName = new TableSqlName("MemberMonthlyPurchase", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberId = cci("member_id", "member_id", null, "会員ID", Integer.class, "memberId", null, false, false, false, "serial", 10, 0, null, null, false, null, "会員を識別するID。連番として自動採番される。\n（会員IDだけに限らず）採番方法はDBMS次第。\n// grouping item", null, null, null, false);
    protected final ColumnInfo _columnMemberName = cci("member_name", "member_name", null, "会員名称", String.class, "memberName", null, false, false, false, "varchar", 200, 0, null, null, false, null, "会員のフルネームの名称。\n苗字と名前を分けて管理することも多いが、ここでは Example なので単純にひとまとめ。\n// non grouping item is allowed on PostgreSQL", null, null, null, false);
    protected final ColumnInfo _columnPurchaseMonth = cci("purchase_month", "purchase_month", null, null, java.time.LocalDateTime.class, "purchaseMonth", null, false, false, false, "timestamp", 29, 6, null, null, false, null, "// grouping item, depends on DBMS", null, null, null, false);
    protected final ColumnInfo _columnPurchasePriceAvg = cci("purchase_price_avg", "purchase_price_avg", null, null, java.math.BigDecimal.class, "purchasePriceAvg", null, false, false, false, "numeric", 131089, 0, null, null, false, null, "// aggregation item", null, null, null, false);
    protected final ColumnInfo _columnPurchasePriceMax = cci("purchase_price_max", "purchase_price_max", null, null, Integer.class, "purchasePriceMax", null, false, false, false, "int4", 10, 0, null, null, false, null, "// me too", null, null, null, false);

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
     * purchase_month: {timestamp(29, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchaseMonth() { return _columnPurchaseMonth; }
    /**
     * purchase_price_avg: {numeric(131089)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchasePriceAvg() { return _columnPurchasePriceAvg; }
    /**
     * purchase_price_max: {int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchasePriceMax() { return _columnPurchasePriceMax; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMemberId());
        ls.add(columnMemberName());
        ls.add(columnPurchaseMonth());
        ls.add(columnPurchasePriceAvg());
        ls.add(columnPurchasePriceMax());
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
    public String getEntityTypeName() { return "org.docksidestage.postgresql.dbflute.exentity.customize.MemberMonthlyPurchase"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MemberMonthlyPurchase> getEntityType() { return MemberMonthlyPurchase.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MemberMonthlyPurchase newEntity() { return new MemberMonthlyPurchase(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MemberMonthlyPurchase)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MemberMonthlyPurchase)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
