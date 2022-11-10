package com.company;

public class SumofEachRowandColumn {
    public static void main(String[] args) {
        int rows, cols, sumRow, sumCol;

        //Initialize matrix a
        int a[][] = {
                {1, 2, 3},
                {4, 5, 6},

        };
        rows = a.length;
        cols = a[0].length;
        for (int i = 0; i < rows; i++) {
            sumRow = 0;
            for (int j = 0; j < cols; j++) {
                sumRow = sumRow + a[i][j];
            }
            System.out.println("Sum of " + (i + 1) + " row: " + sumRow);
        }
            for (int i = 0; i < cols; i++) {
                sumCol = 0;
                for (int j = 0; j < rows; j++) {
                    sumCol = sumCol + a[j][i];
                }
                System.out.println("Sum of " + (i + 1) + " column: " + sumCol);
            }
        }
    }

