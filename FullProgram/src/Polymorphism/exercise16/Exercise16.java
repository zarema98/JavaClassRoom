package Polymorphism.exercise16;

import com.company.Exercise;

public class Exercise16  extends Exercise {
    private String name = "Задание 16";

    @Override
    public void exerciseName() {
        System.out.println(name);
    }

    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("    Включите класс RectangularGlyph в PolyConstructors.java. Продемонстрируйте " + "\n" +
                "проблему, описанную в этом разделе. ");
    }

    @Override
    public void getResult() {
        super.getResult();
        new RoundGlyph(5);
        new RectangularGlyph(10,24);
    }

    @Override
    public void getCode() {
        super.getCode();
        System.out.println("--Glyph.java--");
        System.out.println("public class Glyph {\n" +
                "    public void draw() {\n" +
                "        System.out.println(\"Glyph.draw()\");\n" +
                "    }\n" +
                "\n" +
                "    public Glyph () {\n" +
                "        System.out.println(\"Glyph() before draw()\");\n" +
                "        draw();\n" +
                "        System.out.println(\"Glyph() after draw()\");\n" +
                "    }\n" +
                "}");
        System.out.println("--RectangularGlyph.java--");
        System.out.println("public class RectangularGlyph extends Glyph {\n" +
                "    private int height = 2;\n" +
                "    private int width = 6;\n" +
                "\n" +
                "    public RectangularGlyph (int height, int width) {\n" +
                "        this.height = height;\n" +
                "        this.width = width;\n" +
                "        System.out.println(\"RectangularGlyph.RectangularGlyph(), height = \" + height\n" +
                "                            + \", width = \" + width);\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public void draw() {\n" +
                "        System.out.println(\"RectangularGlyph.draw(), height = \" + height\n" +
                "                              + \", width = \" + width);\n" +
                "    }\n" +
                "}");
        System.out.println("--RoundGlyph.java--");
        System.out.println("public class RoundGlyph extends Glyph {\n" +
                "    private int radius = 1;\n" +
                "\n" +
                "    public RoundGlyph (int radius) {\n" +
                "        this.radius = radius;\n" +
                "        System.out.println(\"RoundGlyph.RoundGlyph(), radius = \" + radius);\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public void draw() {\n" +
                "        System.out.println(\"RoundGlyph.draw(), radius = \" + radius);\n" +
                "    }\n" +
                "}");
        System.out.println("--Exercise16.java--");
        System.out.println("public class Exercise16  extends Exercise {\n" +
                "    private String name = \"Задание 16\";\n" +
                "\n" +
                "    @Override\n" +
                "    public void getResult() {\n" +
                "        super.getResult();\n" +
                "        new RoundGlyph(5);\n" +
                "        new RectangularGlyph(10, 24);\n" +
                "    }\n" +
                "\n" +
                "}");
    }

}
