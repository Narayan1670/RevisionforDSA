package LIS;

import java.util.HashMap;

public class LongestIncreasingSubsequence {
//    public static int lis(int[] arr, int n) {
//
//    }
    public static boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0,-1);
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
            int r = k == 0? total : total % k;
            if (hm.containsKey(r) && i-hm.get(r)>1) return true;
            hm.putIfAbsent(r,i);
        }
    return false;
    }

    public static void main(String[] args) {
//        int[] nums = {23,2,6,4,7};
        int[] nums = {0};
        int k = 1;
        System.out.println(checkSubarraySum(nums,k));
    }
}
