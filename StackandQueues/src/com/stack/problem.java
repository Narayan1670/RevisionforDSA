package com.stack;

public class problem {
    public static void main(String[] args) {

//        System.out.println(subtractProductAndSum(234));
    }
    public int sumofdigits(int N) {
        if(N < 10) return N;
        return sumofdigits((N/10) + (N%10));
    }
    public int prodofdigits(int N) {
        if(N < 10) return N;
        return prodofdigits((N/10) * (N%10));
    }
}
