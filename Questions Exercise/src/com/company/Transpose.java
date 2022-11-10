package com.company;

import java.util.Arrays;

public class Transpose {
    public static void main(String[] args) {
        int[][] nums = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        /*
        for (int[] a : nums){
            System.out.println(Arrays.toString(a));
        }

         */
    }
    static int[][] Trans(int[][] nums){
        int count;
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums[0].length; j++){

                    count = nums[i][j];
                    nums[i][j] = nums[j][i];
                    nums[j][i] = count;

            }
        }
        return nums;
    }
}
