package org.docksidestage.postgresql.dbflute.allcommon;

import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import java.lang.reflect.Method;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.DBMetaProvider;
import org.dbflute.exception.DBMetaNotFoundException;
import org.dbflute.helper.StringKeyMap;
import org.dbflute.util.DfAssertUtil;

/**
 * The handler of the instance of DB meta.
 * @author DBFlute(AutoGenerator)
 */
public class DBMetaInstanceHandler implements DBMetaProvider {

    // ===================================================================================
    //                                                                        Resource Map
    //                                                                        ============
    /** The map of DB meta instance by key 'table DB-name'. (NotNull, LazyLoaded) */
    protected static final Map<String, DBMeta> _tableDbNameInstanceMap = newHashMap();

    /** The map of DB meta instance by key 'entity type'. (NotNull, LazyLoaded) */
    protected static final Map<Class<?>, DBMeta> _entityTypeInstanceMap = newHashMap();

    /** The map of table DB name and DB meta class name. (NotNull) */
    protected static final Map<String, String> _tableDbNameClassNameMap;
    static {
        final Map<String, String> tmpMap = newHashMap();
        tmpMap.put("next_schema_product", "org.docksidestage.postgresql.dbflute.bsentity.dbmeta.NextSchemaProductDbm");
        tmpMap.put("nextschema.white_same_name", "org.docksidestage.postgresql.dbflute.bsentity.dbmeta.NextschemaWhiteSameNameDbm");
        tmpMap.put("nextschema.white_same_name_ref", "org.docksidestage.postgresql.dbflute.bsentity.dbmeta.NextschemaWhiteSameNameRefDbm");
        tmpMap.put("VENDOR-NON COMPILABLE", "org.docksidestage.postgresql.dbflute.bsentity.dbmeta.Vendor_non_compilableDbm");
        tmpMap.put("member", "org.docksidestage.postgresql.dbflute.bsentity.dbmeta.MemberDbm");
        tmpMap.put("member_address", "org.docksidestage.postgresql.dbflute.bsentity.dbmeta.MemberAddressDbm");
        tmpMap.put("member_login", "org.docksidestage.postgresql.dbflute.bsentity.dbmeta.MemberLoginDbm");
        tmpMap.put("member_security", "org.docksidestage.postgresql.dbflute.bsentity.dbmeta.MemberSecurityDbm");
        tmpMap.put("member_service", "org.docksidestage.postgresql.dbflute.bsentity.dbmeta.MemberServiceDbm");
        tmpMap.put("member_status", "org.docksidestage.postgresql.dbflute.bsentity.dbmeta.MemberStatusDbm");
        tmpMap.put("member_withdrawal", "org.docksidestage.postgresql.dbflute.bsentity.dbmeta.MemberWithdrawalDbm");
        tmpMap.put("nested_summary_product", "org.docksidestage.postgresql.dbflute.bsentity.dbmeta.NestedSummaryProductDbm");
        tmpMap.put("product", "org.docksidestage.postgresql.dbflute.bsentity.dbmeta.ProductDbm");
        tmpMap.put("product_category", "org.docksidestage.postgresql.dbflute.bsentity.dbmeta.ProductCategoryDbm");
        tmpMap.put("product_status", "org.docksidestage.postgresql.dbflute.bsentity.dbmeta.ProductStatusDbm");
        tmpMap.put("purchase", "org.docksidestage.postgresql.dbflute.bsentity.dbmeta.PurchaseDbm");
        tmpMap.put("purchase_payment", "org.docksidestage.postgresql.dbflute.bsentity.dbmeta.PurchasePaymentDbm");
        tmpMap.put("region", "org.docksidestage.postgresql.dbflute.bsentity.dbmeta.RegionDbm");
        tmpMap.put("service_rank", "org.docksidestage.postgresql.dbflute.bsentity.dbmeta.ServiceRankDbm");
        tmpMap.put("summary_product", "org.docksidestage.postgresql.dbflute.bsentity.dbmeta.SummaryProductDbm");
        tmpMap.put("vendor_$_dollar", "org.docksidestage.postgresql.dbflute.bsentity.dbmeta.Vendor$DollarDbm");
        tmpMap.put("vendor_check", "org.docksidestage.postgresql.dbflute.bsentity.dbmeta.VendorCheckDbm");
        tmpMap.put("vendor_date_fk", "org.docksidestage.postgresql.dbflute.bsentity.dbmeta.VendorDateFkDbm");
        tmpMap.put("vendor_date_pk", "org.docksidestage.postgresql.dbflute.bsentity.dbmeta.VendorDatePkDbm");
        tmpMap.put("vendor_inherit_inu", "org.docksidestage.postgresql.dbflute.bsentity.dbmeta.VendorInheritInuDbm");
        tmpMap.put("vendor_inherit_neko", "org.docksidestage.postgresql.dbflute.bsentity.dbmeta.VendorInheritNekoDbm");
        tmpMap.put("vendor_large_data", "org.docksidestage.postgresql.dbflute.bsentity.dbmeta.VendorLargeDataDbm");
        tmpMap.put("vendor_large_data_ref", "org.docksidestage.postgresql.dbflute.bsentity.dbmeta.VendorLargeDataRefDbm");
        tmpMap.put("vendor_part_man", "org.docksidestage.postgresql.dbflute.bsentity.dbmeta.VendorPartManDbm");
        tmpMap.put("vendor_part_man_high", "org.docksidestage.postgresql.dbflute.bsentity.dbmeta.VendorPartManHighDbm");
        tmpMap.put("vendor_uuid_bar", "org.docksidestage.postgresql.dbflute.bsentity.dbmeta.VendorUuidBarDbm");
        tmpMap.put("vendor_uuid_foo", "org.docksidestage.postgresql.dbflute.bsentity.dbmeta.VendorUuidFooDbm");
        tmpMap.put("white_compound_pk", "org.docksidestage.postgresql.dbflute.bsentity.dbmeta.WhiteCompoundPkDbm");
        tmpMap.put("white_compound_pk_ref", "org.docksidestage.postgresql.dbflute.bsentity.dbmeta.WhiteCompoundPkRefDbm");
        tmpMap.put("white_compound_pk_wrong_order", "org.docksidestage.postgresql.dbflute.bsentity.dbmeta.WhiteCompoundPkWrongOrderDbm");
        tmpMap.put("white_not_pk", "org.docksidestage.postgresql.dbflute.bsentity.dbmeta.WhiteNotPkDbm");
        tmpMap.put("white_same_name", "org.docksidestage.postgresql.dbflute.bsentity.dbmeta.WhiteSameNameDbm");
        tmpMap.put("white_same_name_ref", "org.docksidestage.postgresql.dbflute.bsentity.dbmeta.WhiteSameNameRefDbm");
        tmpMap.put("white_type_mapping_point", "org.docksidestage.postgresql.dbflute.bsentity.dbmeta.WhiteTypeMappingPointDbm");
        tmpMap.put("white_xls_man", "org.docksidestage.postgresql.dbflute.bsentity.dbmeta.WhiteXlsManDbm");
        tmpMap.put("withdrawal_reason", "org.docksidestage.postgresql.dbflute.bsentity.dbmeta.WithdrawalReasonDbm");
        tmpMap.put("wrapped_summary_product", "org.docksidestage.postgresql.dbflute.bsentity.dbmeta.WrappedSummaryProductDbm");
        _tableDbNameClassNameMap = Collections.unmodifiableMap(tmpMap);
    }

