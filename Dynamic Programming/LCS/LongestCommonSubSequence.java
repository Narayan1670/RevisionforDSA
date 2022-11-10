package LCS;

public class LongestCommonSubSequence {

    public static int lcsRecursive(char[] X, char[] Y, int m, int n) {
        // total number of subsequences of String X of size m = pow(2,m)
        // total number of subsequences of String Y of size n = pow(2,n)
//        TC: O(pow(2,(m+n)))
//        height of recursion tree  = max(m,n);
//        SC: O(max(m,n))


            if (m == 0 || n == 0)
                return 0;
            if (X[m - 1] == Y[n - 1])
                return 1 + lcsRecursive(X, Y, m - 1, n - 1);
            else
                return Math.max(lcsRecursive(X, Y, m, n - 1), lcsRecursive(X, Y, m - 1, n));
        }
    public static int lcsMemoizeInit(char[] X, char[] Y, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                dp[i][j] = -1;
            }
        }
//        if(dp[m][n] != -1) return dp[m][n];
        return lcsMemoize( X, Y, m, n, dp);
    }
    public static int lcsMemoize(char[] X, char[] Y, int m, int n, int[][] dp) {
//        TC: O(m*n)
//        SC: O(m*n)

       if(m == 0 || n == 0) return 0;

       if (dp[m][n] < 0)
       {
           if(X[m-1] == Y[n-1])
               dp[m][n] = 1 + lcsMemoize(X, Y, m-1, n-1, dp);
           else
               dp[m][n] = Math.max(lcsMemoize(X, Y, m-1, n, dp), lcsMemoize(X, Y, m, n-1, dp));
       }
        return dp[m][n];
    }
    public static int lcsTabulation(char[] X, char[] Y, int m, int n) {
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
        return dp[m][n];
    }



    public static void main(String[] args)
    {

//        String s1 = "bsbininm";
//        String s2 = "jmjkbkjkv";
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        char[] X = s1.toCharArray();
        char[] Y = s2.toCharArray();
        int m = X.length;
        int n = Y.length;
        System.out.println(lcsRecursive(X, Y, m, n));
        System.out.println(lcsMemoizeInit(X,Y,m,n));
        System.out.println(lcsTabulation(X,Y,m,n));

    }
    }