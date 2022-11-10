package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Problems1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //int[] arr = {1, 3, 23, 9, 18, 4};
        //  swap(arr, 0, 4);
        int[] arr = new int[5];
        for(int i = 0; i < arr.length; i++ ){
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            swap(arr, start, end);
            start++;
            end--;

        }

    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;


    }
}
