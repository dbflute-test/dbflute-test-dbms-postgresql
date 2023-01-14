package org.docksidestage.postgresql.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.docksidestage.postgresql.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.postgresql.dbflute.exentity.*;

/**
 * The entity of vendor_uuid_bar as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendorUuidBar extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** bar_id: {PK, NotNull, uuid(2147483647)} */
    protected java.util.UUID _barId;

    /** bar_name: {NotNull, varchar(2147483647)} */
    protected String _barName;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "vendor_uuid_bar";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_barId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** vendor_uuid_foo by bar_id, named 'vendorUuidFooList'. */
    protected List<VendorUuidFoo> _vendorUuidFooList;

    /**
     * [get] vendor_uuid_foo by bar_id, named 'vendorUuidFooList'.
     * @return The entity list of referrer property 'vendorUuidFooList'. (NotNull: even if no loading, returns empty list)
     */
    public List<VendorUuidFoo> getVendorUuidFooList() {
        if (_vendorUuidFooList == null) { _vendorUuidFooList = newReferrerList(); }
        return _vendorUuidFooList;
    }

    /**
     * [set] vendor_uuid_foo by bar_id, named 'vendorUuidFooList'.
     * @param vendorUuidFooList The entity list of referrer property 'vendorUuidFooList'. (NullAllowed)
     */
    public void setVendorUuidFooList(List<VendorUuidFoo> vendorUuidFooList) {
        _vendorUuidFooList = vendorUuidFooList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsVendorUuidBar) {
            BsVendorUuidBar other = (BsVendorUuidBar)obj;
            if (!xSV(_barId, other._barId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _barId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_vendorUuidFooList != null) { for (VendorUuidFoo et : _vendorUuidFooList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "vendorUuidFooList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_barId));
        sb.append(dm).append(xfND(_barName));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_vendorUuidFooList != null && !_vendorUuidFooList.isEmpty())
        { sb.append(dm).append("vendorUuidFooList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public VendorUuidBar clone() {
        return (VendorUuidBar)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] bar_id: {PK, NotNull, uuid(2147483647)} <br>
     * @return The value of the column 'bar_id'. (basically NotNull if selected: for the constraint)
     */
    public java.util.UUID getBarId() {
        checkSpecifiedProperty("barId");
        return _barId;
    }

    /**
     * [set] bar_id: {PK, NotNull, uuid(2147483647)} <br>
     * @param barId The value of the column 'bar_id'. (basically NotNull if update: for the constraint)
     */
    public void setBarId(java.util.UUID barId) {
        registerModifiedProperty("barId");
        _barId = barId;
    }

    /**
     * [get] bar_name: {NotNull, varchar(2147483647)} <br>
     * @return The value of the column 'bar_name'. (basically NotNull if selected: for the constraint)
     */
    public String getBarName() {
        checkSpecifiedProperty("barName");
        return _barName;
    }

    /**
     * [set] bar_name: {NotNull, varchar(2147483647)} <br>
     * @param barName The value of the column 'bar_name'. (basically NotNull if update: for the constraint)
     */
    public void setBarName(String barName) {
        registerModifiedProperty("barName");
        _barName = barName;
    }
}
