package boundedknapsack;

public class problems {
//    Perfect Sum Problem:
//    Given an array of integers and a sum,
//    the task is to count all subsets of the given array
//    with the sum equal to the given sum.
    public static int psRecursive(int n, int[] nums, int sum) {
        if(sum == 0) {
            return 1;
        }
        else if(sum != 0 && n == 0) {
            return 0;
        }
        else if (nums[n-1] > sum) {
            return psRecursive(n-1,nums,sum);
        }
        else {
            return psRecursive(n-1,nums,sum) + psRecursive(n-1,nums,sum-nums[n-1]);
        }
    }
    public static int PerfectSums(int n, int a[], int sum)
    {

        int[][] dp = new int[n + 1][sum + 1];
        dp[0][0] = 1;

        for (int i = 1; i <= sum; i++)
            dp[0][i] = 0;

        for (int i = 1; i <= n; i++)
            dp[i][0] = 1;

        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= sum; j++)
            {

                if (a[i - 1] > j)
                    dp[i][j] = dp[i - 1][j];

                else
                {
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j - a[i - 1]];
                }
            }
        }

        return (dp[n][sum] == 0 ? 999 : dp[n][sum] ) ;
    }

    public static void main(String[] args) {
        int[] nums = {9,7,3,12,7};

//        System.out.println(psRecursive(nums.length,nums,5));
        System.out.println(PerfectSums(nums.length,nums,14));
    }
}
