package org.docksidestage.postgresql.dbflute.bsbhv.pmbean;

import java.util.*;

import org.dbflute.outsidesql.ProcedurePmb;
import org.dbflute.jdbc.*;
import org.dbflute.outsidesql.PmbCustodial;
import org.dbflute.util.DfTypeUtil;
import org.docksidestage.postgresql.dbflute.allcommon.*;

/**
 * The base class for procedure parameter-bean of Fncamelcaseprocedure. <br>
 * This is related to "<span style="color: #AD4747">fncamelcaseprocedure</span>".
 * @author DBFlute(AutoGenerator)
 */
public class BsFncamelcaseprocedurePmb implements ProcedurePmb, FetchBean {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    // -----------------------------------------------------
    //                                   Procedure Parameter
    //                                   -------------------
    public static final String fooparam_PROCEDURE_PARAMETER = "in, 0";
    public static final String barparam_PROCEDURE_PARAMETER = "in, 1";
    public static final String vdonparam_PROCEDURE_PARAMETER = "out, 2";
    public static final String vheeparam_PROCEDURE_PARAMETER = "in, 3";
    public static final String pooParamname_PROCEDURE_PARAMETER = "out, 4";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of fooparam: {varchar as In}. */
    protected String _fooparam;

    /** The parameter of barparam: {varchar as In}. */
    protected String _barparam;

    /** The parameter of vdonparam: {varchar as Out}. */
    protected String _vdonparam;

    /** The parameter of vheeparam: {varchar as In}. */
    protected String _vheeparam;

    /** The parameter of pooParamname: {varchar as Out}. */
    protected String _pooParamname;

    /** The max size of safety result. */
    protected int _safetyMaxResultSize;

    /** The time-zone for filtering e.g. from-to. (NullAllowed: if null, default zone) */
    protected TimeZone _timeZone;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the procedure parameter-bean of Fncamelcaseprocedure. <br>
     * This is related to "<span style="color: #AD4747">fncamelcaseprocedure</span>".
     */
    public BsFncamelcaseprocedurePmb() {
    }

    // ===================================================================================
    //                                                            Procedure Implementation
    //                                                            ========================
    /**
     * {@inheritDoc}
     */
    public String getProcedureName() { return "fncamelcaseprocedure"; }

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
        sb.append(dm).append(_fooparam);
        sb.append(dm).append(_barparam);
        sb.append(dm).append(_vdonparam);
        sb.append(dm).append(_vheeparam);
        sb.append(dm).append(_pooParamname);
        if (sb.length() > 0) { sb.delete(0, dm.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] fooparam: {varchar as In} <br>
     * @return The value of fooparam. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getFooparam() {
        return filterStringParameter(_fooparam);
    }

    /**
     * [set] fooparam: {varchar as In} <br>
     * @param fooparam The value of fooparam. (NullAllowed)
     */
    public void setFooparam(String fooparam) {
        _fooparam = fooparam;
    }

    /**
     * [get] barparam: {varchar as In} <br>
     * @return The value of barparam. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getBarparam() {
        return filterStringParameter(_barparam);
    }

    /**
     * [set] barparam: {varchar as In} <br>
     * @param barparam The value of barparam. (NullAllowed)
     */
    public void setBarparam(String barparam) {
        _barparam = barparam;
    }

    /**
     * [get] vdonparam: {varchar as Out} <br>
     * @return The value of vdonparam. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getVdonparam() {
        return filterStringParameter(_vdonparam);
    }

    /**
     * [set] vdonparam: {varchar as Out} <br>
     * @param vdonparam The value of vdonparam. (NullAllowed)
     */
    public void setVdonparam(String vdonparam) {
        _vdonparam = vdonparam;
    }

    /**
     * [get] vheeparam: {varchar as In} <br>
     * @return The value of vheeparam. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getVheeparam() {
        return filterStringParameter(_vheeparam);
    }

    /**
     * [set] vheeparam: {varchar as In} <br>
     * @param vheeparam The value of vheeparam. (NullAllowed)
     */
    public void setVheeparam(String vheeparam) {
        _vheeparam = vheeparam;
    }

    /**
     * [get] pooParamname: {varchar as Out} <br>
     * @return The value of pooParamname. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getPooParamname() {
        return filterStringParameter(_pooParamname);
    }

    /**
     * [set] pooParamname: {varchar as Out} <br>
     * @param pooParamname The value of pooParamname. (NullAllowed)
     */
    public void setPooParamname(String pooParamname) {
        _pooParamname = pooParamname;
    }
}
