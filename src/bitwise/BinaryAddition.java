package bitwise;

public class BinaryAddition {
    /**
     * this method adds two binary numbers
     * @param  binaryOne - the first binary number
     * @param  binaryTwo - the second binary number
     * @return String - the sum of the two binary numbers
     */
    public static String add(String binaryOne, String binaryTwo) {
        int num1 = Integer.parseInt(binaryOne, 2);
        int num2 = Integer.parseInt(binaryTwo, 2);
        int sum, carry;

        do {
            sum = num1 ^ num2;
            carry = (num1 & num2) << 1;
            num1 = sum;
            num2 = carry;

        } while (carry != 0);

        return Integer.toBinaryString(sum);
    }
}
