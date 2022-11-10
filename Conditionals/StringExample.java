package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
    //    String message = greet();
    //    System.out.println(message);
        Scanner in = new Scanner(System.in);
        System.out.println("enter your Name!");
        String name = in.next();
        String personalised = myGreet(name);
        System.out.println(personalised);
    }

    static String myGreet(String name) {
        String message = "hello " + name;
        return message;
    }

    static String greet(){
        String greeting = "How are You";
        return greeting;
    }
}
