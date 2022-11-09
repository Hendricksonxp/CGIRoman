import java.util.LinkedHashMap;
import java.util.Map;

public class RomanConversion {
    public static String convert(int arabicNumber) {

        LinkedHashMap<Integer, String> conversionTable = new LinkedHashMap<Integer, String>();
        conversionTable.put(1000,"M");
        conversionTable.put(900,"CM");
        conversionTable.put(500,"D");
        conversionTable.put(400,"CD");
        conversionTable.put(100,"C");
        conversionTable.put(90,"XC");
        conversionTable.put(50,"L");
        conversionTable.put(40,"XL");
        conversionTable.put(10,"X");
        conversionTable.put(9,"IX");
        conversionTable.put(5, "V");
        conversionTable.put(4, "IV");
        conversionTable.put(1, "I");

        int remainder = arabicNumber;
        String romanResult = "";

        for (Map.Entry<Integer, String> entry:conversionTable.entrySet()) {
            int arabic = (int) entry.getKey();
            String roman = entry.getValue();
;            while (remainder >= arabic){
                romanResult += roman;
                remainder -= arabic;
            }
        }

        return romanResult;
    }
}

