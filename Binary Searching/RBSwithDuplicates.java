package com.company;

public class RBSwithDuplicates {
    public static void main(String[] args) {
        int[] arr = {2,5,6,0,0,1,2};
        int target = 7;
        System.out.println(searchinDuplicate(arr, target));

    }
    static boolean searchinDuplicate(int[] nums, int target) {
        int pivot = findPivotWithDuplicates(nums);
        // if you did not find a pivot , it means the array is not rotated

        if(pivot == -1){
            // just to normal binary search
            return binarySearch(nums, target, 0, nums.length - 1) != -1;
        }

        // if pivot is found, you have 2 asc sorted arrays


        if (target < nums[0] || target > nums[pivot]){
            return binarySearch(nums, target,  pivot + 1, nums.length - 1) != -1;
        } else {

            return binarySearch(nums, target, 0, pivot) != -1;
        }

    }
    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int  end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            //if elements at middle, start, end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates

                //NOTE: what if these elements at start and end were the pivot??
                // check if it is pivot
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                //check whether end is pivot
                if(arr[end] < arr[end - 1]){
                    return end - 1;
                }
                end--;
            }
            // left side is sorted,  so pivot should be in right
            else if ((arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid + 1;
            } else  {
                end = mid - 1;
            }
        }
        return -1;
    }
    static int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            // find the middle element
            int mid = start + (end - start) / 2;

            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]){
                start = mid + 1;
            } else{
                // ans found
                return arr[mid];
            }
        }
        return -1;
    }
    // an effective approach


/*
    public boolean search(int[] nums, int target) {
        int index=peak(nums);

        boolean f1 =search1(nums,target,index);
        boolean s1 =search2(nums,target,index);

        if(!f1){
            return s1;
        }

        return f1;
    }

    public int peak(int[] nums){
        int start=0,end=nums.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(mid <end && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(mid > start && nums[mid-1]>nums[mid]){
                return mid-1;
            }
            if(nums[start]==nums[mid] && nums[end]==nums[mid]){

                if(nums[start]>nums[start+1]){
                    return start;
                }
                start++;
                if(nums[end]<nums[end-1]){
                    return end-1;
                }
                end--;
            }
            else if(nums[start]<nums[mid]|| (nums[start]==nums[mid] && nums[mid]>nums[end])){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }
        return -1;
    }
    public boolean search1(int[] nums, int target,int index) {
        int s=0,e=index;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]<target){
                s=mid+1;
            }
            else if(nums[mid]>target){
                e=mid-1;
            }
            else{
                return true;
            }
        }
        return false;
    }
    public boolean search2(int[] nums, int target,int index) {
        int s=index+1,e=nums.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]<target){
                s=mid+1;
            }
            else if(nums[mid]>target){
                e=mid-1;
            }
            else{
                return true;
            }
        }
        return false;
    }
*/

}
