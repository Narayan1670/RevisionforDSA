package LCS;

public class LargestCommonSubString {
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "abfce";

        char[] X = s1.toCharArray();
        char[] Y = s2.toCharArray();
        int m = X.length;
        int n = Y.length;
        System.out.println(lgstComnSubstrDP(X, Y, m, n));
        System.out.println(findLength(s1,s2));

    }
    public static int  lgstComnSubstrDP(char[] X,char[] Y,int m,int n){

        int maxLen = 0;
        int[][] dp = new int[m+1][n+1];

        for(int i = 0; i<=m; i++){
            for(int j = 0; j<=n; j++){
                if(i == 0 || j == 0)
                    dp[i][j] = 0;
                else if(X[i-1] == Y[j-1])
                    dp[i][j] = 1+dp[i-1][j-1];
                else
                    dp[i][j] = 0;
                    maxLen= Math.max(dp[i][j], maxLen);
            }
        }

        return maxLen;
    }
    public static int findLength(String s1, String s2) {
        int m= s1.length(), n=s2.length();
        int max = -1;
        int[][] dp = new int[m+1][n+1];
        for (int i=1; i<=m; i++) {
            for (int j=1; j<=n; j++) {
                if (s1.charAt(i-1)==s2.charAt(j-1)) {
                    dp[i][j] = 1+dp[i-1][j-1];
                }
                max = Math.max(dp[i][j], max);
            }
        }
        return max;
    }
}
