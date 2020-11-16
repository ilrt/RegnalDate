package ie.beyond2022.utils;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * An object that holds the original regnal date as a string, e.g. '10 September 1 Edward VI'
 * and a representation as a LocalDate. The toString(), method returns the date in the format
 * YYYY-MM-DD, e.g. '1422-09-10'.
 */
public class RegnalDate {

    private final String originalText;
    private final LocalDate localDate;

    public RegnalDate(final String originalText, final LocalDate localDate) {
        this.originalText = originalText;
        this.localDate = localDate;
    }

    public String getOriginalText() {
        return originalText;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public int getYear() {
        return localDate.getYear();
    }

    @Override
    public String toString() {
        return localDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    static public RegnalDate parseString(String originalText) throws IOException {
        RegnalDateFromString regnalDateFromString = new RegnalDateFromString();
        return regnalDateFromString.parse(originalText);
    }
}
