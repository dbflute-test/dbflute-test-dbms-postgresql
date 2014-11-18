package org.docksidestage.postgresql.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import org.docksidestage.postgresql.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.postgresql.dbflute.exentity.*;

/**
 * The entity of vendor_uuid_foo as TABLE. <br>
 * <pre>
 * [primary-key]
 *     foo_id
 * 
 * [column]
 *     foo_id, foo_name, bar_id
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
 *     vendor_uuid_bar
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     vendorUuidBar
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * java.util.UUID fooId = entity.getFooId();
 * String fooName = entity.getFooName();
 * java.util.UUID barId = entity.getBarId();
 * entity.setFooId(fooId);
 * entity.setFooName(fooName);
 * entity.setBarId(barId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendorUuidFoo extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** foo_id: {PK, NotNull, uuid(2147483647)} */
    protected java.util.UUID _fooId;

    /** foo_name: {NotNull, varchar(2147483647)} */
    protected String _fooName;

    /** bar_id: {NotNull, uuid(2147483647), FK to vendor_uuid_bar} */
    protected java.util.UUID _barId;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "vendor_uuid_foo";
    }

    // ===================================================================================
    //                                                                         Primary Key
    //                                                                         ===========
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_fooId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** vendor_uuid_bar by my bar_id, named 'vendorUuidBar'. */
    protected OptionalEntity<VendorUuidBar> _vendorUuidBar;

    /**
     * [get] vendor_uuid_bar by my bar_id, named 'vendorUuidBar'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'vendorUuidBar'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<VendorUuidBar> getVendorUuidBar() {
        if (_vendorUuidBar == null) { _vendorUuidBar = OptionalEntity.relationEmpty(this, "vendorUuidBar"); }
        return _vendorUuidBar;
    }

    /**
     * [set] vendor_uuid_bar by my bar_id, named 'vendorUuidBar'.
     * @param vendorUuidBar The entity of foreign property 'vendorUuidBar'. (NullAllowed)
     */
    public void setVendorUuidBar(OptionalEntity<VendorUuidBar> vendorUuidBar) {
        _vendorUuidBar = vendorUuidBar;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsVendorUuidFoo) {
            BsVendorUuidFoo other = (BsVendorUuidFoo)obj;
            if (!xSV(_fooId, other._fooId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _fooId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_vendorUuidBar != null && _vendorUuidBar.isPresent())
        { sb.append(li).append(xbRDS(_vendorUuidBar, "vendorUuidBar")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_fooId));
        sb.append(dm).append(xfND(_fooName));
        sb.append(dm).append(xfND(_barId));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_vendorUuidBar != null && _vendorUuidBar.isPresent())
        { sb.append(dm).append("vendorUuidBar"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public VendorUuidFoo clone() {
        return (VendorUuidFoo)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] foo_id: {PK, NotNull, uuid(2147483647)} <br>
     * @return The value of the column 'foo_id'. (basically NotNull if selected: for the constraint)
     */
    public java.util.UUID getFooId() {
        checkSpecifiedProperty("fooId");
        return _fooId;
    }

    /**
     * [set] foo_id: {PK, NotNull, uuid(2147483647)} <br>
     * @param fooId The value of the column 'foo_id'. (basically NotNull if update: for the constraint)
     */
    public void setFooId(java.util.UUID fooId) {
        registerModifiedProperty("fooId");
        _fooId = fooId;
    }

    /**
     * [get] foo_name: {NotNull, varchar(2147483647)} <br>
     * @return The value of the column 'foo_name'. (basically NotNull if selected: for the constraint)
     */
    public String getFooName() {
        checkSpecifiedProperty("fooName");
        return _fooName;
    }

    /**
     * [set] foo_name: {NotNull, varchar(2147483647)} <br>
     * @param fooName The value of the column 'foo_name'. (basically NotNull if update: for the constraint)
     */
    public void setFooName(String fooName) {
        registerModifiedProperty("fooName");
        _fooName = fooName;
    }

    /**
     * [get] bar_id: {NotNull, uuid(2147483647), FK to vendor_uuid_bar} <br>
     * @return The value of the column 'bar_id'. (basically NotNull if selected: for the constraint)
     */
    public java.util.UUID getBarId() {
        checkSpecifiedProperty("barId");
        return _barId;
    }

    /**
     * [set] bar_id: {NotNull, uuid(2147483647), FK to vendor_uuid_bar} <br>
     * @param barId The value of the column 'bar_id'. (basically NotNull if update: for the constraint)
     */
    public void setBarId(java.util.UUID barId) {
        registerModifiedProperty("barId");
        _barId = barId;
    }
}
