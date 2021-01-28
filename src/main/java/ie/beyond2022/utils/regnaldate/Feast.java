package ie.beyond2022.utils.regnaldate;

import org.joda.time.DateTime;
import org.joda.time.chrono.GJChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.time.LocalDate;

public class Feast {

    private final DateTime feastDate;
    private final DateTime feastOctaveDate;
    private final DateTime feastQuindeneDate;

    DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd").withChronology(GJChronology.getInstance());

    public Feast(final String feastDate) {
        this.feastDate = formatter.parseDateTime(feastDate);
        this.feastOctaveDate = this.feastDate.plusDays(7);
        this.feastQuindeneDate = this.feastDate.plusDays(14);
    }

    public DateTime getFeastDate() {
        return feastDate;
    }

    public String getFeastDateAsString() {
        return feastDate.toString(formatter);
    }

    public DateTime getFeastOctaveDate() {
        return feastOctaveDate;
    }

    public String getFeastOctaveDateAsString() {
        return feastOctaveDate.toString(formatter);
    }

    public DateTime getFeastQuindeneDate() {
        return feastQuindeneDate;
    }

    public String getFeastQuindeneDateAsString() {
        return feastQuindeneDate.toString(formatter);
    }
}
