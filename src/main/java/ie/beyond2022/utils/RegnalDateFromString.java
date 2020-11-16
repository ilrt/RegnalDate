package ie.beyond2022.utils;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RegnalDateFromString {

    DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();

    Map<String, Integer> months = Stream.of(new Object[][]{
            {"jan", 1}, {"feb", 2}, {"mar", 3}, {"apr", 4}, {"may", 5}, {"jun", 6},
            {"jul", 7}, {"aug", 8}, {"sep", 9}, {"oct", 10}, {"nov", 11}, {"dec", 12}
    }).collect(Collectors.toMap(data -> (String) data[0], data -> (Integer) data[1]));

    Map<String, Integer> ordinals = Stream.of(new Object[][]{
            {"i", 1}, {"ii", 2}, {"iii", 3}, {"iv", 4}, {"v", 5}, {"vi", 6}, {"vii", 7}, {"viii", 8}
    }).collect(Collectors.toMap(data -> (String) data[0], data -> (Integer) data[1]));

    Pattern pattern = Pattern.compile("(((\\d+) ([a-zA-Z]+\\.?)) ((\\d+) ([a-zA-Z]+\\.?) ([A-Z]+)))");

    public RegnalDateFromString() throws IOException {
    }

    public RegnalDate parse(String text) {

        Matcher m = pattern.matcher(text);
        if (m.matches()) {

            // date
            String date = m.group(3);

            // month
            String month = m.group(4).toLowerCase();
            month = month.substring(0, 3);
            int month_val = months.get(month);

            // regnal
            String regnal = m.group(6);

            // monarch
            String monarch = m.group(7).toLowerCase().substring(0, 3);

            // ordinal
            String ordinal = m.group(8).toLowerCase();
            Integer ordinal_val = ordinals.get(ordinal);

            LocalDate dateObj = dateFromRegnalDate.dateFromRegnal(Integer.parseInt(date), month_val, Integer.parseInt(regnal),
                    monarch, ordinal_val);
            return new RegnalDate(text, dateObj);
        } else {
            return null;
        }
    }

}
