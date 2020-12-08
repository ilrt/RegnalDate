package ie.beyond2022.utils.regnaldate;

import ie.beyond2022.utils.regnaldate.DateFromRegnalDate;
import ie.beyond2022.utils.regnaldate.RegnalYear;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateFromRegnalDateTest {

    // ---------- Testing getting a Regnal Year object

    // ---------- Regnal years (Henry III)

    @Test
    public void test_Henry_III_1() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(1, "hen", 3);
        assertEquals("1216-10-28", regnalYear.getRegnalYearStart());
        assertEquals("1217-10-27", regnalYear.getRegnalYearEnd());
    }

    @Test
    public void test_Henry_III_19() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(19, "hen", 3);
        assertEquals("1234-10-28", regnalYear.getRegnalYearStart());
        assertEquals("1235-10-27", regnalYear.getRegnalYearEnd());
    }

    @Test
    public void test_Henry_III_41() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(41, "hen", 3);
        assertEquals("1256-10-28", regnalYear.getRegnalYearStart());
        assertEquals("1257-10-27", regnalYear.getRegnalYearEnd());
    }

    @Test
    public void test_Henry_III_57() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(57, "hen", 3);
        assertEquals("1272-10-28", regnalYear.getRegnalYearStart());
        assertEquals("1272-11-16", regnalYear.getRegnalYearEnd());
    }

    // ---------- Regnal years (Edward I)

    @Test
    public void test_Edward_I_1() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(1, "edw", 1);
        assertEquals("1272-11-20", regnalYear.getRegnalYearStart());
        assertEquals("1273-11-19", regnalYear.getRegnalYearEnd());
    }

    @Test
    public void test_Edward_I_15() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(15, "edw", 1);
        assertEquals("1286-11-20", regnalYear.getRegnalYearStart());
        assertEquals("1287-11-19", regnalYear.getRegnalYearEnd());
    }

    @Test
    public void test_Edward_I_24() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(24, "edw", 1);
        assertEquals("1295-11-20", regnalYear.getRegnalYearStart());
        assertEquals("1296-11-19", regnalYear.getRegnalYearEnd());
    }

    @Test
    public void test_Edward_I_35() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(35, "edw", 1);
        assertEquals("1306-11-20", regnalYear.getRegnalYearStart());
        assertEquals("1307-7-7", regnalYear.getRegnalYearEnd());
    }

    // ---------- Regnal Years (Edward II)

    @Test
    public void test_Edward_II_1() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(1, "edw", 2);
        assertEquals("1307-7-8", regnalYear.getRegnalYearStart());
        assertEquals("1308-7-7", regnalYear.getRegnalYearEnd());
    }

    @Test
    public void test_Edward_II_12() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(12, "edw", 2);
        assertEquals("1318-7-8", regnalYear.getRegnalYearStart());
        assertEquals("1319-7-7", regnalYear.getRegnalYearEnd());
    }

    @Test
    public void test_Edward_II_20() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(20, "edw", 2);
        assertEquals("1326-7-8", regnalYear.getRegnalYearStart());
        assertEquals("1327-1-20", regnalYear.getRegnalYearEnd());
    }

    // ---------- Regnal Years (Edward III)

    @Test
    public void test_Edward_III_1() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(1, "edw", 3);
        assertEquals("1327-1-25", regnalYear.getRegnalYearStart());
        assertEquals("1328-1-24", regnalYear.getRegnalYearEnd());
    }

    @Test
    public void test_Edward_III_12() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(12, "edw", 3);
        assertEquals("1338-1-25", regnalYear.getRegnalYearStart());
        assertEquals("1339-1-24", regnalYear.getRegnalYearEnd());
    }

    @Test
    public void test_Edward_III_20() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(20, "edw", 3);
        assertEquals("1346-1-25", regnalYear.getRegnalYearStart());
        assertEquals("1347-1-24", regnalYear.getRegnalYearEnd());
    }

    @Test
    public void test_Edward_III_33() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(33, "edw", 3);
        assertEquals("1359-1-25", regnalYear.getRegnalYearStart());
        assertEquals("1360-1-24", regnalYear.getRegnalYearEnd());
    }

    @Test
    public void test_Edward_III_47() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(47, "edw", 3);
        assertEquals("1373-1-25", regnalYear.getRegnalYearStart());
        assertEquals("1374-1-24", regnalYear.getRegnalYearEnd());
    }

    @Test
    public void test_Edward_III_51() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(51, "edw", 3);
        assertEquals("1377-1-25", regnalYear.getRegnalYearStart());
        assertEquals("1377-6-21", regnalYear.getRegnalYearEnd());
    }


    // ---------- Regnal years (Richard II)

    @Test
    public void test_Richard_II_1() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(1, "ric", 2);
        assertEquals("1377-6-22", regnalYear.getRegnalYearStart());
        assertEquals("1378-6-21", regnalYear.getRegnalYearEnd());
    }

    @Test
    public void test_Richard_II_12() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(12, "ric", 2);
        assertEquals("1388-6-22", regnalYear.getRegnalYearStart());
        assertEquals("1389-6-21", regnalYear.getRegnalYearEnd());
    }

    @Test
    public void test_Richard_II_23() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(23, "ric", 2);
        assertEquals("1399-6-22", regnalYear.getRegnalYearStart());
        assertEquals("1399-9-29", regnalYear.getRegnalYearEnd());
    }


    // ---------- Regal years (Henry IV)

    @Test
    public void test_Henry_IV_1() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(1, "hen", 4);
        assertEquals("1399-9-30", regnalYear.getRegnalYearStart());
        assertEquals("1400-9-29", regnalYear.getRegnalYearEnd());
    }

    @Test
    public void test_Henry_IV_10() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(10, "hen", 4);
        assertEquals("1408-9-30", regnalYear.getRegnalYearStart());
        assertEquals("1409-9-29", regnalYear.getRegnalYearEnd());
    }

    @Test
    public void test_Henry_IV_14() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(14, "hen", 4);
        assertEquals("1412-9-30", regnalYear.getRegnalYearStart());
        assertEquals("1413-3-20", regnalYear.getRegnalYearEnd());
    }

    // ---------- Regnal years (Henry V)

    @Test
    public void test_Henry_V_1() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(1, "hen", 5);
        assertEquals("1413-3-21", regnalYear.getRegnalYearStart());
        assertEquals("1414-3-20", regnalYear.getRegnalYearEnd());
    }

    @Test
    public void test_Henry_V_5() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(5, "hen", 5);
        assertEquals("1417-3-21", regnalYear.getRegnalYearStart());
        assertEquals("1418-3-20", regnalYear.getRegnalYearEnd());
    }

    @Test
    public void test_Henry_V_10() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(10, "hen", 5);
        assertEquals("1422-3-21", regnalYear.getRegnalYearStart());
        assertEquals("1422-8-31", regnalYear.getRegnalYearEnd());
    }

    // ---------- Regnal years (Henry VI)

    @Test
    public void test_Henry_VI_1() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(1, "hen", 6);
        assertEquals("1422-9-1", regnalYear.getRegnalYearStart());
        assertEquals("1423-8-31", regnalYear.getRegnalYearEnd());
    }

    @Test
    public void test_Henry_VI_11() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(11, "hen", 6);
        assertEquals("1432-9-1", regnalYear.getRegnalYearStart());
        assertEquals("1433-8-31", regnalYear.getRegnalYearEnd());
    }

    @Test
    public void test_Henry_VI_21() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(21, "hen", 6);
        assertEquals("1442-9-1", regnalYear.getRegnalYearStart());
        assertEquals("1443-8-31", regnalYear.getRegnalYearEnd());
    }

    @Test
    public void test_Henry_VI_31() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(31, "hen", 6);
        assertEquals("1452-9-1", regnalYear.getRegnalYearStart());
        assertEquals("1453-8-31", regnalYear.getRegnalYearEnd());
    }

    @Test
    public void test_Henry_VI_39() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(39, "hen", 6);
        assertEquals("1460-9-1", regnalYear.getRegnalYearStart());
        assertEquals("1461-3-4", regnalYear.getRegnalYearEnd());
    }

    @Test
    public void test_Henry_VI_49() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(49, "hen", 6);
        assertEquals("1470-10-1", regnalYear.getRegnalYearStart());
        assertEquals("1471-4-11", regnalYear.getRegnalYearEnd());
    }

    // ---------- Regnal Years (Edward IV)

    @Test
    public void test_Edward_IV_1() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(1, "edw", 4);
        assertEquals("1461-3-4", regnalYear.getRegnalYearStart());
        assertEquals("1462-3-3", regnalYear.getRegnalYearEnd());
    }

    @Test
    public void test_Edward_IV_11() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(11, "edw", 4);
        assertEquals("1471-3-4", regnalYear.getRegnalYearStart());
        assertEquals("1472-3-3", regnalYear.getRegnalYearEnd());
    }

    @Test
    public void test_Edward_IV_21() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(21, "edw", 4);
        assertEquals("1481-3-4", regnalYear.getRegnalYearStart());
        assertEquals("1482-3-3", regnalYear.getRegnalYearEnd());
    }

    @Test
    public void test_Edward_IV_23() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(23, "edw", 4);
        assertEquals("1483-3-4", regnalYear.getRegnalYearStart());
        assertEquals("1483-4-9", regnalYear.getRegnalYearEnd());
    }

    // ---------- Edward V

    @Test
    public void test_Edward_V_1() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(1, "edw", 5);
        assertEquals("1483-4-9", regnalYear.getRegnalYearStart());
        assertEquals("1483-6-25", regnalYear.getRegnalYearEnd());
    }

    // ---------- Richard III

    @Test
    public void test_Richard_III_1() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(1, "ric", 3);
        assertEquals("1483-6-26", regnalYear.getRegnalYearStart());
        assertEquals("1484-6-25", regnalYear.getRegnalYearEnd());
    }

    @Test
    public void test_Richard_III_3() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(3, "ric", 3);
        assertEquals("1485-6-26", regnalYear.getRegnalYearStart());
        assertEquals("1485-8-22", regnalYear.getRegnalYearEnd());
    }

    // ---------- Henry VII

    @Test
    public void test_Henry_VII_1() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(1, "hen", 7);
        assertEquals("1485-8-22", regnalYear.getRegnalYearStart());
        assertEquals("1486-8-21", regnalYear.getRegnalYearEnd());
    }

    @Test
    public void test_Henry_VII_11() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(11, "hen", 7);
        assertEquals("1495-8-22", regnalYear.getRegnalYearStart());
        assertEquals("1496-8-21", regnalYear.getRegnalYearEnd());
    }

    @Test
    public void test_Henry_VII_21() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(21, "hen", 7);
        assertEquals("1505-8-22", regnalYear.getRegnalYearStart());
        assertEquals("1506-8-21", regnalYear.getRegnalYearEnd());
    }


    // ---------- Testing getting a date (string) based on day, month and regnal year. Tests include both sides
    // ---------- of a calendar year within a regnal year

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    // ---------- Henry III

    @Test
    public void test_Henry_III_1216_10_30() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        LocalDate val = dateFromRegnalDate.dateFromRegnal(30, 10, 1, "hen", 3);
        assertEquals("1216-10-30", val.format(formatter));
    }

    @Test
    public void test_Henry_III_1217_10_25() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        LocalDate val = dateFromRegnalDate.dateFromRegnal(25, 10, 1, "hen", 3);
        assertEquals("1217-10-25", val.format(formatter));
    }

    @Test
    public void test_Henry_III_1235_12_20() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        LocalDate val = dateFromRegnalDate.dateFromRegnal(20, 12, 20, "hen", 3);
        assertEquals("1235-12-20", val.format(formatter));
    }

    @Test
    public void test_Henry_III_1236_01_01() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        LocalDate val = dateFromRegnalDate.dateFromRegnal(1, 1, 20, "hen", 3);
        assertEquals("1236-01-01", val.format(formatter));
    }

    @Test
    public void test_Henry_III_1272_11_16() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        LocalDate val = dateFromRegnalDate.dateFromRegnal(16, 11, 57, "hen", 3);
        assertEquals("1272-11-16", val.format(formatter));
    }

    // ---------- Edward I

    @Test
    public void test_Edward_I_1272_11_20() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        LocalDate val = dateFromRegnalDate.dateFromRegnal(20, 11, 1, "edw", 1);
        assertEquals("1272-11-20", val.format(formatter));
    }

    @Test
    public void test_Edward_I_1272_12_31() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        LocalDate val = dateFromRegnalDate.dateFromRegnal(31, 12, 1, "edw", 1);
        assertEquals("1272-12-31", val.format(formatter));
    }

    @Test
    public void test_Edward_I_1273_1_11() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        LocalDate val = dateFromRegnalDate.dateFromRegnal(11, 1, 1, "edw", 1);
        assertEquals("1273-01-11", val.format(formatter));
    }

    // ---------- Edward II

    @Test
    public void test_Edward_II_1307_07_08() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        LocalDate val = dateFromRegnalDate.dateFromRegnal(8, 7, 1, "edw", 2);
        assertEquals("1307-07-08", val.format(formatter));
    }

    @Test
    public void test_Edward_II_1308_07_07() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        LocalDate val = dateFromRegnalDate.dateFromRegnal(7, 7, 1, "edw", 2);
        assertEquals("1308-07-07", val.format(formatter));
    }

    @Test
    public void test_Edward_II_1317_09_27() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        LocalDate val = dateFromRegnalDate.dateFromRegnal(27, 9, 11, "edw", 2);
        assertEquals("1317-09-27", val.format(formatter));
    }

    @Test
    public void test_Edward_II_1318_03_27() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        LocalDate val = dateFromRegnalDate.dateFromRegnal(27, 3, 11, "edw", 2);
        assertEquals("1318-03-27", val.format(formatter));
    }

    @Test
    public void test_Edward_II_1326_08_20() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        LocalDate val = dateFromRegnalDate.dateFromRegnal(20, 8, 20, "edw", 2);
        assertEquals("1326-08-20", val.format(formatter));
    }

    @Test
    public void test_Edward_II_1327_01_20() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        LocalDate val = dateFromRegnalDate.dateFromRegnal(20, 1, 20, "edw", 2);
        assertEquals("1327-01-20", val.format(formatter));
    }

    // ---------- Edward III

    @Test
    public void test_Edward_III_1327_01_25() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        LocalDate val = dateFromRegnalDate.dateFromRegnal(25, 1, 1, "edw", 3);
        assertEquals("1327-01-25", val.format(formatter));
    }

    @Test
    public void test_Edward_III_1328_01_20() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        LocalDate val = dateFromRegnalDate.dateFromRegnal(20, 1, 1, "edw", 3);
        assertEquals("1328-01-20", val.format(formatter));
    }

    @Test
    public void test_Edward_III_1348_05_20() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        LocalDate val = dateFromRegnalDate.dateFromRegnal(20, 5, 22, "edw", 3);
        assertEquals("1348-05-20", val.format(formatter));
    }

    @Test
    public void test_Edward_III_1367_09_29() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        LocalDate val = dateFromRegnalDate.dateFromRegnal(29, 9, 41, "edw", 3);
        assertEquals("1367-09-29", val.format(formatter));
    }

    @Test
    public void test_Edward_III_1377_06_21() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        LocalDate val = dateFromRegnalDate.dateFromRegnal(21, 6, 51, "edw", 3);
        assertEquals("1377-06-21", val.format(formatter));
    }

    // ---------- Richard II

    @Test
    public void test_Richard_II_1377_06_22() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        LocalDate val = dateFromRegnalDate.dateFromRegnal(22, 6, 1, "ric", 2);
        assertEquals("1377-06-22", val.format(formatter));
    }

    @Test
    public void test_Richard_II_1378_06_21() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        LocalDate val = dateFromRegnalDate.dateFromRegnal(21, 6, 1, "ric", 2);
        assertEquals("1378-06-21", val.format(formatter));
    }

    @Test
    public void test_Richard_II_1399_09_20() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        LocalDate val = dateFromRegnalDate.dateFromRegnal(20, 9, 23, "ric", 2);
        assertEquals("1399-09-20", val.format(formatter));
    }

    // ---------- Henry IV

    @Test
    public void test_Henry_IV_1399_09_30() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        LocalDate val = dateFromRegnalDate.dateFromRegnal(30, 9, 1, "hen", 4);
        assertEquals("1399-09-30", val.format(formatter));
    }

    @Test
    public void test_Henry_IV_1400_09_29() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        LocalDate val = dateFromRegnalDate.dateFromRegnal(29, 9, 1, "hen", 4);
        assertEquals("1400-09-29", val.format(formatter));
    }

    // ---------- Henry V

    @Test
    public void test_Henry_V_1413_03_21() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        LocalDate val = dateFromRegnalDate.dateFromRegnal(21, 3, 1, "hen", 5);
        assertEquals("1413-03-21", val.format(formatter));
    }

    @Test
    public void test_Henry_V_1414_03_20() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        LocalDate val = dateFromRegnalDate.dateFromRegnal(20, 3, 1, "hen", 5);
        assertEquals("1414-03-20", val.format(formatter));
    }

    // ---------- Henry VI

    @Test
    public void test_Henry_VI_1422_09_01() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        LocalDate val = dateFromRegnalDate.dateFromRegnal(1, 9, 1, "hen", 6);
        assertEquals("1422-09-01", val.format(formatter));
    }

    @Test
    public void test_Henry_VI_1423_08_31() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        LocalDate val = dateFromRegnalDate.dateFromRegnal(31, 8, 1, "hen", 6);
        assertEquals("1423-08-31", val.format(formatter));
    }

    @Test
    public void test_Henry_VI_1470_10_10() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        LocalDate val = dateFromRegnalDate.dateFromRegnal(10, 10, 49, "hen", 6);
        assertEquals("1470-10-10", val.format(formatter));
    }

    @Test
    public void test_Henry_VI_1471_04_04() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        LocalDate val = dateFromRegnalDate.dateFromRegnal(4, 4, 49, "hen", 6);
        assertEquals("1471-04-04", val.format(formatter));
    }

    // ---------- Edward IV

    @Test
    public void test_Edward_IV_1461_03_04() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        LocalDate val = dateFromRegnalDate.dateFromRegnal(4, 3, 1, "edw", 4);
        assertEquals("1461-03-04", val.format(formatter));
    }

    @Test
    public void test_Edward_IV_1462_03_01() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        LocalDate val = dateFromRegnalDate.dateFromRegnal(1, 3, 1, "edw", 4);
        assertEquals("1462-03-01", val.format(formatter));
    }

    // ---------- Edward V

    @Test
    public void test_Edward_V_1483_05_10() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        LocalDate val = dateFromRegnalDate.dateFromRegnal(10, 5, 1, "edw", 5);
        assertEquals("1483-05-10", val.format(formatter));
    }

    // ---------- Richard III

    @Test
    public void test_Richard_III_1483_06_26() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        LocalDate val = dateFromRegnalDate.dateFromRegnal(26, 6, 1, "ric", 3);
        assertEquals("1483-06-26", val.format(formatter));
    }

    @Test
    public void test_Richard_III_1484_06_25() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        LocalDate val = dateFromRegnalDate.dateFromRegnal(25, 6, 1, "ric", 3);
        assertEquals("1484-06-25", val.format(formatter));
    }

    // ---------- Henry VII

    @Test
    public void test_Henry_VII_1485_08_22() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        LocalDate val = dateFromRegnalDate.dateFromRegnal(22, 8, 1, "hen", 7);
        assertEquals("1485-08-22", val.format(formatter));
    }

    @Test
    public void test_Henry_VII_1486_08_21() throws IOException {
        DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
        LocalDate val = dateFromRegnalDate.dateFromRegnal(21, 8, 1, "hen", 7);
        assertEquals("1486-08-21", val.format(formatter));
    }


}
