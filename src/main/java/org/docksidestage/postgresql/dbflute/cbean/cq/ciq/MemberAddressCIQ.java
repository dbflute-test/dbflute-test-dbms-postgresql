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
 * The condition-query for in-line of member_address.
 * @author DBFlute(AutoGenerator)
 */
public class MemberAddressCIQ extends AbstractBsMemberAddressCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsMemberAddressCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MemberAddressCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsMemberAddressCQ myCQ) {
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
    protected ConditionValue getCValueMemberAddressId() { return _myCQ.getMemberAddressId(); }
    protected ConditionValue getCValueMemberId() { return _myCQ.getMemberId(); }
    protected ConditionValue getCValueValidBeginDate() { return _myCQ.getValidBeginDate(); }
    protected ConditionValue getCValueValidEndDate() { return _myCQ.getValidEndDate(); }
    protected ConditionValue getCValueAddress() { return _myCQ.getAddress(); }
    protected ConditionValue getCValueRegionId() { return _myCQ.getRegionId(); }
    protected ConditionValue getCValueRegisterDatetime() { return _myCQ.getRegisterDatetime(); }
    protected ConditionValue getCValueRegisterProcess() { return _myCQ.getRegisterProcess(); }
    protected ConditionValue getCValueRegisterUser() { return _myCQ.getRegisterUser(); }
    protected ConditionValue getCValueUpdateDatetime() { return _myCQ.getUpdateDatetime(); }
    protected ConditionValue getCValueUpdateProcess() { return _myCQ.getUpdateProcess(); }
    protected ConditionValue getCValueUpdateUser() { return _myCQ.getUpdateUser(); }
    protected ConditionValue getCValueVersionNo() { return _myCQ.getVersionNo(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(MemberAddressCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(MemberAddressCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(MemberAddressCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(MemberAddressCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return MemberAddressCB.class.getName(); }
    protected String xinCQ() { return MemberAddressCQ.class.getName(); }
}
