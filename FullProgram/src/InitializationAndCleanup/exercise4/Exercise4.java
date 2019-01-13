package InitializationAndCleanup.exercise4;

import com.company.Exercise;

public class Exercise4 extends Exercise {
    private String name = "Задание 4.";

    @Override
    public void exerciseName() {
        System.out.println(name);
    }


    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("    Добавьте к классу из упражнения 3 перегруженный конструктор, " + "\n" +
                "принимающий в качестве параметра строку и распечатывающий ее вместе с сообщением. ");
    }

    @Override
    public void getResult() {
        super.getResult();
        new Student();
        new Student("Zarema");
    }

    @Override
    public void getCode() {
        super.getCode();
        System.out.println("--Student.java--");
        System.out.println("public class Student {\n" +
                "\n" +
                "    public Student() {\n" +
                "        System.out.println(\"I am a student\");\n" +
                "    }\n" +
                "\n" +
                "    public Student(String name) {\n" +
                "        System.out.println(name + \" is a student\");\n" +
                "    }\n" +
                "\n" +
                "}");
        System.out.println("--Exercise4.java--");
        System.out.println("public class Exercise4 extends Exercise {\n" +
                "    private String name = \"Задание 4.\";\n" +
                "\n" +
                "    @Override\n" +
                "    public void getResult() {\n" +
                "        super.getResult();\n" +
                "        new Student();\n" +
                "        new Student(\"Zarema\");\n" +
                "    }\n" +
                "\n" +
                "}");
    }

}
