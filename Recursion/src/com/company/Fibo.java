package com.company;

public class Fibo {
    public static void main(String[] args) {
//        int ans = fibo(4);
//        System.out.println(ans);
//        for (int i = 0; i < 11; i++){
//            System.out.println(fiboFormula(i));
//        }
//        System.out.println(fiboFormula(50));
        fiboBoth(5);

     }
//     static int fiboFormula(int n) {
//        // use long for exact value
//         return (int)(Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5));
//     }
//    static int fibo(int n){
//
//        //base condition
//        if (n < 2){
//            return n;
//        }
//
//        return fibo(n - 1) + fibo(n-2);
//    }
    static void fibo(int n){
        if (n == 0) {
            return ;
        }
        System.out.println(n);
        fibo(n - 1);
    }
    static void fiboRev(int n){
        if (n == 0) {
            return ;
        }
        fiboRev(n - 1);
        System.out.println(n);
    }
    static void fiboBoth(int n){
        if (n == 0) {
            return ;
        }
        System.out.println(n);
        fiboBoth(n - 1);
        System.out.println(n);
    }

}
