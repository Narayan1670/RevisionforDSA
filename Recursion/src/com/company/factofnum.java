package com.company;

public class factofnum {
    public static void main(String[] args) {
        System.out.println(factorial(3));
        System.out.println(addofnum(4));
    }
    static int factorial(int n) {
        if (n <= 1) {
            return n;
        }
        return n * factorial(n - 1);
    }
    static int addofnum(int n) {
        if (n <= 1) {
            return n;
        }
        return n + addofnum(n - 1);
    }
}
