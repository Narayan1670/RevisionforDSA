package com.company;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        int[] ans = new int[5];
        Scanner in = new Scanner(System.in);
        String str = in.next();
        if (isPalindrome(str))
            System.out.print("Yes");
        else
            System.out.print("No");

    }
    public static boolean isPalindrome(String str)
    {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
