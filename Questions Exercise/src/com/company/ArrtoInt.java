package com.company;
// plusOne question It is....
import java.util.Arrays;

public class ArrtoInt {
    public static void main(String[] args) {
        int[] digits = {1,2,4};
        int[] arr = plusOne(digits);
        System.out.println(Arrays.toString(arr));
    }

    static int[] plusOne(int[] digits){

        int remember = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            if(digits[i] + remember > 9){
                digits[i] = 0;
                remember = 1;
            }
            else{
                digits[i] = digits[i] + remember;
                remember = 0;
            }
        }
        if(remember > 0){
            int[] newArr = new int[digits.length + remember];
            newArr[0] = 1;
            return newArr;
        }
        return digits;
    }

}

