package ie.beyond2022.utils.regnaldate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Feast {

    private final LocalDate feastDate;
    private final LocalDate feastOctaveDate;
    private final LocalDate feastQuindeneDate;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public Feast(final String feastDate, final String feastOctaveDate, final String feastQuindeneDate) {

        this.feastDate = LocalDate.parse(feastDate, formatter);
        this.feastOctaveDate = LocalDate.parse(feastOctaveDate, formatter);
        this.feastQuindeneDate = LocalDate.parse(feastQuindeneDate, formatter);
    }

    public LocalDate getFeastDate() {
        return feastDate;
    }

    public String getFeastDateAsString() {
        return feastDate.format(formatter);
    }

    public LocalDate getFeastOctaveDate() {
        return feastOctaveDate;
    }

    public String getFeastOctaveDateAsString() {
        return feastOctaveDate.format(formatter);
    }

    public LocalDate getFeastQuindeneDate() {
        return feastQuindeneDate;
    }

    public String getFeastQuindeneDateAsString() {
        return feastQuindeneDate.format(formatter);
    }
}
