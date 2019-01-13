package com.company;
public class Main {

    public static RandomInstrumentGenerator rand = new RandomInstrumentGenerator();
    public static void main(String[] args) {
        Instrument []instruments = new Instrument[10];
        for(int i=0; i < instruments.length; i++) {
            instruments[i] = rand.next();
        }

        Music.tuneAll(instruments);

    }
}
