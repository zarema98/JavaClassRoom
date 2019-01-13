package EverythingIsAnObject.exercise8;

import com.company.Exercise;

public class Exercise8 extends Exercise {
    private String name = "Задание 8.";

    @Override
    public void exerciseName() {
        System.out.println(name);
    }

    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("    Напишите программу, которая демонстрирует, что независимо " + "\n" +
                "от количества созданных объектов класс содержит только один " + "\n" +
                "экземпляр поля static. ");
    }

    @Override
    public void getResult() {
        super.getResult();
        StaticTest first = new StaticTest();
        StaticTest second = new StaticTest();

        first.i -= 2;
        second.i += 1;

        System.out.println("first.i (" + first.i+") == second.i (" + second.i + ")");
    }

    @Override
    public void getCode() {
        super.getCode();
        System.out.println("--StaticTest.java--");
        System.out.println("public class StaticTest {\n" +
                "    public static int i = 10;\n" +
                "}\n");
        System.out.println("--Exercise8.java--");
        System.out.println("public class Exercise8 extends Exercise {\n" +
                "    private String name = \"Задание 8.\";\n" +
                "\n" +
                "    @Override\n" +
                "    public void getResult() {\n" +
                "        super.getResult();\n" +
                "        StaticTest first = new StaticTest();\n" +
                "        StaticTest second = new StaticTest();\n" +
                "\n" +
                "        first.i -= 2;\n" +
                "        second.i += 1;\n" +
                "\n" +
                "        System.out.println(\"first.i (\" + first.i + \") == second.i (\" + second.i + \")\");\n" +
                "    }\n" +
                "\n" +
                "}");

    }
}
