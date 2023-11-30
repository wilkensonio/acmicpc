package bitwise;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        String b1 = "1101";
        String b2 = "10";

        System.out.printf("Add %s %s –> %s \n",
                b1, b2,
                BinaryAddition.add(b1, b2));

        System.out.printf("Sub %s %s –> %s \n",
                b1, b2,
                BinarySubtraction.sub(b1, b2));

        int[] arr = {4,1,2,1,8, 2, 4,5, 5};
        System.out.printf("non-repeated number  %s –> %d \n",
                 Arrays.toString(arr),
                RepeatOne.repeatNumber(arr));
    }
}