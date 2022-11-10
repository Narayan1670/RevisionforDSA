package com.company.inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box1 = new Box(4, 8, 9);
//        Box box2 = new Box(box1);
//        System.out.println(box1.h + " " + box1.w + " " + box1.l);
//        BoxWeight box3 = new BoxWeight();
//        BoxWeight box4 = new BoxWeight(2, 3, 4, 8);
//        System.out.println(box3.h + " " + box3.weight);


//        Box box5 = new BoxWeight(2, 3, 4, 8);
//        referencing a parent object to a child object(possible)
//        System.out.println(box5.w);
//        System.out.println(box5.weight); cannot access
//        BoxWeight box6 = new Box(1,2,3);
//        referencing a child object to a parent object(Not Possible)
//        System.out.println(box6.w);
        BoxPrice box = new BoxPrice(5, 8, 200);

        BoxPrice box7 = new BoxPrice(2, 3, 4, 5,300);
        System.out.println(box7.price);
    }
}
