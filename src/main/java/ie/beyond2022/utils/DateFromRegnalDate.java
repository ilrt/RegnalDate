package ie.beyond2022.utils;

import java.io.IOException;
import java.time.LocalDate;


public class DateFromRegnalDate {

    RegnalDateLookupUtility regnalDateLookupUtility;

    public DateFromRegnalDate() throws IOException {
        regnalDateLookupUtility = new RegnalDateLookupUtility();
    }

    public RegnalYear rangeForRegnalYear(int regnal, String monarch, int ordinal) {
        String key = String.format("%s-%d-%d", monarch, ordinal, regnal);
        return regnalDateLookupUtility.lookup(key);
    }

    public LocalDate dateFromRegnal(int dayOfMonth, int month, int regnal, String monarch, int ordinal) {

        RegnalYear regnalYear = rangeForRegnalYear(regnal, monarch, ordinal);

        String start = regnalYear.getRegnalYearStart();
        String[] start_tmp = start.split("-");
        int start_date = Integer.parseInt(start_tmp[2]);
        int start_month = Integer.parseInt(start_tmp[1]);
        int start_year = Integer.parseInt(start_tmp[0]);

        String end = regnalYear.getRegnalYearEnd();
        String[] end_tmp = end.split("-");
        int end_date = Integer.parseInt(end_tmp[2]);
        int end_month = Integer.parseInt(end_tmp[1]);
        int end_year = Integer.parseInt(end_tmp[0]);

        if (month > start_month) {
            return LocalDate.of(start_year, month, dayOfMonth);
        } else if (month == start_month) {
            if (dayOfMonth >= start_date) {
                return LocalDate.of(start_year, month, dayOfMonth);
            } else {
                return LocalDate.of(end_year, month, dayOfMonth);
            }
        } else {
            return LocalDate.of(end_year, month, dayOfMonth);
        }

    }
}
