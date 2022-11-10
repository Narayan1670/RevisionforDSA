package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class ArrayToInt {
    public static void main(String[] args) {

        int[] num = {2, 3, 4, 5};
        int k = 55;
//        int x = 121;
//        int[] digits = Integer.toString(x).chars().map(c -> c-'0').toArray();
//        System.out.println(Arrays.toString(digits));
        System.out.println(addtoArrayForm(num,k));
    }
        static List addtoArrayForm ( int[] num, int k){
            List ans = new ArrayList<>();
            int i = num.length - 1;
            while (i >= 0 || k > 0) {
                if (i >= 0) {
                    k = k + num[i];
                    ans.add(k % 10);
                    k /= 10;
                    i--;
                }

            }
            Collections.reverse(ans);
            return ans;


        }
    }



