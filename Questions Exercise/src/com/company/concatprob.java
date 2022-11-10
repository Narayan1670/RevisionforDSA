package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class concatprob<array> {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array1 =  new int[3];
        for(int i = 0; i < array1.length; i++ ){
            array1[i] = in.nextInt();
            }

        int length = 2 * array1.length ;

        int[] result = new int[length];
        int pos = 0;
        int pos1 = array1.length;
        for (int i = 0; i < array1.length; i++) {
            int element = array1[i];
            result[pos] = element;
            result[pos1] = element;
            pos++;
            pos1++;

        }

        System.out.println(Arrays.toString(result));
    }
}


