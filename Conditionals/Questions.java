package com.company;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //int n = in.nextInt();
        // boolean ans = isPrime(n);
        // System.out.println(isPrime(n));
        //System.out.println(isArmStrong(n));
        // all the 3 digit number ArmStr
        for (int i = 100; i <= 999; i++){
            if (isArmStrong(i)){
                System.out.print(i + " ");
            }
        }
    }
   // prime number question:
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;

            }
            c++;
        }
       return c *c >n;
    }
    // print all the 3 digit armstrong number
    static boolean isArmStrong(int n){
        int original = n;
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem*rem*rem;
        }
        return sum == original;

    };
}


