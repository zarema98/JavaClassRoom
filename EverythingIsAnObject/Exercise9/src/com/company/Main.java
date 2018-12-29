package com.company;

public class Main {

    public static void getType(int i) {
        System.out.println(i + " is int");
    }

    public static void getType(Integer i) {
        System.out.println(i + " is Integer");
    }

    public static void main(String[] args) {
        Integer wrapperInteger = 45;
        int primitiveInt = wrapperInteger;

        Double wrapperDouble = 23.12;
        double promitiveDpuble = wrapperDouble;

        getType(wrapperInteger);
        getType(primitiveInt);


    }
}
