package org.docksidestage.postgresql.dbflute.bsbhv.pmbean;

import java.util.*;

import org.dbflute.outsidesql.ProcedurePmb;
import org.dbflute.jdbc.*;
import org.dbflute.outsidesql.PmbCustodial;
import org.dbflute.util.DfTypeUtil;
import org.docksidestage.postgresql.dbflute.allcommon.*;

/**
 * The base class for procedure parameter-bean of SpNextInOutParameter. <br />
 * This is related to "<span style="color: #AD4747">nextschema.sp_next_in_out_parameter</span>".
 * @author DBFlute(AutoGenerator)
 */
public class BsSpNextInOutParameterPmb implements ProcedurePmb, FetchBean {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    // -----------------------------------------------------
    //                                   Procedure Parameter
    //                                   -------------------
    public static final String VInVarchar_PROCEDURE_PARAMETER = "in, 0";
    public static final String VOutVarchar_PROCEDURE_PARAMETER = "out, 1";
    public static final String VInoutVarchar_PROCEDURE_PARAMETER = "out, 2";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of VInVarchar: {varchar as In}. */
    protected String _vInVarchar;

    /** The parameter of VOutVarchar: {varchar as Out}. */
    protected String _vOutVarchar;

    /** The parameter of VInoutVarchar: {varchar as Out}. */
    protected String _vInoutVarchar;

    /** The max size of safety result. */
    protected int _safetyMaxResultSize;

    /** The time-zone for filtering e.g. from-to. (NullAllowed: if null, default zone) */
    protected TimeZone _timeZone;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the procedure parameter-bean of SpNextInOutParameter. <br />
     * This is related to "<span style="color: #AD4747">nextschema.sp_next_in_out_parameter</span>".
     */
    public BsSpNextInOutParameterPmb() {
    }

    // ===================================================================================
    //                                                            Procedure Implementation
    //                                                            ========================
    /**
     * {@inheritDoc}
     */
    public String getProcedureName() { return "nextschema.sp_next_in_out_parameter"; }

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
        sb.append(dm).append(_vInVarchar);
        sb.append(dm).append(_vOutVarchar);
        sb.append(dm).append(_vInoutVarchar);
        if (sb.length() > 0) { sb.delete(0, dm.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] VInVarchar: {varchar as In} <br />
     * @return The value of VInVarchar. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getVInVarchar() {
        return filterStringParameter(_vInVarchar);
    }

    /**
     * [set] VInVarchar: {varchar as In} <br />
     * @param vInVarchar The value of VInVarchar. (NullAllowed)
     */
    public void setVInVarchar(String vInVarchar) {
        _vInVarchar = vInVarchar;
    }

    /**
     * [get] VOutVarchar: {varchar as Out} <br />
     * @return The value of VOutVarchar. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getVOutVarchar() {
        return filterStringParameter(_vOutVarchar);
    }

    /**
     * [set] VOutVarchar: {varchar as Out} <br />
     * @param vOutVarchar The value of VOutVarchar. (NullAllowed)
     */
    public void setVOutVarchar(String vOutVarchar) {
        _vOutVarchar = vOutVarchar;
    }

    /**
     * [get] VInoutVarchar: {varchar as Out} <br />
     * @return The value of VInoutVarchar. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getVInoutVarchar() {
        return filterStringParameter(_vInoutVarchar);
    }

    /**
     * [set] VInoutVarchar: {varchar as Out} <br />
     * @param vInoutVarchar The value of VInoutVarchar. (NullAllowed)
     */
    public void setVInoutVarchar(String vInoutVarchar) {
        _vInoutVarchar = vInoutVarchar;
    }
}
