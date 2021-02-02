package ie.beyond2022.utils.regnaldate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

public class FixedFeastLookupUtility {

    HashMap<String, String> feastsLookup;
    Pattern saintPattern = Pattern.compile("\\bSaint\\b", Pattern.CASE_INSENSITIVE);

    public FixedFeastLookupUtility() throws IOException {

        feastsLookup = new HashMap<>();

        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader != null) {
            InputStream is = classLoader.getResourceAsStream("fixed_feasts.txt");
            if (is != null) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                while (reader.ready()) {
                    String line = reader.readLine();
                    String[] tmp = line.split(":");
                    if (tmp.length == 2) {
                        feastsLookup.put(tmp[0].toLowerCase(Locale.ROOT), tmp[1]);
                    }
                }
            }
        }
    }

    public String lookup(String feastText) {

        String lookupTmp = feastText.replaceAll("of|the|\\(|\\)", "");
        lookupTmp = lookupTmp.trim().toLowerCase(Locale.ROOT);
        lookupTmp = lookupTmp.replaceAll("\\s+", " ");
        if (saintPattern.matcher(lookupTmp).find()) {
            lookupTmp = lookupTmp.replaceAll("\\b[Ss]aint\\b", "").trim();
        }

        HashMap<String, Integer> matches = new HashMap<>();

        String[] lookupTokens = lookupTmp.split(" ");

        for (String token : lookupTokens) {
            for (String key : feastsLookup.keySet()) {
                if (key.contains(token)) {
                    int val = matches.getOrDefault(key, 0);
                    matches.put(key, val + 1);
                }
            }
        }

        Map.Entry<String, Integer> maxEntry = null;
        for (Map.Entry<String, Integer> entry : matches.entrySet()) {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) >= 0) {
                maxEntry = entry;
            }
        }

        if (maxEntry != null) {
            return feastsLookup.getOrDefault(maxEntry.getKey(), null);
        } else {
            return null;
        }

    }
}
