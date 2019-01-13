package com.company;

public class Student extends Person {
    public Student() {
        super("Zarema");
        System.out.println("Zarema is a student");
    }
    public Student(String name) {
        super(name);
        System.out.println(name + " is a student");

    }

}
