package boundedknapsack;

public class unboundedKnapsack {

    public int coinChangeMax(int[] coins, int amount) {
        int n = coins.length;
        int[][] t = new int[n+1][amount+1];
        for(int i = 0; i < n+1; i++) {
            for(int j = 0; j < amount+1; j++) {
                if(i == 0 ) {
                    t[i][j] = 0;}
                if (j == 0) {
                    t[i][j] = 1;
                }}}

        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < amount+1; j++) {
                if (coins[i-1] <= j) {
                    t[i][j] =    t[i][j - coins[i-1]] + t[i-1][j];
                } else {
                    t[i][j] =  t[i-1][j];
                }
            }
        }
        return t[n][amount];
    }
    public int coinChangeMin(int[] coins, int amount) {
        int n = coins.length;
        int[][] t = new int[n+1][amount+1];
        for(int i = 0; i < n+1; i++) {
            for(int j = 0; j < amount+1; j++) {
                if (j == 0) {
                    t[i][j] = 0;}
                if(i == 0 ) {
                    t[i][j] = Integer.MAX_VALUE - 1;
                }}}
        for(int i = 1, j = 0; j < amount + 1; j++) {
            if (j % coins[0] == 0) {
                t[i][j] = j / coins[0];}
            else {
                t[i][j] = Integer.MAX_VALUE - 1;
            }}
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < amount+1; j++) {
                if (coins[i-1] <= j) {
                    t[i][j] =    t[i][j - coins[i-1]] + t[i-1][j];
                } else {
                    t[i][j] =  t[i-1][j];
                }
            }
        }
        return t[n][amount];

    }
    public static int rodCutting(int[] arr) {
        int[] np = new int[arr.length+ 1];
        for (int i = 0; i < arr.length; i++) {
            np[i+1] = arr[i];
        }
        int[] dp = new int[np.length];
        dp[0] = 0;
        dp[1] = np[1];

        for (int i = 2; i < dp.length; i++) {
            dp[i] = np[i];

            int l = 1;
            int r = i-1;
            while(l <= r) {
                if (dp[l] + dp[r] > dp[i]) {
                    dp[i] = dp[l] + dp[r];
                }
                l++;
                r--;
            }
        }
        return dp[dp.length - 1];
    }

}
