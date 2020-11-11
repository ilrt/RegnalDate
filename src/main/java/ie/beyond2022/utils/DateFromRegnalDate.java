package ie.beyond2022.utils;

import java.io.IOException;

public class DateFromRegnalDate {

    RegnalDateLookup regnalDateLookup;

    public DateFromRegnalDate() throws IOException {
        regnalDateLookup = new RegnalDateLookup();
    }

    public RegnalYear rangeForRegnalYear(int regnal, String monarch, int ordinal) {
        String key = String.format("%s-%d-%d", monarch, ordinal, regnal);
        return regnalDateLookup.lookup(key);
    }

    public String dateFromRegnal(int date, int month, int regnal, String monarch, int ordinal) {

        String output = "";

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
            output = String.format("%d-%02d-%02d", start_year, month, date);
        } else if (month == start_month) {
            if (date >= start_date) {
                output = String.format("%d-%02d-%02d", start_year, month, date);
            } else {
                output = String.format("%d-%02d-%02d", end_year, month, date);
            }
        } else {
            output = String.format("%d-%02d-%02d", end_year, month, date);
        }

        return output;
    }
}
