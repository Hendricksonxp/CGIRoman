import javafx.util.Pair;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Map;

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
    public void fourConvertsToIV(){
        String result = RomanConverter.convert(4);
        assertEquals("IV", result);
    }

    @Test
    public void fiveConvertsToV(){
        String result = RomanConverter.convert(5);
        assertEquals("V", result);
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
    @Test
    public void thirtySevenConvertsToXXXVII(){
        String result = RomanConverter.convert(37);
        assertEquals("XXXVII", result);
    }
    @Test
    public void twentyTwentyTwo(){
        String result = RomanConverter.convert(2022);
        assertEquals("MMXXII", result);
    }

    @Test
    public void linedHashMapExploration(){

        int leftover = 37;
        String result = "";
        LinkedHashMap<Integer, String> translations = new LinkedHashMap<Integer, String>();
        translations.put(1000, "M");
        translations.put(10, "X");
        translations.put(5, "V");
        translations.put(4, "IV");
        translations.put(1, "I");
        
        for (Map.Entry<Integer, String> entry:translations.entrySet()
             ) {
            while (leftover >= (int) entry.getKey()) {
                result += entry.getValue();
                leftover -= (int)entry.getKey();
            }
        }
            assertEquals("XXXVII", result);
    }
}
