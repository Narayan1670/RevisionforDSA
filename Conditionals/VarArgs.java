package com.company;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,4,5,6,7,8);
        multiple(2, 3, "string");
        demo(2,3,4);
        demo("V","jk","f","d");

    }
    static void multiple(int a, int b, String ...v){
    // variable length argument should always be at end
        System.out.println(Arrays.toString(v));
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
