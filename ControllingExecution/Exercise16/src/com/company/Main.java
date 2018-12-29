package com.company;

import java.util.Random;

public class Main {
    private static final int AMOUNT_OF_NUMBERS = 25;
    private static void check (int number) {
        int currentNumber = new Random().nextInt(10) + 1;
        if (number > currentNumber)
            System.out.println(number + " > " + currentNumber);
         else if (number < currentNumber)
            System.out.println(number + " < " + currentNumber);
        else
            System.out.println(number + " = " + currentNumber);
    }

    public static void main(String[] args) {
        for(int i=0; i < AMOUNT_OF_NUMBERS; i++) {
            check(new Random().nextInt(30) + 1);
        }
    }
}

