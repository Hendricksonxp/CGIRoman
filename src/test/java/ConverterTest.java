import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConverterTest {

    @Test
    public void hookUp(){
        assertTrue(true);
    }

    @Test
    public void oneConvertsToI(){
        String roman = RomanConversion.convert(1);
        assertEquals("I",roman);
    }

    @Test
    public void threeConvertsToIII(){
        String roman = RomanConversion.convert(3);
        assertEquals("III",roman);
    }

    @Test
    public void fourConvertsToIV(){
        String roman = RomanConversion.convert(4);
        assertEquals("IV",roman);
    }

    @Test
    public void fiveConvertsToV(){
        String roman = RomanConversion.convert(5);
        assertEquals("V",roman);
    }

    @Test
    public void nineConvertsToIX(){
        String roman = RomanConversion.convert(9);
        assertEquals("IX",roman);
    }

    @Test
    public void tenConvertsToX(){
        String roman = RomanConversion.convert(10);
        assertEquals("X",roman);
    }


    @Test
    public void twentyThreeConvertsToXXIII(){
        String roman = RomanConversion.convert(23);
        assertEquals("XXIII",roman);
    }

    @Test
    public void seventeenFiftyFive(){
        String roman = RomanConversion.convert(1755);
        assertEquals("MDCCLV",roman);
    }
}
