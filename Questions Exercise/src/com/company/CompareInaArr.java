package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareInaArr {
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;

        System.out.println(kidsWithCandies(candies,extraCandies));
    }
    static  List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List list = new ArrayList<>();
        int greatestElement=candies[0];

        int ans;
        for (int i = 1; i <candies.length ; i++) {
            if(candies[i]>greatestElement){
                greatestElement = candies[i];
            }
        }
        for (int candy : candies) {
            ans = candy + extraCandies;
            if (greatestElement <= ans) {
                list.add(true);
            } else {
                list.add(false);
            }
        }

        return list;

    }

}
