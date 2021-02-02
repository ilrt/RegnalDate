
package ie.beyond2022.utils.regnaldate;

import org.joda.time.DateTime;
import org.joda.time.chrono.GJChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class RegnalYear {
    public DateTime getRegnalYearStart() {
        return regnalYearStart;
    }

    public DateTime getRegnalYearEnd() {
        return regnalYearEnd;
    }

    /**
     * Represents a regnal year, giving the start and end date as a string. We don't encapsulate the name
     * of the monarch etc. since that is already known when get this object.
     */

    final private DateTime regnalYearStart;
    final private DateTime regnalYearEnd;

    DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd").withChronology(GJChronology.getInstance());

    public RegnalYear(final String regnalYearStart, final String regnalYearEnd) {
        this.regnalYearStart = formatter.parseDateTime(regnalYearStart);
        this.regnalYearEnd = formatter.parseDateTime(regnalYearEnd);
    }

    public String getRegnalYearStartAsString() {
        return regnalYearStart.toString(formatter);
    }

    public String getRegnalYearEndAsString() {
        return regnalYearEnd.toString(formatter);
    }



    @Override
    public String toString() {
        return getRegnalYearStartAsString() + ":" + getRegnalYearEndAsString();
    }
}
