package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static class DPMethods {
        public static void main(String[] args) {
            int[] wt = {1, 3, 4, 3};
            int[] val = {1, 4, 5, 7};
            int W = 7;
            int n = wt.length;
            int ans  = Tabulation(wt,val,W,n);
            System.out.println(ans);

        }
        static int recursive(int[] wt, int[] val, int W, int n) {
            if(n == 0 ||  W == 0) return 0;

            if (wt[n-1] <= W) {
                return Math.max(val[n-1] + recursive(wt,val,W-wt[n-1], n-1), recursive(wt, val,W, n-1));
            } else {
                return recursive(wt, val,W, n-1);
            }

        }
        static int memoization(int[] wt, int[] val, int W, int n) {

            if (n == 0 || W == 0) return 0;

            int[][] t = new int[n+1][W+1];
            for(int i = 0; i < n+1; i++) {
                for(int j = 0; j < W+1; j++) {
                    t[i][j] = -1;
                }
            }
            if (t[n][W] != -1) {
                return t[n][W];
            }

            if (wt[n-1] <= W) {
                t[n][W] =  Math.max(val[n-1] + memoization(wt,val,W-wt[n-1], n-1), memoization(wt, val,W, n-1));
            } else {
                t[n][W] =  memoization(wt, val,W, n-1);
            }
            return t[n][W];
        }
        static int Tabulation(int[] wt, int[] val, int W, int n) {

            int[][] t = new int[n+1][W+1];
            for(int i = 0; i < n+1; i++) {
                for(int j = 0; j < W+1; j++) {
                    if(i == 0 || j == 0) {
                        t[i][j] = 0;
                    }
                }
            }
            for (int i = 1; i < n+1; i++) {
                for (int j = 1; j < W+1; j++) {
                    if (wt[i-1] <= j) {
                        t[i][j] =  Math.max(val[i-1] + t[i-1][j - wt[i-1]],t[i-1][j]);
                    } else {
                        t[i][j] =  t[i-1][j];
                    }
                }
            }
            return t[n][W];
        }

    }
}
