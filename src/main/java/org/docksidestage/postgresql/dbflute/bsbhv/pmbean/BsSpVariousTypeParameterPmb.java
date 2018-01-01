package org.docksidestage.postgresql.dbflute.bsbhv.pmbean;

import java.util.*;

import org.dbflute.outsidesql.ProcedurePmb;
import org.dbflute.jdbc.*;
import org.dbflute.outsidesql.PmbCustodial;
import org.dbflute.util.DfTypeUtil;
import org.docksidestage.postgresql.dbflute.allcommon.*;

/**
 * The base class for procedure parameter-bean of SpVariousTypeParameter. <br>
 * This is related to "<span style="color: #AD4747">sp_various_type_parameter</span>".
 * @author DBFlute(AutoGenerator)
 */
public class BsSpVariousTypeParameterPmb implements ProcedurePmb, FetchBean {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    // -----------------------------------------------------
    //                                   Procedure Parameter
    //                                   -------------------
    public static final String VInVarchar_PROCEDURE_PARAMETER = "in, 0";
    public static final String VOutVarchar_PROCEDURE_PARAMETER = "out, 1";
    public static final String VOutChar_PROCEDURE_PARAMETER = "out, 2";
    public static final String VOutChar_VALUE_TYPE = "fixedLengthStringType";
    public static final String VInText_PROCEDURE_PARAMETER = "in, 3";
    public static final String VOutText_PROCEDURE_PARAMETER = "out, 4";
    public static final String vvInNumericInteger_PROCEDURE_PARAMETER = "in, 5";
    public static final String vvInNumericInteger_VALUE_TYPE = "objectBindingBigDecimalType";
    public static final String vvInNumericBigint_PROCEDURE_PARAMETER = "in, 6";
    public static final String vvInNumericBigint_VALUE_TYPE = "objectBindingBigDecimalType";
    public static final String vvInNumericDecimal_PROCEDURE_PARAMETER = "in, 7";
    public static final String vvInNumericDecimal_VALUE_TYPE = "objectBindingBigDecimalType";
    public static final String vvOutDecimal_PROCEDURE_PARAMETER = "out, 8";
    public static final String vvOutDecimal_VALUE_TYPE = "objectBindingBigDecimalType";
    public static final String vvOutInteger_PROCEDURE_PARAMETER = "out, 9";
    public static final String vvInoutInteger_PROCEDURE_PARAMETER = "inout, 10";
    public static final String vvOutBigint_PROCEDURE_PARAMETER = "out, 11";
    public static final String vvInoutBigint_PROCEDURE_PARAMETER = "inout, 12";
    public static final String vvvInDate_PROCEDURE_PARAMETER = "in, 13";
    public static final String vvvOutTimestamp_PROCEDURE_PARAMETER = "out, 14";
    public static final String vvvInTime_PROCEDURE_PARAMETER = "in, 15";
    public static final String vvvvInBool_PROCEDURE_PARAMETER = "in, 16";
    public static final String vvvvInBytea_PROCEDURE_PARAMETER = "in, 17";
    public static final String vvvvInBytea_VALUE_TYPE = "postgreSqlByteaType";
    public static final String vvvvInOid_PROCEDURE_PARAMETER = "in, 18";
    public static final String vvvvInOid_VALUE_TYPE = "postgreSqlOidType";
    public static final String vvvvInUuid_PROCEDURE_PARAMETER = "in, 19";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of VInVarchar: {varchar as In}. */
    protected String _vInVarchar;

    /** The parameter of VOutVarchar: {varchar as Out}. */
    protected String _vOutVarchar;

    /** The parameter of VOutChar: {bpchar as Out}. */
    protected String _vOutChar;

    /** The parameter of VInText: {text as In}. */
    protected String _vInText;

    /** The parameter of VOutText: {text as Out}. */
    protected String _vOutText;

    /** The parameter of vvInNumericInteger: {numeric as In}. */
    protected java.math.BigDecimal _vvInNumericInteger;

    /** The parameter of vvInNumericBigint: {numeric as In}. */
    protected java.math.BigDecimal _vvInNumericBigint;

    /** The parameter of vvInNumericDecimal: {numeric as In}. */
    protected java.math.BigDecimal _vvInNumericDecimal;

