package com.company;

import java.util.ArrayList;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] nums = {1,2,3,3,3,4,5};
        int target = 3;
        System.out.println(linearRec(arr, target, 0));
        System.out.println(findIndex(arr, target, 0));
        System.out.println(findIndexLast(arr, 1, arr.length - 1));
        findAllIndex(nums,target, 0);
        System.out.println(list);
    }
    static boolean linearRec(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || linearRec(arr, target, index + 1);
    }
    static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        else {
            return findIndex(arr, target, index + 1);
        }

    }
    static int findIndexLast(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        else {
            return findIndexLast(arr, target, index - 1);
        }

    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return ;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        findAllIndex(arr, target, index + 1);
    }
    static ArrayList findAllIndex1(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex1(arr, target, index + 1, list);

    }
}
