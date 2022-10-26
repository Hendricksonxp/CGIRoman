import javafx.util.Pair;

public class RomanConverter {
    public static String convert(int numberToConvert) {
        int leftover = numberToConvert;
        String result = "";
        Pair translations[] = new Pair[2];
        translations[0] = new Pair<Integer, String > (10, "X");
        translations[1] = new Pair<Integer, String > (1, "I");

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
