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
 * The entity of VENDOR-NON COMPILABLE as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendor_non_compilable extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** NON-COMPILABLE ID: {PK, NotNull, int4(10)} */
    protected Integer _non_compilable_id;

    /** NON COMPILABLE-NAME: {varchar(64)} */
    protected String _non_compilable_name;

    /** PARENT-ID: {int4(10), FK to VENDOR-NON COMPILABLE} */
    protected Integer _parent_id;

    /** Next_ParentID: {IX, int4(10), FK to VENDOR-NON COMPILABLE} */
    protected Integer _nextParentid;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "VENDOR-NON COMPILABLE";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_non_compilable_id == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** VENDOR-NON COMPILABLE by my Next_ParentID, named 'vendor_non_compilableByNextParentidSelf'. */
    protected OptionalEntity<Vendor_non_compilable> _vendor_non_compilableByNextParentidSelf;

    /**
     * [get] VENDOR-NON COMPILABLE by my Next_ParentID, named 'vendor_non_compilableByNextParentidSelf'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'vendor_non_compilableByNextParentidSelf'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Vendor_non_compilable> getVendor_non_compilableByNextParentidSelf() {
        if (_vendor_non_compilableByNextParentidSelf == null) { _vendor_non_compilableByNextParentidSelf = OptionalEntity.relationEmpty(this, "vendor_non_compilableByNextParentidSelf"); }
        return _vendor_non_compilableByNextParentidSelf;
    }

    /**
     * [set] VENDOR-NON COMPILABLE by my Next_ParentID, named 'vendor_non_compilableByNextParentidSelf'.
     * @param vendor_non_compilableByNextParentidSelf The entity of foreign property 'vendor_non_compilableByNextParentidSelf'. (NullAllowed)
     */
    public void setVendor_non_compilableByNextParentidSelf(OptionalEntity<Vendor_non_compilable> vendor_non_compilableByNextParentidSelf) {
        _vendor_non_compilableByNextParentidSelf = vendor_non_compilableByNextParentidSelf;
    }

    /** VENDOR-NON COMPILABLE by my PARENT-ID, named 'vendor_non_compilableByParent_idSelf'. */
    protected OptionalEntity<Vendor_non_compilable> _vendor_non_compilableByParent_idSelf;

    /**
     * [get] VENDOR-NON COMPILABLE by my PARENT-ID, named 'vendor_non_compilableByParent_idSelf'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'vendor_non_compilableByParent_idSelf'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Vendor_non_compilable> getVendor_non_compilableByParent_idSelf() {
        if (_vendor_non_compilableByParent_idSelf == null) { _vendor_non_compilableByParent_idSelf = OptionalEntity.relationEmpty(this, "vendor_non_compilableByParent_idSelf"); }
        return _vendor_non_compilableByParent_idSelf;
    }

    /**
     * [set] VENDOR-NON COMPILABLE by my PARENT-ID, named 'vendor_non_compilableByParent_idSelf'.
     * @param vendor_non_compilableByParent_idSelf The entity of foreign property 'vendor_non_compilableByParent_idSelf'. (NullAllowed)
     */
    public void setVendor_non_compilableByParent_idSelf(OptionalEntity<Vendor_non_compilable> vendor_non_compilableByParent_idSelf) {
        _vendor_non_compilableByParent_idSelf = vendor_non_compilableByParent_idSelf;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** VENDOR-NON COMPILABLE by Next_ParentID, named 'vendor_non_compilableByNextParentidSelfList'. */
    protected List<Vendor_non_compilable> _vendor_non_compilableByNextParentidSelfList;

    /**
     * [get] VENDOR-NON COMPILABLE by Next_ParentID, named 'vendor_non_compilableByNextParentidSelfList'.
     * @return The entity list of referrer property 'vendor_non_compilableByNextParentidSelfList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Vendor_non_compilable> getVendor_non_compilableByNextParentidSelfList() {
        if (_vendor_non_compilableByNextParentidSelfList == null) { _vendor_non_compilableByNextParentidSelfList = newReferrerList(); }
        return _vendor_non_compilableByNextParentidSelfList;
    }

    /**
     * [set] VENDOR-NON COMPILABLE by Next_ParentID, named 'vendor_non_compilableByNextParentidSelfList'.
     * @param vendor_non_compilableByNextParentidSelfList The entity list of referrer property 'vendor_non_compilableByNextParentidSelfList'. (NullAllowed)
     */
    public void setVendor_non_compilableByNextParentidSelfList(List<Vendor_non_compilable> vendor_non_compilableByNextParentidSelfList) {
        _vendor_non_compilableByNextParentidSelfList = vendor_non_compilableByNextParentidSelfList;
    }

    /** VENDOR-NON COMPILABLE by PARENT-ID, named 'vendor_non_compilableByParent_idSelfList'. */
    protected List<Vendor_non_compilable> _vendor_non_compilableByParent_idSelfList;

    /**
     * [get] VENDOR-NON COMPILABLE by PARENT-ID, named 'vendor_non_compilableByParent_idSelfList'.
     * @return The entity list of referrer property 'vendor_non_compilableByParent_idSelfList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Vendor_non_compilable> getVendor_non_compilableByParent_idSelfList() {
        if (_vendor_non_compilableByParent_idSelfList == null) { _vendor_non_compilableByParent_idSelfList = newReferrerList(); }
        return _vendor_non_compilableByParent_idSelfList;
    }

    /**
     * [set] VENDOR-NON COMPILABLE by PARENT-ID, named 'vendor_non_compilableByParent_idSelfList'.
     * @param vendor_non_compilableByParent_idSelfList The entity list of referrer property 'vendor_non_compilableByParent_idSelfList'. (NullAllowed)
     */
    public void setVendor_non_compilableByParent_idSelfList(List<Vendor_non_compilable> vendor_non_compilableByParent_idSelfList) {
        _vendor_non_compilableByParent_idSelfList = vendor_non_compilableByParent_idSelfList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsVendor_non_compilable) {
            BsVendor_non_compilable other = (BsVendor_non_compilable)obj;
            if (!xSV(_non_compilable_id, other._non_compilable_id)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _non_compilable_id);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_vendor_non_compilableByNextParentidSelf != null && _vendor_non_compilableByNextParentidSelf.isPresent())
        { sb.append(li).append(xbRDS(_vendor_non_compilableByNextParentidSelf, "vendor_non_compilableByNextParentidSelf")); }
        if (_vendor_non_compilableByParent_idSelf != null && _vendor_non_compilableByParent_idSelf.isPresent())
        { sb.append(li).append(xbRDS(_vendor_non_compilableByParent_idSelf, "vendor_non_compilableByParent_idSelf")); }
        if (_vendor_non_compilableByNextParentidSelfList != null) { for (Vendor_non_compilable et : _vendor_non_compilableByNextParentidSelfList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "vendor_non_compilableByNextParentidSelfList")); } } }
        if (_vendor_non_compilableByParent_idSelfList != null) { for (Vendor_non_compilable et : _vendor_non_compilableByParent_idSelfList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "vendor_non_compilableByParent_idSelfList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_non_compilable_id));
        sb.append(dm).append(xfND(_non_compilable_name));
        sb.append(dm).append(xfND(_parent_id));
        sb.append(dm).append(xfND(_nextParentid));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_vendor_non_compilableByNextParentidSelf != null && _vendor_non_compilableByNextParentidSelf.isPresent())
        { sb.append(dm).append("vendor_non_compilableByNextParentidSelf"); }
        if (_vendor_non_compilableByParent_idSelf != null && _vendor_non_compilableByParent_idSelf.isPresent())
        { sb.append(dm).append("vendor_non_compilableByParent_idSelf"); }
        if (_vendor_non_compilableByNextParentidSelfList != null && !_vendor_non_compilableByNextParentidSelfList.isEmpty())
        { sb.append(dm).append("vendor_non_compilableByNextParentidSelfList"); }
        if (_vendor_non_compilableByParent_idSelfList != null && !_vendor_non_compilableByParent_idSelfList.isEmpty())
        { sb.append(dm).append("vendor_non_compilableByParent_idSelfList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public Vendor_non_compilable clone() {
        return (Vendor_non_compilable)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] NON-COMPILABLE ID: {PK, NotNull, int4(10)} <br>
     * @return The value of the column 'NON-COMPILABLE ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getNon_compilable_id() {
        checkSpecifiedProperty("non_compilable_id");
        return _non_compilable_id;
    }

    /**
     * [set] NON-COMPILABLE ID: {PK, NotNull, int4(10)} <br>
     * @param non_compilable_id The value of the column 'NON-COMPILABLE ID'. (basically NotNull if update: for the constraint)
     */
    public void setNon_compilable_id(Integer non_compilable_id) {
        registerModifiedProperty("non_compilable_id");
        _non_compilable_id = non_compilable_id;
    }

    /**
     * [get] NON COMPILABLE-NAME: {varchar(64)} <br>
     * @return The value of the column 'NON COMPILABLE-NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getNon_compilable_name() {
        checkSpecifiedProperty("non_compilable_name");
        return _non_compilable_name;
    }

    /**
     * [set] NON COMPILABLE-NAME: {varchar(64)} <br>
     * @param non_compilable_name The value of the column 'NON COMPILABLE-NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNon_compilable_name(String non_compilable_name) {
        registerModifiedProperty("non_compilable_name");
        _non_compilable_name = non_compilable_name;
    }

    /**
     * [get] PARENT-ID: {int4(10), FK to VENDOR-NON COMPILABLE} <br>
     * @return The value of the column 'PARENT-ID'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getParent_id() {
        checkSpecifiedProperty("parent_id");
        return _parent_id;
    }

    /**
     * [set] PARENT-ID: {int4(10), FK to VENDOR-NON COMPILABLE} <br>
     * @param parent_id The value of the column 'PARENT-ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setParent_id(Integer parent_id) {
        registerModifiedProperty("parent_id");
        _parent_id = parent_id;
    }

    /**
     * [get] Next_ParentID: {IX, int4(10), FK to VENDOR-NON COMPILABLE} <br>
     * @return The value of the column 'Next_ParentID'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getNextParentid() {
        checkSpecifiedProperty("nextParentid");
        return _nextParentid;
    }

    /**
     * [set] Next_ParentID: {IX, int4(10), FK to VENDOR-NON COMPILABLE} <br>
     * @param nextParentid The value of the column 'Next_ParentID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNextParentid(Integer nextParentid) {
        registerModifiedProperty("nextParentid");
        _nextParentid = nextParentid;
    }
}
