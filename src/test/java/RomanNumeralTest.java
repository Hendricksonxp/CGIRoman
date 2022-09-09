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

    @Test
    public void fourConvertToIV() {
        NumberConverter converter = new NumberConverter();
        String result = converter.toRoman(4);
        assertEquals("IV", result);
    }

    @Test
    public void fiveConvertToV() {
        NumberConverter converter = new NumberConverter();
        String result = converter.toRoman(5);
        assertEquals("V", result);
    }

    @Test
    public void sixConvertToVI() {
        NumberConverter converter = new NumberConverter();
        String result = converter.toRoman(6);
        assertEquals("VI", result);
    }

    @Test
    public void nineConvertToIX() {
        NumberConverter converter = new NumberConverter();
        String result = converter.toRoman(9);
        assertEquals("IX", result);
    }

    @Test
    public void elevenConvertToXI() {
        NumberConverter converter = new NumberConverter();
        String result = converter.toRoman(11);
        assertEquals("XI", result);
    }

    @Test
    public void twentyConvertToXX() {
        NumberConverter converter = new NumberConverter();
        String result = converter.toRoman(20);
        assertEquals("XX", result);
    }

    @Test
    public void fortyNineConvertToXLIX() {
        NumberConverter converter = new NumberConverter();
        String result = converter.toRoman(49);
        assertEquals("XLIX", result);
    }

    @Test
    public void fiftyConvertToL() {
        NumberConverter converter = new NumberConverter();
        String result = converter.toRoman(50);
        assertEquals("L", result);
    }

    @Test
    public void ninetyConvertToXC() {
        NumberConverter converter = new NumberConverter();
        String result = converter.toRoman(90);
        assertEquals("XC", result);
    }

    @Test
    public void oneHundredConvertToC() {
        NumberConverter converter = new NumberConverter();
        String result = converter.toRoman(100);
        assertEquals("C", result);
    }

    @Test
    public void fiveHundredConvertToD() {
        NumberConverter converter = new NumberConverter();
        String result = converter.toRoman(500);
        assertEquals("D", result);
    }

    @Test
    public void oneThousandConvertToM() {
        NumberConverter converter = new NumberConverter();
        String result = converter.toRoman(1000);
        assertEquals("M", result);
    }

    @Test
    public void thisYearConvertToMMXXII() {
        NumberConverter converter = new NumberConverter();
        String result = converter.toRoman(2022);
        assertEquals("MMXXII", result);
    }
}
