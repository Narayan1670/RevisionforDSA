package com.company;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public String getDuplicateElement() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the size of an array");

            int n = scanner.nextInt();

            int[] arr = new int[n];
            System.out.println("Enter the array elements");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            System.out.println("Enter the position of the element to be replicated");
            int pos = scanner.nextInt();

            int[] newArr = new int[n+1];
            for (int i = 0; i < newArr.length; i++) {
                if (i <= pos) newArr[i] = arr[i];
                else if(i == pos+1) newArr[i] = arr[pos];
                else newArr[i] = arr[i-1];
            }
//            for (int j : newArr) {
//                System.out.print(j + " ");
//            }
            System.out.println(Arrays.toString(newArr));
        }
        catch (ArrayIndexOutOfBoundsException ignore ) {
            return "Array index is out of range";
        } catch (InputMismatchException ignore) {
            return "Input was not in correct format";
        } catch (NegativeArraySizeException ignore) {
            return "Array size should be positive";
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(new Main().getDuplicateElement());
    }

}

