package org.docksidestage.postgresql.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.docksidestage.postgresql.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.postgresql.dbflute.exentity.*;

/**
 * The entity of white_compound_pk_wrong_order as TABLE. <br>
 * <pre>
 * [primary-key]
 *     first_id, third_id, second_id
 *
 * [column]
 *     first_id, second_id, third_id, wrong_name
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
 * Integer firstId = entity.getFirstId();
 * Integer secondId = entity.getSecondId();
 * Integer thirdId = entity.getThirdId();
 * String wrongName = entity.getWrongName();
 * entity.setFirstId(firstId);
 * entity.setSecondId(secondId);
 * entity.setThirdId(thirdId);
 * entity.setWrongName(wrongName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteCompoundPkWrongOrder extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** first_id: {PK, NotNull, int4(10)} */
    protected Integer _firstId;

    /** second_id: {PK, NotNull, int4(10)} */
    protected Integer _secondId;

    /** third_id: {PK, NotNull, int4(10)} */
    protected Integer _thirdId;

    /** wrong_name: {varchar(200)} */
    protected String _wrongName;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "white_compound_pk_wrong_order";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_firstId == null) { return false; }
        if (_thirdId == null) { return false; }
        if (_secondId == null) { return false; }
        return true;
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
        if (obj instanceof BsWhiteCompoundPkWrongOrder) {
            BsWhiteCompoundPkWrongOrder other = (BsWhiteCompoundPkWrongOrder)obj;
            if (!xSV(_firstId, other._firstId)) { return false; }
            if (!xSV(_thirdId, other._thirdId)) { return false; }
            if (!xSV(_secondId, other._secondId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _firstId);
        hs = xCH(hs, _thirdId);
        hs = xCH(hs, _secondId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_firstId));
        sb.append(dm).append(xfND(_secondId));
        sb.append(dm).append(xfND(_thirdId));
        sb.append(dm).append(xfND(_wrongName));
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
    public WhiteCompoundPkWrongOrder clone() {
        return (WhiteCompoundPkWrongOrder)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] first_id: {PK, NotNull, int4(10)} <br>
     * @return The value of the column 'first_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getFirstId() {
        checkSpecifiedProperty("firstId");
        return _firstId;
    }

    /**
     * [set] first_id: {PK, NotNull, int4(10)} <br>
     * @param firstId The value of the column 'first_id'. (basically NotNull if update: for the constraint)
     */
    public void setFirstId(Integer firstId) {
        registerModifiedProperty("firstId");
        _firstId = firstId;
    }

    /**
     * [get] second_id: {PK, NotNull, int4(10)} <br>
     * @return The value of the column 'second_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getSecondId() {
        checkSpecifiedProperty("secondId");
        return _secondId;
    }

    /**
     * [set] second_id: {PK, NotNull, int4(10)} <br>
     * @param secondId The value of the column 'second_id'. (basically NotNull if update: for the constraint)
     */
    public void setSecondId(Integer secondId) {
        registerModifiedProperty("secondId");
        _secondId = secondId;
    }

    /**
     * [get] third_id: {PK, NotNull, int4(10)} <br>
     * @return The value of the column 'third_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getThirdId() {
        checkSpecifiedProperty("thirdId");
        return _thirdId;
    }

    /**
     * [set] third_id: {PK, NotNull, int4(10)} <br>
     * @param thirdId The value of the column 'third_id'. (basically NotNull if update: for the constraint)
     */
    public void setThirdId(Integer thirdId) {
        registerModifiedProperty("thirdId");
        _thirdId = thirdId;
    }

    /**
     * [get] wrong_name: {varchar(200)} <br>
     * @return The value of the column 'wrong_name'. (NullAllowed even if selected: for no constraint)
     */
    public String getWrongName() {
        checkSpecifiedProperty("wrongName");
        return _wrongName;
    }

    /**
     * [set] wrong_name: {varchar(200)} <br>
     * @param wrongName The value of the column 'wrong_name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWrongName(String wrongName) {
        registerModifiedProperty("wrongName");
        _wrongName = wrongName;
    }
}
