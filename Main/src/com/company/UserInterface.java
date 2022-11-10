package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of stocks to add");
        int n = sc.nextInt();
        String[] ans = new String[n];
        ans[0] = sc.next();
//        sc.nextLine();
        for (int i = 1; i < ans.length; i++) {
            ans[i] = sc.nextLine();
        }
        System.out.println(Arrays.toString(ans));
    }
}
