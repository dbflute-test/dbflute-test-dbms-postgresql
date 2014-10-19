package org.docksidestage.postgresql.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.docksidestage.postgresql.dbflute.exentity.customize.*;

/**
 * The entity of PurchaseSummaryMember. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     member_id, member_name, birthdate, formalized_datetime, purchase_summary
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
 * java.util.Date birthdate = entity.getBirthdate();
 * java.sql.Timestamp formalizedDatetime = entity.getFormalizedDatetime();
 * Long purchaseSummary = entity.getPurchaseSummary();
 * entity.setMemberId(memberId);
 * entity.setMemberName(memberName);
 * entity.setBirthdate(birthdate);
 * entity.setFormalizedDatetime(formalizedDatetime);
 * entity.setPurchaseSummary(purchaseSummary);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsPurchaseSummaryMember extends AbstractEntity {

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

    /** (生年月日)birthdate: {date(13), refers to member.birthdate} */
    protected java.util.Date _birthdate;

    /** (正式会員日時)formalized_datetime: {timestamp(26, 3), refers to member.formalized_datetime} */
    protected java.sql.Timestamp _formalizedDatetime;

    /** purchase_summary: {int8(19)} */
    protected Long _purchaseSummary;


    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /** {@inheritDoc} */
    public String getTableDbName() {
        return "PurchaseSummaryMember";
    }

    /** {@inheritDoc} */
    public String getTablePropertyName() {
        return "purchaseSummaryMember";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public DBMeta getDBMeta() {
        return org.docksidestage.postgresql.dbflute.bsentity.customize.dbmeta.PurchaseSummaryMemberDbm.getInstance();
    }

    // ===================================================================================
    //                                                                         Primary Key
    //                                                                         ===========
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
    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsPurchaseSummaryMember) {
            BsPurchaseSummaryMember other = (BsPurchaseSummaryMember)obj;
            if (!xSV(_memberId, other._memberId)) { return false; }
            if (!xSV(_memberName, other._memberName)) { return false; }
            if (!xSV(_birthdate, other._birthdate)) { return false; }
            if (!xSV(_formalizedDatetime, other._formalizedDatetime)) { return false; }
            if (!xSV(_purchaseSummary, other._purchaseSummary)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _memberId);
        hs = xCH(hs, _memberName);
        hs = xCH(hs, _birthdate);
        hs = xCH(hs, _formalizedDatetime);
        hs = xCH(hs, _purchaseSummary);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(_memberId);
        sb.append(dm).append(_memberName);
        sb.append(dm).append(xfUD(_birthdate));
        sb.append(dm).append(_formalizedDatetime);
        sb.append(dm).append(_purchaseSummary);
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
    public PurchaseSummaryMember clone() {
        return (PurchaseSummaryMember)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (会員ID)member_id: {serial(10), refers to member.member_id} <br />
     * 会員を識別するID。連番として自動採番される。<br />
     * （会員IDだけに限らず）採番方法はDBMS次第。
     * @return The value of the column 'member_id'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getMemberId() {
        return _memberId;
    }

    /**
     * [set] (会員ID)member_id: {serial(10), refers to member.member_id} <br />
     * 会員を識別するID。連番として自動採番される。<br />
     * （会員IDだけに限らず）採番方法はDBMS次第。
     * @param memberId The value of the column 'member_id'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMemberId(Integer memberId) {
        __modifiedProperties.addPropertyName("memberId");
        _memberId = memberId;
    }

    /**
     * [get] (会員名称)member_name: {varchar(200), refers to member.member_name} <br />
     * 会員のフルネームの名称。<br />
     * 苗字と名前を分けて管理することも多いが、ここでは Example なので単純にひとまとめ。
     * @return The value of the column 'member_name'. (NullAllowed even if selected: for no constraint)
     */
    public String getMemberName() {
        return _memberName;
    }

    /**
     * [set] (会員名称)member_name: {varchar(200), refers to member.member_name} <br />
     * 会員のフルネームの名称。<br />
     * 苗字と名前を分けて管理することも多いが、ここでは Example なので単純にひとまとめ。
     * @param memberName The value of the column 'member_name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMemberName(String memberName) {
        __modifiedProperties.addPropertyName("memberName");
        _memberName = memberName;
    }

    /**
     * [get] (生年月日)birthdate: {date(13), refers to member.birthdate} <br />
     * 必須項目ではないので、このデータがない会員もいる。
     * @return The value of the column 'birthdate'. (NullAllowed even if selected: for no constraint)
     */
    public java.util.Date getBirthdate() {
        return _birthdate;
    }

    /**
     * [set] (生年月日)birthdate: {date(13), refers to member.birthdate} <br />
     * 必須項目ではないので、このデータがない会員もいる。
     * @param birthdate The value of the column 'birthdate'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBirthdate(java.util.Date birthdate) {
        __modifiedProperties.addPropertyName("birthdate");
        _birthdate = birthdate;
    }

    /**
     * [get] (正式会員日時)formalized_datetime: {timestamp(26, 3), refers to member.formalized_datetime} <br />
     * 会員が正式に確定した日時。<br />
     * 一度確定したら更新されない。
     * @return The value of the column 'formalized_datetime'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getFormalizedDatetime() {
        return _formalizedDatetime;
    }

    /**
     * [set] (正式会員日時)formalized_datetime: {timestamp(26, 3), refers to member.formalized_datetime} <br />
     * 会員が正式に確定した日時。<br />
     * 一度確定したら更新されない。
     * @param formalizedDatetime The value of the column 'formalized_datetime'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFormalizedDatetime(java.sql.Timestamp formalizedDatetime) {
        __modifiedProperties.addPropertyName("formalizedDatetime");
        _formalizedDatetime = formalizedDatetime;
    }

    /**
     * [get] purchase_summary: {int8(19)} <br />
     * @return The value of the column 'purchase_summary'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPurchaseSummary() {
        return _purchaseSummary;
    }

    /**
     * [set] purchase_summary: {int8(19)} <br />
     * @param purchaseSummary The value of the column 'purchase_summary'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPurchaseSummary(Long purchaseSummary) {
        __modifiedProperties.addPropertyName("purchaseSummary");
        _purchaseSummary = purchaseSummary;
    }
}
