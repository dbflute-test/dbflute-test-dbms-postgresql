package org.docksidestage.postgresql.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import org.docksidestage.postgresql.dbflute.exbhv.*;
import org.docksidestage.postgresql.dbflute.exentity.*;
import org.docksidestage.postgresql.dbflute.cbean.*;

/**
 * The referrer loader of (会員)member as TABLE. <br />
 * <pre>
 * [primary key]
 *     member_id
 *
 * [column]
 *     member_id, member_name, member_account, member_status_code, formalized_datetime, birthdate, register_datetime, register_user, register_process, update_datetime, update_user, update_process, version_no
 *
 * [sequence]
 *     member_member_id_seq
 *
 * [identity]
 *     
 *
 * [version-no]
 *     version_no
 *
 * [foreign table]
 *     member_status, MEMBER_ADDRESS(AsValid), MEMBER_LOGIN(AsLatest), member_security(AsOne), member_service(AsOne), member_withdrawal(AsOne)
 *
 * [referrer table]
 *     member_address, member_login, purchase, member_security, member_service, member_withdrawal
 *
 * [foreign property]
 *     memberStatus, memberAddressAsValid, memberLoginAsLatest, memberSecurityAsOne, memberServiceAsOne, memberWithdrawalAsOne
 *
 * [referrer property]
 *     memberAddressList, memberLoginList, purchaseList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMember {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Member> _selectedList;
    protected BehaviorSelector _selector;
    protected MemberBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMember ready(List<Member> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MemberBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MemberBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<MemberAddress> _referrerMemberAddressList;
    public NestedReferrerLoaderGateway<LoaderOfMemberAddress> loadMemberAddressList(ConditionBeanSetupper<MemberAddressCB> refCBLambda) {
        myBhv().loadMemberAddressList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMemberAddressList = refLs);
        return hd -> hd.handle(new LoaderOfMemberAddress().ready(_referrerMemberAddressList, _selector));
    }

    protected List<MemberLogin> _referrerMemberLoginList;
    public NestedReferrerLoaderGateway<LoaderOfMemberLogin> loadMemberLoginList(ConditionBeanSetupper<MemberLoginCB> refCBLambda) {
        myBhv().loadMemberLoginList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMemberLoginList = refLs);
        return hd -> hd.handle(new LoaderOfMemberLogin().ready(_referrerMemberLoginList, _selector));
    }

    protected List<Purchase> _referrerPurchaseList;
    public NestedReferrerLoaderGateway<LoaderOfPurchase> loadPurchaseList(ConditionBeanSetupper<PurchaseCB> refCBLambda) {
        myBhv().loadPurchaseList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerPurchaseList = refLs);
        return hd -> hd.handle(new LoaderOfPurchase().ready(_referrerPurchaseList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMemberStatus _foreignMemberStatusLoader;
    public LoaderOfMemberStatus pulloutMemberStatus() {
        if (_foreignMemberStatusLoader == null)
        { _foreignMemberStatusLoader = new LoaderOfMemberStatus().ready(myBhv().pulloutMemberStatus(_selectedList), _selector); }
        return _foreignMemberStatusLoader;
    }

    protected LoaderOfMemberAddress _foreignMemberAddressAsValidLoader;
    public LoaderOfMemberAddress pulloutMemberAddressAsValid() {
        if (_foreignMemberAddressAsValidLoader == null)
        { _foreignMemberAddressAsValidLoader = new LoaderOfMemberAddress().ready(myBhv().pulloutMemberAddressAsValid(_selectedList), _selector); }
        return _foreignMemberAddressAsValidLoader;
    }

    protected LoaderOfMemberLogin _foreignMemberLoginAsLatestLoader;
    public LoaderOfMemberLogin pulloutMemberLoginAsLatest() {
        if (_foreignMemberLoginAsLatestLoader == null)
        { _foreignMemberLoginAsLatestLoader = new LoaderOfMemberLogin().ready(myBhv().pulloutMemberLoginAsLatest(_selectedList), _selector); }
        return _foreignMemberLoginAsLatestLoader;
    }

    protected LoaderOfMemberSecurity _foreignMemberSecurityAsOneLoader;
    public LoaderOfMemberSecurity pulloutMemberSecurityAsOne() {
        if (_foreignMemberSecurityAsOneLoader == null)
        { _foreignMemberSecurityAsOneLoader = new LoaderOfMemberSecurity().ready(myBhv().pulloutMemberSecurityAsOne(_selectedList), _selector); }
        return _foreignMemberSecurityAsOneLoader;
    }

    protected LoaderOfMemberService _foreignMemberServiceAsOneLoader;
    public LoaderOfMemberService pulloutMemberServiceAsOne() {
        if (_foreignMemberServiceAsOneLoader == null)
        { _foreignMemberServiceAsOneLoader = new LoaderOfMemberService().ready(myBhv().pulloutMemberServiceAsOne(_selectedList), _selector); }
        return _foreignMemberServiceAsOneLoader;
    }

    protected LoaderOfMemberWithdrawal _foreignMemberWithdrawalAsOneLoader;
    public LoaderOfMemberWithdrawal pulloutMemberWithdrawalAsOne() {
        if (_foreignMemberWithdrawalAsOneLoader == null)
        { _foreignMemberWithdrawalAsOneLoader = new LoaderOfMemberWithdrawal().ready(myBhv().pulloutMemberWithdrawalAsOne(_selectedList), _selector); }
        return _foreignMemberWithdrawalAsOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Member> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
