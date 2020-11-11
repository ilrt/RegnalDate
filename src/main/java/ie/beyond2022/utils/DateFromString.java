package ie.beyond2022.utils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateFromString {

    DateFromRegnalDate dateFromRegnalDate = new DateFromRegnalDate();
    Map<String, Integer> months = null;
    Map<String, Integer> ordinals = null;

    Pattern pattern = Pattern.compile("(((\\d+) ([a-zA-Z]+\\.?)) ((\\d+) ([a-zA-Z]+\\.?) ([A-Z]+)))");

    public DateFromString() throws IOException {
        months = new HashMap<String, Integer>();
        months.put("jan", 1);
        months.put("feb", 2);
        months.put("mar", 3);
        months.put("apr", 4);
        months.put("may", 5);
        months.put("jun", 6);
        months.put("jul", 7);
        months.put("aug", 8);
        months.put("sep", 9);
        months.put("oct", 10);
        months.put("nov", 11);
        months.put("dec", 12);

        ordinals = new HashMap<String, Integer>();
        ordinals.put("i", 1);
        ordinals.put("ii", 2);
        ordinals.put("iii", 3);
        ordinals.put("iv", 4);
        ordinals.put("v", 5);
        ordinals.put("vi", 6);
        ordinals.put("vii", 7);
        ordinals.put("viii", 8);
    }

    public String parse(String text) {

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

            return dateFromRegnalDate.dateFromRegnal(Integer.parseInt(date), month_val, Integer.parseInt(regnal),
                    monarch, ordinal_val);
        } else {
            return "";
        }
    }

}
