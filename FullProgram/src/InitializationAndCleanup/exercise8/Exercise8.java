package InitializationAndCleanup.exercise8;

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
        System.out.println("    Создайте класс с двумя методами. В первом методе дважды вызовите второй " + "\n" +
                "метод: один раз без ключевого словуа this, а во второй с this.");
    }

    @Override
    public void getResult() {
        super.getResult();
        new Student().displayInfo("Zarema");
    }

    @Override
    public void getCode() {
        super.getCode();
        System.out.println("--Student.java--");
        System.out.println("//: initialization/Student.java\n" +
                "//пример вызова метода с ключевым словом this и без\n" +
                "public class Student {\n" +
                "    private void info (String name) {\n" +
                "        System.out.println(name + \" is a student\");\n" +
                "    }\n" +
                "\n" +
                "    public void displayInfo (String name) {\n" +
                "        info(name);\n" +
                "        this.info(name);\n" +
                "    }\n" +
                "}");
        System.out.println("--Exercise8.java--");
        System.out.println("public class Exercise8 extends Exercise {\n" +
                "    private String name = \"Задание 8.\";\n" +
                "\n" +
                "    @Override\n" +
                "    public void getResult() {\n" +
                "        super.getResult();\n" +
                "        new Student().displayInfo(\"Zarema\");\n" +
                "    }\n" +
                "}");
    }
}
