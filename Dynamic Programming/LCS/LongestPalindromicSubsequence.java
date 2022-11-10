package LCS;

import java.util.Arrays;

public class LongestPalindromicSubsequence {


    public static int LCS(char[] X, char[] Y, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (X[i - 1] == Y[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }

    public static int LPS(String s) {
        char[] X = s.toCharArray();
        int m = X.length;
        String str = s, rev = "";
        char ch;
        for(int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            rev = ch + rev;
        }
        char[] Y = rev.toCharArray();
        int n = Y.length;
        return LCS(X,Y,m,n);
    }


    public static void main(String[] args) {
        String s1 = "agbcba";
        System.out.println(LPS(s1));


    }
}
