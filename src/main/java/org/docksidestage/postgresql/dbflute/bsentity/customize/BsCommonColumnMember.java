package org.docksidestage.postgresql.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import org.docksidestage.postgresql.dbflute.allcommon.EntityDefinedCommonColumn;
import org.docksidestage.postgresql.dbflute.exentity.customize.*;

/**
 * The entity of CommonColumnMember.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsCommonColumnMember extends AbstractEntity implements CustomizeEntity, EntityDefinedCommonColumn {

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

    /** (登録日時)register_datetime: {timestamp(26, 3), refers to member.register_datetime} */
    protected java.time.LocalDateTime _registerDatetime;

    /** (登録ユーザ)register_user: {varchar(200), refers to member.register_user} */
    protected String _registerUser;

    /** register_process: {varchar(200), refers to member.register_process} */
    protected String _registerProcess;

    /** (更新日時)update_datetime: {timestamp(26, 3), refers to member.update_datetime} */
    protected java.time.LocalDateTime _updateDatetime;

    /** (更新ユーザ)update_user: {varchar(200), refers to member.update_user} */
    protected String _updateUser;

    /** update_process: {varchar(200), refers to member.update_process} */
    protected String _updateProcess;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return org.docksidestage.postgresql.dbflute.bsentity.customize.dbmeta.CommonColumnMemberDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "CommonColumnMember";
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
        if (obj instanceof BsCommonColumnMember) {
            BsCommonColumnMember other = (BsCommonColumnMember)obj;
            if (!xSV(_memberId, other._memberId)) { return false; }
            if (!xSV(_memberName, other._memberName)) { return false; }
            if (!xSV(_registerDatetime, other._registerDatetime)) { return false; }
            if (!xSV(_registerUser, other._registerUser)) { return false; }
            if (!xSV(_registerProcess, other._registerProcess)) { return false; }
            if (!xSV(_updateDatetime, other._updateDatetime)) { return false; }
            if (!xSV(_updateUser, other._updateUser)) { return false; }
            if (!xSV(_updateProcess, other._updateProcess)) { return false; }
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
        hs = xCH(hs, _registerDatetime);
        hs = xCH(hs, _registerUser);
        hs = xCH(hs, _registerProcess);
        hs = xCH(hs, _updateDatetime);
        hs = xCH(hs, _updateUser);
        hs = xCH(hs, _updateProcess);
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
        sb.append(dm).append(xfND(_registerDatetime));
        sb.append(dm).append(xfND(_registerUser));
        sb.append(dm).append(xfND(_registerProcess));
        sb.append(dm).append(xfND(_updateDatetime));
        sb.append(dm).append(xfND(_updateUser));
        sb.append(dm).append(xfND(_updateProcess));
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
    public CommonColumnMember clone() {
        return (CommonColumnMember)super.clone();
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
     * 苗字と名前を分けて管理することも多いが、ここでは Example なので単純にひとまとめ。
     * @return The value of the column 'member_name'. (NullAllowed even if selected: for no constraint)
     */
    public String getMemberName() {
        checkSpecifiedProperty("memberName");
        return _memberName;
    }

    /**
     * [set] (会員名称)member_name: {varchar(200), refers to member.member_name} <br>
     * 会員のフルネームの名称。<br>
     * 苗字と名前を分けて管理することも多いが、ここでは Example なので単純にひとまとめ。
     * @param memberName The value of the column 'member_name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMemberName(String memberName) {
        registerModifiedProperty("memberName");
        _memberName = memberName;
    }

    /**
     * [get] (登録日時)register_datetime: {timestamp(26, 3), refers to member.register_datetime} <br>
     * レコードが登録された日時。<br>
     * 会員が登録された日時とほぼ等しいが、そういった業務的な役割を兼務させるのはあまり推奨されない。<br>
     * どのテーブルでも同じなので、共通カラムの説明はこのテーブルでしか書かない。
     * @return The value of the column 'register_datetime'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getRegisterDatetime() {
        checkSpecifiedProperty("registerDatetime");
        return _registerDatetime;
    }

    /**
     * [set] (登録日時)register_datetime: {timestamp(26, 3), refers to member.register_datetime} <br>
     * レコードが登録された日時。<br>
     * 会員が登録された日時とほぼ等しいが、そういった業務的な役割を兼務させるのはあまり推奨されない。<br>
     * どのテーブルでも同じなので、共通カラムの説明はこのテーブルでしか書かない。
     * @param registerDatetime The value of the column 'register_datetime'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRegisterDatetime(java.time.LocalDateTime registerDatetime) {
        registerModifiedProperty("registerDatetime");
        _registerDatetime = registerDatetime;
    }

    /**
     * [get] (登録ユーザ)register_user: {varchar(200), refers to member.register_user} <br>
     * レコードを登録したユーザ。<br>
     * 会員テーブルであれば当然、会員自身であるはずだが、他のテーブルの場合では管理画面から運用者による登録など考えられるので、しっかり保持しておく。
     * @return The value of the column 'register_user'. (NullAllowed even if selected: for no constraint)
     */
    public String getRegisterUser() {
        checkSpecifiedProperty("registerUser");
        return _registerUser;
    }

    /**
     * [set] (登録ユーザ)register_user: {varchar(200), refers to member.register_user} <br>
     * レコードを登録したユーザ。<br>
     * 会員テーブルであれば当然、会員自身であるはずだが、他のテーブルの場合では管理画面から運用者による登録など考えられるので、しっかり保持しておく。
     * @param registerUser The value of the column 'register_user'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRegisterUser(String registerUser) {
        registerModifiedProperty("registerUser");
        _registerUser = registerUser;
    }

    /**
     * [get] register_process: {varchar(200), refers to member.register_process} <br>
     * @return The value of the column 'register_process'. (NullAllowed even if selected: for no constraint)
     */
    public String getRegisterProcess() {
        checkSpecifiedProperty("registerProcess");
        return _registerProcess;
    }

    /**
     * [set] register_process: {varchar(200), refers to member.register_process} <br>
     * @param registerProcess The value of the column 'register_process'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRegisterProcess(String registerProcess) {
        registerModifiedProperty("registerProcess");
        _registerProcess = registerProcess;
    }

    /**
     * [get] (更新日時)update_datetime: {timestamp(26, 3), refers to member.update_datetime} <br>
     * レコードが（最後に）更新された日時。<br>
     * 業務的な利用はあまり推奨されないと別項目で説明したが、このカラムはソートの要素としてよく利用される。
     * @return The value of the column 'update_datetime'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getUpdateDatetime() {
        checkSpecifiedProperty("updateDatetime");
        return _updateDatetime;
    }

    /**
     * [set] (更新日時)update_datetime: {timestamp(26, 3), refers to member.update_datetime} <br>
     * レコードが（最後に）更新された日時。<br>
     * 業務的な利用はあまり推奨されないと別項目で説明したが、このカラムはソートの要素としてよく利用される。
     * @param updateDatetime The value of the column 'update_datetime'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdateDatetime(java.time.LocalDateTime updateDatetime) {
        registerModifiedProperty("updateDatetime");
        _updateDatetime = updateDatetime;
    }

    /**
     * [get] (更新ユーザ)update_user: {varchar(200), refers to member.update_user} <br>
     * レコードを更新したユーザ。<br>
     * システムは誰が何をしたのかちゃんと覚えている。
     * @return The value of the column 'update_user'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdateUser() {
        checkSpecifiedProperty("updateUser");
        return _updateUser;
    }

    /**
     * [set] (更新ユーザ)update_user: {varchar(200), refers to member.update_user} <br>
     * レコードを更新したユーザ。<br>
     * システムは誰が何をしたのかちゃんと覚えている。
     * @param updateUser The value of the column 'update_user'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdateUser(String updateUser) {
        registerModifiedProperty("updateUser");
        _updateUser = updateUser;
    }

    /**
     * [get] update_process: {varchar(200), refers to member.update_process} <br>
     * @return The value of the column 'update_process'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdateProcess() {
        checkSpecifiedProperty("updateProcess");
        return _updateProcess;
    }

    /**
     * [set] update_process: {varchar(200), refers to member.update_process} <br>
     * @param updateProcess The value of the column 'update_process'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdateProcess(String updateProcess) {
        registerModifiedProperty("updateProcess");
        _updateProcess = updateProcess;
    }
}
