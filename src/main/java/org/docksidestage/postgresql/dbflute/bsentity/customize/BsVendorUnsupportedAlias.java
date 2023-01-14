package org.docksidestage.postgresql.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import org.docksidestage.postgresql.dbflute.exentity.customize.*;

/**
 * The entity of VendorUnsupportedAlias.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendorUnsupportedAlias extends AbstractEntity implements CustomizeEntity {

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

    /** HYPHEN-EXISTS: {varchar(2147483647), refers to vendor_check} */
    protected String _hyphen_exists;

    /** SPACE EXISTS: {int4(10), refers to vendor_check} */
    protected Integer _space_exists;

    /** DOLLAR$EXISTS: {date(13), refers to vendor_check} */
    protected java.time.LocalDate _dollar$exists;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return org.docksidestage.postgresql.dbflute.bsentity.customize.dbmeta.VendorUnsupportedAliasDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "VendorUnsupportedAlias";
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
        if (obj instanceof BsVendorUnsupportedAlias) {
            BsVendorUnsupportedAlias other = (BsVendorUnsupportedAlias)obj;
            if (!xSV(_vendorCheckId, other._vendorCheckId)) { return false; }
            if (!xSV(_hyphen_exists, other._hyphen_exists)) { return false; }
            if (!xSV(_space_exists, other._space_exists)) { return false; }
            if (!xSV(_dollar$exists, other._dollar$exists)) { return false; }
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
        hs = xCH(hs, _hyphen_exists);
        hs = xCH(hs, _space_exists);
        hs = xCH(hs, _dollar$exists);
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
        sb.append(dm).append(xfND(_hyphen_exists));
        sb.append(dm).append(xfND(_space_exists));
        sb.append(dm).append(xfND(_dollar$exists));
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
    public VendorUnsupportedAlias clone() {
        return (VendorUnsupportedAlias)super.clone();
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
     * [get] HYPHEN-EXISTS: {varchar(2147483647), refers to vendor_check} <br>
     * @return The value of the column 'HYPHEN-EXISTS'. (NullAllowed even if selected: for no constraint)
     */
    public String getHyphen_exists() {
        checkSpecifiedProperty("hyphen_exists");
        return _hyphen_exists;
    }

    /**
     * [set] HYPHEN-EXISTS: {varchar(2147483647), refers to vendor_check} <br>
     * @param hyphen_exists The value of the column 'HYPHEN-EXISTS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHyphen_exists(String hyphen_exists) {
        registerModifiedProperty("hyphen_exists");
        _hyphen_exists = hyphen_exists;
    }

    /**
     * [get] SPACE EXISTS: {int4(10), refers to vendor_check} <br>
     * @return The value of the column 'SPACE EXISTS'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getSpace_exists() {
        checkSpecifiedProperty("space_exists");
        return _space_exists;
    }

    /**
     * [set] SPACE EXISTS: {int4(10), refers to vendor_check} <br>
     * @param space_exists The value of the column 'SPACE EXISTS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpace_exists(Integer space_exists) {
        registerModifiedProperty("space_exists");
        _space_exists = space_exists;
    }

    /**
     * [get] DOLLAR$EXISTS: {date(13), refers to vendor_check} <br>
     * @return The value of the column 'DOLLAR$EXISTS'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDate getDollar$exists() {
        checkSpecifiedProperty("dollar$exists");
        return _dollar$exists;
    }

    /**
     * [set] DOLLAR$EXISTS: {date(13), refers to vendor_check} <br>
     * @param dollar$exists The value of the column 'DOLLAR$EXISTS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDollar$exists(java.time.LocalDate dollar$exists) {
        registerModifiedProperty("dollar$exists");
        _dollar$exists = dollar$exists;
    }
}
