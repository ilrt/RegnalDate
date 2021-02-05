package ie.beyond2022.utils.regnaldate;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * These dates were provided by the research team for testing.
 */
public class RegnalDateFromStringResearcherTest {

    // Ascension 18 Henry VI - 5 May 1440
    @Test
    public void test_ascension_18_Henry_VI() throws IOException {
        RegnalDate val = RegnalDate.parseString("Ascension 18 Henry VI");
        assertNotNull(val);
        assertEquals("1440-05-05", val.toString());
        assertEquals("Ascension", val.getDayMonthFeastText());
        assertEquals("18 Henry VI", val.getRegnalYearMonarch());
        assertEquals("1440", val.getYear());
        assertTrue(val.isDate());
        assertFalse(val.isRange());
    }

    // Easter Sunday 6 Richard II - 22 March 1383
    @Test
    public void test_ascension_6_Richard_II() throws IOException {
        RegnalDate val = RegnalDate.parseString("Easter Sunday 6 Richard II");
        assertNotNull(val);
        assertEquals("1383-03-22", val.toString());
        assertEquals("Easter Sunday", val.getDayMonthFeastText());
        assertEquals("6 Richard II", val.getRegnalYearMonarch());
        assertEquals("1383", val.getYear());
        assertTrue(val.isDate());
        assertFalse(val.isRange());
    }

    // Ash Wednesday 31 Edward I - 7 February 1303
    @Test
    public void test_ash_wednesday_30_Edward_I() throws IOException {
        RegnalDate val = RegnalDate.parseString("Ash Wednesday 31 Edward I");
        assertNotNull(val);
        assertEquals("1303-02-20", val.toString());
        assertEquals("Ash Wednesday", val.getDayMonthFeastText());
        assertEquals("31 Edward I", val.getRegnalYearMonarch());
        assertEquals("1303", val.getYear());
        assertTrue(val.isDate());
        assertFalse(val.isRange());
    }

    // Good Friday 39 Edward III - 11 April 1365
    @Test
    public void test_good_friday_39_Edward_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("Good Friday 39 Edward III");
        assertNotNull(val);
        assertEquals("1365-04-11", val.toString());
        assertEquals("Good Friday", val.getDayMonthFeastText());
        assertEquals("39 Edward III", val.getRegnalYearMonarch());
        assertEquals("1365", val.getYear());
        assertTrue(val.isDate());
        assertFalse(val.isRange());
    }

    // Corpus Christi 4 Edward IV - 31 May 1464
    @Test
    public void test_corpus_christi_4_Edward_IV() throws IOException {
        RegnalDate val = RegnalDate.parseString("Corpus Christi 4 Edward IV");
        assertNotNull(val);
        assertEquals("1464-05-31", val.toString());
        assertEquals("Corpus Christi", val.getDayMonthFeastText());
        assertEquals("4 Edward IV", val.getRegnalYearMonarch());
        assertEquals("1464", val.getYear());
        assertTrue(val.isDate());
        assertFalse(val.isRange());
    }

    // the morrow of Trinity 5 Richard II - 2 June 1382
    @Test
    public void test_morrow_trinity_5_Richard_II() throws IOException {
        RegnalDate val = RegnalDate.parseString("the morrow of Trinity 5 Richard II");
        assertNotNull(val);
        assertEquals("1382-06-02", val.toString());
        assertEquals("the morrow of Trinity", val.getDayMonthFeastText());
        assertEquals("5 Richard II", val.getRegnalYearMonarch());
        assertEquals("1382", val.getYear());
        assertTrue(val.isDate());
        assertFalse(val.isRange());
    }

    // the octave of the nativity of St John the Baptist 7 Henry IV - 1 July 1406
    @Test
    public void test_octave_john_baptist_Henry_IV() throws IOException {
        RegnalDate val = RegnalDate.parseString("the octave of the nativity of St John the Baptist 7 Henry IV");
        assertNotNull(val);
        assertEquals("1406-07-01", val.toString());
        assertEquals("the octave of the nativity of St John the Baptist", val.getDayMonthFeastText());
        assertEquals("7 Henry IV", val.getRegnalYearMonarch());
        assertEquals("1406", val.getYear());
        assertTrue(val.isDate());
        assertFalse(val.isRange());
    }

    // the eve of St Agnes 3 Edward II- 20 January 1310
    @Test
    public void test_eve_st_agnes_Edward_II() throws IOException {
        RegnalDate val = RegnalDate.parseString("the eve of St Agnes 3 Edward II");
        assertNotNull(val);
        assertEquals("1310-01-20", val.toString());
        assertEquals("the eve of St Agnes", val.getDayMonthFeastText());
        assertEquals("3 Edward II", val.getRegnalYearMonarch());
        assertEquals("1310", val.getYear());
        assertTrue(val.isDate());
        assertFalse(val.isRange());
    }

    // the octave of Hilary 6 John- 20 January 1205
    @Test
    public void test_quindene_lammas_10_Henry_V() throws IOException {
        RegnalDate val = RegnalDate.parseString("the quindene of Lammas 10 Henry V");
        assertNotNull(val);
        assertEquals("1422-08-15", val.toString());
        assertEquals("the quindene of Lammas", val.getDayMonthFeastText());
        assertEquals("10 Henry V", val.getRegnalYearMonarch());
        assertEquals("1422", val.getYear());
        assertTrue(val.isDate());
        assertFalse(val.isRange());
    }

    // the morrow of Martinmas 15 Edward III- 12 November 1341
    @Test
    public void test_morrow_martimas_15_Edward_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("the morrow of Martinmas 15 Edward III");
        assertNotNull(val);
        assertEquals("1341-11-12", val.toString());
        assertEquals("the morrow of Martinmas", val.getDayMonthFeastText());
        assertEquals("15 Edward III", val.getRegnalYearMonarch());
        assertEquals("1341", val.getYear());
        assertTrue(val.isDate());
        assertFalse(val.isRange());
    }

    // the eve of Corpus Christi 38 Henry VI - 11 June 1460
    @Test
    public void test_eve_corpus_christi_38_Henry_VI() throws IOException {
        RegnalDate val = RegnalDate.parseString("the eve of Corpus Christi 38 Henry VI");
        assertNotNull(val);
        assertEquals("1460-06-11", val.toString());
        assertEquals("the eve of Corpus Christi", val.getDayMonthFeastText());
        assertEquals("38 Henry VI", val.getRegnalYearMonarch());
        assertEquals("1460", val.getYear());
        assertTrue(val.isDate());
        assertFalse(val.isRange());
    }

    // the octave of St Swithun 23 Richard II- 9 July 1399
    @Test
    public void test_eve_octave_swithun_23_Richard_II() throws IOException {
        RegnalDate val = RegnalDate.parseString("the octave of St Swithin 23 Richard II");
        assertNotNull(val);
        assertEquals("1399-07-09", val.toString());
        assertEquals("the octave of St Swithin", val.getDayMonthFeastText());
        assertEquals("23 Richard II", val.getRegnalYearMonarch());
        assertEquals("1399", val.getYear());
        assertTrue(val.isDate());
        assertFalse(val.isRange());
    }
//
//
//
//
//
//
//
//


    //    Monday next after Michaelmas 24 Edward I -1 October 1296

}
