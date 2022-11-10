package com.stack;

import java.util.Arrays;

public class TrappingRainWater {
    public static int trapOpt(int[] heights) {
        int l = 0;
        int r = heights.length-1;
        int leftMax = 0;
        int rightMax = 0;
        int res = 0;

        while(l <= r) {
            if (heights[l] <= heights[r]) {
                if (heights[l] >= leftMax) leftMax = heights[l];
                else res += leftMax - heights[l];
                l++;
            }
            else {
                if (heights[r] >= rightMax) rightMax = heights[r];
                else
                    res += rightMax - heights[r];
                    r--;
            }
        }
        return res;
    }

    public static int trap(int[] heights) {
        int ans = 0;
        int[] water = new int[heights.length];
        int[] mxl = maxL(heights);
        System.out.println(Arrays.toString(mxl));
        int[] mxr = maxR(heights);
        System.out.println(Arrays.toString(mxr));
        for (int i = 0; i < water.length; i++) {
//            System.out.print(ans + " ");
//            System.out.print(Math.min(mxl[i],mxr[i]) + " ");
            ans += Math.min(mxl[i],mxr[i]) - heights[i];
        }
//        System.out.println();
//        for (int i = 0; i < water.length; i++) {
//            ans += water[i];
//        }
        return ans;
    }

    public static int[] maxL(int[] arr) {
        int[] ans = new int[arr.length];
        ans[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            ans[i] = Math.max(ans[i-1], arr[i]);
        }
        return ans;
    }
    public static int[] maxR(int[] arr) {
        int[] ans = new int[arr.length];
        ans[arr.length-1] = arr[arr.length-1];
        for (int i = arr.length - 2; i >= 0; i--) {
            ans[i] = Math.max(ans[i+1], arr[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] heights = {0,1,0,2,1,0,1,3,2,1,2,1};
//        int[] heights = {4,2,0,3,2,5};
//        System.out.println(trap(heights));
        System.out.println(trapOpt(heights));
    }
}
