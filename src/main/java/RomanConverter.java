public class RomanConverter {
    public static String convert(int numberToConvert) {
        String result = "";
        String romanValue = "";
        int arabicValue = 0;
        if (numberToConvert >= 10){
            romanValue = "X";
            arabicValue = 10;
        }
        else if (numberToConvert >= 1){
            romanValue = "I";
            arabicValue = 1;
        }
        for (int i = 0; i < numberToConvert; i+= arabicValue) {
            result += romanValue;
        }
        return result;
    }
}
