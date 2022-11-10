package LCS;

public class PrintSCS {
    public static String printSCS(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        int dp[][] = new int[m + 1][n + 1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    dp[i + 1][j + 1] = 1 + dp[i][j];
                } else {
                    dp[i + 1][j + 1] = Math.max(dp[i + 1][j], dp[i][j + 1]);
                }
            }
        }

        int l = str1.length() + str2.length() - dp[m][n];
        char[] chars = new char[l];
        while (m > 0 && n > 0) {
            char current;
            if (str1.charAt(m - 1) == str2.charAt(n - 1)) {
                current = str1.charAt(m - 1);
                m--;
                n--;
            } else {
                if (dp[m - 1][n] > dp[m][n - 1]) {
                    current = str1.charAt(m - 1);
                    m--;
                } else {
                    current = str2.charAt(n - 1);
                    n--;
                }
            }
            chars[l - 1] = current;
            l--;
        }
        while (m > 0) {
            chars[l - 1] = str1.charAt(m - 1);
            l--;
            m--;
        }
        while (n > 0) {
            chars[l - 1] = str2.charAt(n - 1);
            l--;
            n--;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        char[] X = s1.toCharArray();
        char[] Y = s2.toCharArray();
        int m = X.length;
        int n = Y.length;

        System.out.println(printSCS(s1, s2));

    }
}
