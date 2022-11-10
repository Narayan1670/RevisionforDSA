package com.company;

import java.util.Scanner;

public class passing_example {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = "Vishnu";
        greet(name);
    }
    static void greet(String naam){
        System.out.println(naam);
    }
}
