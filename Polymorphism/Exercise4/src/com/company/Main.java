package com.company;

public class Main {
    private static RandomShapeGenerator rand = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape [] shapes = new Shape[10];
        for(int i=0; i < shapes.length; i++)
            shapes[i] = rand.next();
        for(Shape el: shapes){
            el.draw();
            el.erase();
        }

    }
}
