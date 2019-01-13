package ReusingClasses.exercise4;

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
        System.out.println("    Докажите, что конструкторы базового класса: " + "\n" +
                "a) всегда вызываются " + "\n"  +
                "б) всегда вызываются перед исполнением констркуторов производного класса");
    }

    @Override
    public void getResult() {
        super.getResult();
        new Student();
    }

    @Override
    public void getCode() {
        super.getCode();
        System.out.println("--Person.java--");
        System.out.println("public class Person {\n" +
                "    public Person() {\n" +
                "        System.out.println(\"I am a person (base class constructor)\");\n" +
                "    }\n" +
                "\n" +
                "}\n");
        System.out.println("--Student.java--");
        System.out.println("public class Student extends Person {\n" +
                "    public Student() {\n" +
                "        System.out.println(\"I am a student\");\n" +
                "    }\n" +
                "}");
        System.out.println("--Exercise4.java--");
        System.out.println("public class Exercise4 extends Exercise {\n" +
                "    private String name = \"Задание 4.\";\n" +
                "\n" +
                "    @Override\n" +
                "    public void getResult() {\n" +
                "        super.getResult();\n" +
                "        new Student();\n" +
                "    }\n" +
                "\n" +
                "}");
    }
}
