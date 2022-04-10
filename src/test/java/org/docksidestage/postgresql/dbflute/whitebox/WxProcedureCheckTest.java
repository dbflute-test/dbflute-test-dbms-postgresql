package org.docksidestage.postgresql.dbflute.whitebox;

import java.util.List;

import org.dbflute.exception.DangerousResultSizeException;
import org.dbflute.exception.FetchingOverSafetySizeException;
import org.docksidestage.postgresql.dbflute.exbhv.MemberBhv;
import org.docksidestage.postgresql.dbflute.exbhv.pmbean.FnReturnResultSetPmb;
import org.docksidestage.postgresql.dbflute.exentity.customize.FnReturnResultSetReturnValue;
import org.docksidestage.postgresql.unit.UnitContainerTestCase;

/**
 * @author jflute
 */
public class WxProcedureCheckTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;

    // ===================================================================================
    //                                                                       Safety Result
    //                                                                       =============
    public void test_call_safetyResult_dangerous() {
        // ## Arrange ##
        FnReturnResultSetPmb pmb = new FnReturnResultSetPmb();
        pmb.checkSafetyResult(5);

        // ## Act ##
        try {
            memberBhv.outsideSql().call(pmb);

            // ## Assert ##
            fail();
        } catch (DangerousResultSizeException e) {
            // OK
            log(e.getMessage());
            assertEquals(5, e.getSafetyMaxResultSize());
            assertEquals(FetchingOverSafetySizeException.class, e.getCause().getClass());
        }
    }

    public void test_call_safetyResult_safety() {
        // ## Arrange ##
        int maxSize;
        {
            FnReturnResultSetPmb pmb = new FnReturnResultSetPmb();
            memberBhv.outsideSql().call(pmb); // expect no exception
            maxSize = pmb.getReturnValue().size();
        }
        FnReturnResultSetPmb pmb = new FnReturnResultSetPmb();
        pmb.checkSafetyResult(maxSize);

        // ## Act ##
        memberBhv.outsideSql().call(pmb); // expect no exception

        // ## Assert ##
        List<FnReturnResultSetReturnValue> returnValue = pmb.getReturnValue();
        assertEquals(maxSize, returnValue.size());
    }
}
