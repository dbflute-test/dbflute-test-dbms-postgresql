package org.docksidestage.postgresql.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import org.docksidestage.postgresql.dbflute.exentity.customize.*;

/**
 * The entity of MemberMonthlyPurchase.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMemberMonthlyPurchase extends AbstractEntity implements CustomizeEntity {

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

    /** purchase_month: {timestamp(29, 6)} */
    protected java.time.LocalDateTime _purchaseMonth;

    /** purchase_price_avg: {numeric(131089)} */
    protected java.math.BigDecimal _purchasePriceAvg;

    /** purchase_price_max: {int4(10)} */
    protected Integer _purchasePriceMax;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return org.docksidestage.postgresql.dbflute.bsentity.customize.dbmeta.MemberMonthlyPurchaseDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "MemberMonthlyPurchase";
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
        if (obj instanceof BsMemberMonthlyPurchase) {
            BsMemberMonthlyPurchase other = (BsMemberMonthlyPurchase)obj;
            if (!xSV(_memberId, other._memberId)) { return false; }
            if (!xSV(_memberName, other._memberName)) { return false; }
            if (!xSV(_purchaseMonth, other._purchaseMonth)) { return false; }
            if (!xSV(_purchasePriceAvg, other._purchasePriceAvg)) { return false; }
            if (!xSV(_purchasePriceMax, other._purchasePriceMax)) { return false; }
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
        hs = xCH(hs, _purchaseMonth);
        hs = xCH(hs, _purchasePriceAvg);
        hs = xCH(hs, _purchasePriceMax);
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
        sb.append(dm).append(xfND(_purchaseMonth));
        sb.append(dm).append(xfND(_purchasePriceAvg));
        sb.append(dm).append(xfND(_purchasePriceMax));
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
    public MemberMonthlyPurchase clone() {
        return (MemberMonthlyPurchase)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (会員ID)member_id: {serial(10), refers to member.member_id} <br>
     * 会員を識別するID。連番として自動採番される。<br>
     * （会員IDだけに限らず）採番方法はDBMS次第。<br>
     * // grouping item
     * @return The value of the column 'member_id'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getMemberId() {
        checkSpecifiedProperty("memberId");
        return _memberId;
    }

    /**
     * [set] (会員ID)member_id: {serial(10), refers to member.member_id} <br>
     * 会員を識別するID。連番として自動採番される。<br>
     * （会員IDだけに限らず）採番方法はDBMS次第。<br>
     * // grouping item
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
     * // non grouping item is allowed on PostgreSQL
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
     * // non grouping item is allowed on PostgreSQL
     * @param memberName The value of the column 'member_name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMemberName(String memberName) {
        registerModifiedProperty("memberName");
        _memberName = memberName;
    }

    /**
     * [get] purchase_month: {timestamp(29, 6)} <br>
     * // grouping item, depends on DBMS
     * @return The value of the column 'purchase_month'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getPurchaseMonth() {
        checkSpecifiedProperty("purchaseMonth");
        return _purchaseMonth;
    }

    /**
     * [set] purchase_month: {timestamp(29, 6)} <br>
     * // grouping item, depends on DBMS
     * @param purchaseMonth The value of the column 'purchase_month'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPurchaseMonth(java.time.LocalDateTime purchaseMonth) {
        registerModifiedProperty("purchaseMonth");
        _purchaseMonth = purchaseMonth;
    }

    /**
     * [get] purchase_price_avg: {numeric(131089)} <br>
     * // aggregation item
     * @return The value of the column 'purchase_price_avg'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPurchasePriceAvg() {
        checkSpecifiedProperty("purchasePriceAvg");
        return _purchasePriceAvg;
    }

    /**
     * [set] purchase_price_avg: {numeric(131089)} <br>
     * // aggregation item
     * @param purchasePriceAvg The value of the column 'purchase_price_avg'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPurchasePriceAvg(java.math.BigDecimal purchasePriceAvg) {
        registerModifiedProperty("purchasePriceAvg");
        _purchasePriceAvg = purchasePriceAvg;
    }

    /**
     * [get] purchase_price_max: {int4(10)} <br>
     * // me too
     * @return The value of the column 'purchase_price_max'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getPurchasePriceMax() {
        checkSpecifiedProperty("purchasePriceMax");
        return _purchasePriceMax;
    }

    /**
     * [set] purchase_price_max: {int4(10)} <br>
     * // me too
     * @param purchasePriceMax The value of the column 'purchase_price_max'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPurchasePriceMax(Integer purchasePriceMax) {
        registerModifiedProperty("purchasePriceMax");
        _purchasePriceMax = purchasePriceMax;
    }
}
