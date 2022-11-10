package com.company;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWithZeroSum {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 4, 13, -3, -10, 5};
        int n = arr.length;

        System.out.println(ZeroSumSubarray(arr, n));
//        System.out.println(ZeroSumSubarraynaive(arr, n));
    }
    static boolean ZeroSumSubarraynaive(int arr[], int n){
        for (int i = 0; i < n; i++) {
            int curr_sum = 0;
            for (int j = i; j < n; j++) {
                curr_sum += arr[j];
                if (curr_sum == 0)
                    return true;
            }
        }
        return false;
    }


    static boolean ZeroSumSubarray(int arr[],int n){
        Set<Integer> hs = new HashSet<Integer>();
        int pre_sum = 0;
        for (int i = 0; i < n; i++) {
            pre_sum = pre_sum + arr[i];
            if (hs.contains(pre_sum) == true)
                return true;
                hs.add(pre_sum);
        }
        return false;
    }

 }
