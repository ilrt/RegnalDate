package ie.beyond2022.utils.regnaldate.utils;

import ie.beyond2022.utils.regnaldate.MovableFeastsForYear;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovableDatesLookupUtilityTest {

    @Test
    public void testKeyNumber() throws IOException {
        // Test we loaded the correct number of years
        MovableFeastLookupUtility lookup = new MovableFeastLookupUtility();
        assertEquals(294, lookup.feastsLookup.keySet().size());
    }

    @Test
    public void test_1383() throws IOException {
        MovableFeastLookupUtility lookup = new MovableFeastLookupUtility();
        MovableFeastsForYear feasts = lookup.lookup(1383);
        assertEquals("1383-03-22", feasts.getEaster().getFeastDateAsString());
        assertEquals("1383-02-01", feasts.getQuinquageisima().getFeastDateAsString());
        assertEquals("1383-02-08", feasts.getQuadrageisma().getFeastDateAsString());
        assertEquals("1383-04-26", feasts.getRogation().getFeastDateAsString());
        assertEquals("1383-04-30", feasts.getAscension().getFeastDateAsString());
        assertEquals("1383-05-10", feasts.getPentecost().getFeastDateAsString());
        assertEquals("1383-05-17", feasts.getTrinity().getFeastDateAsString());
        assertEquals("1383-05-21", feasts.getCorpus_christi().getFeastDateAsString());
    }

    @Test
    public void test_1231() throws IOException {
        MovableFeastLookupUtility lookup = new MovableFeastLookupUtility();
        MovableFeastsForYear feasts = lookup.lookup(1231);
        assertEquals("1231-03-23", feasts.getEaster().getFeastDateAsString());
        assertEquals("1231-02-02", feasts.getQuinquageisima().getFeastDateAsString());
        assertEquals("1231-02-09", feasts.getQuadrageisma().getFeastDateAsString());
        assertEquals("1231-04-27", feasts.getRogation().getFeastDateAsString());
        assertEquals("1231-05-01", feasts.getAscension().getFeastDateAsString());
        assertEquals("1231-05-11", feasts.getPentecost().getFeastDateAsString());
        assertEquals("1231-05-18", feasts.getTrinity().getFeastDateAsString());
        assertEquals("1231-05-22", feasts.getCorpus_christi().getFeastDateAsString());
    }

    @Test
    public void test_1353() throws IOException {
        MovableFeastLookupUtility lookup = new MovableFeastLookupUtility();
        MovableFeastsForYear feasts = lookup.lookup(1353);
        assertEquals("1353-03-24", feasts.getEaster().getFeastDateAsString());
        assertEquals("1353-02-03", feasts.getQuinquageisima().getFeastDateAsString());
        assertEquals("1353-02-10", feasts.getQuadrageisma().getFeastDateAsString());
        assertEquals("1353-04-28", feasts.getRogation().getFeastDateAsString());
        assertEquals("1353-05-02", feasts.getAscension().getFeastDateAsString());
        assertEquals("1353-05-12", feasts.getPentecost().getFeastDateAsString());
        assertEquals("1353-05-19", feasts.getTrinity().getFeastDateAsString());
        assertEquals("1353-05-23", feasts.getCorpus_christi().getFeastDateAsString());
    }

    @Test
    public void test_1364_leap_year() throws IOException {
        MovableFeastLookupUtility lookup = new MovableFeastLookupUtility();
        MovableFeastsForYear feasts = lookup.lookup(1364);
        assertEquals("1364-03-24", feasts.getEaster().getFeastDateAsString());
        assertEquals("1364-02-04", feasts.getQuinquageisima().getFeastDateAsString());
        assertEquals("1364-02-11", feasts.getQuadrageisma().getFeastDateAsString());
        assertEquals("1364-04-28", feasts.getRogation().getFeastDateAsString());
        assertEquals("1364-05-02", feasts.getAscension().getFeastDateAsString());
        assertEquals("1364-05-12", feasts.getPentecost().getFeastDateAsString());
        assertEquals("1364-05-19", feasts.getTrinity().getFeastDateAsString());
        assertEquals("1364-05-23", feasts.getCorpus_christi().getFeastDateAsString());
    }

    @Test
    public void test_1285() throws IOException {
        MovableFeastLookupUtility lookup = new MovableFeastLookupUtility();
        MovableFeastsForYear feasts = lookup.lookup(1285);
        assertEquals("1285-03-25", feasts.getEaster().getFeastDateAsString());
        assertEquals("1285-02-04", feasts.getQuinquageisima().getFeastDateAsString());
        assertEquals("1285-02-11", feasts.getQuadrageisma().getFeastDateAsString());
        assertEquals("1285-04-29", feasts.getRogation().getFeastDateAsString());
        assertEquals("1285-05-03", feasts.getAscension().getFeastDateAsString());
        assertEquals("1285-05-13", feasts.getPentecost().getFeastDateAsString());
        assertEquals("1285-05-20", feasts.getTrinity().getFeastDateAsString());
        assertEquals("1285-05-24", feasts.getCorpus_christi().getFeastDateAsString());
    }

    @Test
    public void test_1296_leap_year() throws IOException {
        MovableFeastLookupUtility lookup = new MovableFeastLookupUtility();
        MovableFeastsForYear feasts = lookup.lookup(1296);
        assertEquals("1296-03-25", feasts.getEaster().getFeastDateAsString());
        assertEquals("1296-02-05", feasts.getQuinquageisima().getFeastDateAsString());
        assertEquals("1296-02-12", feasts.getQuadrageisma().getFeastDateAsString());
        assertEquals("1296-04-29", feasts.getRogation().getFeastDateAsString());
        assertEquals("1296-05-03", feasts.getAscension().getFeastDateAsString());
        assertEquals("1296-05-13", feasts.getPentecost().getFeastDateAsString());
        assertEquals("1296-05-20", feasts.getTrinity().getFeastDateAsString());
        assertEquals("1296-05-24", feasts.getCorpus_christi().getFeastDateAsString());
    }

    @Test
    public void test_1307() throws IOException {
        MovableFeastLookupUtility lookup = new MovableFeastLookupUtility();
        MovableFeastsForYear feasts = lookup.lookup(1307);
        assertEquals("1307-03-26", feasts.getEaster().getFeastDateAsString());
        assertEquals("1307-02-05", feasts.getQuinquageisima().getFeastDateAsString());
        assertEquals("1307-02-12", feasts.getQuadrageisma().getFeastDateAsString());
        assertEquals("1307-04-30", feasts.getRogation().getFeastDateAsString());
        assertEquals("1307-05-04", feasts.getAscension().getFeastDateAsString());
        assertEquals("1307-05-14", feasts.getPentecost().getFeastDateAsString());
        assertEquals("1307-05-21", feasts.getTrinity().getFeastDateAsString());
        assertEquals("1307-05-25", feasts.getCorpus_christi().getFeastDateAsString());
    }

    @Test
    public void test_1312_leap_year() throws IOException {
        MovableFeastLookupUtility lookup = new MovableFeastLookupUtility();
        MovableFeastsForYear feasts = lookup.lookup(1312);
        assertEquals("1312-03-26", feasts.getEaster().getFeastDateAsString());
        assertEquals("1312-02-06", feasts.getQuinquageisima().getFeastDateAsString());
        assertEquals("1312-02-13", feasts.getQuadrageisma().getFeastDateAsString());
        assertEquals("1312-04-30", feasts.getRogation().getFeastDateAsString());
        assertEquals("1312-05-04", feasts.getAscension().getFeastDateAsString());
        assertEquals("1312-05-14", feasts.getPentecost().getFeastDateAsString());
        assertEquals("1312-05-21", feasts.getTrinity().getFeastDateAsString());
        assertEquals("1312-05-25", feasts.getCorpus_christi().getFeastDateAsString());
    }

    @Test
    public void test_1429() throws IOException {
        MovableFeastLookupUtility lookup = new MovableFeastLookupUtility();
        MovableFeastsForYear feasts = lookup.lookup(1429);
        assertEquals("1429-03-27", feasts.getEaster().getFeastDateAsString());
        assertEquals("1429-02-06", feasts.getQuinquageisima().getFeastDateAsString());
        assertEquals("1429-02-13", feasts.getQuadrageisma().getFeastDateAsString());
        assertEquals("1429-05-01", feasts.getRogation().getFeastDateAsString());
        assertEquals("1429-05-05", feasts.getAscension().getFeastDateAsString());
        assertEquals("1429-05-15", feasts.getPentecost().getFeastDateAsString());
        assertEquals("1429-05-22", feasts.getTrinity().getFeastDateAsString());
        assertEquals("1429-05-26", feasts.getCorpus_christi().getFeastDateAsString());
    }

    @Test
    public void test_1440_leap_year() throws IOException {
        MovableFeastLookupUtility lookup = new MovableFeastLookupUtility();
        MovableFeastsForYear feasts = lookup.lookup(1440);
        assertEquals("1440-03-27", feasts.getEaster().getFeastDateAsString());
        assertEquals("1440-02-07", feasts.getQuinquageisima().getFeastDateAsString());
        assertEquals("1440-02-14", feasts.getQuadrageisma().getFeastDateAsString());
        assertEquals("1440-05-01", feasts.getRogation().getFeastDateAsString());
        assertEquals("1440-05-05", feasts.getAscension().getFeastDateAsString());
        assertEquals("1440-05-15", feasts.getPentecost().getFeastDateAsString());
        assertEquals("1440-05-22", feasts.getTrinity().getFeastDateAsString());
        assertEquals("1440-05-26", feasts.getCorpus_christi().getFeastDateAsString());
    }

}
