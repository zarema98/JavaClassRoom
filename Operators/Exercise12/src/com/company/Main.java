package com.company;

public class Main {
    public static final int BIT = 32;



    public static void main(String[] args) {
        int number = -1;
        System.out.println("number to binary: " + Integer.toBinaryString(number));
        number <<=2;
        System.out.println("number << 2 " + Integer.toBinaryString(number));

        for(int i=0; i < BIT; i ++) {
            number >>>= 1;
            System.out.println("number >>> 1 " + Integer.toBinaryString(number));
        }



    }
}
