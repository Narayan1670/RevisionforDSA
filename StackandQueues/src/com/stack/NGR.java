package com.stack;

import java.util.*;

public class NGR {
//    problem: https://leetcode.com/problems/next-greater-element-i/
    //Next Largest Element
    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        int[] temperatures = {73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(printNGR(temperatures, temperatures.length)));
//        System.out.println(Arrays.toString(nextGreaterElement(nums1,nums2)));
//        System.out.println(Arrays.toString(nextGreaterElement1(nums1,nums2)));
//        System.out.println(Arrays.toString(dailyTemperatures(temperatures)));
        System.out.println(printNGR1(temperatures));
        System.out.println(Arrays.toString(NGRstack(temperatures, temperatures.length)));

    }
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


    public static int[] printNGR(int[] arr, int n)
//    Time Complexity: O(N2)
//    Auxiliary Space: O(1)
    {
        int[] ans = new int[n];
        int nextGreater, i, j;
        for (i = 0; i < n; i++) {
            nextGreater = -1;
            for (j = i + 1; j < n; j++) {// traverse reverse fro left
                if (arr[i] < arr[j]) {// > for greater and < for smaller
                    nextGreater = arr[j];
                    break;
                }
            }
            ans[i] = nextGreater;
        }
        return ans;
    }


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
    public static List<Integer> NGRStack(int[] arr) {
//        TC: O(n)
//        SC: O(n)
        Stack<Integer> st = new Stack<>();
        List<Integer> ans = new ArrayList<>();
        for(int i = arr.length-1; i >= 0; i--) {
            if (st.isEmpty()) {
                ans.add(-1);
                st.push(arr[i]);
            } else if(!st.isEmpty()) {
                while(!st.isEmpty() && arr[i] >st.peek()) {
                    st.pop();
                }
                if(st.isEmpty()) {
                    ans.add(-1);
                } else {
                    ans.add(st.peek());
                }
                st.push(arr[i]);
            }
        }
        Collections.reverse(ans);
        return ans;
    }

    //    problem: https://leetcode.com/problems/daily-temperatures/
    public static int[] dailyTemperatures(int[] temperatures) {

        int[] result = new int[temperatures.length];
        for (int day = temperatures.length - 1; day >= 0; day--)
            for (int i = day - 1; i >= 0 && temperatures[i] < temperatures[day]; i--)
                result[i] = day - i;
        return result;
    }


    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;

        int[] foundIdx = new int[n1];

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (nums1[i] == nums2[j]) foundIdx[i] = j;
            }
        }
        System.out.println(Arrays.toString(foundIdx));
        int[] ans = new int[n1];
        int idx = 0;

        for (int i = 0; i < n1; i++) {
            for (int j = foundIdx[i] + 1; j < n2; j++) {
                if (nums2[j] > nums2[foundIdx[i]]) {
                    ans[i] = nums2[j];
                    break;
                }
            }

            if (ans[i] == 0) ans[i] = -1;
        }

        return ans;
    }
    public static int[] nextGreaterElement1(int[] nums1, int[] nums2) {
        int[] resultArray = new int[nums1.length];
        int max;
        boolean flag;
        for(int i=0;i<nums1.length;i++){
            max=-1;
            flag=false;
            for (int k : nums2) {
                if (k == nums1[i])
                    flag = true;
                else if (flag && k > nums1[i]) {
                    max = k;
                    break;
                }
            }
            resultArray[i]= max;
        }
        return resultArray;
    }
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
}
