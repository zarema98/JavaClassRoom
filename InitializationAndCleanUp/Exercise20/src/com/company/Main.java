package com.company;
//: initialization/Main.java
// вывод всех элементов массива args
public class Main {

    public static void main(String... args) {
        for(String el: args)
            System.out.println(el);

    }
}
