package com.company;

public class Main {

    public static void main(String[] args) {
        Tank tank1 = new Tank();
        Tank tank2 = new Tank(6);
        Tank tank3 = new Tank(2);

        tank2.clean();

        new Tank(11);
        System.out.println("Current tanks:");
        System.out.println("Tank 1: ");
        tank1.checkHowFull();
        System.out.println("Tank 2: ");
        tank2.checkHowFull();
        System.out.println("Tank 3: ");
        tank3.checkHowFull();
        System.out.println("gc():");
        System.gc();

        System.out.println("gc():");
        System.gc();

    }
}
