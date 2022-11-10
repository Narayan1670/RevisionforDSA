package com.company;

import java.util.Scanner;

public class Matrix2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

    }
    public static int[][] matrix2(int n){
        int[][] matrix = new int[n][n];
        int total = n*n;
        int counter = 0;
        int rowmin=0;
        int rowmax=matrix.length-1;
        int colmin=0;
        int colmax=matrix[0].length-1;
        while(total > counter){
            for(int col=colmin;counter<total && col<=colmax ;col++) {

                counter++;
                matrix[rowmin][col] = counter;
            }
            rowmin++;

            //Traversing Last Column
            for(int row=rowmin;counter<total && row<=rowmax;row++) {

                counter++;
                matrix[row][colmax] = counter;
            }
            colmax--;
            //Traversing Last Row
            for(int col=colmax;counter<total && col>=colmin ;col--) {

                counter++;
                matrix[rowmax][col] = counter;
            }
            rowmax--;

            //Traversing first column
            for(int row=rowmax;counter<total && row>=rowmin;row--) {

                counter++;
                matrix[row][colmin] = counter;
            }
            colmin++;
        }
        return matrix;
    }
}
