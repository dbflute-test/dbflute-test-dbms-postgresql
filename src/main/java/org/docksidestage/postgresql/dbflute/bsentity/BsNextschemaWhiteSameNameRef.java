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
 * The entity of nextschema.white_same_name_ref as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsNextschemaWhiteSameNameRef extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** same_name_ref_id: {PK, NotNull, int8(19)} */
    protected Long _sameNameRefId;

    /** same_name_id: {NotNull, int4(10), FK to white_same_name} */
    protected Integer _sameNameId;

    /** next_ref_date: {date(13)} */
    protected java.time.LocalDate _nextRefDate;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "nextschema.white_same_name_ref";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_sameNameRefId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** nextschema.white_same_name by my same_name_id, named 'whiteSameName'. */
    protected OptionalEntity<NextschemaWhiteSameName> _whiteSameName;

    /**
     * [get] nextschema.white_same_name by my same_name_id, named 'whiteSameName'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'whiteSameName'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<NextschemaWhiteSameName> getWhiteSameName() {
        if (_whiteSameName == null) { _whiteSameName = OptionalEntity.relationEmpty(this, "whiteSameName"); }
        return _whiteSameName;
    }

    /**
     * [set] nextschema.white_same_name by my same_name_id, named 'whiteSameName'.
     * @param whiteSameName The entity of foreign property 'whiteSameName'. (NullAllowed)
     */
    public void setWhiteSameName(OptionalEntity<NextschemaWhiteSameName> whiteSameName) {
        _whiteSameName = whiteSameName;
    }

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
        if (obj instanceof BsNextschemaWhiteSameNameRef) {
            BsNextschemaWhiteSameNameRef other = (BsNextschemaWhiteSameNameRef)obj;
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
        sb.append(dm).append(xfND(_nextRefDate));
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
    public NextschemaWhiteSameNameRef clone() {
        return (NextschemaWhiteSameNameRef)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] same_name_ref_id: {PK, NotNull, int8(19)} <br>
     * @return The value of the column 'same_name_ref_id'. (basically NotNull if selected: for the constraint)
     */
    public Long getSameNameRefId() {
        checkSpecifiedProperty("sameNameRefId");
        return _sameNameRefId;
    }

    /**
     * [set] same_name_ref_id: {PK, NotNull, int8(19)} <br>
     * @param sameNameRefId The value of the column 'same_name_ref_id'. (basically NotNull if update: for the constraint)
     */
    public void setSameNameRefId(Long sameNameRefId) {
        registerModifiedProperty("sameNameRefId");
        _sameNameRefId = sameNameRefId;
    }

    /**
     * [get] same_name_id: {NotNull, int4(10), FK to white_same_name} <br>
     * @return The value of the column 'same_name_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getSameNameId() {
        checkSpecifiedProperty("sameNameId");
        return _sameNameId;
    }

    /**
     * [set] same_name_id: {NotNull, int4(10), FK to white_same_name} <br>
     * @param sameNameId The value of the column 'same_name_id'. (basically NotNull if update: for the constraint)
     */
    public void setSameNameId(Integer sameNameId) {
        registerModifiedProperty("sameNameId");
        _sameNameId = sameNameId;
    }

    /**
     * [get] next_ref_date: {date(13)} <br>
     * @return The value of the column 'next_ref_date'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDate getNextRefDate() {
        checkSpecifiedProperty("nextRefDate");
        return _nextRefDate;
    }

    /**
     * [set] next_ref_date: {date(13)} <br>
     * @param nextRefDate The value of the column 'next_ref_date'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNextRefDate(java.time.LocalDate nextRefDate) {
        registerModifiedProperty("nextRefDate");
        _nextRefDate = nextRefDate;
    }
}
