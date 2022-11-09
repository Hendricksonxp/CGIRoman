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

    @Disabled
    @Test
    public void tenConvertsToX(){
        String roman = RomanConversion.convert(10);
        assertEquals("X",roman);
    }
}
