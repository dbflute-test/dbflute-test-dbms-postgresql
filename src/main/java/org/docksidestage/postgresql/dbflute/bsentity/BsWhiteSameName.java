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
 * The entity of white_same_name as TABLE. <br>
 * <pre>
 * [primary-key]
 *     same_name_id
 *
 * [column]
 *     same_name_id, same_name_name, same_name_integer, next_schema_product_id
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
 *     next_schema_product
 *
 * [referrer table]
 *     white_same_name_ref
 *
 * [foreign property]
 *     nextSchemaProduct
 *
 * [referrer property]
 *     whiteSameNameRefList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long sameNameId = entity.getSameNameId();
 * String sameNameName = entity.getSameNameName();
 * Integer sameNameInteger = entity.getSameNameInteger();
 * Integer nextSchemaProductId = entity.getNextSchemaProductId();
 * entity.setSameNameId(sameNameId);
 * entity.setSameNameName(sameNameName);
 * entity.setSameNameInteger(sameNameInteger);
 * entity.setNextSchemaProductId(nextSchemaProductId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteSameName extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** same_name_id: {PK, NotNull, int8(19)} */
    protected Long _sameNameId;

    /** same_name_name: {varchar(200)} */
    protected String _sameNameName;

    /** same_name_integer: {int4(10)} */
    protected Integer _sameNameInteger;

    /** next_schema_product_id: {int4(10), FK to NEXT_SCHEMA_PRODUCT} */
    protected Integer _nextSchemaProductId;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "white_same_name";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_sameNameId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** next_schema_product by my next_schema_product_id, named 'nextSchemaProduct'. */
    protected OptionalEntity<NextSchemaProduct> _nextSchemaProduct;

    /**
     * [get] next_schema_product by my next_schema_product_id, named 'nextSchemaProduct'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'nextSchemaProduct'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<NextSchemaProduct> getNextSchemaProduct() {
        if (_nextSchemaProduct == null) { _nextSchemaProduct = OptionalEntity.relationEmpty(this, "nextSchemaProduct"); }
        return _nextSchemaProduct;
    }

    /**
     * [set] next_schema_product by my next_schema_product_id, named 'nextSchemaProduct'.
     * @param nextSchemaProduct The entity of foreign property 'nextSchemaProduct'. (NullAllowed)
     */
    public void setNextSchemaProduct(OptionalEntity<NextSchemaProduct> nextSchemaProduct) {
        _nextSchemaProduct = nextSchemaProduct;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** white_same_name_ref by same_name_id, named 'whiteSameNameRefList'. */
    protected List<WhiteSameNameRef> _whiteSameNameRefList;

    /**
     * [get] white_same_name_ref by same_name_id, named 'whiteSameNameRefList'.
     * @return The entity list of referrer property 'whiteSameNameRefList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhiteSameNameRef> getWhiteSameNameRefList() {
        if (_whiteSameNameRefList == null) { _whiteSameNameRefList = newReferrerList(); }
        return _whiteSameNameRefList;
    }

    /**
     * [set] white_same_name_ref by same_name_id, named 'whiteSameNameRefList'.
     * @param whiteSameNameRefList The entity list of referrer property 'whiteSameNameRefList'. (NullAllowed)
     */
    public void setWhiteSameNameRefList(List<WhiteSameNameRef> whiteSameNameRefList) {
        _whiteSameNameRefList = whiteSameNameRefList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhiteSameName) {
            BsWhiteSameName other = (BsWhiteSameName)obj;
            if (!xSV(_sameNameId, other._sameNameId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _sameNameId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_nextSchemaProduct != null && _nextSchemaProduct.isPresent())
        { sb.append(li).append(xbRDS(_nextSchemaProduct, "nextSchemaProduct")); }
        if (_whiteSameNameRefList != null) { for (WhiteSameNameRef et : _whiteSameNameRefList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whiteSameNameRefList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_sameNameId));
        sb.append(dm).append(xfND(_sameNameName));
        sb.append(dm).append(xfND(_sameNameInteger));
        sb.append(dm).append(xfND(_nextSchemaProductId));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_nextSchemaProduct != null && _nextSchemaProduct.isPresent())
        { sb.append(dm).append("nextSchemaProduct"); }
        if (_whiteSameNameRefList != null && !_whiteSameNameRefList.isEmpty())
        { sb.append(dm).append("whiteSameNameRefList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteSameName clone() {
        return (WhiteSameName)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] same_name_id: {PK, NotNull, int8(19)} <br>
     * @return The value of the column 'same_name_id'. (basically NotNull if selected: for the constraint)
     */
    public Long getSameNameId() {
        checkSpecifiedProperty("sameNameId");
        return _sameNameId;
    }

    /**
     * [set] same_name_id: {PK, NotNull, int8(19)} <br>
     * @param sameNameId The value of the column 'same_name_id'. (basically NotNull if update: for the constraint)
     */
    public void setSameNameId(Long sameNameId) {
        registerModifiedProperty("sameNameId");
        _sameNameId = sameNameId;
    }

    /**
     * [get] same_name_name: {varchar(200)} <br>
     * @return The value of the column 'same_name_name'. (NullAllowed even if selected: for no constraint)
     */
    public String getSameNameName() {
        checkSpecifiedProperty("sameNameName");
        return _sameNameName;
    }

    /**
     * [set] same_name_name: {varchar(200)} <br>
     * @param sameNameName The value of the column 'same_name_name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSameNameName(String sameNameName) {
        registerModifiedProperty("sameNameName");
        _sameNameName = sameNameName;
    }

    /**
     * [get] same_name_integer: {int4(10)} <br>
     * @return The value of the column 'same_name_integer'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getSameNameInteger() {
        checkSpecifiedProperty("sameNameInteger");
        return _sameNameInteger;
    }

    /**
     * [set] same_name_integer: {int4(10)} <br>
     * @param sameNameInteger The value of the column 'same_name_integer'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSameNameInteger(Integer sameNameInteger) {
        registerModifiedProperty("sameNameInteger");
        _sameNameInteger = sameNameInteger;
    }

    /**
     * [get] next_schema_product_id: {int4(10), FK to NEXT_SCHEMA_PRODUCT} <br>
     * @return The value of the column 'next_schema_product_id'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getNextSchemaProductId() {
        checkSpecifiedProperty("nextSchemaProductId");
        return _nextSchemaProductId;
    }

    /**
     * [set] next_schema_product_id: {int4(10), FK to NEXT_SCHEMA_PRODUCT} <br>
     * @param nextSchemaProductId The value of the column 'next_schema_product_id'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNextSchemaProductId(Integer nextSchemaProductId) {
        registerModifiedProperty("nextSchemaProductId");
        _nextSchemaProductId = nextSchemaProductId;
    }
}
