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
 * The abstract condition-query of service_rank.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsServiceRankCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsServiceRankCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                     DBMeta Provider
    //                                                                     ===============
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "service_rank";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (サービスランクコード)service_rank_code: {PK, NotNull, bpchar(3)}
     * @param serviceRankCode The value of serviceRankCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setServiceRankCode_Equal(String serviceRankCode) {
        doSetServiceRankCode_Equal(fRES(serviceRankCode));
    }

    protected void doSetServiceRankCode_Equal(String serviceRankCode) {
        regServiceRankCode(CK_EQ, serviceRankCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (サービスランクコード)service_rank_code: {PK, NotNull, bpchar(3)}
     * @param serviceRankCode The value of serviceRankCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setServiceRankCode_NotEqual(String serviceRankCode) {
        doSetServiceRankCode_NotEqual(fRES(serviceRankCode));
    }

    protected void doSetServiceRankCode_NotEqual(String serviceRankCode) {
        regServiceRankCode(CK_NES, serviceRankCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (サービスランクコード)service_rank_code: {PK, NotNull, bpchar(3)}
     * @param serviceRankCodeList The collection of serviceRankCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setServiceRankCode_InScope(Collection<String> serviceRankCodeList) {
        doSetServiceRankCode_InScope(serviceRankCodeList);
    }

    protected void doSetServiceRankCode_InScope(Collection<String> serviceRankCodeList) {
        regINS(CK_INS, cTL(serviceRankCodeList), xgetCValueServiceRankCode(), "service_rank_code");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (サービスランクコード)service_rank_code: {PK, NotNull, bpchar(3)}
     * @param serviceRankCodeList The collection of serviceRankCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setServiceRankCode_NotInScope(Collection<String> serviceRankCodeList) {
        doSetServiceRankCode_NotInScope(serviceRankCodeList);
    }

    protected void doSetServiceRankCode_NotInScope(Collection<String> serviceRankCodeList) {
        regINS(CK_NINS, cTL(serviceRankCodeList), xgetCValueServiceRankCode(), "service_rank_code");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (サービスランクコード)service_rank_code: {PK, NotNull, bpchar(3)} <br>
     * <pre>e.g. setServiceRankCode_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param serviceRankCode The value of serviceRankCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setServiceRankCode_LikeSearch(String serviceRankCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setServiceRankCode_LikeSearch(serviceRankCode, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (サービスランクコード)service_rank_code: {PK, NotNull, bpchar(3)} <br>
     * <pre>e.g. setServiceRankCode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param serviceRankCode The value of serviceRankCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setServiceRankCode_LikeSearch(String serviceRankCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(serviceRankCode), xgetCValueServiceRankCode(), "service_rank_code", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (サービスランクコード)service_rank_code: {PK, NotNull, bpchar(3)}
     * @param serviceRankCode The value of serviceRankCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setServiceRankCode_NotLikeSearch(String serviceRankCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setServiceRankCode_NotLikeSearch(serviceRankCode, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (サービスランクコード)service_rank_code: {PK, NotNull, bpchar(3)}
     * @param serviceRankCode The value of serviceRankCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setServiceRankCode_NotLikeSearch(String serviceRankCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(serviceRankCode), xgetCValueServiceRankCode(), "service_rank_code", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (サービスランクコード)service_rank_code: {PK, NotNull, bpchar(3)}
     * @param serviceRankCode The value of serviceRankCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setServiceRankCode_PrefixSearch(String serviceRankCode) {
        setServiceRankCode_LikeSearch(serviceRankCode, xcLSOPPre());
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select service_rank_code from member_service where ...)} <br>
     * (会員サービス)member_service by service_rank_code, named 'memberServiceAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMemberServiceList</span>(serviceCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     serviceCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MemberServiceList for 'exists'. (NotNull)
     */
    public void existsMemberServiceList(SubQuery<MemberServiceCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MemberServiceCB cb = new MemberServiceCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepServiceRankCode_ExistsReferrer_MemberServiceList(cb.query());
        registerExistsReferrer(cb.query(), "service_rank_code", "service_rank_code", pp, "memberServiceList");
    }
    public abstract String keepServiceRankCode_ExistsReferrer_MemberServiceList(MemberServiceCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select service_rank_code from member_service where ...)} <br>
     * (会員サービス)member_service by service_rank_code, named 'memberServiceAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMemberServiceList</span>(serviceCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     serviceCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ServiceRankCode_NotExistsReferrer_MemberServiceList for 'not exists'. (NotNull)
     */
    public void notExistsMemberServiceList(SubQuery<MemberServiceCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MemberServiceCB cb = new MemberServiceCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepServiceRankCode_NotExistsReferrer_MemberServiceList(cb.query());
        registerNotExistsReferrer(cb.query(), "service_rank_code", "service_rank_code", pp, "memberServiceList");
    }
    public abstract String keepServiceRankCode_NotExistsReferrer_MemberServiceList(MemberServiceCQ sq);

    public void xsderiveMemberServiceList(String fn, SubQuery<MemberServiceCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MemberServiceCB cb = new MemberServiceCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepServiceRankCode_SpecifyDerivedReferrer_MemberServiceList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "service_rank_code", "service_rank_code", pp, "memberServiceList", al, op);
    }
    public abstract String keepServiceRankCode_SpecifyDerivedReferrer_MemberServiceList(MemberServiceCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from member_service where ...)} <br>
     * (会員サービス)member_service by service_rank_code, named 'memberServiceAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMemberServiceList()</span>.<span style="color: #CC4747">max</span>(serviceCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     serviceCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     serviceCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MemberServiceCB> derivedMemberServiceList() {
        return xcreateQDRFunctionMemberServiceList();
    }
    protected HpQDRFunction<MemberServiceCB> xcreateQDRFunctionMemberServiceList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMemberServiceList(fn, sq, rd, vl, op));
    }
    public void xqderiveMemberServiceList(String fn, SubQuery<MemberServiceCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MemberServiceCB cb = new MemberServiceCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepServiceRankCode_QueryDerivedReferrer_MemberServiceList(cb.query()); String prpp = keepServiceRankCode_QueryDerivedReferrer_MemberServiceListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "service_rank_code", "service_rank_code", sqpp, "memberServiceList", rd, vl, prpp, op);
    }
    public abstract String keepServiceRankCode_QueryDerivedReferrer_MemberServiceList(MemberServiceCQ sq);
    public abstract String keepServiceRankCode_QueryDerivedReferrer_MemberServiceListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (サービスランクコード)service_rank_code: {PK, NotNull, bpchar(3)}
     */
    public void setServiceRankCode_IsNull() { regServiceRankCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (サービスランクコード)service_rank_code: {PK, NotNull, bpchar(3)}
     */
    public void setServiceRankCode_IsNotNull() { regServiceRankCode(CK_ISNN, DOBJ); }

    protected void regServiceRankCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueServiceRankCode(), "service_rank_code"); }
    protected abstract ConditionValue xgetCValueServiceRankCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (サービスランク名称)service_rank_name: {NotNull, varchar(50)}
     * @param serviceRankName The value of serviceRankName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setServiceRankName_Equal(String serviceRankName) {
        doSetServiceRankName_Equal(fRES(serviceRankName));
    }

    protected void doSetServiceRankName_Equal(String serviceRankName) {
        regServiceRankName(CK_EQ, serviceRankName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (サービスランク名称)service_rank_name: {NotNull, varchar(50)}
     * @param serviceRankName The value of serviceRankName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setServiceRankName_NotEqual(String serviceRankName) {
        doSetServiceRankName_NotEqual(fRES(serviceRankName));
    }

    protected void doSetServiceRankName_NotEqual(String serviceRankName) {
        regServiceRankName(CK_NES, serviceRankName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (サービスランク名称)service_rank_name: {NotNull, varchar(50)}
     * @param serviceRankNameList The collection of serviceRankName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setServiceRankName_InScope(Collection<String> serviceRankNameList) {
        doSetServiceRankName_InScope(serviceRankNameList);
    }

    protected void doSetServiceRankName_InScope(Collection<String> serviceRankNameList) {
        regINS(CK_INS, cTL(serviceRankNameList), xgetCValueServiceRankName(), "service_rank_name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (サービスランク名称)service_rank_name: {NotNull, varchar(50)}
     * @param serviceRankNameList The collection of serviceRankName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setServiceRankName_NotInScope(Collection<String> serviceRankNameList) {
        doSetServiceRankName_NotInScope(serviceRankNameList);
    }

    protected void doSetServiceRankName_NotInScope(Collection<String> serviceRankNameList) {
        regINS(CK_NINS, cTL(serviceRankNameList), xgetCValueServiceRankName(), "service_rank_name");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (サービスランク名称)service_rank_name: {NotNull, varchar(50)} <br>
     * <pre>e.g. setServiceRankName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param serviceRankName The value of serviceRankName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setServiceRankName_LikeSearch(String serviceRankName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setServiceRankName_LikeSearch(serviceRankName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (サービスランク名称)service_rank_name: {NotNull, varchar(50)} <br>
     * <pre>e.g. setServiceRankName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param serviceRankName The value of serviceRankName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setServiceRankName_LikeSearch(String serviceRankName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(serviceRankName), xgetCValueServiceRankName(), "service_rank_name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (サービスランク名称)service_rank_name: {NotNull, varchar(50)}
     * @param serviceRankName The value of serviceRankName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setServiceRankName_NotLikeSearch(String serviceRankName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setServiceRankName_NotLikeSearch(serviceRankName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (サービスランク名称)service_rank_name: {NotNull, varchar(50)}
     * @param serviceRankName The value of serviceRankName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setServiceRankName_NotLikeSearch(String serviceRankName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(serviceRankName), xgetCValueServiceRankName(), "service_rank_name", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (サービスランク名称)service_rank_name: {NotNull, varchar(50)}
     * @param serviceRankName The value of serviceRankName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setServiceRankName_PrefixSearch(String serviceRankName) {
        setServiceRankName_LikeSearch(serviceRankName, xcLSOPPre());
    }

    protected void regServiceRankName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueServiceRankName(), "service_rank_name"); }
    protected abstract ConditionValue xgetCValueServiceRankName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (サービスポイント発生率)service_point_incidence: {NotNull, numeric(5, 3)}
     * @param servicePointIncidence The value of servicePointIncidence as equal. (NullAllowed: if null, no condition)
     */
    public void setServicePointIncidence_Equal(java.math.BigDecimal servicePointIncidence) {
        doSetServicePointIncidence_Equal(servicePointIncidence);
    }

    protected void doSetServicePointIncidence_Equal(java.math.BigDecimal servicePointIncidence) {
        regServicePointIncidence(CK_EQ, servicePointIncidence);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (サービスポイント発生率)service_point_incidence: {NotNull, numeric(5, 3)}
     * @param servicePointIncidence The value of servicePointIncidence as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setServicePointIncidence_GreaterThan(java.math.BigDecimal servicePointIncidence) {
        regServicePointIncidence(CK_GT, servicePointIncidence);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (サービスポイント発生率)service_point_incidence: {NotNull, numeric(5, 3)}
     * @param servicePointIncidence The value of servicePointIncidence as lessThan. (NullAllowed: if null, no condition)
     */
    public void setServicePointIncidence_LessThan(java.math.BigDecimal servicePointIncidence) {
        regServicePointIncidence(CK_LT, servicePointIncidence);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (サービスポイント発生率)service_point_incidence: {NotNull, numeric(5, 3)}
     * @param servicePointIncidence The value of servicePointIncidence as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setServicePointIncidence_GreaterEqual(java.math.BigDecimal servicePointIncidence) {
        regServicePointIncidence(CK_GE, servicePointIncidence);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (サービスポイント発生率)service_point_incidence: {NotNull, numeric(5, 3)}
     * @param servicePointIncidence The value of servicePointIncidence as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setServicePointIncidence_LessEqual(java.math.BigDecimal servicePointIncidence) {
        regServicePointIncidence(CK_LE, servicePointIncidence);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (サービスポイント発生率)service_point_incidence: {NotNull, numeric(5, 3)}
     * @param minNumber The min number of servicePointIncidence. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of servicePointIncidence. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setServicePointIncidence_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setServicePointIncidence_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (サービスポイント発生率)service_point_incidence: {NotNull, numeric(5, 3)}
     * @param minNumber The min number of servicePointIncidence. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of servicePointIncidence. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setServicePointIncidence_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueServicePointIncidence(), "service_point_incidence", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (サービスポイント発生率)service_point_incidence: {NotNull, numeric(5, 3)}
     * @param servicePointIncidenceList The collection of servicePointIncidence as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setServicePointIncidence_InScope(Collection<java.math.BigDecimal> servicePointIncidenceList) {
        doSetServicePointIncidence_InScope(servicePointIncidenceList);
    }

    protected void doSetServicePointIncidence_InScope(Collection<java.math.BigDecimal> servicePointIncidenceList) {
        regINS(CK_INS, cTL(servicePointIncidenceList), xgetCValueServicePointIncidence(), "service_point_incidence");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (サービスポイント発生率)service_point_incidence: {NotNull, numeric(5, 3)}
     * @param servicePointIncidenceList The collection of servicePointIncidence as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setServicePointIncidence_NotInScope(Collection<java.math.BigDecimal> servicePointIncidenceList) {
        doSetServicePointIncidence_NotInScope(servicePointIncidenceList);
    }

    protected void doSetServicePointIncidence_NotInScope(Collection<java.math.BigDecimal> servicePointIncidenceList) {
        regINS(CK_NINS, cTL(servicePointIncidenceList), xgetCValueServicePointIncidence(), "service_point_incidence");
    }

    protected void regServicePointIncidence(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueServicePointIncidence(), "service_point_incidence"); }
    protected abstract ConditionValue xgetCValueServicePointIncidence();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (新規受け入れ可能フラグ)new_acceptable_flg: {NotNull, int4(10), classification=Flg}
     * @param newAcceptableFlg The value of newAcceptableFlg as equal. (NullAllowed: if null, no condition)
     */
    protected void setNewAcceptableFlg_Equal(Integer newAcceptableFlg) {
        doSetNewAcceptableFlg_Equal(newAcceptableFlg);
    }

    /**
     * Equal(=). As Flg. And NullIgnored, OnlyOnceRegistered. <br>
     * (新規受け入れ可能フラグ)new_acceptable_flg: {NotNull, int4(10), classification=Flg} <br>
     * general boolean classification for every flg-column
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setNewAcceptableFlg_Equal_AsFlg(CDef.Flg cdef) {
        doSetNewAcceptableFlg_Equal(cTNum(cdef != null ? cdef.code() : null, Integer.class));
    }

    /**
     * Equal(=). As True (1). And NullIgnored, OnlyOnceRegistered. <br>
     * Yes: means valid
     */
    public void setNewAcceptableFlg_Equal_True() {
        setNewAcceptableFlg_Equal_AsFlg(CDef.Flg.True);
    }

    /**
     * Equal(=). As False (0). And NullIgnored, OnlyOnceRegistered. <br>
     * No: means invalid
     */
    public void setNewAcceptableFlg_Equal_False() {
        setNewAcceptableFlg_Equal_AsFlg(CDef.Flg.False);
    }

    protected void doSetNewAcceptableFlg_Equal(Integer newAcceptableFlg) {
        regNewAcceptableFlg(CK_EQ, newAcceptableFlg);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (新規受け入れ可能フラグ)new_acceptable_flg: {NotNull, int4(10), classification=Flg}
     * @param newAcceptableFlgList The collection of newAcceptableFlg as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNewAcceptableFlg_InScope(Collection<Integer> newAcceptableFlgList) {
        doSetNewAcceptableFlg_InScope(newAcceptableFlgList);
    }

    /**
     * InScope {in (1, 2)}. As Flg. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (新規受け入れ可能フラグ)new_acceptable_flg: {NotNull, int4(10), classification=Flg} <br>
     * general boolean classification for every flg-column
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setNewAcceptableFlg_InScope_AsFlg(Collection<CDef.Flg> cdefList) {
        doSetNewAcceptableFlg_InScope(cTNumL(cdefList, Integer.class));
    }

    protected void doSetNewAcceptableFlg_InScope(Collection<Integer> newAcceptableFlgList) {
        regINS(CK_INS, cTL(newAcceptableFlgList), xgetCValueNewAcceptableFlg(), "new_acceptable_flg");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (新規受け入れ可能フラグ)new_acceptable_flg: {NotNull, int4(10), classification=Flg}
     * @param newAcceptableFlgList The collection of newAcceptableFlg as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNewAcceptableFlg_NotInScope(Collection<Integer> newAcceptableFlgList) {
        doSetNewAcceptableFlg_NotInScope(newAcceptableFlgList);
    }

    /**
     * NotInScope {not in (1, 2)}. As Flg. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (新規受け入れ可能フラグ)new_acceptable_flg: {NotNull, int4(10), classification=Flg} <br>
     * general boolean classification for every flg-column
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setNewAcceptableFlg_NotInScope_AsFlg(Collection<CDef.Flg> cdefList) {
        doSetNewAcceptableFlg_NotInScope(cTNumL(cdefList, Integer.class));
    }

    protected void doSetNewAcceptableFlg_NotInScope(Collection<Integer> newAcceptableFlgList) {
        regINS(CK_NINS, cTL(newAcceptableFlgList), xgetCValueNewAcceptableFlg(), "new_acceptable_flg");
    }

    protected void regNewAcceptableFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNewAcceptableFlg(), "new_acceptable_flg"); }
    protected abstract ConditionValue xgetCValueNewAcceptableFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (説明)description: {NotNull, varchar(200)}
     * @param description The value of description as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setDescription_Equal(String description) {
        doSetDescription_Equal(fRES(description));
    }

    protected void doSetDescription_Equal(String description) {
        regDescription(CK_EQ, description);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (説明)description: {NotNull, varchar(200)}
     * @param description The value of description as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setDescription_NotEqual(String description) {
        doSetDescription_NotEqual(fRES(description));
    }

    protected void doSetDescription_NotEqual(String description) {
        regDescription(CK_NES, description);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (説明)description: {NotNull, varchar(200)}
     * @param descriptionList The collection of description as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDescription_InScope(Collection<String> descriptionList) {
        doSetDescription_InScope(descriptionList);
    }

    protected void doSetDescription_InScope(Collection<String> descriptionList) {
        regINS(CK_INS, cTL(descriptionList), xgetCValueDescription(), "description");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (説明)description: {NotNull, varchar(200)}
     * @param descriptionList The collection of description as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDescription_NotInScope(Collection<String> descriptionList) {
        doSetDescription_NotInScope(descriptionList);
    }

    protected void doSetDescription_NotInScope(Collection<String> descriptionList) {
        regINS(CK_NINS, cTL(descriptionList), xgetCValueDescription(), "description");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (説明)description: {NotNull, varchar(200)} <br>
     * <pre>e.g. setDescription_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param description The value of description as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDescription_LikeSearch(String description, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDescription_LikeSearch(description, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (説明)description: {NotNull, varchar(200)} <br>
     * <pre>e.g. setDescription_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param description The value of description as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDescription_LikeSearch(String description, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(description), xgetCValueDescription(), "description", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (説明)description: {NotNull, varchar(200)}
     * @param description The value of description as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDescription_NotLikeSearch(String description, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDescription_NotLikeSearch(description, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (説明)description: {NotNull, varchar(200)}
     * @param description The value of description as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDescription_NotLikeSearch(String description, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(description), xgetCValueDescription(), "description", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (説明)description: {NotNull, varchar(200)}
     * @param description The value of description as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setDescription_PrefixSearch(String description) {
        setDescription_LikeSearch(description, xcLSOPPre());
    }

    protected void regDescription(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDescription(), "description"); }
    protected abstract ConditionValue xgetCValueDescription();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (表示順)display_order: {UQ, NotNull, int4(10)}
     * @param displayOrder The value of displayOrder as equal. (NullAllowed: if null, no condition)
     */
    public void setDisplayOrder_Equal(Integer displayOrder) {
        doSetDisplayOrder_Equal(displayOrder);
    }

    protected void doSetDisplayOrder_Equal(Integer displayOrder) {
        regDisplayOrder(CK_EQ, displayOrder);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (表示順)display_order: {UQ, NotNull, int4(10)}
     * @param displayOrder The value of displayOrder as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setDisplayOrder_GreaterThan(Integer displayOrder) {
        regDisplayOrder(CK_GT, displayOrder);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (表示順)display_order: {UQ, NotNull, int4(10)}
     * @param displayOrder The value of displayOrder as lessThan. (NullAllowed: if null, no condition)
     */
    public void setDisplayOrder_LessThan(Integer displayOrder) {
        regDisplayOrder(CK_LT, displayOrder);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (表示順)display_order: {UQ, NotNull, int4(10)}
     * @param displayOrder The value of displayOrder as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setDisplayOrder_GreaterEqual(Integer displayOrder) {
        regDisplayOrder(CK_GE, displayOrder);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (表示順)display_order: {UQ, NotNull, int4(10)}
     * @param displayOrder The value of displayOrder as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setDisplayOrder_LessEqual(Integer displayOrder) {
        regDisplayOrder(CK_LE, displayOrder);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (表示順)display_order: {UQ, NotNull, int4(10)}
     * @param minNumber The min number of displayOrder. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of displayOrder. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setDisplayOrder_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setDisplayOrder_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (表示順)display_order: {UQ, NotNull, int4(10)}
     * @param minNumber The min number of displayOrder. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of displayOrder. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDisplayOrder_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDisplayOrder(), "display_order", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (表示順)display_order: {UQ, NotNull, int4(10)}
     * @param displayOrderList The collection of displayOrder as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDisplayOrder_InScope(Collection<Integer> displayOrderList) {
        doSetDisplayOrder_InScope(displayOrderList);
    }

    protected void doSetDisplayOrder_InScope(Collection<Integer> displayOrderList) {
        regINS(CK_INS, cTL(displayOrderList), xgetCValueDisplayOrder(), "display_order");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (表示順)display_order: {UQ, NotNull, int4(10)}
     * @param displayOrderList The collection of displayOrder as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDisplayOrder_NotInScope(Collection<Integer> displayOrderList) {
        doSetDisplayOrder_NotInScope(displayOrderList);
    }

    protected void doSetDisplayOrder_NotInScope(Collection<Integer> displayOrderList) {
        regINS(CK_NINS, cTL(displayOrderList), xgetCValueDisplayOrder(), "display_order");
    }

    protected void regDisplayOrder(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDisplayOrder(), "display_order"); }
    protected abstract ConditionValue xgetCValueDisplayOrder();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_Equal()</span>.max(new SubQuery&lt;ServiceRankCB&gt;() {
     *     public void query(ServiceRankCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ServiceRankCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, ServiceRankCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_NotEqual()</span>.max(new SubQuery&lt;ServiceRankCB&gt;() {
     *     public void query(ServiceRankCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ServiceRankCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, ServiceRankCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;ServiceRankCB&gt;() {
     *     public void query(ServiceRankCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ServiceRankCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, ServiceRankCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessThan()</span>.max(new SubQuery&lt;ServiceRankCB&gt;() {
     *     public void query(ServiceRankCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ServiceRankCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, ServiceRankCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;ServiceRankCB&gt;() {
     *     public void query(ServiceRankCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ServiceRankCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, ServiceRankCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;ServiceRankCB&gt;() {
     *     public void query(ServiceRankCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<ServiceRankCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, ServiceRankCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        ServiceRankCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(ServiceRankCQ sq);

    protected ServiceRankCB xcreateScalarConditionCB() {
        ServiceRankCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected ServiceRankCB xcreateScalarConditionPartitionByCB() {
        ServiceRankCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<ServiceRankCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ServiceRankCB cb = new ServiceRankCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "service_rank_code";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(ServiceRankCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<ServiceRankCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(ServiceRankCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ServiceRankCB cb = new ServiceRankCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "service_rank_code";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(ServiceRankCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<ServiceRankCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ServiceRankCB cb = new ServiceRankCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(ServiceRankCQ sq);

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
     * MemberCB cb = new MemberCB();
     * ManualOrderOption mob = new ManualOrderOption();
     * mob.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder(mob)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * MemberCB cb = new MemberCB();
     * ManualOrderOption mob = new ManualOrderOption();
     * mob.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     * mob.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     * mob.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder(mob)</span>;
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
     * MemberCB cb = new MemberCB();
     * ManualOrderOption mob = new ManualOrderOption();
     * mob.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder(mob)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * MemberCB cb = new MemberCB();
     * ManualOrderOption mob = new ManualOrderOption();
     * mob.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     * mob.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     * mob.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder(mob)</span>;
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
    protected ServiceRankCB newMyCB() {
        return new ServiceRankCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return ServiceRankCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
