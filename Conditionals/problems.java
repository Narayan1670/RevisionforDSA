package com.company;
import java.util.Scanner;

//import static java.lang.Math.max;

public class problems {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //int a = in.nextInt();
        //int b = in.nextInt();
        //int c = in.nextInt();
         // find the largest number of the three:
       /*
        int max = a;
        if (b > max){
            max = b;
        }
        if (c > max){
            max = c;


        int max = max(c, max(a, b));

        System.out.println(max);


        char ch = in.next().trim().charAt(0);
        if (ch >= 'a' && ch <= 'z'){
            System.out.println("LowerCase");
        } else{
            System.out.println("UpperCase");
        }
        // fib no.
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while (count <= n){
            int temp = b;
            b = b + a;
            a = temp;
            count++;


        }
        System.out.println(b);


        // occurrence of numbers

        int n = in.nextInt();
        int x = in.nextInt();
        int count = 0;
        while(n > 0){
            int rem = n % 10;
            if (rem == x){
                count++;
            }
            n = n / 10;

        }
        System.out.println(count);






        // reverse of a no.:

        int n = in.nextInt();
        int ans = 0;
        while (n > 0){
            int rem = n % 10;
            n /= 10;

            ans = ans*10 + rem;

        }
        System.out.println(ans);



        //calculator app:
        int ans = 0;
        while(true){
            //take the operator as input
            System.out.println("enter the operator: ");
            char op = in.next().trim().charAt(0);
            if (op == '+'|| op == '-' || op == '*' || op == '%' || op == '/'){
                // input two num.
                System.out.println("Input the Numbers Please!");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (op == '+'){
                    ans = num1 + num2;
                }
                if (op == '-'){
                    ans = num1 - num2;
                }
                if (op == '*'){
                    ans = num1 * num2;
                }
                if (op == '/'){
                    if (num2 != 0){
                        ans = num1 / num2;
                    }

                }
                if (op == '%'){
                    ans = num1 % num2;

                }
            }else if (op == 'x' || op == 'X'){
                break;
            } else {
                System.out.println("invalid Operation!!");
            }
            System.out.println(ans);
        }


        */
    }
}
