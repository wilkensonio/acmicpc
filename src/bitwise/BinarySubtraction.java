package bitwise;

public class BinarySubtraction {
    /**
     * this method subtracts two binary numbers
     * @param  binaryOne - the first binary number
     * @param  binaryTwo - the second binary number
     * @return String - the difference of the two binary numbers
     */
    public static String sub(String binaryOne, String binaryTwo) {
        int num1 = Integer.parseInt(binaryOne, 2);
        int num2 = Integer.parseInt(binaryTwo, 2);

        do {
            int barrow = (~num1 & num2);
            num1 = num1 ^ num2;
            num2 = barrow << 1;
        } while (num2 != 0);

        return Integer.toBinaryString(num1);
    }
}
