import javafx.util.Pair;

public class RomanConverter {
    public static String convert(int numberToConvert) {
        int leftover = numberToConvert;
        String result = "";
        Pair translations[] = new Pair[5];
        translations[0] = new Pair<Integer, String > (1000, "M");
        translations[1] = new Pair<Integer, String > (10, "X");
        translations[2] = new Pair<Integer, String > (5, "V");
        translations[3] = new Pair<Integer, String > (4, "IV");
        translations[4] = new Pair<Integer, String > (1, "I");

        for (Pair pair:translations
             ) {
            while (leftover >= (int) pair.getKey()) {
                result += pair.getValue();
                leftover -= (int)pair.getKey();
            }
        }
        return result;
    }
}
