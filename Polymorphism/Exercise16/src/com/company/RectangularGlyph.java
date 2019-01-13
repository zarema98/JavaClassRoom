package com.company;

public class RectangularGlyph extends Glyph {
    private int height = 2;
    private int width = 6;

    public RectangularGlyph (int height, int width) {
        this.height = height;
        this.width = width;
        System.out.println("RectangularGlyph.RectangularGlyph(), height = " + height
                            + ", width = " + width);
    }

    @Override
    public void draw() {
        System.out.println("RectangularGlyph.draw(), height = " + height
                              + ", width = " + width);
    }
}
