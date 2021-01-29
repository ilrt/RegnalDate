package ie.beyond2022.utils.regnaldate;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegnalDateFromStringWithMovableDateTest {

    // 1 Henry III

    @Test
    public void test_quinquageisima_1_Henry_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("Quinquageisima 1 Henry III");
        assertEquals("1217-02-05", val.toString());
        assertEquals("Quinquageisima", val.getDayMonthFeastText());
        assertEquals("1 Henry III", val.getRegnalYearMonarch());
        assertEquals("1217", val.getYear());
    }

    @Test
    public void test_quinquageisima_sunday_1_Henry_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("Quinquageisima Sunday 1 Henry III");
        assertEquals("1217-02-05", val.toString());
        assertEquals("Quinquageisima Sunday", val.getDayMonthFeastText());
        assertEquals("1 Henry III", val.getRegnalYearMonarch());
        assertEquals("1217", val.getYear());
    }

    @Test
    public void test_quadrageisma_1_Henry_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("Quadrageisma 1 Henry III");
        assertEquals("1217-02-12", val.toString());
        assertEquals("Quadrageisma", val.getDayMonthFeastText());
        assertEquals("1 Henry III", val.getRegnalYearMonarch());
        assertEquals("1217", val.getYear());
    }

    @Test
    public void test_quadrageisma_sunday_1_Henry_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("Quadrageisma Sunday 1 Henry III");
        assertEquals("1217-02-12", val.toString());
        assertEquals("Quadrageisma Sunday", val.getDayMonthFeastText());
        assertEquals("1 Henry III", val.getRegnalYearMonarch());
        assertEquals("1217", val.getYear());
    }

    @Test
    public void test_rogation_1_Henry_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("Rogation 1 Henry III");
        assertEquals("1217-04-30", val.toString());
        assertEquals("Rogation", val.getDayMonthFeastText());
        assertEquals("1 Henry III", val.getRegnalYearMonarch());
        assertEquals("1217", val.getYear());
    }

    @Test
    public void test_ascension_1_Henry_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("Ascension 1 Henry III");
        assertEquals("1217-05-04", val.toString());
        assertEquals("Ascension", val.getDayMonthFeastText());
        assertEquals("1 Henry III", val.getRegnalYearMonarch());
        assertEquals("1217", val.getYear());
    }

    @Test
    public void test_penticost_1_Henry_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("Penticost 1 Henry III");
        assertEquals("1217-05-14", val.toString());
        assertEquals("Penticost", val.getDayMonthFeastText());
        assertEquals("1 Henry III", val.getRegnalYearMonarch());
        assertEquals("1217", val.getYear());
    }

    @Test
    public void test_whitsun_1_Henry_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("Whitsun 1 Henry III");
        assertEquals("1217-05-14", val.toString());
        assertEquals("Whitsun", val.getDayMonthFeastText());
        assertEquals("1 Henry III", val.getRegnalYearMonarch());
        assertEquals("1217", val.getYear());
    }

    @Test
    public void test_whit_sunday_1_Henry_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("Whit Sunday 1 Henry III");
        assertEquals("1217-05-14", val.toString());
        assertEquals("Whit Sunday", val.getDayMonthFeastText());
        assertEquals("1 Henry III", val.getRegnalYearMonarch());
        assertEquals("1217", val.getYear());
    }

    @Test
    public void test_whit_dash_sunday_1_Henry_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("Whit-Sunday 1 Henry III");
        assertEquals("1217-05-14", val.toString());
        assertEquals("Whit-Sunday", val.getDayMonthFeastText());
        assertEquals("1 Henry III", val.getRegnalYearMonarch());
        assertEquals("1217", val.getYear());
    }

    @Test
    public void test_trinity_1_Henry_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("Trinity 1 Henry III");
        assertEquals("1217-05-21", val.toString());
        assertEquals("Trinity", val.getDayMonthFeastText());
        assertEquals("1 Henry III", val.getRegnalYearMonarch());
        assertEquals("1217", val.getYear());
    }

    @Test
    public void test_corpus_christi_1_Henry_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("Corpus Christi 1 Henry III");
        assertEquals("1217-05-25", val.toString());
        assertEquals("Corpus Christi", val.getDayMonthFeastText());
        assertEquals("1 Henry III", val.getRegnalYearMonarch());
        assertEquals("1217", val.getYear());
    }

    // 38 Edward III

    @Test
    public void test_quinquageisima_38_Edward_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("Quinquageisima 38 Edward III");
        assertEquals("1364-02-04", val.toString());
        assertEquals("Quinquageisima", val.getDayMonthFeastText());
        assertEquals("38 Edward III", val.getRegnalYearMonarch());
        assertEquals("1364", val.getYear());
    }

    @Test
    public void test_quinquageisima_sunday_38_Edward_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("Quinquageisima Sunday 38 Edward III");
        assertEquals("1364-02-04", val.toString());
        assertEquals("Quinquageisima Sunday", val.getDayMonthFeastText());
        assertEquals("38 Edward III", val.getRegnalYearMonarch());
        assertEquals("1364", val.getYear());
    }
