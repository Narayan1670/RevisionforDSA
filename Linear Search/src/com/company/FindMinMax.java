package com.company;

import java.util.Arrays;

public class FindMinMax {
    public static void main(String[] args) {
        int[] arr = {-10, 102, 3, 44, -55};
        Arrays.sort(arr);
        System.out.println(arr);
       // System.out.println(min(arr));
       // System.out.println(max(arr));

    }
    static int min(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    static int max(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
