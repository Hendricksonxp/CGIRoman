import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConverterTest {

    @Test
    public void hookUp(){
        assertTrue(true);
    }

    @Test
    public void OneConvertsToI(){
        String roman = RomanConversion.convert(1);
        assertEquals("I",roman);
    }
}
