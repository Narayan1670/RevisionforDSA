package com.company;

import java.io.IOException;
import java.util.Scanner;

public class question {
    public static void main(String[] args) throws IOException {


        try{
            Scanner in = new Scanner(System.in);
            int[] x = new int[4];
            x[0] = in.nextInt();
            x[1] = in.nextInt();
            x[2] = in.nextInt();
            x[3] = in.nextInt();
            System.out.println(fun(x));
        }catch(Exception e){
            return;
        }

    }

    static int fun(int[] x){
        if (x.length == 0){
            return 0;
        }
        int counter = 0;
        int i = 0;
        int min = Integer.MAX_VALUE;
        for (int element : x) {
            min = Math.min(min, element);
        }
        while(min <= x[i]){
            x[i]--;
            counter++;
        }




        return counter;
    }

}
