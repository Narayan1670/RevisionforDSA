package com.stack;

import java.util.*;

//notice patterns in each problem

public class StackGuide {
    //Next Largest Element

    //brute-force approach
    public static List<Integer> printNGR1(int[] arr)
//    Time Complexity: O(N2)
//    Auxiliary Space: O(1)
    {
        int n = arr.length;
        List<Integer> ans = new ArrayList<>();
        int i, j;
        boolean flag;
        for (i = 0; i < n; i++) {
            flag = false;
            for (j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    ans.add(arr[j]);
                    flag = true;
                    break;
                }
            }
            if(!flag) ans.add(-1);
        }
        return ans;
    }

    //optimized sol
    public static int[] NGRstack(int[] x, int n) {
//        TC: O(n)
//        SC: O(n)
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        st.push(0);
        for (int i = 1; i < n; i++) {
            while(!st.isEmpty() && x[st.peek()] <= x[i]) {
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
    //example prob:
    //    problem: https://leetcode.com/problems/next-greater-element-i/

    public static int[] nextGreaterElementOptimized(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        Stack<Integer> stack=new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();

        for(int num: nums2){
            while(!stack.isEmpty() && num > stack.peek())
                map.put(stack.pop(), num);
            stack.push(num);
        }

        int i=0;
        for(int num : nums1)
            result[i++] = map.getOrDefault(num, -1);
        return result;
    }

    //    problem: https://leetcode.com/problems/daily-temperatures/

    public static int[] dailyTemperatures(int[] temperatures) {

        int[] result = new int[temperatures.length];
        for (int day = temperatures.length - 1; day >= 0; day--)
            for (int i = day - 1; i >= 0 && temperatures[i] < temperatures[day]; i--)
                result[i] = day - i;
        return result;
    }

    //    Nearest Greater  to Left

    //    brute force:
    public static List<Integer> printNGL1(int[] arr)
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
                if (arr[i] < arr[j]) {
                    ans.add(arr[j]);
                    flag = true;
                    break;
                }
            }
            if(!flag) ans.add(-1);
        }
        return ans;
    }

    //optimized Sol
    public static int[] NGLStack(int[] x, int n) {
//        TC: O(n)
//        SC: O(n)
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        st.push(0);
        for (int i = n-1; i >= 0; i--) {
            while(!st.isEmpty() && x[st.peek()] <= x[i]) {
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

    // optimized sol

    public static int[] NSRStack(int[] x, int n) {
//        TC: O(n)
//        SC: O(n)
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        for (int i = n-1; i >= 0; i--) {
            while(!st.isEmpty() && x[st.peek()]>=x[i]) st.pop();
            if(st.isEmpty()) ans[i]=n;
            else ans[i]=x[st.peek()];
            st.push(i);
        }
        return ans;
    }

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

    //optimized sol
    public static int[] NSLStack(int[] x, int n) {
//        TC: O(n)
//        SC: O(n)
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        for(int i=0 ;i<n ;i++){
            while(!st.isEmpty() && x[st.peek()]>=x[i]) st.pop();
            if(st.isEmpty()) ans[i]=-1;
            else ans[i]=x[st.peek()];
            st.push(i);
        }
        return ans;
    }

    //    Max Area Of Histogram
//    https://leetcode.com/problems/largest-rectangle-in-histogram/

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
// for detailed learning
// follow Aditya Verma playList
//https://www.youtube.com/playlist?list=PL_z_8CaSLPWdeOezg68SKkeLN4-T_jNHd


}
