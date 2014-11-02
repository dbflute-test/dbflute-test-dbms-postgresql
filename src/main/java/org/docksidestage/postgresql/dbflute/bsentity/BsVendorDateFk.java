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
 * The entity of vendor_date_fk as TABLE. <br>
 * <pre>
 * [primary-key]
 *     bar_id
 * 
 * [column]
 *     bar_id, bar_date
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
 *     vendor_date_pk
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     vendorDatePk
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer barId = entity.getBarId();
 * java.time.LocalDate barDate = entity.getBarDate();
 * entity.setBarId(barId);
 * entity.setBarDate(barDate);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendorDateFk extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** bar_id: {PK, NotNull, int4(10)} */
    protected Integer _barId;

    /** bar_date: {NotNull, date(13), FK to vendor_date_pk} */
    protected java.time.LocalDate _barDate;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /** {@inheritDoc} */
    public String getTableDbName() {
        return "vendor_date_fk";
    }

    /** {@inheritDoc} */
    public String getTablePropertyName() {
        return "vendorDateFk";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public DBMeta getDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(getTableDbName());
    }

    // ===================================================================================
    //                                                                         Primary Key
    //                                                                         ===========
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_barId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** vendor_date_pk by my bar_date, named 'vendorDatePk'. */
    protected OptionalEntity<VendorDatePk> _vendorDatePk;

    /**
     * [get] vendor_date_pk by my bar_date, named 'vendorDatePk'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'vendorDatePk'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<VendorDatePk> getVendorDatePk() {
        if (_vendorDatePk == null) { _vendorDatePk = OptionalEntity.relationEmpty(this, "vendorDatePk"); }
        return _vendorDatePk;
    }

    /**
     * [set] vendor_date_pk by my bar_date, named 'vendorDatePk'.
     * @param vendorDatePk The entity of foreign property 'vendorDatePk'. (NullAllowed)
     */
    public void setVendorDatePk(OptionalEntity<VendorDatePk> vendorDatePk) {
        _vendorDatePk = vendorDatePk;
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
        if (obj instanceof BsVendorDateFk) {
            BsVendorDateFk other = (BsVendorDateFk)obj;
            if (!xSV(_barId, other._barId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _barId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_vendorDatePk != null && _vendorDatePk.isPresent())
        { sb.append(li).append(xbRDS(_vendorDatePk, "vendorDatePk")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_barId));
        sb.append(dm).append(xfND(_barDate));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_vendorDatePk != null && _vendorDatePk.isPresent())
        { sb.append(dm).append("vendorDatePk"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public VendorDateFk clone() {
        return (VendorDateFk)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] bar_id: {PK, NotNull, int4(10)} <br>
     * @return The value of the column 'bar_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getBarId() {
        checkSpecifiedProperty("barId");
        return _barId;
    }

    /**
     * [set] bar_id: {PK, NotNull, int4(10)} <br>
     * @param barId The value of the column 'bar_id'. (basically NotNull if update: for the constraint)
     */
    public void setBarId(Integer barId) {
        registerModifiedProperty("barId");
        _barId = barId;
    }

    /**
     * [get] bar_date: {NotNull, date(13), FK to vendor_date_pk} <br>
     * @return The value of the column 'bar_date'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDate getBarDate() {
        checkSpecifiedProperty("barDate");
        return _barDate;
    }

    /**
     * [set] bar_date: {NotNull, date(13), FK to vendor_date_pk} <br>
     * @param barDate The value of the column 'bar_date'. (basically NotNull if update: for the constraint)
     */
    public void setBarDate(java.time.LocalDate barDate) {
        registerModifiedProperty("barDate");
        _barDate = barDate;
    }
}
