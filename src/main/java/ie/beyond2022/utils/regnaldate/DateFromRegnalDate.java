package ie.beyond2022.utils.regnaldate;

import ie.beyond2022.utils.regnaldate.utils.RegnalDateLookupUtility;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.chrono.GJChronology;


import java.io.IOException;


public class DateFromRegnalDate {

    RegnalDateLookupUtility regnalDateLookupUtility;
    Chronology chronology = GJChronology.getInstance();

    public DateFromRegnalDate() throws IOException {
        regnalDateLookupUtility = new RegnalDateLookupUtility();
    }

    public RegnalYear rangeForRegnalYear(int regnal, String monarch, int ordinal) {
        String key = String.format("%s-%d-%d", monarch, ordinal, regnal);
        return regnalDateLookupUtility.lookup(key);
    }

    public DateTime dateFromRegnal(int dayOfMonth, int month, int regnal, String monarch, int ordinal) {

        RegnalYear regnalYear = rangeForRegnalYear(regnal, monarch, ordinal);

        if (month > regnalYear.getRegnalYearStart().getMonthOfYear()) {
            return new DateTime(regnalYear.getRegnalYearStart().getYear(), month, dayOfMonth, 0, 0, chronology);
        } else if (month == regnalYear.getRegnalYearStart().getMonthOfYear()) {
            if (dayOfMonth >= regnalYear.getRegnalYearStart().getDayOfMonth()) {
                return new DateTime(regnalYear.getRegnalYearStart().getYear(), month, dayOfMonth, 0, 0, chronology);
            } else {
                return new DateTime(regnalYear.getRegnalYearEnd().getYear(), month, dayOfMonth, 0, 0, chronology);
            }
        } else {
            return new DateTime(regnalYear.getRegnalYearEnd().getYear(), month, dayOfMonth, 0, 0, chronology);
        }

    }
}
