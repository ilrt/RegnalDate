package ie.beyond2022.utils.regnaldate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class EasterDateLookupUtility {

    protected Map<Integer, Feast> feastLookup;

    public EasterDateLookupUtility() throws IOException {
        feastLookup = new HashMap<Integer, Feast>();

        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader != null) {
            InputStream is = classLoader.getResourceAsStream("easter.txt");
            if (is != null) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                while (reader.ready()) {
                    String line = reader.readLine();
                    String[] tmp = line.split(":");

                    if (tmp.length == 4) {
                        feastLookup.put(Integer.parseInt(tmp[0]), new Feast(tmp[1], tmp[2], tmp[3]));
                    }
                }
            }
        }
    }

    public Feast lookup(Integer year) {
        return feastLookup.getOrDefault(year, null);
    }
}
