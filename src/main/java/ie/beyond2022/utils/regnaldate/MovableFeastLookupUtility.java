package ie.beyond2022.utils.regnaldate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MovableFeastLookupUtility {

    protected Map<Integer, MovableFeastsForYear> feastsLookup;

    public MovableFeastLookupUtility() throws IOException {
        feastsLookup = new HashMap<Integer, MovableFeastsForYear>();

        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader != null) {
            InputStream is = classLoader.getResourceAsStream("movable_feasts.txt");
            if (is != null) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                while (reader.ready()) {
                    String line = reader.readLine();
                    String[] tmp = line.split(":");

                    if (tmp.length == 13) {
                        feastsLookup.put(Integer.parseInt(tmp[0]), new MovableFeastsForYear(new Feast(tmp[1]),
                                new Feast(tmp[2]), new Feast(tmp[3]), new Feast(tmp[4]), new Feast(tmp[5]),
                                new Feast(tmp[6]), new Feast(tmp[7]), new Feast(tmp[8]),  new Feast(tmp[9]),
                                new Feast(tmp[10]),  new Feast(tmp[11]), new Feast(tmp[12])));
                    }
                }
            }
        }
    }

    public MovableFeastsForYear lookup(Integer year) {
        return feastsLookup.getOrDefault(year, null);
    }
}
