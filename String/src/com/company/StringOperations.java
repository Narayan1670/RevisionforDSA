package com.company;

import java.util.Locale;

public class StringOperations {
    public static void main(String[] args) {
//        String str = "HEllO";
//        String str1 = "hELLo";
//        System.out.println(str.equalsIgnoreCase(str1));
//          String str = "hello";
//          String str1 = "HEllo";
//        System.out.println(str.toUpperCase());
//        System.out.println(str1.toUpperCase());
        String str = "geeks";
        String slice_1 = str.substring(0,1);
        String slice_2 = str.substring(1);
        String str1 = slice_1.toUpperCase();
        String str2 = str1 + slice_2;// capitalizing the string
        System.out.println(slice_1);
        System.out.println(slice_2);
        System.out.println(str2);

    }
}
