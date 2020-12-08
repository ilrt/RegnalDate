package ie.beyond2022.utils.regnaldate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Get a RegnalYear object that represents a year in a monarch's reign.
 * <p>
 * The ranges are given in a data file with entries like the following: hen-3-54:1269-10-28:1270-10-27 – which
 * says that the 54th year of the reign of King Henry III ran from 28 October 1269 until the 27 October 1270.
 * The string is delimited by colons. The first represents the monarch and is the key in the Map, while the
 * other two provide the start and end dates (as a string).
 */
public class RegnalDateLookupUtility {

    protected Map<String, RegnalYear> dateLookup;

    /**
     * Default constructor. It populates the Map with key and value pairs that represent regnal years.
     *
     * @throws IOException if it can't open the data file.
     */
    public RegnalDateLookupUtility() throws IOException {

        dateLookup = new HashMap<String, RegnalYear>();

        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader != null) {
            InputStream is = classLoader.getResourceAsStream("regnal_dates.txt");
            if (is != null) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                while (reader.ready()) {
                    String line = reader.readLine();
                    String[] tmp = line.split(":");

                    if (tmp.length == 3) {
                        dateLookup.put(tmp[0], new RegnalYear(tmp[1], tmp[2]));
                    }
                }
            }
        }
    }

    /**
     * @param lookupCode lookup code, e.g. hen-3-54.
     * @return a RegnalYear object or null.
     */
    public RegnalYear lookup(String lookupCode) {
        return dateLookup.getOrDefault(lookupCode, null);
    }

}
