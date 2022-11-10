package com.company;
import java.util.Scanner;

public class While_learn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        String fruit = in.next();

        switch (fruit) {
            // for enhanced switch : ctrl + enter
            case "mango" -> System.out.println("king of fruits");
            case "banana" -> System.out.println("instant energy");
            default -> System.out.println("enter a valid fruit");
        }




        int day = in.nextInt();
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekdays");
            case 6, 7 -> System.out.println("Weekend");
        }

         */
        // nested switch:
        int empID = in.nextInt();
        String department = in.next();
        switch (empID) {
            case 1 -> System.out.println("Vishnu Rai");
            case 2 -> System.out.println("Ankit Rai");
            case 3 -> {
                System.out.println("Emp Number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No Department Is Found");
                }
            }
            default -> System.out.println("Enter Correct EmpID");
        }



    }

}