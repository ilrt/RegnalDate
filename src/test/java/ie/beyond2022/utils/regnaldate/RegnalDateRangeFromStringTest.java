package ie.beyond2022.utils.regnaldate;


import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class RegnalDateRangeFromStringTest {

    // ---------- Henry III

    @Test
    public void test_1_Henry_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("1 Henry III");
        assertEquals("1216-10-28:1217-10-27", val.toString());
        assertEquals("1 Henry III", val.getRegnalYearMonarch());
        assertEquals("1216–1217", val.getYear());
        assertTrue(val.isRange());
        assertFalse(val.isDate());
    }

    @Test
    public void test_57_Henry_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("57 Henry III");
        assertEquals("1272-10-28:1272-11-16", val.toString());
        assertEquals("57 Henry III", val.getRegnalYearMonarch());
        assertEquals("1272", val.getYear());
        assertTrue(val.isRange());
        assertFalse(val.isDate());
    }

    // ---------- Edward I

    @Test
    public void test_1_Edward_I() throws IOException {
        RegnalDate val = RegnalDate.parseString("1 Edward I");
        assertEquals("1272-11-20:1273-11-19", val.toString());
        assertEquals("1 Edward I", val.getRegnalYearMonarch());
        assertEquals("1272–1273", val.getYear());
        assertTrue(val.isRange());
        assertFalse(val.isDate());
    }

    @Test
    public void test_35_Edward_I() throws IOException {
        RegnalDate val = RegnalDate.parseString("35 Edward I");
        assertEquals("1306-11-20:1307-07-07", val.toString());
        assertEquals("35 Edward I", val.getRegnalYearMonarch());
        assertEquals("1306–1307", val.getYear());
        assertTrue(val.isRange());
        assertFalse(val.isDate());
    }

    // ---------- Edward II

    @Test
    public void test_1_Edward_II() throws IOException {
        RegnalDate val = RegnalDate.parseString("1 Edward II");
        assertEquals("1307-07-08:1308-07-07", val.toString());
        assertEquals("1 Edward II", val.getRegnalYearMonarch());
        assertEquals("1307–1308", val.getYear());
        assertTrue(val.isRange());
        assertFalse(val.isDate());
    }

    @Test
    public void test_20_Edward_II() throws IOException {
        RegnalDate val = RegnalDate.parseString("20 Edward II");
        assertEquals("1326-07-08:1327-01-20", val.toString());
        assertEquals("20 Edward II", val.getRegnalYearMonarch());
        assertEquals("1326–1327", val.getYear());
        assertTrue(val.isRange());
        assertFalse(val.isDate());
    }

    // ---------- Edward III

    @Test
    public void test_1_Edward_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("1 Edward III");
        assertEquals("1327-01-25:1328-01-24", val.toString());
        assertEquals("1 Edward III", val.getRegnalYearMonarch());
        assertEquals("1327–1328", val.getYear());
        assertTrue(val.isRange());
        assertFalse(val.isDate());
    }

    @Test
    public void test_51_Edward_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("51 Edward III");
        assertEquals("1377-01-25:1377-06-21", val.toString());
        assertEquals("51 Edward III", val.getRegnalYearMonarch());
        assertEquals("1377", val.getYear());
        assertTrue(val.isRange());
        assertFalse(val.isDate());
    }

    // ---------- Richard II

    @Test
    public void test_1_Richard_II() throws IOException {
        RegnalDate val = RegnalDate.parseString("1 Richard II");
        assertEquals("1377-06-22:1378-06-21", val.toString());
        assertEquals("1 Richard II", val.getRegnalYearMonarch());
        assertEquals("1377–1378", val.getYear());
        assertTrue(val.isRange());
        assertFalse(val.isDate());
    }

    @Test
    public void test_23_Richard_II() throws IOException {
        RegnalDate val = RegnalDate.parseString("23 Richard II");
        assertEquals("1399-06-22:1399-09-29", val.toString());
        assertEquals("23 Richard II", val.getRegnalYearMonarch());
        assertEquals("1399", val.getYear());
        assertTrue(val.isRange());
        assertFalse(val.isDate());
    }

    // ---------- Henry IV

    @Test
    public void test_1_Henry_IV() throws IOException {
        RegnalDate val = RegnalDate.parseString("1 Henry IV");
        assertEquals("1399-09-30:1400-09-29", val.toString());
        assertEquals("1 Henry IV", val.getRegnalYearMonarch());
        assertEquals("1399–1400", val.getYear());
        assertTrue(val.isRange());
        assertFalse(val.isDate());
    }

    @Test
    public void test_14_Henry_IV() throws IOException {
        RegnalDate val = RegnalDate.parseString("14 Henry IV");
        assertEquals("1412-09-30:1413-03-20", val.toString());
        assertEquals("14 Henry IV", val.getRegnalYearMonarch());
        assertEquals("1412–1413", val.getYear());
        assertTrue(val.isRange());
        assertFalse(val.isDate());
    }

    // ---------- Henry V

    @Test
    public void test_1_Henry_V() throws IOException {
        RegnalDate val = RegnalDate.parseString("1 Henry V");
        assertEquals("1413-03-21:1414-03-20", val.toString());
        assertEquals("1 Henry V", val.getRegnalYearMonarch());
        assertEquals("1413–1414", val.getYear());
        assertTrue(val.isRange());
        assertFalse(val.isDate());
    }

    @Test
    public void test_10_Henry_V() throws IOException {
        RegnalDate val = RegnalDate.parseString("10 Henry V");
        assertEquals("1422-03-21:1422-08-31", val.toString());
        assertEquals("10 Henry V", val.getRegnalYearMonarch());
        assertEquals("1422", val.getYear());
        assertTrue(val.isRange());
        assertFalse(val.isDate());
    }

    // ---------- Henry VI

    @Test
    public void test_1_Henry_VI() throws IOException {
        RegnalDate val = RegnalDate.parseString("1 Henry VI");
        assertEquals("1422-09-01:1423-08-31", val.toString());
        assertEquals("1 Henry VI", val.getRegnalYearMonarch());
        assertEquals("1422–1423", val.getYear());
        assertTrue(val.isRange());
        assertFalse(val.isDate());
    }

    @Test
    public void test_39_Henry_VI() throws IOException {
        RegnalDate val = RegnalDate.parseString("39 Henry VI");
        assertEquals("1460-09-01:1461-03-04", val.toString());
        assertEquals("39 Henry VI", val.getRegnalYearMonarch());
        assertEquals("1460–1461", val.getYear());
        assertTrue(val.isRange());
        assertFalse(val.isDate());
    }

    @Test
    public void test_49_Henry_VI() throws IOException {
        RegnalDate val = RegnalDate.parseString("49 Henry VI");
        assertEquals("1470-10-01:1471-04-11", val.toString());
        assertEquals("49 Henry VI", val.getRegnalYearMonarch());
        assertEquals("1470–1471", val.getYear());
        assertTrue(val.isRange());
        assertFalse(val.isDate());
    }

    // ---------- Edward IV

    @Test
    public void test_1_Edward_IV() throws IOException {
        RegnalDate val = RegnalDate.parseString("1 Edward IV");
        assertEquals("1461-03-04:1462-03-03", val.toString());
        assertEquals("1 Edward IV", val.getRegnalYearMonarch());
        assertEquals("1461–1462", val.getYear());
        assertTrue(val.isRange());
        assertFalse(val.isDate());
    }

    @Test
    public void test_23_Edward_IV() throws IOException {
        RegnalDate val = RegnalDate.parseString("23 Edward IV");
        assertEquals("1483-03-04:1483-04-09", val.toString());
        assertEquals("23 Edward IV", val.getRegnalYearMonarch());
        assertEquals("1483", val.getYear());
        assertTrue(val.isRange());
        assertFalse(val.isDate());
    }

    // ---------- Edward V

    @Test
    public void test_1_Edward_V() throws IOException {
        RegnalDate val = RegnalDate.parseString("1 Edward V");
        assertEquals("1483-04-09:1483-06-25", val.toString());
        assertEquals("1 Edward V", val.getRegnalYearMonarch());
        assertEquals("1483", val.getYear());
        assertTrue(val.isRange());
        assertFalse(val.isDate());
    }

    // ---------- Richard III

    @Test
    public void test_1_Richard_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("1 Richard III");
        assertEquals("1483-06-26:1484-06-25", val.toString());
        assertEquals("1 Richard III", val.getRegnalYearMonarch());
        assertEquals("1483–1484", val.getYear());
        assertTrue(val.isRange());
        assertFalse(val.isDate());
    }

    @Test
    public void test_3_Richard_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("3 Richard III");
        assertEquals("1485-06-26:1485-08-22", val.toString());
        assertEquals("3 Richard III", val.getRegnalYearMonarch());
        assertEquals("1485", val.getYear());
        assertTrue(val.isRange());
        assertFalse(val.isDate());
    }

    // ---------- Henry VII

    @Test
    public void test_1_Henry_VII() throws IOException {
        RegnalDate val = RegnalDate.parseString("1 Henry VII");
        assertEquals("1485-08-22:1486-08-21", val.toString());
        assertEquals("1 Henry VII", val.getRegnalYearMonarch());
        assertEquals("1485–1486", val.getYear());
        assertTrue(val.isRange());
        assertFalse(val.isDate());
    }

    @Test
    public void test_24_Henry_VII() throws IOException {
        RegnalDate val = RegnalDate.parseString("24 Henry VII");
        assertEquals("1508-08-22:1509-04-21", val.toString());
        assertEquals("24 Henry VII", val.getRegnalYearMonarch());
        assertEquals("1508–1509", val.getYear());
        assertTrue(val.isRange());
        assertFalse(val.isDate());
    }

}
