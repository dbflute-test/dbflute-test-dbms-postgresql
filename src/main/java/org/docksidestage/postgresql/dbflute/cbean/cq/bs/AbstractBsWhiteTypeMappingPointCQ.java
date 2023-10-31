package org.docksidestage.postgresql.dbflute.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import org.docksidestage.postgresql.dbflute.allcommon.*;
import org.docksidestage.postgresql.dbflute.cbean.*;
import org.docksidestage.postgresql.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of white_type_mapping_point.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteTypeMappingPointCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteTypeMappingPointCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "white_type_mapping_point";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * type_mapping_point_id: {PK, NotNull, int8(19)}
     * @param typeMappingPointId The value of typeMappingPointId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeMappingPointId_Equal(Long typeMappingPointId) {
        doSetTypeMappingPointId_Equal(typeMappingPointId);
    }

    protected void doSetTypeMappingPointId_Equal(Long typeMappingPointId) {
        regTypeMappingPointId(CK_EQ, typeMappingPointId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * type_mapping_point_id: {PK, NotNull, int8(19)}
     * @param typeMappingPointId The value of typeMappingPointId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeMappingPointId_GreaterThan(Long typeMappingPointId) {
        regTypeMappingPointId(CK_GT, typeMappingPointId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * type_mapping_point_id: {PK, NotNull, int8(19)}
     * @param typeMappingPointId The value of typeMappingPointId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeMappingPointId_LessThan(Long typeMappingPointId) {
        regTypeMappingPointId(CK_LT, typeMappingPointId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * type_mapping_point_id: {PK, NotNull, int8(19)}
     * @param typeMappingPointId The value of typeMappingPointId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeMappingPointId_GreaterEqual(Long typeMappingPointId) {
        regTypeMappingPointId(CK_GE, typeMappingPointId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * type_mapping_point_id: {PK, NotNull, int8(19)}
     * @param typeMappingPointId The value of typeMappingPointId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeMappingPointId_LessEqual(Long typeMappingPointId) {
        regTypeMappingPointId(CK_LE, typeMappingPointId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * type_mapping_point_id: {PK, NotNull, int8(19)}
     * @param minNumber The min number of typeMappingPointId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeMappingPointId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTypeMappingPointId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTypeMappingPointId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * type_mapping_point_id: {PK, NotNull, int8(19)}
     * @param minNumber The min number of typeMappingPointId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeMappingPointId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setTypeMappingPointId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTypeMappingPointId(), "type_mapping_point_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * type_mapping_point_id: {PK, NotNull, int8(19)}
     * @param typeMappingPointIdList The collection of typeMappingPointId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeMappingPointId_InScope(Collection<Long> typeMappingPointIdList) {
        doSetTypeMappingPointId_InScope(typeMappingPointIdList);
    }

    protected void doSetTypeMappingPointId_InScope(Collection<Long> typeMappingPointIdList) {
        regINS(CK_INS, cTL(typeMappingPointIdList), xgetCValueTypeMappingPointId(), "type_mapping_point_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * type_mapping_point_id: {PK, NotNull, int8(19)}
     * @param typeMappingPointIdList The collection of typeMappingPointId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeMappingPointId_NotInScope(Collection<Long> typeMappingPointIdList) {
        doSetTypeMappingPointId_NotInScope(typeMappingPointIdList);
    }

    protected void doSetTypeMappingPointId_NotInScope(Collection<Long> typeMappingPointIdList) {
        regINS(CK_NINS, cTL(typeMappingPointIdList), xgetCValueTypeMappingPointId(), "type_mapping_point_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * type_mapping_point_id: {PK, NotNull, int8(19)}
     */
    public void setTypeMappingPointId_IsNull() { regTypeMappingPointId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * type_mapping_point_id: {PK, NotNull, int8(19)}
     */
    public void setTypeMappingPointId_IsNotNull() { regTypeMappingPointId(CK_ISNN, DOBJ); }

    protected void regTypeMappingPointId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeMappingPointId(), "type_mapping_point_id"); }
    protected abstract ConditionValue xgetCValueTypeMappingPointId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * type_mapping_point_name: {varchar(200)}
     * @param typeMappingPointName The value of typeMappingPointName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeMappingPointName_Equal(String typeMappingPointName) {
        doSetTypeMappingPointName_Equal(fRES(typeMappingPointName));
    }

    protected void doSetTypeMappingPointName_Equal(String typeMappingPointName) {
        regTypeMappingPointName(CK_EQ, typeMappingPointName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * type_mapping_point_name: {varchar(200)}
     * @param typeMappingPointName The value of typeMappingPointName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeMappingPointName_NotEqual(String typeMappingPointName) {
        doSetTypeMappingPointName_NotEqual(fRES(typeMappingPointName));
    }

    protected void doSetTypeMappingPointName_NotEqual(String typeMappingPointName) {
        regTypeMappingPointName(CK_NES, typeMappingPointName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * type_mapping_point_name: {varchar(200)}
     * @param typeMappingPointNameList The collection of typeMappingPointName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeMappingPointName_InScope(Collection<String> typeMappingPointNameList) {
        doSetTypeMappingPointName_InScope(typeMappingPointNameList);
    }

    protected void doSetTypeMappingPointName_InScope(Collection<String> typeMappingPointNameList) {
        regINS(CK_INS, cTL(typeMappingPointNameList), xgetCValueTypeMappingPointName(), "type_mapping_point_name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * type_mapping_point_name: {varchar(200)}
     * @param typeMappingPointNameList The collection of typeMappingPointName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeMappingPointName_NotInScope(Collection<String> typeMappingPointNameList) {
        doSetTypeMappingPointName_NotInScope(typeMappingPointNameList);
    }

    protected void doSetTypeMappingPointName_NotInScope(Collection<String> typeMappingPointNameList) {
        regINS(CK_NINS, cTL(typeMappingPointNameList), xgetCValueTypeMappingPointName(), "type_mapping_point_name");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * type_mapping_point_name: {varchar(200)} <br>
     * <pre>e.g. setTypeMappingPointName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param typeMappingPointName The value of typeMappingPointName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeMappingPointName_LikeSearch(String typeMappingPointName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeMappingPointName_LikeSearch(typeMappingPointName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * type_mapping_point_name: {varchar(200)} <br>
     * <pre>e.g. setTypeMappingPointName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeMappingPointName The value of typeMappingPointName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setTypeMappingPointName_LikeSearch(String typeMappingPointName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeMappingPointName), xgetCValueTypeMappingPointName(), "type_mapping_point_name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * type_mapping_point_name: {varchar(200)}
     * @param typeMappingPointName The value of typeMappingPointName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeMappingPointName_NotLikeSearch(String typeMappingPointName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeMappingPointName_NotLikeSearch(typeMappingPointName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * type_mapping_point_name: {varchar(200)}
     * @param typeMappingPointName The value of typeMappingPointName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setTypeMappingPointName_NotLikeSearch(String typeMappingPointName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeMappingPointName), xgetCValueTypeMappingPointName(), "type_mapping_point_name", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * type_mapping_point_name: {varchar(200)}
     * @param typeMappingPointName The value of typeMappingPointName as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeMappingPointName_PrefixSearch(String typeMappingPointName) {
        setTypeMappingPointName_LikeSearch(typeMappingPointName, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * type_mapping_point_name: {varchar(200)}
     */
    public void setTypeMappingPointName_IsNull() { regTypeMappingPointName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * type_mapping_point_name: {varchar(200)}
     */
    public void setTypeMappingPointName_IsNullOrEmpty() { regTypeMappingPointName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * type_mapping_point_name: {varchar(200)}
     */
    public void setTypeMappingPointName_IsNotNull() { regTypeMappingPointName(CK_ISNN, DOBJ); }

    protected void regTypeMappingPointName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeMappingPointName(), "type_mapping_point_name"); }
    protected abstract ConditionValue xgetCValueTypeMappingPointName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * normal_integer: {int4(10)}
     * @param normalInteger The value of normalInteger as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNormalInteger_Equal(Integer normalInteger) {
        doSetNormalInteger_Equal(normalInteger);
    }

    protected void doSetNormalInteger_Equal(Integer normalInteger) {
        regNormalInteger(CK_EQ, normalInteger);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * normal_integer: {int4(10)}
     * @param normalInteger The value of normalInteger as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNormalInteger_GreaterThan(Integer normalInteger) {
        regNormalInteger(CK_GT, normalInteger);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * normal_integer: {int4(10)}
     * @param normalInteger The value of normalInteger as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNormalInteger_LessThan(Integer normalInteger) {
        regNormalInteger(CK_LT, normalInteger);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * normal_integer: {int4(10)}
     * @param normalInteger The value of normalInteger as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNormalInteger_GreaterEqual(Integer normalInteger) {
        regNormalInteger(CK_GE, normalInteger);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * normal_integer: {int4(10)}
     * @param normalInteger The value of normalInteger as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNormalInteger_LessEqual(Integer normalInteger) {
        regNormalInteger(CK_LE, normalInteger);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * normal_integer: {int4(10)}
     * @param minNumber The min number of normalInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of normalInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setNormalInteger_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setNormalInteger_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * normal_integer: {int4(10)}
     * @param minNumber The min number of normalInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of normalInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setNormalInteger_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNormalInteger(), "normal_integer", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * normal_integer: {int4(10)}
     * @param normalIntegerList The collection of normalInteger as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNormalInteger_InScope(Collection<Integer> normalIntegerList) {
        doSetNormalInteger_InScope(normalIntegerList);
    }

    protected void doSetNormalInteger_InScope(Collection<Integer> normalIntegerList) {
        regINS(CK_INS, cTL(normalIntegerList), xgetCValueNormalInteger(), "normal_integer");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * normal_integer: {int4(10)}
     * @param normalIntegerList The collection of normalInteger as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNormalInteger_NotInScope(Collection<Integer> normalIntegerList) {
        doSetNormalInteger_NotInScope(normalIntegerList);
    }

    protected void doSetNormalInteger_NotInScope(Collection<Integer> normalIntegerList) {
        regINS(CK_NINS, cTL(normalIntegerList), xgetCValueNormalInteger(), "normal_integer");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * normal_integer: {int4(10)}
     */
    public void setNormalInteger_IsNull() { regNormalInteger(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * normal_integer: {int4(10)}
     */
    public void setNormalInteger_IsNotNull() { regNormalInteger(CK_ISNN, DOBJ); }

    protected void regNormalInteger(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNormalInteger(), "normal_integer"); }
    protected abstract ConditionValue xgetCValueNormalInteger();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * normal_long: {int8(19)}
     * @param normalLong The value of normalLong as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNormalLong_Equal(Long normalLong) {
        doSetNormalLong_Equal(normalLong);
    }

    protected void doSetNormalLong_Equal(Long normalLong) {
        regNormalLong(CK_EQ, normalLong);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * normal_long: {int8(19)}
     * @param normalLong The value of normalLong as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNormalLong_GreaterThan(Long normalLong) {
        regNormalLong(CK_GT, normalLong);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * normal_long: {int8(19)}
     * @param normalLong The value of normalLong as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNormalLong_LessThan(Long normalLong) {
        regNormalLong(CK_LT, normalLong);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * normal_long: {int8(19)}
     * @param normalLong The value of normalLong as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNormalLong_GreaterEqual(Long normalLong) {
        regNormalLong(CK_GE, normalLong);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * normal_long: {int8(19)}
     * @param normalLong The value of normalLong as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNormalLong_LessEqual(Long normalLong) {
        regNormalLong(CK_LE, normalLong);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * normal_long: {int8(19)}
     * @param minNumber The min number of normalLong. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of normalLong. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setNormalLong_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setNormalLong_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * normal_long: {int8(19)}
     * @param minNumber The min number of normalLong. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of normalLong. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setNormalLong_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNormalLong(), "normal_long", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * normal_long: {int8(19)}
     * @param normalLongList The collection of normalLong as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNormalLong_InScope(Collection<Long> normalLongList) {
        doSetNormalLong_InScope(normalLongList);
    }

    protected void doSetNormalLong_InScope(Collection<Long> normalLongList) {
        regINS(CK_INS, cTL(normalLongList), xgetCValueNormalLong(), "normal_long");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * normal_long: {int8(19)}
     * @param normalLongList The collection of normalLong as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNormalLong_NotInScope(Collection<Long> normalLongList) {
        doSetNormalLong_NotInScope(normalLongList);
    }

    protected void doSetNormalLong_NotInScope(Collection<Long> normalLongList) {
        regINS(CK_NINS, cTL(normalLongList), xgetCValueNormalLong(), "normal_long");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * normal_long: {int8(19)}
     */
    public void setNormalLong_IsNull() { regNormalLong(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * normal_long: {int8(19)}
     */
    public void setNormalLong_IsNotNull() { regNormalLong(CK_ISNN, DOBJ); }

    protected void regNormalLong(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNormalLong(), "normal_long"); }
    protected abstract ConditionValue xgetCValueNormalLong();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * normal_date: {date(13)}
     * @param normalDate The value of normalDate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNormalDate_Equal(java.time.LocalDate normalDate) {
        regNormalDate(CK_EQ,  normalDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * normal_date: {date(13)}
     * @param normalDate The value of normalDate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNormalDate_GreaterThan(java.time.LocalDate normalDate) {
        regNormalDate(CK_GT,  normalDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * normal_date: {date(13)}
     * @param normalDate The value of normalDate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNormalDate_LessThan(java.time.LocalDate normalDate) {
        regNormalDate(CK_LT,  normalDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * normal_date: {date(13)}
     * @param normalDate The value of normalDate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNormalDate_GreaterEqual(java.time.LocalDate normalDate) {
        regNormalDate(CK_GE,  normalDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * normal_date: {date(13)}
     * @param normalDate The value of normalDate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNormalDate_LessEqual(java.time.LocalDate normalDate) {
        regNormalDate(CK_LE, normalDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * normal_date: {date(13)}
     * <pre>e.g. setNormalDate_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of normalDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of normalDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setNormalDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setNormalDate_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * normal_date: {date(13)}
     * <pre>e.g. setNormalDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of normalDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of normalDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setNormalDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "normal_date"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueNormalDate(), nm, op);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * normal_date: {date(13)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of normalDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of normalDate. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setNormalDate_DateFromTo(java.time.LocalDate fromDate, java.time.LocalDate toDate) {
        setNormalDate_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * normal_date: {date(13)}
     */
    public void setNormalDate_IsNull() { regNormalDate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * normal_date: {date(13)}
     */
    public void setNormalDate_IsNotNull() { regNormalDate(CK_ISNN, DOBJ); }

    protected void regNormalDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNormalDate(), "normal_date"); }
    protected abstract ConditionValue xgetCValueNormalDate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * normal_datetime: {timestamp(26, 3)}
     * @param normalDatetime The value of normalDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNormalDatetime_Equal(java.time.LocalDateTime normalDatetime) {
        regNormalDatetime(CK_EQ,  normalDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * normal_datetime: {timestamp(26, 3)}
     * @param normalDatetime The value of normalDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNormalDatetime_GreaterThan(java.time.LocalDateTime normalDatetime) {
        regNormalDatetime(CK_GT,  normalDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * normal_datetime: {timestamp(26, 3)}
     * @param normalDatetime The value of normalDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNormalDatetime_LessThan(java.time.LocalDateTime normalDatetime) {
        regNormalDatetime(CK_LT,  normalDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * normal_datetime: {timestamp(26, 3)}
     * @param normalDatetime The value of normalDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNormalDatetime_GreaterEqual(java.time.LocalDateTime normalDatetime) {
        regNormalDatetime(CK_GE,  normalDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * normal_datetime: {timestamp(26, 3)}
     * @param normalDatetime The value of normalDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNormalDatetime_LessEqual(java.time.LocalDateTime normalDatetime) {
        regNormalDatetime(CK_LE, normalDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * normal_datetime: {timestamp(26, 3)}
     * <pre>e.g. setNormalDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of normalDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of normalDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setNormalDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setNormalDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * normal_datetime: {timestamp(26, 3)}
     * <pre>e.g. setNormalDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of normalDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of normalDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setNormalDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "normal_datetime"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueNormalDatetime(), nm, op);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * normal_datetime: {timestamp(26, 3)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of normalDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of normalDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setNormalDatetime_DateFromTo(java.time.LocalDateTime fromDate, java.time.LocalDateTime toDate) {
        setNormalDatetime_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * normal_datetime: {timestamp(26, 3)}
     */
    public void setNormalDatetime_IsNull() { regNormalDatetime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * normal_datetime: {timestamp(26, 3)}
     */
    public void setNormalDatetime_IsNotNull() { regNormalDatetime(CK_ISNN, DOBJ); }

    protected void regNormalDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNormalDatetime(), "normal_datetime"); }
    protected abstract ConditionValue xgetCValueNormalDatetime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * point_long_integer: {int8(19)}
     * @param pointLongInteger The value of pointLongInteger as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPointLongInteger_Equal(Integer pointLongInteger) {
        doSetPointLongInteger_Equal(pointLongInteger);
    }

    protected void doSetPointLongInteger_Equal(Integer pointLongInteger) {
        regPointLongInteger(CK_EQ, pointLongInteger);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * point_long_integer: {int8(19)}
     * @param pointLongInteger The value of pointLongInteger as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPointLongInteger_GreaterThan(Integer pointLongInteger) {
        regPointLongInteger(CK_GT, pointLongInteger);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * point_long_integer: {int8(19)}
     * @param pointLongInteger The value of pointLongInteger as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPointLongInteger_LessThan(Integer pointLongInteger) {
        regPointLongInteger(CK_LT, pointLongInteger);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * point_long_integer: {int8(19)}
     * @param pointLongInteger The value of pointLongInteger as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPointLongInteger_GreaterEqual(Integer pointLongInteger) {
        regPointLongInteger(CK_GE, pointLongInteger);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * point_long_integer: {int8(19)}
     * @param pointLongInteger The value of pointLongInteger as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPointLongInteger_LessEqual(Integer pointLongInteger) {
        regPointLongInteger(CK_LE, pointLongInteger);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * point_long_integer: {int8(19)}
     * @param minNumber The min number of pointLongInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pointLongInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setPointLongInteger_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setPointLongInteger_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * point_long_integer: {int8(19)}
     * @param minNumber The min number of pointLongInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pointLongInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setPointLongInteger_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePointLongInteger(), "point_long_integer", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * point_long_integer: {int8(19)}
     * @param pointLongIntegerList The collection of pointLongInteger as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPointLongInteger_InScope(Collection<Integer> pointLongIntegerList) {
        doSetPointLongInteger_InScope(pointLongIntegerList);
    }

    protected void doSetPointLongInteger_InScope(Collection<Integer> pointLongIntegerList) {
        regINS(CK_INS, cTL(pointLongIntegerList), xgetCValuePointLongInteger(), "point_long_integer");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * point_long_integer: {int8(19)}
     * @param pointLongIntegerList The collection of pointLongInteger as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPointLongInteger_NotInScope(Collection<Integer> pointLongIntegerList) {
        doSetPointLongInteger_NotInScope(pointLongIntegerList);
    }

    protected void doSetPointLongInteger_NotInScope(Collection<Integer> pointLongIntegerList) {
        regINS(CK_NINS, cTL(pointLongIntegerList), xgetCValuePointLongInteger(), "point_long_integer");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * point_long_integer: {int8(19)}
     */
    public void setPointLongInteger_IsNull() { regPointLongInteger(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * point_long_integer: {int8(19)}
     */
    public void setPointLongInteger_IsNotNull() { regPointLongInteger(CK_ISNN, DOBJ); }

    protected void regPointLongInteger(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePointLongInteger(), "point_long_integer"); }
    protected abstract ConditionValue xgetCValuePointLongInteger();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * point_datetime_date: {timestamp(26, 3)}
     * @param pointDatetimeDate The value of pointDatetimeDate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPointDatetimeDate_Equal(java.time.LocalDate pointDatetimeDate) {
        regPointDatetimeDate(CK_EQ,  pointDatetimeDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * point_datetime_date: {timestamp(26, 3)}
     * @param pointDatetimeDate The value of pointDatetimeDate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPointDatetimeDate_GreaterThan(java.time.LocalDate pointDatetimeDate) {
        regPointDatetimeDate(CK_GT,  pointDatetimeDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * point_datetime_date: {timestamp(26, 3)}
     * @param pointDatetimeDate The value of pointDatetimeDate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPointDatetimeDate_LessThan(java.time.LocalDate pointDatetimeDate) {
        regPointDatetimeDate(CK_LT,  pointDatetimeDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * point_datetime_date: {timestamp(26, 3)}
     * @param pointDatetimeDate The value of pointDatetimeDate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPointDatetimeDate_GreaterEqual(java.time.LocalDate pointDatetimeDate) {
        regPointDatetimeDate(CK_GE,  pointDatetimeDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * point_datetime_date: {timestamp(26, 3)}
     * @param pointDatetimeDate The value of pointDatetimeDate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPointDatetimeDate_LessEqual(java.time.LocalDate pointDatetimeDate) {
        regPointDatetimeDate(CK_LE, pointDatetimeDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * point_datetime_date: {timestamp(26, 3)}
     * <pre>e.g. setPointDatetimeDate_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of pointDatetimeDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of pointDatetimeDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setPointDatetimeDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setPointDatetimeDate_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * point_datetime_date: {timestamp(26, 3)}
     * <pre>e.g. setPointDatetimeDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of pointDatetimeDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of pointDatetimeDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setPointDatetimeDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "point_datetime_date"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValuePointDatetimeDate(), nm, op);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * point_datetime_date: {timestamp(26, 3)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of pointDatetimeDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of pointDatetimeDate. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setPointDatetimeDate_DateFromTo(java.time.LocalDate fromDate, java.time.LocalDate toDate) {
        setPointDatetimeDate_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * point_datetime_date: {timestamp(26, 3)}
     */
    public void setPointDatetimeDate_IsNull() { regPointDatetimeDate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * point_datetime_date: {timestamp(26, 3)}
     */
    public void setPointDatetimeDate_IsNotNull() { regPointDatetimeDate(CK_ISNN, DOBJ); }

    protected void regPointDatetimeDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePointDatetimeDate(), "point_datetime_date"); }
    protected abstract ConditionValue xgetCValuePointDatetimeDate();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteTypeMappingPointCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteTypeMappingPointCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteTypeMappingPointCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteTypeMappingPointCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteTypeMappingPointCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteTypeMappingPointCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteTypeMappingPointCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteTypeMappingPointCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteTypeMappingPointCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteTypeMappingPointCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteTypeMappingPointCB&gt;() {
     *     public void query(WhiteTypeMappingPointCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteTypeMappingPointCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteTypeMappingPointCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteTypeMappingPointCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteTypeMappingPointCQ sq);

    protected WhiteTypeMappingPointCB xcreateScalarConditionCB() {
        WhiteTypeMappingPointCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteTypeMappingPointCB xcreateScalarConditionPartitionByCB() {
        WhiteTypeMappingPointCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteTypeMappingPointCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteTypeMappingPointCB cb = new WhiteTypeMappingPointCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "type_mapping_point_id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteTypeMappingPointCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteTypeMappingPointCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteTypeMappingPointCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteTypeMappingPointCB cb = new WhiteTypeMappingPointCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "type_mapping_point_id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteTypeMappingPointCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteTypeMappingPointCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteTypeMappingPointCB cb = new WhiteTypeMappingPointCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteTypeMappingPointCQ sq);

    // ===================================================================================
    //                                                                    Full Text Search
    //                                                                    ================
    /**
     * Match for full-text search. <br>
     * @param textColumn The text column. (NotNull, StringColumn, TargetTableColumn)
     * @param conditionValue The condition value. (NullAllowed: if null or empty, no condition)
     */
    public void match(org.dbflute.dbmeta.info.ColumnInfo textColumn, String conditionValue) {
        assertObjectNotNull("textColumn", textColumn);
        match(newArrayList(textColumn), conditionValue);
    }

    /**
     * Match for full-text search. <br>
     * @param textColumnList The list of text column. (NotNull, NotEmpty, StringColumn, TargetTableColumn)
     * @param conditionValue The condition value. (NullAllowed: if null or empty, no condition)
     */
    public void match(List<org.dbflute.dbmeta.info.ColumnInfo> textColumnList, String conditionValue) {
        xdoMatchByLikeSearch(textColumnList, conditionValue);
    }

    @Override
    protected String xescapeFullTextSearchValue(String conditionValue) {
        return conditionValue; // non escape
    }

    @Override
    protected LikeSearchOption xcreateMatchLikeSearch() {
        return new PostgreSQLMatchLikeSearch();
    }

    @Override
    protected org.dbflute.dbway.topic.ExtensionOperand xgetPostgreSQLMatchOperand() {
        return DBFluteConfig.getInstance().getFullTextSearchOperand();
    }

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    /**
     * Order along manual ordering information.
     * <pre>
     * ManualOrderOption mop = new ManualOrderOption();
     * mop.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder(mop)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * ManualOrderOption mop = new ManualOrderOption();
     * mop.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     * mop.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     * mop.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder(mop)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param option The option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOption option) { // is user public!
        xdoWithManualOrder(option);
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected WhiteTypeMappingPointCB newMyCB() {
        return new WhiteTypeMappingPointCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteTypeMappingPointCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
