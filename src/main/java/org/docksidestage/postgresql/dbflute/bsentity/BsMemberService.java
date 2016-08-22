package org.docksidestage.postgresql.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import org.docksidestage.postgresql.dbflute.allcommon.EntityDefinedCommonColumn;
import org.docksidestage.postgresql.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.postgresql.dbflute.allcommon.CDef;
import org.docksidestage.postgresql.dbflute.exentity.*;

/**
 * The entity of (会員サービス)member_service as TABLE. <br>
 * 会員のサービス情報（ポイントサービスなど）。<br>
 * ExampleDBとして、あえて統一性を崩してユニーク制約経由の one-to-one を表現している。
 * <pre>
 * [primary-key]
 *     member_service_id
 *
 * [column]
 *     member_service_id, member_id, service_point_count, service_rank_code, register_datetime, register_process, register_user, update_datetime, update_process, update_user, version_no
 *
 * [sequence]
 *     member_service_member_service_id_seq
 *
 * [identity]
 *     
 *
 * [version-no]
 *     version_no
 *
 * [foreign table]
 *     member, service_rank
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     member, serviceRank
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer memberServiceId = entity.getMemberServiceId();
 * Integer memberId = entity.getMemberId();
 * Integer servicePointCount = entity.getServicePointCount();
 * String serviceRankCode = entity.getServiceRankCode();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerProcess = entity.getRegisterProcess();
 * String registerUser = entity.getRegisterUser();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateProcess = entity.getUpdateProcess();
 * String updateUser = entity.getUpdateUser();
 * Long versionNo = entity.getVersionNo();
 * entity.setMemberServiceId(memberServiceId);
 * entity.setMemberId(memberId);
 * entity.setServicePointCount(servicePointCount);
 * entity.setServiceRankCode(serviceRankCode);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterProcess(registerProcess);
 * entity.setRegisterUser(registerUser);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateProcess(updateProcess);
 * entity.setUpdateUser(updateUser);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMemberService extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (会員サービスID)member_service_id: {PK, ID, NotNull, serial(10)} */
    protected Integer _memberServiceId;

    /** (会員ID)member_id: {UQ, NotNull, int4(10), FK to member} */
    protected Integer _memberId;

    /** (サービスポイント数)service_point_count: {IX, NotNull, int4(10)} */
    protected Integer _servicePointCount;

    /** (サービスランクコード)service_rank_code: {NotNull, bpchar(3), FK to service_rank, classification=ServiceRank} */
    protected String _serviceRankCode;

    /** register_datetime: {NotNull, timestamp(26, 3)} */
    protected java.time.LocalDateTime _registerDatetime;

    /** register_process: {NotNull, varchar(200)} */
    protected String _registerProcess;

    /** register_user: {NotNull, varchar(200)} */
    protected String _registerUser;

    /** update_datetime: {NotNull, timestamp(26, 3)} */
    protected java.time.LocalDateTime _updateDatetime;

    /** update_process: {NotNull, varchar(200)} */
    protected String _updateProcess;

    /** update_user: {NotNull, varchar(200)} */
    protected String _updateUser;

    /** version_no: {NotNull, int8(19)} */
    protected Long _versionNo;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "member_service";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_memberServiceId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param memberId (会員ID): UQ, NotNull, int4(10), FK to member. (NotNull)
     */
    public void uniqueBy(Integer memberId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("memberId");
        setMemberId(memberId);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of serviceRankCode as the classification of ServiceRank. <br>
     * (サービスランクコード)service_rank_code: {NotNull, bpchar(3), FK to service_rank, classification=ServiceRank} <br>
     * 会員が受けられるサービスのランクを示す
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ServiceRank getServiceRankCodeAsServiceRank() {
        return CDef.ServiceRank.codeOf(getServiceRankCode());
    }

    /**
     * Set the value of serviceRankCode as the classification of ServiceRank. <br>
     * (サービスランクコード)service_rank_code: {NotNull, bpchar(3), FK to service_rank, classification=ServiceRank} <br>
     * 会員が受けられるサービスのランクを示す
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setServiceRankCodeAsServiceRank(CDef.ServiceRank cdef) {
        setServiceRankCode(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of serviceRankCode as Platinum (PLT). <br>
     * PLATINUM: platinum rank
     */
    public void setServiceRankCode_Platinum() {
        setServiceRankCodeAsServiceRank(CDef.ServiceRank.Platinum);
    }

    /**
     * Set the value of serviceRankCode as Gold (GLD). <br>
     * GOLD: gold rank
     */
    public void setServiceRankCode_Gold() {
        setServiceRankCodeAsServiceRank(CDef.ServiceRank.Gold);
    }

    /**
     * Set the value of serviceRankCode as Silver (SIL). <br>
     * SILVER: silver rank
     */
    public void setServiceRankCode_Silver() {
        setServiceRankCodeAsServiceRank(CDef.ServiceRank.Silver);
    }

    /**
     * Set the value of serviceRankCode as Bronze (BRZ). <br>
     * BRONZE: bronze rank
     */
    public void setServiceRankCode_Bronze() {
        setServiceRankCodeAsServiceRank(CDef.ServiceRank.Bronze);
    }

    /**
     * Set the value of serviceRankCode as Plastic (PLS). <br>
     * PLASTIC: plastic rank (deprecated: テーブル区分値の非推奨要素指定のテストのため)
     */
    @Deprecated
    public void setServiceRankCode_Plastic() {
        setServiceRankCodeAsServiceRank(CDef.ServiceRank.Plastic);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of serviceRankCode Platinum? <br>
     * PLATINUM: platinum rank
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isServiceRankCodePlatinum() {
        CDef.ServiceRank cdef = getServiceRankCodeAsServiceRank();
        return cdef != null ? cdef.equals(CDef.ServiceRank.Platinum) : false;
    }

    /**
     * Is the value of serviceRankCode Gold? <br>
     * GOLD: gold rank
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isServiceRankCodeGold() {
        CDef.ServiceRank cdef = getServiceRankCodeAsServiceRank();
        return cdef != null ? cdef.equals(CDef.ServiceRank.Gold) : false;
    }

    /**
     * Is the value of serviceRankCode Silver? <br>
     * SILVER: silver rank
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isServiceRankCodeSilver() {
        CDef.ServiceRank cdef = getServiceRankCodeAsServiceRank();
        return cdef != null ? cdef.equals(CDef.ServiceRank.Silver) : false;
    }

    /**
     * Is the value of serviceRankCode Bronze? <br>
     * BRONZE: bronze rank
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isServiceRankCodeBronze() {
        CDef.ServiceRank cdef = getServiceRankCodeAsServiceRank();
        return cdef != null ? cdef.equals(CDef.ServiceRank.Bronze) : false;
    }

    /**
     * Is the value of serviceRankCode Plastic? <br>
     * PLASTIC: plastic rank (deprecated: テーブル区分値の非推奨要素指定のテストのため)
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    @Deprecated
    public boolean isServiceRankCodePlastic() {
        CDef.ServiceRank cdef = getServiceRankCodeAsServiceRank();
        return cdef != null ? cdef.equals(CDef.ServiceRank.Plastic) : false;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** (会員)member by my member_id, named 'member'. */
    protected OptionalEntity<Member> _member;

    /**
     * [get] (会員)member by my member_id, named 'member'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'member'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Member> getMember() {
        if (_member == null) { _member = OptionalEntity.relationEmpty(this, "member"); }
        return _member;
    }

    /**
     * [set] (会員)member by my member_id, named 'member'.
     * @param member The entity of foreign property 'member'. (NullAllowed)
     */
    public void setMember(OptionalEntity<Member> member) {
        _member = member;
    }

    /** (サービスランク)service_rank by my service_rank_code, named 'serviceRank'. */
    protected OptionalEntity<ServiceRank> _serviceRank;

    /**
     * [get] (サービスランク)service_rank by my service_rank_code, named 'serviceRank'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'serviceRank'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<ServiceRank> getServiceRank() {
        if (_serviceRank == null) { _serviceRank = OptionalEntity.relationEmpty(this, "serviceRank"); }
        return _serviceRank;
    }

    /**
     * [set] (サービスランク)service_rank by my service_rank_code, named 'serviceRank'.
     * @param serviceRank The entity of foreign property 'serviceRank'. (NullAllowed)
     */
    public void setServiceRank(OptionalEntity<ServiceRank> serviceRank) {
        _serviceRank = serviceRank;
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
        if (obj instanceof BsMemberService) {
            BsMemberService other = (BsMemberService)obj;
            if (!xSV(_memberServiceId, other._memberServiceId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _memberServiceId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_member != null && _member.isPresent())
        { sb.append(li).append(xbRDS(_member, "member")); }
        if (_serviceRank != null && _serviceRank.isPresent())
        { sb.append(li).append(xbRDS(_serviceRank, "serviceRank")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_memberServiceId));
        sb.append(dm).append(xfND(_memberId));
        sb.append(dm).append(xfND(_servicePointCount));
        sb.append(dm).append(xfND(_serviceRankCode));
        sb.append(dm).append(xfND(_registerDatetime));
        sb.append(dm).append(xfND(_registerProcess));
        sb.append(dm).append(xfND(_registerUser));
        sb.append(dm).append(xfND(_updateDatetime));
        sb.append(dm).append(xfND(_updateProcess));
        sb.append(dm).append(xfND(_updateUser));
        sb.append(dm).append(xfND(_versionNo));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_member != null && _member.isPresent())
        { sb.append(dm).append("member"); }
        if (_serviceRank != null && _serviceRank.isPresent())
        { sb.append(dm).append("serviceRank"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public MemberService clone() {
        return (MemberService)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (会員サービスID)member_service_id: {PK, ID, NotNull, serial(10)} <br>
     * 独立した主キーとなるが、実質的に会員IDとは one-to-one である。
     * @return The value of the column 'member_service_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMemberServiceId() {
        checkSpecifiedProperty("memberServiceId");
        return _memberServiceId;
    }

    /**
     * [set] (会員サービスID)member_service_id: {PK, ID, NotNull, serial(10)} <br>
     * 独立した主キーとなるが、実質的に会員IDとは one-to-one である。
     * @param memberServiceId The value of the column 'member_service_id'. (basically NotNull if update: for the constraint)
     */
    public void setMemberServiceId(Integer memberServiceId) {
        registerModifiedProperty("memberServiceId");
        _memberServiceId = memberServiceId;
    }

    /**
     * [get] (会員ID)member_id: {UQ, NotNull, int4(10), FK to member} <br>
     * 会員を参照するID。ユニークなので、会員とは one-to-one の関係に。
     * @return The value of the column 'member_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMemberId() {
        checkSpecifiedProperty("memberId");
        return _memberId;
    }

    /**
     * [set] (会員ID)member_id: {UQ, NotNull, int4(10), FK to member} <br>
     * 会員を参照するID。ユニークなので、会員とは one-to-one の関係に。
     * @param memberId The value of the column 'member_id'. (basically NotNull if update: for the constraint)
     */
    public void setMemberId(Integer memberId) {
        registerModifiedProperty("memberId");
        _memberId = memberId;
    }

    /**
     * [get] (サービスポイント数)service_point_count: {IX, NotNull, int4(10)} <br>
     * 会員が現在利用できるサービスポイントの数。<br>
     * 基本的に、購入時には増えてポイントを使ったら減る。
     * @return The value of the column 'service_point_count'. (basically NotNull if selected: for the constraint)
     */
    public Integer getServicePointCount() {
        checkSpecifiedProperty("servicePointCount");
        return _servicePointCount;
    }

    /**
     * [set] (サービスポイント数)service_point_count: {IX, NotNull, int4(10)} <br>
     * 会員が現在利用できるサービスポイントの数。<br>
     * 基本的に、購入時には増えてポイントを使ったら減る。
     * @param servicePointCount The value of the column 'service_point_count'. (basically NotNull if update: for the constraint)
     */
    public void setServicePointCount(Integer servicePointCount) {
        registerModifiedProperty("servicePointCount");
        _servicePointCount = servicePointCount;
    }

    /**
     * [get] (サービスランクコード)service_rank_code: {NotNull, bpchar(3), FK to service_rank, classification=ServiceRank} <br>
     * サービスランクを参照するコード。<br>
     * どんなランクがあるのかドキドキですね。
     * @return The value of the column 'service_rank_code'. (basically NotNull if selected: for the constraint)
     */
    public String getServiceRankCode() {
        checkSpecifiedProperty("serviceRankCode");
        return _serviceRankCode;
    }

    /**
     * [set] (サービスランクコード)service_rank_code: {NotNull, bpchar(3), FK to service_rank, classification=ServiceRank} <br>
     * サービスランクを参照するコード。<br>
     * どんなランクがあるのかドキドキですね。
     * @param serviceRankCode The value of the column 'service_rank_code'. (basically NotNull if update: for the constraint)
     */
    protected void setServiceRankCode(String serviceRankCode) {
        checkClassificationCode("service_rank_code", CDef.DefMeta.ServiceRank, serviceRankCode);
        registerModifiedProperty("serviceRankCode");
        _serviceRankCode = serviceRankCode;
    }

    /**
     * [get] register_datetime: {NotNull, timestamp(26, 3)} <br>
     * @return The value of the column 'register_datetime'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getRegisterDatetime() {
        checkSpecifiedProperty("registerDatetime");
        return _registerDatetime;
    }

    /**
     * [set] register_datetime: {NotNull, timestamp(26, 3)} <br>
     * @param registerDatetime The value of the column 'register_datetime'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterDatetime(java.time.LocalDateTime registerDatetime) {
        registerModifiedProperty("registerDatetime");
        _registerDatetime = registerDatetime;
    }

    /**
     * [get] register_process: {NotNull, varchar(200)} <br>
     * @return The value of the column 'register_process'. (basically NotNull if selected: for the constraint)
     */
    public String getRegisterProcess() {
        checkSpecifiedProperty("registerProcess");
        return _registerProcess;
    }

    /**
     * [set] register_process: {NotNull, varchar(200)} <br>
     * @param registerProcess The value of the column 'register_process'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterProcess(String registerProcess) {
        registerModifiedProperty("registerProcess");
        _registerProcess = registerProcess;
    }

    /**
     * [get] register_user: {NotNull, varchar(200)} <br>
     * @return The value of the column 'register_user'. (basically NotNull if selected: for the constraint)
     */
    public String getRegisterUser() {
        checkSpecifiedProperty("registerUser");
        return _registerUser;
    }

    /**
     * [set] register_user: {NotNull, varchar(200)} <br>
     * @param registerUser The value of the column 'register_user'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterUser(String registerUser) {
        registerModifiedProperty("registerUser");
        _registerUser = registerUser;
    }

    /**
     * [get] update_datetime: {NotNull, timestamp(26, 3)} <br>
     * @return The value of the column 'update_datetime'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getUpdateDatetime() {
        checkSpecifiedProperty("updateDatetime");
        return _updateDatetime;
    }

    /**
     * [set] update_datetime: {NotNull, timestamp(26, 3)} <br>
     * @param updateDatetime The value of the column 'update_datetime'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateDatetime(java.time.LocalDateTime updateDatetime) {
        registerModifiedProperty("updateDatetime");
        _updateDatetime = updateDatetime;
    }

    /**
     * [get] update_process: {NotNull, varchar(200)} <br>
     * @return The value of the column 'update_process'. (basically NotNull if selected: for the constraint)
     */
    public String getUpdateProcess() {
        checkSpecifiedProperty("updateProcess");
        return _updateProcess;
    }

    /**
     * [set] update_process: {NotNull, varchar(200)} <br>
     * @param updateProcess The value of the column 'update_process'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateProcess(String updateProcess) {
        registerModifiedProperty("updateProcess");
        _updateProcess = updateProcess;
    }

    /**
     * [get] update_user: {NotNull, varchar(200)} <br>
     * @return The value of the column 'update_user'. (basically NotNull if selected: for the constraint)
     */
    public String getUpdateUser() {
        checkSpecifiedProperty("updateUser");
        return _updateUser;
    }

    /**
     * [set] update_user: {NotNull, varchar(200)} <br>
     * @param updateUser The value of the column 'update_user'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateUser(String updateUser) {
        registerModifiedProperty("updateUser");
        _updateUser = updateUser;
    }

    /**
     * [get] version_no: {NotNull, int8(19)} <br>
     * @return The value of the column 'version_no'. (basically NotNull if selected: for the constraint)
     */
    public Long getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] version_no: {NotNull, int8(19)} <br>
     * @param versionNo The value of the column 'version_no'. (basically NotNull if update: for the constraint)
     */
    public void setVersionNo(Long versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }

    /**
     * For framework so basically DON'T use this method.
     * @param serviceRankCode The value of the column 'service_rank_code'. (basically NotNull if update: for the constraint)
     */
    public void mynativeMappingServiceRankCode(String serviceRankCode) {
        setServiceRankCode(serviceRankCode);
    }
}
