package com.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class NSL {
//    Nearest Smaller to left

    public static List<Integer> printNSL1(int[] arr)
//    Time Complexity: O(N2)
//    Auxiliary Space: O(1)
    {
        int n = arr.length;
        List<Integer> ans = new ArrayList<>();
        int i, j;
        boolean flag;
        for (i = 0; i < n; i++) {
            flag = false;
            for (j = i - 1; j >= 0; j--) {
                if (arr[i] > arr[j]) {
                    ans.add(arr[j]);
                    flag = true;
                    break;
                }
            }
            if(!flag) ans.add(-1);
        }
        return ans;
    }

    public static int[] printNSL(int[] arr, int n)
    //    Time Complexity: O(N2)
    //    Auxiliary Space: O(1)
    {
        int[] ans = new int[n];
        int nextGreater, i, j;
        for (i = 0; i < n; i++) {
            nextGreater = -1;
            for (j = i - 1; j >= 0; j--) {
                if (arr[i] > arr[j]) {
                    nextGreater = arr[j];
                    break;
                }
            }
            ans[i] = nextGreater;
        }
        return ans;
    }
    public static int[] NSLStack(int[] x, int n) {
//        TC: O(n)
//        SC: O(n)
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        st.push(0);
        for (int i = n-1; i >= 0; i--) {
            while(!st.isEmpty() && x[st.peek()] > x[i]) {
                ans[st.peek()] = x[i];
                st.pop();
            }
            st.push(i);
        }
        while (!st.isEmpty()) {
            ans[st.peek()] = -1;
            st.pop();
        }
        return ans;
    }
    public static int[] NSLStackIndex(int[] x, int n) {
//        TC: O(n)
//        SC: O(n)
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        for(int i=0 ;i<n ;i++){
            while(!st.isEmpty() && x[st.peek()]>=x[i]) st.pop();
            if(st.isEmpty()) ans[i]=-1;
            else ans[i]=x[st.peek()];//else ans[i]=x[st.peek()]; for finding the element
            st.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {6, 4, 10, 2, 5};
//        int[] nums = {2,4};
        System.out.println(Arrays.toString(printNSL(nums, nums.length)));
        System.out.println(printNSL1(nums));
        System.out.println(Arrays.toString(NSLStack(nums, nums.length)));
        System.out.println(Arrays.toString(NSLStackIndex(nums, nums.length)));
    }
}
