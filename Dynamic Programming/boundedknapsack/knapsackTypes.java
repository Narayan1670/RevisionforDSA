package boundedknapsack;

import java.util.ArrayList;
import java.util.List;

public class knapsackTypes {
    //0 - 1 Knapsack 6 Methods
    // 1. Subset Sum
    // 2. Equal Sum Partition
    // 3. Count of SubSet Sum
    // 4. Minimum SubSet Sum Difference
    // 5. Target Sum
    // 6. Count the number of subset with Given Difference


    public static void main(String[] args) {
        int[] wt = {2, 3, 7, 8, 10};
        int W = 11;
        boolean ans = SubSetSum(wt,W);
        System.out.println(ans);
//        int[] arr = {1, 5, 11, 5};
//        boolean ans1 = equalSumPartition(arr);
//        System.out.println(ans1);
//        int[] nums = {2, 3, 5, 6, 8, 10};
//        int ans2 = CountSubsetOfGivenSum(nums,10);
//        System.out.println(ans2);
//        int[] nums2 = {1, 6, 11, 5};
//        int ans3 = MinimumSubsetSumDifference(nums2);
//        System.out.println(ans3);
//        int[] arr1 = {9, 7, 3, 12, 7};
//        int ans4 = CountOfSubsetOfGivenDifference(arr1,14);
//        System.out.println(ans4);
    }


    static boolean SubSetSum(int[] arr, int sum) {
        int n = arr.length;
        boolean[][] t = new boolean[n+1][sum+1];
        for(int i = 0; i < n+1; i++) {
            for(int j = 0; j < sum+1; j++) {
                if(i == 0 ) {
                    t[i][j] = false;}
                if (j == 0) {
                    t[i][j] = true;
                }}}
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < sum+1; j++) {
                if (arr[i-1] <= j) {
                    t[i][j] =    t[i-1][j - arr[i-1]] || t[i-1][j];
                } else {
                    t[i][j] =  t[i-1][j];
                }
            }
        }
        return t[n][sum];
    }

    static boolean equalSumPartition(int[] arr) {
        int sum = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        if (sum % 2 != 0) {
            return false;
        }
        else {
            return SubSetSum(arr,sum/2);
        }

//        return false;
    }

    static int CountSubsetOfGivenSum(int[] nums, int sum) {
        int n = nums.length;
        int[][] t = new int[n+1][sum+1];
        for(int i = 0; i < n+1; i++) {
            for(int j = 0; j < sum+1; j++) {
                if(j == 0 ) {
                    t[i][j] = 0;}
                if (j == 0) {
                    t[i][j] = 1;
                }}}

        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < sum+1; j++) {
                if (nums[i-1] <= j) {
                    t[i][j] =    t[i-1][j - nums[i-1]] + t[i-1][j];
                } else {
                    t[i][j] =  t[i-1][j];
                }
            }
        }
        return t[n][sum];
    }

    static int MinimumSubsetSumDifference(int[] arr) {
        int range = 0;
        for (int k : arr) {
            range += k;
        }
        int n = arr.length;
        boolean[][] t = new boolean[n+1][range+1];
        for(int i = 0; i < n+1; i++) {
            for(int j = 0; j < range+1; j++) {
                if(i == 0 ) {
                    t[i][j] = false;}
                if (j == 0) {
                    t[i][j] = true;
                }}}
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < range+1; j++) {
                if (arr[i-1] <= j) {
                    t[i][j] =    t[i-1][j - arr[i-1]] || t[i-1][j];
                } else {
                    t[i][j] =  t[i-1][j];
                }
            }
        }
        List<Integer> list = new ArrayList<Integer>();


        for (int i = 0; i < t[t.length-1].length / 2; i++) {
            if (t[t.length - 1][i]) {
                list.add(i);
            }
        }
        int mn = Integer.MAX_VALUE;

        for (Integer integer : list) {
            mn = Math.min(mn, range - 2 * integer);
        }
        return mn;
    }

    static int CountOfSubsetOfGivenDifference(int[] arr, int diff) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        int sum2 = ((sum + diff) / 2);
        return CountSubsetOfGivenSum(arr, sum2);
    }

}
