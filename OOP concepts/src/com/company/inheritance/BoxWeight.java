package com.company.inheritance;

public class BoxWeight extends Box{
    double weight;


    public BoxWeight() {

        this.weight = -1;
    }
    BoxWeight (BoxWeight other) {
        super(other);
        weight = other.weight;
    }

    BoxWeight (double side, double weight) {
        super(side);
        this.weight = weight;
    }


    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);// care for it // calls the parent class constructor
        // used to initialise values present in the parent class

//        System.out.println(super.weight);// to access the parent class weight and not the child class weight
//        System.out.println(this.weight);// to access the child class weight

        this.weight = weight;
//        super(l, h, w); // gives error cause parent class has no knowledge of child class
    }
}
