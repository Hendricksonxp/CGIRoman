public class RomanConversion {
    public static String convert(int arabicNumber) {
        int remainder = arabicNumber;
        String roman = "";

        while (remainder >= 10){
            roman += "X";
            remainder -= 10;
        }

        while (remainder >= 1){
            roman += "I";
            remainder -= 1;
        }

        return roman;
    }
}

