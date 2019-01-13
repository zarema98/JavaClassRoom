package com.company;

public class RoundGlyph extends Glyph {
    private int radius = 1;

    public RoundGlyph (int radius) {
        this.radius = radius;
        System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
    }

    @Override
    public void draw() {
        System.out.println("RoundGlyph.draw(), radius = " + radius);
    }
}
