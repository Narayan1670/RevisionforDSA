package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Duplicates {

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        int[] nums = {1,1};
        System.out.println(Arrays.toString(findErrorNums(nums)));
//        System.out.println(findDuplicates(arr));

    }

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();

        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        // search for first missing number
        for (int index = 0; index < nums.length; index++){
            if (nums[index] != index + 1){
                list.add(nums[index]);
            }
        }
        // case 2
        return list;
    }
    public static int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        for (int index = 0; index < nums.length; index++){
            if (nums[index] != index + 1){
                return new int[] {nums[index], index + 1};
            }
        }
        return new int[] {-1, -1};


    }

    static void swap ( int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }



}