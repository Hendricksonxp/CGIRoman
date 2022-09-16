public class ArabicConverter {
    public String convert(int arabicNumber) {
        String romanNumber = "";
        if(arabicNumber >= 10) {
            romanNumber = "X";
            arabicNumber -= 10;
        }
        
        if(arabicNumber >= 5) {
            romanNumber = "V";
            arabicNumber -= 5;
        } else if (arabicNumber == 4) {
            return "IV";

        }
        for (int i = 0; i < arabicNumber ; i++) {
            romanNumber = romanNumber + "I";
        }
        return romanNumber;
    }
}
