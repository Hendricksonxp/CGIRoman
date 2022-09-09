public class NumberConverter {

    String roman;
    int workingNumber;

    public String toRoman(int number) {
        workingNumber = number;
        roman = "";

        createRomanString(10, "X");
        createRomanString(5, "V");
        createRomanString(4, "IV");
        createRomanString(1, "I");

        return roman;
    }

    private void createRomanString(int currentThreshold, String currentRoman) {
        while (workingNumber >= currentThreshold)
        {
            roman += currentRoman;
            workingNumber -= currentThreshold;
        }
    }
}
