package Problems;

import javax.swing.plaf.metal.MetalTabbedPaneUI;
import java.util.Arrays;
import java.util.Scanner;

public class ClimbStairs {
//    problem 1:
//    I/P: A number n
//    O/P: A number representing the number of ways to climb the stairs from 0 to top.
//    1. You are given a number n, representing the number of stairs in a staircase.
//    2. You are on the 0th step and are required to climb to the top.
//    3. In one move, you are allowed to climb 1, 2 or 3 stairs.
//    4. You are required to print the number of different paths via which you can climb to the top.

    public static int countPathRecur(int n) {
        if(n == 0 || n == 1 ) return 1;
        if (n == 2) return n;

        return countPathRecur(n-1) + countPathRecur(n-2) + countPathRecur(n-3);
    }
    public static int countPathMemoized(int n, int[] dp) {
        if(n == 0 || n == 1 ) return 1;
        if (n == 2) return n;
        if(dp[n] > 0) return dp[n];
        dp[n] = countPathMemoized(n-1,dp) + countPathMemoized(n-2,dp) + countPathMemoized(n-3,dp);
        return countPathMemoized(n-1,dp) + countPathMemoized(n-2,dp) + countPathMemoized(n-3,dp);
    }
    public static int countPathTabular(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        for(int i = 1; i < n+ 1; i++) {
            if (i == 1){
                dp[i] = dp[i-1];
            } else if(i == 2){
                dp[i] = dp[i-1] + dp[i-2];
            } else {
                dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
            }
        }
        return dp[n];
//        TC: O(n)
//        SC: O(n)
    }
//    problem 2:
//    Climb Stairs With Variable Jumps
//    1. You are given a number n, representing the number of stairs in a staircase.
//    2. You are on the 0th step and are required to climb to the top.
//    3. You are given n numbers, where ith element's value represents - till how far from the step you
//    could jump to in a single move.
//    4. You can of course jump fewer number of steps in the move.
//    5. You are required to print the number of different paths via which you can climb to the top.
    public static int func(int[] arr) {
        int n = arr.length;
        int[] dp = new int[n + 1];
        dp[n] = 1;

        for (int i = n-1; i >= 0; i--) {
            for (int j = i+1; j <= Math.min(n, i + arr[i]); j++) {
                dp[i] += dp[j];
            }
        }
        return dp[0];
//        TC: O(nsquare)
//        SC: O(n)
    }
    public static int countPathsRecVarPath(int[] arr, int index, int len) {
        if (index == len) {
            return 1;
        }
        int count = 0;
        for (int jump = 1; jump <= arr[index]; jump++) {
            if ((jump + index) <= len) {
                count += countPathsRecVarPath(arr, jump + index, len);
            } else {
                break;
            }
        }
        return count;
    }

//    Problem 3:
//    Climb Stairs With Minimum Moves
//    1. You are given a number n, representing the number of stairs in a staircase.
//    2. You are on the 0th step and are required to climb to the top.
//    3. You are given n numbers, where ith element's value represents - till how far from the step you
//    could jump to in a single move.  You can of-course fewer number of steps in the move.
//    4. You are required to print the number of minimum moves in which you can reach the top of staircase.
//    Note -> If there is no path through the staircase print null.
    public static int countPathMinMoves(int[] arr) {
        Integer[] dp = new Integer[arr.length + 1];
        dp[arr.length] = 0;

        for(int i = arr.length-1; i >= 0; i--) {
            if (arr[i] > 0) {
                int min = Integer.MAX_VALUE;

                for (int j = 1; j <= arr[i]; j++) {
                    if (dp[i+j] != null)
                        min = Math.min(min,dp[i+j]);
                }
                if(min != Integer.MAX_VALUE){
                    dp[i] = min + 1;
                }
            }
        }
        return dp[0];
//        TC: O(nsquare)
//        SC: O(n)
    }

//    Problem 4:
//    https://leetcode.com/problems/minimum-path-sum/
    public int minPathSum(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;

        int[][] dp = new int[row][col];

        for (int i = dp.length - 1; i >= 0 ; i--) {
            for (int j = dp[0].length-1; j >= 0 ; j--) {
                if(i == dp.length-1 && j == dp.length-1){
                    dp[i][j] = arr[i][j];
                } else if (i == dp.length-1) {
                    dp[i][j] = dp[i][j+1] + arr[i][j];
                } else if(j == dp[0].length-1) {
                    dp[i][j] = dp[i+1][j] + arr[i][j];
                } else {
                    dp[i][j] = Math.min(dp[i+1][j], dp[i][j+1]) + arr[i][j];
                }
            }
        }
        return dp[0][0];
    }


    public static void main(String[] args) {
//        System.out.println(countPathRecur(10));
//        int n = 10;
//        System.out.println(countPathMemoized(n,new int[n+1]));
//        System.out.println(countPathTabular(10));
//        int[] arr = {10,3,3,0,2,1,2,4,2,0,0};
//        System.out.println(func(arr));
//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = scn.nextInt();
//        }
//        int paths = countPathsRecVarPath(arr, 0, n);
//        System.out.println(paths);
//        scn.close();
//        int n = 10;
//        Integer[] arr = new Integer[n];
//        System.out.println(Arrays.toString(arr));


    }

}
