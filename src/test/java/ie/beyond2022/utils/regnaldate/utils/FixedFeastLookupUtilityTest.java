package ie.beyond2022.utils.regnaldate.utils;

import ie.beyond2022.utils.regnaldate.utils.FixedFeastLookupUtility;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FixedFeastLookupUtilityTest {


    @Test
    public void testKeyNumber() throws IOException {
        // Test we loaded the correct number of years
        FixedFeastLookupUtility lookup = new FixedFeastLookupUtility();
        assertEquals(177, lookup.feastsLookup.keySet().size());
    }

    @Test
    public void test_michaelmas() throws IOException {
        FixedFeastLookupUtility lookup = new FixedFeastLookupUtility();
        assertEquals("09-29", lookup.lookup("Michaelmas"));
    }

    @Test
    public void test_michaelmas_2() throws IOException {
        FixedFeastLookupUtility lookup = new FixedFeastLookupUtility();
        assertEquals("09-29", lookup.lookup("Feast of Michaelmas"));
    }

    @Test
    public void test_michaelmas_3() throws IOException {
        FixedFeastLookupUtility lookup = new FixedFeastLookupUtility();
        assertEquals("09-29", lookup.lookup("Octave of Michaelmas"));
    }

    @Test
    public void test_michaelmas_4() throws IOException {
        FixedFeastLookupUtility lookup = new FixedFeastLookupUtility();
        assertEquals("09-29", lookup.lookup("Quindene of the feast Michaelmas"));
    }

    @Test
    public void test_michaelmas_5() throws IOException {
        FixedFeastLookupUtility lookup = new FixedFeastLookupUtility();
        assertEquals("09-29", lookup.lookup("Quindene of the feast Michael"));
    }

    @Test
    public void test_hilary() throws IOException {
        FixedFeastLookupUtility lookup = new FixedFeastLookupUtility();
        assertEquals("01-13", lookup.lookup("Hilary"));
    }

    @Test
    public void test_alban() throws IOException {
        FixedFeastLookupUtility lookup = new FixedFeastLookupUtility();
        assertEquals("06-20", lookup.lookup("Saint Alban"));
    }

    @Test
    public void test_lady_day() throws IOException {
        FixedFeastLookupUtility lookup = new FixedFeastLookupUtility();
        assertEquals("03-25", lookup.lookup("Lady Day"));
    }

    @Test
    public void test_lady_day_2() throws IOException {
        FixedFeastLookupUtility lookup = new FixedFeastLookupUtility();
        assertEquals("03-25", lookup.lookup("Annunciation of the Virgin Mary"));
    }

    @Test
    public void test_lady_day_3() throws IOException {
        FixedFeastLookupUtility lookup = new FixedFeastLookupUtility();
        assertEquals("03-25", lookup.lookup("Annunciation of the Blessed Mary"));
    }
}
