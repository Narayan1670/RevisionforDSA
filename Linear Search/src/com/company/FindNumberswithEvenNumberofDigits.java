package com.company;

public class FindNumberswithEvenNumberofDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
       // System.out.println(EvenNumbers(nums));
       // System.out.println(findNumbers(nums));
        System.out.println(digits(32546));
       // System.out.println(digits(-356365));
       // System.out.println(digits(0));
        System.out.println(digits2(32546));


    }
    /*
    // My code:
    static int EvenNumbers(int[] nums){
        int count  = 0;
        for(int num : nums){
            if(even(num) % 2 == 0){
                count++;
            }
        }

        return count;
    }
    static int even(int num){
        int coun = 0;
        while(num > 0){
            coun++;
            num = num / 10;
        }
        return coun;
    }
}

     */
    static int findNumbers(int[] nums){
        int count = 0;
        for (int num : nums){
            if (even(num)){
                count++;
            }
        }

            return count;
    }
//  function to check whether a number contains even digits or not
     static boolean even(int num) {
         int numberofdigits = digits(num);
         /*
         if (numberofdigits % 2 == 0){
             return true;
         }
         return false;
          */
         return numberofdigits % 2 == 0;
     }
    //count number of digits in a number
    static int digits(int num){
        if (num == 0){
            return 1;
        }

        if (num < 0){
            num = num * -1;
        }

        int count = 0;
        while(num > 0){
            count++;
            num = num / 10;
        }

        return count;
    }
    // optimising the above code
    static int digits2(int num){
        if (num < 0) num = num * -1;
        return (int)(Math.log10(num)) + 1;
    }
}
