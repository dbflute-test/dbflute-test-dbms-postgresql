package org.docksidestage.postgresql.dbflute.topic;

import org.docksidestage.postgresql.dbflute.bsentity.dbmeta.MemberDbm;
import org.docksidestage.postgresql.dbflute.bsentity.dbmeta.NextSchemaProductDbm;
import org.docksidestage.postgresql.dbflute.cbean.NextSchemaProductCB;
import org.docksidestage.postgresql.dbflute.exbhv.NextSchemaProductBhv;
import org.docksidestage.postgresql.dbflute.exentity.NextSchemaProduct;
import org.docksidestage.postgresql.unit.UnitContainerTestCase;

/**
 * @author jflute
 */
public class AdditionalSchemaTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private NextSchemaProductBhv nextSchemaProductBhv;

    // ===================================================================================
    //                                                                               Basic
    //                                                                               =====
    public void test_insert_select() throws Exception {
        // ## Arrange ##
        NextSchemaProduct nextSchemaProduct = new NextSchemaProduct();
        nextSchemaProduct.setProductName("TEST");

        // ## Act ##
        nextSchemaProductBhv.insert(nextSchemaProduct);

        // ## Assert ##
        NextSchemaProductCB cb = new NextSchemaProductCB();
        cb.query().setProductId_Equal(nextSchemaProduct.getProductId());
        cb.query().setProductName_Equal("TEST");
        NextSchemaProduct actual = nextSchemaProductBhv.selectEntityWithDeletedCheck(cb);
        assertEquals("TEST", actual.getProductName());
    }

    // ===================================================================================
    //                                                                           Procedure
    //                                                                           =========
    // /- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // the test for next schema procedure exists ProcedureTest.java 
    // - - - - - - - - - -/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    public void test_DBMeta_tableSqlName_with_schema() throws Exception {
        // ## Arrange ##
        NextSchemaProductDbm dbm = NextSchemaProductDbm.getInstance();

        // ## Act & Assert ##
        log("name=" + dbm.getTableSqlName());
        assertNotNull(dbm.getTableSqlName());
        assertTrue(dbm.getTableSqlName().toString().contains("."));
        assertFalse(MemberDbm.getInstance().getTableSqlName().toString().contains(".")); // compare
        assertEquals("nextschema." + dbm.getTableDbName(), dbm.getTableSqlName().toString());
    }
}
