import static org.junit.Assert.assertEquals;

public class RomanNumeralFixture {

    public int ArabicNumber;

    public void setArabicNumber(int input){
        ArabicNumber = input;
    }

    {
        ArabicConverter converter = new ArabicConverter();
        String result = converter.convert( ArabicNumber);
        assertEquals("I", result);
    }
}
