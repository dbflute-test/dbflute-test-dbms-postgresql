package org.docksidestage.postgresql.dbflute.cbean.nss;

import org.docksidestage.postgresql.dbflute.cbean.cq.MemberLoginCQ;

/**
 * The nest select set-upper of member_login.
 * @author DBFlute(AutoGenerator)
 */
public class MemberLoginNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MemberLoginCQ _query;
    public MemberLoginNss(MemberLoginCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * (会員ステータス)member_status by my login_member_status_code, named 'memberStatus'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberStatusNss withMemberStatus() {
        _query.xdoNss(() -> _query.queryMemberStatus());
        return new MemberStatusNss(_query.queryMemberStatus());
    }
    /**
     * With nested relation columns to select clause. <br />
     * (会員)member by my member_id, named 'member'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberNss withMember() {
        _query.xdoNss(() -> _query.queryMember());
        return new MemberNss(_query.queryMember());
    }
}
