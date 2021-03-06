package org.docksidestage.postgresql.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import org.docksidestage.postgresql.dbflute.allcommon.*;
import org.docksidestage.postgresql.dbflute.exentity.*;

/**
 * The DB meta of vendor_check. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class VendorCheckDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final VendorCheckDbm _instance = new VendorCheckDbm();
    private VendorCheckDbm() {}
    public static VendorCheckDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((VendorCheck)et).getVendorCheckId(), (et, vl) -> ((VendorCheck)et).setVendorCheckId(ctl(vl)), "vendorCheckId");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfChar(), (et, vl) -> ((VendorCheck)et).setTypeOfChar((String)vl), "typeOfChar");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfVarchar(), (et, vl) -> ((VendorCheck)et).setTypeOfVarchar((String)vl), "typeOfVarchar");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfVcArray(), (et, vl) -> ((VendorCheck)et).setTypeOfVcArray((org.docksidestage.postgresql.mytype.MyArray)vl), "typeOfVcArray");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfText(), (et, vl) -> ((VendorCheck)et).setTypeOfText((String)vl), "typeOfText");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfNumericInteger(), (et, vl) -> ((VendorCheck)et).setTypeOfNumericInteger(cti(vl)), "typeOfNumericInteger");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfNumericBigint(), (et, vl) -> ((VendorCheck)et).setTypeOfNumericBigint(ctl(vl)), "typeOfNumericBigint");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfNumericDecimal(), (et, vl) -> ((VendorCheck)et).setTypeOfNumericDecimal(ctb(vl)), "typeOfNumericDecimal");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfDecimal(), (et, vl) -> ((VendorCheck)et).setTypeOfDecimal(ctb(vl)), "typeOfDecimal");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfInt(), (et, vl) -> ((VendorCheck)et).setTypeOfInt(cti(vl)), "typeOfInt");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfIntArray(), (et, vl) -> ((VendorCheck)et).setTypeOfIntArray((org.docksidestage.postgresql.mytype.MyArray)vl), "typeOfIntArray");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfInt4(), (et, vl) -> ((VendorCheck)et).setTypeOfInt4(cti(vl)), "typeOfInt4");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfInt4Array(), (et, vl) -> ((VendorCheck)et).setTypeOfInt4Array((org.docksidestage.postgresql.mytype.MyArray)vl), "typeOfInt4Array");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfInt8(), (et, vl) -> ((VendorCheck)et).setTypeOfInt8(ctl(vl)), "typeOfInt8");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfInt8Array(), (et, vl) -> ((VendorCheck)et).setTypeOfInt8Array((org.docksidestage.postgresql.mytype.MyArray)vl), "typeOfInt8Array");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfBigint(), (et, vl) -> ((VendorCheck)et).setTypeOfBigint(ctl(vl)), "typeOfBigint");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfReal(), (et, vl) -> ((VendorCheck)et).setTypeOfReal(ctb(vl)), "typeOfReal");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfFloat(), (et, vl) -> ((VendorCheck)et).setTypeOfFloat(ctb(vl)), "typeOfFloat");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfMoney(), (et, vl) -> ((VendorCheck)et).setTypeOfMoney(ctb(vl)), "typeOfMoney");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfDate(), (et, vl) -> ((VendorCheck)et).setTypeOfDate(ctld(vl)), "typeOfDate");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfTimestamp(), (et, vl) -> ((VendorCheck)et).setTypeOfTimestamp(ctldt(vl)), "typeOfTimestamp");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfTime(), (et, vl) -> ((VendorCheck)et).setTypeOfTime(ctlt(vl)), "typeOfTime");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfTimetz(), (et, vl) -> ((VendorCheck)et).setTypeOfTimetz(ctlt(vl)), "typeOfTimetz");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfInterval(), (et, vl) -> ((VendorCheck)et).setTypeOfInterval((String)vl), "typeOfInterval");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfBool(), (et, vl) -> {
            ((VendorCheck)et).setTypeOfBool((Boolean)vl);
        }, "typeOfBool");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfBit(), (et, vl) -> ((VendorCheck)et).setTypeOfBit((Boolean)vl), "typeOfBit");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfBytea(), (et, vl) -> ((VendorCheck)et).setTypeOfBytea((byte[])vl), "typeOfBytea");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfOid(), (et, vl) -> ((VendorCheck)et).setTypeOfOid((byte[])vl), "typeOfOid");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfUuid(), (et, vl) -> ((VendorCheck)et).setTypeOfUuid((java.util.UUID)vl), "typeOfUuid");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfXml(), (et, vl) -> ((VendorCheck)et).setTypeOfXml((org.docksidestage.postgresql.mytype.MyXML)vl), "typeOfXml");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfJson(), (et, vl) -> ((VendorCheck)et).setTypeOfJson((org.docksidestage.postgresql.mytype.MyJSON)vl), "typeOfJson");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "vendor_check";
    protected final String _tableDispName = "vendor_check";
    protected final String _tablePropertyName = "vendorCheck";
    protected final TableSqlName _tableSqlName = new TableSqlName("vendor_check", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnVendorCheckId = cci("vendor_check_id", "vendor_check_id", null, null, Long.class, "vendorCheckId", null, true, false, true, "numeric", 16, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfChar = cci("type_of_char", "type_of_char", null, null, String.class, "typeOfChar", null, false, false, false, "bpchar", 3, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfVarchar = cci("type_of_varchar", "type_of_varchar", null, null, String.class, "typeOfVarchar", null, false, false, false, "varchar", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfVcArray = cci("type_of_vc_array", "type_of_vc_array", null, null, org.docksidestage.postgresql.mytype.MyArray.class, "typeOfVcArray", null, false, false, false, "_varchar", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfText = cci("type_of_text", "type_of_text", null, null, String.class, "typeOfText", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfNumericInteger = cci("type_of_numeric_integer", "type_of_numeric_integer", null, null, Integer.class, "typeOfNumericInteger", null, false, false, false, "numeric", 5, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfNumericBigint = cci("type_of_numeric_bigint", "type_of_numeric_bigint", null, null, Long.class, "typeOfNumericBigint", null, false, false, false, "numeric", 12, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfNumericDecimal = cci("type_of_numeric_decimal", "type_of_numeric_decimal", null, null, java.math.BigDecimal.class, "typeOfNumericDecimal", null, false, false, false, "numeric", 5, 3, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfDecimal = cci("type_of_decimal", "type_of_decimal", null, null, java.math.BigDecimal.class, "typeOfDecimal", null, false, false, false, "numeric", 131089, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfInt = cci("type_of_int", "type_of_int", null, null, Integer.class, "typeOfInt", null, false, false, false, "int4", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfIntArray = cci("type_of_int_array", "type_of_int_array", null, null, org.docksidestage.postgresql.mytype.MyArray.class, "typeOfIntArray", null, false, false, false, "_int4", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfInt4 = cci("type_of_int4", "type_of_int4", null, null, Integer.class, "typeOfInt4", null, false, false, false, "int4", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfInt4Array = cci("type_of_int4_array", "type_of_int4_array", null, null, org.docksidestage.postgresql.mytype.MyArray.class, "typeOfInt4Array", null, false, false, false, "_int4", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfInt8 = cci("type_of_int8", "type_of_int8", null, null, Long.class, "typeOfInt8", null, false, false, false, "int8", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfInt8Array = cci("type_of_int8_array", "type_of_int8_array", null, null, org.docksidestage.postgresql.mytype.MyArray.class, "typeOfInt8Array", null, false, false, false, "_int8", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfBigint = cci("type_of_bigint", "type_of_bigint", null, null, Long.class, "typeOfBigint", null, false, false, false, "int8", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfReal = cci("type_of_real", "type_of_real", null, null, java.math.BigDecimal.class, "typeOfReal", null, false, false, false, "float4", 8, 8, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfFloat = cci("type_of_float", "type_of_float", null, null, java.math.BigDecimal.class, "typeOfFloat", null, false, false, false, "float8", 17, 17, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfMoney = cci("type_of_money", "type_of_money", null, null, java.math.BigDecimal.class, "typeOfMoney", null, false, false, false, "money", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfDate = cci("type_of_date", "type_of_date", null, null, java.time.LocalDate.class, "typeOfDate", null, false, false, false, "date", 13, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfTimestamp = cci("type_of_timestamp", "type_of_timestamp", null, null, java.time.LocalDateTime.class, "typeOfTimestamp", null, false, false, false, "timestamp", 29, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfTime = cci("type_of_time", "type_of_time", null, null, java.time.LocalTime.class, "typeOfTime", null, false, false, false, "time", 15, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfTimetz = cci("type_of_timetz", "type_of_timetz", null, null, java.time.LocalTime.class, "typeOfTimetz", null, false, false, false, "timetz", 21, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfInterval = cci("type_of_interval", "type_of_interval", null, null, String.class, "typeOfInterval", null, false, false, false, "interval", 49, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfBool = cci("type_of_bool", "type_of_bool", null, null, Boolean.class, "typeOfBool", null, false, false, false, "bool", 1, 0, null, null, false, null, null, null, null, CDef.DefMeta.TrueFalse, false);
    protected final ColumnInfo _columnTypeOfBit = cci("type_of_bit", "type_of_bit", null, null, Boolean.class, "typeOfBit", null, false, false, false, "bit", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfBytea = cci("type_of_bytea", "type_of_bytea", null, null, byte[].class, "typeOfBytea", null, false, false, false, "bytea", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfOid = cci("type_of_oid", "type_of_oid", null, null, byte[].class, "typeOfOid", null, false, false, false, "oid", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfUuid = cci("type_of_uuid", "type_of_uuid", null, null, java.util.UUID.class, "typeOfUuid", null, false, false, false, "uuid", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfXml = cci("type_of_xml", "type_of_xml", null, null, org.docksidestage.postgresql.mytype.MyXML.class, "typeOfXml", null, false, false, false, "xml", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfJson = cci("type_of_json", "type_of_json", null, null, org.docksidestage.postgresql.mytype.MyJSON.class, "typeOfJson", null, false, false, false, "json", 2147483647, 0, null, null, false, null, null, null, null, null, false);

    /**
     * vendor_check_id: {PK, NotNull, numeric(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVendorCheckId() { return _columnVendorCheckId; }
    /**
     * type_of_char: {bpchar(3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfChar() { return _columnTypeOfChar; }
    /**
     * type_of_varchar: {varchar(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfVarchar() { return _columnTypeOfVarchar; }
    /**
     * type_of_vc_array: {_varchar(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfVcArray() { return _columnTypeOfVcArray; }
    /**
     * type_of_text: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfText() { return _columnTypeOfText; }
    /**
     * type_of_numeric_integer: {numeric(5)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfNumericInteger() { return _columnTypeOfNumericInteger; }
    /**
     * type_of_numeric_bigint: {numeric(12)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfNumericBigint() { return _columnTypeOfNumericBigint; }
    /**
     * type_of_numeric_decimal: {numeric(5, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfNumericDecimal() { return _columnTypeOfNumericDecimal; }
    /**
     * type_of_decimal: {numeric(131089)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfDecimal() { return _columnTypeOfDecimal; }
    /**
     * type_of_int: {int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfInt() { return _columnTypeOfInt; }
    /**
     * type_of_int_array: {_int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfIntArray() { return _columnTypeOfIntArray; }
    /**
     * type_of_int4: {int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfInt4() { return _columnTypeOfInt4; }
    /**
     * type_of_int4_array: {_int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfInt4Array() { return _columnTypeOfInt4Array; }
    /**
     * type_of_int8: {int8(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfInt8() { return _columnTypeOfInt8; }
    /**
     * type_of_int8_array: {_int8(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfInt8Array() { return _columnTypeOfInt8Array; }
    /**
     * type_of_bigint: {int8(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfBigint() { return _columnTypeOfBigint; }
    /**
     * type_of_real: {float4(8, 8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfReal() { return _columnTypeOfReal; }
    /**
     * type_of_float: {float8(17, 17)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfFloat() { return _columnTypeOfFloat; }
    /**
     * type_of_money: {money(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfMoney() { return _columnTypeOfMoney; }
    /**
     * type_of_date: {date(13)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfDate() { return _columnTypeOfDate; }
    /**
     * type_of_timestamp: {timestamp(29, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfTimestamp() { return _columnTypeOfTimestamp; }
    /**
     * type_of_time: {time(15, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfTime() { return _columnTypeOfTime; }
    /**
     * type_of_timetz: {timetz(21, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfTimetz() { return _columnTypeOfTimetz; }
    /**
     * type_of_interval: {interval(49, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfInterval() { return _columnTypeOfInterval; }
    /**
     * type_of_bool: {bool(1), classification=TrueFalse}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfBool() { return _columnTypeOfBool; }
    /**
     * type_of_bit: {bit(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfBit() { return _columnTypeOfBit; }
    /**
     * type_of_bytea: {bytea(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfBytea() { return _columnTypeOfBytea; }
    /**
     * type_of_oid: {oid(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfOid() { return _columnTypeOfOid; }
    /**
     * type_of_uuid: {uuid(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfUuid() { return _columnTypeOfUuid; }
    /**
     * type_of_xml: {xml(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfXml() { return _columnTypeOfXml; }
    /**
     * type_of_json: {json(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfJson() { return _columnTypeOfJson; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnVendorCheckId());
        ls.add(columnTypeOfChar());
        ls.add(columnTypeOfVarchar());
        ls.add(columnTypeOfVcArray());
        ls.add(columnTypeOfText());
        ls.add(columnTypeOfNumericInteger());
        ls.add(columnTypeOfNumericBigint());
        ls.add(columnTypeOfNumericDecimal());
        ls.add(columnTypeOfDecimal());
        ls.add(columnTypeOfInt());
        ls.add(columnTypeOfIntArray());
        ls.add(columnTypeOfInt4());
        ls.add(columnTypeOfInt4Array());
        ls.add(columnTypeOfInt8());
        ls.add(columnTypeOfInt8Array());
        ls.add(columnTypeOfBigint());
        ls.add(columnTypeOfReal());
        ls.add(columnTypeOfFloat());
        ls.add(columnTypeOfMoney());
        ls.add(columnTypeOfDate());
        ls.add(columnTypeOfTimestamp());
        ls.add(columnTypeOfTime());
        ls.add(columnTypeOfTimetz());
        ls.add(columnTypeOfInterval());
        ls.add(columnTypeOfBool());
        ls.add(columnTypeOfBit());
        ls.add(columnTypeOfBytea());
        ls.add(columnTypeOfOid());
        ls.add(columnTypeOfUuid());
        ls.add(columnTypeOfXml());
        ls.add(columnTypeOfJson());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnVendorCheckId()); }
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

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.postgresql.dbflute.exentity.VendorCheck"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.postgresql.dbflute.cbean.VendorCheckCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.postgresql.dbflute.exbhv.VendorCheckBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<VendorCheck> getEntityType() { return VendorCheck.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public VendorCheck newEntity() { return new VendorCheck(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((VendorCheck)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((VendorCheck)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
