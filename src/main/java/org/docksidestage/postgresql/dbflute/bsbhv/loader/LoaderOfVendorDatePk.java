package org.docksidestage.postgresql.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import org.docksidestage.postgresql.dbflute.exbhv.*;
import org.docksidestage.postgresql.dbflute.exentity.*;
import org.docksidestage.postgresql.dbflute.cbean.*;

/**
 * The referrer loader of vendor_date_pk as TABLE. <br />
 * <pre>
 * [primary key]
 *     foo_date
 *
 * [column]
 *     foo_date, foo_name
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
 *     vendor_date_fk
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     vendorDateFkList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfVendorDatePk {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<VendorDatePk> _selectedList;
    protected BehaviorSelector _selector;
    protected VendorDatePkBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfVendorDatePk ready(List<VendorDatePk> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected VendorDatePkBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(VendorDatePkBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<VendorDateFk> _referrerVendorDateFkList;
    public NestedReferrerLoaderGateway<LoaderOfVendorDateFk> loadVendorDateFkList(ConditionBeanSetupper<VendorDateFkCB> refCBLambda) {
        myBhv().loadVendorDateFkList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerVendorDateFkList = refLs);
        return hd -> hd.handle(new LoaderOfVendorDateFk().ready(_referrerVendorDateFkList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<VendorDatePk> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
