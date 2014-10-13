package org.docksidestage.postgresql.dbflute.whitebox.dfprop;

import org.dbflute.jdbc.ClassificationCodeType;
import org.dbflute.s2dao.valuetype.TnValueTypes;
import org.docksidestage.postgresql.dbflute.allcommon.CDef;
import org.docksidestage.postgresql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.5.3 (2009/08/01 Saturdayy)
 */
public class WxClassificationCodeTypeTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                          ColumnInfo
    //                                                                          ==========
    public void test_dataType() {
        // ## Arrange ##
        ClassificationCodeType numberType = ClassificationCodeType.Number;
        ClassificationCodeType stringType = ClassificationCodeType.String;
        ClassificationCodeType booleanType = ClassificationCodeType.Boolean;

        // ## Act & Assert ##
        assertEquals(numberType, CDef.Flg.True.meta().codeType()); // as specified
        assertEquals(stringType, CDef.MemberStatus.Formalized.meta().codeType()); // as default
        assertEquals(booleanType, CDef.TrueFalse.True.meta().codeType()); // as specified
        assertEquals(TnValueTypes.CLASSIFICATION, TnValueTypes.getValueType(CDef.Flg.True));
    }
}