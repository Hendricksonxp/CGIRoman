import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class RomanNumeralTest {

    @Test
    public void hookUp(){
        assertTrue(true);
    }

    @Test
    public void oneConvertToI() {
        NumberConverter converter = new NumberConverter();
        String result = converter.toRoman(1);
        assertEquals("I", result);
    }

    @Test
    public void twoConvertToII() {
        NumberConverter converter = new NumberConverter();
        String result = converter.toRoman(2);
        assertEquals("II", result);
    }

    @Test
    public void threeConvertToIII() {
        NumberConverter converter = new NumberConverter();
        String result = converter.toRoman(3);
        assertEquals("III", result);
    }
}
