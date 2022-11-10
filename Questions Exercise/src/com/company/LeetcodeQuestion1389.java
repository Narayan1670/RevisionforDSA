package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetcodeQuestion1389 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] ans = createTargetArray(nums, index);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] createTargetArray(int[] nums, int[] index) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) list.add(index[i], nums[i]);
        // List to Array Conversion
        int i = 0;
        while (i < nums.length) {
            nums[i] = list.get(i);
            i++;
        }
        return nums;

    }
}
