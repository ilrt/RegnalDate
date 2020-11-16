package ie.beyond2022.utils;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegnalDateFromStringTest {

    // ---------- Henry III

    @Test
    public void test_28_October_1_Henry_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("28 October 1 Henry III");
        assertEquals("1216-10-28", val.toString());
        assertEquals("28 October", val.getDayMonthText());
        assertEquals("1 Henry III", val.getRegnalYearMonarch());
        assertEquals(1216, val.getYear());
    }

    @Test
    public void test_28_October_1_Hen_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("28 Oct. 1 Hen. III");
        assertEquals("1216-10-28", val.toString());
        assertEquals("28 Oct.", val.getDayMonthText());
        assertEquals("1 Hen. III", val.getRegnalYearMonarch());
        assertEquals(1216, val.getYear());
    }

    @Test
    public void test_1_January_1_Henry_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("1 January 1 Henry III");
        assertEquals("1217-01-01", val.toString());
        assertEquals("1 January", val.getDayMonthText());
        assertEquals("1 Henry III", val.getRegnalYearMonarch());
        assertEquals(1217, val.getYear());
    }

    @Test
    public void test_1_Jan_1_Henry_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("1 January 1 Hen. III");
        assertEquals("1217-01-01", val.toString());
        assertEquals("1 January", val.getDayMonthText());
        assertEquals("1 Hen. III", val.getRegnalYearMonarch());
        assertEquals(1217, val.getYear());
    }

    // ---------- Edward I

    @Test
    public void test_21_November_1_Edward_I() throws IOException {
        RegnalDate val = RegnalDate.parseString("21 November 1 Edward I");
        assertEquals("1272-11-21", val.toString());
        assertEquals("21 November", val.getDayMonthText());
        assertEquals("1 Edward I", val.getRegnalYearMonarch());
        assertEquals(1272, val.getYear());
    }

    @Test
    public void test_18_November_1_Edward_I() throws IOException {
        RegnalDate val = RegnalDate.parseString("18 Nov. 1 Edw. I");
        assertEquals("1273-11-18", val.toString());
        assertEquals("18 Nov.", val.getDayMonthText());
        assertEquals("1 Edw. I", val.getRegnalYearMonarch());
        assertEquals(1273, val.getYear());
    }

    // ---------- Edward II

    @Test
    public void test_10_July_1_Edward_II() throws IOException {
        RegnalDate val = RegnalDate.parseString("10 July 1 Edward II");
        assertEquals("1307-07-10", val.toString());
        assertEquals("10 July", val.getDayMonthText());
        assertEquals("1 Edward II", val.getRegnalYearMonarch());
        assertEquals(1307, val.getYear());
    }

    @Test
    public void test_1_July_1_Edward_II() throws IOException {
        RegnalDate val = RegnalDate.parseString("1 Jul. 1 Edw. II");
        assertEquals("1308-07-01", val.toString());
        assertEquals("1 Jul.", val.getDayMonthText());
        assertEquals("1 Edw. II", val.getRegnalYearMonarch());
        assertEquals(1308, val.getYear());
    }

    // ---------- Edward III

    @Test
    public void test_26_January_1_Edward_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("26 January 1 Edward III");
        assertEquals("1327-01-26", val.toString());
        assertEquals("26 January", val.getDayMonthText());
        assertEquals("1 Edward III", val.getRegnalYearMonarch());
        assertEquals(1327, val.getYear());
    }

    @Test
    public void test_10_January_1_Edward_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("10 Jan. 1 Edw. III");
        assertEquals("1328-01-10", val.toString());
        assertEquals("10 Jan.", val.getDayMonthText());
        assertEquals("1 Edw. III", val.getRegnalYearMonarch());
        assertEquals(1328, val.getYear());
    }

    // ---------- Richard II

    @Test
    public void test_25_June_1_Richard_II() throws IOException {
        RegnalDate val = RegnalDate.parseString("25 June 1 Richard II");
        assertEquals("1377-06-25", val.toString());
        assertEquals("25 June", val.getDayMonthText());
        assertEquals("1 Richard II", val.getRegnalYearMonarch());
        assertEquals(1377, val.getYear());
    }

    @Test
    public void test_10_June_1_Richard_II() throws IOException {
        RegnalDate val = RegnalDate.parseString("10 Jun. 1 Ric. II");
        assertEquals("1378-06-10", val.toString());
        assertEquals("10 Jun.", val.getDayMonthText());
        assertEquals("1 Ric. II", val.getRegnalYearMonarch());
        assertEquals(1378, val.getYear());
    }

    // ---------- Henry IV

    @Test
    public void test_30_September_1_Henry_IV() throws IOException {
        RegnalDate val = RegnalDate.parseString("30 September 1 Henry IV");
        assertEquals("1399-09-30", val.toString());
        assertEquals("30 September", val.getDayMonthText());
        assertEquals("1 Henry IV", val.getRegnalYearMonarch());
        assertEquals(1399, val.getYear());
    }

    @Test
    public void test_29_September_1_Henry_IV() throws IOException {
        RegnalDate val = RegnalDate.parseString("29 Sep. 1 Hen. IV");
        assertEquals("1400-09-29", val.toString());
        assertEquals("29 Sep.", val.getDayMonthText());
        assertEquals("1 Hen. IV", val.getRegnalYearMonarch());
        assertEquals(1400, val.getYear());
    }

    // ---------- Henry V

    @Test
    public void test_21_March_1_Henry_V() throws IOException {
        RegnalDate val = RegnalDate.parseString("21 March 1 Henry V");
        assertEquals("1413-03-21", val.toString());
        assertEquals("21 March", val.getDayMonthText());
        assertEquals("1 Henry V", val.getRegnalYearMonarch());
        assertEquals(1413, val.getYear());
    }

    @Test
    public void test_20_March_1_Henry_V() throws IOException {
        RegnalDate val = RegnalDate.parseString("20 March 1 Henry V");
        assertEquals("1414-03-20", val.toString());
        assertEquals("20 March", val.getDayMonthText());
        assertEquals("1 Henry V", val.getRegnalYearMonarch());
        assertEquals(1414, val.getYear());
    }

    // ---------- Henry VI

    @Test
    public void test_1_September_1_Henry_VI() throws IOException {
        RegnalDate val = RegnalDate.parseString("1 September 1 Henry VI");
        assertEquals("1422-09-01", val.toString());
        assertEquals("1 September", val.getDayMonthText());
        assertEquals("1 Henry VI", val.getRegnalYearMonarch());
        assertEquals(1422, val.getYear());
    }

    @Test
    public void test_31_August_1_Henry_VI() throws IOException {
        RegnalDate val = RegnalDate.parseString("31 Aug. 1 Henry VI");
        assertEquals("1423-08-31", val.toString());
        assertEquals("31 Aug.", val.getDayMonthText());
        assertEquals("1 Henry VI", val.getRegnalYearMonarch());
        assertEquals(1423, val.getYear());
    }

    @Test
    public void test_10_October_49_Henry_VI() throws IOException {
        RegnalDate val = RegnalDate.parseString("10 October 49 Henry VI");
        assertEquals("1470-10-10", val.toString());
        assertEquals("10 October", val.getDayMonthText());
        assertEquals("49 Henry VI", val.getRegnalYearMonarch());
        assertEquals(1470, val.getYear());
    }

    @Test
    public void test_12_January_49_Henry_VI() throws IOException {
        RegnalDate val = RegnalDate.parseString("12 Jan. 49 Hen. VI");
        assertEquals("1471-01-12", val.toString());
        assertEquals("12 Jan.", val.getDayMonthText());
        assertEquals("49 Hen. VI", val.getRegnalYearMonarch());
        assertEquals(1471, val.getYear());
    }

    // ---------- Edward IV

    @Test
    public void test_4_March_1_Edward_IV() throws IOException {
        RegnalDate val = RegnalDate.parseString("4 March 1 Edward IV");
        assertEquals("1461-03-04", val.toString());
        assertEquals("4 March", val.getDayMonthText());
        assertEquals("1 Edward IV", val.getRegnalYearMonarch());
        assertEquals(1461, val.getYear());
    }

    @Test
    public void test_1_March_1_Edward_IV() throws IOException {
        RegnalDate val = RegnalDate.parseString("1 Mar. 1 Edw. IV");
        assertEquals("1462-03-01", val.toString());
        assertEquals("1 Mar.", val.getDayMonthText());
        assertEquals("1 Edw. IV", val.getRegnalYearMonarch());
        assertEquals(1462, val.getYear());
    }

    // ---------- Edward V

    @Test
    public void test_10_May_1_Edward_V() throws IOException {
        RegnalDate val = RegnalDate.parseString("10 May 1 Edward V");
        assertEquals("1483-05-10", val.toString());
        assertEquals("10 May", val.getDayMonthText());
        assertEquals("1 Edward V", val.getRegnalYearMonarch());
        assertEquals(1483, val.getYear());
    }

    // ---------- Richard III

    @Test
    public void test_26_June_1_Richard_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("26 Jun. 1 Rich. III");
        assertEquals("1483-06-26", val.toString());
        assertEquals("26 Jun.", val.getDayMonthText());
        assertEquals("1 Rich. III", val.getRegnalYearMonarch());
        assertEquals(1483, val.getYear());
    }

    @Test
    public void test_20_June_1_Richard_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("20 Jun. 1 Rich. III");
        assertEquals("1484-06-20", val.toString());
        assertEquals("20 Jun.", val.getDayMonthText());
        assertEquals("1 Rich. III", val.getRegnalYearMonarch());
        assertEquals(1484, val.getYear());
    }


    // ---------- Henry VII

    @Test
    public void test_22_August_1_Henry_VII() throws IOException {
        RegnalDate val = RegnalDate.parseString("22 August 1 Henry VII");
        assertEquals("1485-08-22", val.toString());
        assertEquals("22 August", val.getDayMonthText());
        assertEquals("1 Henry VII", val.getRegnalYearMonarch());
        assertEquals(1485, val.getYear());
    }

    @Test
    public void test_21_August_1_Henry_VII() throws IOException {
        RegnalDate val = RegnalDate.parseString("21 Aug. 1 Hen. VII");
        assertEquals("1486-08-21", val.toString());
        assertEquals("21 Aug.", val.getDayMonthText());
        assertEquals("1 Hen. VII", val.getRegnalYearMonarch());
        assertEquals(1486, val.getYear());
    }

}
