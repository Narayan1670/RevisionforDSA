package com.company;

public class findInMountain {
    public static void main(String[] args) {

    }
    int findInMountainArray(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr,target,0,peak);
        if (firstTry!=-1) {
            return firstTry;
        }
        return orderAgnosticBS(arr,target, peak = 1, arr.length - 1);
    }
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1] ){
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;

    }
    static int orderAgnosticBS(int[] arr, int target, int start, int end){


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
