package com.company;

public class Main {

    public static void main(String[] args) {
        Storage doubledStorage = new Storage();
        int length = doubledStorage.storage("Some storage");
        System.out.println("Doubled length of string: " + length);

    }
}
