package org.docksidestage.postgresql.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.docksidestage.postgresql.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.postgresql.dbflute.exentity.*;

/**
 * The entity of (退会理由)withdrawal_reason as TABLE. <br />
 * 会員に選ばせる定型的な退会理由のマスタ。
 * <pre>
 * [primary-key]
 *     withdrawal_reason_code
 * 
 * [column]
 *     withdrawal_reason_code, withdrawal_reason_text, display_order
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
 *     member_withdrawal
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     memberWithdrawalList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * String withdrawalReasonCode = entity.getWithdrawalReasonCode();
 * String withdrawalReasonText = entity.getWithdrawalReasonText();
 * Integer displayOrder = entity.getDisplayOrder();
 * entity.setWithdrawalReasonCode(withdrawalReasonCode);
 * entity.setWithdrawalReasonText(withdrawalReasonText);
 * entity.setDisplayOrder(displayOrder);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWithdrawalReason extends AbstractEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (退会理由コード)withdrawal_reason_code: {PK, NotNull, bpchar(3)} */
    protected String _withdrawalReasonCode;

    /** (退会理由テキスト)withdrawal_reason_text: {NotNull, text(2147483647)} */
    protected String _withdrawalReasonText;

    /** display_order: {UQ, NotNull, int4(10)} */
    protected Integer _displayOrder;


    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /** {@inheritDoc} */
    public String getTableDbName() {
        return "withdrawal_reason";
    }

    /** {@inheritDoc} */
    public String getTablePropertyName() {
        return "withdrawalReason";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public DBMeta getDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(getTableDbName());
    }

    // ===================================================================================
    //                                                                         Primary Key
    //                                                                         ===========
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_withdrawalReasonCode == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param displayOrder : UQ, NotNull, int4(10). (NotNull)
     */
    public void uniqueBy(Integer displayOrder) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("displayOrder");
        setDisplayOrder(displayOrder);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** (会員退会情報)member_withdrawal by withdrawal_reason_code, named 'memberWithdrawalList'. */
    protected List<MemberWithdrawal> _memberWithdrawalList;

    /**
     * [get] (会員退会情報)member_withdrawal by withdrawal_reason_code, named 'memberWithdrawalList'.
     * @return The entity list of referrer property 'memberWithdrawalList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MemberWithdrawal> getMemberWithdrawalList() {
        if (_memberWithdrawalList == null) { _memberWithdrawalList = newReferrerList(); }
        return _memberWithdrawalList;
    }

    /**
     * [set] (会員退会情報)member_withdrawal by withdrawal_reason_code, named 'memberWithdrawalList'.
     * @param memberWithdrawalList The entity list of referrer property 'memberWithdrawalList'. (NullAllowed)
     */
    public void setMemberWithdrawalList(List<MemberWithdrawal> memberWithdrawalList) {
        _memberWithdrawalList = memberWithdrawalList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWithdrawalReason) {
            BsWithdrawalReason other = (BsWithdrawalReason)obj;
            if (!xSV(_withdrawalReasonCode, other._withdrawalReasonCode)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _withdrawalReasonCode);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_memberWithdrawalList != null) { for (MemberWithdrawal et : _memberWithdrawalList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "memberWithdrawalList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(_withdrawalReasonCode);
        sb.append(dm).append(_withdrawalReasonText);
        sb.append(dm).append(_displayOrder);
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_memberWithdrawalList != null && !_memberWithdrawalList.isEmpty())
        { sb.append(dm).append("memberWithdrawalList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WithdrawalReason clone() {
        return (WithdrawalReason)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (退会理由コード)withdrawal_reason_code: {PK, NotNull, bpchar(3)} <br />
     * @return The value of the column 'withdrawal_reason_code'. (basically NotNull if selected: for the constraint)
     */
    public String getWithdrawalReasonCode() {
        return _withdrawalReasonCode;
    }

    /**
     * [set] (退会理由コード)withdrawal_reason_code: {PK, NotNull, bpchar(3)} <br />
     * @param withdrawalReasonCode The value of the column 'withdrawal_reason_code'. (basically NotNull if update: for the constraint)
     */
    public void setWithdrawalReasonCode(String withdrawalReasonCode) {
        __modifiedProperties.addPropertyName("withdrawalReasonCode");
        _withdrawalReasonCode = withdrawalReasonCode;
    }

    /**
     * [get] (退会理由テキスト)withdrawal_reason_text: {NotNull, text(2147483647)} <br />
     * 退会理由の内容。テキスト形式なので目いっぱい書けるが、<br />
     * そうするとUI側できれいに見せるのが大変でしょうね。
     * @return The value of the column 'withdrawal_reason_text'. (basically NotNull if selected: for the constraint)
     */
    public String getWithdrawalReasonText() {
        return _withdrawalReasonText;
    }

    /**
     * [set] (退会理由テキスト)withdrawal_reason_text: {NotNull, text(2147483647)} <br />
     * 退会理由の内容。テキスト形式なので目いっぱい書けるが、<br />
     * そうするとUI側できれいに見せるのが大変でしょうね。
     * @param withdrawalReasonText The value of the column 'withdrawal_reason_text'. (basically NotNull if update: for the constraint)
     */
    public void setWithdrawalReasonText(String withdrawalReasonText) {
        __modifiedProperties.addPropertyName("withdrawalReasonText");
        _withdrawalReasonText = withdrawalReasonText;
    }

    /**
     * [get] display_order: {UQ, NotNull, int4(10)} <br />
     * @return The value of the column 'display_order'. (basically NotNull if selected: for the constraint)
     */
    public Integer getDisplayOrder() {
        return _displayOrder;
    }

    /**
     * [set] display_order: {UQ, NotNull, int4(10)} <br />
     * @param displayOrder The value of the column 'display_order'. (basically NotNull if update: for the constraint)
     */
    public void setDisplayOrder(Integer displayOrder) {
        __modifiedProperties.addPropertyName("displayOrder");
        _displayOrder = displayOrder;
    }
}
