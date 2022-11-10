package com.company;

public class HouseRobber {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(loot(nums));

    }
    static int loot(int[] nums){
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(i % 2 == 0){
                count += nums[i];
            }
        }
        return count;
    }
}
