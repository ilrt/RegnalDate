package ie.beyond2022.utils.regnaldate;

import org.joda.time.DateTime;
import org.joda.time.chrono.GJChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.io.IOException;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Converts a string that describes a regnal date, e.g. '26 March 1 Edward I' into a string representation of
 * a date in 'YYYY-MM-DD' format; or a regnal year, e.g. '1 Edward I' into a string representation of a date
 * range in 'YYYY-MM-DD:YYYY-MM-DD' format.
 */
public class RegnalDateFromString {

    DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
    EasterDateLookupUtility easterLookup = new EasterDateLookupUtility();

    Map<String, Integer> months = Stream.of(new Object[][]{
            {"jan", 1}, {"feb", 2}, {"mar", 3}, {"apr", 4}, {"may", 5}, {"jun", 6},
            {"jul", 7}, {"aug", 8}, {"sep", 9}, {"oct", 10}, {"nov", 11}, {"dec", 12}
    }).collect(Collectors.toMap(data -> (String) data[0], data -> (Integer) data[1]));

    Map<String, Integer> ordinals = Stream.of(new Object[][]{
            {"i", 1}, {"ii", 2}, {"iii", 3}, {"iv", 4}, {"v", 5}, {"vi", 6}, {"vii", 7}, {"viii", 8}
    }).collect(Collectors.toMap(data -> (String) data[0], data -> (Integer) data[1]));

    // regnal year, with a feast
    Pattern feastRegnalPattern = Pattern.compile("((([a-zA-Z]+ )+)((\\d+) ([a-zA-Z]+\\.?) ([A-Z]+)))");

    // regnal year, with a day amd month, e.g. 4 June 3 Henry III
    Pattern dayMonthRegnalPattern = Pattern.compile("(((\\d+) ([a-zA-Z]+\\.?)) ((\\d+) ([a-zA-Z]+\\.?) ([A-Z]+)))");

    // regnal year, but no day and month
    Pattern regnalPattern = Pattern.compile("((\\d+) ([a-zA-Z]+\\.?) ([A-Z]+))");

    // Easter
    Pattern easterPattern = Pattern.compile("(\\b[E|e]aster\\b)");

    // octave ... related to a feast
    Pattern octavePattern = Pattern.compile("\\b[O|o]ctave\\b");

    // quindene ... related to a feast
    Pattern quindenePattern = Pattern.compile("\\b[Q|q]uindene\\b");

    Pattern quinquageisimaPattern = Pattern.compile("\\b[Q|q]uinquageisima\\b");

    public RegnalDateFromString() throws IOException {
    }

    private String normalizeMonarch(String name) {
        return name.toLowerCase().substring(0, 3);
    }

    private Integer normalizeOrdinal(String ordinal) {
        return ordinals.get(ordinal.toLowerCase());
    }

    private Integer normalizeRegnal(String regnal) {
        return Integer.parseInt(regnal);
    }

    public RegnalDate regnalDate(Matcher matcher, String text) {
        // group 2 is the regnal year
        Integer regnal = normalizeRegnal(matcher.group(2));
        // group 3 is the monarch
        String monarch = normalizeMonarch(matcher.group(3));
        // group 4 is the ordinal
        Integer ordinal = normalizeOrdinal(matcher.group(4));
        String regalYearMonarch = matcher.group(1);

        RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(regnal, monarch, ordinal);

        return new RegnalDateImpl(text, regalYearMonarch, regnalYear.getRegnalYearStartAsString(), regnalYear.getRegnalYearEndAsString());
    }

