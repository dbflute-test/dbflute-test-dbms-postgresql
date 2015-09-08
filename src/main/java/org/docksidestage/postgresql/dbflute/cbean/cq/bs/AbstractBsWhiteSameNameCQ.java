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
 * The abstract condition-query of white_same_name.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteSameNameCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteSameNameCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_same_name";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * same_name_id: {PK, NotNull, int8(19)}
     * @param sameNameId The value of sameNameId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSameNameId_Equal(Long sameNameId) {
        doSetSameNameId_Equal(sameNameId);
    }

    protected void doSetSameNameId_Equal(Long sameNameId) {
        regSameNameId(CK_EQ, sameNameId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * same_name_id: {PK, NotNull, int8(19)}
     * @param sameNameId The value of sameNameId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSameNameId_GreaterThan(Long sameNameId) {
        regSameNameId(CK_GT, sameNameId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * same_name_id: {PK, NotNull, int8(19)}
     * @param sameNameId The value of sameNameId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSameNameId_LessThan(Long sameNameId) {
        regSameNameId(CK_LT, sameNameId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * same_name_id: {PK, NotNull, int8(19)}
     * @param sameNameId The value of sameNameId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSameNameId_GreaterEqual(Long sameNameId) {
        regSameNameId(CK_GE, sameNameId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * same_name_id: {PK, NotNull, int8(19)}
     * @param sameNameId The value of sameNameId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSameNameId_LessEqual(Long sameNameId) {
        regSameNameId(CK_LE, sameNameId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * same_name_id: {PK, NotNull, int8(19)}
     * @param minNumber The min number of sameNameId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of sameNameId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setSameNameId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setSameNameId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * same_name_id: {PK, NotNull, int8(19)}
     * @param minNumber The min number of sameNameId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of sameNameId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSameNameId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSameNameId(), "same_name_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * same_name_id: {PK, NotNull, int8(19)}
     * @param sameNameIdList The collection of sameNameId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSameNameId_InScope(Collection<Long> sameNameIdList) {
        doSetSameNameId_InScope(sameNameIdList);
    }

    protected void doSetSameNameId_InScope(Collection<Long> sameNameIdList) {
        regINS(CK_INS, cTL(sameNameIdList), xgetCValueSameNameId(), "same_name_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * same_name_id: {PK, NotNull, int8(19)}
     * @param sameNameIdList The collection of sameNameId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSameNameId_NotInScope(Collection<Long> sameNameIdList) {
        doSetSameNameId_NotInScope(sameNameIdList);
    }

    protected void doSetSameNameId_NotInScope(Collection<Long> sameNameIdList) {
        regINS(CK_NINS, cTL(sameNameIdList), xgetCValueSameNameId(), "same_name_id");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select same_name_id from white_same_name_ref where ...)} <br>
     * white_same_name_ref by same_name_id, named 'whiteSameNameRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWhiteSameNameRef</span>(refCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     refCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WhiteSameNameRefList for 'exists'. (NotNull)
     */
    public void existsWhiteSameNameRef(SubQuery<WhiteSameNameRefCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteSameNameRefCB cb = new WhiteSameNameRefCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepSameNameId_ExistsReferrer_WhiteSameNameRefList(cb.query());
        registerExistsReferrer(cb.query(), "same_name_id", "same_name_id", pp, "whiteSameNameRefList");
    }
    public abstract String keepSameNameId_ExistsReferrer_WhiteSameNameRefList(WhiteSameNameRefCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select same_name_id from white_same_name_ref where ...)} <br>
     * white_same_name_ref by same_name_id, named 'whiteSameNameRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWhiteSameNameRef</span>(refCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     refCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of SameNameId_NotExistsReferrer_WhiteSameNameRefList for 'not exists'. (NotNull)
     */
    public void notExistsWhiteSameNameRef(SubQuery<WhiteSameNameRefCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteSameNameRefCB cb = new WhiteSameNameRefCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepSameNameId_NotExistsReferrer_WhiteSameNameRefList(cb.query());
        registerNotExistsReferrer(cb.query(), "same_name_id", "same_name_id", pp, "whiteSameNameRefList");
    }
    public abstract String keepSameNameId_NotExistsReferrer_WhiteSameNameRefList(WhiteSameNameRefCQ sq);

    public void xsderiveWhiteSameNameRefList(String fn, SubQuery<WhiteSameNameRefCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSameNameRefCB cb = new WhiteSameNameRefCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSameNameId_SpecifyDerivedReferrer_WhiteSameNameRefList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "same_name_id", "same_name_id", pp, "whiteSameNameRefList", al, op);
    }
    public abstract String keepSameNameId_SpecifyDerivedReferrer_WhiteSameNameRefList(WhiteSameNameRefCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from white_same_name_ref where ...)} <br>
     * white_same_name_ref by same_name_id, named 'whiteSameNameRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWhiteSameNameRef()</span>.<span style="color: #CC4747">max</span>(refCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     refCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     refCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WhiteSameNameRefCB> derivedWhiteSameNameRef() {
        return xcreateQDRFunctionWhiteSameNameRefList();
    }
    protected HpQDRFunction<WhiteSameNameRefCB> xcreateQDRFunctionWhiteSameNameRefList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWhiteSameNameRefList(fn, sq, rd, vl, op));
    }
    public void xqderiveWhiteSameNameRefList(String fn, SubQuery<WhiteSameNameRefCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSameNameRefCB cb = new WhiteSameNameRefCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepSameNameId_QueryDerivedReferrer_WhiteSameNameRefList(cb.query()); String prpp = keepSameNameId_QueryDerivedReferrer_WhiteSameNameRefListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "same_name_id", "same_name_id", sqpp, "whiteSameNameRefList", rd, vl, prpp, op);
    }
    public abstract String keepSameNameId_QueryDerivedReferrer_WhiteSameNameRefList(WhiteSameNameRefCQ sq);
    public abstract String keepSameNameId_QueryDerivedReferrer_WhiteSameNameRefListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * same_name_id: {PK, NotNull, int8(19)}
     */
    public void setSameNameId_IsNull() { regSameNameId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * same_name_id: {PK, NotNull, int8(19)}
     */
    public void setSameNameId_IsNotNull() { regSameNameId(CK_ISNN, DOBJ); }

    protected void regSameNameId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSameNameId(), "same_name_id"); }
    protected abstract ConditionValue xgetCValueSameNameId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * same_name_name: {varchar(200)}
     * @param sameNameName The value of sameNameName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setSameNameName_Equal(String sameNameName) {
        doSetSameNameName_Equal(fRES(sameNameName));
    }

    protected void doSetSameNameName_Equal(String sameNameName) {
        regSameNameName(CK_EQ, sameNameName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * same_name_name: {varchar(200)}
     * @param sameNameName The value of sameNameName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setSameNameName_NotEqual(String sameNameName) {
        doSetSameNameName_NotEqual(fRES(sameNameName));
    }

    protected void doSetSameNameName_NotEqual(String sameNameName) {
        regSameNameName(CK_NES, sameNameName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * same_name_name: {varchar(200)}
     * @param sameNameNameList The collection of sameNameName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSameNameName_InScope(Collection<String> sameNameNameList) {
        doSetSameNameName_InScope(sameNameNameList);
    }

    protected void doSetSameNameName_InScope(Collection<String> sameNameNameList) {
        regINS(CK_INS, cTL(sameNameNameList), xgetCValueSameNameName(), "same_name_name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * same_name_name: {varchar(200)}
     * @param sameNameNameList The collection of sameNameName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSameNameName_NotInScope(Collection<String> sameNameNameList) {
        doSetSameNameName_NotInScope(sameNameNameList);
    }

    protected void doSetSameNameName_NotInScope(Collection<String> sameNameNameList) {
        regINS(CK_NINS, cTL(sameNameNameList), xgetCValueSameNameName(), "same_name_name");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * same_name_name: {varchar(200)} <br>
     * <pre>e.g. setSameNameName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param sameNameName The value of sameNameName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSameNameName_LikeSearch(String sameNameName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSameNameName_LikeSearch(sameNameName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * same_name_name: {varchar(200)} <br>
     * <pre>e.g. setSameNameName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sameNameName The value of sameNameName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSameNameName_LikeSearch(String sameNameName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sameNameName), xgetCValueSameNameName(), "same_name_name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * same_name_name: {varchar(200)}
     * @param sameNameName The value of sameNameName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSameNameName_NotLikeSearch(String sameNameName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSameNameName_NotLikeSearch(sameNameName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * same_name_name: {varchar(200)}
     * @param sameNameName The value of sameNameName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSameNameName_NotLikeSearch(String sameNameName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sameNameName), xgetCValueSameNameName(), "same_name_name", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * same_name_name: {varchar(200)}
     * @param sameNameName The value of sameNameName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setSameNameName_PrefixSearch(String sameNameName) {
        setSameNameName_LikeSearch(sameNameName, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * same_name_name: {varchar(200)}
     */
    public void setSameNameName_IsNull() { regSameNameName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * same_name_name: {varchar(200)}
     */
    public void setSameNameName_IsNullOrEmpty() { regSameNameName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * same_name_name: {varchar(200)}
     */
    public void setSameNameName_IsNotNull() { regSameNameName(CK_ISNN, DOBJ); }

    protected void regSameNameName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSameNameName(), "same_name_name"); }
    protected abstract ConditionValue xgetCValueSameNameName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * same_name_integer: {int4(10)}
     * @param sameNameInteger The value of sameNameInteger as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSameNameInteger_Equal(Integer sameNameInteger) {
        doSetSameNameInteger_Equal(sameNameInteger);
    }

    protected void doSetSameNameInteger_Equal(Integer sameNameInteger) {
        regSameNameInteger(CK_EQ, sameNameInteger);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * same_name_integer: {int4(10)}
     * @param sameNameInteger The value of sameNameInteger as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSameNameInteger_GreaterThan(Integer sameNameInteger) {
        regSameNameInteger(CK_GT, sameNameInteger);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * same_name_integer: {int4(10)}
     * @param sameNameInteger The value of sameNameInteger as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSameNameInteger_LessThan(Integer sameNameInteger) {
        regSameNameInteger(CK_LT, sameNameInteger);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * same_name_integer: {int4(10)}
     * @param sameNameInteger The value of sameNameInteger as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSameNameInteger_GreaterEqual(Integer sameNameInteger) {
        regSameNameInteger(CK_GE, sameNameInteger);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * same_name_integer: {int4(10)}
     * @param sameNameInteger The value of sameNameInteger as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSameNameInteger_LessEqual(Integer sameNameInteger) {
        regSameNameInteger(CK_LE, sameNameInteger);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * same_name_integer: {int4(10)}
     * @param minNumber The min number of sameNameInteger. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of sameNameInteger. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setSameNameInteger_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setSameNameInteger_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * same_name_integer: {int4(10)}
     * @param minNumber The min number of sameNameInteger. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of sameNameInteger. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSameNameInteger_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSameNameInteger(), "same_name_integer", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * same_name_integer: {int4(10)}
     * @param sameNameIntegerList The collection of sameNameInteger as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSameNameInteger_InScope(Collection<Integer> sameNameIntegerList) {
        doSetSameNameInteger_InScope(sameNameIntegerList);
    }

    protected void doSetSameNameInteger_InScope(Collection<Integer> sameNameIntegerList) {
        regINS(CK_INS, cTL(sameNameIntegerList), xgetCValueSameNameInteger(), "same_name_integer");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * same_name_integer: {int4(10)}
     * @param sameNameIntegerList The collection of sameNameInteger as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSameNameInteger_NotInScope(Collection<Integer> sameNameIntegerList) {
        doSetSameNameInteger_NotInScope(sameNameIntegerList);
    }

    protected void doSetSameNameInteger_NotInScope(Collection<Integer> sameNameIntegerList) {
        regINS(CK_NINS, cTL(sameNameIntegerList), xgetCValueSameNameInteger(), "same_name_integer");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * same_name_integer: {int4(10)}
     */
    public void setSameNameInteger_IsNull() { regSameNameInteger(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * same_name_integer: {int4(10)}
     */
    public void setSameNameInteger_IsNotNull() { regSameNameInteger(CK_ISNN, DOBJ); }

    protected void regSameNameInteger(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSameNameInteger(), "same_name_integer"); }
    protected abstract ConditionValue xgetCValueSameNameInteger();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * next_schema_product_id: {int4(10), FK to NEXT_SCHEMA_PRODUCT}
     * @param nextSchemaProductId The value of nextSchemaProductId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNextSchemaProductId_Equal(Integer nextSchemaProductId) {
        doSetNextSchemaProductId_Equal(nextSchemaProductId);
    }

    protected void doSetNextSchemaProductId_Equal(Integer nextSchemaProductId) {
        regNextSchemaProductId(CK_EQ, nextSchemaProductId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * next_schema_product_id: {int4(10), FK to NEXT_SCHEMA_PRODUCT}
     * @param nextSchemaProductId The value of nextSchemaProductId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNextSchemaProductId_GreaterThan(Integer nextSchemaProductId) {
        regNextSchemaProductId(CK_GT, nextSchemaProductId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * next_schema_product_id: {int4(10), FK to NEXT_SCHEMA_PRODUCT}
     * @param nextSchemaProductId The value of nextSchemaProductId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNextSchemaProductId_LessThan(Integer nextSchemaProductId) {
        regNextSchemaProductId(CK_LT, nextSchemaProductId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * next_schema_product_id: {int4(10), FK to NEXT_SCHEMA_PRODUCT}
     * @param nextSchemaProductId The value of nextSchemaProductId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNextSchemaProductId_GreaterEqual(Integer nextSchemaProductId) {
        regNextSchemaProductId(CK_GE, nextSchemaProductId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * next_schema_product_id: {int4(10), FK to NEXT_SCHEMA_PRODUCT}
     * @param nextSchemaProductId The value of nextSchemaProductId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNextSchemaProductId_LessEqual(Integer nextSchemaProductId) {
        regNextSchemaProductId(CK_LE, nextSchemaProductId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * next_schema_product_id: {int4(10), FK to NEXT_SCHEMA_PRODUCT}
     * @param minNumber The min number of nextSchemaProductId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of nextSchemaProductId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setNextSchemaProductId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setNextSchemaProductId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * next_schema_product_id: {int4(10), FK to NEXT_SCHEMA_PRODUCT}
     * @param minNumber The min number of nextSchemaProductId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of nextSchemaProductId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNextSchemaProductId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNextSchemaProductId(), "next_schema_product_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * next_schema_product_id: {int4(10), FK to NEXT_SCHEMA_PRODUCT}
     * @param nextSchemaProductIdList The collection of nextSchemaProductId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNextSchemaProductId_InScope(Collection<Integer> nextSchemaProductIdList) {
        doSetNextSchemaProductId_InScope(nextSchemaProductIdList);
    }

    protected void doSetNextSchemaProductId_InScope(Collection<Integer> nextSchemaProductIdList) {
        regINS(CK_INS, cTL(nextSchemaProductIdList), xgetCValueNextSchemaProductId(), "next_schema_product_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * next_schema_product_id: {int4(10), FK to NEXT_SCHEMA_PRODUCT}
     * @param nextSchemaProductIdList The collection of nextSchemaProductId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNextSchemaProductId_NotInScope(Collection<Integer> nextSchemaProductIdList) {
        doSetNextSchemaProductId_NotInScope(nextSchemaProductIdList);
    }

    protected void doSetNextSchemaProductId_NotInScope(Collection<Integer> nextSchemaProductIdList) {
        regINS(CK_NINS, cTL(nextSchemaProductIdList), xgetCValueNextSchemaProductId(), "next_schema_product_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * next_schema_product_id: {int4(10), FK to NEXT_SCHEMA_PRODUCT}
     */
    public void setNextSchemaProductId_IsNull() { regNextSchemaProductId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * next_schema_product_id: {int4(10), FK to NEXT_SCHEMA_PRODUCT}
     */
    public void setNextSchemaProductId_IsNotNull() { regNextSchemaProductId(CK_ISNN, DOBJ); }

    protected void regNextSchemaProductId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNextSchemaProductId(), "next_schema_product_id"); }
    protected abstract ConditionValue xgetCValueNextSchemaProductId();

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
    public HpSLCFunction<WhiteSameNameCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteSameNameCB.class);
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
    public HpSLCFunction<WhiteSameNameCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteSameNameCB.class);
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
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteSameNameCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteSameNameCB.class);
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
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteSameNameCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteSameNameCB.class);
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
    public HpSLCFunction<WhiteSameNameCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteSameNameCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteSameNameCB&gt;() {
     *     public void query(WhiteSameNameCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteSameNameCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteSameNameCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSameNameCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteSameNameCQ sq);

    protected WhiteSameNameCB xcreateScalarConditionCB() {
        WhiteSameNameCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteSameNameCB xcreateScalarConditionPartitionByCB() {
        WhiteSameNameCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteSameNameCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSameNameCB cb = new WhiteSameNameCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "same_name_id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteSameNameCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteSameNameCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteSameNameCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteSameNameCB cb = new WhiteSameNameCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "same_name_id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteSameNameCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteSameNameCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteSameNameCB cb = new WhiteSameNameCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteSameNameCQ sq);

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
    protected org.dbflute.dbway.ExtensionOperand xgetPostgreSQLMatchOperand() {
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
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
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
    protected WhiteSameNameCB newMyCB() {
        return new WhiteSameNameCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteSameNameCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
