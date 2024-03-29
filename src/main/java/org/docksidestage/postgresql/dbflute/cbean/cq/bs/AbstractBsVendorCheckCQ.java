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
 * The abstract condition-query of vendor_check.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsVendorCheckCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsVendorCheckCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "vendor_check";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * vendor_check_id: {PK, NotNull, numeric(16)}
     * @param vendorCheckId The value of vendorCheckId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setVendorCheckId_Equal(Long vendorCheckId) {
        doSetVendorCheckId_Equal(vendorCheckId);
    }

    protected void doSetVendorCheckId_Equal(Long vendorCheckId) {
        regVendorCheckId(CK_EQ, vendorCheckId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * vendor_check_id: {PK, NotNull, numeric(16)}
     * @param vendorCheckId The value of vendorCheckId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setVendorCheckId_GreaterThan(Long vendorCheckId) {
        regVendorCheckId(CK_GT, vendorCheckId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * vendor_check_id: {PK, NotNull, numeric(16)}
     * @param vendorCheckId The value of vendorCheckId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setVendorCheckId_LessThan(Long vendorCheckId) {
        regVendorCheckId(CK_LT, vendorCheckId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * vendor_check_id: {PK, NotNull, numeric(16)}
     * @param vendorCheckId The value of vendorCheckId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVendorCheckId_GreaterEqual(Long vendorCheckId) {
        regVendorCheckId(CK_GE, vendorCheckId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * vendor_check_id: {PK, NotNull, numeric(16)}
     * @param vendorCheckId The value of vendorCheckId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVendorCheckId_LessEqual(Long vendorCheckId) {
        regVendorCheckId(CK_LE, vendorCheckId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * vendor_check_id: {PK, NotNull, numeric(16)}
     * @param minNumber The min number of vendorCheckId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of vendorCheckId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setVendorCheckId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setVendorCheckId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * vendor_check_id: {PK, NotNull, numeric(16)}
     * @param minNumber The min number of vendorCheckId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of vendorCheckId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setVendorCheckId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueVendorCheckId(), "vendor_check_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * vendor_check_id: {PK, NotNull, numeric(16)}
     * @param vendorCheckIdList The collection of vendorCheckId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVendorCheckId_InScope(Collection<Long> vendorCheckIdList) {
        doSetVendorCheckId_InScope(vendorCheckIdList);
    }

    protected void doSetVendorCheckId_InScope(Collection<Long> vendorCheckIdList) {
        regINS(CK_INS, cTL(vendorCheckIdList), xgetCValueVendorCheckId(), "vendor_check_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * vendor_check_id: {PK, NotNull, numeric(16)}
     * @param vendorCheckIdList The collection of vendorCheckId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVendorCheckId_NotInScope(Collection<Long> vendorCheckIdList) {
        doSetVendorCheckId_NotInScope(vendorCheckIdList);
    }

    protected void doSetVendorCheckId_NotInScope(Collection<Long> vendorCheckIdList) {
        regINS(CK_NINS, cTL(vendorCheckIdList), xgetCValueVendorCheckId(), "vendor_check_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * vendor_check_id: {PK, NotNull, numeric(16)}
     */
    public void setVendorCheckId_IsNull() { regVendorCheckId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * vendor_check_id: {PK, NotNull, numeric(16)}
     */
    public void setVendorCheckId_IsNotNull() { regVendorCheckId(CK_ISNN, DOBJ); }

    protected void regVendorCheckId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVendorCheckId(), "vendor_check_id"); }
    protected abstract ConditionValue xgetCValueVendorCheckId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * type_of_char: {bpchar(3)}
     * @param typeOfChar The value of typeOfChar as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfChar_Equal(String typeOfChar) {
        doSetTypeOfChar_Equal(fRES(typeOfChar));
    }

    protected void doSetTypeOfChar_Equal(String typeOfChar) {
        regTypeOfChar(CK_EQ, typeOfChar);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * type_of_char: {bpchar(3)}
     * @param typeOfChar The value of typeOfChar as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfChar_NotEqual(String typeOfChar) {
        doSetTypeOfChar_NotEqual(fRES(typeOfChar));
    }

    protected void doSetTypeOfChar_NotEqual(String typeOfChar) {
        regTypeOfChar(CK_NES, typeOfChar);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * type_of_char: {bpchar(3)}
     * @param typeOfCharList The collection of typeOfChar as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfChar_InScope(Collection<String> typeOfCharList) {
        doSetTypeOfChar_InScope(typeOfCharList);
    }

    protected void doSetTypeOfChar_InScope(Collection<String> typeOfCharList) {
        regINS(CK_INS, cTL(typeOfCharList), xgetCValueTypeOfChar(), "type_of_char");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * type_of_char: {bpchar(3)}
     * @param typeOfCharList The collection of typeOfChar as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfChar_NotInScope(Collection<String> typeOfCharList) {
        doSetTypeOfChar_NotInScope(typeOfCharList);
    }

    protected void doSetTypeOfChar_NotInScope(Collection<String> typeOfCharList) {
        regINS(CK_NINS, cTL(typeOfCharList), xgetCValueTypeOfChar(), "type_of_char");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * type_of_char: {bpchar(3)} <br>
     * <pre>e.g. setTypeOfChar_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param typeOfChar The value of typeOfChar as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfChar_LikeSearch(String typeOfChar, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfChar_LikeSearch(typeOfChar, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * type_of_char: {bpchar(3)} <br>
     * <pre>e.g. setTypeOfChar_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfChar The value of typeOfChar as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setTypeOfChar_LikeSearch(String typeOfChar, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfChar), xgetCValueTypeOfChar(), "type_of_char", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * type_of_char: {bpchar(3)}
     * @param typeOfChar The value of typeOfChar as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfChar_NotLikeSearch(String typeOfChar, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfChar_NotLikeSearch(typeOfChar, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * type_of_char: {bpchar(3)}
     * @param typeOfChar The value of typeOfChar as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setTypeOfChar_NotLikeSearch(String typeOfChar, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfChar), xgetCValueTypeOfChar(), "type_of_char", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * type_of_char: {bpchar(3)}
     * @param typeOfChar The value of typeOfChar as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfChar_PrefixSearch(String typeOfChar) {
        setTypeOfChar_LikeSearch(typeOfChar, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * type_of_char: {bpchar(3)}
     */
    public void setTypeOfChar_IsNull() { regTypeOfChar(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * type_of_char: {bpchar(3)}
     */
    public void setTypeOfChar_IsNullOrEmpty() { regTypeOfChar(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * type_of_char: {bpchar(3)}
     */
    public void setTypeOfChar_IsNotNull() { regTypeOfChar(CK_ISNN, DOBJ); }

    protected void regTypeOfChar(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfChar(), "type_of_char"); }
    protected abstract ConditionValue xgetCValueTypeOfChar();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * type_of_varchar: {varchar(2147483647)}
     * @param typeOfVarchar The value of typeOfVarchar as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfVarchar_Equal(String typeOfVarchar) {
        doSetTypeOfVarchar_Equal(fRES(typeOfVarchar));
    }

    protected void doSetTypeOfVarchar_Equal(String typeOfVarchar) {
        regTypeOfVarchar(CK_EQ, typeOfVarchar);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * type_of_varchar: {varchar(2147483647)}
     * @param typeOfVarchar The value of typeOfVarchar as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfVarchar_NotEqual(String typeOfVarchar) {
        doSetTypeOfVarchar_NotEqual(fRES(typeOfVarchar));
    }

    protected void doSetTypeOfVarchar_NotEqual(String typeOfVarchar) {
        regTypeOfVarchar(CK_NES, typeOfVarchar);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * type_of_varchar: {varchar(2147483647)}
     * @param typeOfVarcharList The collection of typeOfVarchar as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfVarchar_InScope(Collection<String> typeOfVarcharList) {
        doSetTypeOfVarchar_InScope(typeOfVarcharList);
    }

    protected void doSetTypeOfVarchar_InScope(Collection<String> typeOfVarcharList) {
        regINS(CK_INS, cTL(typeOfVarcharList), xgetCValueTypeOfVarchar(), "type_of_varchar");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * type_of_varchar: {varchar(2147483647)}
     * @param typeOfVarcharList The collection of typeOfVarchar as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfVarchar_NotInScope(Collection<String> typeOfVarcharList) {
        doSetTypeOfVarchar_NotInScope(typeOfVarcharList);
    }

    protected void doSetTypeOfVarchar_NotInScope(Collection<String> typeOfVarcharList) {
        regINS(CK_NINS, cTL(typeOfVarcharList), xgetCValueTypeOfVarchar(), "type_of_varchar");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * type_of_varchar: {varchar(2147483647)} <br>
     * <pre>e.g. setTypeOfVarchar_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param typeOfVarchar The value of typeOfVarchar as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfVarchar_LikeSearch(String typeOfVarchar, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfVarchar_LikeSearch(typeOfVarchar, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * type_of_varchar: {varchar(2147483647)} <br>
     * <pre>e.g. setTypeOfVarchar_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfVarchar The value of typeOfVarchar as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setTypeOfVarchar_LikeSearch(String typeOfVarchar, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfVarchar), xgetCValueTypeOfVarchar(), "type_of_varchar", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * type_of_varchar: {varchar(2147483647)}
     * @param typeOfVarchar The value of typeOfVarchar as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfVarchar_NotLikeSearch(String typeOfVarchar, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfVarchar_NotLikeSearch(typeOfVarchar, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * type_of_varchar: {varchar(2147483647)}
     * @param typeOfVarchar The value of typeOfVarchar as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setTypeOfVarchar_NotLikeSearch(String typeOfVarchar, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfVarchar), xgetCValueTypeOfVarchar(), "type_of_varchar", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * type_of_varchar: {varchar(2147483647)}
     * @param typeOfVarchar The value of typeOfVarchar as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfVarchar_PrefixSearch(String typeOfVarchar) {
        setTypeOfVarchar_LikeSearch(typeOfVarchar, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * type_of_varchar: {varchar(2147483647)}
     */
    public void setTypeOfVarchar_IsNull() { regTypeOfVarchar(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * type_of_varchar: {varchar(2147483647)}
     */
    public void setTypeOfVarchar_IsNullOrEmpty() { regTypeOfVarchar(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * type_of_varchar: {varchar(2147483647)}
     */
    public void setTypeOfVarchar_IsNotNull() { regTypeOfVarchar(CK_ISNN, DOBJ); }

    protected void regTypeOfVarchar(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfVarchar(), "type_of_varchar"); }
    protected abstract ConditionValue xgetCValueTypeOfVarchar();


    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * type_of_vc_array: {_varchar(2147483647)}
     */
    public void setTypeOfVcArray_IsNull() { regTypeOfVcArray(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * type_of_vc_array: {_varchar(2147483647)}
     */
    public void setTypeOfVcArray_IsNotNull() { regTypeOfVcArray(CK_ISNN, DOBJ); }

    protected void regTypeOfVcArray(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfVcArray(), "type_of_vc_array"); }
    protected abstract ConditionValue xgetCValueTypeOfVcArray();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * type_of_text: {text(2147483647)}
     * @param typeOfText The value of typeOfText as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfText_Equal(String typeOfText) {
        doSetTypeOfText_Equal(fRES(typeOfText));
    }

    protected void doSetTypeOfText_Equal(String typeOfText) {
        regTypeOfText(CK_EQ, typeOfText);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * type_of_text: {text(2147483647)}
     * @param typeOfText The value of typeOfText as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfText_NotEqual(String typeOfText) {
        doSetTypeOfText_NotEqual(fRES(typeOfText));
    }

    protected void doSetTypeOfText_NotEqual(String typeOfText) {
        regTypeOfText(CK_NES, typeOfText);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * type_of_text: {text(2147483647)}
     * @param typeOfTextList The collection of typeOfText as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfText_InScope(Collection<String> typeOfTextList) {
        doSetTypeOfText_InScope(typeOfTextList);
    }

    protected void doSetTypeOfText_InScope(Collection<String> typeOfTextList) {
        regINS(CK_INS, cTL(typeOfTextList), xgetCValueTypeOfText(), "type_of_text");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * type_of_text: {text(2147483647)}
     * @param typeOfTextList The collection of typeOfText as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfText_NotInScope(Collection<String> typeOfTextList) {
        doSetTypeOfText_NotInScope(typeOfTextList);
    }

    protected void doSetTypeOfText_NotInScope(Collection<String> typeOfTextList) {
        regINS(CK_NINS, cTL(typeOfTextList), xgetCValueTypeOfText(), "type_of_text");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * type_of_text: {text(2147483647)} <br>
     * <pre>e.g. setTypeOfText_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param typeOfText The value of typeOfText as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfText_LikeSearch(String typeOfText, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfText_LikeSearch(typeOfText, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * type_of_text: {text(2147483647)} <br>
     * <pre>e.g. setTypeOfText_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfText The value of typeOfText as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setTypeOfText_LikeSearch(String typeOfText, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfText), xgetCValueTypeOfText(), "type_of_text", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * type_of_text: {text(2147483647)}
     * @param typeOfText The value of typeOfText as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfText_NotLikeSearch(String typeOfText, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfText_NotLikeSearch(typeOfText, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * type_of_text: {text(2147483647)}
     * @param typeOfText The value of typeOfText as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setTypeOfText_NotLikeSearch(String typeOfText, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfText), xgetCValueTypeOfText(), "type_of_text", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * type_of_text: {text(2147483647)}
     * @param typeOfText The value of typeOfText as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfText_PrefixSearch(String typeOfText) {
        setTypeOfText_LikeSearch(typeOfText, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * type_of_text: {text(2147483647)}
     */
    public void setTypeOfText_IsNull() { regTypeOfText(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * type_of_text: {text(2147483647)}
     */
    public void setTypeOfText_IsNullOrEmpty() { regTypeOfText(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * type_of_text: {text(2147483647)}
     */
    public void setTypeOfText_IsNotNull() { regTypeOfText(CK_ISNN, DOBJ); }

    protected void regTypeOfText(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfText(), "type_of_text"); }
    protected abstract ConditionValue xgetCValueTypeOfText();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_numeric_integer: {numeric(5)}
     * @param typeOfNumericInteger The value of typeOfNumericInteger as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumericInteger_Equal(Integer typeOfNumericInteger) {
        doSetTypeOfNumericInteger_Equal(typeOfNumericInteger);
    }

    protected void doSetTypeOfNumericInteger_Equal(Integer typeOfNumericInteger) {
        regTypeOfNumericInteger(CK_EQ, typeOfNumericInteger);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_numeric_integer: {numeric(5)}
     * @param typeOfNumericInteger The value of typeOfNumericInteger as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumericInteger_GreaterThan(Integer typeOfNumericInteger) {
        regTypeOfNumericInteger(CK_GT, typeOfNumericInteger);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_numeric_integer: {numeric(5)}
     * @param typeOfNumericInteger The value of typeOfNumericInteger as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumericInteger_LessThan(Integer typeOfNumericInteger) {
        regTypeOfNumericInteger(CK_LT, typeOfNumericInteger);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_numeric_integer: {numeric(5)}
     * @param typeOfNumericInteger The value of typeOfNumericInteger as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumericInteger_GreaterEqual(Integer typeOfNumericInteger) {
        regTypeOfNumericInteger(CK_GE, typeOfNumericInteger);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_numeric_integer: {numeric(5)}
     * @param typeOfNumericInteger The value of typeOfNumericInteger as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumericInteger_LessEqual(Integer typeOfNumericInteger) {
        regTypeOfNumericInteger(CK_LE, typeOfNumericInteger);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_numeric_integer: {numeric(5)}
     * @param minNumber The min number of typeOfNumericInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeOfNumericInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTypeOfNumericInteger_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTypeOfNumericInteger_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_numeric_integer: {numeric(5)}
     * @param minNumber The min number of typeOfNumericInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeOfNumericInteger. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setTypeOfNumericInteger_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTypeOfNumericInteger(), "type_of_numeric_integer", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * type_of_numeric_integer: {numeric(5)}
     * @param typeOfNumericIntegerList The collection of typeOfNumericInteger as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfNumericInteger_InScope(Collection<Integer> typeOfNumericIntegerList) {
        doSetTypeOfNumericInteger_InScope(typeOfNumericIntegerList);
    }

    protected void doSetTypeOfNumericInteger_InScope(Collection<Integer> typeOfNumericIntegerList) {
        regINS(CK_INS, cTL(typeOfNumericIntegerList), xgetCValueTypeOfNumericInteger(), "type_of_numeric_integer");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * type_of_numeric_integer: {numeric(5)}
     * @param typeOfNumericIntegerList The collection of typeOfNumericInteger as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfNumericInteger_NotInScope(Collection<Integer> typeOfNumericIntegerList) {
        doSetTypeOfNumericInteger_NotInScope(typeOfNumericIntegerList);
    }

    protected void doSetTypeOfNumericInteger_NotInScope(Collection<Integer> typeOfNumericIntegerList) {
        regINS(CK_NINS, cTL(typeOfNumericIntegerList), xgetCValueTypeOfNumericInteger(), "type_of_numeric_integer");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * type_of_numeric_integer: {numeric(5)}
     */
    public void setTypeOfNumericInteger_IsNull() { regTypeOfNumericInteger(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * type_of_numeric_integer: {numeric(5)}
     */
    public void setTypeOfNumericInteger_IsNotNull() { regTypeOfNumericInteger(CK_ISNN, DOBJ); }

    protected void regTypeOfNumericInteger(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfNumericInteger(), "type_of_numeric_integer"); }
    protected abstract ConditionValue xgetCValueTypeOfNumericInteger();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_numeric_bigint: {numeric(12)}
     * @param typeOfNumericBigint The value of typeOfNumericBigint as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumericBigint_Equal(Long typeOfNumericBigint) {
        doSetTypeOfNumericBigint_Equal(typeOfNumericBigint);
    }

    protected void doSetTypeOfNumericBigint_Equal(Long typeOfNumericBigint) {
        regTypeOfNumericBigint(CK_EQ, typeOfNumericBigint);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_numeric_bigint: {numeric(12)}
     * @param typeOfNumericBigint The value of typeOfNumericBigint as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumericBigint_GreaterThan(Long typeOfNumericBigint) {
        regTypeOfNumericBigint(CK_GT, typeOfNumericBigint);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_numeric_bigint: {numeric(12)}
     * @param typeOfNumericBigint The value of typeOfNumericBigint as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumericBigint_LessThan(Long typeOfNumericBigint) {
        regTypeOfNumericBigint(CK_LT, typeOfNumericBigint);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_numeric_bigint: {numeric(12)}
     * @param typeOfNumericBigint The value of typeOfNumericBigint as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumericBigint_GreaterEqual(Long typeOfNumericBigint) {
        regTypeOfNumericBigint(CK_GE, typeOfNumericBigint);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_numeric_bigint: {numeric(12)}
     * @param typeOfNumericBigint The value of typeOfNumericBigint as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumericBigint_LessEqual(Long typeOfNumericBigint) {
        regTypeOfNumericBigint(CK_LE, typeOfNumericBigint);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_numeric_bigint: {numeric(12)}
     * @param minNumber The min number of typeOfNumericBigint. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeOfNumericBigint. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTypeOfNumericBigint_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTypeOfNumericBigint_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_numeric_bigint: {numeric(12)}
     * @param minNumber The min number of typeOfNumericBigint. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeOfNumericBigint. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setTypeOfNumericBigint_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTypeOfNumericBigint(), "type_of_numeric_bigint", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * type_of_numeric_bigint: {numeric(12)}
     * @param typeOfNumericBigintList The collection of typeOfNumericBigint as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfNumericBigint_InScope(Collection<Long> typeOfNumericBigintList) {
        doSetTypeOfNumericBigint_InScope(typeOfNumericBigintList);
    }

    protected void doSetTypeOfNumericBigint_InScope(Collection<Long> typeOfNumericBigintList) {
        regINS(CK_INS, cTL(typeOfNumericBigintList), xgetCValueTypeOfNumericBigint(), "type_of_numeric_bigint");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * type_of_numeric_bigint: {numeric(12)}
     * @param typeOfNumericBigintList The collection of typeOfNumericBigint as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfNumericBigint_NotInScope(Collection<Long> typeOfNumericBigintList) {
        doSetTypeOfNumericBigint_NotInScope(typeOfNumericBigintList);
    }

    protected void doSetTypeOfNumericBigint_NotInScope(Collection<Long> typeOfNumericBigintList) {
        regINS(CK_NINS, cTL(typeOfNumericBigintList), xgetCValueTypeOfNumericBigint(), "type_of_numeric_bigint");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * type_of_numeric_bigint: {numeric(12)}
     */
    public void setTypeOfNumericBigint_IsNull() { regTypeOfNumericBigint(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * type_of_numeric_bigint: {numeric(12)}
     */
    public void setTypeOfNumericBigint_IsNotNull() { regTypeOfNumericBigint(CK_ISNN, DOBJ); }

    protected void regTypeOfNumericBigint(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfNumericBigint(), "type_of_numeric_bigint"); }
    protected abstract ConditionValue xgetCValueTypeOfNumericBigint();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_numeric_decimal: {numeric(5, 3)}
     * @param typeOfNumericDecimal The value of typeOfNumericDecimal as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumericDecimal_Equal(java.math.BigDecimal typeOfNumericDecimal) {
        doSetTypeOfNumericDecimal_Equal(typeOfNumericDecimal);
    }

    protected void doSetTypeOfNumericDecimal_Equal(java.math.BigDecimal typeOfNumericDecimal) {
        regTypeOfNumericDecimal(CK_EQ, typeOfNumericDecimal);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_numeric_decimal: {numeric(5, 3)}
     * @param typeOfNumericDecimal The value of typeOfNumericDecimal as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumericDecimal_GreaterThan(java.math.BigDecimal typeOfNumericDecimal) {
        regTypeOfNumericDecimal(CK_GT, typeOfNumericDecimal);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_numeric_decimal: {numeric(5, 3)}
     * @param typeOfNumericDecimal The value of typeOfNumericDecimal as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumericDecimal_LessThan(java.math.BigDecimal typeOfNumericDecimal) {
        regTypeOfNumericDecimal(CK_LT, typeOfNumericDecimal);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_numeric_decimal: {numeric(5, 3)}
     * @param typeOfNumericDecimal The value of typeOfNumericDecimal as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumericDecimal_GreaterEqual(java.math.BigDecimal typeOfNumericDecimal) {
        regTypeOfNumericDecimal(CK_GE, typeOfNumericDecimal);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_numeric_decimal: {numeric(5, 3)}
     * @param typeOfNumericDecimal The value of typeOfNumericDecimal as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfNumericDecimal_LessEqual(java.math.BigDecimal typeOfNumericDecimal) {
        regTypeOfNumericDecimal(CK_LE, typeOfNumericDecimal);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_numeric_decimal: {numeric(5, 3)}
     * @param minNumber The min number of typeOfNumericDecimal. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeOfNumericDecimal. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTypeOfNumericDecimal_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTypeOfNumericDecimal_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_numeric_decimal: {numeric(5, 3)}
     * @param minNumber The min number of typeOfNumericDecimal. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeOfNumericDecimal. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setTypeOfNumericDecimal_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTypeOfNumericDecimal(), "type_of_numeric_decimal", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * type_of_numeric_decimal: {numeric(5, 3)}
     * @param typeOfNumericDecimalList The collection of typeOfNumericDecimal as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfNumericDecimal_InScope(Collection<java.math.BigDecimal> typeOfNumericDecimalList) {
        doSetTypeOfNumericDecimal_InScope(typeOfNumericDecimalList);
    }

    protected void doSetTypeOfNumericDecimal_InScope(Collection<java.math.BigDecimal> typeOfNumericDecimalList) {
        regINS(CK_INS, cTL(typeOfNumericDecimalList), xgetCValueTypeOfNumericDecimal(), "type_of_numeric_decimal");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * type_of_numeric_decimal: {numeric(5, 3)}
     * @param typeOfNumericDecimalList The collection of typeOfNumericDecimal as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfNumericDecimal_NotInScope(Collection<java.math.BigDecimal> typeOfNumericDecimalList) {
        doSetTypeOfNumericDecimal_NotInScope(typeOfNumericDecimalList);
    }

    protected void doSetTypeOfNumericDecimal_NotInScope(Collection<java.math.BigDecimal> typeOfNumericDecimalList) {
        regINS(CK_NINS, cTL(typeOfNumericDecimalList), xgetCValueTypeOfNumericDecimal(), "type_of_numeric_decimal");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * type_of_numeric_decimal: {numeric(5, 3)}
     */
    public void setTypeOfNumericDecimal_IsNull() { regTypeOfNumericDecimal(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * type_of_numeric_decimal: {numeric(5, 3)}
     */
    public void setTypeOfNumericDecimal_IsNotNull() { regTypeOfNumericDecimal(CK_ISNN, DOBJ); }

    protected void regTypeOfNumericDecimal(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfNumericDecimal(), "type_of_numeric_decimal"); }
    protected abstract ConditionValue xgetCValueTypeOfNumericDecimal();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_decimal: {numeric(131089)}
     * @param typeOfDecimal The value of typeOfDecimal as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDecimal_Equal(java.math.BigDecimal typeOfDecimal) {
        doSetTypeOfDecimal_Equal(typeOfDecimal);
    }

    protected void doSetTypeOfDecimal_Equal(java.math.BigDecimal typeOfDecimal) {
        regTypeOfDecimal(CK_EQ, typeOfDecimal);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_decimal: {numeric(131089)}
     * @param typeOfDecimal The value of typeOfDecimal as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDecimal_GreaterThan(java.math.BigDecimal typeOfDecimal) {
        regTypeOfDecimal(CK_GT, typeOfDecimal);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_decimal: {numeric(131089)}
     * @param typeOfDecimal The value of typeOfDecimal as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDecimal_LessThan(java.math.BigDecimal typeOfDecimal) {
        regTypeOfDecimal(CK_LT, typeOfDecimal);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_decimal: {numeric(131089)}
     * @param typeOfDecimal The value of typeOfDecimal as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDecimal_GreaterEqual(java.math.BigDecimal typeOfDecimal) {
        regTypeOfDecimal(CK_GE, typeOfDecimal);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_decimal: {numeric(131089)}
     * @param typeOfDecimal The value of typeOfDecimal as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDecimal_LessEqual(java.math.BigDecimal typeOfDecimal) {
        regTypeOfDecimal(CK_LE, typeOfDecimal);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_decimal: {numeric(131089)}
     * @param minNumber The min number of typeOfDecimal. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeOfDecimal. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTypeOfDecimal_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTypeOfDecimal_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_decimal: {numeric(131089)}
     * @param minNumber The min number of typeOfDecimal. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeOfDecimal. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setTypeOfDecimal_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTypeOfDecimal(), "type_of_decimal", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * type_of_decimal: {numeric(131089)}
     * @param typeOfDecimalList The collection of typeOfDecimal as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfDecimal_InScope(Collection<java.math.BigDecimal> typeOfDecimalList) {
        doSetTypeOfDecimal_InScope(typeOfDecimalList);
    }

    protected void doSetTypeOfDecimal_InScope(Collection<java.math.BigDecimal> typeOfDecimalList) {
        regINS(CK_INS, cTL(typeOfDecimalList), xgetCValueTypeOfDecimal(), "type_of_decimal");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * type_of_decimal: {numeric(131089)}
     * @param typeOfDecimalList The collection of typeOfDecimal as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfDecimal_NotInScope(Collection<java.math.BigDecimal> typeOfDecimalList) {
        doSetTypeOfDecimal_NotInScope(typeOfDecimalList);
    }

    protected void doSetTypeOfDecimal_NotInScope(Collection<java.math.BigDecimal> typeOfDecimalList) {
        regINS(CK_NINS, cTL(typeOfDecimalList), xgetCValueTypeOfDecimal(), "type_of_decimal");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * type_of_decimal: {numeric(131089)}
     */
    public void setTypeOfDecimal_IsNull() { regTypeOfDecimal(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * type_of_decimal: {numeric(131089)}
     */
    public void setTypeOfDecimal_IsNotNull() { regTypeOfDecimal(CK_ISNN, DOBJ); }

    protected void regTypeOfDecimal(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfDecimal(), "type_of_decimal"); }
    protected abstract ConditionValue xgetCValueTypeOfDecimal();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_int: {int4(10)}
     * @param typeOfInt The value of typeOfInt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfInt_Equal(Integer typeOfInt) {
        doSetTypeOfInt_Equal(typeOfInt);
    }

    protected void doSetTypeOfInt_Equal(Integer typeOfInt) {
        regTypeOfInt(CK_EQ, typeOfInt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_int: {int4(10)}
     * @param typeOfInt The value of typeOfInt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfInt_GreaterThan(Integer typeOfInt) {
        regTypeOfInt(CK_GT, typeOfInt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_int: {int4(10)}
     * @param typeOfInt The value of typeOfInt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfInt_LessThan(Integer typeOfInt) {
        regTypeOfInt(CK_LT, typeOfInt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_int: {int4(10)}
     * @param typeOfInt The value of typeOfInt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfInt_GreaterEqual(Integer typeOfInt) {
        regTypeOfInt(CK_GE, typeOfInt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_int: {int4(10)}
     * @param typeOfInt The value of typeOfInt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfInt_LessEqual(Integer typeOfInt) {
        regTypeOfInt(CK_LE, typeOfInt);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_int: {int4(10)}
     * @param minNumber The min number of typeOfInt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeOfInt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTypeOfInt_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTypeOfInt_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_int: {int4(10)}
     * @param minNumber The min number of typeOfInt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeOfInt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setTypeOfInt_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTypeOfInt(), "type_of_int", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * type_of_int: {int4(10)}
     * @param typeOfIntList The collection of typeOfInt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfInt_InScope(Collection<Integer> typeOfIntList) {
        doSetTypeOfInt_InScope(typeOfIntList);
    }

    protected void doSetTypeOfInt_InScope(Collection<Integer> typeOfIntList) {
        regINS(CK_INS, cTL(typeOfIntList), xgetCValueTypeOfInt(), "type_of_int");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * type_of_int: {int4(10)}
     * @param typeOfIntList The collection of typeOfInt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfInt_NotInScope(Collection<Integer> typeOfIntList) {
        doSetTypeOfInt_NotInScope(typeOfIntList);
    }

    protected void doSetTypeOfInt_NotInScope(Collection<Integer> typeOfIntList) {
        regINS(CK_NINS, cTL(typeOfIntList), xgetCValueTypeOfInt(), "type_of_int");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * type_of_int: {int4(10)}
     */
    public void setTypeOfInt_IsNull() { regTypeOfInt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * type_of_int: {int4(10)}
     */
    public void setTypeOfInt_IsNotNull() { regTypeOfInt(CK_ISNN, DOBJ); }

    protected void regTypeOfInt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfInt(), "type_of_int"); }
    protected abstract ConditionValue xgetCValueTypeOfInt();


    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * type_of_int_array: {_int4(10)}
     */
    public void setTypeOfIntArray_IsNull() { regTypeOfIntArray(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * type_of_int_array: {_int4(10)}
     */
    public void setTypeOfIntArray_IsNotNull() { regTypeOfIntArray(CK_ISNN, DOBJ); }

    protected void regTypeOfIntArray(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfIntArray(), "type_of_int_array"); }
    protected abstract ConditionValue xgetCValueTypeOfIntArray();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_int4: {int4(10)}
     * @param typeOfInt4 The value of typeOfInt4 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfInt4_Equal(Integer typeOfInt4) {
        doSetTypeOfInt4_Equal(typeOfInt4);
    }

    protected void doSetTypeOfInt4_Equal(Integer typeOfInt4) {
        regTypeOfInt4(CK_EQ, typeOfInt4);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_int4: {int4(10)}
     * @param typeOfInt4 The value of typeOfInt4 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfInt4_GreaterThan(Integer typeOfInt4) {
        regTypeOfInt4(CK_GT, typeOfInt4);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_int4: {int4(10)}
     * @param typeOfInt4 The value of typeOfInt4 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfInt4_LessThan(Integer typeOfInt4) {
        regTypeOfInt4(CK_LT, typeOfInt4);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_int4: {int4(10)}
     * @param typeOfInt4 The value of typeOfInt4 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfInt4_GreaterEqual(Integer typeOfInt4) {
        regTypeOfInt4(CK_GE, typeOfInt4);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_int4: {int4(10)}
     * @param typeOfInt4 The value of typeOfInt4 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfInt4_LessEqual(Integer typeOfInt4) {
        regTypeOfInt4(CK_LE, typeOfInt4);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_int4: {int4(10)}
     * @param minNumber The min number of typeOfInt4. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeOfInt4. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTypeOfInt4_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTypeOfInt4_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_int4: {int4(10)}
     * @param minNumber The min number of typeOfInt4. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeOfInt4. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setTypeOfInt4_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTypeOfInt4(), "type_of_int4", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * type_of_int4: {int4(10)}
     * @param typeOfInt4List The collection of typeOfInt4 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfInt4_InScope(Collection<Integer> typeOfInt4List) {
        doSetTypeOfInt4_InScope(typeOfInt4List);
    }

    protected void doSetTypeOfInt4_InScope(Collection<Integer> typeOfInt4List) {
        regINS(CK_INS, cTL(typeOfInt4List), xgetCValueTypeOfInt4(), "type_of_int4");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * type_of_int4: {int4(10)}
     * @param typeOfInt4List The collection of typeOfInt4 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfInt4_NotInScope(Collection<Integer> typeOfInt4List) {
        doSetTypeOfInt4_NotInScope(typeOfInt4List);
    }

    protected void doSetTypeOfInt4_NotInScope(Collection<Integer> typeOfInt4List) {
        regINS(CK_NINS, cTL(typeOfInt4List), xgetCValueTypeOfInt4(), "type_of_int4");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * type_of_int4: {int4(10)}
     */
    public void setTypeOfInt4_IsNull() { regTypeOfInt4(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * type_of_int4: {int4(10)}
     */
    public void setTypeOfInt4_IsNotNull() { regTypeOfInt4(CK_ISNN, DOBJ); }

    protected void regTypeOfInt4(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfInt4(), "type_of_int4"); }
    protected abstract ConditionValue xgetCValueTypeOfInt4();


    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * type_of_int4_array: {_int4(10)}
     */
    public void setTypeOfInt4Array_IsNull() { regTypeOfInt4Array(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * type_of_int4_array: {_int4(10)}
     */
    public void setTypeOfInt4Array_IsNotNull() { regTypeOfInt4Array(CK_ISNN, DOBJ); }

    protected void regTypeOfInt4Array(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfInt4Array(), "type_of_int4_array"); }
    protected abstract ConditionValue xgetCValueTypeOfInt4Array();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_int8: {int8(19)}
     * @param typeOfInt8 The value of typeOfInt8 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfInt8_Equal(Long typeOfInt8) {
        doSetTypeOfInt8_Equal(typeOfInt8);
    }

    protected void doSetTypeOfInt8_Equal(Long typeOfInt8) {
        regTypeOfInt8(CK_EQ, typeOfInt8);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_int8: {int8(19)}
     * @param typeOfInt8 The value of typeOfInt8 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfInt8_GreaterThan(Long typeOfInt8) {
        regTypeOfInt8(CK_GT, typeOfInt8);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_int8: {int8(19)}
     * @param typeOfInt8 The value of typeOfInt8 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfInt8_LessThan(Long typeOfInt8) {
        regTypeOfInt8(CK_LT, typeOfInt8);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_int8: {int8(19)}
     * @param typeOfInt8 The value of typeOfInt8 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfInt8_GreaterEqual(Long typeOfInt8) {
        regTypeOfInt8(CK_GE, typeOfInt8);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_int8: {int8(19)}
     * @param typeOfInt8 The value of typeOfInt8 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfInt8_LessEqual(Long typeOfInt8) {
        regTypeOfInt8(CK_LE, typeOfInt8);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_int8: {int8(19)}
     * @param minNumber The min number of typeOfInt8. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeOfInt8. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTypeOfInt8_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTypeOfInt8_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_int8: {int8(19)}
     * @param minNumber The min number of typeOfInt8. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeOfInt8. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setTypeOfInt8_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTypeOfInt8(), "type_of_int8", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * type_of_int8: {int8(19)}
     * @param typeOfInt8List The collection of typeOfInt8 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfInt8_InScope(Collection<Long> typeOfInt8List) {
        doSetTypeOfInt8_InScope(typeOfInt8List);
    }

    protected void doSetTypeOfInt8_InScope(Collection<Long> typeOfInt8List) {
        regINS(CK_INS, cTL(typeOfInt8List), xgetCValueTypeOfInt8(), "type_of_int8");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * type_of_int8: {int8(19)}
     * @param typeOfInt8List The collection of typeOfInt8 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfInt8_NotInScope(Collection<Long> typeOfInt8List) {
        doSetTypeOfInt8_NotInScope(typeOfInt8List);
    }

    protected void doSetTypeOfInt8_NotInScope(Collection<Long> typeOfInt8List) {
        regINS(CK_NINS, cTL(typeOfInt8List), xgetCValueTypeOfInt8(), "type_of_int8");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * type_of_int8: {int8(19)}
     */
    public void setTypeOfInt8_IsNull() { regTypeOfInt8(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * type_of_int8: {int8(19)}
     */
    public void setTypeOfInt8_IsNotNull() { regTypeOfInt8(CK_ISNN, DOBJ); }

    protected void regTypeOfInt8(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfInt8(), "type_of_int8"); }
    protected abstract ConditionValue xgetCValueTypeOfInt8();


    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * type_of_int8_array: {_int8(19)}
     */
    public void setTypeOfInt8Array_IsNull() { regTypeOfInt8Array(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * type_of_int8_array: {_int8(19)}
     */
    public void setTypeOfInt8Array_IsNotNull() { regTypeOfInt8Array(CK_ISNN, DOBJ); }

    protected void regTypeOfInt8Array(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfInt8Array(), "type_of_int8_array"); }
    protected abstract ConditionValue xgetCValueTypeOfInt8Array();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_bigint: {int8(19)}
     * @param typeOfBigint The value of typeOfBigint as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfBigint_Equal(Long typeOfBigint) {
        doSetTypeOfBigint_Equal(typeOfBigint);
    }

    protected void doSetTypeOfBigint_Equal(Long typeOfBigint) {
        regTypeOfBigint(CK_EQ, typeOfBigint);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_bigint: {int8(19)}
     * @param typeOfBigint The value of typeOfBigint as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfBigint_GreaterThan(Long typeOfBigint) {
        regTypeOfBigint(CK_GT, typeOfBigint);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_bigint: {int8(19)}
     * @param typeOfBigint The value of typeOfBigint as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfBigint_LessThan(Long typeOfBigint) {
        regTypeOfBigint(CK_LT, typeOfBigint);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_bigint: {int8(19)}
     * @param typeOfBigint The value of typeOfBigint as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfBigint_GreaterEqual(Long typeOfBigint) {
        regTypeOfBigint(CK_GE, typeOfBigint);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_bigint: {int8(19)}
     * @param typeOfBigint The value of typeOfBigint as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfBigint_LessEqual(Long typeOfBigint) {
        regTypeOfBigint(CK_LE, typeOfBigint);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_bigint: {int8(19)}
     * @param minNumber The min number of typeOfBigint. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeOfBigint. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTypeOfBigint_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTypeOfBigint_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_bigint: {int8(19)}
     * @param minNumber The min number of typeOfBigint. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeOfBigint. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setTypeOfBigint_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTypeOfBigint(), "type_of_bigint", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * type_of_bigint: {int8(19)}
     * @param typeOfBigintList The collection of typeOfBigint as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfBigint_InScope(Collection<Long> typeOfBigintList) {
        doSetTypeOfBigint_InScope(typeOfBigintList);
    }

    protected void doSetTypeOfBigint_InScope(Collection<Long> typeOfBigintList) {
        regINS(CK_INS, cTL(typeOfBigintList), xgetCValueTypeOfBigint(), "type_of_bigint");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * type_of_bigint: {int8(19)}
     * @param typeOfBigintList The collection of typeOfBigint as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfBigint_NotInScope(Collection<Long> typeOfBigintList) {
        doSetTypeOfBigint_NotInScope(typeOfBigintList);
    }

    protected void doSetTypeOfBigint_NotInScope(Collection<Long> typeOfBigintList) {
        regINS(CK_NINS, cTL(typeOfBigintList), xgetCValueTypeOfBigint(), "type_of_bigint");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * type_of_bigint: {int8(19)}
     */
    public void setTypeOfBigint_IsNull() { regTypeOfBigint(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * type_of_bigint: {int8(19)}
     */
    public void setTypeOfBigint_IsNotNull() { regTypeOfBigint(CK_ISNN, DOBJ); }

    protected void regTypeOfBigint(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfBigint(), "type_of_bigint"); }
    protected abstract ConditionValue xgetCValueTypeOfBigint();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_real: {float4(8, 8)}
     * @param typeOfReal The value of typeOfReal as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfReal_Equal(java.math.BigDecimal typeOfReal) {
        doSetTypeOfReal_Equal(typeOfReal);
    }

    protected void doSetTypeOfReal_Equal(java.math.BigDecimal typeOfReal) {
        regTypeOfReal(CK_EQ, typeOfReal);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_real: {float4(8, 8)}
     * @param typeOfReal The value of typeOfReal as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfReal_GreaterThan(java.math.BigDecimal typeOfReal) {
        regTypeOfReal(CK_GT, typeOfReal);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_real: {float4(8, 8)}
     * @param typeOfReal The value of typeOfReal as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfReal_LessThan(java.math.BigDecimal typeOfReal) {
        regTypeOfReal(CK_LT, typeOfReal);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_real: {float4(8, 8)}
     * @param typeOfReal The value of typeOfReal as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfReal_GreaterEqual(java.math.BigDecimal typeOfReal) {
        regTypeOfReal(CK_GE, typeOfReal);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_real: {float4(8, 8)}
     * @param typeOfReal The value of typeOfReal as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfReal_LessEqual(java.math.BigDecimal typeOfReal) {
        regTypeOfReal(CK_LE, typeOfReal);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_real: {float4(8, 8)}
     * @param minNumber The min number of typeOfReal. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeOfReal. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTypeOfReal_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTypeOfReal_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_real: {float4(8, 8)}
     * @param minNumber The min number of typeOfReal. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeOfReal. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setTypeOfReal_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTypeOfReal(), "type_of_real", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * type_of_real: {float4(8, 8)}
     * @param typeOfRealList The collection of typeOfReal as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfReal_InScope(Collection<java.math.BigDecimal> typeOfRealList) {
        doSetTypeOfReal_InScope(typeOfRealList);
    }

    protected void doSetTypeOfReal_InScope(Collection<java.math.BigDecimal> typeOfRealList) {
        regINS(CK_INS, cTL(typeOfRealList), xgetCValueTypeOfReal(), "type_of_real");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * type_of_real: {float4(8, 8)}
     * @param typeOfRealList The collection of typeOfReal as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfReal_NotInScope(Collection<java.math.BigDecimal> typeOfRealList) {
        doSetTypeOfReal_NotInScope(typeOfRealList);
    }

    protected void doSetTypeOfReal_NotInScope(Collection<java.math.BigDecimal> typeOfRealList) {
        regINS(CK_NINS, cTL(typeOfRealList), xgetCValueTypeOfReal(), "type_of_real");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * type_of_real: {float4(8, 8)}
     */
    public void setTypeOfReal_IsNull() { regTypeOfReal(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * type_of_real: {float4(8, 8)}
     */
    public void setTypeOfReal_IsNotNull() { regTypeOfReal(CK_ISNN, DOBJ); }

    protected void regTypeOfReal(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfReal(), "type_of_real"); }
    protected abstract ConditionValue xgetCValueTypeOfReal();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_float: {float8(17, 17)}
     * @param typeOfFloat The value of typeOfFloat as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfFloat_Equal(java.math.BigDecimal typeOfFloat) {
        doSetTypeOfFloat_Equal(typeOfFloat);
    }

    protected void doSetTypeOfFloat_Equal(java.math.BigDecimal typeOfFloat) {
        regTypeOfFloat(CK_EQ, typeOfFloat);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_float: {float8(17, 17)}
     * @param typeOfFloat The value of typeOfFloat as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfFloat_GreaterThan(java.math.BigDecimal typeOfFloat) {
        regTypeOfFloat(CK_GT, typeOfFloat);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_float: {float8(17, 17)}
     * @param typeOfFloat The value of typeOfFloat as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfFloat_LessThan(java.math.BigDecimal typeOfFloat) {
        regTypeOfFloat(CK_LT, typeOfFloat);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_float: {float8(17, 17)}
     * @param typeOfFloat The value of typeOfFloat as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfFloat_GreaterEqual(java.math.BigDecimal typeOfFloat) {
        regTypeOfFloat(CK_GE, typeOfFloat);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_float: {float8(17, 17)}
     * @param typeOfFloat The value of typeOfFloat as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfFloat_LessEqual(java.math.BigDecimal typeOfFloat) {
        regTypeOfFloat(CK_LE, typeOfFloat);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_float: {float8(17, 17)}
     * @param minNumber The min number of typeOfFloat. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeOfFloat. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTypeOfFloat_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTypeOfFloat_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_float: {float8(17, 17)}
     * @param minNumber The min number of typeOfFloat. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeOfFloat. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setTypeOfFloat_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTypeOfFloat(), "type_of_float", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * type_of_float: {float8(17, 17)}
     * @param typeOfFloatList The collection of typeOfFloat as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfFloat_InScope(Collection<java.math.BigDecimal> typeOfFloatList) {
        doSetTypeOfFloat_InScope(typeOfFloatList);
    }

    protected void doSetTypeOfFloat_InScope(Collection<java.math.BigDecimal> typeOfFloatList) {
        regINS(CK_INS, cTL(typeOfFloatList), xgetCValueTypeOfFloat(), "type_of_float");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * type_of_float: {float8(17, 17)}
     * @param typeOfFloatList The collection of typeOfFloat as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfFloat_NotInScope(Collection<java.math.BigDecimal> typeOfFloatList) {
        doSetTypeOfFloat_NotInScope(typeOfFloatList);
    }

    protected void doSetTypeOfFloat_NotInScope(Collection<java.math.BigDecimal> typeOfFloatList) {
        regINS(CK_NINS, cTL(typeOfFloatList), xgetCValueTypeOfFloat(), "type_of_float");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * type_of_float: {float8(17, 17)}
     */
    public void setTypeOfFloat_IsNull() { regTypeOfFloat(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * type_of_float: {float8(17, 17)}
     */
    public void setTypeOfFloat_IsNotNull() { regTypeOfFloat(CK_ISNN, DOBJ); }

    protected void regTypeOfFloat(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfFloat(), "type_of_float"); }
    protected abstract ConditionValue xgetCValueTypeOfFloat();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_money: {money(2147483647)}
     * @param typeOfMoney The value of typeOfMoney as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfMoney_Equal(java.math.BigDecimal typeOfMoney) {
        doSetTypeOfMoney_Equal(typeOfMoney);
    }

    protected void doSetTypeOfMoney_Equal(java.math.BigDecimal typeOfMoney) {
        regTypeOfMoney(CK_EQ, typeOfMoney);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_money: {money(2147483647)}
     * @param typeOfMoney The value of typeOfMoney as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfMoney_GreaterThan(java.math.BigDecimal typeOfMoney) {
        regTypeOfMoney(CK_GT, typeOfMoney);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_money: {money(2147483647)}
     * @param typeOfMoney The value of typeOfMoney as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfMoney_LessThan(java.math.BigDecimal typeOfMoney) {
        regTypeOfMoney(CK_LT, typeOfMoney);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_money: {money(2147483647)}
     * @param typeOfMoney The value of typeOfMoney as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfMoney_GreaterEqual(java.math.BigDecimal typeOfMoney) {
        regTypeOfMoney(CK_GE, typeOfMoney);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_money: {money(2147483647)}
     * @param typeOfMoney The value of typeOfMoney as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfMoney_LessEqual(java.math.BigDecimal typeOfMoney) {
        regTypeOfMoney(CK_LE, typeOfMoney);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_money: {money(2147483647)}
     * @param minNumber The min number of typeOfMoney. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeOfMoney. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTypeOfMoney_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTypeOfMoney_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_money: {money(2147483647)}
     * @param minNumber The min number of typeOfMoney. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeOfMoney. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setTypeOfMoney_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTypeOfMoney(), "type_of_money", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * type_of_money: {money(2147483647)}
     * @param typeOfMoneyList The collection of typeOfMoney as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfMoney_InScope(Collection<java.math.BigDecimal> typeOfMoneyList) {
        doSetTypeOfMoney_InScope(typeOfMoneyList);
    }

    protected void doSetTypeOfMoney_InScope(Collection<java.math.BigDecimal> typeOfMoneyList) {
        regINS(CK_INS, cTL(typeOfMoneyList), xgetCValueTypeOfMoney(), "type_of_money");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * type_of_money: {money(2147483647)}
     * @param typeOfMoneyList The collection of typeOfMoney as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfMoney_NotInScope(Collection<java.math.BigDecimal> typeOfMoneyList) {
        doSetTypeOfMoney_NotInScope(typeOfMoneyList);
    }

    protected void doSetTypeOfMoney_NotInScope(Collection<java.math.BigDecimal> typeOfMoneyList) {
        regINS(CK_NINS, cTL(typeOfMoneyList), xgetCValueTypeOfMoney(), "type_of_money");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * type_of_money: {money(2147483647)}
     */
    public void setTypeOfMoney_IsNull() { regTypeOfMoney(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * type_of_money: {money(2147483647)}
     */
    public void setTypeOfMoney_IsNotNull() { regTypeOfMoney(CK_ISNN, DOBJ); }

    protected void regTypeOfMoney(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfMoney(), "type_of_money"); }
    protected abstract ConditionValue xgetCValueTypeOfMoney();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_date: {date(13)}
     * @param typeOfDate The value of typeOfDate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDate_Equal(java.time.LocalDate typeOfDate) {
        regTypeOfDate(CK_EQ,  typeOfDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_date: {date(13)}
     * @param typeOfDate The value of typeOfDate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDate_GreaterThan(java.time.LocalDate typeOfDate) {
        regTypeOfDate(CK_GT,  typeOfDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_date: {date(13)}
     * @param typeOfDate The value of typeOfDate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDate_LessThan(java.time.LocalDate typeOfDate) {
        regTypeOfDate(CK_LT,  typeOfDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_date: {date(13)}
     * @param typeOfDate The value of typeOfDate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDate_GreaterEqual(java.time.LocalDate typeOfDate) {
        regTypeOfDate(CK_GE,  typeOfDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_date: {date(13)}
     * @param typeOfDate The value of typeOfDate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfDate_LessEqual(java.time.LocalDate typeOfDate) {
        regTypeOfDate(CK_LE, typeOfDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_date: {date(13)}
     * <pre>e.g. setTypeOfDate_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setTypeOfDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setTypeOfDate_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_date: {date(13)}
     * <pre>e.g. setTypeOfDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setTypeOfDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "type_of_date"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueTypeOfDate(), nm, op);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_date: {date(13)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of typeOfDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of typeOfDate. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setTypeOfDate_DateFromTo(java.time.LocalDate fromDate, java.time.LocalDate toDate) {
        setTypeOfDate_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * type_of_date: {date(13)}
     */
    public void setTypeOfDate_IsNull() { regTypeOfDate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * type_of_date: {date(13)}
     */
    public void setTypeOfDate_IsNotNull() { regTypeOfDate(CK_ISNN, DOBJ); }

    protected void regTypeOfDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfDate(), "type_of_date"); }
    protected abstract ConditionValue xgetCValueTypeOfDate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_timestamp: {timestamp(29, 6)}
     * @param typeOfTimestamp The value of typeOfTimestamp as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfTimestamp_Equal(java.time.LocalDateTime typeOfTimestamp) {
        regTypeOfTimestamp(CK_EQ,  typeOfTimestamp);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_timestamp: {timestamp(29, 6)}
     * @param typeOfTimestamp The value of typeOfTimestamp as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfTimestamp_GreaterThan(java.time.LocalDateTime typeOfTimestamp) {
        regTypeOfTimestamp(CK_GT,  typeOfTimestamp);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_timestamp: {timestamp(29, 6)}
     * @param typeOfTimestamp The value of typeOfTimestamp as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfTimestamp_LessThan(java.time.LocalDateTime typeOfTimestamp) {
        regTypeOfTimestamp(CK_LT,  typeOfTimestamp);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_timestamp: {timestamp(29, 6)}
     * @param typeOfTimestamp The value of typeOfTimestamp as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfTimestamp_GreaterEqual(java.time.LocalDateTime typeOfTimestamp) {
        regTypeOfTimestamp(CK_GE,  typeOfTimestamp);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_timestamp: {timestamp(29, 6)}
     * @param typeOfTimestamp The value of typeOfTimestamp as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfTimestamp_LessEqual(java.time.LocalDateTime typeOfTimestamp) {
        regTypeOfTimestamp(CK_LE, typeOfTimestamp);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_timestamp: {timestamp(29, 6)}
     * <pre>e.g. setTypeOfTimestamp_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfTimestamp. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfTimestamp. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setTypeOfTimestamp_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setTypeOfTimestamp_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_timestamp: {timestamp(29, 6)}
     * <pre>e.g. setTypeOfTimestamp_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfTimestamp. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfTimestamp. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setTypeOfTimestamp_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "type_of_timestamp"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueTypeOfTimestamp(), nm, op);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_timestamp: {timestamp(29, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of typeOfTimestamp. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of typeOfTimestamp. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setTypeOfTimestamp_DateFromTo(java.time.LocalDateTime fromDate, java.time.LocalDateTime toDate) {
        setTypeOfTimestamp_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * type_of_timestamp: {timestamp(29, 6)}
     */
    public void setTypeOfTimestamp_IsNull() { regTypeOfTimestamp(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * type_of_timestamp: {timestamp(29, 6)}
     */
    public void setTypeOfTimestamp_IsNotNull() { regTypeOfTimestamp(CK_ISNN, DOBJ); }

    protected void regTypeOfTimestamp(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfTimestamp(), "type_of_timestamp"); }
    protected abstract ConditionValue xgetCValueTypeOfTimestamp();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_time: {time(15, 6)}
     * @param typeOfTime The value of typeOfTime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfTime_Equal(java.time.LocalTime typeOfTime) {
        regTypeOfTime(CK_EQ,  typeOfTime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_time: {time(15, 6)}
     * @param typeOfTime The value of typeOfTime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfTime_GreaterThan(java.time.LocalTime typeOfTime) {
        regTypeOfTime(CK_GT,  typeOfTime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_time: {time(15, 6)}
     * @param typeOfTime The value of typeOfTime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfTime_LessThan(java.time.LocalTime typeOfTime) {
        regTypeOfTime(CK_LT,  typeOfTime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_time: {time(15, 6)}
     * @param typeOfTime The value of typeOfTime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfTime_GreaterEqual(java.time.LocalTime typeOfTime) {
        regTypeOfTime(CK_GE,  typeOfTime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_time: {time(15, 6)}
     * @param typeOfTime The value of typeOfTime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfTime_LessEqual(java.time.LocalTime typeOfTime) {
        regTypeOfTime(CK_LE, typeOfTime);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * type_of_time: {time(15, 6)}
     */
    public void setTypeOfTime_IsNull() { regTypeOfTime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * type_of_time: {time(15, 6)}
     */
    public void setTypeOfTime_IsNotNull() { regTypeOfTime(CK_ISNN, DOBJ); }

    protected void regTypeOfTime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfTime(), "type_of_time"); }
    protected abstract ConditionValue xgetCValueTypeOfTime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_timetz: {timetz(21, 6)}
     * @param typeOfTimetz The value of typeOfTimetz as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfTimetz_Equal(java.time.LocalTime typeOfTimetz) {
        regTypeOfTimetz(CK_EQ,  typeOfTimetz);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_timetz: {timetz(21, 6)}
     * @param typeOfTimetz The value of typeOfTimetz as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfTimetz_GreaterThan(java.time.LocalTime typeOfTimetz) {
        regTypeOfTimetz(CK_GT,  typeOfTimetz);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_timetz: {timetz(21, 6)}
     * @param typeOfTimetz The value of typeOfTimetz as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfTimetz_LessThan(java.time.LocalTime typeOfTimetz) {
        regTypeOfTimetz(CK_LT,  typeOfTimetz);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_timetz: {timetz(21, 6)}
     * @param typeOfTimetz The value of typeOfTimetz as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfTimetz_GreaterEqual(java.time.LocalTime typeOfTimetz) {
        regTypeOfTimetz(CK_GE,  typeOfTimetz);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_timetz: {timetz(21, 6)}
     * @param typeOfTimetz The value of typeOfTimetz as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfTimetz_LessEqual(java.time.LocalTime typeOfTimetz) {
        regTypeOfTimetz(CK_LE, typeOfTimetz);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * type_of_timetz: {timetz(21, 6)}
     */
    public void setTypeOfTimetz_IsNull() { regTypeOfTimetz(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * type_of_timetz: {timetz(21, 6)}
     */
    public void setTypeOfTimetz_IsNotNull() { regTypeOfTimetz(CK_ISNN, DOBJ); }

    protected void regTypeOfTimetz(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfTimetz(), "type_of_timetz"); }
    protected abstract ConditionValue xgetCValueTypeOfTimetz();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * type_of_interval: {interval(49, 6)}
     * @param typeOfInterval The value of typeOfInterval as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfInterval_Equal(String typeOfInterval) {
        doSetTypeOfInterval_Equal(fRES(typeOfInterval));
    }

    protected void doSetTypeOfInterval_Equal(String typeOfInterval) {
        regTypeOfInterval(CK_EQ, typeOfInterval);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * type_of_interval: {interval(49, 6)}
     * @param typeOfInterval The value of typeOfInterval as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfInterval_NotEqual(String typeOfInterval) {
        doSetTypeOfInterval_NotEqual(fRES(typeOfInterval));
    }

    protected void doSetTypeOfInterval_NotEqual(String typeOfInterval) {
        regTypeOfInterval(CK_NES, typeOfInterval);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * type_of_interval: {interval(49, 6)}
     * @param typeOfIntervalList The collection of typeOfInterval as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfInterval_InScope(Collection<String> typeOfIntervalList) {
        doSetTypeOfInterval_InScope(typeOfIntervalList);
    }

    protected void doSetTypeOfInterval_InScope(Collection<String> typeOfIntervalList) {
        regINS(CK_INS, cTL(typeOfIntervalList), xgetCValueTypeOfInterval(), "type_of_interval");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * type_of_interval: {interval(49, 6)}
     * @param typeOfIntervalList The collection of typeOfInterval as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfInterval_NotInScope(Collection<String> typeOfIntervalList) {
        doSetTypeOfInterval_NotInScope(typeOfIntervalList);
    }

    protected void doSetTypeOfInterval_NotInScope(Collection<String> typeOfIntervalList) {
        regINS(CK_NINS, cTL(typeOfIntervalList), xgetCValueTypeOfInterval(), "type_of_interval");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * type_of_interval: {interval(49, 6)} <br>
     * <pre>e.g. setTypeOfInterval_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param typeOfInterval The value of typeOfInterval as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfInterval_LikeSearch(String typeOfInterval, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfInterval_LikeSearch(typeOfInterval, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * type_of_interval: {interval(49, 6)} <br>
     * <pre>e.g. setTypeOfInterval_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfInterval The value of typeOfInterval as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setTypeOfInterval_LikeSearch(String typeOfInterval, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfInterval), xgetCValueTypeOfInterval(), "type_of_interval", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * type_of_interval: {interval(49, 6)}
     * @param typeOfInterval The value of typeOfInterval as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTypeOfInterval_NotLikeSearch(String typeOfInterval, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTypeOfInterval_NotLikeSearch(typeOfInterval, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * type_of_interval: {interval(49, 6)}
     * @param typeOfInterval The value of typeOfInterval as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setTypeOfInterval_NotLikeSearch(String typeOfInterval, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfInterval), xgetCValueTypeOfInterval(), "type_of_interval", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * type_of_interval: {interval(49, 6)}
     * @param typeOfInterval The value of typeOfInterval as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfInterval_PrefixSearch(String typeOfInterval) {
        setTypeOfInterval_LikeSearch(typeOfInterval, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * type_of_interval: {interval(49, 6)}
     */
    public void setTypeOfInterval_IsNull() { regTypeOfInterval(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * type_of_interval: {interval(49, 6)}
     */
    public void setTypeOfInterval_IsNullOrEmpty() { regTypeOfInterval(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * type_of_interval: {interval(49, 6)}
     */
    public void setTypeOfInterval_IsNotNull() { regTypeOfInterval(CK_ISNN, DOBJ); }

    protected void regTypeOfInterval(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfInterval(), "type_of_interval"); }
    protected abstract ConditionValue xgetCValueTypeOfInterval();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_bool: {bool(1), classification=TrueFalse}
     * @param typeOfBool The value of typeOfBool as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfBool_Equal(Boolean typeOfBool) {
        regTypeOfBool(CK_EQ, typeOfBool);
    }

    /**
     * Equal(=). As TrueFalse. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * type_of_bool: {bool(1), classification=TrueFalse} <br>
     * boolean type classification
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfBool_Equal_AsTrueFalse(CDef.TrueFalse cdef) {
        doSetTypeOfBool_Equal(cdef != null ? Boolean.valueOf(cdef.code()) : null);
    }

    /**
     * Equal(=). As True. And OnlyOnceRegistered. <br>
     * Yes: means valid
     */
    public void setTypeOfBool_Equal_True() {
        doSetTypeOfBool_Equal(Boolean.valueOf(CDef.TrueFalse.True.code()));
    }

    /**
     * Equal(=). As False. And OnlyOnceRegistered. <br>
     * No: means invalid
     */
    public void setTypeOfBool_Equal_False() {
        doSetTypeOfBool_Equal(Boolean.valueOf(CDef.TrueFalse.False.code()));
    }

    protected void doSetTypeOfBool_Equal(Boolean typeOfBool) {
        regTypeOfBool(CK_EQ, typeOfBool);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * type_of_bool: {bool(1), classification=TrueFalse}
     */
    public void setTypeOfBool_IsNull() { regTypeOfBool(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * type_of_bool: {bool(1), classification=TrueFalse}
     */
    public void setTypeOfBool_IsNotNull() { regTypeOfBool(CK_ISNN, DOBJ); }

    protected void regTypeOfBool(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfBool(), "type_of_bool"); }
    protected abstract ConditionValue xgetCValueTypeOfBool();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_bit: {bit(1)}
     * @param typeOfBit The value of typeOfBit as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfBit_Equal(Boolean typeOfBit) {
        regTypeOfBit(CK_EQ, typeOfBit);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * type_of_bit: {bit(1)}
     */
    public void setTypeOfBit_IsNull() { regTypeOfBit(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * type_of_bit: {bit(1)}
     */
    public void setTypeOfBit_IsNotNull() { regTypeOfBit(CK_ISNN, DOBJ); }

    protected void regTypeOfBit(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfBit(), "type_of_bit"); }
    protected abstract ConditionValue xgetCValueTypeOfBit();


    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * type_of_bytea: {bytea(2147483647)}
     */
    public void setTypeOfBytea_IsNull() { regTypeOfBytea(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * type_of_bytea: {bytea(2147483647)}
     */
    public void setTypeOfBytea_IsNotNull() { regTypeOfBytea(CK_ISNN, DOBJ); }

    protected void regTypeOfBytea(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfBytea(), "type_of_bytea"); }
    protected abstract ConditionValue xgetCValueTypeOfBytea();


    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * type_of_oid: {oid(10)}
     */
    public void setTypeOfOid_IsNull() { regTypeOfOid(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * type_of_oid: {oid(10)}
     */
    public void setTypeOfOid_IsNotNull() { regTypeOfOid(CK_ISNN, DOBJ); }

    protected void regTypeOfOid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfOid(), "type_of_oid"); }
    protected abstract ConditionValue xgetCValueTypeOfOid();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * type_of_uuid: {uuid(2147483647)}
     * @param typeOfUuid The value of typeOfUuid as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeOfUuid_Equal(java.util.UUID typeOfUuid) {
        regTypeOfUuid(CK_EQ, typeOfUuid);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * type_of_uuid: {uuid(2147483647)}
     * @param typeOfUuidList The collection of typeOfUuid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeOfUuid_InScope(Collection<java.util.UUID> typeOfUuidList) {
        regINS(CK_INS, cTL(typeOfUuidList), xgetCValueTypeOfUuid(), "type_of_uuid");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * type_of_uuid: {uuid(2147483647)}
     */
    public void setTypeOfUuid_IsNull() { regTypeOfUuid(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * type_of_uuid: {uuid(2147483647)}
     */
    public void setTypeOfUuid_IsNotNull() { regTypeOfUuid(CK_ISNN, DOBJ); }

    protected void regTypeOfUuid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfUuid(), "type_of_uuid"); }
    protected abstract ConditionValue xgetCValueTypeOfUuid();


    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * type_of_xml: {xml(2147483647)}
     */
    public void setTypeOfXml_IsNull() { regTypeOfXml(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * type_of_xml: {xml(2147483647)}
     */
    public void setTypeOfXml_IsNotNull() { regTypeOfXml(CK_ISNN, DOBJ); }

    protected void regTypeOfXml(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfXml(), "type_of_xml"); }
    protected abstract ConditionValue xgetCValueTypeOfXml();


    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * type_of_json: {json(2147483647)}
     */
    public void setTypeOfJson_IsNull() { regTypeOfJson(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * type_of_json: {json(2147483647)}
     */
    public void setTypeOfJson_IsNotNull() { regTypeOfJson(CK_ISNN, DOBJ); }

    protected void regTypeOfJson(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeOfJson(), "type_of_json"); }
    protected abstract ConditionValue xgetCValueTypeOfJson();

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
    public HpSLCFunction<VendorCheckCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, VendorCheckCB.class);
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
    public HpSLCFunction<VendorCheckCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, VendorCheckCB.class);
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
    public HpSLCFunction<VendorCheckCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, VendorCheckCB.class);
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
    public HpSLCFunction<VendorCheckCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, VendorCheckCB.class);
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
    public HpSLCFunction<VendorCheckCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, VendorCheckCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;VendorCheckCB&gt;() {
     *     public void query(VendorCheckCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<VendorCheckCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, VendorCheckCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorCheckCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(VendorCheckCQ sq);

    protected VendorCheckCB xcreateScalarConditionCB() {
        VendorCheckCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected VendorCheckCB xcreateScalarConditionPartitionByCB() {
        VendorCheckCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<VendorCheckCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorCheckCB cb = new VendorCheckCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "vendor_check_id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(VendorCheckCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<VendorCheckCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(VendorCheckCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorCheckCB cb = new VendorCheckCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "vendor_check_id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(VendorCheckCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<VendorCheckCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        VendorCheckCB cb = new VendorCheckCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(VendorCheckCQ sq);

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
    protected VendorCheckCB newMyCB() {
        return new VendorCheckCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return VendorCheckCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
