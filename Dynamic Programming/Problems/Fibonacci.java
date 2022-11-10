package Problems;

import java.util.Arrays;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fibRecur(10));
        int n = 10;
        System.out.println(fibMemoized(n,new int[n + 1]));

    }
    public static int fibRecur(int n) {
        if(n == 0 || n == 1) return n;
        return fibRecur(n-1) + fibRecur(n-2);
    }
    public static int fibMemoized(int n, int[] qb) {
        if (n == 0 || n == 1) return n;
        if (qb[n] != 0) return qb[n];
        qb[n] = fibMemoized(n-1,qb) + fibMemoized(n-2, qb);
        return fibMemoized(n-1,qb) + fibMemoized(n-2, qb);
    }
}
