package LCS;

public class MinNumofDeleTomakeAPalindrome {

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
    public static int MinDelLPS(String s) {
        char[] X = s.toCharArray();
        int m = X.length;
        String s2 = reverse(s);
        char[] Y = s2.toCharArray();
        int n = Y.length;
        return s2.length() - LCS(X,Y,m,n);
    }
    public static String reverse(String up) {
        String p = "";
        for(int i = up.length()-1; i >=0; i--) {
            p = p + up.charAt(i);
        }
        return p;
    }

    public static void main(String[] args) {
        String s1 = "agbcba";
        System.out.println(MinDelLPS(s1));
    }

}
