package ie.beyond2022.utils.regnaldate;

import org.joda.time.DateTime;
import org.joda.time.chrono.GJChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;


/**
 * An object that holds the original regnal date as a string, e.g. '10 September 1 Edward IV' or
 * 'Easter 1 Edward IV and a representation as a DateTime. The toString(), method returns the date in the format
 * YYYY-MM-DD, e.g. '1422-09-10'. If we can't narrow down the date it return the date range for the regnal year,
 * e.g. '1413-03-21:1414-03-20'
 */
public class RegnalDateImpl implements RegnalDate {

    // the original text parsed
    private final String originalText;

    // part of the original text that has day, month or feast
    private final String dayMonthFeastText;

    // part of the original text with the regnal year
    private final String regnalYearMonarch;

    private final DateTime startDate;
    private final DateTime endDate;

    DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd").withChronology(GJChronology.getInstance());

    public RegnalDateImpl(final String originalText, final String dayMonthFeastText, final String regnalYearMonarch,
                          final DateTime startDate) {
        this.originalText = originalText;
        this.dayMonthFeastText = dayMonthFeastText;
        this.regnalYearMonarch = regnalYearMonarch;
        this.startDate = startDate;
        this.endDate = null;
    }

    public RegnalDateImpl(final String originalText, final String regnalYearMonarch, final String startDate,
                          final String endDate) {
        this.originalText = originalText;
        this.dayMonthFeastText = null;
        this.regnalYearMonarch = regnalYearMonarch;
        this.startDate = formatter.parseDateTime(startDate);
        this.endDate = formatter.parseDateTime(endDate);
    }

    @Override
    public Boolean isDate() {
        return true;
    }

    @Override
    public Boolean isRange() {
        return false;
    }

    @Override
    public String getOriginalText() {
        return originalText;
    }

    @Override
    public String getDayMonthFeastText() {
        return dayMonthFeastText;
    }

    @Override
    public String getRegnalYearMonarch() {
        return regnalYearMonarch;
    }

    @Override
    public String getYear() {
        return String.valueOf(startDate.getYear());
    }

    @Override
    public String toString() {
        return startDate.toString(formatter);
    }

}
