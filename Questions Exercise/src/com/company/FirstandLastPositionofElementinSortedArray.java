package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstandLastPositionofElementinSortedArray {
    public static void main(String[] args) {
        int[]  nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(FirstAndLastElement(nums,target)));
    }
    static int[] FirstAndLastElement(int[] nums, int target){
        int[] ans = new int[2];
        List list =  new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == target){
                list.add(i);
            }

        }
        //ans = list.toArray(ans);
        if (nums.length == 0 || target == 0 ){
            return new int[] {-1, -1};
        }
        return ans;
    }
}
