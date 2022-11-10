package com.company;



public class largestAltitude {
    public static void main(String[] args) {
        int[] gain = {-4,-3,-2,-1,4,3,2};
        System.out.println(LargestAlt(gain));


    }
    static int LargestAlt(int[] gain){
        int[] ans = new int[gain.length + 1];
        ans[0] = 0;
        int temp = 0;
        for (int i = 0; i < ans.length - 1; i++){
            ans[i + 1] = temp + gain[i];
            temp = ans[i + 1];
        }
        return Max(ans);

    }
    static int Max(int[] ans){
        int max = ans[0];
        for (int an : ans) {
            if (an > max) {
                max = an;
            }
        }
        return max;
    }

}
