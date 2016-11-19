package org.docksidestage.postgresql.dbflute.whitebox.outsidesql;

import org.dbflute.cbean.result.ListResultBean;
import org.docksidestage.postgresql.dbflute.exbhv.VendorCheckBhv;
import org.docksidestage.postgresql.dbflute.exbhv.pmbean.VendorWithWithPmb;
import org.docksidestage.postgresql.dbflute.exentity.customize.VendorWithWith;
import org.docksidestage.postgresql.unit.UnitContainerTestCase;

/**
 * @author jflute
 */
public class WxOutsideSqlWithWithTest extends UnitContainerTestCase {

    private VendorCheckBhv vendorCheckBhv;

    public void test_generated_expectsCompileOK() throws Exception {
        VendorWithWithPmb pmb = new VendorWithWithPmb();
        ListResultBean<VendorWithWith> withWithList = vendorCheckBhv.outsideSql().selectList(pmb);
        for (VendorWithWith withWith : withWithList) {
            log(withWith.getVendorCheckId(), withWith.getTypeOfVarchar(), withWith.getTypeOfNumericInteger());
        }
    }

    // wall
    // wall
    // wall
    // wall
    // wall
    // wall
    // wall
    // wall
    // wall
}
