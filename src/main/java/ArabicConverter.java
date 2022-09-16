public class ArabicConverter {
    private int workingArabic;

    public String convert(int arabicNumber) {
        workingArabic = arabicNumber;
        String romanNumber = "";

        romanNumber = processArabic(50, romanNumber, "L");
        romanNumber = processArabic(40, romanNumber, "XL");
        romanNumber = processArabic(10, romanNumber, "X");
        romanNumber = processArabic(9, romanNumber, "IX");
        romanNumber = processArabic(5, romanNumber, "V");
        romanNumber = processArabic(4, romanNumber, "IV");
        romanNumber = processArabic(1, romanNumber, "I");

        return romanNumber;
    }

    private String processArabic(int arabicNumber, String result, String romanNumber) {
        while (workingArabic >= arabicNumber) {
            result += romanNumber;
            workingArabic -= arabicNumber;
        }
        return result;
    }
}


