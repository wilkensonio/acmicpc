package prefixSum;
import java.util.Arrays;

public class PrefixSum {
    static int[] originalArray = {4,1,2,1,8, 2, 4,5, 5};
    public static int[] resultArray() {
        int [] result = new int[originalArray.length + 1];
        result[0] = 0;
        System.out.println(Arrays.toString(originalArray));
        for (int i = 1; i < result.length; i++) {
            result[i] = result[i-1] + originalArray[i-1];
        }
        return result;
    }
}
