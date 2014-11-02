package org.docksidestage.postgresql.dbflute.bsbhv.pmbean;

import java.util.*;

import org.dbflute.outsidesql.ProcedurePmb;
import org.dbflute.jdbc.*;
import org.dbflute.outsidesql.PmbCustodial;
import org.dbflute.util.DfTypeUtil;
import org.docksidestage.postgresql.dbflute.allcommon.*;
import org.docksidestage.postgresql.dbflute.exentity.customize.*;

/**
 * The base class for procedure parameter-bean of SpResultSetParameterMore. <br>
 * This is related to "<span style="color: #AD4747">sp_result_set_parameter_more</span>".
 * @author DBFlute(AutoGenerator)
 */
public class BsSpResultSetParameterMorePmb implements ProcedurePmb, FetchBean {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    // -----------------------------------------------------
    //                                   Procedure Parameter
    //                                   -------------------
    public static final String curMember_PROCEDURE_PARAMETER = "out, 0";
    public static final String curMemberStatus_PROCEDURE_PARAMETER = "out, 1";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of curMember: {refcursor as Out}. */
    protected List<SpResultSetParameterMoreCurMember> _curMember;

    /** The parameter of curMemberStatus: {refcursor as Out}. */
    protected List<SpResultSetParameterMoreCurMemberStatus> _curMemberStatus;

    /** The max size of safety result. */
    protected int _safetyMaxResultSize;

    /** The time-zone for filtering e.g. from-to. (NullAllowed: if null, default zone) */
    protected TimeZone _timeZone;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the procedure parameter-bean of SpResultSetParameterMore. <br>
     * This is related to "<span style="color: #AD4747">sp_result_set_parameter_more</span>".
     */
    public BsSpResultSetParameterMorePmb() {
    }

    // ===================================================================================
    //                                                            Procedure Implementation
    //                                                            ========================
    /**
     * {@inheritDoc}
     */
    public String getProcedureName() { return "sp_result_set_parameter_more"; }

    /**
     * {@inheritDoc}
     */
     public boolean isEscapeStatement() { return true; } // as default

    /**
     * {@inheritDoc}
     */
     public boolean isCalledBySelect() { return false; } // resolved by generator

    // ===================================================================================
    //                                                                       Safety Result
    //                                                                       =============
    /**
     * {@inheritDoc}
     */
    public void checkSafetyResult(int safetyMaxResultSize) {
        _safetyMaxResultSize = safetyMaxResultSize;
    }

    /**
     * {@inheritDoc}
     */
    public int getSafetyMaxResultSize() {
        return _safetyMaxResultSize;
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    // -----------------------------------------------------
    //                                                String
    //                                                ------
    protected String filterStringParameter(String value) { return isEmptyStringParameterAllowed() ? value : convertEmptyToNull(value); }
    protected boolean isEmptyStringParameterAllowed() { return DBFluteConfig.getInstance().isEmptyStringParameterAllowed(); }
    protected String convertEmptyToNull(String value) { return PmbCustodial.convertEmptyToNull(value); }
    
    // -----------------------------------------------------
    //                                                  Date
    //                                                  ----
    protected Date toUtilDate(Object date) { return PmbCustodial.toUtilDate(date, _timeZone); }
    protected <DATE> DATE toLocalDate(Date date, Class<DATE> localType) { return PmbCustodial.toLocalDate(date, localType, chooseRealTimeZone()); }
    protected TimeZone chooseRealTimeZone() { return PmbCustodial.chooseRealTimeZone(_timeZone); }

    /**
     * Set time-zone, basically for LocalDate conversion. <br>
     * Normally you don't need to set this, you can adjust other ways. <br>
     * (DBFlute system's time-zone is used as default)
     * @param timeZone The time-zone for filtering. (NullAllowed: if null, default zone)
     */
    public void zone(TimeZone timeZone) { _timeZone = timeZone; }

    // -----------------------------------------------------
    //                                    by Option Handling
    //                                    ------------------
    // might be called by option handling
    protected <NUMBER extends Number> NUMBER toNumber(Object obj, Class<NUMBER> type) { return PmbCustodial.toNumber(obj, type); }
    protected Boolean toBoolean(Object obj) { return PmbCustodial.toBoolean(obj); }
    @SuppressWarnings("unchecked")
    protected <ELEMENT> ArrayList<ELEMENT> newArrayList(ELEMENT... elements) { return PmbCustodial.newArrayList(elements); }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * @return The display string of all parameters. (NotNull)
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(DfTypeUtil.toClassTitle(this)).append(":");
        sb.append(xbuildColumnString());
        return sb.toString();
    }
    protected String xbuildColumnString() {
        final String dm = ", ";
        final StringBuilder sb = new StringBuilder();
        sb.append(dm).append(_curMember);
        sb.append(dm).append(_curMemberStatus);
        if (sb.length() > 0) { sb.delete(0, dm.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] curMember: {refcursor as Out} <br>
     * @return The value of curMember. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public List<SpResultSetParameterMoreCurMember> getCurMember() {
        return _curMember;
    }

    /**
     * [set] curMember: {refcursor as Out} <br>
     * @param curMember The value of curMember. (NullAllowed)
     */
    public void setCurMember(List<SpResultSetParameterMoreCurMember> curMember) {
        _curMember = curMember;
    }

    /**
     * [get] curMemberStatus: {refcursor as Out} <br>
     * @return The value of curMemberStatus. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public List<SpResultSetParameterMoreCurMemberStatus> getCurMemberStatus() {
        return _curMemberStatus;
    }

    /**
     * [set] curMemberStatus: {refcursor as Out} <br>
     * @param curMemberStatus The value of curMemberStatus. (NullAllowed)
     */
    public void setCurMemberStatus(List<SpResultSetParameterMoreCurMemberStatus> curMemberStatus) {
        _curMemberStatus = curMemberStatus;
    }
}
