package Polymorphism.exercise12;

import com.company.Exercise;

public class Exercise12 extends Exercise {
    private String name = "Задание 12";
public static RandomRodentGenerator rand = new RandomRodentGenerator();

    @Override
    public void exerciseName() {
        System.out.println(name);
    }

    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("    Измените упражнение 9 так, чтобы программа демонстрировала порядок инициализации " + "\n" +
                "базовых и производных классов. Включите встроенные объекты и в базовые, и в производные " + "\n" +
                "классы, и покажите, в каком порядке проходит их инициализация при конструировании объекта. ");
    }

    @Override
    public void getResult() {
        super.getResult();
        Rodent []rodents = new Rodent[5];
        for(int i=0; i < rodents.length; i++)
            rodents[i] = rand.next();
        for(Rodent rodent: rodents) {
            System.out.println(rodent);
            rodent.eat();
        }
    }

    @Override
    public void getCode() {
        super.getCode();
        System.out.println("--Rodent.java--");
        System.out.println("public class Rodent {\n" +
                "    private String name = \"Rodent\";\n" +
                "    private Characteristic c = new Characteristic(\"has tail\");\n" +
                "    private Description d = new Description(\"About rodent\");\n" +
                "    public Rodent () {\n" +
                "        System.out.println(\"Rodent constructor\");\n" +
                "    }\n" +
                "    protected void eat () {\n" +
                "        System.out.println(\"Rodent.eat()\");\n" +
                "    }\n" +
                "\n" +
                "    protected void sleep () {\n" +
                "        System.out.println(\"Rodent.sleep()\");\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public String toString() { return name; }\n" +
                "}\n" +
                "\n" +
                "class Characteristic {\n" +
                "    private String s;\n" +
                "    Characteristic(String s) {\n" +
                "        this.s = s;\n" +
                "        System.out.println(\"Creating Characteristic \" + s);\n" +
                "    }\n" +
                "}\n" +
                "class Description {\n" +
                "    private String s;\n" +
                "    Description(String s) {\n" +
                "        this.s = s;\n" +
                "        System.out.println(\"Creating Description \" + s);\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "\n" +
                "class Mouse extends Rodent {\n" +
                "    private String name = \"Mouse\";\n" +
                "    private Characteristic c = new Characteristic(\"eats cheese\");\n" +
                "    private Description d = new Description(\"About mouse\");\n" +
                "    public Mouse () {\n" +
                "        System.out.println(\"Mouse constructor\");\n" +
                "    }\n" +
                "    @Override\n" +
                "    protected void eat() {\n" +
                "        System.out.println(\"Mouse.eat()\");\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    protected void sleep() {\n" +
                "        System.out.println(\"Mouse.sleep()\");\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public String toString() { return name; }\n" +
                "}\n" +
                "\n" +
                "class Hamster extends Rodent {\n" +
                "    private String name = \"Hamster\";\n" +
                "    private Characteristic c = new Characteristic(\"eats corn\");\n" +
                "    private Description d = new Description(\"About Hamster\");\n" +
                "    public Hamster () {\n" +
                "        System.out.println(\"Hamster constructor\");\n" +
                "    }\n" +
                "    @Override\n" +
                "    protected void eat() {\n" +
                "        System.out.println(\"Hamster.eat()\");\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    protected void sleep() {\n" +
                "        System.out.println(\"Hamster.sleep()\");\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public String toString() {\n" +
                "        return name;\n" +
                "    }\n" +
                "}\n");
        System.out.println("--RandomRodentGenerator.java--");
        System.out.println("public class RandomRodentGenerator {\n" +
                "    private Random rand = new Random(47);\n" +
                "\n" +
                "    public Rodent next() {\n" +
                "        switch (rand.nextInt(2)) {\n" +
                "            default:\n" +
                "            case 0: return new Mouse();\n" +
                "            case 1: return new Hamster();\n" +
                "        }\n" +
                "    }\n" +
                "}");
        System.out.println("--Exercise12.java--");
        System.out.println("public class Exercise12 extends Exercise {\n" +
                "    private String name = \"Задание 12\";\n" +
                "    public static RandomRodentGenerator rand = new RandomRodentGenerator();\n" +
                "\n" +
                "    @Override\n" +
                "    public void getResult() {\n" +
                "        super.getResult();\n" +
                "        Rodent[] rodents = new Rodent[5];\n" +
                "        for (int i = 0; i < rodents.length; i++)\n" +
                "            rodents[i] = rand.next();\n" +
                "        for (Rodent rodent : rodents) {\n" +
                "            System.out.println(rodent);\n" +
                "            rodent.eat();\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "}");
    }

}
