package ie.beyond2022.utils.regnaldate;

public class DaysOfWeekUtility {
    /**
     * We need to calculate the number of days between a feast and a day after, e.g. 'Thursday after St. Swithin'.
     * Each day has a numerical number: Monday (0) to Sunday (6). Feasts are quite often on Sunday. We count the
     * days from the feast to the day mentioned. We can use the total in arithmetic in JodaTime.
     *
     * @param feastDayNo 1–7, for Monday to Sunday
     * @param dayAfterNo 1–7, for Monday to Sunday
     * @return the number of days between the feast and the day
     */

    public static int calculateDayAfterFeast(int feastDayNo, int dayAfterNo) {

        // we are into the following week ...
        if (dayAfterNo < feastDayNo) {
            return (7 - feastDayNo) + dayAfterNo;

        } else {
            return dayAfterNo - feastDayNo;
        }
    }

    public static int calculateDayBeforeFeast(int feastDayNo, int dayBeforeNo) {
        if (dayBeforeNo < feastDayNo) {
            return feastDayNo - dayBeforeNo;
        } else {
            return (7 + feastDayNo) - dayBeforeNo;
        }
    }
}