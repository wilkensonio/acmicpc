package prime;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Prime {
    public static void main(String[] args) {
        System.out.println(isPrime(5));

        int[] numbers = new int[]{
                2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16,
                17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50
        };
        allPrime(numbers);
    }

    public static boolean isPrime(double n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0 && n != 2)
                return false;
        }
        return true;
    }

    public static void allPrime(int[] num) {
        List<Integer> prime = new ArrayList<>();
        for (int n : num) {
            if (isPrime(n)) {
                prime.add(n);
            }
        }
        System.out.println(prime);
    }

}
