import org.apache.commons.collections.OrderedMap;

import java.util.*;

public class NumberConverter {

    String roman;
    int workingNumber;

    public String toRoman(int number) {
        Map<Integer, String> numberToRoman = new LinkedHashMap<>();
        numberToRoman.put(10, "X");
        numberToRoman.put(9, "IX");
        numberToRoman.put(5, "V");
        numberToRoman.put(4, "IV");
        numberToRoman.put(1, "I");

        workingNumber = number;
        roman = "";
        for( Map.Entry<Integer,String> entry : numberToRoman.entrySet()) {
            createRomanString(entry.getKey(), entry.getValue());
        }

        return roman;
    }

    private void createRomanString(int currentThreshold, String currentRoman) {
        while (workingNumber >= currentThreshold)
        {
            roman += currentRoman;
            workingNumber -= currentThreshold;
        }
    }
}
