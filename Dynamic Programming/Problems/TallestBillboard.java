package Problems;

public class TallestBillboard {
//    problem: https://leetcode.com/problems/tallest-billboard/

    public static void main(String[] args) {
        int[] rods = {1,2,3,6};
        System.out.println(tallestBillboard(rods));
    }

    public static int tallestBillboard(int[] rods) {
          return CountOfSubsetOfGivenDifference(rods,0);
    }
    static int CountOfSubsetOfGivenDifference(int[] arr, int diff) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        int sum2 = ((sum + diff) / 2);
        return CountSubsetOfGivenSum(arr, sum2);
    }
    static int CountSubsetOfGivenSum(int[] nums, int sum) {
        int n = nums.length;
        int[][] t = new int[n+1][sum+1];
        for(int i = 0; i < n+1; i++) {
            for(int j = 0; j < sum+1; j++) {
                if(j == 0 ) {
                    t[i][j] = 0;}
                if (j == 0) {
                    t[i][j] = 1;
                }}}

        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < sum+1; j++) {
                if (nums[i-1] <= j) {
                    t[i][j] =    t[i-1][j - nums[i-1]] + t[i-1][j];
                } else {
                    t[i][j] =  t[i-1][j];
                }
            }
        }
        return t[n][sum];
    }
}