    /** The flexible map of table DB name for conversion in finding process. (NotNull) */
    protected static final Map<String, String> _tableDbNameFlexibleMap = StringKeyMap.createAsFlexible();
    static {
        for (String tableDbName : _tableDbNameClassNameMap.keySet()) {
            _tableDbNameFlexibleMap.put(tableDbName, tableDbName);
        }
    }

    /**
     * Get the unmodifiable map of DB meta. map:{tableDbName = DBMeta}
     * @return The unmodifiable map that contains all instances of DB meta. (NotNull, NotEmpty)
     */
    public static Map<String, DBMeta> getUnmodifiableDBMetaMap() {
        initializeDBMetaMap();
        synchronized (_tableDbNameInstanceMap) {
            return Collections.unmodifiableMap(_tableDbNameInstanceMap);
        }
    }

    /**
     * Initialize the map of DB meta.
     */
    protected static void initializeDBMetaMap() {
        if (isInitialized()) {
            return;
        }
        synchronized (_tableDbNameInstanceMap) {
            for (String tableDbName : _tableDbNameClassNameMap.keySet()) {
                findDBMeta(tableDbName); // initialize
            }
            if (!isInitialized()) {
                String msg = "Failed to initialize tableDbNameInstanceMap: " + _tableDbNameInstanceMap;
                throw new IllegalStateException(msg);
            }
        }
    }

