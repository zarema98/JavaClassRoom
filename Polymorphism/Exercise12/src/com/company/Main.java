package com.company;

public class Main {
public static RandomRodentGenerator rand = new RandomRodentGenerator();
    public static void main(String[] args) {
        Rodent []rodents = new Rodent[5];
        for(int i=0; i < rodents.length; i++)
            rodents[i] = rand.next();
        for(Rodent rodent: rodents) {
            System.out.println(rodent);
            rodent.eat();
        }

    }
}
