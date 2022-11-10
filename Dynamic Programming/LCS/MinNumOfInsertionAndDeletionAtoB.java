package LCS;

import java.util.ArrayList;
import java.util.List;

public class MinNumOfInsertionAndDeletionAtoB {
    //Approach
    // to do: a -->  b
    // how to do:  a --> LCS --> b



    public static List<Integer> lcsTabulation(char[] X, char[] Y, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        List<Integer> ls = new ArrayList<>();
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
        //deletion
        ls.add(m - dp[m][n]);
        //insertion
        ls.add(n -  dp[m][n]);
        return ls;
    }

    public static void main(String[] args) {
//        String s1 = "AGGTAB";
//        String s2 = "GXTXAYB";
        String s1 = "HEAP";
        String s2 = "PEA";

        char[] X = s1.toCharArray();
        char[] Y = s2.toCharArray();
        int m = X.length;
        int n = Y.length;

        System.out.println(lcsTabulation(X,Y,m,n));
    }


}
