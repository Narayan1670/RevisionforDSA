package com.company;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithEqualnoofZeroesandOnes {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 0, 1, 1, 1, 0, 0};
        int n = arr.length;
//        System.out.println(longestSub(arr, n));
        System.out.println(LongestSubNaive(arr, n));
    }
    static int LongestSubNaive(int arr[], int n){
        int res = 0;
        for (int i = 0; i < n; i++) {
            int c0 = 0, c1 = 0;
            for (int j = i; j < n; j++) {
                if (arr[j] == 0)
                    c0++;
                else c1++;
                if (c0 == c1)
                    res = Math.max(res, j-i+1);
            }
        }
        return res;
    }

    static int longestSub(int[] arr, int n){

        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int sum = 0, maxLen = 0;
        for(int i = 0; i < n; i++)
            arr[i] = (arr[i] == 0) ? -1 : 1;

        for(int i = 0; i < n; i++)
        {
            sum += arr[i];
            if (sum == 0)
                maxLen = i+1;

            if(hm.containsKey(sum + n) == true)
            {
                if(maxLen < i - hm.get(sum + n))
                    maxLen = i - hm.get(sum + n);

            }else hm.put(sum + n, i);
        }
        return maxLen;
    }
}
