package ie.beyond2022.utils.regnaldate.utils;

import ie.beyond2022.utils.regnaldate.utils.RegnalDateLookupUtility;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegnalDateLookupUtilityTest {

    @Test
    public void testKeyNumber() throws IOException {
        // Test we loaded the correct number of years
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals(301, lookup.dateLookup.keySet().size());
    }

    // ---------- The following tests check a snapshot of ranges for each monarch in the data file.

    // ---------- Henry III

    @Test
    public void test_Henry_III_1() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1216-10-28", lookup.lookup("hen-3-1").getRegnalYearStartAsString());
        assertEquals("1217-10-27", lookup.lookup("hen-3-1").getRegnalYearEndAsString());
    }

    @Test
    public void test_Henry_III_16() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1231-10-28", lookup.lookup("hen-3-16").getRegnalYearStartAsString());
        assertEquals("1232-10-27", lookup.lookup("hen-3-16").getRegnalYearEndAsString());
    }

    @Test
    public void test_Henry_III_38() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1253-10-28", lookup.lookup("hen-3-38").getRegnalYearStartAsString());
        assertEquals("1254-10-27", lookup.lookup("hen-3-38").getRegnalYearEndAsString());
    }

    @Test
    public void test_Henry_III_57() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1272-10-28", lookup.lookup("hen-3-57").getRegnalYearStartAsString());
        assertEquals("1272-11-16", lookup.lookup("hen-3-57").getRegnalYearEndAsString());
    }

    // ---------- Edward I

    @Test
    public void test_Edward_I_1() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1272-11-20", lookup.lookup("edw-1-1").getRegnalYearStartAsString());
        assertEquals("1273-11-19", lookup.lookup("edw-1-1").getRegnalYearEndAsString());
    }

    @Test
    public void test_Edward_I_12() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1283-11-20", lookup.lookup("edw-1-12").getRegnalYearStartAsString());
        assertEquals("1284-11-19", lookup.lookup("edw-1-12").getRegnalYearEndAsString());
    }

    @Test
    public void test_Edward_I_28() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1299-11-20", lookup.lookup("edw-1-28").getRegnalYearStartAsString());
        assertEquals("1300-11-19", lookup.lookup("edw-1-28").getRegnalYearEndAsString());
    }

    @Test
    public void test_Edward_I_35() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1306-11-20", lookup.lookup("edw-1-35").getRegnalYearStartAsString());
        assertEquals("1307-07-07", lookup.lookup("edw-1-35").getRegnalYearEndAsString());
    }

    // ---------- Edward II

    @Test
    public void test_Edward_II_1() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1307-07-08", lookup.lookup("edw-2-1").getRegnalYearStartAsString());
        assertEquals("1308-07-07", lookup.lookup("edw-2-1").getRegnalYearEndAsString());
    }

    @Test
    public void test_Edward_II_12() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1318-07-08", lookup.lookup("edw-2-12").getRegnalYearStartAsString());
        assertEquals("1319-07-07", lookup.lookup("edw-2-12").getRegnalYearEndAsString());
    }

    @Test
    public void test_Edward_II_20() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1326-07-08", lookup.lookup("edw-2-20").getRegnalYearStartAsString());
        assertEquals("1327-01-20", lookup.lookup("edw-2-20").getRegnalYearEndAsString());
    }

    // ---------- Edward III

    @Test
    public void test_Edward_III_1() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1327-01-25", lookup.lookup("edw-3-1").getRegnalYearStartAsString());
        assertEquals("1328-01-24", lookup.lookup("edw-3-1").getRegnalYearEndAsString());
    }

    @Test
    public void test_Edward_III_12() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1338-01-25", lookup.lookup("edw-3-12").getRegnalYearStartAsString());
        assertEquals("1339-01-24", lookup.lookup("edw-3-12").getRegnalYearEndAsString());
    }

    @Test
    public void test_Edward_III_20() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1346-01-25", lookup.lookup("edw-3-20").getRegnalYearStartAsString());
        assertEquals("1347-01-24", lookup.lookup("edw-3-20").getRegnalYearEndAsString());
    }

    @Test
    public void test_Edward_III_33() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1359-01-25", lookup.lookup("edw-3-33").getRegnalYearStartAsString());
        assertEquals("1360-01-24", lookup.lookup("edw-3-33").getRegnalYearEndAsString());
    }

    @Test
    public void test_Edward_III_47() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1373-01-25", lookup.lookup("edw-3-47").getRegnalYearStartAsString());
        assertEquals("1374-01-24", lookup.lookup("edw-3-47").getRegnalYearEndAsString());
    }

    @Test
    public void test_Edward_III_51() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1377-01-25", lookup.lookup("edw-3-51").getRegnalYearStartAsString());
        assertEquals("1377-06-21", lookup.lookup("edw-3-51").getRegnalYearEndAsString());
    }

    // ---------- Richard II

    @Test
    public void test_Richard_II_1() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1377-06-22", lookup.lookup("ric-2-1").getRegnalYearStartAsString());
        assertEquals("1378-06-21", lookup.lookup("ric-2-1").getRegnalYearEndAsString());
    }

    @Test
    public void test_Richard_II_12() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1388-06-22", lookup.lookup("ric-2-12").getRegnalYearStartAsString());
        assertEquals("1389-06-21", lookup.lookup("ric-2-12").getRegnalYearEndAsString());
    }

    @Test
    public void test_Richard_II_23() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1399-06-22", lookup.lookup("ric-2-23").getRegnalYearStartAsString());
        assertEquals("1399-09-29", lookup.lookup("ric-2-23").getRegnalYearEndAsString());
    }

    // ---------- Henry IV

    @Test
    public void test_Henry_IV_1() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1399-09-30", lookup.lookup("hen-4-1").getRegnalYearStartAsString());
        assertEquals("1400-09-29", lookup.lookup("hen-4-1").getRegnalYearEndAsString());
    }

    @Test
    public void test_Henry_IV_10() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1408-09-30", lookup.lookup("hen-4-10").getRegnalYearStartAsString());
        assertEquals("1409-09-29", lookup.lookup("hen-4-10").getRegnalYearEndAsString());
    }

    @Test
    public void test_Henry_IV_14() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1412-09-30", lookup.lookup("hen-4-14").getRegnalYearStartAsString());
        assertEquals("1413-03-20", lookup.lookup("hen-4-14").getRegnalYearEndAsString());
    }

    // ---------- Henry V

    @Test
    public void test_Henry_V_1() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1413-03-21", lookup.lookup("hen-5-1").getRegnalYearStartAsString());
        assertEquals("1414-03-20", lookup.lookup("hen-5-1").getRegnalYearEndAsString());
    }

    @Test
    public void test_Henry_V_5() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1417-03-21", lookup.lookup("hen-5-5").getRegnalYearStartAsString());
        assertEquals("1418-03-20", lookup.lookup("hen-5-5").getRegnalYearEndAsString());
    }

    @Test
    public void test_Henry_V_10() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1422-03-21", lookup.lookup("hen-5-10").getRegnalYearStartAsString());
        assertEquals("1422-08-31", lookup.lookup("hen-5-10").getRegnalYearEndAsString());
    }

    // ---------- Henry VI

    @Test
    public void test_Henry_VI_1() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1422-09-01", lookup.lookup("hen-6-1").getRegnalYearStartAsString());
        assertEquals("1423-08-31", lookup.lookup("hen-6-1").getRegnalYearEndAsString());
    }

    @Test
    public void test_Henry_VI_11() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1432-09-01", lookup.lookup("hen-6-11").getRegnalYearStartAsString());
        assertEquals("1433-08-31", lookup.lookup("hen-6-11").getRegnalYearEndAsString());
    }

    @Test
    public void test_Henry_VI_21() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1442-09-01", lookup.lookup("hen-6-21").getRegnalYearStartAsString());
        assertEquals("1443-08-31", lookup.lookup("hen-6-21").getRegnalYearEndAsString());
    }

    @Test
    public void test_Henry_VI_31() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1452-09-01", lookup.lookup("hen-6-31").getRegnalYearStartAsString());
        assertEquals("1453-08-31", lookup.lookup("hen-6-31").getRegnalYearEndAsString());
    }

    @Test
    public void test_Henry_VI_39() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1460-09-01", lookup.lookup("hen-6-39").getRegnalYearStartAsString());
        assertEquals("1461-03-04", lookup.lookup("hen-6-39").getRegnalYearEndAsString());
    }

    @Test
    public void test_Henry_VI_49() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1470-10-01", lookup.lookup("hen-6-49").getRegnalYearStartAsString());
        assertEquals("1471-04-11", lookup.lookup("hen-6-49").getRegnalYearEndAsString());
    }

    // ---------- Edward IV

    @Test
    public void test_Edward_IV_1() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1461-03-04", lookup.lookup("edw-4-1").getRegnalYearStartAsString());
        assertEquals("1462-03-03", lookup.lookup("edw-4-1").getRegnalYearEndAsString());
    }

    @Test
    public void test_Edward_IV_11() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1471-03-04", lookup.lookup("edw-4-11").getRegnalYearStartAsString());
        assertEquals("1472-03-03", lookup.lookup("edw-4-11").getRegnalYearEndAsString());
    }

    @Test
    public void test_Edward_IV_21() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1481-03-04", lookup.lookup("edw-4-21").getRegnalYearStartAsString());
        assertEquals("1482-03-03", lookup.lookup("edw-4-21").getRegnalYearEndAsString());
    }

    @Test
    public void test_Edward_IV_23() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1483-03-04", lookup.lookup("edw-4-23").getRegnalYearStartAsString());
        assertEquals("1483-04-09", lookup.lookup("edw-4-23").getRegnalYearEndAsString());
    }

    // ---------- Edward V

    @Test
    public void test_Edward_V_1() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1483-04-09", lookup.lookup("edw-5-1").getRegnalYearStartAsString());
        assertEquals("1483-06-25", lookup.lookup("edw-5-1").getRegnalYearEndAsString());
    }

    // ---------- Richard III

    @Test
    public void test_Richard_III_1() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1483-06-26", lookup.lookup("ric-3-1").getRegnalYearStartAsString());
        assertEquals("1484-06-25", lookup.lookup("ric-3-1").getRegnalYearEndAsString());
    }

    @Test
    public void test_Richard_III_3() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1485-06-26", lookup.lookup("ric-3-3").getRegnalYearStartAsString());
        assertEquals("1485-08-22", lookup.lookup("ric-3-3").getRegnalYearEndAsString());
    }

    // ---------- Henry VII

    @Test
    public void test_Henry_VII_1() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1485-08-22", lookup.lookup("hen-7-1").getRegnalYearStartAsString());
        assertEquals("1486-08-21", lookup.lookup("hen-7-1").getRegnalYearEndAsString());
    }

    @Test
    public void test_Henry_VII_11() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1495-08-22", lookup.lookup("hen-7-11").getRegnalYearStartAsString());
        assertEquals("1496-08-21", lookup.lookup("hen-7-11").getRegnalYearEndAsString());
    }

    @Test
    public void test_Henry_VII_21() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1505-08-22", lookup.lookup("hen-7-21").getRegnalYearStartAsString());
        assertEquals("1506-08-21", lookup.lookup("hen-7-21").getRegnalYearEndAsString());
    }
}
