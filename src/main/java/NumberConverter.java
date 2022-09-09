public class NumberConverter {

    String roman;
    int workingNumber;

    public String toRoman(int number) {
        workingNumber = number;
        roman = "";

        // createRomanString(20, theIs(new char[20 % 10], 'X'));
        while (workingNumber >= 10)
            createRomanString(10, "X");
        createRomanString(5, "V");
        createRomanString(4, "IV");
        while (workingNumber >= 1)
            createRomanString(1, "I");

        return roman;
    }

    private void createRomanString(int currentThreshold, String currentRoman) {
        if (workingNumber >= currentThreshold)
        {
            roman += currentRoman;
            workingNumber -= currentThreshold;
        }
    }
}
