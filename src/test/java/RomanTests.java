import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RomanTests {
    // What happens if we get a zero?

    @Test
    public void hookUp() {
        assertTrue(true);
    }
    @Test
    public void oneReturnsI() {
        String result = ArabicToRomanConverter.convertToRoman(1);
        assertEquals("I", result);
    }
    @Test
    public void twoReturnsII(){
        String result = ArabicToRomanConverter.convertToRoman(2);
        assertEquals("II", result);
    }
    @Test
    public void threeReturnsIII(){
        String result = ArabicToRomanConverter.convertToRoman(3);
        assertEquals("III", result);
    }
    @Test
    public void fourReturnsIV(){
        String result = ArabicToRomanConverter.convertToRoman(4);
        assertEquals("IV", result);
    }
    @Test
    public void fiveReturnsV(){
        String result = ArabicToRomanConverter.convertToRoman(5);
        assertEquals("V", result);
    }
    @Test
    public void nineReturnsIX(){
        String result = ArabicToRomanConverter.convertToRoman(9);
        assertEquals("IX", result);
    }
    @Test
    public void tenReturnsX(){
        String result = ArabicToRomanConverter.convertToRoman(10);
        assertEquals("X", result);
    }
    @Test
    public void twentyReturnsXX(){
        String result = ArabicToRomanConverter.convertToRoman(20);
        assertEquals("XX", result);
    }
    @Test
    public void thirtyReturnsXXX(){
        String result = ArabicToRomanConverter.convertToRoman(30);
        assertEquals("XXX", result);
    }
    @Test
    public void thirtyEightReturnsXXXVIII(){
        String result = ArabicToRomanConverter.convertToRoman(38);
        assertEquals("XXXVIII", result);
    }
}