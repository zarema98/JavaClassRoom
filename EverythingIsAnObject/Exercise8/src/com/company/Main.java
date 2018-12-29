package com.company;

public class Main {

    public static void main(String[] args) {
        StaticTest first = new StaticTest();
        StaticTest second = new StaticTest();

        first.i -= 2;
        second.i += 1;

        System.out.println("first.i (" + first.i+") == second.i (" + second.i + ")");
    }
}
