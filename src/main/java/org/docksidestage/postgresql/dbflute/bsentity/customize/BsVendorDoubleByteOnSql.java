package org.docksidestage.postgresql.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.docksidestage.postgresql.dbflute.exentity.customize.*;

/**
 * The entity of VendorDoubleByteOnSql. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     member_id, member_name_with_space, member_status_name
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
 * String memberNameWithSpace = entity.getMemberNameWithSpace();
 * String memberStatusName = entity.getMemberStatusName();
 * entity.setMemberId(memberId);
 * entity.setMemberNameWithSpace(memberNameWithSpace);
 * entity.setMemberStatusName(memberStatusName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendorDoubleByteOnSql extends AbstractEntity {

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

    /** member_name_with_space: {text(2147483647)} */
    protected String _memberNameWithSpace;

    /** (会員ステータス名称)member_status_name: {varchar(50), refers to member_status.member_status_name} */
    protected String _memberStatusName;


    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /** {@inheritDoc} */
    public String getTableDbName() {
        return "VendorDoubleByteOnSql";
    }

    /** {@inheritDoc} */
    public String getTablePropertyName() {
        return "vendorDoubleByteOnSql";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public DBMeta getDBMeta() {
        return org.docksidestage.postgresql.dbflute.bsentity.customize.dbmeta.VendorDoubleByteOnSqlDbm.getInstance();
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
        if (obj instanceof BsVendorDoubleByteOnSql) {
            BsVendorDoubleByteOnSql other = (BsVendorDoubleByteOnSql)obj;
            if (!xSV(_memberId, other._memberId)) { return false; }
            if (!xSV(_memberNameWithSpace, other._memberNameWithSpace)) { return false; }
            if (!xSV(_memberStatusName, other._memberStatusName)) { return false; }
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
        hs = xCH(hs, _memberNameWithSpace);
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
        sb.append(dm).append(_memberId);
        sb.append(dm).append(_memberNameWithSpace);
        sb.append(dm).append(_memberStatusName);
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
    public VendorDoubleByteOnSql clone() {
        return (VendorDoubleByteOnSql)super.clone();
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
     * [get] member_name_with_space: {text(2147483647)} <br />
     * @return The value of the column 'member_name_with_space'. (NullAllowed even if selected: for no constraint)
     */
    public String getMemberNameWithSpace() {
        return _memberNameWithSpace;
    }

    /**
     * [set] member_name_with_space: {text(2147483647)} <br />
     * @param memberNameWithSpace The value of the column 'member_name_with_space'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMemberNameWithSpace(String memberNameWithSpace) {
        __modifiedProperties.addPropertyName("memberNameWithSpace");
        _memberNameWithSpace = memberNameWithSpace;
    }

    /**
     * [get] (会員ステータス名称)member_status_name: {varchar(50), refers to member_status.member_status_name} <br />
     * @return The value of the column 'member_status_name'. (NullAllowed even if selected: for no constraint)
     */
    public String getMemberStatusName() {
        return _memberStatusName;
    }

    /**
     * [set] (会員ステータス名称)member_status_name: {varchar(50), refers to member_status.member_status_name} <br />
     * @param memberStatusName The value of the column 'member_status_name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMemberStatusName(String memberStatusName) {
        __modifiedProperties.addPropertyName("memberStatusName");
        _memberStatusName = memberStatusName;
    }
}
