package com.company;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        syntax of For Loops:
         for(initialization; condition; increment/decrement) {
         body
         }
         */
        // print no. from 1 to 5
        /*
        int n = sc.nextInt();
        for (int num = 1; num <= n; num++){
            System.out.println("num"+num);
        }*/
        //while loops:
        /*
        Syntax:
        while(condition){
        //body
        }
         */
        int num = 1;
        while (num <= 5) {
            System.out.println(num);
            num += 1;

        /*
        do while syntax:
        do{
        }while(condition);
         */
        /*do {
            System.out.println(num);
            num++;
        }while(num <= 5);

         */

        }
    }
}
