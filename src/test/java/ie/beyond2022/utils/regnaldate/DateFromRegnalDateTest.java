package ie.beyond2022.utils.regnaldate;

import org.joda.time.chrono.GJChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import org.joda.time.DateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateFromRegnalDateTest {

    DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd").withChronology(GJChronology.getInstance());

    // ---------- Testing getting a Regnal Year object

    // ---------- Regnal years (Henry III)

    @Test
    public void test_Henry_III_1() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(1, "hen", 3);
        assertEquals("1216-10-28", regnalYear.getRegnalYearStartAsString());
        assertEquals("1217-10-27", regnalYear.getRegnalYearEndAsString());
    }

    @Test
    public void test_Henry_III_19() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(19, "hen", 3);
        assertEquals("1234-10-28", regnalYear.getRegnalYearStartAsString());
        assertEquals("1235-10-27", regnalYear.getRegnalYearEndAsString());
    }

    @Test
    public void test_Henry_III_41() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(41, "hen", 3);
        assertEquals("1256-10-28", regnalYear.getRegnalYearStartAsString());
        assertEquals("1257-10-27", regnalYear.getRegnalYearEndAsString());
    }

    @Test
    public void test_Henry_III_57() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(57, "hen", 3);
        assertEquals("1272-10-28", regnalYear.getRegnalYearStartAsString());
        assertEquals("1272-11-16", regnalYear.getRegnalYearEndAsString());
    }

    // ---------- Regnal years (Edward I)

    @Test
    public void test_Edward_I_1() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(1, "edw", 1);
        assertEquals("1272-11-20", regnalYear.getRegnalYearStartAsString());
        assertEquals("1273-11-19", regnalYear.getRegnalYearEndAsString());
    }

    @Test
    public void test_Edward_I_15() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(15, "edw", 1);
        assertEquals("1286-11-20", regnalYear.getRegnalYearStartAsString());
        assertEquals("1287-11-19", regnalYear.getRegnalYearEndAsString());
    }

    @Test
    public void test_Edward_I_24() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(24, "edw", 1);
        assertEquals("1295-11-20", regnalYear.getRegnalYearStartAsString());
        assertEquals("1296-11-19", regnalYear.getRegnalYearEndAsString());
    }

    @Test
    public void test_Edward_I_35() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(35, "edw", 1);
        assertEquals("1306-11-20", regnalYear.getRegnalYearStartAsString());
        assertEquals("1307-07-07", regnalYear.getRegnalYearEndAsString());
    }

    // ---------- Regnal Years (Edward II)

    @Test
    public void test_Edward_II_1() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(1, "edw", 2);
        assertEquals("1307-07-08", regnalYear.getRegnalYearStartAsString());
        assertEquals("1308-07-07", regnalYear.getRegnalYearEndAsString());
    }

    @Test
    public void test_Edward_II_12() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(12, "edw", 2);
        assertEquals("1318-07-08", regnalYear.getRegnalYearStartAsString());
        assertEquals("1319-07-07", regnalYear.getRegnalYearEndAsString());
    }

    @Test
    public void test_Edward_II_20() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(20, "edw", 2);
        assertEquals("1326-07-08", regnalYear.getRegnalYearStartAsString());
        assertEquals("1327-01-20", regnalYear.getRegnalYearEndAsString());
    }

    // ---------- Regnal Years (Edward III)

    @Test
    public void test_Edward_III_1() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(1, "edw", 3);
        assertEquals("1327-01-25", regnalYear.getRegnalYearStartAsString());
        assertEquals("1328-01-24", regnalYear.getRegnalYearEndAsString());
    }

    @Test
    public void test_Edward_III_12() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(12, "edw", 3);
        assertEquals("1338-01-25", regnalYear.getRegnalYearStartAsString());
        assertEquals("1339-01-24", regnalYear.getRegnalYearEndAsString());
    }

    @Test
    public void test_Edward_III_20() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(20, "edw", 3);
        assertEquals("1346-01-25", regnalYear.getRegnalYearStartAsString());
        assertEquals("1347-01-24", regnalYear.getRegnalYearEndAsString());
    }

    @Test
    public void test_Edward_III_33() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(33, "edw", 3);
        assertEquals("1359-01-25", regnalYear.getRegnalYearStartAsString());
        assertEquals("1360-01-24", regnalYear.getRegnalYearEndAsString());
    }

    @Test
    public void test_Edward_III_47() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(47, "edw", 3);
        assertEquals("1373-01-25", regnalYear.getRegnalYearStartAsString());
        assertEquals("1374-01-24", regnalYear.getRegnalYearEndAsString());
    }

    @Test
    public void test_Edward_III_51() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(51, "edw", 3);
        assertEquals("1377-01-25", regnalYear.getRegnalYearStartAsString());
        assertEquals("1377-06-21", regnalYear.getRegnalYearEndAsString());
    }


    // ---------- Regnal years (Richard II)

    @Test
    public void test_Richard_II_1() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(1, "ric", 2);
        assertEquals("1377-06-22", regnalYear.getRegnalYearStartAsString());
        assertEquals("1378-06-21", regnalYear.getRegnalYearEndAsString());
    }

    @Test
    public void test_Richard_II_12() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(12, "ric", 2);
        assertEquals("1388-06-22", regnalYear.getRegnalYearStartAsString());
        assertEquals("1389-06-21", regnalYear.getRegnalYearEndAsString());
    }

    @Test
    public void test_Richard_II_23() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(23, "ric", 2);
        assertEquals("1399-06-22", regnalYear.getRegnalYearStartAsString());
        assertEquals("1399-09-29", regnalYear.getRegnalYearEndAsString());
    }


    // ---------- Regal years (Henry IV)

    @Test
    public void test_Henry_IV_1() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(1, "hen", 4);
        assertEquals("1399-09-30", regnalYear.getRegnalYearStartAsString());
        assertEquals("1400-09-29", regnalYear.getRegnalYearEndAsString());
    }

    @Test
    public void test_Henry_IV_10() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(10, "hen", 4);
        assertEquals("1408-09-30", regnalYear.getRegnalYearStartAsString());
        assertEquals("1409-09-29", regnalYear.getRegnalYearEndAsString());
    }

    @Test
    public void test_Henry_IV_14() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(14, "hen", 4);
        assertEquals("1412-09-30", regnalYear.getRegnalYearStartAsString());
        assertEquals("1413-03-20", regnalYear.getRegnalYearEndAsString());
    }

    // ---------- Regnal years (Henry V)

    @Test
    public void test_Henry_V_1() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(1, "hen", 5);
        assertEquals("1413-03-21", regnalYear.getRegnalYearStartAsString());
        assertEquals("1414-03-20", regnalYear.getRegnalYearEndAsString());
    }

    @Test
    public void test_Henry_V_5() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(5, "hen", 5);
        assertEquals("1417-03-21", regnalYear.getRegnalYearStartAsString());
        assertEquals("1418-03-20", regnalYear.getRegnalYearEndAsString());
    }

    @Test
    public void test_Henry_V_10() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(10, "hen", 5);
        assertEquals("1422-03-21", regnalYear.getRegnalYearStartAsString());
        assertEquals("1422-08-31", regnalYear.getRegnalYearEndAsString());
    }

    // ---------- Regnal years (Henry VI)

    @Test
    public void test_Henry_VI_1() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(1, "hen", 6);
        assertEquals("1422-09-01", regnalYear.getRegnalYearStartAsString());
        assertEquals("1423-08-31", regnalYear.getRegnalYearEndAsString());
    }

    @Test
    public void test_Henry_VI_11() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(11, "hen", 6);
        assertEquals("1432-09-01", regnalYear.getRegnalYearStartAsString());
        assertEquals("1433-08-31", regnalYear.getRegnalYearEndAsString());
    }

    @Test
    public void test_Henry_VI_21() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(21, "hen", 6);
        assertEquals("1442-09-01", regnalYear.getRegnalYearStartAsString());
        assertEquals("1443-08-31", regnalYear.getRegnalYearEndAsString());
    }

    @Test
    public void test_Henry_VI_31() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(31, "hen", 6);
        assertEquals("1452-09-01", regnalYear.getRegnalYearStartAsString());
        assertEquals("1453-08-31", regnalYear.getRegnalYearEndAsString());
    }

    @Test
    public void test_Henry_VI_39() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(39, "hen", 6);
        assertEquals("1460-09-01", regnalYear.getRegnalYearStartAsString());
        assertEquals("1461-03-04", regnalYear.getRegnalYearEndAsString());
    }

    @Test
    public void test_Henry_VI_49() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(49, "hen", 6);
        assertEquals("1470-10-01", regnalYear.getRegnalYearStartAsString());
        assertEquals("1471-04-11", regnalYear.getRegnalYearEndAsString());
    }

    // ---------- Regnal Years (Edward IV)

    @Test
    public void test_Edward_IV_1() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(1, "edw", 4);
        assertEquals("1461-03-04", regnalYear.getRegnalYearStartAsString());
        assertEquals("1462-03-03", regnalYear.getRegnalYearEndAsString());
    }

    @Test
    public void test_Edward_IV_11() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(11, "edw", 4);
        assertEquals("1471-03-04", regnalYear.getRegnalYearStartAsString());
        assertEquals("1472-03-03", regnalYear.getRegnalYearEndAsString());
    }

    @Test
    public void test_Edward_IV_21() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(21, "edw", 4);
        assertEquals("1481-03-04", regnalYear.getRegnalYearStartAsString());
        assertEquals("1482-03-03", regnalYear.getRegnalYearEndAsString());
    }

    @Test
    public void test_Edward_IV_23() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(23, "edw", 4);
        assertEquals("1483-03-04", regnalYear.getRegnalYearStartAsString());
        assertEquals("1483-04-09", regnalYear.getRegnalYearEndAsString());
    }

    // ---------- Edward V

    @Test
    public void test_Edward_V_1() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(1, "edw", 5);
        assertEquals("1483-04-09", regnalYear.getRegnalYearStartAsString());
        assertEquals("1483-06-25", regnalYear.getRegnalYearEndAsString());
    }

    // ---------- Richard III

    @Test
    public void test_Richard_III_1() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(1, "ric", 3);
        assertEquals("1483-06-26", regnalYear.getRegnalYearStartAsString());
        assertEquals("1484-06-25", regnalYear.getRegnalYearEndAsString());
    }

    @Test
    public void test_Richard_III_3() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(3, "ric", 3);
        assertEquals("1485-06-26", regnalYear.getRegnalYearStartAsString());
        assertEquals("1485-08-22", regnalYear.getRegnalYearEndAsString());
    }

    // ---------- Henry VII

    @Test
    public void test_Henry_VII_1() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(1, "hen", 7);
        assertEquals("1485-08-22", regnalYear.getRegnalYearStartAsString());
        assertEquals("1486-08-21", regnalYear.getRegnalYearEndAsString());
    }

    @Test
    public void test_Henry_VII_11() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(11, "hen", 7);
        assertEquals("1495-08-22", regnalYear.getRegnalYearStartAsString());
        assertEquals("1496-08-21", regnalYear.getRegnalYearEndAsString());
    }

    @Test
    public void test_Henry_VII_21() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(21, "hen", 7);
        assertEquals("1505-08-22", regnalYear.getRegnalYearStartAsString());
        assertEquals("1506-08-21", regnalYear.getRegnalYearEndAsString());
    }


    // ---------- Testing getting a date (string) based on day, month and regnal year. Tests include both sides
    // ---------- of a calendar year within a regnal year


    // ---------- Henry III

    @Test
    public void test_Henry_III_1216_10_30() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        DateTime val = dateFromRegnalDate.dateFromRegnal(30, 10, 1, "hen", 3);
        assertEquals("1216-10-30", val.toString(formatter));
    }

    @Test
    public void test_Henry_III_1217_10_25() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        DateTime val = dateFromRegnalDate.dateFromRegnal(25, 10, 1, "hen", 3);
        assertEquals("1217-10-25", val.toString(formatter));
    }

    @Test
    public void test_Henry_III_1235_12_20() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        DateTime val = dateFromRegnalDate.dateFromRegnal(20, 12, 20, "hen", 3);
        assertEquals("1235-12-20", val.toString(formatter));
    }

    @Test
    public void test_Henry_III_1236_01_01() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        DateTime val = dateFromRegnalDate.dateFromRegnal(1, 1, 20, "hen", 3);
        assertEquals("1236-01-01", val.toString(formatter));
    }

    @Test
    public void test_Henry_III_1272_11_16() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        DateTime val = dateFromRegnalDate.dateFromRegnal(16, 11, 57, "hen", 3);
        assertEquals("1272-11-16", val.toString(formatter));
    }

    // ---------- Edward I

    @Test
    public void test_Edward_I_1272_11_20() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        DateTime val = dateFromRegnalDate.dateFromRegnal(20, 11, 1, "edw", 1);
        assertEquals("1272-11-20", val.toString(formatter));
    }

    @Test
    public void test_Edward_I_1272_12_31() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        DateTime val = dateFromRegnalDate.dateFromRegnal(31, 12, 1, "edw", 1);
        assertEquals("1272-12-31", val.toString(formatter));
    }

    @Test
    public void test_Edward_I_1273_1_11() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        DateTime val = dateFromRegnalDate.dateFromRegnal(11, 1, 1, "edw", 1);
        assertEquals("1273-01-11", val.toString(formatter));
    }

    // ---------- Edward II

    @Test
    public void test_Edward_II_1307_07_08() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        DateTime val = dateFromRegnalDate.dateFromRegnal(8, 7, 1, "edw", 2);
        assertEquals("1307-07-08", val.toString(formatter));
    }

    @Test
    public void test_Edward_II_1308_07_07() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        DateTime val = dateFromRegnalDate.dateFromRegnal(7, 7, 1, "edw", 2);
        assertEquals("1308-07-07", val.toString(formatter));
    }

    @Test
    public void test_Edward_II_1317_09_27() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        DateTime val = dateFromRegnalDate.dateFromRegnal(27, 9, 11, "edw", 2);
        assertEquals("1317-09-27", val.toString(formatter));
    }

    @Test
    public void test_Edward_II_1318_03_27() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        DateTime val = dateFromRegnalDate.dateFromRegnal(27, 3, 11, "edw", 2);
        assertEquals("1318-03-27", val.toString(formatter));
    }

    @Test
    public void test_Edward_II_1326_08_20() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        DateTime val = dateFromRegnalDate.dateFromRegnal(20, 8, 20, "edw", 2);
        assertEquals("1326-08-20", val.toString(formatter));
    }

    @Test
    public void test_Edward_II_1327_01_20() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        DateTime val = dateFromRegnalDate.dateFromRegnal(20, 1, 20, "edw", 2);
        assertEquals("1327-01-20", val.toString(formatter));
    }

    // ---------- Edward III

    @Test
    public void test_Edward_III_1327_01_25() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        DateTime val = dateFromRegnalDate.dateFromRegnal(25, 1, 1, "edw", 3);
        assertEquals("1327-01-25", val.toString(formatter));
    }

    @Test
    public void test_Edward_III_1328_01_20() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        DateTime val = dateFromRegnalDate.dateFromRegnal(20, 1, 1, "edw", 3);
        assertEquals("1328-01-20", val.toString(formatter));
    }

    @Test
    public void test_Edward_III_1348_05_20() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        DateTime val = dateFromRegnalDate.dateFromRegnal(20, 5, 22, "edw", 3);
        assertEquals("1348-05-20", val.toString(formatter));
    }

    @Test
    public void test_Edward_III_1367_09_29() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        DateTime val = dateFromRegnalDate.dateFromRegnal(29, 9, 41, "edw", 3);
        assertEquals("1367-09-29", val.toString(formatter));
    }

    @Test
    public void test_Edward_III_1377_06_21() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        DateTime val = dateFromRegnalDate.dateFromRegnal(21, 6, 51, "edw", 3);
        assertEquals("1377-06-21", val.toString(formatter));
    }

    // ---------- Richard II

    @Test
    public void test_Richard_II_1377_06_22() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        DateTime val = dateFromRegnalDate.dateFromRegnal(22, 6, 1, "ric", 2);
        assertEquals("1377-06-22", val.toString(formatter));
    }

    @Test
    public void test_Richard_II_1378_06_21() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        DateTime val = dateFromRegnalDate.dateFromRegnal(21, 6, 1, "ric", 2);
        assertEquals("1378-06-21", val.toString(formatter));
    }

    @Test
    public void test_Richard_II_1399_09_20() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        DateTime val = dateFromRegnalDate.dateFromRegnal(20, 9, 23, "ric", 2);
        assertEquals("1399-09-20", val.toString(formatter));
    }

    // ---------- Henry IV

    @Test
    public void test_Henry_IV_1399_09_30() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        DateTime val = dateFromRegnalDate.dateFromRegnal(30, 9, 1, "hen", 4);
        assertEquals("1399-09-30", val.toString(formatter));
    }

    @Test
    public void test_Henry_IV_1400_09_29() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        DateTime val = dateFromRegnalDate.dateFromRegnal(29, 9, 1, "hen", 4);
        assertEquals("1400-09-29", val.toString(formatter));
    }

    // ---------- Henry V

    @Test
    public void test_Henry_V_1413_03_21() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        DateTime val = dateFromRegnalDate.dateFromRegnal(21, 3, 1, "hen", 5);
        assertEquals("1413-03-21", val.toString(formatter));
    }

    @Test
    public void test_Henry_V_1414_03_20() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        DateTime val = dateFromRegnalDate.dateFromRegnal(20, 3, 1, "hen", 5);
        assertEquals("1414-03-20", val.toString(formatter));
    }

    // ---------- Henry VI

    @Test
    public void test_Henry_VI_1422_09_01() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        DateTime val = dateFromRegnalDate.dateFromRegnal(1, 9, 1, "hen", 6);
        assertEquals("1422-09-01", val.toString(formatter));
    }

    @Test
    public void test_Henry_VI_1423_08_31() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        DateTime val = dateFromRegnalDate.dateFromRegnal(31, 8, 1, "hen", 6);
        assertEquals("1423-08-31", val.toString(formatter));
    }

    @Test
    public void test_Henry_VI_1470_10_10() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        DateTime val = dateFromRegnalDate.dateFromRegnal(10, 10, 49, "hen", 6);
        assertEquals("1470-10-10", val.toString(formatter));
    }

    @Test
    public void test_Henry_VI_1471_04_04() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        DateTime val = dateFromRegnalDate.dateFromRegnal(4, 4, 49, "hen", 6);
        assertEquals("1471-04-04", val.toString(formatter));
    }

    // ---------- Edward IV

    @Test
    public void test_Edward_IV_1461_03_04() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        DateTime val = dateFromRegnalDate.dateFromRegnal(4, 3, 1, "edw", 4);
        assertEquals("1461-03-04", val.toString(formatter));
    }

    @Test
    public void test_Edward_IV_1462_03_01() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        DateTime val = dateFromRegnalDate.dateFromRegnal(1, 3, 1, "edw", 4);
        assertEquals("1462-03-01", val.toString(formatter));
    }

    // ---------- Edward V

    @Test
    public void test_Edward_V_1483_05_10() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        DateTime val = dateFromRegnalDate.dateFromRegnal(10, 5, 1, "edw", 5);
        assertEquals("1483-05-10", val.toString(formatter));
    }

    // ---------- Richard III

    @Test
    public void test_Richard_III_1483_06_26() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        DateTime val = dateFromRegnalDate.dateFromRegnal(26, 6, 1, "ric", 3);
        assertEquals("1483-06-26", val.toString(formatter));
    }

    @Test
    public void test_Richard_III_1484_06_25() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        DateTime val = dateFromRegnalDate.dateFromRegnal(25, 6, 1, "ric", 3);
        assertEquals("1484-06-25", val.toString(formatter));
    }

    // ---------- Henry VII

    @Test
    public void test_Henry_VII_1485_08_22() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        DateTime val = dateFromRegnalDate.dateFromRegnal(22, 8, 1, "hen", 7);
        assertEquals("1485-08-22", val.toString(formatter));
    }

    @Test
    public void test_Henry_VII_1486_08_21() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        DateTime val = dateFromRegnalDate.dateFromRegnal(21, 8, 1, "hen", 7);
        assertEquals("1486-08-21", val.toString(formatter));
    }


}
