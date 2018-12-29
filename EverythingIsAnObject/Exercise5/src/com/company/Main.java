package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        DataOnly data = new DataOnly(new Random().nextInt(10), 23.4, false);

        System.out.println("i = " + data.getI() + '\n'
                + "d = " + data.getD() + '\n'
                + "b = " + data.getB()
        );


    }
}
