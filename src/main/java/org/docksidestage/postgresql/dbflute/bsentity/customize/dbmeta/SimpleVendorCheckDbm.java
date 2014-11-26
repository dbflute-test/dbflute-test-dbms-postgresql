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
 * The DB meta of SimpleVendorCheck. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SimpleVendorCheckDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SimpleVendorCheckDbm _instance = new SimpleVendorCheckDbm();
    private SimpleVendorCheckDbm() {}
    public static SimpleVendorCheckDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SimpleVendorCheck)et).getVendorCheckId(), (et, vl) -> ((SimpleVendorCheck)et).setVendorCheckId(ctl(vl)), "vendorCheckId");
        setupEpg(_epgMap, et -> ((SimpleVendorCheck)et).getTypeOfVarchar(), (et, vl) -> ((SimpleVendorCheck)et).setTypeOfVarchar((String)vl), "typeOfVarchar");
        setupEpg(_epgMap, et -> ((SimpleVendorCheck)et).getTypeOfVcArray(), (et, vl) -> ((SimpleVendorCheck)et).setTypeOfVcArray((org.docksidestage.postgresql.mytype.MyArray)vl), "typeOfVcArray");
        setupEpg(_epgMap, et -> ((SimpleVendorCheck)et).getTypeOfText(), (et, vl) -> ((SimpleVendorCheck)et).setTypeOfText((String)vl), "typeOfText");
        setupEpg(_epgMap, et -> ((SimpleVendorCheck)et).getTypeOfNumericInteger(), (et, vl) -> ((SimpleVendorCheck)et).setTypeOfNumericInteger(cti(vl)), "typeOfNumericInteger");
        setupEpg(_epgMap, et -> ((SimpleVendorCheck)et).getTypeOfNumericBigint(), (et, vl) -> ((SimpleVendorCheck)et).setTypeOfNumericBigint(ctl(vl)), "typeOfNumericBigint");
        setupEpg(_epgMap, et -> ((SimpleVendorCheck)et).getTypeOfNumericDecimal(), (et, vl) -> ((SimpleVendorCheck)et).setTypeOfNumericDecimal(ctb(vl)), "typeOfNumericDecimal");
        setupEpg(_epgMap, et -> ((SimpleVendorCheck)et).getTypeOfDecimal(), (et, vl) -> ((SimpleVendorCheck)et).setTypeOfDecimal(ctb(vl)), "typeOfDecimal");
        setupEpg(_epgMap, et -> ((SimpleVendorCheck)et).getTypeOfBigint(), (et, vl) -> ((SimpleVendorCheck)et).setTypeOfBigint(ctl(vl)), "typeOfBigint");
        setupEpg(_epgMap, et -> ((SimpleVendorCheck)et).getTypeOfInt8(), (et, vl) -> ((SimpleVendorCheck)et).setTypeOfInt8(ctl(vl)), "typeOfInt8");
        setupEpg(_epgMap, et -> ((SimpleVendorCheck)et).getTypeOfIntArray(), (et, vl) -> ((SimpleVendorCheck)et).setTypeOfIntArray((org.docksidestage.postgresql.mytype.MyArray)vl), "typeOfIntArray");
        setupEpg(_epgMap, et -> ((SimpleVendorCheck)et).getTypeOfInt4(), (et, vl) -> ((SimpleVendorCheck)et).setTypeOfInt4(cti(vl)), "typeOfInt4");
        setupEpg(_epgMap, et -> ((SimpleVendorCheck)et).getTypeOfMoney(), (et, vl) -> ((SimpleVendorCheck)et).setTypeOfMoney(ctb(vl)), "typeOfMoney");
        setupEpg(_epgMap, et -> ((SimpleVendorCheck)et).getTypeOfDate(), (et, vl) -> ((SimpleVendorCheck)et).setTypeOfDate((java.time.LocalDate)vl), "typeOfDate");
        setupEpg(_epgMap, et -> ((SimpleVendorCheck)et).getTypeOfTime(), (et, vl) -> ((SimpleVendorCheck)et).setTypeOfTime((java.time.LocalTime)vl), "typeOfTime");
        setupEpg(_epgMap, et -> ((SimpleVendorCheck)et).getTypeOfTimestamp(), (et, vl) -> ((SimpleVendorCheck)et).setTypeOfTimestamp((java.time.LocalDateTime)vl), "typeOfTimestamp");
        setupEpg(_epgMap, et -> ((SimpleVendorCheck)et).getTypeOfInterval(), (et, vl) -> ((SimpleVendorCheck)et).setTypeOfInterval((String)vl), "typeOfInterval");
        setupEpg(_epgMap, et -> ((SimpleVendorCheck)et).getTypeOfTimetz(), (et, vl) -> ((SimpleVendorCheck)et).setTypeOfTimetz((java.time.LocalTime)vl), "typeOfTimetz");
        setupEpg(_epgMap, et -> ((SimpleVendorCheck)et).getTypeOfBool(), (et, vl) -> {
            ColumnInfo col = columnTypeOfBool();
            CDef.TrueFalse cls = (CDef.TrueFalse)gcls(col, vl);
            if (cls != null) {
                ((SimpleVendorCheck)et).setTypeOfBoolAsTrueFalse(cls);
            } else {
                ((SimpleVendorCheck)et).mynativeMappingTypeOfBool((Boolean)vl);
            }
        }, "typeOfBool");
        setupEpg(_epgMap, et -> ((SimpleVendorCheck)et).getTypeOfBit(), (et, vl) -> ((SimpleVendorCheck)et).setTypeOfBit((Boolean)vl), "typeOfBit");
        setupEpg(_epgMap, et -> ((SimpleVendorCheck)et).getTypeOfBytea(), (et, vl) -> ((SimpleVendorCheck)et).setTypeOfBytea((byte[])vl), "typeOfBytea");
        setupEpg(_epgMap, et -> ((SimpleVendorCheck)et).getTypeOfUuid(), (et, vl) -> ((SimpleVendorCheck)et).setTypeOfUuid((java.util.UUID)vl), "typeOfUuid");
        setupEpg(_epgMap, et -> ((SimpleVendorCheck)et).getTypeOfOid(), (et, vl) -> ((SimpleVendorCheck)et).setTypeOfOid((byte[])vl), "typeOfOid");
        setupEpg(_epgMap, et -> ((SimpleVendorCheck)et).getTypeOfXml(), (et, vl) -> ((SimpleVendorCheck)et).setTypeOfXml((org.docksidestage.postgresql.mytype.MyXML)vl), "typeOfXml");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SimpleVendorCheck";
    protected final String _tablePropertyName = "simpleVendorCheck";
    protected final TableSqlName _tableSqlName = new TableSqlName("SimpleVendorCheck", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnVendorCheckId = cci("vendor_check_id", "vendor_check_id", null, null, Long.class, "vendorCheckId", null, false, false, false, "numeric", 16, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfVarchar = cci("type_of_varchar", "type_of_varchar", null, null, String.class, "typeOfVarchar", null, false, false, false, "varchar", 2147483647, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfVcArray = cci("type_of_vc_array", "type_of_vc_array", null, null, org.docksidestage.postgresql.mytype.MyArray.class, "typeOfVcArray", null, false, false, false, "_varchar", 2147483647, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfText = cci("type_of_text", "type_of_text", null, null, String.class, "typeOfText", null, false, false, false, "text", 2147483647, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfNumericInteger = cci("type_of_numeric_integer", "type_of_numeric_integer", null, null, Integer.class, "typeOfNumericInteger", null, false, false, false, "numeric", 5, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfNumericBigint = cci("type_of_numeric_bigint", "type_of_numeric_bigint", null, null, Long.class, "typeOfNumericBigint", null, false, false, false, "numeric", 12, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfNumericDecimal = cci("type_of_numeric_decimal", "type_of_numeric_decimal", null, null, java.math.BigDecimal.class, "typeOfNumericDecimal", null, false, false, false, "numeric", 5, 3, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfDecimal = cci("type_of_decimal", "type_of_decimal", null, null, java.math.BigDecimal.class, "typeOfDecimal", null, false, false, false, "numeric", 131089, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfBigint = cci("type_of_bigint", "type_of_bigint", null, null, Long.class, "typeOfBigint", null, false, false, false, "int8", 19, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfInt8 = cci("type_of_int8", "type_of_int8", null, null, Long.class, "typeOfInt8", null, false, false, false, "int8", 19, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfIntArray = cci("type_of_int_array", "type_of_int_array", null, null, org.docksidestage.postgresql.mytype.MyArray.class, "typeOfIntArray", null, false, false, false, "_int8", 19, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfInt4 = cci("type_of_int4", "type_of_int4", null, null, Integer.class, "typeOfInt4", null, false, false, false, "int4", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfMoney = cci("type_of_money", "type_of_money", null, null, java.math.BigDecimal.class, "typeOfMoney", null, false, false, false, "money", 2147483647, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfDate = cci("type_of_date", "type_of_date", null, null, java.time.LocalDate.class, "typeOfDate", null, false, false, false, "date", 13, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfTime = cci("type_of_time", "type_of_time", null, null, java.time.LocalTime.class, "typeOfTime", null, false, false, false, "time", 15, 6, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfTimestamp = cci("type_of_timestamp", "type_of_timestamp", null, null, java.time.LocalDateTime.class, "typeOfTimestamp", null, false, false, false, "timestamp", 29, 6, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfInterval = cci("type_of_interval", "type_of_interval", null, null, String.class, "typeOfInterval", null, false, false, false, "interval", 49, 6, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfTimetz = cci("type_of_timetz", "type_of_timetz", null, null, java.time.LocalTime.class, "typeOfTimetz", null, false, false, false, "timetz", 21, 6, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfBool = cci("type_of_bool", "type_of_bool", null, null, Boolean.class, "typeOfBool", null, false, false, false, "bool", 1, 0, null, false, null, null, null, null, CDef.DefMeta.TrueFalse, false);
    protected final ColumnInfo _columnTypeOfBit = cci("type_of_bit", "type_of_bit", null, null, Boolean.class, "typeOfBit", null, false, false, false, "bit", 1, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfBytea = cci("type_of_bytea", "type_of_bytea", null, null, byte[].class, "typeOfBytea", null, false, false, false, "bytea", 2147483647, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfUuid = cci("type_of_uuid", "type_of_uuid", null, null, java.util.UUID.class, "typeOfUuid", null, false, false, false, "uuid", 2147483647, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfOid = cci("type_of_oid", "type_of_oid", null, null, byte[].class, "typeOfOid", null, false, false, false, "oid", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfXml = cci("type_of_xml", "type_of_xml", null, null, org.docksidestage.postgresql.mytype.MyXML.class, "typeOfXml", null, false, false, false, "xml", 2147483647, 0, null, false, null, null, null, null, null, false);

    /**
     * vendor_check_id: {numeric(16), refers to vendor_check.vendor_check_id}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVendorCheckId() { return _columnVendorCheckId; }
    /**
     * type_of_varchar: {varchar(2147483647), refers to vendor_check.type_of_varchar}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfVarchar() { return _columnTypeOfVarchar; }
    /**
     * type_of_vc_array: {_varchar(2147483647), refers to vendor_check.type_of_vc_array}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfVcArray() { return _columnTypeOfVcArray; }
    /**
     * type_of_text: {text(2147483647), refers to vendor_check.type_of_text}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfText() { return _columnTypeOfText; }
    /**
     * type_of_numeric_integer: {numeric(5), refers to vendor_check.type_of_numeric_integer}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfNumericInteger() { return _columnTypeOfNumericInteger; }
    /**
     * type_of_numeric_bigint: {numeric(12), refers to vendor_check.type_of_numeric_bigint}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfNumericBigint() { return _columnTypeOfNumericBigint; }
    /**
     * type_of_numeric_decimal: {numeric(5, 3), refers to vendor_check.type_of_numeric_decimal}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfNumericDecimal() { return _columnTypeOfNumericDecimal; }
    /**
     * type_of_decimal: {numeric(131089), refers to vendor_check.type_of_decimal}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfDecimal() { return _columnTypeOfDecimal; }
    /**
     * type_of_bigint: {int8(19), refers to vendor_check.type_of_bigint}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfBigint() { return _columnTypeOfBigint; }
    /**
     * type_of_int8: {int8(19), refers to vendor_check.type_of_int8}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfInt8() { return _columnTypeOfInt8; }
    /**
     * type_of_int_array: {_int8(19), refers to vendor_check.type_of_int_array}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfIntArray() { return _columnTypeOfIntArray; }
    /**
     * type_of_int4: {int4(10), refers to vendor_check.type_of_int4}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfInt4() { return _columnTypeOfInt4; }
    /**
     * type_of_money: {money(2147483647), refers to vendor_check.type_of_money}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfMoney() { return _columnTypeOfMoney; }
    /**
     * type_of_date: {date(13), refers to vendor_check.type_of_date}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfDate() { return _columnTypeOfDate; }
    /**
     * type_of_time: {time(15, 6), refers to vendor_check.type_of_time}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfTime() { return _columnTypeOfTime; }
    /**
     * type_of_timestamp: {timestamp(29, 6), refers to vendor_check.type_of_timestamp}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfTimestamp() { return _columnTypeOfTimestamp; }
    /**
     * type_of_interval: {interval(49, 6), refers to vendor_check.type_of_interval}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfInterval() { return _columnTypeOfInterval; }
    /**
     * type_of_timetz: {timetz(21, 6), refers to vendor_check.type_of_timetz}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfTimetz() { return _columnTypeOfTimetz; }
    /**
     * type_of_bool: {bool(1), refers to vendor_check.type_of_bool, classification=TrueFalse}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfBool() { return _columnTypeOfBool; }
    /**
     * type_of_bit: {bit(1), refers to vendor_check.type_of_bit}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfBit() { return _columnTypeOfBit; }
    /**
     * type_of_bytea: {bytea(2147483647), refers to vendor_check.type_of_bytea}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfBytea() { return _columnTypeOfBytea; }
    /**
     * type_of_uuid: {uuid(2147483647), refers to vendor_check.type_of_uuid}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfUuid() { return _columnTypeOfUuid; }
    /**
     * type_of_oid: {oid(10), refers to vendor_check.type_of_oid}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfOid() { return _columnTypeOfOid; }
    /**
     * type_of_xml: {xml(2147483647), refers to vendor_check.type_of_xml}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfXml() { return _columnTypeOfXml; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnVendorCheckId());
        ls.add(columnTypeOfVarchar());
        ls.add(columnTypeOfVcArray());
        ls.add(columnTypeOfText());
        ls.add(columnTypeOfNumericInteger());
        ls.add(columnTypeOfNumericBigint());
        ls.add(columnTypeOfNumericDecimal());
        ls.add(columnTypeOfDecimal());
        ls.add(columnTypeOfBigint());
        ls.add(columnTypeOfInt8());
        ls.add(columnTypeOfIntArray());
        ls.add(columnTypeOfInt4());
        ls.add(columnTypeOfMoney());
        ls.add(columnTypeOfDate());
        ls.add(columnTypeOfTime());
        ls.add(columnTypeOfTimestamp());
        ls.add(columnTypeOfInterval());
        ls.add(columnTypeOfTimetz());
        ls.add(columnTypeOfBool());
        ls.add(columnTypeOfBit());
        ls.add(columnTypeOfBytea());
        ls.add(columnTypeOfUuid());
        ls.add(columnTypeOfOid());
        ls.add(columnTypeOfXml());
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
    public String getEntityTypeName() { return "org.docksidestage.postgresql.dbflute.exentity.customize.SimpleVendorCheck"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SimpleVendorCheck> getEntityType() { return SimpleVendorCheck.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SimpleVendorCheck newEntity() { return new SimpleVendorCheck(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SimpleVendorCheck)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SimpleVendorCheck)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
