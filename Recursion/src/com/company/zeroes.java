package com.company;

public class zeroes {
    static int ans = 0;
    static int noofzeroes(int n) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        if (rem == 0){
            ans++;
        }
        return noofzeroes(n / 10);
    }

    public static void main(String[] args) {
        noofzeroes(20304);
        System.out.println(ans);
    }
}
