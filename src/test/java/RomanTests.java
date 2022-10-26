import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RomanTests {

    @Test
    public void hookUp(){
        assertTrue(true);
    }

    @Test
    public void oneConvertsToI(){
        String result = RomanConverter.convert(1);
        assertEquals("I", result);
    }

    @Test
    public void twoConvertsToII(){
        String result = RomanConverter.convert(2);
        assertEquals("II", result);
    }

    @Test
    public void threeConvertsToIII(){
        String result = RomanConverter.convert(3);
        assertEquals("III", result);
    }

    @Test
    public void tenConvertsToX(){
        String result = RomanConverter.convert(10);
        assertEquals("X", result);
    }

    @Test
    public void twentyConvertsToXX(){
        String result = RomanConverter.convert(20);
        assertEquals("XX", result);
    }

    @Test
    public void twentyoneConvertsToXXI(){
        String result = RomanConverter.convert(21);
        assertEquals("XXI", result);
    }
}
