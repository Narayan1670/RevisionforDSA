package LCS;

public class LongestRepeatingSubsequence {

    public static int lengthLRS(char[] X, char[] Y, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (X[i - 1] == Y[j - 1] && i != j) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }
    public static String printLPS(char[] X, char[] Y, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (X[i - 1] == Y[j - 1] && i != j) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        String res = "";
        int i = n, j = n;
        while(i > 0 && j > 0) {

            if (dp[i][j] == dp[i-1][j-1] + 1) {
                res = res + X[i-1];
                i--;
                j--;
            }
            else {
                if (dp[i][j] == dp[i-1][j]) {
                    i--;
                }
                else {
                    j--;
                }

            }
            reverse(res);
        }

        return res;
    }
    public static void reverse(String up) {
        String p = "";
        for(int i = up.length()-1; i >=0; i--) {
            p = p + up.charAt(i);
        }
    }

    public static void main(String[] args) {
        String s1 = "AABEBCDD";
        char[] X = s1.toCharArray();
        int m = s1.length();
        System.out.println(lengthLRS(X,X,m,m));
        System.out.println(printLPS(X,X,m,m));
    }


}
