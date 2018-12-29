package com.company;

public class Main {

    public static void main(String[] args) {
        long hexadecimal = 0x2fL;
        long octal = 0177L;

        System.out.println("hexadecimal (to binary): " + Long.toBinaryString(hexadecimal));
        System.out.println("octal (to binary): " + Long.toBinaryString(octal));

    }
}
