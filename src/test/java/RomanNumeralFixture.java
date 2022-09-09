public class RomanNumeralFixture {

    public int ArabicNumber;

    public void setArabicNumber(int input){
        ArabicNumber = input;
    }
    public String RomanNumber()
    {
        NumberConverter converter = new NumberConverter();
        return converter.toRoman(ArabicNumber);
    }
}
