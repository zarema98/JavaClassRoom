package com.company;

public class Amphibian {

    public void sleep () {
        System.out.println("Amphibian is sleeping");
    }

    public void jump () {
        System.out.println("Amphibian jumps");
    }

    public static void eat (Amphibian amphibian) {
        System.out.println("Amphibian is eating");
        amphibian.sleep();
    }
}
