package Problems;

import java.util.Arrays;

public class scratchPad {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int pos = 0;
        int[] newArr = new int[arr.length+1];
        for (int i = 0; i < newArr.length; i++) {
            if(i <= pos) newArr[i] = arr[i];
            else if(i == pos+1) newArr[i] = arr[pos];
            else newArr[i] = arr[i-1];
        }

        System.out.println(Arrays.toString(newArr));
    }
}
