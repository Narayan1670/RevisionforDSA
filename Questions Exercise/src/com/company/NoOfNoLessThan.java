package com.company;

import java.util.Arrays;

public class NoOfNoLessThan {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));

    }
     static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        int j = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            for (int k = 0; j < nums.length ; j++){
                if (nums[i] > nums[k]){
                    count++;
                }

            }ans[i] = count;
        }
        return ans;
    }
}
