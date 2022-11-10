package com.company;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 9, 7};
        int n = arr.length;
        int[] ans  = bubble(arr, n);
        System.out.println(Arrays.toString(ans));
    }
    static int[] bubble(int[] arr, int n)
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    swap(arr, j,j + 1);
                }
            }
        }
        return arr;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}


