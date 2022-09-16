import javafx.util.Pair;

public class ArabicConverter {

    public ArabicConverter(){
        conversionTable[0] = new Pair<Integer, String>(50, "L");
        conversionTable[1] = new Pair<Integer, String>(40, "XL");
        conversionTable[2] = new Pair<Integer, String>(10, "X");
        conversionTable[3] = new Pair<Integer, String>(9, "IX");
        conversionTable[4] = new Pair<Integer, String>(5, "V");
        conversionTable[5] = new Pair<Integer, String>(4, "IV");
        conversionTable[6] = new Pair<Integer, String>(1, "I");
    }
    private int workingArabic;
    private Pair conversionTable[ ]= new Pair[7];

    public String convert(int arabicNumber) {
        workingArabic = arabicNumber;
        String romanNumber = "";

        for (Pair pair:conversionTable
             ) {
            int arabic = (int) pair.getKey();
            romanNumber = processArabic(arabic, romanNumber, (String) pair.getValue());

        }

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


