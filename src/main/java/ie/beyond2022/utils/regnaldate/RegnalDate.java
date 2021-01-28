package ie.beyond2022.utils.regnaldate;

import java.io.IOException;

public interface RegnalDate {

    static RegnalDate parseString(String originalText) throws IOException {
        RegnalDateFromString regnalDateFromString = new RegnalDateFromString();
        return regnalDateFromString.parse(originalText);
    }

    Boolean isDate();

    Boolean isRange();

    String getOriginalText();

    String getDayMonthFeastText();

    String getRegnalYearMonarch();

    String getYear();

    @Override
    String toString();
}
