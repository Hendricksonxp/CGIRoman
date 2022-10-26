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
}
