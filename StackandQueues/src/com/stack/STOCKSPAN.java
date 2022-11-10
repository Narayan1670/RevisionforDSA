package com.stack;

import java.util.Arrays;
import java.util.Stack;

public class STOCKSPAN {
//    similar to NGL

    public static int[] NGLStack(int[] x, int n) {
//        TC: O(n)
//        SC: O(n)
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        st.push(0);
        for (int i = n-1; i >= 0; i--) {
            while(!st.isEmpty() && x[st.peek()] <= x[i]) {
                ans[st.peek()] = i;// instead of element, we stored the index of NGL
                st.pop();
            }
            st.push(i);
        }
        while (!st.isEmpty()) {
            ans[st.peek()] = -1;
            st.pop();
        }

        for (int i = 0; i < ans.length; i++) {
            ans[i] = i - ans[i];// i - index of NGL
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {100,  80, 60, 70, 60, 75, 85};
        System.out.println(Arrays.toString(NGLStack(nums, nums.length)));
    }
    public static int[] NSLStackIndex(int[] x, int n) {
//        TC: O(n)
//        SC: O(n)
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        for(int i=n-1 ;i>=0 ;i--){
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
        st.push(0);
        for (int i = n-1; i >= 0; i--) {
            while(!st.isEmpty() && x[st.peek()]>=x[i]) st.pop();
            if(st.isEmpty()) ans[i]=n;
            else ans[i]=st.peek();
            st.push(i);
        }
        return ans;
    }
}
