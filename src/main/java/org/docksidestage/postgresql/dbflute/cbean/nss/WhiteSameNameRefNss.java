package org.docksidestage.postgresql.dbflute.cbean.nss;

import org.docksidestage.postgresql.dbflute.cbean.cq.WhiteSameNameRefCQ;

/**
 * The nest select set-upper of white_same_name_ref.
 * @author DBFlute(AutoGenerator)
 */
public class WhiteSameNameRefNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final WhiteSameNameRefCQ _query;
    public WhiteSameNameRefNss(WhiteSameNameRefCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * white_same_name by my same_name_id, named 'whiteSameName'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public WhiteSameNameNss withWhiteSameName() {
        _query.xdoNss(() -> _query.queryWhiteSameName());
        return new WhiteSameNameNss(_query.queryWhiteSameName());
    }
}
