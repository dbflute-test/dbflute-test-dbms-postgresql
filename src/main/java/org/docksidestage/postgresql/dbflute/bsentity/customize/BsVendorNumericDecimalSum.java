package org.docksidestage.postgresql.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import org.docksidestage.postgresql.dbflute.exentity.customize.*;

/**
 * The entity of VendorNumericDecimalSum.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendorNumericDecimalSum extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** decimal_digit_sum: {numeric(131089)} */
    protected java.math.BigDecimal _decimalDigitSum;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return org.docksidestage.postgresql.dbflute.bsentity.customize.dbmeta.VendorNumericDecimalSumDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "VendorNumericDecimalSum";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        return false;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsVendorNumericDecimalSum) {
            BsVendorNumericDecimalSum other = (BsVendorNumericDecimalSum)obj;
            if (!xSV(_decimalDigitSum, other._decimalDigitSum)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _decimalDigitSum);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_decimalDigitSum));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public VendorNumericDecimalSum clone() {
        return (VendorNumericDecimalSum)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] decimal_digit_sum: {numeric(131089)} <br>
     * @return The value of the column 'decimal_digit_sum'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getDecimalDigitSum() {
        checkSpecifiedProperty("decimalDigitSum");
        return _decimalDigitSum;
    }

    /**
     * [set] decimal_digit_sum: {numeric(131089)} <br>
     * @param decimalDigitSum The value of the column 'decimal_digit_sum'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDecimalDigitSum(java.math.BigDecimal decimalDigitSum) {
        registerModifiedProperty("decimalDigitSum");
        _decimalDigitSum = decimalDigitSum;
    }
}
