package org.docksidestage.postgresql.dbflute.cbean.nss;

import org.docksidestage.postgresql.dbflute.cbean.cq.MemberAddressCQ;

/**
 * The nest select set-upper of member_address.
 * @author DBFlute(AutoGenerator)
 */
public class MemberAddressNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MemberAddressCQ _query;
    public MemberAddressNss(MemberAddressCQ query) { _query = query; }
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
     * (地域)region by my region_id, named 'region'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public RegionNss withRegion() {
        _query.xdoNss(() -> _query.queryRegion());
        return new RegionNss(_query.queryRegion());
    }
}
