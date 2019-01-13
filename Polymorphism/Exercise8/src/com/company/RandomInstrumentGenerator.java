package com.company;

import java.util.Random;

public class RandomInstrumentGenerator {
    Random rand = new Random(47);

    public Instrument next () {
        switch (rand.nextInt(5)) {
            default:
            case 0: return new Wind();
            case 1: return new Percussion();
            case 2: return new Stringed();
            case 3: return new Woodwind();
            case 4: return new Brass();
        }
    }
}
