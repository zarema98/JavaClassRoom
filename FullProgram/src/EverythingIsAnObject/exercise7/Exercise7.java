package EverythingIsAnObject.exercise7;

import com.company.Exercise;

public class Exercise7 extends Exercise {
    private String name = "Задание 7.";

    @Override
    public void exerciseName() {
        System.out.println(name);
    }

    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("    Превратите фрагменты кода с классом Incrementable в работающую программу.  ");
    }

    @Override
    public void getResult() {
        super.getResult();
        StaticTest.i++;
        Incrementable.increment();
        System.out.println("i is: " + StaticTest.getI());
    }

    @Override
    public void getCode() {
        super.getCode();
        System.out.println("--StaticTest.java--");
        System.out.println("public class StaticTest {\n" +
                "    static int i = 47;\n" +
                "\n" +
                "    public static int getI() {\n" +
                "        return i;\n" +
                "    }\n" +
                "}\n");
        System.out.println("--Incrementable.java--");
        System.out.println("public class Incrementable {\n" +
                "    static void increment () {\n" +
                "        StaticTest.i++;\n" +
                "    }\n" +
                "}\n");
        System.out.println("--Exercise7--");
        System.out.println("public class Exercise7 extends Exercise {\n" +
                "    private String name = \"Задание 7.\";\n" +
                "\n" +
                "    @Override\n" +
                "    public void getResult() {\n" +
                "        super.getResult();" +
                "        StaticTest.i++;\n" +
                "        Incrementable.increment();\n" +
                "        System.out.println(\"i is: \" + StaticTest.getI());\n" +
                "    }\n" +
                "\n" +
                "}");

    }
}
