package com.company;

public class powof2 {
    public static void main(String[] args) {

        System.out.println(isPowerOfTwo(16));

    }

    static boolean isPowerOfTwo(int n) {
        return n == pow(2,n);

    }
    static int pow(int x, int N) {
        if (N == 0) return 1;
        int partialAns = pow(x,N-1);
        return x * partialAns;
    }


}
