package com.company;

public class shadowing {
    static int x = 30;// this will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x);
        int x = 20;
        System.out.println(x);
        fun();
        // does not work in methods and only in class

    }
    static void fun(){
        System.out.println(x);
    }
}
