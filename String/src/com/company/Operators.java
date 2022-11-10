package com.company;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
//        float a = 453.1274f;
//        System.out.printf("Formatted number is %.2f", a);
//        System.out.printf("Pie: %.3f",Math.PI);

//        System.out.printf("Hello my name is %s and i like %s","vishnu","pizza" );
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char)('a' + 3));
//
        System.out.println("a" + 1);
//        this is same as after a few steps: "a" + "1"
//        integer will be converted to Integer that will call toString()
        System.out.println("Vishnu" + new ArrayList<>());
        System.out.println("BabaYaga" + new Integer(78));
        System.out.println("a" + 'b');

    }
}
