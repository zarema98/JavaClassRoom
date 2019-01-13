package com.company;

public class Root {
    private Component1 component1;
    private Component2 component2;
    private Component3 component3;
    public Root() {
        System.out.println("Root constructor");
        component1 = new Component1();
        component2 = new Component2();
        component3 = new Component3();
    }
    public void dispose () {
        component3.dispose();
        component2.dispose();
        component1.dispose();
        System.out.println("Completion of Root...");
    }
}
