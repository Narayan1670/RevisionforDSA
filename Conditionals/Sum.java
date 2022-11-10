package com.company;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // sum();
        /*int ans = sum2();
        System.out.println(ans);
        */
        int ans = sum3(20,30);
        System.out.println(ans);
    }

    static int sum3(int a, int b){
        int sum = a + b;
        return sum;
    }


    static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first Number");
        int num1 = in.nextInt();
        System.out.print("Enter second Number");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;
    }


    static void sum() {
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;
        System.out.print("Enter first Number");
        num1 = in.nextInt();
        System.out.print("Enter second Number");
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.println("The sum is " + sum);


    }
}

