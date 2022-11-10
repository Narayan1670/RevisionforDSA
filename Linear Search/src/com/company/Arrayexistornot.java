package com.company;

public class Arrayexistornot {
    public static void main(String[] args) {
        int[] nums  = { 12,34,24,6,2};
        int target = 6;
        int ans  = linearSearch(nums, target);
        int ans1 = linearSearch1(nums, 2);


    }

    // search the array: return the index if item found
    // otherwise if item not found return -1
    static  int  linearSearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }
        // run a for loop
        for (int index = 0; index < arr.length; index++){
            // check for Element at every index if it = target
            int element = arr[index];
            if (element == target){
                return index;
            }

        }
        // this line will execute if none of the statements above have returned
        // hence the target not found
        return -1;
    }
    // search the target and return the element
    static  int  linearSearch1(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        // run a for loop
        for (int element : arr) {
            // check for element at every index if it = target
            if (element == target) {
                return element;
            }

        }
        // this line will execute if none of the statements above have returned
        // hence the target not found
        return Integer.MAX_VALUE;
    }
    // SEARCH THE TARGET AND RETURN TRUE AND FALSE
    static  boolean  linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }
        // run a for loop
        for (int element : arr) {
            // check for element at every index if it = target
            if (element == target) {
                return true;
            }

        }
        // this line will execute if none of the statements above have returned
        // hence the target not found
        return false;
    }
}
