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
    MovableFeastLookupUtility movableFeastLookup = new MovableFeastLookupUtility();
    FixedFeastLookupUtility fixedFeastLookup = new FixedFeastLookupUtility();

    Map<String, Integer> months = Stream.of(new Object[][]{
            {"jan", 1}, {"feb", 2}, {"mar", 3}, {"apr", 4}, {"may", 5}, {"jun", 6},
            {"jul", 7}, {"aug", 8}, {"sep", 9}, {"oct", 10}, {"nov", 11}, {"dec", 12}
    }).collect(Collectors.toMap(data -> (String) data[0], data -> (Integer) data[1]));

    Map<String, Integer> ordinals = Stream.of(new Object[][]{
            {"i", 1}, {"ii", 2}, {"iii", 3}, {"iv", 4}, {"v", 5}, {"vi", 6}, {"vii", 7}, {"viii", 8}
    }).collect(Collectors.toMap(data -> (String) data[0], data -> (Integer) data[1]));

    // regnal year, with a feast
    Pattern feastRegnalPattern = Pattern.compile("((([a-zA-Z\\-]+ )+)((\\d+) ([a-zA-Z]+\\.?) ([A-Z]+)))");

    // regnal year, with a day amd month, e.g. 4 June 3 Henry III
    Pattern dayMonthRegnalPattern = Pattern.compile("(((\\d+) ([a-zA-Z]+\\.?)) ((\\d+) ([a-zA-Z]+\\.?) ([A-Z]+)))");

    // regnal year, but no day and month
    Pattern regnalPattern = Pattern.compile("((\\d+) ([a-zA-Z]+\\.?) ([A-Z]+))");

    // Easter
    Pattern easterPattern = Pattern.compile("(\\beaster\\b)", Pattern.CASE_INSENSITIVE);

    // octave ... related to a feast
    Pattern octavePattern = Pattern.compile("\\boctave\\b", Pattern.CASE_INSENSITIVE);

    // quindene ... related to a feast
    Pattern quindenePattern = Pattern.compile("\\bquindene\\b", Pattern.CASE_INSENSITIVE);

    // quinquageisima
    Pattern quinquageisimaPattern = Pattern.compile("\\bquinquageisima\\b", Pattern.CASE_INSENSITIVE);

    // quadrageisma
    Pattern quadrageismaPattern = Pattern.compile("\\bquadrageisma\\b", Pattern.CASE_INSENSITIVE);

    // rogation
    Pattern rogationPattern = Pattern.compile("\\brogation\\b", Pattern.CASE_INSENSITIVE);

    // ascension
    Pattern ascensionPattern = Pattern.compile("\\bascension\\b", Pattern.CASE_INSENSITIVE);

    // penticost
    Pattern penticostPattern = Pattern.compile("penticost|whitsun|whit[ |\\-]sunday", Pattern.CASE_INSENSITIVE);

    // trinity
    Pattern trinityPattern = Pattern.compile("\\btrinity\\b", Pattern.CASE_INSENSITIVE);

    // corpus christi
    Pattern corpusChristi = Pattern.compile("\\bcorpus christi\\b", Pattern.CASE_INSENSITIVE);

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

    boolean contains(String text, Pattern pattern) {
        return pattern.matcher(text).find();
    }

    boolean isMovableFeast(String text) {
        return contains(text, easterPattern) || contains(text, quinquageisimaPattern) ||
                contains(text, quadrageismaPattern) || contains(text, rogationPattern) ||
                contains(text, ascensionPattern) || contains(text, penticostPattern) ||
                contains(text, trinityPattern) || contains(text, corpusChristi);
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

            Feast a = null;
            Feast b = null;

            if (regnalYearMatcher.find()) {

                // group (2) is the feast text
                String feastText = feastMatcher.group(2).trim();

                // group (4) is the regnal year
                String regalYearMonarch = feastMatcher.group(4);

                // get the date ranges for this regnal year
                RegnalYear regnalYear = regnalYear(regnalYearMatcher);

                if (isMovableFeast(text)) {


                    PossibleFeasts possibleFeasts = new PossibleFeasts(regnalYear.toString());

                    if (contains(text, easterPattern)) {
                        a = possibleFeasts.getA().getEaster();
                        b = possibleFeasts.getB().getEaster();
                    } else if (contains(text, quinquageisimaPattern)) {
                        a = possibleFeasts.getA().getQuinquageisima();
                        b = possibleFeasts.getB().getQuinquageisima();
                    } else if (contains(text, quadrageismaPattern)) {
                        a = possibleFeasts.getA().getQuadrageisma();
                        b = possibleFeasts.getB().getQuadrageisma();
                    } else if (contains(text, rogationPattern)) {
                        a = possibleFeasts.getA().getRogation();
                        b = possibleFeasts.getB().getRogation();
                    } else if (contains(text, ascensionPattern)) {
                        a = possibleFeasts.getA().getAscension();
                        b = possibleFeasts.getB().getAscension();
                    } else if (contains(text, penticostPattern)) {
                        a = possibleFeasts.getA().getPentecost();
                        b = possibleFeasts.getB().getPentecost();
                    } else if (contains(text, trinityPattern)) {
                        a = possibleFeasts.getA().getTrinity();
                        b = possibleFeasts.getB().getTrinity();
                    } else if (contains(text, corpusChristi)) {
                        a = possibleFeasts.getA().getCorpus_christi();
                        b = possibleFeasts.getB().getCorpus_christi();
                    }

                    if (a != null && b != null) {
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
                    }

                } else {

                    String monthDay = fixedFeastLookup.lookup(feastText);
                    String yearA = regnalYear.getRegnalYearStart().getYear() + "-" + monthDay;
                    String yearB = regnalYear.getRegnalYearEnd().getYear() + "-" + monthDay;
                    a = new Feast(yearA);
                    b = new Feast(yearB);

                    // octave?
                    if (octaveMatcher.find()) {
                        if (a.getFeastOctaveDate().compareTo(regnalYear.getRegnalYearStart()) > 0) {
                            return new RegnalDateImpl(text, feastText, regalYearMonarch, a.getFeastOctaveDate());
                        } else {
                            return new RegnalDateImpl(text, feastText, regalYearMonarch, b.getFeastOctaveDate());
                        }
                        // quindene?
                    } else if (quindeneMatcher.find()) {
                        if (a.getFeastQuindeneDate().compareTo(regnalYear.getRegnalYearStart()) > 0) {
                            return new RegnalDateImpl(text, feastText, regalYearMonarch, a.getFeastQuindeneDate());
                        } else {
                            return new RegnalDateImpl(text, feastText, regalYearMonarch, b.getFeastQuindeneDate());
                        }
                        // default to the feast
                    } else {
                        if (a.getFeastDate().compareTo(regnalYear.getRegnalYearStart()) > 0) {
                            return new RegnalDateImpl(text, feastText, regalYearMonarch, a.getFeastDate());
                        } else {
                            return new RegnalDateImpl(text, feastText, regalYearMonarch, b.getFeastDate());
                        }
                    }

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
            RegnalYear regnalYear = regnalYear(regnalYearMatcher);
            return new RegnalDateAsRangeImpl(text, regnalYear, text);
        } else {
            return null;
        }
    }

    private RegnalYear regnalYear(Matcher matcher) {
        Integer regnal = normalizeRegnal(matcher.group(2));
        String monarch = normalizeMonarch(matcher.group(3));
        Integer ordinal = normalizeOrdinal(matcher.group(4));
        return dateFromRegnalDate.rangeForRegnalYear(regnal, monarch, ordinal);
    }


    private class PossibleFeasts {

        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd")
                .withChronology(GJChronology.getInstance());

        MovableFeastsForYear a;
        MovableFeastsForYear b;
        DateTime startDate;
        DateTime endDate;

        public PossibleFeasts(String regnal_date_range) {
            String[] year_range_tmp = regnal_date_range.split(":");
            String start = year_range_tmp[0];
            startDate = formatter.parseDateTime(start);
            String end = year_range_tmp[1];
            endDate = formatter.parseDateTime(end);
            a = movableFeastLookup.lookup(startDate.getYear());
            b = movableFeastLookup.lookup(endDate.getYear());
        }

        public DateTime startDate() {
            return startDate;
        }

        public MovableFeastsForYear getA() {
            return a;
        }

        public MovableFeastsForYear getB() {
            return b;
        }
    }
}
