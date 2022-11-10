package com.company;

import java.util.Scanner;

public class FODCHAIN {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int T = in.nextInt();
        while(T > 0){
            int E = in.nextInt();
            int K = in.nextInt();
            System.out.println(FoodChain(E,K));
            T--;

        }
    }
    public static int FoodChain(int E, int K){

        int count = 0;
        while(E > 0){
            count++;
            E = E / K;


        }
    return count;
    }
}
