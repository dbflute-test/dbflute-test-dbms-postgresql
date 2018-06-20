package org.docksidestage.postgresql.dbflute.cbean.cq.ciq;

import java.util.Map;
import org.dbflute.cbean.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.ConditionOption;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import org.docksidestage.postgresql.dbflute.cbean.*;
import org.docksidestage.postgresql.dbflute.cbean.cq.bs.*;
import org.docksidestage.postgresql.dbflute.cbean.cq.*;

/**
 * The condition-query for in-line of vendor_check.
 * @author DBFlute(AutoGenerator)
 */
public class VendorCheckCIQ extends AbstractBsVendorCheckCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsVendorCheckCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public VendorCheckCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsVendorCheckCQ myCQ) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
        _myCQ = myCQ;
        _foreignPropertyName = _myCQ.xgetForeignPropertyName(); // accept foreign property name
        _relationPath = _myCQ.xgetRelationPath(); // accept relation path
        _inline = true;
    }

    // ===================================================================================
    //                                                             Override about Register
    //                                                             =======================
    protected void reflectRelationOnUnionQuery(ConditionQuery bq, ConditionQuery uq)
    { throw new IllegalConditionBeanOperationException("InlineView cannot use Union: " + bq + " : " + uq); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col)
    { regIQ(k, v, cv, col); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col, ConditionOption op)
    { regIQ(k, v, cv, col, op); }

    @Override
    protected void registerWhereClause(String wc)
    { registerInlineWhereClause(wc); }

    @Override
    protected boolean isInScopeRelationSuppressLocalAliasName() {
        if (_onClause) { throw new IllegalConditionBeanOperationException("InScopeRelation on OnClause is unsupported."); }
        return true;
    }

    // ===================================================================================
    //                                                                Override about Query
    //                                                                ====================
    protected ConditionValue xgetCValueVendorCheckId() { return _myCQ.xdfgetVendorCheckId(); }
    protected ConditionValue xgetCValueTypeOfChar() { return _myCQ.xdfgetTypeOfChar(); }
    protected ConditionValue xgetCValueTypeOfVarchar() { return _myCQ.xdfgetTypeOfVarchar(); }
    protected ConditionValue xgetCValueTypeOfVcArray() { return _myCQ.xdfgetTypeOfVcArray(); }
    protected ConditionValue xgetCValueTypeOfText() { return _myCQ.xdfgetTypeOfText(); }
    protected ConditionValue xgetCValueTypeOfNumericInteger() { return _myCQ.xdfgetTypeOfNumericInteger(); }
    protected ConditionValue xgetCValueTypeOfNumericBigint() { return _myCQ.xdfgetTypeOfNumericBigint(); }
    protected ConditionValue xgetCValueTypeOfNumericDecimal() { return _myCQ.xdfgetTypeOfNumericDecimal(); }
    protected ConditionValue xgetCValueTypeOfDecimal() { return _myCQ.xdfgetTypeOfDecimal(); }
    protected ConditionValue xgetCValueTypeOfInt() { return _myCQ.xdfgetTypeOfInt(); }
    protected ConditionValue xgetCValueTypeOfIntArray() { return _myCQ.xdfgetTypeOfIntArray(); }
    protected ConditionValue xgetCValueTypeOfInt4() { return _myCQ.xdfgetTypeOfInt4(); }
    protected ConditionValue xgetCValueTypeOfInt4Array() { return _myCQ.xdfgetTypeOfInt4Array(); }
    protected ConditionValue xgetCValueTypeOfInt8() { return _myCQ.xdfgetTypeOfInt8(); }
    protected ConditionValue xgetCValueTypeOfInt8Array() { return _myCQ.xdfgetTypeOfInt8Array(); }
    protected ConditionValue xgetCValueTypeOfBigint() { return _myCQ.xdfgetTypeOfBigint(); }
    protected ConditionValue xgetCValueTypeOfReal() { return _myCQ.xdfgetTypeOfReal(); }
    protected ConditionValue xgetCValueTypeOfFloat() { return _myCQ.xdfgetTypeOfFloat(); }
    protected ConditionValue xgetCValueTypeOfMoney() { return _myCQ.xdfgetTypeOfMoney(); }
    protected ConditionValue xgetCValueTypeOfDate() { return _myCQ.xdfgetTypeOfDate(); }
    protected ConditionValue xgetCValueTypeOfTimestamp() { return _myCQ.xdfgetTypeOfTimestamp(); }
    protected ConditionValue xgetCValueTypeOfTime() { return _myCQ.xdfgetTypeOfTime(); }
    protected ConditionValue xgetCValueTypeOfTimetz() { return _myCQ.xdfgetTypeOfTimetz(); }
    protected ConditionValue xgetCValueTypeOfInterval() { return _myCQ.xdfgetTypeOfInterval(); }
    protected ConditionValue xgetCValueTypeOfBool() { return _myCQ.xdfgetTypeOfBool(); }
    protected ConditionValue xgetCValueTypeOfBit() { return _myCQ.xdfgetTypeOfBit(); }
    protected ConditionValue xgetCValueTypeOfBytea() { return _myCQ.xdfgetTypeOfBytea(); }
    protected ConditionValue xgetCValueTypeOfOid() { return _myCQ.xdfgetTypeOfOid(); }
    protected ConditionValue xgetCValueTypeOfUuid() { return _myCQ.xdfgetTypeOfUuid(); }
    protected ConditionValue xgetCValueTypeOfXml() { return _myCQ.xdfgetTypeOfXml(); }
    protected ConditionValue xgetCValueTypeOfJson() { return _myCQ.xdfgetTypeOfJson(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(VendorCheckCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(VendorCheckCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(VendorCheckCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(VendorCheckCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return VendorCheckCB.class.getName(); }
    protected String xinCQ() { return VendorCheckCQ.class.getName(); }
}
