package ie.beyond2022.utils.regnaldate;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.chrono.GJChronology;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EasterDateLookupTest {

    Chronology chronology = GJChronology.getInstance();

    private DateTime dateTime(int year, int month, int dayOfMonth) {
        return new DateTime(year, month, dayOfMonth, 0, 0, chronology);
    }

    @Test
    public void testKeyNumber() throws IOException {
        // Test we loaded the correct number of years
        EasterDateLookupUtility lookup = new EasterDateLookupUtility();
        assertEquals(294, lookup.feastLookup.keySet().size());
    }

    // ---------- The following tests check a snapshot of years


    @Test
    public void test_1216() throws IOException {
        MovableFeastLookupUtility lookup = new MovableFeastLookupUtility();
        MovableFeastsForYear feasts = lookup.lookup(1216);
        Feast feast = feasts.getEaster();
        assertEquals(dateTime(1216, 4, 10), feast.getFeastDate());
        assertEquals("1216-04-10", feast.getFeastDateAsString());
        assertEquals(dateTime(1216, 4, 17), feast.getFeastOctaveDate());
        assertEquals("1216-04-17", feast.getFeastOctaveDateAsString());
        assertEquals(dateTime(1216, 4, 24), feast.getFeastQuindeneDate());
        assertEquals("1216-04-24", feast.getFeastQuindeneDateAsString());
    }


    @Test
    public void test_1230() throws IOException {
        MovableFeastLookupUtility lookup = new MovableFeastLookupUtility();
        MovableFeastsForYear feasts = lookup.lookup(1230);
        Feast feast = feasts.getEaster();
        assertEquals(dateTime(1230, 4, 7), feast.getFeastDate());
        assertEquals("1230-04-07", feast.getFeastDateAsString());
        assertEquals(dateTime(1230, 4, 14), feast.getFeastOctaveDate());
        assertEquals("1230-04-14", feast.getFeastOctaveDateAsString());
        assertEquals(dateTime(1230, 4, 21), feast.getFeastQuindeneDate());
        assertEquals("1230-04-21", feast.getFeastQuindeneDateAsString());
    }

    @Test
    public void test_1253() throws IOException {
        MovableFeastLookupUtility lookup = new MovableFeastLookupUtility();
        MovableFeastsForYear feasts = lookup.lookup(1253);
        Feast feast = feasts.getEaster();
        assertEquals(dateTime(1253, 4, 20), feast.getFeastDate());
        assertEquals("1253-04-20", feast.getFeastDateAsString());
        assertEquals(dateTime(1253, 4, 27), feast.getFeastOctaveDate());
        assertEquals("1253-04-27", feast.getFeastOctaveDateAsString());
        assertEquals(dateTime(1253, 5, 4), feast.getFeastQuindeneDate());
        assertEquals("1253-05-04", feast.getFeastQuindeneDateAsString());
    }

    @Test
    public void test_1277() throws IOException {
        MovableFeastLookupUtility lookup = new MovableFeastLookupUtility();
        MovableFeastsForYear feasts = lookup.lookup(1277);
        Feast feast = feasts.getEaster();
        assertEquals(dateTime(1277, 3, 28), feast.getFeastDate());
        assertEquals("1277-03-28", feast.getFeastDateAsString());
        assertEquals(dateTime(1277, 4, 4), feast.getFeastOctaveDate());
        assertEquals("1277-04-04", feast.getFeastOctaveDateAsString());
        assertEquals(dateTime(1277, 4, 11), feast.getFeastQuindeneDate());
        assertEquals("1277-04-11", feast.getFeastQuindeneDateAsString());
    }

    @Test
    public void test_1300() throws IOException {
        MovableFeastLookupUtility lookup = new MovableFeastLookupUtility();
        MovableFeastsForYear feasts = lookup.lookup(1300);
        Feast feast = feasts.getEaster();
        assertEquals(dateTime(1300, 4, 10), feast.getFeastDate());
        assertEquals("1300-04-10", feast.getFeastDateAsString());
        assertEquals(dateTime(1300, 4, 17), feast.getFeastOctaveDate());
        assertEquals("1300-04-17", feast.getFeastOctaveDateAsString());
        assertEquals(dateTime(1300, 4, 24), feast.getFeastQuindeneDate());
        assertEquals("1300-04-24", feast.getFeastQuindeneDateAsString());
    }

    @Test
    public void test_1350() throws IOException {
        MovableFeastLookupUtility lookup = new MovableFeastLookupUtility();
        MovableFeastsForYear feasts = lookup.lookup(1350);
        Feast feast = feasts.getEaster();
        assertEquals(dateTime(1350, 3, 28), feast.getFeastDate());
        assertEquals("1350-03-28", feast.getFeastDateAsString());
        assertEquals(dateTime(1350, 4, 4), feast.getFeastOctaveDate());
        assertEquals("1350-04-04", feast.getFeastOctaveDateAsString());
        assertEquals(dateTime(1350, 4, 11), feast.getFeastQuindeneDate());
        assertEquals("1350-04-11", feast.getFeastQuindeneDateAsString());
    }

    @Test
    public void test_1391() throws IOException {
        MovableFeastLookupUtility lookup = new MovableFeastLookupUtility();
        MovableFeastsForYear feasts = lookup.lookup(1391);
        Feast feast = feasts.getEaster();
        assertEquals(dateTime(1391, 3, 26), feast.getFeastDate());
        assertEquals("1391-03-26", feast.getFeastDateAsString());
        assertEquals(dateTime(1391, 4, 2), feast.getFeastOctaveDate());
        assertEquals("1391-04-02", feast.getFeastOctaveDateAsString());
        assertEquals(dateTime(1391, 4, 9), feast.getFeastQuindeneDate());
        assertEquals("1391-04-09", feast.getFeastQuindeneDateAsString());
    }

    @Test
    public void test_1442() throws IOException {
        MovableFeastLookupUtility lookup = new MovableFeastLookupUtility();
        MovableFeastsForYear feasts = lookup.lookup(1442);
        Feast feast = feasts.getEaster();
        assertEquals(dateTime(1442, 4, 1), feast.getFeastDate());
        assertEquals("1442-04-01", feast.getFeastDateAsString());
        assertEquals(dateTime(1442, 4, 8), feast.getFeastOctaveDate());
        assertEquals("1442-04-08", feast.getFeastOctaveDateAsString());
        assertEquals(dateTime(1442, 4, 15), feast.getFeastQuindeneDate());
        assertEquals("1442-04-15", feast.getFeastQuindeneDateAsString());
    }

    @Test
    public void test_1483() throws IOException {
        MovableFeastLookupUtility lookup = new MovableFeastLookupUtility();
        MovableFeastsForYear feasts = lookup.lookup(1483);
        Feast feast = feasts.getEaster();
        assertEquals(dateTime(1483, 3, 30), feast.getFeastDate());
        assertEquals("1483-03-30", feast.getFeastDateAsString());
        assertEquals(dateTime(1483, 4, 6), feast.getFeastOctaveDate());
        assertEquals("1483-04-06", feast.getFeastOctaveDateAsString());
        assertEquals(dateTime(1483, 4, 13), feast.getFeastQuindeneDate());
        assertEquals("1483-04-13", feast.getFeastQuindeneDateAsString());
    }

//    1500:1500-04-19:1500-04-26:1500-05-03
    @Test
    public void test_1500() throws IOException {
        MovableFeastLookupUtility lookup = new MovableFeastLookupUtility();
        MovableFeastsForYear feasts = lookup.lookup(1500);
        Feast feast = feasts.getEaster();
        assertEquals(dateTime(1500, 4, 19), feast.getFeastDate());
        assertEquals("1500-04-19", feast.getFeastDateAsString());
        assertEquals(dateTime(1500, 4, 26), feast.getFeastOctaveDate());
        assertEquals("1500-04-26", feast.getFeastOctaveDateAsString());
        assertEquals(dateTime(1500, 5, 3), feast.getFeastQuindeneDate());
        assertEquals("1500-05-03", feast.getFeastQuindeneDateAsString());
    }

}
