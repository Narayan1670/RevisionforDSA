package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student Vishnu = new Student();
//        Vishnu.rno = 2;
//        Vishnu.name = "Vish";
//        Vishnu.marks = 56.6f;
        System.out.println(Vishnu.name);
        System.out.println(Vishnu.rno);
        System.out.println(Vishnu.marks);

//        Vishnu.warning();

//        Student random = new Student(Vishnu);
        Student random2 = new Student();
        System.out.println(random2.name);
    }

}
class Student {
    int rno;
    String name;
    float marks;

    void warning() {
        System.out.println("DANGER!!! " + name);
    }

    void changeName(String name) {
        this.name = name;
    }
    Student (Student other) {
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }


    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
    Student() {
        // this is how you call constructor from another constructor
        // internally: new Student()
        this (17, "Bumble", 100.0f);
    }
}
