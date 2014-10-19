package org.docksidestage.postgresql.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import org.docksidestage.postgresql.dbflute.exbhv.*;
import org.docksidestage.postgresql.dbflute.exentity.*;
import org.docksidestage.postgresql.dbflute.cbean.*;

/**
 * The referrer loader of (退会理由)withdrawal_reason as TABLE. <br />
 * <pre>
 * [primary key]
 *     withdrawal_reason_code
 *
 * [column]
 *     withdrawal_reason_code, withdrawal_reason_text, display_order
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     member_withdrawal
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     memberWithdrawalList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWithdrawalReason {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WithdrawalReason> _selectedList;
    protected BehaviorSelector _selector;
    protected WithdrawalReasonBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWithdrawalReason ready(List<WithdrawalReason> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WithdrawalReasonBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WithdrawalReasonBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<MemberWithdrawal> _referrerMemberWithdrawalList;
    public NestedReferrerLoaderGateway<LoaderOfMemberWithdrawal> loadMemberWithdrawalList(ConditionBeanSetupper<MemberWithdrawalCB> refCBLambda) {
        myBhv().loadMemberWithdrawalList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMemberWithdrawalList = refLs);
        return hd -> hd.handle(new LoaderOfMemberWithdrawal().ready(_referrerMemberWithdrawalList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WithdrawalReason> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