//
    @Test
    public void test_quadrageisma_38_Edward_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("Quadrageisma 38 Edward III");
        assertEquals("1364-02-11", val.toString());
        assertEquals("Quadrageisma", val.getDayMonthFeastText());
        assertEquals("38 Edward III", val.getRegnalYearMonarch());
        assertEquals("1364", val.getYear());
    }

    @Test
    public void test_quadrageisma_sunday_38_Edward_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("Quadrageisma Sunday 38 Edward III");
        assertEquals("1364-02-11", val.toString());
        assertEquals("Quadrageisma Sunday", val.getDayMonthFeastText());
        assertEquals("38 Edward III", val.getRegnalYearMonarch());
        assertEquals("1364", val.getYear());
    }

    @Test
    public void test_rogation_38_Edward_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("Rogation 38 Edward III");
        assertEquals("1364-04-28", val.toString());
        assertEquals("Rogation", val.getDayMonthFeastText());
        assertEquals("38 Edward III", val.getRegnalYearMonarch());
        assertEquals("1364", val.getYear());
    }

    @Test
    public void test_ascension_38_Henry_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("Ascension 38 Edward III");
        assertEquals("1364-05-02", val.toString());
        assertEquals("Ascension", val.getDayMonthFeastText());
        assertEquals("38 Edward III", val.getRegnalYearMonarch());
        assertEquals("1364", val.getYear());
    }

    @Test
    public void test_penticost_38_Edward_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("Penticost 38 Edward III");
        assertEquals("1364-05-12", val.toString());
        assertEquals("Penticost", val.getDayMonthFeastText());
        assertEquals("38 Edward III", val.getRegnalYearMonarch());
        assertEquals("1364", val.getYear());
    }

    @Test
    public void test_whitsun_38_Edward_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("Whitsun 38 Edward III");
        assertEquals("1364-05-12", val.toString());
        assertEquals("Whitsun", val.getDayMonthFeastText());
        assertEquals("38 Edward III", val.getRegnalYearMonarch());
        assertEquals("1364", val.getYear());
    }

    @Test
    public void test_whit_sunday_38_Edward_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("Whit Sunday 38 Edward III");
        assertEquals("1364-05-12", val.toString());
        assertEquals("Whit Sunday", val.getDayMonthFeastText());
        assertEquals("38 Edward III", val.getRegnalYearMonarch());
        assertEquals("1364", val.getYear());
    }

    @Test
    public void test_whit_dash_sunday_38_Edward_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("Whit-Sunday 38 Edward III");
        assertEquals("1364-05-12", val.toString());
        assertEquals("Whit-Sunday", val.getDayMonthFeastText());
        assertEquals("38 Edward III", val.getRegnalYearMonarch());
        assertEquals("1364", val.getYear());
    }

    @Test
    public void test_trinity_38_Edward_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("Trinity 38 Edward III");
        assertEquals("1364-05-19", val.toString());
        assertEquals("Trinity", val.getDayMonthFeastText());
        assertEquals("38 Edward III", val.getRegnalYearMonarch());
        assertEquals("1364", val.getYear());
    }

    @Test
    public void test_corpus_christi_38_Edward_III() throws IOException {
        RegnalDate val = RegnalDate.parseString("Corpus Christi 38 Edward III");
        assertEquals("1364-05-23", val.toString());
        assertEquals("Corpus Christi", val.getDayMonthFeastText());
        assertEquals("38 Edward III", val.getRegnalYearMonarch());
        assertEquals("1364", val.getYear());
    }
}
