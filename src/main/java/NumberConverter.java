public class NumberConverter {

    public String toRoman(int number) {
        return new String(new char[number]).replace('\0', 'I');
    }
}
