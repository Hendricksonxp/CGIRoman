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
}
