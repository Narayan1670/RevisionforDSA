package com.company;

public class binarySearch {
    public static void main(String[] args) {

    }
    static int binarysearch(int[] arr, int target, int start, int end) {
        while(start < end) {
            int mid = start + (end-start)/2;

            if(target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
