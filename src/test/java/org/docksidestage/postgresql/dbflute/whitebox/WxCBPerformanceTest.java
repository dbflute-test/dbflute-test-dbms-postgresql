package org.docksidestage.postgresql.dbflute.whitebox;

import org.dbflute.system.DBFluteSystem;
import org.dbflute.utflute.core.PlainTestCase;
import org.dbflute.util.DfTraceViewUtil;
import org.docksidestage.postgresql.dbflute.cbean.MemberCB;

/**
 * @author jflute
 * @since 0.9.7.3 (2010/07/09 Friday)
 */
public class WxCBPerformanceTest extends PlainTestCase {

    // ===================================================================================
    //                                                                            Creation
    //                                                                            ========
    public void test_performance_creation() {
        // ## Arrange ##
        // AbstractSqlClause improvement: 00m00s342ms -> 00m00s278ms
        long count = 100000L;

        // ## Act ##
        long before = DBFluteSystem.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            new MemberCB();
        }
        long after = DBFluteSystem.currentTimeMillis();

        // ## Assert ##
        long sum = (after - before);
        log(DfTraceViewUtil.convertToPerformanceView(sum));
    }
}
