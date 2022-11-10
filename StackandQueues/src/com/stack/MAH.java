package com.stack;

import java.util.Stack;

public class MAH {
//    Max Area Of Histogram

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

    public static void main(String[] args) {
        int[] heights = {2,1,5,6,2,3};
        System.out.println(maxAreaOfRectangle(heights));
        int[] num1 = {6, 2, 5, 4, 5, 1, 6};
        System.out.println(maxAreaOfRectangle(num1));
        int[] nums = {2,4};
        System.out.println(maxAreaOfRectangle(nums));
    }

}
