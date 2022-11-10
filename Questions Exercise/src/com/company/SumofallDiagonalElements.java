package com.company;

public class SumofallDiagonalElements {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(SumOfDiagonal(arr));
    }
    static int SumOfDiagonal(int[][] arr){
        int temp = 0;
        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++ ){
               if (row == col || row + col == arr.length - 1){
                    temp = temp + arr[row][col];
                }
            }
        }
    return temp;
    }

}
