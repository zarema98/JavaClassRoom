package com.company;

public class Main {

    public static void main(String[] args) {
        StaticTest.i++;
        Incrementable.increment();
        System.out.println("i is: " + StaticTest.getI());
    }
}
