package prime;

import java.util.LinkedList;
import java.util.List;

public class Prime {
    public static void main(String[] args) {
        allPrime(10);
    }

    public static void allPrime(int n) { // method one
        int[] numbers = new int[n];
        List<Integer> prime = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            numbers[i] = i + 1;
        }

        for (int nm : numbers){
            System.out.print(nm);
            System.out.print(" ");
        }
    }

    // another method
}
