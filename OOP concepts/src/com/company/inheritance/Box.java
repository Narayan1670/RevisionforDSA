package com.company.inheritance;

public class Box {
    double l;
    double h;
    double w;
//    double weight;


     Box () {
         this.h = -1;
         this.l = -1;
         this.w = -1;
     }

     // cube
    Box (double side) {

//         super(); object class

         this.h = side;
         this.w = side;
         this.l = side;
    }

    public Box(double l, double h, double w) {
        System.out.println("Box class constructor");
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box( Box old) {
         this.h = old.h;
         this.w = old.w;
         this.l = old.l;
    }
    public void  information() {
        System.out.println("Running the box");
    }
}
