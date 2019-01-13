package com.company;

import java.util.Random;

public class RandomRodentGenerator {
    private Random rand = new Random(47);

    public Rodent next() {
        switch (rand.nextInt(2)) {
            default:
            case 0: return new Mouse();
            case 1: return new Hamster();
        }
    }
}
