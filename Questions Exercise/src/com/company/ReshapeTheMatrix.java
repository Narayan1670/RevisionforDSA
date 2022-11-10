package com.company;

import java.util.ArrayList;
import java.util.List;

public class ReshapeTheMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1, 2},
                       {3, 4}};
        int[][] ans = Reshape(mat,1,4);
        for (int row = 0; row < ans.length; row++) {
            for (int col = 0; col < ans[row].length; col++) {
                System.out.print(ans[row][col] + " ");
            }
            System.out.println();
        }
    }
    static int[][] Reshape(int[][] mat, int r, int c){
        ArrayList<Integer> list=new ArrayList<Integer>();
        int m= mat.length;
        int n = mat[0].length;
        int matrix[][]=new int[r][c];
        if (r*c !=m*n){
            return mat;
        }
        else{
            for (int[] ints : mat) {
                for (int j = 0; j < mat[0].length; j++) {
                    list.add(ints[j]);
                }
            }
            int len = list.size();
            int t=0;
            while(t<len){
                for(int i=0;i<r;i++){
                    for(int j=0;j<c;j++){
                        matrix[i][j]=list.get(t);
                        t++;
                    }
                }
            }
        }
        return matrix;
    }
}
