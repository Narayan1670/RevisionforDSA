package patterns;

import java.util.Arrays;

public class MergerSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        arr = mergerSort(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5};
        int[] ans = AnotherMerge(arr1,arr2, arr1.length, arr2.length);
        System.out.println(Arrays.toString(ans));

    }
    static int[] mergerSort(int[] arr) {
        if(arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;

        int[] left = mergerSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergerSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);

    }

    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];

        int i = 0, j = 0, k = 0;

        while(i < first.length && j < second.length) {
            if(first[i] < second[j]) {
                mix[k++] = first[i++];

            } else {
                mix[k++] = second[j++];

            }

        }

        // it may be possible that one of the arrays is not complete
        // copy the remaining elements
        while(i < first.length) {
            mix[k++] = first[i++];

        }
        while(j < second.length) {
            mix[k++] = second[j++];

        }

        return mix;
    }

    public static int[] AnotherMerge(int[] first, int[] second, int m, int n) {
        int[] mix = new int[m + n];

        int i = 0, j = 0, k = 0;

        while(i < m && j < n) {
            if(first[i] < second[j]) {
                mix[k++] = first[i++];

            } else {
                mix[k++] = second[j++];

            }

        }

        // it may be possible that one of the arrays is not complete
        // copy the remaining elements
        while(i < first.length) {
            mix[k++] = first[i++];

        }
        while(j < second.length) {
            mix[k++] = second[j++];

        }

        return mix;
    }
}
