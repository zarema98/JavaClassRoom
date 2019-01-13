package Polymorphism.exercise4;

import com.company.Exercise;

public class Exercise4 extends Exercise {
    private String name = "Задание 4";
    private static RandomShapeGenerator rand = new RandomShapeGenerator();

    @Override
    public void exerciseName() {
        System.out.println(name);
    }

    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("    Добавьте новый подтип Shape к программе Shapes.java и проверьте, что полиморфизм " + "\n" +
                "работает правильно для вышего нового типа, так же как и для старых типов. ");
    }

    @Override
    public void getResult() {
        super.getResult();
        Shape [] shapes = new Shape[10];
        for(int i=0; i < shapes.length; i++)
            shapes[i] = rand.next();
        for(Shape el: shapes){
            el.draw();
            el.erase();
        }
    }

    @Override
    public void getCode() {
        super.getCode();
        System.out.println("--Shape.java--");
        System.out.println("public class Shape {\n" +
                "    public void draw () {\n" +
                "        System.out.println(\"Shape.draw ()\");\n" +
                "    }\n" +
                "    public void erase() {\n" +
                "        System.out.println(\"Shape.erase()\");\n" +
                "    }\n" +
                "}");
        System.out.println("--Circle.java--");
        System.out.println("public class Circle extends Shape {\n" +
                "    @Override\n" +
                "    public void draw() {\n" +
                "        System.out.println(\"Circle.draw()\");\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public void erase() {\n" +
                "        System.out.println(\"Circle.erase()\");\n" +
                "    }\n" +
                "}");
        System.out.println("--Square.java--");
        System.out.println("public class Square extends Shape {\n" +
                "    @Override\n" +
                "    public void draw() {\n" +
                "        System.out.println(\"Square.draw()\");\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public void erase() {\n" +
                "        System.out.println(\"Square.erase()\");\n" +
                "    }\n" +
                "}");
        System.out.println("--Triangle.java--");
        System.out.println("public class Triangle extends Shape {\n" +
                "    @Override\n" +
                "    public void draw() {\n" +
                "        System.out.println(\"Triangle.draw()\");\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public void erase() {\n" +
                "        System.out.println(\"Triangle.erase()\");\n" +
                "    }\n" +
                "}\n");
        System.out.println("--Trapezium.java--");
        System.out.println("public class Trapezium extends Shape {\n" +
                "    @Override\n" +
                "    public void draw() {\n" +
                "        System.out.println(\"Trapezium.draw()\");\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public void erase() {\n" +
                "        System.out.println(\"Trapezium.erase()\");\n" +
                "    }\n" +
                "}");
        System.out.println("--RandomShapeGenerator.java--");
        System.out.println("import java.util.Random;\n" +
                "public class RandomShapeGenerator {\n" +
                "    private Random rand = new Random(47);\n" +
                "    public Shape next() {\n" +
                "        switch (rand.nextInt(4)) {\n" +
                "            default:\n" +
                "            case 0:\n" +
                "                return new Circle();\n" +
                "            case 1:\n" +
                "                return new Square();\n" +
                "            case 2:\n" +
                "                return new Triangle();\n" +
                "            case 3:\n" +
                "                return new Trapezium();\n" +
                "\n" +
                "        }\n" +
                "    }\n" +
                "}");
        System.out.println("--Exercise4.java--");
        System.out.println("public class Exercise4 extends Exercise {\n" +
                "    private String name = \"Задание 4\";\n" +
                "    private static RandomShapeGenerator rand = new RandomShapeGenerator();\n" +
                "\n" +
                "    @Override\n" +
                "    public void getResult() {\n" +
                "        super.getResult();\n" +
                "        Shape[] shapes = new Shape[10];\n" +
                "        for (int i = 0; i < shapes.length; i++)\n" +
                "            shapes[i] = rand.next();\n" +
                "        for (Shape el : shapes) {\n" +
                "            el.draw();\n" +
                "            el.erase();\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "}");
    }
}
