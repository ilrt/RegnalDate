package ie.beyond2022.utils.regnaldate;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class RegnalDateFromStringDayBeforeOrAfter {

    @Test
    public void test_thursday_next_after_whitsun_13_Edward_I() throws IOException {
        RegnalDate val = RegnalDate.parseString("Thursday next after Whitsun 13 Edward I");
        assertNotNull(val);
        assertEquals("1285-05-17", val.toString());
        assertEquals("Thursday next after Whitsun", val.getDayMonthFeastText());
        assertEquals("13 Edward I", val.getRegnalYearMonarch());
        assertEquals("1285", val.getYear());
        assertTrue(val.isDate());
        assertFalse(val.isRange());
    }

    @Test
    public void test_thursday_after_whitsun_13_Edward_I() throws IOException {
        RegnalDate val = RegnalDate.parseString("Thursday after Whitsun 13 Edward I");
        assertNotNull(val);
        assertEquals("1285-05-17", val.toString());
        assertEquals("Thursday after Whitsun", val.getDayMonthFeastText());
        assertEquals("13 Edward I", val.getRegnalYearMonarch());
        assertEquals("1285", val.getYear());
        assertTrue(val.isDate());
        assertFalse(val.isRange());
    }

    @Test
    public void test_wednesday_before_whitsun_13_Edward_I() throws IOException {
        RegnalDate val = RegnalDate.parseString("Wednesday before Whitsun 13 Edward I");
        assertNotNull(val);
        assertEquals("1285-05-09", val.toString());
        assertEquals("Wednesday before Whitsun", val.getDayMonthFeastText());
        assertEquals("13 Edward I", val.getRegnalYearMonarch());
        assertEquals("1285", val.getYear());
        assertTrue(val.isDate());
        assertFalse(val.isRange());
    }

    @Test
    public void test_thursday_next_after_easter_13_Edward_I() throws IOException {
        RegnalDate val = RegnalDate.parseString("Thursday next after Easter 13 Edward I");
        assertNotNull(val);
        assertEquals("1285-03-29", val.toString());
        assertEquals("Thursday next after Easter", val.getDayMonthFeastText());
        assertEquals("13 Edward I", val.getRegnalYearMonarch());
        assertEquals("1285", val.getYear());
        assertTrue(val.isDate());
        assertFalse(val.isRange());
    }

    @Test
    public void test_thursday_after_easter_13_Edward_I() throws IOException {
        RegnalDate val = RegnalDate.parseString("Thursday after Easter 13 Edward I");
        assertNotNull(val);
        assertEquals("1285-03-29", val.toString());
        assertEquals("Thursday after Easter", val.getDayMonthFeastText());
        assertEquals("13 Edward I", val.getRegnalYearMonarch());
        assertEquals("1285", val.getYear());
        assertTrue(val.isDate());
        assertFalse(val.isRange());
    }

    @Test
    public void test_thursday_before_easter_13_Edward_I() throws IOException {
        RegnalDate val = RegnalDate.parseString("Thursday before Easter 13 Edward I");
        assertNotNull(val);
        assertEquals("1285-03-22", val.toString());
        assertEquals("Thursday before Easter", val.getDayMonthFeastText());
        assertEquals("13 Edward I", val.getRegnalYearMonarch());
        assertEquals("1285", val.getYear());
        assertTrue(val.isDate());
        assertFalse(val.isRange());
    }

    @Test
    public void test_sunday_next_after_hilary_13_Edward_I() throws IOException {
        RegnalDate val = RegnalDate.parseString("Sunday next after Hilary 13 Edward I");
        assertNotNull(val);
        assertEquals("1285-01-14", val.toString());
        assertEquals("Sunday next after Hilary", val.getDayMonthFeastText());
        assertEquals("13 Edward I", val.getRegnalYearMonarch());
        assertEquals("1285", val.getYear());
        assertTrue(val.isDate());
        assertFalse(val.isRange());
    }

    @Test
    public void test_sunday_after_hilary_13_Edward_I() throws IOException {
        RegnalDate val = RegnalDate.parseString("Sunday after Hilary 13 Edward I");
        assertNotNull(val);
        assertEquals("1285-01-14", val.toString());
        assertEquals("Sunday after Hilary", val.getDayMonthFeastText());
        assertEquals("13 Edward I", val.getRegnalYearMonarch());
        assertEquals("1285", val.getYear());
        assertTrue(val.isDate());
        assertFalse(val.isRange());
    }

    @Test
    public void test_tuesday_before_hilary_13_Edward_I() throws IOException {
        RegnalDate val = RegnalDate.parseString("Tuesday before Hilary 13 Edward I");
        assertNotNull(val);
        assertEquals("1285-01-09", val.toString());
        assertEquals("Tuesday before Hilary", val.getDayMonthFeastText());
        assertEquals("13 Edward I", val.getRegnalYearMonarch());
        assertEquals("1285", val.getYear());
        assertTrue(val.isDate());
        assertFalse(val.isRange());
    }
}
