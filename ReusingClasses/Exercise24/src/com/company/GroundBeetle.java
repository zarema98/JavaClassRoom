package com.company;

public class GroundBeetle extends Beetle {
    private int a = printInit("GroundBeetle.a initialized");
    public GroundBeetle() {
        System.out.println("a = " + a);
        System.out.println("j = " + j);
    }
    private static int x3 = printInit("static GroundBeetle.x3 initialized");
}
