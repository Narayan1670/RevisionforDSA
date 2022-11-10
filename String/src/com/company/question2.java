package com.company;

import java.util.ArrayList;
import java.util.List;

public class question2 {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(fizzBuzz(n));
    }
    static List<String> fizzBuzz(int n) {
        List list = new ArrayList();
        for(int i = 1; i <= n; i++){
            if(i % 3 == 0) {
                list.add("Fizz");
            }
            if(i % 5 == 0) {
                list.add("Buzz");
            }
            if( i % 3 != 0 && i % 5 != 0) {
                list.add(i);
            }
        }
        return list;
    }
}
