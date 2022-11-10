package com.company;

public class MaxItemProb {
    public static void main(String[] args) {
        int[] arr = {10, 30, 23, 9, 18};
        System.out.print(max(arr) + " ");
        System.out.println(min(arr));
        System.out.println(maxRange(arr, 1, 3));
        System.out.println(minRange(arr, 1, 3));
    }

    // imagine that array is not empty
    static int max(int[] arr){
        if (arr.length == 0){
            return -1;
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++ ){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;

    }


    static int min(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++ ){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;

    }


    static int maxRange(int[] arr, int start, int end){
        if ( end > start){
            return -1;
        }
        if (arr == null){
            return -1;
        }
        int max = arr[start];
        for (int i = start; i < end; i++ ){
            if(arr[i] > max){
                max = arr[i];
              }
            }
        return max;

}
    static int minRange(int[] arr, int start, int end){
        int min = arr[start];
        for (int i = start; i < end; i++ ){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;

    }

}
