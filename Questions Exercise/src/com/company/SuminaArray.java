package com.company;

public class SuminaArray {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {3, 2, 1}};
    }
    static int sum(int[][] arr) {

        int rows = arr.length;
        int cols = arr[0].length;
        int sumRow = 0;
        for (int i = 0; i < rows; i++) {
            sumRow = 0;
            for (int j = 0; j < cols; j++) {
                sumRow = sumRow + arr[i][j];
            }
        }
        return sumRow;

    }
}

