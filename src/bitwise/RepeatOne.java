package bitwise;

public class RepeatOne {
    /**
     * this method finds the number that is not repeated in the array
     * in the array [4,1,2,1,2] the number 4 is not repeated
     * @param  arr - the int array of numbers
     * @return int - the number that is not repeated in the array
     */
    public static int repeatNumber(int[] arr) {
        int xor = 0;
        for (int item : arr) {
            xor ^= item;
        }
        return xor;
    }
}
