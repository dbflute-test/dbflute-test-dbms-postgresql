package org.docksidestage.postgresql.dbflute.bsbhv.cursor;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.dbflute.jdbc.CursorAccessor;
import org.dbflute.jdbc.ValueType;
import org.dbflute.s2dao.valuetype.TnValueTypes;

/**
 * The cursor of PurchaseSummaryMember. <br>
 * @author DBFlute(AutoGenerator)
 */
public class BsPurchaseSummaryMemberCursor implements CursorAccessor {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    // -----------------------------------------------------
    //                                        Column DB Name
    //                                        --------------
    /** DB name of member_id. */
    public static final String DB_NAME_member_id = "member_id";

    /** DB name of member_name. */
    public static final String DB_NAME_member_name = "member_name";

    /** DB name of birthdate. */
    public static final String DB_NAME_birthdate = "birthdate";

    /** DB name of formalized_datetime. */
    public static final String DB_NAME_formalized_datetime = "formalized_datetime";

    /** DB name of purchase_summary. */
    public static final String DB_NAME_purchase_summary = "purchase_summary";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** Wrapped result set. */
    protected ResultSet _rs;

    protected ValueType _vtMemberId = vt(Integer.class);
    protected ValueType _vtMemberName = vt(String.class);
    protected ValueType _vtBirthdate = vt(java.time.LocalDate.class);
    protected ValueType _vtFormalizedDatetime = vt(java.time.LocalDateTime.class);
    protected ValueType _vtPurchaseSummary = vt(Long.class);

    protected ValueType vt(Class<?> type) {
        return TnValueTypes.getValueType(type);
    }

    protected ValueType vt(Class<?> type, String name) {
        ValueType valueType = TnValueTypes.getPluginValueType(name);
        return valueType != null ? valueType : vt(type);
    }

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsPurchaseSummaryMemberCursor() {
    }

    // ===================================================================================
    //                                                                             Prepare
    //                                                                             =======
    /** {@inheritDoc} */
    public void accept(ResultSet rs) {
        this._rs = rs;
    }

    // ===================================================================================
    //                                                                              Direct
    //                                                                              ======
    /** {@inheritDoc} */
    public ResultSet cursor() {
        return _rs;
    }

    // ===================================================================================
    //                                                                            Delegate
    //                                                                            ========
    /** {@inheritDoc} */
    public boolean next() throws SQLException {
        return _rs.next();
    }

    // ===================================================================================
    //                                                                  Type Safe Accessor
    //                                                                  ==================
    /**
     * [get] (会員ID)member_id: {serial(10), refers to member.member_id} <br>
     * 会員を識別するID。連番として自動採番される。<br>
     * （会員IDだけに限らず）採番方法はDBMS次第。
     * @return The value of memberId. (NullAllowed)
     * @throws SQLException When it fails to get the value from result set.
     */
    public Integer getMemberId() throws SQLException {
        return (Integer)_vtMemberId.getValue(_rs, DB_NAME_member_id);
    }

    /**
     * [get] (会員名称)member_name: {varchar(200), refers to member.member_name} <br>
     * 会員のフルネームの名称。<br>
     * 苗字と名前を分けて管理することも多いが、ここでは Example なので単純にひとまとめ。
     * @return The value of memberName. (NullAllowed)
     * @throws SQLException When it fails to get the value from result set.
     */
    public String getMemberName() throws SQLException {
        return (String)_vtMemberName.getValue(_rs, DB_NAME_member_name);
    }

    /**
     * [get] (生年月日)birthdate: {date(13), refers to member.birthdate} <br>
     * 必須項目ではないので、このデータがない会員もいる。
     * @return The value of birthdate. (NullAllowed)
     * @throws SQLException When it fails to get the value from result set.
     */
    public java.time.LocalDate getBirthdate() throws SQLException {
        return (java.time.LocalDate)_vtBirthdate.getValue(_rs, DB_NAME_birthdate);
    }

    /**
     * [get] (正式会員日時)formalized_datetime: {timestamp(26, 3), refers to member.formalized_datetime} <br>
     * 会員が正式に確定した日時。<br>
     * 一度確定したら更新されない。
     * @return The value of formalizedDatetime. (NullAllowed)
     * @throws SQLException When it fails to get the value from result set.
     */
    public java.time.LocalDateTime getFormalizedDatetime() throws SQLException {
        return (java.time.LocalDateTime)_vtFormalizedDatetime.getValue(_rs, DB_NAME_formalized_datetime);
    }

    /**
     * [get] purchase_summary: {int8(19)} <br>
     * @return The value of purchaseSummary. (NullAllowed)
     * @throws SQLException When it fails to get the value from result set.
     */
    public Long getPurchaseSummary() throws SQLException {
        return (Long)_vtPurchaseSummary.getValue(_rs, DB_NAME_purchase_summary);
    }
}
