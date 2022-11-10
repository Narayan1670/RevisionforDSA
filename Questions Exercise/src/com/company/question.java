package com.company;

import java.util.Scanner;

public class question {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] ans = flipAndInvertImage(image);
        for (int row = 0; row < ans.length; row++) {
            // for each column in every row
            for (int col = 0; col < ans[row].length; col++) {
                System.out.print(ans[row][col] + " ");
            }
            System.out.println();
        }

    }
    static int[][] flipAndInvertImage(int[][] image){
        int[][] a = new int[image.length][image[0].length];
        for(int k=0;k<image.length;k++){

            for(int i =0; i<image[k].length; i++){
                a[k][i] = image[k][image[k].length-i-1] == 0 ? 1 : 0;
            }
        }
        return a;

    }
}
