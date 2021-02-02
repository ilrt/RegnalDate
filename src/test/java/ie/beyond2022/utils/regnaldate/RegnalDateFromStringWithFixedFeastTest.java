package ie.beyond2022.utils.regnaldate;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegnalDateFromStringWithFixedFeastTest {

    // ----- 1 Edward I

    // Michaelmas

    @Test
    public void michaelmas_1_Edward_I() throws IOException {
        RegnalDate val = RegnalDate.parseString("Michaelmas 1 Edward I");
        assertEquals("1273-09-29", val.toString());
        assertEquals("Michaelmas", val.getDayMonthFeastText());
        assertEquals("1 Edward I", val.getRegnalYearMonarch());
        assertEquals("1273", val.getYear());
    }

    @Test
    public void michaelmas_octave_1_Edward_I() throws IOException {
        RegnalDate val = RegnalDate.parseString("Octave of Michaelmas 1 Edward I");
        assertEquals("1273-10-06", val.toString());
        assertEquals("Octave of Michaelmas", val.getDayMonthFeastText());
        assertEquals("1 Edward I", val.getRegnalYearMonarch());
        assertEquals("1273", val.getYear());
    }

    @Test
    public void michaelmas_quindene_1_Edward_I() throws IOException {
        RegnalDate val = RegnalDate.parseString("Quindene of Michaelmas 1 Edward I");
        assertEquals("1273-10-13", val.toString());
        assertEquals("Quindene of Michaelmas", val.getDayMonthFeastText());
        assertEquals("1 Edward I", val.getRegnalYearMonarch());
        assertEquals("1273", val.getYear());
    }

    // All Saints

    @Test
    public void all_saints_1_Edward_I() throws IOException {
        RegnalDate val = RegnalDate.parseString("All Saints 1 Edward I");
        assertEquals("1273-11-01", val.toString());
        assertEquals("All Saints", val.getDayMonthFeastText());
        assertEquals("1 Edward I", val.getRegnalYearMonarch());
        assertEquals("1273", val.getYear());
    }

    @Test
    public void all_saints_octave_1_Edward_I() throws IOException {
        RegnalDate val = RegnalDate.parseString("Octave of All Saints 1 Edward I");
        assertEquals("1273-11-08", val.toString());
        assertEquals("Octave of All Saints", val.getDayMonthFeastText());
        assertEquals("1 Edward I", val.getRegnalYearMonarch());
        assertEquals("1273", val.getYear());
    }

    @Test
    public void all_saints_quindene_1_Edward_I() throws IOException {
        RegnalDate val = RegnalDate.parseString("Quindene of All Saints 1 Edward I");
        assertEquals("1273-11-15", val.toString());
        assertEquals("Quindene of All Saints", val.getDayMonthFeastText());
        assertEquals("1 Edward I", val.getRegnalYearMonarch());
        assertEquals("1273", val.getYear());
    }

    // All Souls

    @Test
    public void all_souls_1_Edward_I() throws IOException {
        RegnalDate val = RegnalDate.parseString("All Souls 1 Edward I");
        assertEquals("1273-11-02", val.toString());
        assertEquals("All Souls", val.getDayMonthFeastText());
        assertEquals("1 Edward I", val.getRegnalYearMonarch());
        assertEquals("1273", val.getYear());
    }

    @Test
    public void all_souls_octave_1_Edward_I() throws IOException {
        RegnalDate val = RegnalDate.parseString("Octave of All Souls 1 Edward I");
        assertEquals("1273-11-09", val.toString());
        assertEquals("Octave of All Souls", val.getDayMonthFeastText());
        assertEquals("1 Edward I", val.getRegnalYearMonarch());
        assertEquals("1273", val.getYear());
    }

    @Test
    public void all_souls_quindene_1_Edward_I() throws IOException {
        RegnalDate val = RegnalDate.parseString("Quindene of All Souls 1 Edward I");
        assertEquals("1273-11-16", val.toString());
        assertEquals("Quindene of All Souls", val.getDayMonthFeastText());
        assertEquals("1 Edward I", val.getRegnalYearMonarch());
        assertEquals("1273", val.getYear());
    }

    // Andrew

    @Test
    public void andrew_1_Edward_I() throws IOException {
        RegnalDate val = RegnalDate.parseString("Andrew the apostle 1 Edward I");
        assertEquals("1272-11-30", val.toString());
        assertEquals("Andrew the apostle", val.getDayMonthFeastText());
        assertEquals("1 Edward I", val.getRegnalYearMonarch());
        assertEquals("1272", val.getYear());
    }

    @Test
    public void andrew_octave_1_Edward_I() throws IOException {
        RegnalDate val = RegnalDate.parseString("Octave of Andrew the apostle 1 Edward I");
        assertEquals("1272-12-07", val.toString());
        assertEquals("Octave of Andrew the apostle", val.getDayMonthFeastText());
        assertEquals("1 Edward I", val.getRegnalYearMonarch());
        assertEquals("1272", val.getYear());
    }

    @Test
    public void andrew_quindene_1_Edward_I() throws IOException {
        RegnalDate val = RegnalDate.parseString("Quindene of Andrew the apostle 1 Edward I");
        assertEquals("1272-12-14", val.toString());
        assertEquals("Quindene of Andrew the apostle", val.getDayMonthFeastText());
        assertEquals("1 Edward I", val.getRegnalYearMonarch());
        assertEquals("1272", val.getYear());
    }

    // Martin (Martinmas)
    @Test
    public void andrew_2_Edward_I() throws IOException {
        RegnalDate val = RegnalDate.parseString("Martinmas 2 Edward I");
        assertEquals("1274-11-11", val.toString());
        assertEquals("Martinmas", val.getDayMonthFeastText());
        assertEquals("2 Edward I", val.getRegnalYearMonarch());
        assertEquals("1274", val.getYear());
    }

    @Test
    public void andrew_octave_2_Edward_I() throws IOException {
        RegnalDate val = RegnalDate.parseString("Octave of Martinmas 2 Edward I");
        assertEquals("1274-11-18", val.toString());
        assertEquals("Octave of Martinmas", val.getDayMonthFeastText());
        assertEquals("2 Edward I", val.getRegnalYearMonarch());
        assertEquals("1274", val.getYear());
    }

    @Test
    public void andrew_quindene_2_Edward_I() throws IOException {
        RegnalDate val = RegnalDate.parseString("Quindene of Martinmas 2 Edward I");
        assertEquals("1273-11-25", val.toString());
        assertEquals("Quindene of Martinmas", val.getDayMonthFeastText());
        assertEquals("2 Edward I", val.getRegnalYearMonarch());
        assertEquals("1273", val.getYear());
    }

    // ----- Juliana 27 and 28 Edward I ... the latter is a leap year that affects the quindene date

    @Test
    public void juliana_27_Edward_I() throws IOException {
        RegnalDate val = RegnalDate.parseString("Juliana 27 Edward I");
        assertEquals("1299-02-16", val.toString());
        assertEquals("Juliana", val.getDayMonthFeastText());
        assertEquals("27 Edward I", val.getRegnalYearMonarch());
        assertEquals("1299", val.getYear());
    }

    @Test
    public void juliana_28_Edward_I_leap_year() throws IOException {
        RegnalDate val = RegnalDate.parseString("Juliana 28 Edward I");
        assertEquals("1300-02-16", val.toString());
        assertEquals("Juliana", val.getDayMonthFeastText());
        assertEquals("28 Edward I", val.getRegnalYearMonarch());
        assertEquals("1300", val.getYear());
    }

    @Test
    public void juliana_octave_27_Edward_I() throws IOException {
        RegnalDate val = RegnalDate.parseString("Octave of Juliana 27 Edward I");
        assertEquals("1299-02-23", val.toString());
        assertEquals("Octave of Juliana", val.getDayMonthFeastText());
        assertEquals("27 Edward I", val.getRegnalYearMonarch());
        assertEquals("1299", val.getYear());
    }

    @Test
    public void juliana_octave_28_Edward_I_leap_year() throws IOException {
        RegnalDate val = RegnalDate.parseString("Octave of Juliana 28 Edward I");
        assertEquals("1300-02-23", val.toString());
        assertEquals("Octave of Juliana", val.getDayMonthFeastText());
        assertEquals("28 Edward I", val.getRegnalYearMonarch());
        assertEquals("1300", val.getYear());
    }

    @Test
    public void juliana_quindene_27_Edward() throws IOException {
        RegnalDate val = RegnalDate.parseString("Quindene of Juliana 27 Edward I");
        assertEquals("1299-03-02", val.toString());
        assertEquals("Quindene of Juliana", val.getDayMonthFeastText());
        assertEquals("27 Edward I", val.getRegnalYearMonarch());
        assertEquals("1299", val.getYear());
    }

    @Test
    public void juliana_quindene_28_Edward_I_leap_year() throws IOException {
        RegnalDate val = RegnalDate.parseString("Quindene of Juliana 28 Edward I");
        assertEquals("1300-03-01", val.toString());
        assertEquals("Quindene of Juliana", val.getDayMonthFeastText());
        assertEquals("28 Edward I", val.getRegnalYearMonarch());
        assertEquals("1300", val.getYear());
    }

    // ----- 27 and 28 Edward I ... the latter is a leap year that affects the octave and quindene date

    @Test
    public void mathias_27_Edward_I() throws IOException {
        RegnalDate val = RegnalDate.parseString("Mathias 27 Edward I");
        assertEquals("1299-02-24", val.toString());
        assertEquals("Mathias", val.getDayMonthFeastText());
        assertEquals("27 Edward I", val.getRegnalYearMonarch());
        assertEquals("1299", val.getYear());
    }

    @Test
    public void mathias_28_Edward_I_leap_year() throws IOException {
        RegnalDate val = RegnalDate.parseString("Mathias 28 Edward I");
        assertEquals("1300-02-24", val.toString());
        assertEquals("Mathias", val.getDayMonthFeastText());
        assertEquals("28 Edward I", val.getRegnalYearMonarch());
        assertEquals("1300", val.getYear());
    }

    @Test
    public void mathias_octave_27_Edward_I() throws IOException {
        RegnalDate val = RegnalDate.parseString("Octave of Mathias 27 Edward I");
        assertEquals("1299-03-03", val.toString());
        assertEquals("Octave of Mathias", val.getDayMonthFeastText());
        assertEquals("27 Edward I", val.getRegnalYearMonarch());
        assertEquals("1299", val.getYear());
    }

    @Test
    public void mathias_octave_28_Edward_I_leap_year() throws IOException {
        RegnalDate val = RegnalDate.parseString("Octave of Mathias 28 Edward I");
        assertEquals("1300-03-02", val.toString());
        assertEquals("Octave of Mathias", val.getDayMonthFeastText());
        assertEquals("28 Edward I", val.getRegnalYearMonarch());
        assertEquals("1300", val.getYear());
    }

    @Test
    public void mathias_quindene_27_Edward() throws IOException {
        RegnalDate val = RegnalDate.parseString("Quindene of Mathias 27 Edward I");
        assertEquals("1299-03-10", val.toString());
        assertEquals("Quindene of Mathias", val.getDayMonthFeastText());
        assertEquals("27 Edward I", val.getRegnalYearMonarch());
        assertEquals("1299", val.getYear());
    }

    @Test
    public void mathias_quindene_28_Edward_I_leap_year() throws IOException {
        RegnalDate val = RegnalDate.parseString("Quindene of Mathias 28 Edward I");
        assertEquals("1300-03-09", val.toString());
        assertEquals("Quindene of Mathias", val.getDayMonthFeastText());
        assertEquals("28 Edward I", val.getRegnalYearMonarch());
        assertEquals("1300", val.getYear());
    }
}
