package org.docksidestage.postgresql.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import org.docksidestage.postgresql.dbflute.exbhv.*;
import org.docksidestage.postgresql.dbflute.exentity.*;
import org.docksidestage.postgresql.dbflute.cbean.*;

/**
 * The referrer loader of (地域)region as TABLE. <br />
 * <pre>
 * [primary key]
 *     region_id
 *
 * [column]
 *     region_id, region_name
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
 *     member_address
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     memberAddressList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfRegion {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Region> _selectedList;
    protected BehaviorSelector _selector;
    protected RegionBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfRegion ready(List<Region> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected RegionBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(RegionBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<MemberAddress> _referrerMemberAddressList;
    public NestedReferrerLoaderGateway<LoaderOfMemberAddress> loadMemberAddressList(ConditionBeanSetupper<MemberAddressCB> refCBLambda) {
        myBhv().loadMemberAddressList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMemberAddressList = refLs);
        return hd -> hd.handle(new LoaderOfMemberAddress().ready(_referrerMemberAddressList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Region> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
