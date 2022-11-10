package com.company;

public class FlipImage {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};


    }
    static int[][] Invert(int[][] image){
        int temp = 0;
        for (int row = 0; row < image.length; row++){
            for (int col = 0; col < image[row].length; col++){
                if (image[row][col] == 1 ){
                    image[row][col] = 0;
                } else if(image[row][col] == 0){
                    image[row][col] = 1;
                }

            }
        }
        for(int row = 0; row < image.length; row++){
             for (int col = 0; col < image[row].length;col++){
                 temp = image[row][image[row].length - 1];
                 image[row][image[row].length - 1] = image[row][col];
                 image[row][col] = temp;
             }


        }


        return image;

    }

}
