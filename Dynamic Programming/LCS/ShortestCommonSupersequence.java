package LCS;

public class ShortestCommonSupersequence {

    public static int shortestSequence(char[] X, char[] Y, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i < m + 1; i++) {
            for(int j = 0; j < n + 1; j++) {
                if(i ==0 || j == 0) {
                    dp[i][j] = 0;
                }
                else if(X[i-1] == Y[j-1]) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else {
                    dp[i][j] = Math.max(dp[i-1][j] , dp[i][j-1]);
                }
            }
        }
        // length of  X + Y - answer of LCS
        return (m + n)  - dp[m][n];
    }

    public static int SCSLength(String X, String Y) {
        int m = X.length();
        int n = Y.length();

        // dp[i][j] contains length of
        // shortest supersequence
        // for X[0..i-1] and Y[0..j-1]
        int dp[][] = new int[m + 1][n + 1];

        // Fill table in bottom up manner
        for (int i = 0; i <= m; i++)
        {
            for (int j = 0; j <= n; j++)
            {

                // Below steps follow recurrence relation
                if (i == 0)
                {
                    dp[i][j] = j;
                }
                else if (j == 0)
                {
                    dp[i][j] = i;
                }
                else if (X.charAt(i - 1) == Y.charAt(j - 1))
                {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                }
                else
                {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }

    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        char[] X = s1.toCharArray();
        char[] Y = s2.toCharArray();
        int m = X.length;
        int n = Y.length;

        System.out.println(shortestSequence(X,Y,m,n));
        System.out.println(SCSLength(s1,s2));


    }

}
