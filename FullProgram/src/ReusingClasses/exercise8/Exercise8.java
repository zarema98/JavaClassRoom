package ReusingClasses.exercise8;

import com.company.Exercise;

public class Exercise8  extends Exercise {
    private String name = "Задание 8.";

    @Override
    public void exerciseName() {
        System.out.println(name);
    }



    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("    Создайте базовый класс с единственным конструктором, не являющимся " + "\n" +
                "конструктором по умолчанию, и производный класс с конструктором как по умолчанию (без аргументов), " + "\n" +
                "так и с аргументами. В конструкторе произвоздного класса вызовите конструктор базового класса. ");
    }

    @Override
    public void getResult() {
        super.getResult();
        new Student();
        new Student("Ann");
    }

    @Override
    public void getCode() {
        super.getCode();
        System.out.println("--Person.java--");
        System.out.println("public class Person {\n" +
                "   private int i;\n" +
                "    public Person(String name) {\n" +
                "        System.out.println(name + \" is a person (base class constructor)\");\n" +
                "    }\n" +
                "}\n");
        System.out.println("--Student.java--");
        System.out.println("public class Student extends Person {\n" +
                "    public Student() {\n" +
                "        super(\"Zarema\");\n" +
                "        System.out.println(\"Zarema is a student\");\n" +
                "    }\n" +
                "    public Student(String name) {\n" +
                "        super(name);\n" +
                "        System.out.println(name + \" is a student\");\n" +
                "\n" +
                "    }\n" +
                "}");
        System.out.println("--Exercise8.java--");
        System.out.println("public class Exercise8  extends Exercise {\n" +
                "    private String name = \"Задание 8.\";\n" +
                "\n" +
                "    @Override\n" +
                "    public void getResult() {\n" +
                "        super.getResult();\n" +
                "        new Student();\n" +
                "        new Student(\"Ann\");\n" +
                "    }\n" +
                "\n" +
                "}");
    }
}
