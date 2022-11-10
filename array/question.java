package com.company;

import java.lang.reflect.Array;
import java.util.Scanner;

public class question {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float[] arr = {1, 3, 23, 9, 18};
        float a = Average(arr);
        System.out.println(a);

        }

    static float Average( float[] arr){
        float temp = 0;
        float count = 0;
        for (int i = 0; i < arr.length; i++){
            temp = temp + arr[i];
            count++;
        }
        return temp/count;
    }

}
