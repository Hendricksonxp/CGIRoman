public class RomanConversion {
    public static String convert(int arabicNumber) {
        String roman = "";
        for (int i = 0; i < arabicNumber; i++) {
            roman += "I";
        }
        return roman;
    }
}

