import java.util.LinkedHashMap;
import java.util.Map;

public class ArabicToRomanConverter {

    public static String convertToRoman(int arabicNumber) {
        StringBuilder result = new StringBuilder();
        int number = arabicNumber;
        LinkedHashMap<Integer, String> conversionMap = new LinkedHashMap<>();
        conversionMap.put(100, "C");
        conversionMap.put(90, "XC");
        conversionMap.put(50, "L");
        conversionMap.put(40, "XL");
        conversionMap.put(10, "X");
        conversionMap.put(9, "IX");
        conversionMap.put(5, "V");
        conversionMap.put(4, "IV");
        conversionMap.put(1, "I");

        for (Map.Entry<Integer, String> entry: conversionMap.entrySet()) {
            while (number >= entry.getKey()) {
                result.append(entry.getValue());
                number -= entry.getKey();
            }
        }
        return result.toString();
    }
}