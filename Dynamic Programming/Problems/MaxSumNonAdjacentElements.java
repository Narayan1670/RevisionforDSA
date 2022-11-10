package Problems;

import java.util.Scanner;

public class MaxSumNonAdjacentElements {
//    1. You are given a number n, representing the count of elements.
//    2. You are given n numbers, representing n elements.
//    3. You are required to find the maximum sum of a subsequence with no adjacent elements.
//    I/P: 5 10 10 100 5 6
//    O/P: 116

    // Greedy Problem
//    https://leetcode.com/problems/house-robber/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        int inc = arr[0];
        int exc = 0;

        for (int i = 1; i < arr.length; i++) {
            int ninc = exc + arr[i];
            int nexc = Math.max(inc,exc);

            inc = ninc;
            exc = nexc;
        }
        int ans = Math.max(inc,exc);
        System.out.println(ans);

//        I/P:
//        6
//        5
//        10
//        10
//        100
//        5
//        6
//        O/P:
//        116

    }
}
