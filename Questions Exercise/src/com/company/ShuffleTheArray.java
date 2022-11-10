package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int[] arr = {-10, 102, 3, 44, -55};
        Scanner in = new Scanner(System.in);
/*
        int T = in.nextInt();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
*/

        int[] x = shuffle(nums, 3);
        System.out.println(Arrays.toString(x));
    }

    static int[] shuffle(int[] nums, int n) {
        n = 3;
        int[] ans = new int[2 * n];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                ans[i] = nums[j];
                j++;
            } else {
                ans[i] = nums[n];
                n++;
            }
        }
        return ans;
    }
}
