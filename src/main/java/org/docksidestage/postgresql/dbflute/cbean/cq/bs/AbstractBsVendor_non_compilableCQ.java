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
 * The abstract condition-query of VENDOR-NON COMPILABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsVendor_non_compilableCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsVendor_non_compilableCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "VENDOR-NON COMPILABLE";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NON-COMPILABLE ID: {PK, NotNull, int4(10)}
     * @param non_compilable_id The value of non_compilable_id as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNon_compilable_id_Equal(Integer non_compilable_id) {
        doSetNon_compilable_id_Equal(non_compilable_id);
    }

    protected void doSetNon_compilable_id_Equal(Integer non_compilable_id) {
        regNon_compilable_id(CK_EQ, non_compilable_id);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NON-COMPILABLE ID: {PK, NotNull, int4(10)}
     * @param non_compilable_id The value of non_compilable_id as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNon_compilable_id_GreaterThan(Integer non_compilable_id) {
        regNon_compilable_id(CK_GT, non_compilable_id);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NON-COMPILABLE ID: {PK, NotNull, int4(10)}
     * @param non_compilable_id The value of non_compilable_id as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNon_compilable_id_LessThan(Integer non_compilable_id) {
        regNon_compilable_id(CK_LT, non_compilable_id);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NON-COMPILABLE ID: {PK, NotNull, int4(10)}
     * @param non_compilable_id The value of non_compilable_id as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNon_compilable_id_GreaterEqual(Integer non_compilable_id) {
        regNon_compilable_id(CK_GE, non_compilable_id);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NON-COMPILABLE ID: {PK, NotNull, int4(10)}
     * @param non_compilable_id The value of non_compilable_id as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNon_compilable_id_LessEqual(Integer non_compilable_id) {
        regNon_compilable_id(CK_LE, non_compilable_id);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NON-COMPILABLE ID: {PK, NotNull, int4(10)}
     * @param minNumber The min number of non_compilable_id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of non_compilable_id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setNon_compilable_id_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setNon_compilable_id_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NON-COMPILABLE ID: {PK, NotNull, int4(10)}
     * @param minNumber The min number of non_compilable_id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of non_compilable_id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setNon_compilable_id_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNon_compilable_id(), "NON-COMPILABLE ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NON-COMPILABLE ID: {PK, NotNull, int4(10)}
     * @param non_compilable_idList The collection of non_compilable_id as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNon_compilable_id_InScope(Collection<Integer> non_compilable_idList) {
        doSetNon_compilable_id_InScope(non_compilable_idList);
    }

    protected void doSetNon_compilable_id_InScope(Collection<Integer> non_compilable_idList) {
        regINS(CK_INS, cTL(non_compilable_idList), xgetCValueNon_compilable_id(), "NON-COMPILABLE ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NON-COMPILABLE ID: {PK, NotNull, int4(10)}
     * @param non_compilable_idList The collection of non_compilable_id as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNon_compilable_id_NotInScope(Collection<Integer> non_compilable_idList) {
        doSetNon_compilable_id_NotInScope(non_compilable_idList);
    }

    protected void doSetNon_compilable_id_NotInScope(Collection<Integer> non_compilable_idList) {
        regINS(CK_NINS, cTL(non_compilable_idList), xgetCValueNon_compilable_id(), "NON-COMPILABLE ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select Next_ParentID from VENDOR-NON COMPILABLE where ...)} <br>
     * VENDOR-NON COMPILABLE by Next_ParentID, named 'vendor_non_compilableByNextParentidSelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsVendor_non_compilableByNextParentidSelf</span>(entityCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     entityCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of Vendor_non_compilableByNextParentidSelfList for 'exists'. (NotNull)
     */
    public void existsVendor_non_compilableByNextParentidSelf(SubQuery<Vendor_non_compilableCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        Vendor_non_compilableCB cb = new Vendor_non_compilableCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepNon_compilable_id_ExistsReferrer_Vendor_non_compilableByNextParentidSelfList(cb.query());
        registerExistsReferrer(cb.query(), "NON-COMPILABLE ID", "Next_ParentID", pp, "vendor_non_compilableByNextParentidSelfList");
    }
    public abstract String keepNon_compilable_id_ExistsReferrer_Vendor_non_compilableByNextParentidSelfList(Vendor_non_compilableCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PARENT-ID from VENDOR-NON COMPILABLE where ...)} <br>
     * VENDOR-NON COMPILABLE by PARENT-ID, named 'vendor_non_compilableByParent_idSelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsVendor_non_compilableByParent_idSelf</span>(entityCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     entityCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of Vendor_non_compilableByParent_idSelfList for 'exists'. (NotNull)
     */
    public void existsVendor_non_compilableByParent_idSelf(SubQuery<Vendor_non_compilableCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        Vendor_non_compilableCB cb = new Vendor_non_compilableCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepNon_compilable_id_ExistsReferrer_Vendor_non_compilableByParent_idSelfList(cb.query());
        registerExistsReferrer(cb.query(), "NON-COMPILABLE ID", "PARENT-ID", pp, "vendor_non_compilableByParent_idSelfList");
    }
    public abstract String keepNon_compilable_id_ExistsReferrer_Vendor_non_compilableByParent_idSelfList(Vendor_non_compilableCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select Next_ParentID from VENDOR-NON COMPILABLE where ...)} <br>
     * VENDOR-NON COMPILABLE by Next_ParentID, named 'vendor_non_compilableByNextParentidSelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsVendor_non_compilableByNextParentidSelf</span>(entityCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     entityCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of Non_compilable_id_NotExistsReferrer_Vendor_non_compilableByNextParentidSelfList for 'not exists'. (NotNull)
     */
    public void notExistsVendor_non_compilableByNextParentidSelf(SubQuery<Vendor_non_compilableCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        Vendor_non_compilableCB cb = new Vendor_non_compilableCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepNon_compilable_id_NotExistsReferrer_Vendor_non_compilableByNextParentidSelfList(cb.query());
        registerNotExistsReferrer(cb.query(), "NON-COMPILABLE ID", "Next_ParentID", pp, "vendor_non_compilableByNextParentidSelfList");
    }
    public abstract String keepNon_compilable_id_NotExistsReferrer_Vendor_non_compilableByNextParentidSelfList(Vendor_non_compilableCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PARENT-ID from VENDOR-NON COMPILABLE where ...)} <br>
     * VENDOR-NON COMPILABLE by PARENT-ID, named 'vendor_non_compilableByParent_idSelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsVendor_non_compilableByParent_idSelf</span>(entityCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     entityCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of Non_compilable_id_NotExistsReferrer_Vendor_non_compilableByParent_idSelfList for 'not exists'. (NotNull)
     */
    public void notExistsVendor_non_compilableByParent_idSelf(SubQuery<Vendor_non_compilableCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        Vendor_non_compilableCB cb = new Vendor_non_compilableCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepNon_compilable_id_NotExistsReferrer_Vendor_non_compilableByParent_idSelfList(cb.query());
        registerNotExistsReferrer(cb.query(), "NON-COMPILABLE ID", "PARENT-ID", pp, "vendor_non_compilableByParent_idSelfList");
    }
    public abstract String keepNon_compilable_id_NotExistsReferrer_Vendor_non_compilableByParent_idSelfList(Vendor_non_compilableCQ sq);

    public void xsderiveVendor_non_compilableByNextParentidSelfList(String fn, SubQuery<Vendor_non_compilableCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        Vendor_non_compilableCB cb = new Vendor_non_compilableCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepNon_compilable_id_SpecifyDerivedReferrer_Vendor_non_compilableByNextParentidSelfList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "NON-COMPILABLE ID", "Next_ParentID", pp, "vendor_non_compilableByNextParentidSelfList", al, op);
    }
    public abstract String keepNon_compilable_id_SpecifyDerivedReferrer_Vendor_non_compilableByNextParentidSelfList(Vendor_non_compilableCQ sq);

    public void xsderiveVendor_non_compilableByParent_idSelfList(String fn, SubQuery<Vendor_non_compilableCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        Vendor_non_compilableCB cb = new Vendor_non_compilableCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepNon_compilable_id_SpecifyDerivedReferrer_Vendor_non_compilableByParent_idSelfList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "NON-COMPILABLE ID", "PARENT-ID", pp, "vendor_non_compilableByParent_idSelfList", al, op);
    }
    public abstract String keepNon_compilable_id_SpecifyDerivedReferrer_Vendor_non_compilableByParent_idSelfList(Vendor_non_compilableCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from VENDOR-NON COMPILABLE where ...)} <br>
     * VENDOR-NON COMPILABLE by Next_ParentID, named 'vendor_non_compilableByNextParentidSelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedVendor_non_compilableByNextParentidSelf()</span>.<span style="color: #CC4747">max</span>(entityCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     entityCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     entityCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<Vendor_non_compilableCB> derivedVendor_non_compilableByNextParentidSelf() {
        return xcreateQDRFunctionVendor_non_compilableByNextParentidSelfList();
    }
    protected HpQDRFunction<Vendor_non_compilableCB> xcreateQDRFunctionVendor_non_compilableByNextParentidSelfList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveVendor_non_compilableByNextParentidSelfList(fn, sq, rd, vl, op));
    }
    public void xqderiveVendor_non_compilableByNextParentidSelfList(String fn, SubQuery<Vendor_non_compilableCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        Vendor_non_compilableCB cb = new Vendor_non_compilableCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepNon_compilable_id_QueryDerivedReferrer_Vendor_non_compilableByNextParentidSelfList(cb.query()); String prpp = keepNon_compilable_id_QueryDerivedReferrer_Vendor_non_compilableByNextParentidSelfListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "NON-COMPILABLE ID", "Next_ParentID", sqpp, "vendor_non_compilableByNextParentidSelfList", rd, vl, prpp, op);
    }
    public abstract String keepNon_compilable_id_QueryDerivedReferrer_Vendor_non_compilableByNextParentidSelfList(Vendor_non_compilableCQ sq);
    public abstract String keepNon_compilable_id_QueryDerivedReferrer_Vendor_non_compilableByNextParentidSelfListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from VENDOR-NON COMPILABLE where ...)} <br>
     * VENDOR-NON COMPILABLE by PARENT-ID, named 'vendor_non_compilableByParent_idSelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedVendor_non_compilableByParent_idSelf()</span>.<span style="color: #CC4747">max</span>(entityCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     entityCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     entityCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<Vendor_non_compilableCB> derivedVendor_non_compilableByParent_idSelf() {
        return xcreateQDRFunctionVendor_non_compilableByParent_idSelfList();
    }
    protected HpQDRFunction<Vendor_non_compilableCB> xcreateQDRFunctionVendor_non_compilableByParent_idSelfList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveVendor_non_compilableByParent_idSelfList(fn, sq, rd, vl, op));
    }
    public void xqderiveVendor_non_compilableByParent_idSelfList(String fn, SubQuery<Vendor_non_compilableCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        Vendor_non_compilableCB cb = new Vendor_non_compilableCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepNon_compilable_id_QueryDerivedReferrer_Vendor_non_compilableByParent_idSelfList(cb.query()); String prpp = keepNon_compilable_id_QueryDerivedReferrer_Vendor_non_compilableByParent_idSelfListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "NON-COMPILABLE ID", "PARENT-ID", sqpp, "vendor_non_compilableByParent_idSelfList", rd, vl, prpp, op);
    }
    public abstract String keepNon_compilable_id_QueryDerivedReferrer_Vendor_non_compilableByParent_idSelfList(Vendor_non_compilableCQ sq);
    public abstract String keepNon_compilable_id_QueryDerivedReferrer_Vendor_non_compilableByParent_idSelfListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NON-COMPILABLE ID: {PK, NotNull, int4(10)}
     */
    public void setNon_compilable_id_IsNull() { regNon_compilable_id(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NON-COMPILABLE ID: {PK, NotNull, int4(10)}
     */
    public void setNon_compilable_id_IsNotNull() { regNon_compilable_id(CK_ISNN, DOBJ); }

    protected void regNon_compilable_id(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNon_compilable_id(), "NON-COMPILABLE ID"); }
    protected abstract ConditionValue xgetCValueNon_compilable_id();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NON COMPILABLE-NAME: {varchar(64)}
     * @param non_compilable_name The value of non_compilable_name as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNon_compilable_name_Equal(String non_compilable_name) {
        doSetNon_compilable_name_Equal(fRES(non_compilable_name));
    }

    protected void doSetNon_compilable_name_Equal(String non_compilable_name) {
        regNon_compilable_name(CK_EQ, non_compilable_name);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NON COMPILABLE-NAME: {varchar(64)}
     * @param non_compilable_name The value of non_compilable_name as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNon_compilable_name_NotEqual(String non_compilable_name) {
        doSetNon_compilable_name_NotEqual(fRES(non_compilable_name));
    }

    protected void doSetNon_compilable_name_NotEqual(String non_compilable_name) {
        regNon_compilable_name(CK_NES, non_compilable_name);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NON COMPILABLE-NAME: {varchar(64)}
     * @param non_compilable_nameList The collection of non_compilable_name as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNon_compilable_name_InScope(Collection<String> non_compilable_nameList) {
        doSetNon_compilable_name_InScope(non_compilable_nameList);
    }

    protected void doSetNon_compilable_name_InScope(Collection<String> non_compilable_nameList) {
        regINS(CK_INS, cTL(non_compilable_nameList), xgetCValueNon_compilable_name(), "NON COMPILABLE-NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NON COMPILABLE-NAME: {varchar(64)}
     * @param non_compilable_nameList The collection of non_compilable_name as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNon_compilable_name_NotInScope(Collection<String> non_compilable_nameList) {
        doSetNon_compilable_name_NotInScope(non_compilable_nameList);
    }

    protected void doSetNon_compilable_name_NotInScope(Collection<String> non_compilable_nameList) {
        regINS(CK_NINS, cTL(non_compilable_nameList), xgetCValueNon_compilable_name(), "NON COMPILABLE-NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NON COMPILABLE-NAME: {varchar(64)} <br>
     * <pre>e.g. setNon_compilable_name_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param non_compilable_name The value of non_compilable_name as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setNon_compilable_name_LikeSearch(String non_compilable_name, ConditionOptionCall<LikeSearchOption> opLambda) {
        setNon_compilable_name_LikeSearch(non_compilable_name, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NON COMPILABLE-NAME: {varchar(64)} <br>
     * <pre>e.g. setNon_compilable_name_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param non_compilable_name The value of non_compilable_name as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setNon_compilable_name_LikeSearch(String non_compilable_name, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(non_compilable_name), xgetCValueNon_compilable_name(), "NON COMPILABLE-NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NON COMPILABLE-NAME: {varchar(64)}
     * @param non_compilable_name The value of non_compilable_name as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setNon_compilable_name_NotLikeSearch(String non_compilable_name, ConditionOptionCall<LikeSearchOption> opLambda) {
        setNon_compilable_name_NotLikeSearch(non_compilable_name, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NON COMPILABLE-NAME: {varchar(64)}
     * @param non_compilable_name The value of non_compilable_name as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setNon_compilable_name_NotLikeSearch(String non_compilable_name, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(non_compilable_name), xgetCValueNon_compilable_name(), "NON COMPILABLE-NAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NON COMPILABLE-NAME: {varchar(64)}
     * @param non_compilable_name The value of non_compilable_name as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNon_compilable_name_PrefixSearch(String non_compilable_name) {
        setNon_compilable_name_LikeSearch(non_compilable_name, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NON COMPILABLE-NAME: {varchar(64)}
     */
    public void setNon_compilable_name_IsNull() { regNon_compilable_name(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NON COMPILABLE-NAME: {varchar(64)}
     */
    public void setNon_compilable_name_IsNullOrEmpty() { regNon_compilable_name(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NON COMPILABLE-NAME: {varchar(64)}
     */
    public void setNon_compilable_name_IsNotNull() { regNon_compilable_name(CK_ISNN, DOBJ); }

    protected void regNon_compilable_name(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNon_compilable_name(), "NON COMPILABLE-NAME"); }
    protected abstract ConditionValue xgetCValueNon_compilable_name();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PARENT-ID: {int4(10), FK to VENDOR-NON COMPILABLE}
     * @param parent_id The value of parent_id as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setParent_id_Equal(Integer parent_id) {
        doSetParent_id_Equal(parent_id);
    }

    protected void doSetParent_id_Equal(Integer parent_id) {
        regParent_id(CK_EQ, parent_id);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PARENT-ID: {int4(10), FK to VENDOR-NON COMPILABLE}
     * @param parent_id The value of parent_id as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setParent_id_GreaterThan(Integer parent_id) {
        regParent_id(CK_GT, parent_id);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PARENT-ID: {int4(10), FK to VENDOR-NON COMPILABLE}
     * @param parent_id The value of parent_id as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setParent_id_LessThan(Integer parent_id) {
        regParent_id(CK_LT, parent_id);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PARENT-ID: {int4(10), FK to VENDOR-NON COMPILABLE}
     * @param parent_id The value of parent_id as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setParent_id_GreaterEqual(Integer parent_id) {
        regParent_id(CK_GE, parent_id);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PARENT-ID: {int4(10), FK to VENDOR-NON COMPILABLE}
     * @param parent_id The value of parent_id as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setParent_id_LessEqual(Integer parent_id) {
        regParent_id(CK_LE, parent_id);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PARENT-ID: {int4(10), FK to VENDOR-NON COMPILABLE}
     * @param minNumber The min number of parent_id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of parent_id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setParent_id_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setParent_id_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PARENT-ID: {int4(10), FK to VENDOR-NON COMPILABLE}
     * @param minNumber The min number of parent_id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of parent_id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setParent_id_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueParent_id(), "PARENT-ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PARENT-ID: {int4(10), FK to VENDOR-NON COMPILABLE}
     * @param parent_idList The collection of parent_id as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setParent_id_InScope(Collection<Integer> parent_idList) {
        doSetParent_id_InScope(parent_idList);
    }

    protected void doSetParent_id_InScope(Collection<Integer> parent_idList) {
        regINS(CK_INS, cTL(parent_idList), xgetCValueParent_id(), "PARENT-ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PARENT-ID: {int4(10), FK to VENDOR-NON COMPILABLE}
     * @param parent_idList The collection of parent_id as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setParent_id_NotInScope(Collection<Integer> parent_idList) {
        doSetParent_id_NotInScope(parent_idList);
    }

    protected void doSetParent_id_NotInScope(Collection<Integer> parent_idList) {
        regINS(CK_NINS, cTL(parent_idList), xgetCValueParent_id(), "PARENT-ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PARENT-ID: {int4(10), FK to VENDOR-NON COMPILABLE}
     */
    public void setParent_id_IsNull() { regParent_id(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PARENT-ID: {int4(10), FK to VENDOR-NON COMPILABLE}
     */
    public void setParent_id_IsNotNull() { regParent_id(CK_ISNN, DOBJ); }

    protected void regParent_id(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueParent_id(), "PARENT-ID"); }
    protected abstract ConditionValue xgetCValueParent_id();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * Next_ParentID: {IX, int4(10), FK to VENDOR-NON COMPILABLE}
     * @param nextParentid The value of nextParentid as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNextParentid_Equal(Integer nextParentid) {
        doSetNextParentid_Equal(nextParentid);
    }

    protected void doSetNextParentid_Equal(Integer nextParentid) {
        regNextParentid(CK_EQ, nextParentid);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * Next_ParentID: {IX, int4(10), FK to VENDOR-NON COMPILABLE}
     * @param nextParentid The value of nextParentid as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNextParentid_GreaterThan(Integer nextParentid) {
        regNextParentid(CK_GT, nextParentid);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * Next_ParentID: {IX, int4(10), FK to VENDOR-NON COMPILABLE}
     * @param nextParentid The value of nextParentid as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNextParentid_LessThan(Integer nextParentid) {
        regNextParentid(CK_LT, nextParentid);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * Next_ParentID: {IX, int4(10), FK to VENDOR-NON COMPILABLE}
     * @param nextParentid The value of nextParentid as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNextParentid_GreaterEqual(Integer nextParentid) {
        regNextParentid(CK_GE, nextParentid);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * Next_ParentID: {IX, int4(10), FK to VENDOR-NON COMPILABLE}
     * @param nextParentid The value of nextParentid as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNextParentid_LessEqual(Integer nextParentid) {
        regNextParentid(CK_LE, nextParentid);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * Next_ParentID: {IX, int4(10), FK to VENDOR-NON COMPILABLE}
     * @param minNumber The min number of nextParentid. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of nextParentid. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setNextParentid_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setNextParentid_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * Next_ParentID: {IX, int4(10), FK to VENDOR-NON COMPILABLE}
     * @param minNumber The min number of nextParentid. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of nextParentid. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setNextParentid_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNextParentid(), "Next_ParentID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * Next_ParentID: {IX, int4(10), FK to VENDOR-NON COMPILABLE}
     * @param nextParentidList The collection of nextParentid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNextParentid_InScope(Collection<Integer> nextParentidList) {
        doSetNextParentid_InScope(nextParentidList);
    }

    protected void doSetNextParentid_InScope(Collection<Integer> nextParentidList) {
        regINS(CK_INS, cTL(nextParentidList), xgetCValueNextParentid(), "Next_ParentID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * Next_ParentID: {IX, int4(10), FK to VENDOR-NON COMPILABLE}
     * @param nextParentidList The collection of nextParentid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNextParentid_NotInScope(Collection<Integer> nextParentidList) {
        doSetNextParentid_NotInScope(nextParentidList);
    }

    protected void doSetNextParentid_NotInScope(Collection<Integer> nextParentidList) {
        regINS(CK_NINS, cTL(nextParentidList), xgetCValueNextParentid(), "Next_ParentID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * Next_ParentID: {IX, int4(10), FK to VENDOR-NON COMPILABLE}
     */
    public void setNextParentid_IsNull() { regNextParentid(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * Next_ParentID: {IX, int4(10), FK to VENDOR-NON COMPILABLE}
     */
    public void setNextParentid_IsNotNull() { regNextParentid(CK_ISNN, DOBJ); }

    protected void regNextParentid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNextParentid(), "Next_ParentID"); }
    protected abstract ConditionValue xgetCValueNextParentid();

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
    public HpSLCFunction<Vendor_non_compilableCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, Vendor_non_compilableCB.class);
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
    public HpSLCFunction<Vendor_non_compilableCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, Vendor_non_compilableCB.class);
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
    public HpSLCFunction<Vendor_non_compilableCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, Vendor_non_compilableCB.class);
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
    public HpSLCFunction<Vendor_non_compilableCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, Vendor_non_compilableCB.class);
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
    public HpSLCFunction<Vendor_non_compilableCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, Vendor_non_compilableCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;Vendor_non_compilableCB&gt;() {
     *     public void query(Vendor_non_compilableCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<Vendor_non_compilableCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, Vendor_non_compilableCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        Vendor_non_compilableCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(Vendor_non_compilableCQ sq);

    protected Vendor_non_compilableCB xcreateScalarConditionCB() {
        Vendor_non_compilableCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected Vendor_non_compilableCB xcreateScalarConditionPartitionByCB() {
        Vendor_non_compilableCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<Vendor_non_compilableCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        Vendor_non_compilableCB cb = new Vendor_non_compilableCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "NON-COMPILABLE ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(Vendor_non_compilableCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<Vendor_non_compilableCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(Vendor_non_compilableCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        Vendor_non_compilableCB cb = new Vendor_non_compilableCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "NON-COMPILABLE ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(Vendor_non_compilableCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<Vendor_non_compilableCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        Vendor_non_compilableCB cb = new Vendor_non_compilableCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(Vendor_non_compilableCQ sq);

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
    protected Vendor_non_compilableCB newMyCB() {
        return new Vendor_non_compilableCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return Vendor_non_compilableCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
