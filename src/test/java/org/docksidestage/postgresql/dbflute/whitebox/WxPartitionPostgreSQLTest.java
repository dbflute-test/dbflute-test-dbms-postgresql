package org.docksidestage.postgresql.dbflute.whitebox;

import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.exception.SQLFailureException;
import org.docksidestage.postgresql.dbflute.cbean.VendorPartManHighCB;
import org.docksidestage.postgresql.dbflute.exbhv.VendorPartManBhv;
import org.docksidestage.postgresql.dbflute.exbhv.VendorPartManHighBhv;
import org.docksidestage.postgresql.dbflute.exentity.VendorPartMan;
import org.docksidestage.postgresql.dbflute.exentity.VendorPartManHigh;
import org.docksidestage.postgresql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.0.5K (2014/07/30 Wednesday)
 */
public class WxPartitionPostgreSQLTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private VendorPartManBhv vendorPartManBhv;
    private VendorPartManHighBhv vendorPartManHighBhv;

    // ===================================================================================
    //                                                                              Insert
    //                                                                              ======
    public void test_insert_sync() throws Exception {
        // ## Arrange ##
        assertEquals(0, vendorPartManHighBhv.selectCount(new VendorPartManHighCB()));
        VendorPartMan partMan = new VendorPartMan();
        partMan.setPartManId(1);
        partMan.setPartManName("sea");
        partMan.setPartManPoint(71);
        partMan.setPartManDate(currentLocalDate());

        // ## Act ##
        vendorPartManBhv.insert(partMan);

        // ## Assert ##
        VendorPartManHighCB highCB = new VendorPartManHighCB();
        ListResultBean<VendorPartManHigh> highList = vendorPartManHighBhv.selectList(highCB);
        assertHasOnlyOneElement(highList);
        for (VendorPartManHigh high : highList) {
            log(high);
            assertEquals("sea", high.getPartManName());
        }
    }

    public void test_insert_violate_constraint() throws Exception {
        // ## Arrange ##
        assertEquals(0, vendorPartManHighBhv.selectCount(new VendorPartManHighCB()));
        VendorPartMan partMan = new VendorPartMan();
        partMan.setPartManId(1);
        partMan.setPartManName("sea");
        partMan.setPartManPoint(40);
        partMan.setPartManDate(currentLocalDate());

        // ## Act ##
        try {
            vendorPartManBhv.insert(partMan);
            // ## Assert ##
            fail();
        } catch (SQLFailureException e) {
            String msg = e.getMessage();
            log(msg);
            assertTrue(msg.contains("violates check constraint"));
        }
    }

    // ===================================================================================
    //                                                                              Update
    //                                                                              ======
    public void test_update_sync() throws Exception {
        // ## Arrange ##
        assertEquals(0, vendorPartManHighBhv.selectCount(new VendorPartManHighCB()));
        VendorPartMan partMan = new VendorPartMan();
        partMan.setPartManId(1);
        partMan.setPartManName("sea");
        partMan.setPartManPoint(71);
        partMan.setPartManDate(currentLocalDate());
        vendorPartManBhv.insert(partMan);
        partMan.setPartManName("land");

        // ## Act ##
        vendorPartManBhv.update(partMan);

        // ## Assert ##
        VendorPartManHighCB highCB = new VendorPartManHighCB();
        ListResultBean<VendorPartManHigh> highList = vendorPartManHighBhv.selectList(highCB);
        assertHasOnlyOneElement(highList);
        for (VendorPartManHigh high : highList) {
            log(high);
            assertEquals("land", high.getPartManName());
        }
    }
}