    protected static boolean isInitialized() {
        return _tableDbNameInstanceMap.size() == _tableDbNameClassNameMap.size();
    }

    // ===================================================================================
    //                                                                  Provider Singleton
    //                                                                  ==================
    protected static final DBMetaProvider _provider = new DBMetaInstanceHandler();

    public static DBMetaProvider getProvider() {
        return _provider;
    }

    public DBMeta provideDBMeta(String tableFlexibleName) {
        return byTableFlexibleName(tableFlexibleName);
    }

    public DBMeta provideDBMeta(Class<?> entityType) {
        return byEntityType(entityType);
    }

    public DBMeta provideDBMetaChecked(String tableFlexibleName) {
        return findDBMeta(tableFlexibleName);
    }

    public DBMeta provideDBMetaChecked(Class<?> entityType) {
        return findDBMeta(entityType);
    }

    // ===================================================================================
    //                                                                         Find DBMeta
    //                                                                         ===========
    /**
     * Find DB meta by table flexible name. (accept quoted name and schema prefix)
     * @param tableFlexibleName The flexible name of table. (NotNull)
     * @return The instance of DB meta. (NotNull)
     * @throws org.dbflute.exception.DBMetaNotFoundException When the DB meta is not found.
     */
    public static DBMeta findDBMeta(String tableFlexibleName) {
        DBMeta dbmeta = byTableFlexibleName(tableFlexibleName);
        if (dbmeta == null) {
            String msg = "The DB meta was not found by the table flexible name: key=" + tableFlexibleName;
            throw new DBMetaNotFoundException(msg);
        }
        return dbmeta;
    }

    /**
     * Find DB meta by entity type.
     * @param entityType The entity type of table, which should implement the {@link Entity} interface. (NotNull)
     * @return The instance of DB meta. (NotNull)
     * @throws org.dbflute.exception.DBMetaNotFoundException When the DB meta is not found.
     */
    public static DBMeta findDBMeta(Class<?> entityType) {
        DBMeta dbmeta = byEntityType(entityType);
        if (dbmeta == null) {
            String msg = "The DB meta was not found by the entity type: key=" + entityType;
            throw new DBMetaNotFoundException(msg);
        }
        return dbmeta;
    }

    // ===================================================================================
    //                                                                       by Table Name
    //                                                                       =============
    /**
     * @param tableFlexibleName The flexible name of table. (NotNull)
     * @return The instance of DB meta. (NullAllowed: If the DB meta is not found, it returns null)
     */
    protected static DBMeta byTableFlexibleName(String tableFlexibleName) {
        assertStringNotNullAndNotTrimmedEmpty("tableFlexibleName", tableFlexibleName);
        String tableDbName = _tableDbNameFlexibleMap.get(tableFlexibleName);
        if (tableDbName == null) {
            tableDbName = retryByNormalizedName(tableFlexibleName);
        }
        return tableDbName != null ? byTableDbName(tableDbName) : null;
    }

    protected static String retryByNormalizedName(String tableFlexibleName) {
        String tableDbName = null;
        String pureName = normalizeTableFlexibleName(tableFlexibleName);
        String schema = extractSchemaIfExists(tableFlexibleName);
        if (schema != null) { // first, find by qualified name
            tableDbName = _tableDbNameFlexibleMap.get(schema + "." + pureName);
        }
        if (tableDbName == null) { // next, find by pure name
            tableDbName = _tableDbNameFlexibleMap.get(pureName);
        }
        return tableDbName;
    }

    protected static String normalizeTableFlexibleName(String tableFlexibleName) {
        return removeQuoteIfExists(removeSchemaIfExists(tableFlexibleName));
    }

    protected static String removeQuoteIfExists(String name) {
        if (name.startsWith("\"") && name.endsWith("\"")) {
            return strip(name);
        } else if (name.startsWith("[") && name.endsWith("]")) {
            return strip(name);
        }
        return name;
    }

    protected static String removeSchemaIfExists(String name) {
        int dotLastIndex = name.lastIndexOf(".");
        return dotLastIndex >= 0 ? name.substring(dotLastIndex + ".".length()) : name;
    }

