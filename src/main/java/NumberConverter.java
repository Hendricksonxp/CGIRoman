public class NumberConverter {

    public String toRoman(int number) {
        int remainder = number % 5;
        String roman = "";
        if (number >= 5)
        {
            roman += "V";
        }
        return roman + theIs(new char[remainder]);
    }

    private static String theIs(char[] remainder) {
        return new String(remainder).replace('\0', 'I');
    }
}