    /** The parameter of vvOutDecimal: {numeric as Out}. */
    protected java.math.BigDecimal _vvOutDecimal;

    /** The parameter of vvOutInteger: {int4 as Out}. */
    protected Integer _vvOutInteger;

    /** The parameter of vvInoutInteger: {int4 as InOut}. */
    protected Integer _vvInoutInteger;

    /** The parameter of vvOutBigint: {int8 as Out}. */
    protected Long _vvOutBigint;

    /** The parameter of vvInoutBigint: {int8 as InOut}. */
    protected Long _vvInoutBigint;

    /** The parameter of vvvInDate: {date as In}. */
    protected java.time.LocalDate _vvvInDate;

    /** The parameter of vvvOutTimestamp: {timestamp as Out}. */
    protected java.time.LocalDateTime _vvvOutTimestamp;

    /** The parameter of vvvInTime: {time as In}. */
    protected java.time.LocalTime _vvvInTime;

    /** The parameter of vvvvInBool: {bool as In}. */
    protected Boolean _vvvvInBool;

    /** The parameter of vvvvInBytea: {bytea as In}. */
    protected byte[] _vvvvInBytea;

    /** The parameter of vvvvInOid: {oid as In}. */
    protected byte[] _vvvvInOid;

    /** The parameter of vvvvInUuid: {uuid as In}. */
    protected java.util.UUID _vvvvInUuid;

    /** The max size of safety result. */
    protected int _safetyMaxResultSize;

    /** The time-zone for filtering e.g. from-to. (NullAllowed: if null, default zone) */
    protected TimeZone _timeZone;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the procedure parameter-bean of SpVariousTypeParameter. <br>
     * This is related to "<span style="color: #AD4747">sp_various_type_parameter</span>".
     */
    public BsSpVariousTypeParameterPmb() {
    }

