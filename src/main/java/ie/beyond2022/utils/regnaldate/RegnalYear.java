
package ie.beyond2022.utils.regnaldate;

public class RegnalYear {
    /**
     * Represents a regnal year, giving the start and end date as a string. We don't encapsulate the name
     * of the monarch etc. since that is already known when get this object.
     */

    final private String regnalYearStart;
    final private String regnalYearEnd;

    public RegnalYear(final String regnalYearStart, final String regnalYearEnd) {
        this.regnalYearStart = regnalYearStart;
        this.regnalYearEnd = regnalYearEnd;
    }

    public String getRegnalYearStart() {
        return regnalYearStart;
    }

    public String getRegnalYearEnd() {
        return regnalYearEnd;
    }
}
