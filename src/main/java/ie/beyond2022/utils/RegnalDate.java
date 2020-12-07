package ie.beyond2022.utils;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * An object that holds the original regnal date as a string, e.g. '10 September 1 Edward VI'
 * and a representation as a LocalDate. The toString(), method returns the date in the format
 * YYYY-MM-DD, e.g. '1422-09-10'.
 */
public class RegnalDate extends Regnal {

    private final String dayMonthText;
    private final String regnalYearMonarch;
    private final LocalDate startDate;
    private final LocalDate endDate;

    public RegnalDate(final String originalText, final String dayMonthText, final String regnalYearMonarch,
                      final LocalDate startDate) {
        super(originalText);
        this.dayMonthText = dayMonthText;
        this.regnalYearMonarch = regnalYearMonarch;
        this.startDate = startDate;
        this.endDate = null;
    }

    public RegnalDate(final String originalText, final String regnalYearMonarch, final LocalDate startDate,
                      final LocalDate endDate) {
        super(originalText);
        this.dayMonthText = null;
        this.regnalYearMonarch = regnalYearMonarch;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getDayMonthText() {
        return dayMonthText;
    }

    public String getRegnalYearMonarch() {
        return regnalYearMonarch;
    }

    public String getYear() {

        if (endDate == null) {
            return String.valueOf(startDate.getYear());
        }

        if (startDate.getYear() == endDate.getYear()) {
            return String.valueOf(startDate.getYear());
        }

        return startDate.getYear() + "–" + endDate.getYear();
    }

    @Override
    public String toString() {
        if (endDate == null) {
            return startDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        } else {
            return startDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) + ":" +
                    endDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        }

    }

    static public RegnalDate parseString(String originalText) throws IOException {
        RegnalDateFromString regnalDateFromString = new RegnalDateFromString();
        return regnalDateFromString.parse(originalText);
    }
}
