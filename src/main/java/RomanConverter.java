import javafx.util.Pair;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanConverter {
    public static String convert(int numberToConvert) {
        int leftover = numberToConvert;
        String result = "";
        LinkedHashMap<Integer, String> translations = new LinkedHashMap<Integer, String>();
        translations.put(1000, "M");
        translations.put(10, "X");
        translations.put(5, "V");
        translations.put(4, "IV");
        translations.put(1, "I");

        for (Map.Entry<Integer, String> entry:translations.entrySet()
        ) {
            while (leftover >= (int) entry.getKey()) {
                result += entry.getValue();
                leftover -= (int)entry.getKey();
            }
        }
        return result;
    }
}
