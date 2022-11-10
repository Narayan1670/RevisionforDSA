package com.company;

public class JumpGame {
    public static void main(String[] args) {
        int[] nums = {3,2,1,0,4};
        System.out.println(condition(nums));

    }
    static boolean condition(int[] nums){
        int maxreachablepos = 0;
        for(int i = 0; i < nums.length - 1; i++){
            maxreachablepos = Math.max(maxreachablepos, i + nums[i]);
            if(i >= maxreachablepos){
                return false;
            }
        }
        return true;
    }
}
