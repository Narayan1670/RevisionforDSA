package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // find the middle element
        // check if the target  > mid :- search in right
        // otherwise search in left
        // if middle element == target ;element is the answer
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 7;

    }

    public int[] searchRange(int[] nums, int target) {
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
//    problem: Koko Eating banana
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 1000000000;

        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(canEatInTime(piles, mid, h)) right = mid - 1;
            else left = mid + 1;
        }
        return left;
    }
    public boolean canEatInTime(int[] piles, int k, int h) {
        int hours = 0;
        for(int pile : piles) {
            int div = pile / k;
            hours += div;
            if (pile % k != 0) hours++;
        }
        return hours <= h;
    }
}