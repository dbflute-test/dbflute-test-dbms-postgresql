package org.docksidestage.postgresql.dbflute.cbean.nss;

import org.docksidestage.postgresql.dbflute.cbean.cq.WhiteCompoundPkRefCQ;

/**
 * The nest select set-upper of white_compound_pk_ref.
 * @author DBFlute(AutoGenerator)
 */
public class WhiteCompoundPkRefNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteCompoundPkRefCQ _query;
    public WhiteCompoundPkRefNss(WhiteCompoundPkRefCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * white_compound_pk by my ref_first_id, ref_second_id, named 'whiteCompoundPk'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public WhiteCompoundPkNss withWhiteCompoundPk() {
        _query.xdoNss(() -> _query.queryWhiteCompoundPk());
        return new WhiteCompoundPkNss(_query.queryWhiteCompoundPk());
    }
}
