package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimenArrList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        // initialization
        for (int i = 0; i < 2; i++){
            list.add(new ArrayList<>());

        }

        // add elements

        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){
                list.get(i).add(in.nextInt());
            }
        }


        System.out.println(list);
    }
}
