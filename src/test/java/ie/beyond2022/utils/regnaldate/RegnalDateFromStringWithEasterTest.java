package ie.beyond2022.utils.regnaldate;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;


public class RegnalDateFromStringWithEasterTest {

    // 1 Henry III

    @Test
    public void test_easter_1_Henry_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("Easter 1 Henry III");
        assertEquals("1217-03-26", val.toString());
        assertEquals("Easter", val.getDayMonthFeastText());
        assertEquals("1 Henry III", val.getRegnalYearMonarch());
        assertEquals("1217", val.getYear());
    }

    @Test
    public void test_easter_octave_1_Henry_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("octave of Easter 1 Henry III");
        assertEquals("1217-04-02", val.toString());
        assertEquals("octave of Easter", val.getDayMonthFeastText());
        assertEquals("1 Henry III", val.getRegnalYearMonarch());
        assertEquals("1217", val.getYear());
    }

    @Test
    public void test_easter_quindene_1_Henry_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("quindene of Easter 1 Henry III");
        assertEquals("1217-04-09", val.toString());
        assertEquals("quindene of Easter", val.getDayMonthFeastText());
        assertEquals("1 Henry III", val.getRegnalYearMonarch());
        assertEquals("1217", val.getYear());
    }

    // 7 Henry III

    @Test
    public void test_easter_7_Henry_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("Easter 7 Henry III");
        assertEquals("1223-04-23", val.toString());
        assertEquals("Easter", val.getDayMonthFeastText());
        assertEquals("7 Henry III", val.getRegnalYearMonarch());
        assertEquals("1223", val.getYear());
    }

    @Test
    public void test_easter_octave_7_Henry_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("octave of Easter 7 Henry III");
        assertEquals("1223-04-30", val.toString());
        assertEquals("octave of Easter", val.getDayMonthFeastText());
        assertEquals("7 Henry III", val.getRegnalYearMonarch());
        assertEquals("1223", val.getYear());
    }

    @Test
    public void test_easter_quindene_7_Henry_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("quindene of Easter 7 Henry III");
        assertEquals("1223-05-07", val.toString());
        assertEquals("quindene of Easter", val.getDayMonthFeastText());
        assertEquals("7 Henry III", val.getRegnalYearMonarch());
        assertEquals("1223", val.getYear());
    }

    // 16 Henry III

    @Test
    public void test_easter_16_Henry_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("Easter 16 Henry III");
        assertEquals("1232-04-11", val.toString());
        assertEquals("Easter", val.getDayMonthFeastText());
        assertEquals("16 Henry III", val.getRegnalYearMonarch());
        assertEquals("1232", val.getYear());
    }

    @Test
    public void test_easter_octave_16_Henry_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("octave of Easter 16 Henry III");
        assertEquals("1232-04-18", val.toString());
        assertEquals("octave of Easter", val.getDayMonthFeastText());
        assertEquals("16 Henry III", val.getRegnalYearMonarch());
        assertEquals("1232", val.getYear());
    }

    @Test
    public void test_easter_quindene_16_Henry_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("quindene of Easter 16 Henry III");
        assertEquals("1232-04-25", val.toString());
        assertEquals("quindene of Easter", val.getDayMonthFeastText());
        assertEquals("16 Henry III", val.getRegnalYearMonarch());
        assertEquals("1232", val.getYear());
    }

    // 34 Henry III
    @Test
    public void test_easter_34_Henry_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("Easter 34 Henry III");
        assertEquals("1250-03-27", val.toString());
        assertEquals("Easter", val.getDayMonthFeastText());
        assertEquals("34 Henry III", val.getRegnalYearMonarch());
        assertEquals("1250", val.getYear());
    }

    @Test
    public void test_easter_octave_34_Henry_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("octave of Easter 34 Henry III");
        assertEquals("1250-04-03", val.toString());
        assertEquals("octave of Easter", val.getDayMonthFeastText());
        assertEquals("34 Henry III", val.getRegnalYearMonarch());
        assertEquals("1250", val.getYear());
    }

    @Test
    public void test_easter_quindene_34_Henry_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("quindene of Easter 34 Henry III");
        assertEquals("1250-04-10", val.toString());
        assertEquals("quindene of Easter", val.getDayMonthFeastText());
        assertEquals("34 Henry III", val.getRegnalYearMonarch());
        assertEquals("1250", val.getYear());
    }

    // 56 Henry III
    @Test
    public void test_easter_56_Henry_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("Easter 56 Henry III");
        assertEquals("1272-04-24", val.toString());
        assertEquals("Easter", val.getDayMonthFeastText());
        assertEquals("56 Henry III", val.getRegnalYearMonarch());
        assertEquals("1272", val.getYear());
    }

    @Test
    public void test_easter_octave_56_Henry_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("octave of Easter 56 Henry III");
        assertEquals("1272-05-01", val.toString());
        assertEquals("octave of Easter", val.getDayMonthFeastText());
        assertEquals("56 Henry III", val.getRegnalYearMonarch());
        assertEquals("1272", val.getYear());
    }

    @Test
    public void test_easter_quindene_56_Henry_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("quindene of Easter 56 Henry III");
        assertEquals("1272-05-08", val.toString());
        assertEquals("quindene of Easter", val.getDayMonthFeastText());
        assertEquals("56 Henry III", val.getRegnalYearMonarch());
        assertEquals("1272", val.getYear());
    }

    // 1 Edward I
    @Test
    public void test_easter_1_Edward_I() throws IOException {
        RegnalDate val = RegnalDate.parseString("Easter 1 Edward I");
        assertEquals("1273-04-09", val.toString());
        assertEquals("Easter", val.getDayMonthFeastText());
        assertEquals("1 Edward I", val.getRegnalYearMonarch());
        assertEquals("1273", val.getYear());
    }

    @Test
    public void test_easter_octave_1_Edward_I() throws IOException {
        RegnalDate val = RegnalDate.parseString("octave of Easter 1 Edward I");
        assertEquals("1273-04-16", val.toString());
        assertEquals("octave of Easter", val.getDayMonthFeastText());
        assertEquals("1 Edward I", val.getRegnalYearMonarch());
        assertEquals("1273", val.getYear());
    }

    @Test
    public void test_easter_quindene_1_Edward_I() throws IOException {
        RegnalDate val = RegnalDate.parseString("quindene of Easter 1 Edward I");
        assertEquals("1273-04-23", val.toString());
        assertEquals("quindene of Easter", val.getDayMonthFeastText());
        assertEquals("1 Edward I", val.getRegnalYearMonarch());
        assertEquals("1273", val.getYear());
    }

    // 13 Edward I
    @Test
    public void test_easter_13_Edward_I() throws IOException {
        RegnalDate val = RegnalDate.parseString("Easter 13 Edward I");
        assertEquals("1285-03-25", val.toString());
        assertEquals("Easter", val.getDayMonthFeastText());
        assertEquals("13 Edward I", val.getRegnalYearMonarch());
        assertEquals("1285", val.getYear());
    }

    @Test
    public void test_easter_octave_13_Edward_I() throws IOException {
        RegnalDate val = RegnalDate.parseString("octave of Easter 13 Edward I");
        assertEquals("1285-04-01", val.toString());
        assertEquals("octave of Easter", val.getDayMonthFeastText());
        assertEquals("13 Edward I", val.getRegnalYearMonarch());
        assertEquals("1285", val.getYear());
    }

    @Test
    public void test_easter_quindene_13_Edward_I() throws IOException {
        RegnalDate val = RegnalDate.parseString("quindene of Easter 13 Edward I");
        assertEquals("1285-04-08", val.toString());
        assertEquals("quindene of Easter", val.getDayMonthFeastText());
        assertEquals("13 Edward I", val.getRegnalYearMonarch());
        assertEquals("1285", val.getYear());
    }

    // 35 Edward I
    @Test
    public void test_easter_35_Edward_I() throws IOException {
        RegnalDate val = RegnalDate.parseString("Easter 35 Edward I");
        assertEquals("1307-03-26", val.toString());
        assertEquals("Easter", val.getDayMonthFeastText());
        assertEquals("35 Edward I", val.getRegnalYearMonarch());
        assertEquals("1307", val.getYear());
    }

    @Test
    public void test_easter_octave_35_Edward_I() throws IOException {
        RegnalDate val = RegnalDate.parseString("octave of Easter 35 Edward I");
        assertEquals("1307-04-02", val.toString());
        assertEquals("octave of Easter", val.getDayMonthFeastText());
        assertEquals("35 Edward I", val.getRegnalYearMonarch());
        assertEquals("1307", val.getYear());
    }

    @Test
    public void test_easter_quindene_35_Edward_I() throws IOException {
        RegnalDate val = RegnalDate.parseString("quindene of Easter 35 Edward I");
        assertEquals("1307-04-09", val.toString());
        assertEquals("quindene of Easter", val.getDayMonthFeastText());
        assertEquals("35 Edward I", val.getRegnalYearMonarch());
        assertEquals("1307", val.getYear());
    }

    // 1 Edward II
    @Test
    public void test_easter_1_Edward_II() throws IOException {
        RegnalDate val = RegnalDate.parseString("Easter 1 Edward II");
        assertEquals("1308-04-14", val.toString());
        assertEquals("Easter", val.getDayMonthFeastText());
        assertEquals("1 Edward II", val.getRegnalYearMonarch());
        assertEquals("1308", val.getYear());
    }

    @Test
    public void test_easter_octave_1_Edward_II() throws IOException {
        RegnalDate val = RegnalDate.parseString("octave of Easter 1 Edward II");
        assertEquals("1308-04-21", val.toString());
        assertEquals("octave of Easter", val.getDayMonthFeastText());
        assertEquals("1 Edward II", val.getRegnalYearMonarch());
        assertEquals("1308", val.getYear());
    }

    @Test
    public void test_easter_quindene_1_Edward_II() throws IOException {
        RegnalDate val = RegnalDate.parseString("quindene of Easter 1 Edward II");
        assertEquals("1308-04-28", val.toString());
        assertEquals("quindene of Easter", val.getDayMonthFeastText());
        assertEquals("1 Edward II", val.getRegnalYearMonarch());
        assertEquals("1308", val.getYear());
    }

    // 10 Edward II
    @Test
    public void test_easter_10_Edward_II() throws IOException {
        RegnalDate val = RegnalDate.parseString("Easter 10 Edward II");
        assertEquals("1317-04-03", val.toString());
        assertEquals("Easter", val.getDayMonthFeastText());
        assertEquals("10 Edward II", val.getRegnalYearMonarch());
        assertEquals("1317", val.getYear());
    }

    @Test
    public void test_easter_octave_10_Edward_II() throws IOException {
        RegnalDate val = RegnalDate.parseString("octave of Easter 10 Edward II");
        assertEquals("1317-04-10", val.toString());
        assertEquals("octave of Easter", val.getDayMonthFeastText());
        assertEquals("10 Edward II", val.getRegnalYearMonarch());
        assertEquals("1317", val.getYear());
    }

    @Test
    public void test_easter_quindene_10_Edward_II() throws IOException {
        RegnalDate val = RegnalDate.parseString("quindene of Easter 10 Edward II");
        assertEquals("1317-04-17", val.toString());
        assertEquals("quindene of Easter", val.getDayMonthFeastText());
        assertEquals("10 Edward II", val.getRegnalYearMonarch());
        assertEquals("1317", val.getYear());
    }

    // 19 Edward II
    @Test
    public void test_easter_19_Edward_II() throws IOException {
        RegnalDate val = RegnalDate.parseString("Easter 19 Edward II");
        assertEquals("1326-03-23", val.toString());
        assertEquals("Easter", val.getDayMonthFeastText());
        assertEquals("19 Edward II", val.getRegnalYearMonarch());
        assertEquals("1326", val.getYear());
    }

    @Test
    public void test_easter_octave_19_Edward_II() throws IOException {
        RegnalDate val = RegnalDate.parseString("octave of Easter 19 Edward II");
        assertEquals("1326-03-30", val.toString());
        assertEquals("octave of Easter", val.getDayMonthFeastText());
        assertEquals("19 Edward II", val.getRegnalYearMonarch());
        assertEquals("1326", val.getYear());
    }

    @Test
    public void test_easter_quindene_19_Edward_II() throws IOException {
        RegnalDate val = RegnalDate.parseString("quindene of Easter 19 Edward II");
        assertEquals("1326-04-06", val.toString());
        assertEquals("quindene of Easter", val.getDayMonthFeastText());
        assertEquals("19 Edward II", val.getRegnalYearMonarch());
        assertEquals("1326", val.getYear());
    }

    // 1 Edward III
    @Test
    public void test_easter_1_Edward_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("Easter 1 Edward III");
        assertEquals("1327-04-12", val.toString());
        assertEquals("Easter", val.getDayMonthFeastText());
        assertEquals("1 Edward III", val.getRegnalYearMonarch());
        assertEquals("1327", val.getYear());
    }

    @Test
    public void test_easter_octave_1_Edward_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("octave of Easter 1 Edward III");
        assertEquals("1327-04-19", val.toString());
        assertEquals("octave of Easter", val.getDayMonthFeastText());
        assertEquals("1 Edward III", val.getRegnalYearMonarch());
        assertEquals("1327", val.getYear());
    }

    @Test
    public void test_easter_quindene_1_Edward_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("quindene of Easter 1 Edward III");
        assertEquals("1327-04-26", val.toString());
        assertEquals("quindene of Easter", val.getDayMonthFeastText());
        assertEquals("1 Edward III", val.getRegnalYearMonarch());
        assertEquals("1327", val.getYear());
    }

    // 10 Edward III
    @Test
    public void test_easter_10_Edward_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("Easter 10 Edward III");
        assertEquals("1336-03-31", val.toString());
        assertEquals("Easter", val.getDayMonthFeastText());
        assertEquals("10 Edward III", val.getRegnalYearMonarch());
        assertEquals("1336", val.getYear());
    }

    @Test
    public void test_easter_octave_10_Edward_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("octave of Easter 10 Edward III");
        assertEquals("1336-04-07", val.toString());
        assertEquals("octave of Easter", val.getDayMonthFeastText());
        assertEquals("10 Edward III", val.getRegnalYearMonarch());
        assertEquals("1336", val.getYear());
    }

    @Test
    public void test_easter_quindene_10_Edward_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("quindene of Easter 10 Edward III");
        assertEquals("1336-04-14", val.toString());
        assertEquals("quindene of Easter", val.getDayMonthFeastText());
        assertEquals("10 Edward III", val.getRegnalYearMonarch());
        assertEquals("1336", val.getYear());
    }

    // 30 Edward III
    @Test
    public void test_easter_30_Edward_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("Easter 30 Edward III");
        assertEquals("1356-04-24", val.toString());
        assertEquals("Easter", val.getDayMonthFeastText());
        assertEquals("30 Edward III", val.getRegnalYearMonarch());
        assertEquals("1356", val.getYear());
    }

    @Test
    public void test_easter_octave_30_Edward_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("octave of Easter 30 Edward III");
        assertEquals("1356-05-01", val.toString());
        assertEquals("octave of Easter", val.getDayMonthFeastText());
        assertEquals("30 Edward III", val.getRegnalYearMonarch());
        assertEquals("1356", val.getYear());
    }

    @Test
    public void test_easter_quindene_30_Edward_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("quindene of Easter 30 Edward III");
        assertEquals("1356-05-08", val.toString());
        assertEquals("quindene of Easter", val.getDayMonthFeastText());
        assertEquals("30 Edward III", val.getRegnalYearMonarch());
        assertEquals("1356", val.getYear());
    }

    // 51 Edward III
    @Test
    public void test_easter_51_Edward_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("Easter 51 Edward III");
        assertEquals("1377-03-29", val.toString());
        assertEquals("Easter", val.getDayMonthFeastText());
        assertEquals("51 Edward III", val.getRegnalYearMonarch());
        assertEquals("1377", val.getYear());
    }

    @Test
    public void test_easter_octave_51_Edward_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("octave of Easter 51 Edward III");
        assertEquals("1377-04-05", val.toString());
        assertEquals("octave of Easter", val.getDayMonthFeastText());
        assertEquals("51 Edward III", val.getRegnalYearMonarch());
        assertEquals("1377", val.getYear());
    }

    @Test
    public void test_easter_quindene_51_Edward_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("quindene of Easter 51 Edward III");
        assertEquals("1377-04-12", val.toString());
        assertEquals("quindene of Easter", val.getDayMonthFeastText());
        assertEquals("51 Edward III", val.getRegnalYearMonarch());
        assertEquals("1377", val.getYear());
    }

    // 1 Richard III
    @Test
    public void test_easter_1_Richard_II() throws IOException {
        RegnalDate val = RegnalDate.parseString("Easter 1 Richard II");
        assertEquals("1378-04-18", val.toString());
        assertEquals("Easter", val.getDayMonthFeastText());
        assertEquals("1 Richard II", val.getRegnalYearMonarch());
        assertEquals("1378", val.getYear());
    }

    @Test
    public void test_easter_octave_1_Richard_II() throws IOException {
        RegnalDate val = RegnalDate.parseString("octave of Easter 1 Richard II");
        assertEquals("1378-04-25", val.toString());
        assertEquals("octave of Easter", val.getDayMonthFeastText());
        assertEquals("1 Richard II", val.getRegnalYearMonarch());
        assertEquals("1378", val.getYear());
    }

    @Test
    public void test_easter_quindene_1_Richard_II() throws IOException {
        RegnalDate val = RegnalDate.parseString("quindene of Easter 1 Richard II");
        assertEquals("1378-05-02", val.toString());
        assertEquals("quindene of Easter", val.getDayMonthFeastText());
        assertEquals("1 Richard II", val.getRegnalYearMonarch());
        assertEquals("1378", val.getYear());
    }

    // 11 Richard III
    @Test
    public void test_easter_11_Richard_II() throws IOException {
        RegnalDate val = RegnalDate.parseString("Easter 11 Richard II");
        assertEquals("1388-03-29", val.toString());
        assertEquals("Easter", val.getDayMonthFeastText());
        assertEquals("11 Richard II", val.getRegnalYearMonarch());
        assertEquals("1388", val.getYear());
    }

    @Test
    public void test_easter_octave_11_Richard_II() throws IOException {
        RegnalDate val = RegnalDate.parseString("octave of Easter 11 Richard II");
        assertEquals("1388-04-05", val.toString());
        assertEquals("octave of Easter", val.getDayMonthFeastText());
        assertEquals("11 Richard II", val.getRegnalYearMonarch());
        assertEquals("1388", val.getYear());
    }

    @Test
    public void test_easter_quindene_11_Richard_II() throws IOException {
        RegnalDate val = RegnalDate.parseString("quindene of Easter 11 Richard II");
        assertEquals("1388-04-12", val.toString());
        assertEquals("quindene of Easter", val.getDayMonthFeastText());
        assertEquals("11 Richard II", val.getRegnalYearMonarch());
        assertEquals("1388", val.getYear());
    }

    // 22 Richard III
    @Test
    public void test_easter_22_Richard_II() throws IOException {
        RegnalDate val = RegnalDate.parseString("Easter 22 Richard II");
        assertEquals("1399-03-30", val.toString());
        assertEquals("Easter", val.getDayMonthFeastText());
        assertEquals("22 Richard II", val.getRegnalYearMonarch());
        assertEquals("1399", val.getYear());
    }

    @Test
    public void test_easter_octave_22_Richard_II() throws IOException {
        RegnalDate val = RegnalDate.parseString("octave of Easter 22 Richard II");
        assertEquals("1399-04-06", val.toString());
        assertEquals("octave of Easter", val.getDayMonthFeastText());
        assertEquals("22 Richard II", val.getRegnalYearMonarch());
        assertEquals("1399", val.getYear());
    }

    @Test
    public void test_easter_quindene_22_Richard_II() throws IOException {
        RegnalDate val = RegnalDate.parseString("quindene of Easter 22 Richard II");
        assertEquals("1399-04-13", val.toString());
        assertEquals("quindene of Easter", val.getDayMonthFeastText());
        assertEquals("22 Richard II", val.getRegnalYearMonarch());
        assertEquals("1399", val.getYear());
    }

    // 1 Henry IV
    @Test
    public void test_easter_1_Henry_IV() throws IOException {
        RegnalDate val = RegnalDate.parseString("Easter 1 Henry IV");
        assertEquals("1400-04-18", val.toString());
        assertEquals("Easter", val.getDayMonthFeastText());
        assertEquals("1 Henry IV", val.getRegnalYearMonarch());
        assertEquals("1400", val.getYear());
    }

    @Test
    public void test_easter_octave_1_Henry_IV() throws IOException {
        RegnalDate val = RegnalDate.parseString("octave of Easter 1 Henry IV");
        assertEquals("1400-04-25", val.toString());
        assertEquals("octave of Easter", val.getDayMonthFeastText());
        assertEquals("1 Henry IV", val.getRegnalYearMonarch());
        assertEquals("1400", val.getYear());
    }

    @Test
    public void test_easter_quindene_1_Henry_IV() throws IOException {
        RegnalDate val = RegnalDate.parseString("quindene of Easter 1 Henry IV");
        assertEquals("1400-05-02", val.toString());
        assertEquals("quindene of Easter", val.getDayMonthFeastText());
        assertEquals("1 Henry IV", val.getRegnalYearMonarch());
        assertEquals("1400", val.getYear());
    }

    // 1 Henry V
    @Test
    public void test_easter_1_Henry_V() throws IOException {
        RegnalDate val = RegnalDate.parseString("Easter 1 Henry V");
        assertEquals("1413-04-23", val.toString());
        assertEquals("Easter", val.getDayMonthFeastText());
        assertEquals("1 Henry V", val.getRegnalYearMonarch());
        assertEquals("1413", val.getYear());
    }

    @Test
    public void test_easter_octave_1_Henry_V() throws IOException {
        RegnalDate val = RegnalDate.parseString("octave of Easter 1 Henry V");
        assertEquals("1413-04-30", val.toString());
        assertEquals("octave of Easter", val.getDayMonthFeastText());
        assertEquals("1 Henry V", val.getRegnalYearMonarch());
        assertEquals("1413", val.getYear());
    }

    @Test
    public void test_easter_quindene_1_Henry_V() throws IOException {
        RegnalDate val = RegnalDate.parseString("quindene of Easter 1 Henry V");
        assertEquals("1413-05-07", val.toString());
        assertEquals("quindene of Easter", val.getDayMonthFeastText());
        assertEquals("1 Henry V", val.getRegnalYearMonarch());
        assertEquals("1413", val.getYear());
    }

    // 1 Henry VI
    @Test
    public void test_easter_1_Henry_VI() throws IOException {
        RegnalDate val = RegnalDate.parseString("Easter 1 Henry VI");
        assertEquals("1423-04-04", val.toString());
        assertEquals("Easter", val.getDayMonthFeastText());
        assertEquals("1 Henry VI", val.getRegnalYearMonarch());
        assertEquals("1423", val.getYear());
    }

    @Test
    public void test_easter_octave_1_Henry_VI() throws IOException {
        RegnalDate val = RegnalDate.parseString("octave of Easter 1 Henry VI");
        assertEquals("1423-04-11", val.toString());
        assertEquals("octave of Easter", val.getDayMonthFeastText());
        assertEquals("1 Henry VI", val.getRegnalYearMonarch());
        assertEquals("1423", val.getYear());
    }

    @Test
    public void test_easter_quindene_1_Henry_VI() throws IOException {
        RegnalDate val = RegnalDate.parseString("quindene of Easter 1 Henry VI");
        assertEquals("1423-04-18", val.toString());
        assertEquals("quindene of Easter", val.getDayMonthFeastText());
        assertEquals("1 Henry VI", val.getRegnalYearMonarch());
        assertEquals("1423", val.getYear());
    }

    // 1 Edward IV
    @Test
    public void test_easter_1_Edward_IV() throws IOException {
        RegnalDate val = RegnalDate.parseString("Easter 1 Edward IV");
        assertEquals("1461-04-05", val.toString());
        assertEquals("Easter", val.getDayMonthFeastText());
        assertEquals("1 Edward IV", val.getRegnalYearMonarch());
        assertEquals("1461", val.getYear());
    }

    @Test
    public void test_easter_octave_1_Edward_IV() throws IOException {
        RegnalDate val = RegnalDate.parseString("octave of Easter 1 Edward IV");
        assertEquals("1461-04-12", val.toString());
        assertEquals("octave of Easter", val.getDayMonthFeastText());
        assertEquals("1 Edward IV", val.getRegnalYearMonarch());
        assertEquals("1461", val.getYear());
    }

    @Test
    public void test_easter_quindene_1_Edward_IV() throws IOException {
        RegnalDate val = RegnalDate.parseString("quindene of Easter 1 Edward IV");
        assertEquals("1461-04-19", val.toString());
        assertEquals("quindene of Easter", val.getDayMonthFeastText());
        assertEquals("1 Edward IV", val.getRegnalYearMonarch());
        assertEquals("1461", val.getYear());
    }

    // 1 Edward V
    @Test
    public void test_easter_1_Edward_V() throws IOException {
        RegnalDate val = RegnalDate.parseString("Easter 1 Edward V");
        assertEquals("1483-03-30", val.toString());
        assertEquals("Easter", val.getDayMonthFeastText());
        assertEquals("1 Edward V", val.getRegnalYearMonarch());
        assertEquals("1483", val.getYear());
    }

    @Test
    public void test_easter_octave_1_Edward_V() throws IOException {
        RegnalDate val = RegnalDate.parseString("octave of Easter 1 Edward V");
        assertEquals("1483-04-06", val.toString());
        assertEquals("octave of Easter", val.getDayMonthFeastText());
        assertEquals("1 Edward V", val.getRegnalYearMonarch());
        assertEquals("1483", val.getYear());
    }

    @Test
    public void test_easter_quindene_1_Edward_V() throws IOException {
        RegnalDate val = RegnalDate.parseString("quindene of Easter 1 Edward V");
        assertEquals("1483-04-13", val.toString());
        assertEquals("quindene of Easter", val.getDayMonthFeastText());
        assertEquals("1 Edward V", val.getRegnalYearMonarch());
        assertEquals("1483", val.getYear());
    }

    // 1 Richard III
    @Test
    public void test_easter_1_Richard_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("Easter 1 Richard III");
        assertEquals("1484-04-18", val.toString());
        assertEquals("Easter", val.getDayMonthFeastText());
        assertEquals("1 Richard III", val.getRegnalYearMonarch());
        assertEquals("1484", val.getYear());
    }

    @Test
    public void test_easter_octave_1_Richard_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("octave of Easter 1 Richard III");
        assertEquals("1484-04-25", val.toString());
        assertEquals("octave of Easter", val.getDayMonthFeastText());
        assertEquals("1 Richard III", val.getRegnalYearMonarch());
        assertEquals("1484", val.getYear());
    }

    @Test
    public void test_easter_quindene_1_Richard_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("quindene of Easter 1 Richard III");
        assertEquals("1484-05-02", val.toString());
        assertEquals("quindene of Easter", val.getDayMonthFeastText());
        assertEquals("1 Richard III", val.getRegnalYearMonarch());
        assertEquals("1484", val.getYear());
    }

    // 1 Henry VII
    @Test
    public void test_easter_1_Henry_VII() throws IOException {
        RegnalDate val = RegnalDate.parseString("Easter 1 Henry VII");
        assertEquals("1486-03-26", val.toString());
        assertEquals("Easter", val.getDayMonthFeastText());
        assertEquals("1 Henry VII", val.getRegnalYearMonarch());
        assertEquals("1486", val.getYear());
    }

    @Test
    public void test_easter_octave_1_Henry_VII() throws IOException {
        RegnalDate val = RegnalDate.parseString("octave of Easter 1 Henry VII");
        assertEquals("1486-04-02", val.toString());
        assertEquals("octave of Easter", val.getDayMonthFeastText());
        assertEquals("1 Henry VII", val.getRegnalYearMonarch());
        assertEquals("1486", val.getYear());
    }

    @Test
    public void test_easter_quindene_1_Henry_VII() throws IOException {
        RegnalDate val = RegnalDate.parseString("quindene of Easter 1 Henry VII");
        assertEquals("1486-04-09", val.toString());
        assertEquals("quindene of Easter", val.getDayMonthFeastText());
        assertEquals("1 Henry VII", val.getRegnalYearMonarch());
        assertEquals("1486", val.getYear());
    }

}
