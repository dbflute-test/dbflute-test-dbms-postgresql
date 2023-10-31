package org.docksidestage.postgresql.dbflute.whitebox.dfprop;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.dbflute.cbean.result.ListResultBean;
import org.docksidestage.postgresql.dbflute.exbhv.WhiteTypeMappingPointBhv;
import org.docksidestage.postgresql.dbflute.exentity.WhiteTypeMappingPoint;
import org.docksidestage.postgresql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.2.7 (2023/10/31 Tuesday at durobeya)
 */
public class WxTypeMappingTest extends UnitContainerTestCase {

    private WhiteTypeMappingPointBhv typeMappingPointBhv;

    public void test_typeMapping_basic() {
        ListResultBean<WhiteTypeMappingPoint> pointList = typeMappingPointBhv.selectList(cb -> {});
        for (WhiteTypeMappingPoint point : pointList) {
            Long typeMappingPointId = point.getTypeMappingPointId();
            String typeMappingPointName = point.getTypeMappingPointName();
            Integer normalInteger = point.getNormalInteger();
            Long normalLong = point.getNormalLong();
            LocalDate normalDate = point.getNormalDate();
            LocalDateTime normalDatetime = point.getNormalDatetime();
            Integer pointLongInteger = point.getPointLongInteger(); // expects integer
            LocalDate pointDatetimeDate = point.getPointDatetimeDate(); // expects LocalDate
            log(typeMappingPointId, typeMappingPointName, normalInteger, normalLong, normalDate, normalDatetime, pointLongInteger,
                    pointDatetimeDate);
        }
    }
}
