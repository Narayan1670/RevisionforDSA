package com.company;
//Q:- Given an Array of integers n and a positive number K,
//find the maximum sum of any contagious subArray of size k.

public class MaximumSumOfanyArray {
    public static void main(String[] args) {
        int[] arr = {1, 9, -1, -2, 7, 3, -1, 2};
        int size = 4;
        System.out.println(SubArrayWithMaximumSum(arr,size));
    }
    static int SubArrayWithMaximumSum(int[] arr, int size){
        int windowSum = 0, maxSum = 0;
        int start = 0, end = 0;
        while(end < size){
            windowSum += arr[end++];
        }
        while (end < arr.length){
            windowSum += arr[end++] - arr[start++];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }
}
