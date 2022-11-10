package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Distribute {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> weight = new ArrayList<>();
        int a = sc.nextInt();
        int sum = 0;
        while(a != -1){
            weight.add(a);
            sum = sum + a;
            a = sc.nextInt();
        }
        int[] s = {50, 30, 20};
        Collections.sort(weight, Collections.reverseOrder());
        cal(weight, sum, s);
    }

    static void cal(ArrayList<Integer> arr, int sum, int[] s){

        for(int j = 0;j<3;j++) {
            int sum1 = 0;
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i) != 0 && (sum1 + arr.get(i)) <= (sum * s[j] * 0.01)) {
                    sum1 = sum1 + arr.get(i);
                    list.add(arr.get(i));
                    arr.set(i, 0);
                }
            }
            System.out.println(list);
        }
    }
}
