public class ArabicConverter {
    private int workingArabic;

    public String convert(int arabicNumber) {
        workingArabic = arabicNumber;
        String romanNumber = "";
        romanNumber = processArabic(10, romanNumber, "X");
        romanNumber = processArabic(9, romanNumber, "IX");
        romanNumber = processArabic(5, romanNumber, "V");
        romanNumber = processArabic(4, romanNumber, "IV");

        for (int i = 0; i < workingArabic ; i++) {
            romanNumber = romanNumber + "I";
        }
        return romanNumber;
    }

    private String processArabic(int arabicNumber, String result, String romanNumber) {
        if(workingArabic >= arabicNumber) {
            result += romanNumber;
            workingArabic -= arabicNumber;
        }
        return result;
    }
}


