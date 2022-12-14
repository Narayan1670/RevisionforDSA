package com.company;

public class CheckIfGoodArray {
    public static void main(String[] args) {
        int[] nums = {29,6,10};
        System.out.println(isGoodArray(nums));

    }
    static boolean isGoodArray(int[] nums) {
        int n = nums.length;
        if (n == 0 || nums == null) {
            return false;
        }

        int k = nums[0];
        for (int i = 0; i < nums.length; i++) {
            k = GCD(k, nums[i]);
            if (k == 1) {
                return true;
            }
        }
        return false;
    }



    static int GCD(int m, int n) {
        if (m < n) {
            return GCD(n, m);
        }

        while (n != 0) {
            int k = m % n;
            m = n;
            n = k;
        }
        return m;
    }
}
