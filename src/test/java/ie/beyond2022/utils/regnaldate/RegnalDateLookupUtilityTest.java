package ie.beyond2022.utils.regnaldate;

import ie.beyond2022.utils.regnaldate.RegnalDateLookupUtility;
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
        assertEquals("1216-10-28", lookup.lookup("hen-3-1").getRegnalYearStart());
        assertEquals("1217-10-27", lookup.lookup("hen-3-1").getRegnalYearEnd());
    }

    @Test
    public void test_Henry_III_16() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1231-10-28", lookup.lookup("hen-3-16").getRegnalYearStart());
        assertEquals("1232-10-27", lookup.lookup("hen-3-16").getRegnalYearEnd());
    }

    @Test
    public void test_Henry_III_38() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1253-10-28", lookup.lookup("hen-3-38").getRegnalYearStart());
        assertEquals("1254-10-27", lookup.lookup("hen-3-38").getRegnalYearEnd());
    }

    @Test
    public void test_Henry_III_57() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1272-10-28", lookup.lookup("hen-3-57").getRegnalYearStart());
        assertEquals("1272-11-16", lookup.lookup("hen-3-57").getRegnalYearEnd());
    }

    // ---------- Edward I

    @Test
    public void test_Edward_I_1() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1272-11-20", lookup.lookup("edw-1-1").getRegnalYearStart());
        assertEquals("1273-11-19", lookup.lookup("edw-1-1").getRegnalYearEnd());
    }

    @Test
    public void test_Edward_I_12() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1283-11-20", lookup.lookup("edw-1-12").getRegnalYearStart());
        assertEquals("1284-11-19", lookup.lookup("edw-1-12").getRegnalYearEnd());
    }

    @Test
    public void test_Edward_I_28() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1299-11-20", lookup.lookup("edw-1-28").getRegnalYearStart());
        assertEquals("1300-11-19", lookup.lookup("edw-1-28").getRegnalYearEnd());
    }

    @Test
    public void test_Edward_I_35() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1306-11-20", lookup.lookup("edw-1-35").getRegnalYearStart());
        assertEquals("1307-7-7", lookup.lookup("edw-1-35").getRegnalYearEnd());
    }

    // ---------- Edward II

    @Test
    public void test_Edward_II_1() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1307-7-8", lookup.lookup("edw-2-1").getRegnalYearStart());
        assertEquals("1308-7-7", lookup.lookup("edw-2-1").getRegnalYearEnd());
    }

    @Test
    public void test_Edward_II_12() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1318-7-8", lookup.lookup("edw-2-12").getRegnalYearStart());
        assertEquals("1319-7-7", lookup.lookup("edw-2-12").getRegnalYearEnd());
    }

    @Test
    public void test_Edward_II_20() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1326-7-8", lookup.lookup("edw-2-20").getRegnalYearStart());
        assertEquals("1327-1-20", lookup.lookup("edw-2-20").getRegnalYearEnd());
    }

    // ---------- Edward III

    @Test
    public void test_Edward_III_1() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1327-1-25", lookup.lookup("edw-3-1").getRegnalYearStart());
        assertEquals("1328-1-24", lookup.lookup("edw-3-1").getRegnalYearEnd());
    }

    @Test
    public void test_Edward_III_12() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1338-1-25", lookup.lookup("edw-3-12").getRegnalYearStart());
        assertEquals("1339-1-24", lookup.lookup("edw-3-12").getRegnalYearEnd());
    }

    @Test
    public void test_Edward_III_20() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1346-1-25", lookup.lookup("edw-3-20").getRegnalYearStart());
        assertEquals("1347-1-24", lookup.lookup("edw-3-20").getRegnalYearEnd());
    }

    @Test
    public void test_Edward_III_33() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1359-1-25", lookup.lookup("edw-3-33").getRegnalYearStart());
        assertEquals("1360-1-24", lookup.lookup("edw-3-33").getRegnalYearEnd());
    }

    @Test
    public void test_Edward_III_47() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1373-1-25", lookup.lookup("edw-3-47").getRegnalYearStart());
        assertEquals("1374-1-24", lookup.lookup("edw-3-47").getRegnalYearEnd());
    }

    @Test
    public void test_Edward_III_51() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1377-1-25", lookup.lookup("edw-3-51").getRegnalYearStart());
        assertEquals("1377-6-21", lookup.lookup("edw-3-51").getRegnalYearEnd());
    }

    // ---------- Richard II

    @Test
    public void test_Richard_II_1() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1377-6-22", lookup.lookup("ric-2-1").getRegnalYearStart());
        assertEquals("1378-6-21", lookup.lookup("ric-2-1").getRegnalYearEnd());
    }

    @Test
    public void test_Richard_II_12() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1388-6-22", lookup.lookup("ric-2-12").getRegnalYearStart());
        assertEquals("1389-6-21", lookup.lookup("ric-2-12").getRegnalYearEnd());
    }

    @Test
    public void test_Richard_II_23() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1399-6-22", lookup.lookup("ric-2-23").getRegnalYearStart());
        assertEquals("1399-9-29", lookup.lookup("ric-2-23").getRegnalYearEnd());
    }

    // ---------- Henry IV

    @Test
    public void test_Henry_IV_1() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1399-9-30", lookup.lookup("hen-4-1").getRegnalYearStart());
        assertEquals("1400-9-29", lookup.lookup("hen-4-1").getRegnalYearEnd());
    }

    @Test
    public void test_Henry_IV_10() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1408-9-30", lookup.lookup("hen-4-10").getRegnalYearStart());
        assertEquals("1409-9-29", lookup.lookup("hen-4-10").getRegnalYearEnd());
    }

    @Test
    public void test_Henry_IV_14() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1412-9-30", lookup.lookup("hen-4-14").getRegnalYearStart());
        assertEquals("1413-3-20", lookup.lookup("hen-4-14").getRegnalYearEnd());
    }

    // ---------- Henry V

    @Test
    public void test_Henry_V_1() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1413-3-21", lookup.lookup("hen-5-1").getRegnalYearStart());
        assertEquals("1414-3-20", lookup.lookup("hen-5-1").getRegnalYearEnd());
    }

    @Test
    public void test_Henry_V_5() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1417-3-21", lookup.lookup("hen-5-5").getRegnalYearStart());
        assertEquals("1418-3-20", lookup.lookup("hen-5-5").getRegnalYearEnd());
    }

    @Test
    public void test_Henry_V_10() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1422-3-21", lookup.lookup("hen-5-10").getRegnalYearStart());
        assertEquals("1422-8-31", lookup.lookup("hen-5-10").getRegnalYearEnd());
    }

    // ---------- Henry VI

    @Test
    public void test_Henry_VI_1() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1422-9-1", lookup.lookup("hen-6-1").getRegnalYearStart());
        assertEquals("1423-8-31", lookup.lookup("hen-6-1").getRegnalYearEnd());
    }

    @Test
    public void test_Henry_VI_11() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1432-9-1", lookup.lookup("hen-6-11").getRegnalYearStart());
        assertEquals("1433-8-31", lookup.lookup("hen-6-11").getRegnalYearEnd());
    }

    @Test
    public void test_Henry_VI_21() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1442-9-1", lookup.lookup("hen-6-21").getRegnalYearStart());
        assertEquals("1443-8-31", lookup.lookup("hen-6-21").getRegnalYearEnd());
    }

    @Test
    public void test_Henry_VI_31() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1452-9-1", lookup.lookup("hen-6-31").getRegnalYearStart());
        assertEquals("1453-8-31", lookup.lookup("hen-6-31").getRegnalYearEnd());
    }

    @Test
    public void test_Henry_VI_39() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1460-9-1", lookup.lookup("hen-6-39").getRegnalYearStart());
        assertEquals("1461-3-4", lookup.lookup("hen-6-39").getRegnalYearEnd());
    }

    @Test
    public void test_Henry_VI_49() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1470-10-1", lookup.lookup("hen-6-49").getRegnalYearStart());
        assertEquals("1471-4-11", lookup.lookup("hen-6-49").getRegnalYearEnd());
    }

    // ---------- Edward IV

    @Test
    public void test_Edward_IV_1() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1461-3-4", lookup.lookup("edw-4-1").getRegnalYearStart());
        assertEquals("1462-3-3", lookup.lookup("edw-4-1").getRegnalYearEnd());
    }

    @Test
    public void test_Edward_IV_11() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1471-3-4", lookup.lookup("edw-4-11").getRegnalYearStart());
        assertEquals("1472-3-3", lookup.lookup("edw-4-11").getRegnalYearEnd());
    }

    @Test
    public void test_Edward_IV_21() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1481-3-4", lookup.lookup("edw-4-21").getRegnalYearStart());
        assertEquals("1482-3-3", lookup.lookup("edw-4-21").getRegnalYearEnd());
    }

    @Test
    public void test_Edward_IV_23() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1483-3-4", lookup.lookup("edw-4-23").getRegnalYearStart());
        assertEquals("1483-4-9", lookup.lookup("edw-4-23").getRegnalYearEnd());
    }

    // ---------- Edward V

    @Test
    public void test_Edward_V_1() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1483-4-9", lookup.lookup("edw-5-1").getRegnalYearStart());
        assertEquals("1483-6-25", lookup.lookup("edw-5-1").getRegnalYearEnd());
    }

    // ---------- Richard III

    @Test
    public void test_Richard_III_1() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1483-6-26", lookup.lookup("ric-3-1").getRegnalYearStart());
        assertEquals("1484-6-25", lookup.lookup("ric-3-1").getRegnalYearEnd());
    }

    @Test
    public void test_Richard_III_3() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1485-6-26", lookup.lookup("ric-3-3").getRegnalYearStart());
        assertEquals("1485-8-22", lookup.lookup("ric-3-3").getRegnalYearEnd());
    }

    // ---------- Henry VII

    @Test
    public void test_Henry_VII_1() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1485-8-22", lookup.lookup("hen-7-1").getRegnalYearStart());
        assertEquals("1486-8-21", lookup.lookup("hen-7-1").getRegnalYearEnd());
    }

    @Test
    public void test_Henry_VII_11() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1495-8-22", lookup.lookup("hen-7-11").getRegnalYearStart());
        assertEquals("1496-8-21", lookup.lookup("hen-7-11").getRegnalYearEnd());
    }

    @Test
    public void test_Henry_VII_21() throws IOException {
        RegnalDateLookupUtility lookup = new RegnalDateLookupUtility();
        assertEquals("1505-8-22", lookup.lookup("hen-7-21").getRegnalYearStart());
        assertEquals("1506-8-21", lookup.lookup("hen-7-21").getRegnalYearEnd());
    }
}