    public RegnalDate parse(String text) {

        Matcher feastMatcher = feastRegnalPattern.matcher(text);
        Matcher easterMatcher = easterPattern.matcher(text);
        Matcher quindeneMatcher = quindenePattern.matcher(text);
        Matcher octaveMatcher = octavePattern.matcher(text);
        Matcher dayMonthMatcher = dayMonthRegnalPattern.matcher(text);
        Matcher regnalYearMatcher = regnalPattern.matcher(text);
        Matcher quinquageisimaMatcher = quinquageisimaPattern.matcher(text);

        if (feastMatcher.matches()) {

            if (easterMatcher.find()) {

                if (regnalYearMatcher.find()) {

                    // group (2) is the feast text
                    String feastText = feastMatcher.group(2).trim();

                    // group (4) is the regnal year
                    String regalYearMonarch = feastMatcher.group(4);

                    Integer regnal = normalizeRegnal(regnalYearMatcher.group(2));
                    String monarch = normalizeMonarch(regnalYearMatcher.group(3));
                    Integer ordinal = normalizeOrdinal(regnalYearMatcher.group(4));
                    RegnalYear regnalYear = dateFromRegnalDate.rangeForRegnalYear(regnal, monarch, ordinal);


                    PossibleFeasts possibleFeasts = new PossibleFeasts(regnalYear.toString());
                    Feast a = possibleFeasts.getA();
                    Feast b = possibleFeasts.getB();

                    // octave?
                    if (octaveMatcher.find()) {
                        if (a.getFeastOctaveDate().compareTo(possibleFeasts.startDate()) > 0) {
                            return new RegnalDateImpl(text, feastText, regalYearMonarch, a.getFeastOctaveDate());
                        } else {
                            return new RegnalDateImpl(text, feastText, regalYearMonarch, b.getFeastOctaveDate());
                        }
                        // quindene?
                    } else if (quindeneMatcher.find()) {
                        if (a.getFeastQuindeneDate().compareTo(possibleFeasts.startDate()) > 0) {
                            return new RegnalDateImpl(text, feastText, regalYearMonarch, a.getFeastQuindeneDate());
                        } else {
                            return new RegnalDateImpl(text, feastText, regalYearMonarch, b.getFeastQuindeneDate());
                        }
                        // default to the feast
                    } else {
                        if (a.getFeastDate().compareTo(possibleFeasts.startDate()) > 0) {
                            return new RegnalDateImpl(text, feastText, regalYearMonarch, a.getFeastDate());
                        } else {
                            return new RegnalDateImpl(text, feastText, regalYearMonarch, b.getFeastDate());
                        }
                    }
                } else if (quinquageisimaMatcher.find()) {

                }


            }
            return null; // default return null
        } else if (dayMonthMatcher.matches()) {

            // group 2 has the day + month, while group 5 has the regnal year, monarch and their ordinal number
            // group 3 has the day of the month, while group 4 is the month

            // date
            String date = dayMonthMatcher.group(3);

            // month
            String month = dayMonthMatcher.group(4).toLowerCase();
            month = month.substring(0, 3);
            int month_val = months.get(month);

            // regnal
            Integer regnal = normalizeRegnal(dayMonthMatcher.group(6));

            // monarch
            String monarch = normalizeMonarch(dayMonthMatcher.group(7));

            // ordinal
            Integer ordinal = normalizeOrdinal(dayMonthMatcher.group(8));

            String dayMonthText = dayMonthMatcher.group(2);
            String regalYearMonarch = dayMonthMatcher.group(5);

            DateTime dateObj = dateFromRegnalDate.dateFromRegnal(Integer.parseInt(date), month_val, regnal,
                    monarch, ordinal);
            return new RegnalDateImpl(text, dayMonthText, regalYearMonarch, dateObj);
        } else if (regnalYearMatcher.matches()) {
            Integer regnal = normalizeRegnal(regnalYearMatcher.group(2));
            String monarch = normalizeMonarch(regnalYearMatcher.group(3));
            Integer ordinal = normalizeOrdinal(regnalYearMatcher.group(4));
            return new RegnalDateAsRangeImpl(text, dateFromRegnalDate.rangeForRegnalYear(regnal, monarch, ordinal), text);
        } else {
            return null;
        }
    }


    private class PossibleFeasts {

        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd")
                .withChronology(GJChronology.getInstance());

        Feast a;
        Feast b;
        DateTime startDate;
        DateTime endDate;

        public PossibleFeasts(String regnal_date_range) {
            String[] year_range_tmp = regnal_date_range.split(":");
            String start = year_range_tmp[0];
            startDate =  formatter.parseDateTime(start);
            String end = year_range_tmp[1];
            endDate = formatter.parseDateTime(end);
            a = easterLookup.lookup(startDate.getYear());
            b = easterLookup.lookup(endDate.getYear());
        }

        public DateTime startDate() {
            return startDate;
        }

        public Feast getA() {
            return a;
        }

        public Feast getB() {
            return b;
        }
    }
}
