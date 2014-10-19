package org.docksidestage.postgresql.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.docksidestage.postgresql.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.postgresql.dbflute.exentity.*;

/**
 * The entity of vendor_part_man as TABLE. <br />
 * <pre>
 * [primary-key]
 *     part_man_id
 * 
 * [column]
 *     part_man_id, part_man_name, part_man_point, part_man_date
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
 * Integer partManId = entity.getPartManId();
 * String partManName = entity.getPartManName();
 * Integer partManPoint = entity.getPartManPoint();
 * java.util.Date partManDate = entity.getPartManDate();
 * entity.setPartManId(partManId);
 * entity.setPartManName(partManName);
 * entity.setPartManPoint(partManPoint);
 * entity.setPartManDate(partManDate);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendorPartMan extends AbstractEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** part_man_id: {PK, NotNull, int4(10)} */
    protected Integer _partManId;

    /** part_man_name: {NotNull, varchar(2147483647)} */
    protected String _partManName;

    /** part_man_point: {NotNull, int4(10)} */
    protected Integer _partManPoint;

    /** part_man_date: {date(13)} */
    protected java.util.Date _partManDate;


    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /** {@inheritDoc} */
    public String getTableDbName() {
        return "vendor_part_man";
    }

    /** {@inheritDoc} */
    public String getTablePropertyName() {
        return "vendorPartMan";
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
        if (_partManId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
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
        if (obj instanceof BsVendorPartMan) {
            BsVendorPartMan other = (BsVendorPartMan)obj;
            if (!xSV(_partManId, other._partManId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _partManId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(_partManId);
        sb.append(dm).append(_partManName);
        sb.append(dm).append(_partManPoint);
        sb.append(dm).append(xfUD(_partManDate));
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
    public VendorPartMan clone() {
        return (VendorPartMan)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] part_man_id: {PK, NotNull, int4(10)} <br />
     * @return The value of the column 'part_man_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getPartManId() {
        return _partManId;
    }

    /**
     * [set] part_man_id: {PK, NotNull, int4(10)} <br />
     * @param partManId The value of the column 'part_man_id'. (basically NotNull if update: for the constraint)
     */
    public void setPartManId(Integer partManId) {
        __modifiedProperties.addPropertyName("partManId");
        _partManId = partManId;
    }

    /**
     * [get] part_man_name: {NotNull, varchar(2147483647)} <br />
     * @return The value of the column 'part_man_name'. (basically NotNull if selected: for the constraint)
     */
    public String getPartManName() {
        return _partManName;
    }

    /**
     * [set] part_man_name: {NotNull, varchar(2147483647)} <br />
     * @param partManName The value of the column 'part_man_name'. (basically NotNull if update: for the constraint)
     */
    public void setPartManName(String partManName) {
        __modifiedProperties.addPropertyName("partManName");
        _partManName = partManName;
    }

    /**
     * [get] part_man_point: {NotNull, int4(10)} <br />
     * @return The value of the column 'part_man_point'. (basically NotNull if selected: for the constraint)
     */
    public Integer getPartManPoint() {
        return _partManPoint;
    }

    /**
     * [set] part_man_point: {NotNull, int4(10)} <br />
     * @param partManPoint The value of the column 'part_man_point'. (basically NotNull if update: for the constraint)
     */
    public void setPartManPoint(Integer partManPoint) {
        __modifiedProperties.addPropertyName("partManPoint");
        _partManPoint = partManPoint;
    }

    /**
     * [get] part_man_date: {date(13)} <br />
     * @return The value of the column 'part_man_date'. (NullAllowed even if selected: for no constraint)
     */
    public java.util.Date getPartManDate() {
        return _partManDate;
    }

    /**
     * [set] part_man_date: {date(13)} <br />
     * @param partManDate The value of the column 'part_man_date'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPartManDate(java.util.Date partManDate) {
        __modifiedProperties.addPropertyName("partManDate");
        _partManDate = partManDate;
    }
}
