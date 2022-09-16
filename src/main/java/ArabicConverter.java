public class ArabicConverter {
    public String convert(int arabicNumber) {
        String romanNumber = "";
        if(arabicNumber >= 5) {
            romanNumber = "V";
            arabicNumber = arabicNumber - 5;
        }
        for (int i = 0; i < arabicNumber ; i++) {
            romanNumber = romanNumber + "I";
        }
        return romanNumber;
    }
}
