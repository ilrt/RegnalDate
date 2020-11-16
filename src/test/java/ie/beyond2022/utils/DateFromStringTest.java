package ie.beyond2022.utils;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateFromStringTest {

    // ---------- Henry III

    @Test
    public void test_28_October_1_Henry_III() throws IOException {
        DateFromString dateFromString = new DateFromString();
        RegnalDate val = dateFromString.parse("28 October 1 Henry III");
        assertEquals("1216-10-28", val.toString());
    }

    @Test
    public void test_28_October_1_Hen_III() throws IOException {
        DateFromString dateFromString = new DateFromString();
        RegnalDate val = dateFromString.parse("28 Oct. 1 Hen. III");
        assertEquals("1216-10-28", val.toString());
    }

    @Test
    public void test_1_January_1_Henry_III() throws IOException {
        DateFromString dateFromString = new DateFromString();
        RegnalDate val = dateFromString.parse("1 January 1 Henry III");
        assertEquals("1217-01-01", val.toString());
    }

    @Test
    public void test_1_Jan_1_Henry_III() throws IOException {
        DateFromString dateFromString = new DateFromString();
        RegnalDate val = dateFromString.parse("1 January 1 Hen. III");
        assertEquals("1217-01-01", val.toString());
    }

    // ---------- Edward I

    @Test
    public void test_21_November_1_Edward_I() throws IOException {
        DateFromString dateFromString = new DateFromString();
        RegnalDate val = dateFromString.parse("21 November 1 Edward I");
        assertEquals("1272-11-21", val.toString());
    }

    @Test
    public void test_18_November_1_Edward_I() throws IOException {
        DateFromString dateFromString = new DateFromString();
        RegnalDate val = dateFromString.parse("18 Nov. 1 Edw. I");
        assertEquals("1273-11-18", val.toString());
    }

    // ---------- Edward II

    @Test
    public void test_10_July_1_Edward_II() throws IOException {
        DateFromString dateFromString = new DateFromString();
        RegnalDate val = dateFromString.parse("10 July 1 Edward II");
        assertEquals("1307-07-10", val.toString());
    }

    @Test
    public void test_1_July_1_Edward_II() throws IOException {
        DateFromString dateFromString = new DateFromString();
        RegnalDate val = dateFromString.parse("1 Jul. 1 Edw. II");
        assertEquals("1308-07-01", val.toString());
    }

    // ---------- Edward III

    @Test
    public void test_26_January_1_Edward_III() throws IOException {
        DateFromString dateFromString = new DateFromString();
        RegnalDate val = dateFromString.parse("26 January 1 Edward III");
        assertEquals("1327-01-26", val.toString());
    }

    @Test
    public void test_10_January_1_Edward_III() throws IOException {
        DateFromString dateFromString = new DateFromString();
        RegnalDate val = dateFromString.parse("10 Jan. 1 Edw. III");
        assertEquals("1328-01-10", val.toString());
    }

    // ---------- Richard II

    @Test
    public void test_25_June_1_Richard_II() throws IOException {
        DateFromString dateFromString = new DateFromString();
        RegnalDate val = dateFromString.parse("25 June 1 Richard II");
        assertEquals("1377-06-25", val.toString());
    }

    @Test
    public void test_10_June_1_Richard_II() throws IOException {
        DateFromString dateFromString = new DateFromString();
        RegnalDate val = dateFromString.parse("10 Jun. 1 Ric. II");
        assertEquals("1378-06-10", val.toString());
    }

    // ---------- Henry IV

    @Test
    public void test_30_September_1_Henry_IV() throws IOException {
        DateFromString dateFromString = new DateFromString();
        RegnalDate val = dateFromString.parse("30 September 1 Henry IV");
        assertEquals("1399-09-30", val.toString());
    }

    @Test
    public void test_29_September_1_Henry_IV() throws IOException {
        DateFromString dateFromString = new DateFromString();
        RegnalDate val = dateFromString.parse("29 Sep. 1 Hen. IV");
        assertEquals("1400-09-29", val.toString());
    }

    // ---------- Henry V

    @Test
    public void test_21_March_1_Henry_V() throws IOException {
        DateFromString dateFromString = new DateFromString();
        RegnalDate val = dateFromString.parse("21 March 1 Henry V");
        assertEquals("1413-03-21", val.toString());
    }

    @Test
    public void test_20_March_1_Henry_V() throws IOException {
        DateFromString dateFromString = new DateFromString();
        RegnalDate val = dateFromString.parse("20 March 1 Henry V");
        assertEquals("1414-03-20", val.toString());
    }

    // ---------- Henry VI

    @Test
    public void test_1_September_1_Henry_VI() throws IOException {
        DateFromString dateFromString = new DateFromString();
        RegnalDate val = dateFromString.parse("1 September 1 Henry VI");
        assertEquals("1422-09-01", val.toString());
    }

    @Test
    public void test_31_August_1_Henry_VI() throws IOException {
        DateFromString dateFromString = new DateFromString();
        RegnalDate val = dateFromString.parse("31 Aug. 1 Henry VI");
        assertEquals("1423-08-31", val.toString());
    }

    @Test
    public void test_10_October_49_Henry_VI() throws IOException {
        DateFromString dateFromString = new DateFromString();
        RegnalDate val = dateFromString.parse("10 October 49 Henry VI");
        assertEquals("1470-10-10", val.toString());
    }

    @Test
    public void test_12_January_49_Henry_VI() throws IOException {
        DateFromString dateFromString = new DateFromString();
        RegnalDate val = dateFromString.parse("12 Jan. 49 Hen. VI");
        assertEquals("1471-01-12", val.toString());
    }

    // ---------- Edward IV

    @Test
    public void test_4_March_1_Edward_IV() throws IOException {
        DateFromString dateFromString = new DateFromString();
        RegnalDate val = dateFromString.parse("4 March 1 Edward IV");
        assertEquals("1461-03-04", val.toString());
    }

    @Test
    public void test_1_March_1_Edward_IV() throws IOException {
        DateFromString dateFromString = new DateFromString();
        RegnalDate val = dateFromString.parse("1 Mar. 1 Edw. IV");
        assertEquals("1462-03-01", val.toString());
    }

    // ---------- Edward V

    @Test
    public void test_10_May_1_Edward_V() throws IOException {
        DateFromString dateFromString = new DateFromString();
        RegnalDate val = dateFromString.parse("10 May 1 Edward V");
        assertEquals("1483-05-10", val.toString());
    }

    // ---------- Richard III

    @Test
    public void test_26_June_1_Richard_III() throws IOException {
        DateFromString dateFromString = new DateFromString();
        RegnalDate val = dateFromString.parse("26 June 1 Richard III");
        assertEquals("1483-06-26", val.toString());
    }

    @Test
    public void test_20_June_1_Richard_III() throws IOException {
        DateFromString dateFromString = new DateFromString();
        RegnalDate val = dateFromString.parse("20 Jun. 1 Rich. III");
        assertEquals("1484-06-20", val.toString());
    }


    // ---------- Henry VII

    @Test
    public void test_22_August_1_Henry_VII() throws IOException {
        DateFromString dateFromString = new DateFromString();
        RegnalDate val = dateFromString.parse("22 August 1 Henry VII");
        assertEquals("1485-08-22", val.toString());
    }

    @Test
    public void test_21_August_1_Henry_VII() throws IOException {
        DateFromString dateFromString = new DateFromString();
        RegnalDate val = dateFromString.parse("21 Aug. 1 Hen. VII");
        assertEquals("1486-08-21", val.toString());
    }

}
