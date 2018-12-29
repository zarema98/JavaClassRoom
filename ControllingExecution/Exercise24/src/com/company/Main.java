package com.company;

public class Main {
    private static int[] makeDigits (int number) {
        int []digits = new int[4];
        int i = 3;
        while (number > 0) {
            digits[i] = number % 10;
            number = number / 10;
            i--;
        }
        return digits;
    }
    private static void isVampire (int a, int b, int c, int d, int number) {
            if((a*10 + b) * (c*10 + d) == number)
                System.out.println (number + " = " + (a*10 + b) + " * " + (c*10 + d));
    }

    public static void main(String[] args) {
        int []temArr;
        for(int i=1000; i < 9999; i++) {
            temArr = makeDigits(i);
            isVampire(temArr[0], temArr[1], temArr[2], temArr[3], i);
            isVampire(temArr[0], temArr[1], temArr[3], temArr[2], i);
            isVampire(temArr[1], temArr[0], temArr[2], temArr[3], i);
            isVampire(temArr[1], temArr[0], temArr[3], temArr[2], i);
            isVampire(temArr[0], temArr[2], temArr[1], temArr[3], i);
            isVampire(temArr[0], temArr[2], temArr[3], temArr[1], i);
            isVampire(temArr[2], temArr[0], temArr[1], temArr[3], i);
            isVampire(temArr[2], temArr[0], temArr[3], temArr[1], i);
            isVampire(temArr[0], temArr[3], temArr[1], temArr[2], i);
            isVampire(temArr[0], temArr[3], temArr[2], temArr[1], i);
            isVampire(temArr[3], temArr[0], temArr[1], temArr[2], i);
            isVampire(temArr[3], temArr[0], temArr[2], temArr[1], i);
        }
    }
}
