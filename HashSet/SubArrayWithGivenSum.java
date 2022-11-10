package com.company;

import java.util.*;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
//        int[] arr = {15, 2, 8, 10, -5, -8, 6};
//        int sum = 3;
        int[] arr = {23,2,6,4,7};
        int sum = 13;
        int n = arr.length;
        System.out.println(isSum(arr, n, sum));
        System.out.println(Arrays.toString(isSum1(arr, sum)));
        System.out.println(isSumNaive(arr, n , sum));
    }
    static boolean isSumNaive(int[] arr, int n, int sum){
        for (int i = 0; i < n; i++) {
            int curr_sum = 0;
            for (int j = i; j < n; j++) {
                curr_sum += arr[j];
                if (curr_sum == sum)
                    return true;
            }
        }
        return false;
    }

    static boolean isSum(int[] arr , int n, int sum){
        Set<Integer> hs = new HashSet<>();
        int pre_sum = 0;
        for (int i = 0; i < n; i++) {
            pre_sum = pre_sum + arr[i];
            if (pre_sum == sum)
                return true;
            if (hs.contains(pre_sum - sum))
                return true;
            hs.add(pre_sum);
        }
        return false;
    }
    static int[] isSum1(int[] nums, int target){
        int n = nums.length;
        int[] ans = new int[2];
        Map<Integer, Integer> s = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++){
            if (s.containsKey(target - nums[i])){
                ans[0] = i;
                ans[1] = s.get(target - nums[i]);
                return ans;
            }
            s.put(nums[i], i);
        }
        return ans;
    }


}
