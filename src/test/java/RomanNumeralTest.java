import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
public class RomanNumeralTest {

    @Test
    public void hookUp(){
        assertTrue(true);
    }
    @Test
    public void oneConvertsToI(){

        ArabicConverter converter = new ArabicConverter();
        String result = converter.convert(1);
        assertEquals("I", result);
    }
    @Test
    public void twoConvertsToII(){
        ArabicConverter converter = new ArabicConverter();
        String result = converter.convert(2);
        assertEquals("II", result);
    }
    @Test
    public void threeConvertsToIII(){
        ArabicConverter converter = new ArabicConverter();
        String result = converter.convert(3);
        assertEquals("III", result);
    }
    @Test
    public void fourConvertsToIV(){
        ArabicConverter converter = new ArabicConverter();
        String result = converter.convert(4);
        assertEquals("IV", result);
    }
    @Test
    public void fiveConvertsToV(){
        ArabicConverter converter = new ArabicConverter();
        String result = converter.convert(5);
        assertEquals("V", result);
    }
    @Test
    public void sixConvertsToVI(){
        ArabicConverter converter = new ArabicConverter();
        String result = converter.convert(6);
        assertEquals("VI", result);
    }
    @Test
    public void nineConvertsToIX(){
        ArabicConverter converter = new ArabicConverter();
        String result = converter.convert(9);
        assertEquals("IX", result);
    }
    @Test
    public void tenConvertsToX(){
        ArabicConverter converter = new ArabicConverter();
        String result = converter.convert(10);
        assertEquals("X", result);
    }@Test
    public void nineteenConvertsToXIX(){
        ArabicConverter converter = new ArabicConverter();
        String result = converter.convert(19);
        assertEquals("XIX", result);
    }
}
