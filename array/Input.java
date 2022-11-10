package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 24;
        arr[2] = 67;
        arr[3] = 67;
        arr[4] = 90;


        // input using for loop
       //for (int i = 0; i < arr.length; i++){
       //    arr[i] = in.nextInt();
       // }
        //System.out.println(Arrays.toString(arr));
       // for (int j : arr) { // for every element in array, print the element
        //    System.out.print(j + " "); // here num represents element of the array
       // }
       // System.out.println(arr[5]); // index out of bound

        String[] str = new String[4];
        for(int i = 0; i < str.length; i++ ){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
        // modify
        str[1] = "Vishnu";
        System.out.println(Arrays.toString(str));


    }
}
