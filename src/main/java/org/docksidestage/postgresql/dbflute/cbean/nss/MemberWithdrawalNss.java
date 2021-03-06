package org.docksidestage.postgresql.dbflute.cbean.nss;

import org.docksidestage.postgresql.dbflute.cbean.cq.MemberWithdrawalCQ;

/**
 * The nest select set-upper of member_withdrawal.
 * @author DBFlute(AutoGenerator)
 */
public class MemberWithdrawalNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MemberWithdrawalCQ _query;
    public MemberWithdrawalNss(MemberWithdrawalCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * (会員)member by my member_id, named 'member'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberNss withMember() {
        _query.xdoNss(() -> _query.queryMember());
        return new MemberNss(_query.queryMember());
    }
    /**
     * With nested relation columns to select clause. <br>
     * (退会理由)withdrawal_reason by my withdrawal_reason_code, named 'withdrawalReason'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public WithdrawalReasonNss withWithdrawalReason() {
        _query.xdoNss(() -> _query.queryWithdrawalReason());
        return new WithdrawalReasonNss(_query.queryWithdrawalReason());
    }
}
