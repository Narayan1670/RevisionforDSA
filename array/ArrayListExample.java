package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Syntax
        ArrayList<Integer> list = new ArrayList<>();
//        int i = 0;
        //
         list.add(867);
         list.add(567);
         list.add(267);
         list.add(637);
         list.add(674);
        //
         System.out.println(list);
        //
        // System.out.println(list.contains(37));
        // list.set(1, 34);
        // System.out.println(list);
        // list.remove(2);
        // System.out.println(list);
        //
        // input
        for ( int i = 0; i < 5; i++){
            list.add(in.nextInt());
        }
        // get item at any index
        for ( int i = 0; i < 5; i++){
            System.out.println(list.get(i)); // pass index here, list[syntax] will not work here
        }
        System.out.println(list);
//        list.get(i).equals()
    }
}
