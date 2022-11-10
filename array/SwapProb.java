package com.company;

import java.util.Arrays;

public class SwapProb {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18, 4};
      //  swap(arr, 0, 4);
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