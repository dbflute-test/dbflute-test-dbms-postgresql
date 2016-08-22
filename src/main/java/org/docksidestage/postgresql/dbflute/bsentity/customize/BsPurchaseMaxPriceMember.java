package org.docksidestage.postgresql.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import org.docksidestage.postgresql.dbflute.exentity.customize.*;

/**
 * The entity of PurchaseMaxPriceMember. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     member_id, member_name, purchase_max_price, member_status_name
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
 * Integer memberId = entity.getMemberId();
 * String memberName = entity.getMemberName();
 * Integer purchaseMaxPrice = entity.getPurchaseMaxPrice();
 * String memberStatusName = entity.getMemberStatusName();
 * entity.setMemberId(memberId);
 * entity.setMemberName(memberName);
 * entity.setPurchaseMaxPrice(purchaseMaxPrice);
 * entity.setMemberStatusName(memberStatusName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsPurchaseMaxPriceMember extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (会員ID)member_id: {serial(10), refers to member.member_id} */
    protected Integer _memberId;

    /** (会員名称)member_name: {varchar(200), refers to member.member_name} */
    protected String _memberName;

    /** purchase_max_price: {int4(10)} */
    protected Integer _purchaseMaxPrice;

    /** (会員ステータス名称)member_status_name: {varchar(50), refers to member_status.member_status_name} */
    protected String _memberStatusName;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return org.docksidestage.postgresql.dbflute.bsentity.customize.dbmeta.PurchaseMaxPriceMemberDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "PurchaseMaxPriceMember";
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
        if (obj instanceof BsPurchaseMaxPriceMember) {
            BsPurchaseMaxPriceMember other = (BsPurchaseMaxPriceMember)obj;
            if (!xSV(_memberId, other._memberId)) { return false; }
            if (!xSV(_memberName, other._memberName)) { return false; }
            if (!xSV(_purchaseMaxPrice, other._purchaseMaxPrice)) { return false; }
            if (!xSV(_memberStatusName, other._memberStatusName)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _memberId);
        hs = xCH(hs, _memberName);
        hs = xCH(hs, _purchaseMaxPrice);
        hs = xCH(hs, _memberStatusName);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_memberId));
        sb.append(dm).append(xfND(_memberName));
        sb.append(dm).append(xfND(_purchaseMaxPrice));
        sb.append(dm).append(xfND(_memberStatusName));
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
    public PurchaseMaxPriceMember clone() {
        return (PurchaseMaxPriceMember)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (会員ID)member_id: {serial(10), refers to member.member_id} <br>
     * 会員を識別するID。連番として自動採番される。<br>
     * （会員IDだけに限らず）採番方法はDBMS次第。
     * @return The value of the column 'member_id'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getMemberId() {
        checkSpecifiedProperty("memberId");
        return _memberId;
    }

    /**
     * [set] (会員ID)member_id: {serial(10), refers to member.member_id} <br>
     * 会員を識別するID。連番として自動採番される。<br>
     * （会員IDだけに限らず）採番方法はDBMS次第。
     * @param memberId The value of the column 'member_id'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMemberId(Integer memberId) {
        registerModifiedProperty("memberId");
        _memberId = memberId;
    }

    /**
     * [get] (会員名称)member_name: {varchar(200), refers to member.member_name} <br>
     * 会員のフルネームの名称。<br>
     * 苗字と名前を分けて管理することも多いが、ここでは Example なので単純にひとまとめ。<br>
     * // member's name
     * @return The value of the column 'member_name'. (NullAllowed even if selected: for no constraint)
     */
    public String getMemberName() {
        checkSpecifiedProperty("memberName");
        return _memberName;
    }

    /**
     * [set] (会員名称)member_name: {varchar(200), refers to member.member_name} <br>
     * 会員のフルネームの名称。<br>
     * 苗字と名前を分けて管理することも多いが、ここでは Example なので単純にひとまとめ。<br>
     * // member's name
     * @param memberName The value of the column 'member_name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMemberName(String memberName) {
        registerModifiedProperty("memberName");
        _memberName = memberName;
    }

    /**
     * [get] purchase_max_price: {int4(10)} <br>
     * // max price of the member's purchases
     * @return The value of the column 'purchase_max_price'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getPurchaseMaxPrice() {
        checkSpecifiedProperty("purchaseMaxPrice");
        return _purchaseMaxPrice;
    }

    /**
     * [set] purchase_max_price: {int4(10)} <br>
     * // max price of the member's purchases
     * @param purchaseMaxPrice The value of the column 'purchase_max_price'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPurchaseMaxPrice(Integer purchaseMaxPrice) {
        registerModifiedProperty("purchaseMaxPrice");
        _purchaseMaxPrice = purchaseMaxPrice;
    }

    /**
     * [get] (会員ステータス名称)member_status_name: {varchar(50), refers to member_status.member_status_name} <br>
     * @return The value of the column 'member_status_name'. (NullAllowed even if selected: for no constraint)
     */
    public String getMemberStatusName() {
        checkSpecifiedProperty("memberStatusName");
        return _memberStatusName;
    }

    /**
     * [set] (会員ステータス名称)member_status_name: {varchar(50), refers to member_status.member_status_name} <br>
     * @param memberStatusName The value of the column 'member_status_name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMemberStatusName(String memberStatusName) {
        registerModifiedProperty("memberStatusName");
        _memberStatusName = memberStatusName;
    }
}
