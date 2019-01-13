package com.company;

public class Tank {
    private int capacity;
    public Tank() {
        this(0);
    }
    public Tank(int fullness) {
        capacity = fullness;
    }

    public void checkHowFull() {
        if(capacity == 0) System.out.println("Tank is empty");
        else System.out.println("Tank capacity = " + capacity);
    }
    public void clean() {
        capacity = 0;
    }
    protected void finalize() {
        if(capacity != 0)
            System.out.println("Error: Tank is not empty");
    }
}
