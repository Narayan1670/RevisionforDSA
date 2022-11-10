package com.company;
import java.util.Arrays;


public class NumSmallThanCurrentInList {
    public static void main(String[] args) {
        int[] nums = {7,7,7,7};
        System.out.println(nums.length);
        //System.out.println(Arrays.toString(SmallThanCurr(nums)));
    }
    static int[] SmallThanCurr(int[] nums) {
        int count = 0;
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums.length;j++){
                if ( j != i && nums[j] < nums[i]){
                    count++;
                }
            }
            ans[i] = count;
            count = 0;
        }
        return ans;
    }
}
