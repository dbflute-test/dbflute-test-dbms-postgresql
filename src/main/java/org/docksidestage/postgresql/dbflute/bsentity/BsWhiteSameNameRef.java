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
 * The entity of white_same_name_ref as TABLE. <br>
 * <pre>
 * [primary-key]
 *     same_name_ref_id
 * 
 * [column]
 *     same_name_ref_id, same_name_id, next_same_name_id
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
 *     white_same_name
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     whiteSameName
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer sameNameRefId = entity.getSameNameRefId();
 * Long sameNameId = entity.getSameNameId();
 * Long nextSameNameId = entity.getNextSameNameId();
 * entity.setSameNameRefId(sameNameRefId);
 * entity.setSameNameId(sameNameId);
 * entity.setNextSameNameId(nextSameNameId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteSameNameRef extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** same_name_ref_id: {PK, NotNull, int4(10)} */
    protected Integer _sameNameRefId;

    /** same_name_id: {NotNull, int8(19), FK to white_same_name} */
    protected Long _sameNameId;

    /** next_same_name_id: {NotNull, int8(19)} */
    protected Long _nextSameNameId;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "white_same_name_ref";
    }

    // ===================================================================================
    //                                                                         Primary Key
    //                                                                         ===========
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_sameNameRefId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** white_same_name by my same_name_id, named 'whiteSameName'. */
    protected OptionalEntity<WhiteSameName> _whiteSameName;

    /**
     * [get] white_same_name by my same_name_id, named 'whiteSameName'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'whiteSameName'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<WhiteSameName> getWhiteSameName() {
        if (_whiteSameName == null) { _whiteSameName = OptionalEntity.relationEmpty(this, "whiteSameName"); }
        return _whiteSameName;
    }

    /**
     * [set] white_same_name by my same_name_id, named 'whiteSameName'.
     * @param whiteSameName The entity of foreign property 'whiteSameName'. (NullAllowed)
     */
    public void setWhiteSameName(OptionalEntity<WhiteSameName> whiteSameName) {
        _whiteSameName = whiteSameName;
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
        if (obj instanceof BsWhiteSameNameRef) {
            BsWhiteSameNameRef other = (BsWhiteSameNameRef)obj;
            if (!xSV(_sameNameRefId, other._sameNameRefId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _sameNameRefId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteSameName != null && _whiteSameName.isPresent())
        { sb.append(li).append(xbRDS(_whiteSameName, "whiteSameName")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_sameNameRefId));
        sb.append(dm).append(xfND(_sameNameId));
        sb.append(dm).append(xfND(_nextSameNameId));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteSameName != null && _whiteSameName.isPresent())
        { sb.append(dm).append("whiteSameName"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteSameNameRef clone() {
        return (WhiteSameNameRef)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] same_name_ref_id: {PK, NotNull, int4(10)} <br>
     * @return The value of the column 'same_name_ref_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getSameNameRefId() {
        checkSpecifiedProperty("sameNameRefId");
        return _sameNameRefId;
    }

    /**
     * [set] same_name_ref_id: {PK, NotNull, int4(10)} <br>
     * @param sameNameRefId The value of the column 'same_name_ref_id'. (basically NotNull if update: for the constraint)
     */
    public void setSameNameRefId(Integer sameNameRefId) {
        registerModifiedProperty("sameNameRefId");
        _sameNameRefId = sameNameRefId;
    }

    /**
     * [get] same_name_id: {NotNull, int8(19), FK to white_same_name} <br>
     * @return The value of the column 'same_name_id'. (basically NotNull if selected: for the constraint)
     */
    public Long getSameNameId() {
        checkSpecifiedProperty("sameNameId");
        return _sameNameId;
    }

    /**
     * [set] same_name_id: {NotNull, int8(19), FK to white_same_name} <br>
     * @param sameNameId The value of the column 'same_name_id'. (basically NotNull if update: for the constraint)
     */
    public void setSameNameId(Long sameNameId) {
        registerModifiedProperty("sameNameId");
        _sameNameId = sameNameId;
    }

    /**
     * [get] next_same_name_id: {NotNull, int8(19)} <br>
     * @return The value of the column 'next_same_name_id'. (basically NotNull if selected: for the constraint)
     */
    public Long getNextSameNameId() {
        checkSpecifiedProperty("nextSameNameId");
        return _nextSameNameId;
    }

    /**
     * [set] next_same_name_id: {NotNull, int8(19)} <br>
     * @param nextSameNameId The value of the column 'next_same_name_id'. (basically NotNull if update: for the constraint)
     */
    public void setNextSameNameId(Long nextSameNameId) {
        registerModifiedProperty("nextSameNameId");
        _nextSameNameId = nextSameNameId;
    }
}
