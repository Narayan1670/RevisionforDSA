package MCM;

import java.util.Arrays;

public class MCMFormat {
    private static int[][] dp= new int[1001][1001];


    public static int mcmRecursive(int[] arr, int i, int j) {
//        The time complexity of the solution is exponential
//        Auxiliary Space: O(1)
        if(i == j) return 0;
        int mn = Integer.MAX_VALUE;

        for (int k = i; k < j; k++) {
            int tempAns = mcmRecursive(arr, i, k) +
                          mcmRecursive(arr,k+1,j) +
                          (arr[i-1]*arr[k]*arr[j]);
            mn = Math.min(mn,tempAns);
        }
        return mn;
    }
    public static int mcmMemoized(int[] arr, int i, int j) {
//        Time Complexity: O(N3 )
//        Auxiliary Space: O(N2) ignoring recursion stack space
        if(i >= j) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        dp[i][j] = Integer.MAX_VALUE;

        for (int k = i; k < j; k++) {
            dp[i][j] = Math.min(dp[i][j] ,mcmRecursive(arr, i, k) +
                    mcmRecursive(arr,k+1,j) +
                    (arr[i-1]*arr[k]*arr[j]));

        }
        return dp[i][j];
    }

    public static int mcmTabulized(int[] arr, int n) {
//        Time Complexity: O(N3)
//        Auxiliary Space: O(N2)
        int[][] m = new int[n][n];
        int i, j, k, l, q;
        for (i = 1; i < n; i++)
            m[i][i] = 0;
        for( l = 2; l < n; l++) {
            for (i = 1; i < n- l + 1; i++) {
                j = i + l -1;
                if (j == n)
                    continue;
                m[i][j] = Integer.MAX_VALUE;
                for (k = i; k <= j - 1; k++) {
                    q = m[i][k] + m[k+1][j] + arr[i-1]*arr[k]*arr[j];
                    if (q < m[i][j])
                        m[i][j] = q;
                }
            }
        }
        return m[1][n-1];
    }

    public static void main(String[] args) {
        for (int[] row : dp)
            Arrays.fill(row, -1);

        int[] arr = {10, 20, 30};
        System.out.println(mcmRecursive(arr,1,arr.length - 1));
        System.out.println(mcmMemoized(arr,1,arr.length - 1));
        System.out.println(mcmTabulized(arr,arr.length));


    }

}
