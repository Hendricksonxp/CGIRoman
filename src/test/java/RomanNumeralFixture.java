import static org.junit.Assert.assertEquals;

public class RomanNumeralFixture {

    public int ArabicNumber;

    public void setArabicNumber(int input){
        ArabicNumber = input;
    }

    public String RomanNumber() {
        ArabicConverter converter = new ArabicConverter();
        return converter.convert(ArabicNumber);
    }

}
