package org.docksidestage.postgresql.dbflute.vendor;

import org.dbflute.cbean.result.ListResultBean;
import org.docksidestage.postgresql.dbflute.cbean.Vendor$DollarCB;
import org.docksidestage.postgresql.dbflute.cbean.Vendor_non_compilableCB;
import org.docksidestage.postgresql.dbflute.exbhv.Vendor$DollarBhv;
import org.docksidestage.postgresql.dbflute.exbhv.VendorCheckBhv;
import org.docksidestage.postgresql.dbflute.exbhv.Vendor_non_compilableBhv;
import org.docksidestage.postgresql.dbflute.exbhv.pmbean.VendorUnsupportedAliasPmb;
import org.docksidestage.postgresql.dbflute.exentity.Vendor$Dollar;
import org.docksidestage.postgresql.dbflute.exentity.VendorCheck;
import org.docksidestage.postgresql.dbflute.exentity.Vendor_non_compilable;
import org.docksidestage.postgresql.dbflute.exentity.customize.VendorUnsupportedAlias;
import org.docksidestage.postgresql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.7.2 (2010/06/15 Tuesday)
 */
public class VendorTrickyNamingTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private VendorCheckBhv vendorCheckBhv;
    private Vendor$DollarBhv vendorDollarBhv; // a component name does not contain a dollar mark
    private Vendor_non_compilableBhv vendor_non_compilableBhv;

    // ===================================================================================
    //                                                                              Dollar
    //                                                                              ======
    public void test_Dollar_insert_select() throws Exception {
        // ## Arrange ##
        Vendor$Dollar dollar = new Vendor$Dollar();
        dollar.setVendor$DollarId(99999);
        dollar.setVendor$DollarName("Pixy");
        vendorDollarBhv.insert(dollar);
        Vendor$DollarCB cb = new Vendor$DollarCB();
        cb.query().setVendor$DollarId_Equal(dollar.getVendor$DollarId());

        // ## Act ##
        Vendor$Dollar actual = vendorDollarBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        assertNotNull(actual);
        assertEquals("Pixy", actual.getVendor$DollarName());
    }

    // ===================================================================================
    //                                                                       NonCompilable
    //                                                                       =============
    public void test_NonCompilable_insert_select_update_delete() {
        // ## Arrange ##
        registerNonCompilableData(); // test insert
        Vendor_non_compilableCB cb = new Vendor_non_compilableCB();
        cb.setupSelect_Vendor_non_compilableByParent_idSelf();
        cb.query().setNon_compilable_id_Equal(88888);

        // ## Act ##
        Vendor_non_compilable actual = vendor_non_compilableBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        assertEquals("Genius", actual.getNon_compilable_name());
        assertNotNull(actual.getVendor_non_compilableByParent_idSelf());
        assertEquals("Pixy", actual.getVendor_non_compilableByParent_idSelf().get().getNon_compilable_name());

        {
            // ## Act ##
            Vendor_non_compilable noncomp = new Vendor_non_compilable();
            noncomp.setNon_compilable_id(88888);
            noncomp.setNon_compilable_name("Foo");
            vendor_non_compilableBhv.update(noncomp);

            // ## Assert ##
            Vendor_non_compilable updated = vendor_non_compilableBhv.selectEntityWithDeletedCheck(cb);
            assertEquals("Foo", updated.getNon_compilable_name());

            // ## Act ##
            vendor_non_compilableBhv.delete(noncomp);

            // ## Assert ##
            assertFalse(vendor_non_compilableBhv.selectEntity(cb).isPresent());
        }
    }

    public void test_NonCompilable_specifyColumn() {
        // ## Arrange ##
        registerNonCompilableData(); // test insert
        Vendor_non_compilableCB cb = new Vendor_non_compilableCB();
        cb.specify().columnNon_compilable_name();

        // ## Act ##
        ListResultBean<Vendor_non_compilable> noncompList = vendor_non_compilableBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, noncompList.size());
        for (Vendor_non_compilable noncomp : noncompList) {
            assertNotNull(noncomp.getNon_compilable_name());
            assertNonSpecifiedAccess(() -> noncomp.getParent_id());
        }
    }

    protected void registerNonCompilableData() {
        {
            Vendor_non_compilable noncomp = new Vendor_non_compilable();
            noncomp.setNon_compilable_id(99999);
            noncomp.setNon_compilable_name("Pixy");
            vendor_non_compilableBhv.insert(noncomp);
        }
        {
            Vendor_non_compilable noncomp = new Vendor_non_compilable();
            noncomp.setNon_compilable_id(88888);
            noncomp.setNon_compilable_name("Genius");
            noncomp.setParent_id(99999);
            vendor_non_compilableBhv.insert(noncomp);
        }
    }

    public void test_UnsupportedAlias_select() {
        // ## Arrange ##
        VendorCheck vendorCheck = new VendorCheck();
        vendorCheck.setVendorCheckId(99999L);
        vendorCheck.setTypeOfVarchar("Pixy");
        vendorCheck.setTypeOfInt4(12345678);
        vendorCheckBhv.insert(vendorCheck);
        String path = VendorCheckBhv.PATH_whitebox_vendorcheck_selectVendorUnsupportedAlias;
        VendorUnsupportedAliasPmb pmb = new VendorUnsupportedAliasPmb();
        pmb.setVendorCheckId(vendorCheck.getVendorCheckId());
        Class<VendorUnsupportedAlias> entityType = VendorUnsupportedAlias.class;

        // ## Act ##
        VendorUnsupportedAlias actual = vendorCheckBhv.outsideSql().traditionalStyle().selectEntity(path, pmb, entityType).get();

        // ## Assert ##
        log(actual);
        assertEquals("Pixy", actual.getHyphen_exists());
        assertEquals(Integer.valueOf(12345678), actual.getSpace_exists());
    }
}
