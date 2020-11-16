package ie.beyond2022.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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
}
