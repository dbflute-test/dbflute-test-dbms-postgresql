package org.docksidestage.postgresql.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.docksidestage.postgresql.dbflute.exbhv.*;
import org.docksidestage.postgresql.dbflute.exentity.*;

/**
 * The referrer loader of (会員住所情報)member_address as TABLE. <br>
 * <pre>
 * [primary key]
 *     member_address_id
 *
 * [column]
 *     member_address_id, member_id, valid_begin_date, valid_end_date, address, region_id, register_datetime, register_process, register_user, update_datetime, update_process, update_user, version_no
 *
 * [sequence]
 *     member_address_member_address_id_seq
 *
 * [identity]
 *     
 *
 * [version-no]
 *     version_no
 *
 * [foreign table]
 *     member, region
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     member, region
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMemberAddress {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MemberAddress> _selectedList;
    protected BehaviorSelector _selector;
    protected MemberAddressBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMemberAddress ready(List<MemberAddress> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MemberAddressBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MemberAddressBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMember _foreignMemberLoader;
    public LoaderOfMember pulloutMember() {
        if (_foreignMemberLoader == null)
        { _foreignMemberLoader = new LoaderOfMember().ready(myBhv().pulloutMember(_selectedList), _selector); }
        return _foreignMemberLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MemberAddress> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
