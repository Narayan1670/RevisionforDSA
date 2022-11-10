package LCS;

public class SequencePatternMatching {

    public static int LCS(char[] X, char[] Y, int m, int n) {
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
        // answer of LCS
        return dp[m][n];
    }
    public static boolean SPM(String s1, String s2) {
        char[] X = s1.toCharArray();
        char[] Y = s2.toCharArray();
        int m = s1.length();
        int n = s2.length();
        int lcs = LCS(X,Y,m,n);
        int a = Math.min(m,n);
        if(lcs == a) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "AXY";
        String s2 = "ADXCPY";
        System.out.println(SPM(s1,s2));
    }

}
