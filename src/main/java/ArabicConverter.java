public class ArabicConverter {
    private int workingArabic;

    public String convert(int arabicNumber) {
        workingArabic = arabicNumber;
        String romanNumber = "";
        while (workingArabic > 0) {
            romanNumber = processArabic(10, romanNumber, "X");
            romanNumber = processArabic(9, romanNumber, "IX");
            romanNumber = processArabic(5, romanNumber, "V");
            romanNumber = processArabic(4, romanNumber, "IV");
            romanNumber = processArabic(1, romanNumber, "I");
        }
        return romanNumber;
    }

    private String processArabic(int arabicNumber, String result, String romanNumber) {

        if (workingArabic >= arabicNumber) {
            result += romanNumber;
            workingArabic -= arabicNumber;
        }
        return result;
    }
}


