package com.company;

public class WrapperExample {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;


        Integer a = 45;
        Integer b = 25;
        swap(a, b);


//        System.out.println(a + " " + b);

//        final int bonus = 2;
//        bonus = 6;
        final A kunal  = new A("Baba Yaga");
        kunal.name = "other name";

        //when a non-primitive is final, you cannot reassign
//        kunal = new A("new object");
        A obj = new A("jcvysivu");

        System.out.println(obj);
//        for (int i = 0; i < 1000000; i++) {
//            obj = new A("RAndom name");
//        }
    }
    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;

    }

}
 class A {
    final int num = 10;
    String name;

     public A(String name) {
//         System.out.println("object is being created");
         this.name = name;
     }

     @Override
     protected void finalize() throws Throwable {
         System.out.println("Object is destroyed");
     }
 }
