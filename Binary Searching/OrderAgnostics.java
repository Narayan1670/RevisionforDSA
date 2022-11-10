package com.company;

public class OrderAgnostics {
    public static void main(String[] args) {

    }

    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        //find weather the array is ascending or descending
        boolean isAsc = arr[start] < arr[end];
        while(start <= end){
            // find the middle element
            // int mid = (start + end) / 2;
            // might be possible that (start + end) exceeds the range of int
            int mid = start + (end - start) / 2;

            if (target <= arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]){
                start = mid + 1;
            } else{
                // ans found
                return mid;
            }
        }
        return -1;
    }
}
