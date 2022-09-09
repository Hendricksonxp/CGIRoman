public class NumberConverter {

    String roman;
    int workingNumber;

    public String toRoman(int number) {
        workingNumber = number;
        roman = "";

        createRomanString(10, "X");
        createRomanString(5, "V");
        createRomanString(4, "IV");

        return roman + theIs(new char[workingNumber]);
    }

    private void createRomanString(int currentThreshold, String currentRoman) {
        if (workingNumber >= currentThreshold)
        {
            roman += currentRoman;
            workingNumber -= currentThreshold;
        }
    }

    private static String theIs(char[] remainder) {
        return new String(remainder).replace('\0', 'I');
    }
}
