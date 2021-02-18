package ie.beyond2022.utils.regnaldate;


import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class DaysOfWeekUtilityTest {

    DaysOfWeekUtility utility = new DaysOfWeekUtility();

    // Days after a feast

    @Test
    public void test_monday_after_sunday() {
        assertEquals(1, utility.calculateDayAfterFeast(7, 1));
    }

    @Test
    public void test_tuesday_after_sunday() {
        assertEquals(2, utility.calculateDayAfterFeast(7, 2));
    }

    @Test
    public void test_wednesday_after_sunday() {
        assertEquals(3, utility.calculateDayAfterFeast(7, 3));
    }

    @Test
    public void test_thursday_after_sunday() {
        assertEquals(4, utility.calculateDayAfterFeast(7, 4));
    }

    @Test
    public void test_friday_after_sunday() {
        assertEquals(5, utility.calculateDayAfterFeast(7, 5));
    }

    @Test
    public void test_saturday_after_sunday() {
        assertEquals(6, utility.calculateDayAfterFeast(7, 6));
    }

    @Test
    public void test_tuesday_after_monday() {
        assertEquals(1, utility.calculateDayAfterFeast(1, 2));
    }

    @Test
    public void test_saturday_after_monday() {
        assertEquals(5, utility.calculateDayAfterFeast(1, 6));
    }

    @Test
    public void test_tuesday_after_wednesday() {
        assertEquals(6, utility.calculateDayAfterFeast(5, 4));
    }

    // Days before a feast
    @Test
    public void test_monday_before_sunday() {
        assertEquals(6, utility.calculateDayBeforeFeast(7, 1));
    }

    @Test
    public void test_tuesday_before_sunday() {
        assertEquals(5, utility.calculateDayBeforeFeast(7, 2));
    }

    @Test
    public void test_wednesday_before_sunday() {
        assertEquals(4, utility.calculateDayBeforeFeast(7, 3));
    }

    @Test
    public void test_thursday_before_sunday() {
        assertEquals(3, utility.calculateDayBeforeFeast(7, 4));
    }

    @Test
    public void test_friday_before_sunday() {
        assertEquals(2, utility.calculateDayBeforeFeast(7, 5));
    }

    @Test
    public void test_sunday_before_sunday() {
        assertEquals(7, utility.calculateDayBeforeFeast(7, 7));
    }

    @Test
    public void test_thursday_before_Saturday() {
        assertEquals(2, utility.calculateDayBeforeFeast(6, 4));
    }
}
