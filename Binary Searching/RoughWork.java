package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RoughWork {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while(T > 0){
            //int N = in.nextInt();
            String S = in.next();
            String X = sortString(S);




            T--;
        }
    }
    public static String sortString(String inputString){

        char tempArray[] = inputString.toCharArray();


        Arrays.sort(tempArray);


        return new String(tempArray);
    }
}
