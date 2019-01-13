package ControllingExecution.exercise16;

import com.company.Exercise;

import java.util.Random;

public class Exercise16 extends Exercise {
    private String name = "Задание 16.";
    private static final int AMOUNT_OF_NUMBERS = 25;
    private static void check (int number) {
        int currentNumber = new Random().nextInt(10) + 1;
        if (number > currentNumber)
            System.out.println(number + " > " + currentNumber);
         else if (number < currentNumber)
            System.out.println(number + " < " + currentNumber);
        else
            System.out.println(number + " = " + currentNumber);
    }

    @Override
    public void exerciseName() {
        System.out.println(name);
    }

    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("    Напишите программу, которая генерирует 25 случайных  " + "\n" +
                "значений типа int. Для каждого значения команда if-else сообщает, в каком " + "\n" +
                "отношении ого находится с другим случайно сгенерированным числом (больше, меньше, равно). " );
    }

    @Override
    public void getResult() {
       super.getResult();
        for(int i=0; i < AMOUNT_OF_NUMBERS; i++) {
            check(new Random().nextInt(30) + 1);
        }
    }

    @Override
    public void getCode() {
        super.getCode();
        System.out.println("--Exercise16.java--");
        System.out.println("public class Exercise16 extends Exercise {\n" +
                "    private String name = \"Задание 16.\";\n" +
                "    private static final int AMOUNT_OF_NUMBERS = 25;\n" +
                "\n" +
                "    private static void check(int number) {\n" +
                "        int currentNumber = new Random().nextInt(10) + 1;\n" +
                "        if (number > currentNumber)\n" +
                "            System.out.println(number + \" > \" + currentNumber);\n" +
                "        else if (number < currentNumber)\n" +
                "            System.out.println(number + \" < \" + currentNumber);\n" +
                "        else\n" +
                "            System.out.println(number + \" = \" + currentNumber);\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public void getResult() {\n" +
                "        super.getResult();\n" +
                "        for (int i = 0; i < AMOUNT_OF_NUMBERS; i++) {\n" +
                "            check(new Random().nextInt(30) + 1);\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "}");
    }
}