    // ===================================================================================
    //                                                            Procedure Implementation
    //                                                            ========================
    /**
     * {@inheritDoc}
     */
    public String getProcedureName() { return "sp_various_type_parameter"; }

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
        sb.append(dm).append(_vInVarchar);
        sb.append(dm).append(_vOutVarchar);
        sb.append(dm).append(_vOutChar);
        sb.append(dm).append(_vInText);
        sb.append(dm).append(_vOutText);
        sb.append(dm).append(_vvInNumericInteger);
        sb.append(dm).append(_vvInNumericBigint);
        sb.append(dm).append(_vvInNumericDecimal);
        sb.append(dm).append(_vvOutDecimal);
        sb.append(dm).append(_vvOutInteger);
        sb.append(dm).append(_vvInoutInteger);
        sb.append(dm).append(_vvOutBigint);
        sb.append(dm).append(_vvInoutBigint);
        sb.append(dm).append(_vvvInDate);
        sb.append(dm).append(_vvvOutTimestamp);
        sb.append(dm).append(_vvvInTime);
        sb.append(dm).append(_vvvvInBool);
        sb.append(dm).append(PmbCustodial.formatByteArray(_vvvvInBytea));
        sb.append(dm).append(PmbCustodial.formatByteArray(_vvvvInOid));
        sb.append(dm).append(_vvvvInUuid);
        if (sb.length() > 0) { sb.delete(0, dm.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] VInVarchar: {varchar as In} <br>
     * @return The value of VInVarchar. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getVInVarchar() {
        return filterStringParameter(_vInVarchar);
    }

    /**
     * [set] VInVarchar: {varchar as In} <br>
     * @param vInVarchar The value of VInVarchar. (NullAllowed)
     */
    public void setVInVarchar(String vInVarchar) {
        _vInVarchar = vInVarchar;
    }

    /**
     * [get] VOutVarchar: {varchar as Out} <br>
     * @return The value of VOutVarchar. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getVOutVarchar() {
        return filterStringParameter(_vOutVarchar);
    }

    /**
     * [set] VOutVarchar: {varchar as Out} <br>
     * @param vOutVarchar The value of VOutVarchar. (NullAllowed)
     */
    public void setVOutVarchar(String vOutVarchar) {
        _vOutVarchar = vOutVarchar;
    }

    /**
     * [get] VOutChar: {bpchar as Out} <br>
     * @return The value of VOutChar. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getVOutChar() {
        return filterStringParameter(_vOutChar);
    }

    /**
     * [set] VOutChar: {bpchar as Out} <br>
     * @param vOutChar The value of VOutChar. (NullAllowed)
     */
    public void setVOutChar(String vOutChar) {
        _vOutChar = vOutChar;
    }

    /**
     * [get] VInText: {text as In} <br>
     * @return The value of VInText. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getVInText() {
        return filterStringParameter(_vInText);
    }

    /**
     * [set] VInText: {text as In} <br>
     * @param vInText The value of VInText. (NullAllowed)
     */
    public void setVInText(String vInText) {
        _vInText = vInText;
    }

    /**
     * [get] VOutText: {text as Out} <br>
     * @return The value of VOutText. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getVOutText() {
        return filterStringParameter(_vOutText);
    }

    /**
     * [set] VOutText: {text as Out} <br>
     * @param vOutText The value of VOutText. (NullAllowed)
     */
    public void setVOutText(String vOutText) {
        _vOutText = vOutText;
    }

    /**
     * [get] vvInNumericInteger: {numeric as In} <br>
     * @return The value of vvInNumericInteger. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public java.math.BigDecimal getVvInNumericInteger() {
        return _vvInNumericInteger;
    }

    /**
     * [set] vvInNumericInteger: {numeric as In} <br>
     * @param vvInNumericInteger The value of vvInNumericInteger. (NullAllowed)
     */
    public void setVvInNumericInteger(java.math.BigDecimal vvInNumericInteger) {
        _vvInNumericInteger = vvInNumericInteger;
    }

    /**
     * [get] vvInNumericBigint: {numeric as In} <br>
     * @return The value of vvInNumericBigint. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public java.math.BigDecimal getVvInNumericBigint() {
        return _vvInNumericBigint;
    }

    /**
     * [set] vvInNumericBigint: {numeric as In} <br>
     * @param vvInNumericBigint The value of vvInNumericBigint. (NullAllowed)
     */
    public void setVvInNumericBigint(java.math.BigDecimal vvInNumericBigint) {
        _vvInNumericBigint = vvInNumericBigint;
    }

    /**
     * [get] vvInNumericDecimal: {numeric as In} <br>
     * @return The value of vvInNumericDecimal. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public java.math.BigDecimal getVvInNumericDecimal() {
        return _vvInNumericDecimal;
    }

    /**
     * [set] vvInNumericDecimal: {numeric as In} <br>
     * @param vvInNumericDecimal The value of vvInNumericDecimal. (NullAllowed)
     */
    public void setVvInNumericDecimal(java.math.BigDecimal vvInNumericDecimal) {
        _vvInNumericDecimal = vvInNumericDecimal;
    }

    /**
     * [get] vvOutDecimal: {numeric as Out} <br>
     * @return The value of vvOutDecimal. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public java.math.BigDecimal getVvOutDecimal() {
        return _vvOutDecimal;
    }

    /**
     * [set] vvOutDecimal: {numeric as Out} <br>
     * @param vvOutDecimal The value of vvOutDecimal. (NullAllowed)
     */
    public void setVvOutDecimal(java.math.BigDecimal vvOutDecimal) {
        _vvOutDecimal = vvOutDecimal;
    }

    /**
     * [get] vvOutInteger: {int4 as Out} <br>
     * @return The value of vvOutInteger. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public Integer getVvOutInteger() {
        return _vvOutInteger;
    }

    /**
     * [set] vvOutInteger: {int4 as Out} <br>
     * @param vvOutInteger The value of vvOutInteger. (NullAllowed)
     */
    public void setVvOutInteger(Integer vvOutInteger) {
        _vvOutInteger = vvOutInteger;
    }

    /**
     * [get] vvInoutInteger: {int4 as InOut} <br>
     * @return The value of vvInoutInteger. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public Integer getVvInoutInteger() {
        return _vvInoutInteger;
    }

    /**
     * [set] vvInoutInteger: {int4 as InOut} <br>
     * @param vvInoutInteger The value of vvInoutInteger. (NullAllowed)
     */
    public void setVvInoutInteger(Integer vvInoutInteger) {
        _vvInoutInteger = vvInoutInteger;
    }

    /**
     * [get] vvOutBigint: {int8 as Out} <br>
     * @return The value of vvOutBigint. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public Long getVvOutBigint() {
        return _vvOutBigint;
    }

    /**
     * [set] vvOutBigint: {int8 as Out} <br>
     * @param vvOutBigint The value of vvOutBigint. (NullAllowed)
     */
    public void setVvOutBigint(Long vvOutBigint) {
        _vvOutBigint = vvOutBigint;
    }

    /**
     * [get] vvInoutBigint: {int8 as InOut} <br>
     * @return The value of vvInoutBigint. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public Long getVvInoutBigint() {
        return _vvInoutBigint;
    }

    /**
     * [set] vvInoutBigint: {int8 as InOut} <br>
     * @param vvInoutBigint The value of vvInoutBigint. (NullAllowed)
     */
    public void setVvInoutBigint(Long vvInoutBigint) {
        _vvInoutBigint = vvInoutBigint;
    }

    /**
     * [get] vvvInDate: {date as In} <br>
     * @return The value of vvvInDate. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public java.time.LocalDate getVvvInDate() {
        return _vvvInDate;
    }

    /**
     * [set] vvvInDate: {date as In} <br>
     * @param vvvInDate The value of vvvInDate. (NullAllowed)
     */
    public void setVvvInDate(java.time.LocalDate vvvInDate) {
        _vvvInDate = vvvInDate;
    }

    /**
     * [get] vvvOutTimestamp: {timestamp as Out} <br>
     * @return The value of vvvOutTimestamp. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public java.time.LocalDateTime getVvvOutTimestamp() {
        return _vvvOutTimestamp;
    }

    /**
     * [set] vvvOutTimestamp: {timestamp as Out} <br>
     * @param vvvOutTimestamp The value of vvvOutTimestamp. (NullAllowed)
     */
    public void setVvvOutTimestamp(java.time.LocalDateTime vvvOutTimestamp) {
        _vvvOutTimestamp = vvvOutTimestamp;
    }

    /**
     * [get] vvvInTime: {time as In} <br>
     * @return The value of vvvInTime. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public java.time.LocalTime getVvvInTime() {
        return _vvvInTime;
    }

    /**
     * [set] vvvInTime: {time as In} <br>
     * @param vvvInTime The value of vvvInTime. (NullAllowed)
     */
    public void setVvvInTime(java.time.LocalTime vvvInTime) {
        _vvvInTime = vvvInTime;
    }

    /**
     * [get] vvvvInBool: {bool as In} <br>
     * @return The value of vvvvInBool. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public Boolean getVvvvInBool() {
        return _vvvvInBool;
    }

    /**
     * [set] vvvvInBool: {bool as In} <br>
     * @param vvvvInBool The value of vvvvInBool. (NullAllowed)
     */
    public void setVvvvInBool(Boolean vvvvInBool) {
        _vvvvInBool = vvvvInBool;
    }

    /**
     * [get] vvvvInBytea: {bytea as In} <br>
     * @return The value of vvvvInBytea. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public byte[] getVvvvInBytea() {
        return _vvvvInBytea;
    }

    /**
     * [set] vvvvInBytea: {bytea as In} <br>
     * @param vvvvInBytea The value of vvvvInBytea. (NullAllowed)
     */
    public void setVvvvInBytea(byte[] vvvvInBytea) {
        _vvvvInBytea = vvvvInBytea;
    }

    /**
     * [get] vvvvInOid: {oid as In} <br>
     * @return The value of vvvvInOid. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public byte[] getVvvvInOid() {
        return _vvvvInOid;
    }

    /**
     * [set] vvvvInOid: {oid as In} <br>
     * @param vvvvInOid The value of vvvvInOid. (NullAllowed)
     */
    public void setVvvvInOid(byte[] vvvvInOid) {
        _vvvvInOid = vvvvInOid;
    }

    /**
     * [get] vvvvInUuid: {uuid as In} <br>
     * @return The value of vvvvInUuid. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public java.util.UUID getVvvvInUuid() {
        return _vvvvInUuid;
    }

    /**
     * [set] vvvvInUuid: {uuid as In} <br>
     * @param vvvvInUuid The value of vvvvInUuid. (NullAllowed)
     */
    public void setVvvvInUuid(java.util.UUID vvvvInUuid) {
        _vvvvInUuid = vvvvInUuid;
    }
}
