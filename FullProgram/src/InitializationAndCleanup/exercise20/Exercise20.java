package InitializationAndCleanup.exercise20;

import com.company.Exercise;
import com.company.Main;

//: initialization/Exercise20.java
// вывод всех элементов массива args
public class Exercise20 extends Exercise {
    private String name = "Задание 20.";


    @Override
    public void exerciseName() {
        System.out.println(name);
    }

    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("    Напишите метод main(), использующий список аргументов переменной длины " + "\n" +
                "вместо обычного синтаксиса. Выведите все элементы полученного массива args.");
    }

    @Override
    public void getResult() {
        super.getResult();
        String []args = Main.comLineArgs;
        System.out.println("Command Line Args: ");
        for(String el: args)
            System.out.println(el);
    }

    @Override
    public void getCode() {
        super.getCode();
        System.out.println("--Exercise20.java--");
        System.out.println("//: initialization/Exercise20.java\n" +
                "// вывод всех элементов массива args\n" +
                "public class Exercise20 extends Exercise {\n" +
                "    private String name = \"Задание 20.\";\n" +
                "\n" +
                "    @Override\n" +
                "    public void getResult() {\n" +
                "        super.getResult();\n" +
                "        String[] args = Main.comLineArgs;\n" +
                "        System.out.println(\"Command Line Args: \");\n" +
                "        for (String el : args)\n" +
                "            System.out.println(el);\n" +
                "    }\n" +
                "\n" +
                "}");
    }
}
