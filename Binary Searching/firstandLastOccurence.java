package com.company;

import java.util.Arrays;

class Solution {

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 5, 5, 5, 5};
        int target = 5;
        System.out.println(Arrays.toString(searchRange(arr, target)));
     }

    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        // check for first occurrence if target first
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }

        return ans;
    }

    static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            // find the middle element
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // ans found
                ans = mid;
                if(findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}