public class NumberConverter {

    public String toRoman(int number) {
        int workingNumber = number;
        String roman = "";

        int currentThreshold = 10;
        if (workingNumber >= currentThreshold)
        {
            roman += "X";
            workingNumber -= currentThreshold;
        }

        currentThreshold = 5;
        if (workingNumber >= currentThreshold)
        {
            roman += "V";
            workingNumber -= currentThreshold;
        }

        return roman + theIs(new char[workingNumber]);
    }

    private static String theIs(char[] remainder) {
        return new String(remainder).replace('\0', 'I');
    }
}
