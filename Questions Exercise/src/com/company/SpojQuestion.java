package com.company;

import java.util.Scanner;

public class SpojQuestion {

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n > 0){
            int x = in.nextInt();
            while(isPalindrome(x) != true){
                x++;
            }
            System.out.println(x);

        }

    }
    public static boolean isPalindrome(int x) {
        int palin=0,d=0,copy=x;
        while(x>0)
        {
            d=x%10;
            x=x/10;
            palin=palin*10+d;
        }
        if(palin==copy)
            return true;
        else
            return false;
    }
}
