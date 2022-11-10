package com.stack;

import java.util.Stack;

public class MaxAreaOfRectInBinaryMatrix {
//    Given a rows x cols binary matrix filled with 0's and 1's,
//    find the largest rectangle containing only 1's and return its area.

    public static int MaxAreaBinaryMatrix(char[][] nums) {
        int[] heights = new int[nums[0].length];
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                heights[j] = nums[i][j] == '1' ? heights[j]+1 : 0;
            }
            ans = Math.max(ans,maxAreaOfRectangle(heights));
        }
        return ans;
    }

    public static int maxAreaOfRectangle(int[] arr) {
        int max = 0;
        int[] left = NSLStackIndex(arr,arr.length);
        int[] right = NSRStackIndex(arr,arr.length);
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max,arr[i] * (right[i] - left[i] - 1));
        }
        return max;
    }

    public static int[] NSLStackIndex(int[] x, int n) {
//        TC: O(n)
//        SC: O(n)
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        for(int i=0 ;i<n ;i++){
            while(!st.isEmpty() && x[st.peek()]>=x[i]) st.pop();
            if(st.isEmpty()) ans[i]=-1;
            else ans[i]=st.peek();
            st.push(i);
        }
        return ans;
    }
    public static int[] NSRStackIndex(int[] x, int n) {
//        TC: O(n)
//        SC: O(n)
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        for (int i = n-1; i >= 0; i--) {
            while(!st.isEmpty() && x[st.peek()]>=x[i]) st.pop();
            if(st.isEmpty()) ans[i]=n;
            else ans[i]=st.peek();
            st.push(i);
        }
        return ans;
    }

}
