package org.docksidestage.postgresql.dbflute.bsbhv.pmbean;

import java.util.*;

import org.dbflute.outsidesql.typed.*;
import org.dbflute.jdbc.*;
import org.dbflute.outsidesql.PmbCustodial;
import org.dbflute.util.DfTypeUtil;
import org.docksidestage.postgresql.dbflute.allcommon.*;
import org.docksidestage.postgresql.dbflute.exbhv.*;

/**
 * The base class for typed parameter-bean of CompareDate. <br />
 * This is related to "<span style="color: #AD4747">whitebox:pmbean:selectCompareDate</span>" on MemberBhv.
 * @author DBFlute(AutoGenerator)
 */
public class BsCompareDatePmb implements ExecuteHandlingPmb<MemberBhv>, FetchBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of memberId. */
    protected Integer _memberId;

    /** The parameter of birthdateFrom. */
    protected Date _birthdateFrom;

    /** The parameter of formalizedDatetimeFrom. */
    protected java.sql.Timestamp _formalizedDatetimeFrom;

    /** The max size of safety result. */
    protected int _safetyMaxResultSize;

    /** The time-zone for filtering e.g. from-to. (NullAllowed: if null, default zone) */
    protected TimeZone _timeZone;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the typed parameter-bean of CompareDate. <br />
     * This is related to "<span style="color: #AD4747">whitebox:pmbean:selectCompareDate</span>" on MemberBhv.
     */
    public BsCompareDatePmb() {
    }

    // ===================================================================================
    //                                                                Typed Implementation
    //                                                                ====================
    /**
     * {@inheritDoc}
     */
    public String getOutsideSqlPath() { return "whitebox:pmbean:selectCompareDate"; }

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
        sb.append(dm).append(_memberId);
        sb.append(dm).append(PmbCustodial.formatUtilDate(_birthdateFrom, "yyyy-MM-dd", _timeZone));
        sb.append(dm).append(_formalizedDatetimeFrom);
        if (sb.length() > 0) { sb.delete(0, dm.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] memberId <br />
     * @return The value of memberId. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public Integer getMemberId() {
        return _memberId;
    }

    /**
     * [set] memberId <br />
     * @param memberId The value of memberId. (NullAllowed)
     */
    public void setMemberId(Integer memberId) {
        _memberId = memberId;
    }

    /**
     * [get] birthdateFrom <br />
     * @return The value of birthdateFrom. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public Date getBirthdateFrom() {
        return toUtilDate(_birthdateFrom);
    }

    /**
     * [set] birthdateFrom <br />
     * @param birthdateFrom The value of birthdateFrom. (NullAllowed)
     */
    public void setBirthdateFrom(Date birthdateFrom) {
        _birthdateFrom = birthdateFrom;
    }

    /**
     * [get] formalizedDatetimeFrom <br />
     * @return The value of formalizedDatetimeFrom. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public java.sql.Timestamp getFormalizedDatetimeFrom() {
        return _formalizedDatetimeFrom;
    }

    /**
     * [set] formalizedDatetimeFrom <br />
     * @param formalizedDatetimeFrom The value of formalizedDatetimeFrom. (NullAllowed)
     */
    public void setFormalizedDatetimeFrom(java.sql.Timestamp formalizedDatetimeFrom) {
        _formalizedDatetimeFrom = formalizedDatetimeFrom;
    }
}
