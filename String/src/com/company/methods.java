package com.company;

import java.util.Arrays;

public class methods {
    public static void main(String[] args) {
        String name = "Vish Baba Yaga Cool";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.charAt(2));
        System.out.println(name.indexOf('a'));

        System.out.println("     oivn    ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
