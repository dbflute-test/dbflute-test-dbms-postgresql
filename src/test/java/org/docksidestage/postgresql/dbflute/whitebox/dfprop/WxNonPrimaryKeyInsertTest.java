package org.docksidestage.postgresql.dbflute.whitebox.dfprop;

import org.docksidestage.postgresql.dbflute.cbean.WhiteNotPkCB;
import org.docksidestage.postgresql.dbflute.exbhv.WhiteNotPkBhv;
import org.docksidestage.postgresql.dbflute.exentity.WhiteNotPk;
import org.docksidestage.postgresql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.5.3 (2009/08/01 Saturdayy)
 */
public class WxNonPrimaryKeyInsertTest extends UnitContainerTestCase {

    private WhiteNotPkBhv whiteNotPkBhv;

    public void test_integer_null() {
        // ## Arrange ##
        WhiteNotPk vendorNotPk = new WhiteNotPk();
        vendorNotPk.setNotPkId(99999L);

        // ## Act ##
        whiteNotPkBhv.insert(vendorNotPk);

        // ## Assert ##
        WhiteNotPkCB cb = new WhiteNotPkCB();
        cb.query().setNotPkId_Equal(99999L);
        WhiteNotPk actual = whiteNotPkBhv.selectEntityWithDeletedCheck(cb);
        assertNull(actual.getNotPkInteger());
    }
}