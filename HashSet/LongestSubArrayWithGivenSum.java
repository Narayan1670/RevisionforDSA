package com.company;

import java.util.HashSet;

public class LongestSubArrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,1,2,1};
        int sum = 3;
        int n = arr.length;
        System.out.println(maxLen(arr, n, sum));

    }
//    naive solution O(nsquare)
//    static int maxLen(int[] arr, int n, int sum){
//        int res = 0;
//        for (int i = 0; i < n; i++){
//            int curr_sum = 0;
//            for (int j = i; j < n; j++){
//                curr_sum += arr[j];
//                if (curr_sum == sum)
//                    res = Math.max(res, j - i + 1);
//
//            }
//        }
//        return res;
//    }
static int maxLen(int arr[], int n, int sum) {
    int prefix_sum = 0;
    HashSet<Integer> us = new HashSet<>();
    us.add(0);
    for (int i = 0; i < n; i++) {
        prefix_sum += arr[i];
        if (us.contains(prefix_sum - sum))
            return 1;
        us.add(prefix_sum);
    }
    return 0;
}
}
