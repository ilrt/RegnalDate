package ie.beyond2022.utils.regnaldate;

import org.joda.time.DateTime;
import org.joda.time.chrono.GJChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class RegnalDateAsRangeImpl implements RegnalDate {

    public RegnalDateAsRangeImpl(final String originalText, RegnalYear regnalYear, String regnalYearMonarch) {
        this.originalText = originalText;
        this.regnalYear = regnalYear;
        this.dayMonthFeastText = null;
        this.regnalYearMonarch = regnalYearMonarch;
    }

    // the original text parsed
    private final String originalText;

    private final RegnalYear regnalYear;

    // part of the original text that has day, month or feast
    private final String dayMonthFeastText;

    // part of the original text with the regnal year
    private final String regnalYearMonarch;


    DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd").withChronology(GJChronology.getInstance());

    @Override
    public Boolean isDate() {
        return false;
    }

    @Override
    public Boolean isRange() {
        return true;
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

        if (regnalYear.getRegnalYearStart().getYear() == regnalYear.getRegnalYearEnd().getYear()) {
            return String.valueOf(regnalYear.getRegnalYearStart().getYear());
        } else {
            return regnalYear.getRegnalYearStart().getYear() + "–" + regnalYear.getRegnalYearEnd().getYear();
        }
    }

    @Override
    public String toString() {

        return regnalYear.getRegnalYearStartAsString() + ":" + regnalYear.getRegnalYearEndAsString();

    }
}
