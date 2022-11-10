package com.stack;

import java.util.*;

public class NSR {
//    Nearest Smaller to Right


    public static List<Integer> nearest_smaller_to_right(int[] arr) {
//    brute force:
//    TC:  O(n2)
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    ans.add(arr[j]);
                    flag = true;
                    break;
                }
            }
            if (!flag) ans.add(-1);
        }
        return ans;
    }
    public static int[] nearest_smaller_to_right1(int[] arr) {
//    Time Complexity: O(N2)
//    Auxiliary Space: O(1)
        int n = arr.length;
        int[] ans = new int[n];
        int nextGreater, i, j;
        for (i = 0; i < n; i++) {
            nextGreater = -1;
            for (j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    nextGreater = arr[j];
                    break;
                }
            }
            ans[i] = nextGreater;
        }
        return ans;
    }
//    optimized sol
    public static List<Integer> optimizedSol(int[] arr) {
        Stack<Integer> st = new Stack<>();
        List<Integer> ans = new ArrayList<>();

        int n = arr.length;
        for(int i = n-1; i >= 0; i--) {
            if(st.isEmpty()) {
                ans.add(-1);
//            } else if(st.size() > 0 &&st.peek() > arr[i]) {
            } else if(st.peek() < arr[i]) {
                ans.add(st.peek());
            } else if(st.size() > 0 && st.peek() >= arr[i]){
                while (st.size() > 0 && st.peek() >= arr[i]) {
                    st.pop();
                }
                if(st.isEmpty()) {
                    ans.add(-1);
                } else {
                    ans.add(st.peek());
                }
            }
            st.push(arr[i]);
        }
        Collections.reverse(ans);
        return ans;
    }
    public static int[] NSRStack(int[] x, int n) {
//        TC: O(n)
//        SC: O(n)
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        st.push(0);
        for (int i = 1; i < n; i++) {
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
        int[] arr = {6, 4, 10, 2, 5};
        System.out.println(nearest_smaller_to_right(arr));
        System.out.println(optimizedSol(arr));
        System.out.println(Arrays.toString(NSRStack(arr, arr.length)));
        System.out.println(Arrays.toString(NSRStackIndex(arr, arr.length)));
    }
}
