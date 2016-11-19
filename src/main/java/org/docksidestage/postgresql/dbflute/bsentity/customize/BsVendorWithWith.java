package org.docksidestage.postgresql.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import org.docksidestage.postgresql.dbflute.exentity.customize.*;

/**
 * The entity of VendorWithWith. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     vendor_check_id, type_of_varchar, type_of_numeric_integer
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long vendorCheckId = entity.getVendorCheckId();
 * String typeOfVarchar = entity.getTypeOfVarchar();
 * Integer typeOfNumericInteger = entity.getTypeOfNumericInteger();
 * entity.setVendorCheckId(vendorCheckId);
 * entity.setTypeOfVarchar(typeOfVarchar);
 * entity.setTypeOfNumericInteger(typeOfNumericInteger);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendorWithWith extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** vendor_check_id: {numeric(16), refers to vendor_check.vendor_check_id} */
    protected Long _vendorCheckId;

    /** type_of_varchar: {varchar(2147483647), refers to vendor_check.type_of_varchar} */
    protected String _typeOfVarchar;

    /** type_of_numeric_integer: {numeric(5), refers to vendor_check.type_of_numeric_integer} */
    protected Integer _typeOfNumericInteger;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return org.docksidestage.postgresql.dbflute.bsentity.customize.dbmeta.VendorWithWithDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "VendorWithWith";
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
        if (obj instanceof BsVendorWithWith) {
            BsVendorWithWith other = (BsVendorWithWith)obj;
            if (!xSV(_vendorCheckId, other._vendorCheckId)) { return false; }
            if (!xSV(_typeOfVarchar, other._typeOfVarchar)) { return false; }
            if (!xSV(_typeOfNumericInteger, other._typeOfNumericInteger)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _vendorCheckId);
        hs = xCH(hs, _typeOfVarchar);
        hs = xCH(hs, _typeOfNumericInteger);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_vendorCheckId));
        sb.append(dm).append(xfND(_typeOfVarchar));
        sb.append(dm).append(xfND(_typeOfNumericInteger));
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
    public VendorWithWith clone() {
        return (VendorWithWith)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] vendor_check_id: {numeric(16), refers to vendor_check.vendor_check_id} <br>
     * @return The value of the column 'vendor_check_id'. (NullAllowed even if selected: for no constraint)
     */
    public Long getVendorCheckId() {
        checkSpecifiedProperty("vendorCheckId");
        return _vendorCheckId;
    }

    /**
     * [set] vendor_check_id: {numeric(16), refers to vendor_check.vendor_check_id} <br>
     * @param vendorCheckId The value of the column 'vendor_check_id'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVendorCheckId(Long vendorCheckId) {
        registerModifiedProperty("vendorCheckId");
        _vendorCheckId = vendorCheckId;
    }

    /**
     * [get] type_of_varchar: {varchar(2147483647), refers to vendor_check.type_of_varchar} <br>
     * @return The value of the column 'type_of_varchar'. (NullAllowed even if selected: for no constraint)
     */
    public String getTypeOfVarchar() {
        checkSpecifiedProperty("typeOfVarchar");
        return _typeOfVarchar;
    }

    /**
     * [set] type_of_varchar: {varchar(2147483647), refers to vendor_check.type_of_varchar} <br>
     * @param typeOfVarchar The value of the column 'type_of_varchar'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfVarchar(String typeOfVarchar) {
        registerModifiedProperty("typeOfVarchar");
        _typeOfVarchar = typeOfVarchar;
    }

    /**
     * [get] type_of_numeric_integer: {numeric(5), refers to vendor_check.type_of_numeric_integer} <br>
     * @return The value of the column 'type_of_numeric_integer'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getTypeOfNumericInteger() {
        checkSpecifiedProperty("typeOfNumericInteger");
        return _typeOfNumericInteger;
    }

    /**
     * [set] type_of_numeric_integer: {numeric(5), refers to vendor_check.type_of_numeric_integer} <br>
     * @param typeOfNumericInteger The value of the column 'type_of_numeric_integer'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTypeOfNumericInteger(Integer typeOfNumericInteger) {
        registerModifiedProperty("typeOfNumericInteger");
        _typeOfNumericInteger = typeOfNumericInteger;
    }
}
