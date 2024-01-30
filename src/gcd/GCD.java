package gcd;

public class GCD {
    public static void main(String[] args) {
        System.out.println(greatestCommonDivisor(2, 4));  // 2

        System.out.println(leastCommonMultiple(2, 5)); // 10
    }

    public static int greatestCommonDivisor(int a, int b){
        if (a == 0)
            return b;
        return greatestCommonDivisor(b % a, a);
    }

    public static int leastCommonMultiple(int a, int b){
        return a * b / greatestCommonDivisor(a,b);
    }
}
