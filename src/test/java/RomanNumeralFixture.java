public class RomanNumeralFixture {

    public int arabicNumber;

    public void setArabicNumber(int input){
        arabicNumber = input;
    }

    public String RomanNumber() {
        return ArabicToRomanConverter.convertToRoman(arabicNumber);
    }


}