    protected static String extractSchemaIfExists(String name) {
        int dotLastIndex = name.lastIndexOf(".");
        return dotLastIndex >= 0 ? name.substring(0, dotLastIndex) : null;
    }

    protected static String strip(String name) {
        return name.substring(1, name.length() - 1);
    }

    /**
     * @param tableDbName The DB name of table. (NotNull)
     * @return The instance of DB meta. (NullAllowed: If the DB meta is not found, it returns null)
     */
    protected static DBMeta byTableDbName(String tableDbName) {
        assertStringNotNullAndNotTrimmedEmpty("tableDbName", tableDbName);
        return getCachedDBMeta(tableDbName);
    }

    // ===================================================================================
    //                                                                      by Entity Type
    //                                                                      ==============
    /**
     * @param entityType The entity type of table, which should implement the entity interface. (NotNull)
     * @return The instance of DB meta. (NullAllowed: If the DB meta is not found, it returns null)
     */
    protected static DBMeta byEntityType(Class<?> entityType) {
        assertObjectNotNull("entityType", entityType);
        return getCachedDBMeta(entityType);
    }

    // ===================================================================================
    //                                                                       Cached DBMeta
    //                                                                       =============
    protected static DBMeta getCachedDBMeta(String tableDbName) { // lazy-load (thank you koyak!)
        DBMeta dbmeta = _tableDbNameInstanceMap.get(tableDbName);
        if (dbmeta != null) {
            return dbmeta;
        }
        synchronized (_tableDbNameInstanceMap) {
            dbmeta = _tableDbNameInstanceMap.get(tableDbName);
            if (dbmeta != null) {
                // an other thread might have initialized
                // or reading might failed by same-time writing
                return dbmeta;
            }
            String dbmetaName = _tableDbNameClassNameMap.get(tableDbName);
            if (dbmetaName == null) {
                return null;
            }
            _tableDbNameInstanceMap.put(tableDbName, toDBMetaInstance(dbmetaName));
            return _tableDbNameInstanceMap.get(tableDbName);
        }
    }

    protected static DBMeta toDBMetaInstance(String dbmetaName) {
        try {
            Class<?> dbmetaType = Class.forName(dbmetaName);
            Method method = dbmetaType.getMethod("getInstance", (Class[])null);
            Object result = method.invoke(null, (Object[])null);
            return (DBMeta)result;
        } catch (Exception e) {
            String msg = "Failed to get the instance: " + dbmetaName;
            throw new IllegalStateException(msg, e);
        }
    }

    protected static DBMeta getCachedDBMeta(Class<?> entityType) { // lazy-load same as by-name
        DBMeta dbmeta = _entityTypeInstanceMap.get(entityType);
        if (dbmeta != null) {
            return dbmeta;
        }
        synchronized (_entityTypeInstanceMap) {
            dbmeta = _entityTypeInstanceMap.get(entityType);
            if (dbmeta != null) {
                // an other thread might have initialized
                // or reading might failed by same-time writing
                return dbmeta;
            }
            if (Entity.class.isAssignableFrom(entityType)) { // required
                Entity entity = newEntity(entityType);
                dbmeta = getCachedDBMeta(entity.asTableDbName());
            }
            if (dbmeta == null) {
                return null;
            }
            _entityTypeInstanceMap.put(entityType, dbmeta);
            return _entityTypeInstanceMap.get(entityType);
        }
    }

    protected static Entity newEntity(Class<?> entityType) {
        try {
            return (Entity)entityType.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            String msg = "Failed to new the instance: " + entityType;
            throw new IllegalStateException(msg, e);
        }
    }

    // ===================================================================================
    //                                                                      General Helper
    //                                                                      ==============
    protected static <KEY, VALUE> HashMap<KEY, VALUE> newHashMap() {
        return new HashMap<KEY, VALUE>();
    }

    // -----------------------------------------------------
    //                                         Assert Object
    //                                         -------------
    protected static void assertObjectNotNull(String variableName, Object value) {
        DfAssertUtil.assertObjectNotNull(variableName, value);
    }

    // -----------------------------------------------------
    //                                         Assert String
    //                                         -------------
    protected static void assertStringNotNullAndNotTrimmedEmpty(String variableName, String value) {
        DfAssertUtil.assertStringNotNullAndNotTrimmedEmpty(variableName, value);
    }
}
