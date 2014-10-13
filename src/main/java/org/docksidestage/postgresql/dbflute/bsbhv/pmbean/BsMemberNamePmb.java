package org.docksidestage.postgresql.dbflute.bsbhv.pmbean;

import java.util.*;

import org.dbflute.outsidesql.typed.*;
import org.dbflute.jdbc.*;
import org.dbflute.cbean.coption.LikeSearchOption;
import org.dbflute.exception.*;
import org.dbflute.outsidesql.PmbCustodial;
import org.dbflute.outsidesql.PmbCustodial.ShortCharHandlingMode;
import org.dbflute.util.DfTypeUtil;
import org.docksidestage.postgresql.dbflute.allcommon.*;
import org.docksidestage.postgresql.dbflute.exbhv.*;

/**
 * The base class for typed parameter-bean of MemberName. <br />
 * This is related to "<span style="color: #AD4747">selectMemberName</span>" on MemberBhv.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMemberNamePmb implements ListHandlingPmb<MemberBhv, String>, EntityHandlingPmb<MemberBhv, String>, FetchBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of memberId. */
    protected Integer _memberId;

    /** The parameter of memberName:likePrefix. */
    protected String _memberName;

    /** The option of like-search for memberName. */
    protected LikeSearchOption _memberNameInternalLikeSearchOption;

    /** The max size of safety result. */
    protected int _safetyMaxResultSize;

    /** The time-zone for filtering e.g. from-to. (NullAllowed: if null, default zone) */
    protected TimeZone _timeZone;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the typed parameter-bean of MemberName. <br />
     * This is related to "<span style="color: #AD4747">selectMemberName</span>" on MemberBhv.
     */
    public BsMemberNamePmb() {
    }

    // ===================================================================================
    //                                                                Typed Implementation
    //                                                                ====================
    /**
     * {@inheritDoc}
     */
    public String getOutsideSqlPath() {
        return "selectMemberName";
    }

    /**
     * Get the type of an entity for result. (implementation)
     * @return The type instance of an entity, varchar(200), refers to member.member_name. (NotNull)
     */
    public Class<String> getEntityType() {
        return String.class;
    }

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
    //                                                                   Alternate Boolean
    //                                                                   =================
    /**
     * This is an alternate boolean method waiting for your overriding.
     * @return The determination, true or false for your complex conditions.
     */
    public abstract boolean existsBirthdate();

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    // -----------------------------------------------------
    //                                                String
    //                                                ------
    protected String filterStringParameter(String value) {
        return isEmptyStringParameterAllowed() ? value : convertEmptyToNull(value);
    }

    protected boolean isEmptyStringParameterAllowed() {
	    return DBFluteConfig.getInstance().isEmptyStringParameterAllowed();
    }

    protected String convertEmptyToNull(String value) {
	    return PmbCustodial.convertEmptyToNull(value);
    }

    protected String handleShortChar(String propertyName, String value, Integer size) {
        ShortCharHandlingMode mode = chooseShortCharHandlingMode(propertyName, value, size);
        return PmbCustodial.handleShortChar(propertyName, value, size, mode);
    }

    protected ShortCharHandlingMode chooseShortCharHandlingMode(String propertyName, String value, Integer size) {
        return ShortCharHandlingMode.NONE;
    }

    protected void assertLikeSearchOptionValid(String name, LikeSearchOption option) {
        if (option == null) {
            String msg = "The like-search option is required!";
            throw new RequiredOptionNotFoundException(msg);
        }
        if (option.isSplit()) {
            String msg = "The split of like-search is NOT available on parameter-bean.";
            msg = msg + " Don't use splitByXxx(): " + option;
            throw new IllegalOutsideSqlOperationException(msg);
        }
    }

    // -----------------------------------------------------
    //                                                  Date
    //                                                  ----
    protected Date toUtilDate(Object date) {
        return PmbCustodial.toUtilDate(date, _timeZone);
    }

    protected String formatUtilDate(Date date) {
        String pattern = "yyyy-MM-dd";
        return PmbCustodial.formatUtilDate(date, pattern, _timeZone);
    }

    protected TimeZone chooseRealTimeZone() {
        return PmbCustodial.chooseRealTimeZone(_timeZone);
    }

    /**
     * Set time-zone, basically for LocalDate conversion. <br />
     * Normally you don't need to set this, you can adjust other ways. <br />
     * (DBFlute system's time-zone is used as default)
     * @param timeZone The time-zone for filtering. (NullAllowed: if null, default zone)
     */
    public void zone(TimeZone timeZone) {
        _timeZone = timeZone;
    }

    // -----------------------------------------------------
    //                                               Various
    //                                               -------
    protected <NUMBER extends Number> NUMBER toNumber(Object obj, Class<NUMBER> type) { // might be called by option handling
        return PmbCustodial.toNumber(obj, type);
    }

    protected Boolean toBoolean(Object obj) {
        return PmbCustodial.toBoolean(obj);
    }

    protected String formatByteArray(byte[] bytes) {
        return PmbCustodial.formatByteArray(bytes);
    }

    @SuppressWarnings("unchecked")
    protected <ELEMENT> ArrayList<ELEMENT> newArrayList(ELEMENT... elements) { // might be called by option handling
        return PmbCustodial.newArrayList(elements);
    }

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
        sb.append(dm).append(_memberName);
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
     * [get] memberName:likePrefix <br />
     * @return The value of memberName. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getMemberName() {
        return filterStringParameter(_memberName);
    }

    /**
     * [set as prefixSearch] memberName:likePrefix <br />
     * @param memberName The value of memberName. (NullAllowed)
     */
    public void setMemberName_PrefixSearch(String memberName) {
        _memberName = memberName;
        _memberNameInternalLikeSearchOption = new LikeSearchOption().likePrefix();
    }

    /**
     * Get the internal option of likeSearch for memberName. {Internal Method: Don't invoke this}
     * @return The internal option of likeSearch for memberName. (NullAllowed)
     */
    public LikeSearchOption getMemberNameInternalLikeSearchOption() {
        return _memberNameInternalLikeSearchOption;
    }
}
