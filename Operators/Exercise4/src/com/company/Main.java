package com.company;

public class Main {
    public static final float S = 120.0f;
    public static final float T = 2.0f;

    public static float getV (float S, float T) {
        if(T == 0) return 0f;
        else return S/T;
    }

    public static void main(String[] args) {
       float V =  getV(S, T);
        System.out.println("V = S / T = " + S + " / " + T + " = " + V);
    }
}
