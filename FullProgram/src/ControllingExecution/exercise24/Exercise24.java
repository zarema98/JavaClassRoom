package ControllingExecution.exercise24;

import com.company.Exercise;

public class Exercise24 extends Exercise {
    private String name = "Задание 24.";

    private static int[] makeDigits (int number) {
        int []digits = new int[4];
        int i = 3;
        while (number > 0) {
            digits[i] = number % 10;
            number = number / 10;
            i--;
        }
        return digits;
    }

    private static void isVampire (int a, int b, int c, int d, int number) {
            if((a*10 + b) * (c*10 + d) == number)
                System.out.println (number + " = " + (a*10 + b) + " * " + (c*10 + d));
    }



    @Override
    public void exerciseName() {
        System.out.println(name);
    }

    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("    Вампирами называются числа, состоящие из четного количества цифр " + "\n" +
                "и полученные перемножением пары чисел, каждое из которых содержит половину цифр " + "\n" +
                "резкльтата. Напишите программу, которая находит всех вампиров состоящих из 4 цифр. ");
    }

    @Override
    public void getResult() {
        super.getResult();
        int []temArr;
        for(int i=1000; i < 9999; i++) {
            temArr = makeDigits(i);
            isVampire(temArr[0], temArr[1], temArr[2], temArr[3], i);
            isVampire(temArr[0], temArr[1], temArr[3], temArr[2], i);
            isVampire(temArr[1], temArr[0], temArr[2], temArr[3], i);
            isVampire(temArr[1], temArr[0], temArr[3], temArr[2], i);
            isVampire(temArr[0], temArr[2], temArr[1], temArr[3], i);
            isVampire(temArr[0], temArr[2], temArr[3], temArr[1], i);
            isVampire(temArr[2], temArr[0], temArr[1], temArr[3], i);
            isVampire(temArr[2], temArr[0], temArr[3], temArr[1], i);
            isVampire(temArr[0], temArr[3], temArr[1], temArr[2], i);
            isVampire(temArr[0], temArr[3], temArr[2], temArr[1], i);
            isVampire(temArr[3], temArr[0], temArr[1], temArr[2], i);
            isVampire(temArr[3], temArr[0], temArr[2], temArr[1], i);
        }

    }

    @Override
    public void getCode() {
        super.getCode();
        System.out.println("--Exercise24.java--");
        System.out.println("public class Exercise24 extends Exercise {\n" +
                "    private String name = \"Задание 24.\";\n" +
                "\n" +
                "    private static int[] makeDigits(int number) {\n" +
                "        int[] digits = new int[4];\n" +
                "        int i = 3;\n" +
                "        while (number > 0) {\n" +
                "            digits[i] = number % 10;\n" +
                "            number = number / 10;\n" +
                "            i--;\n" +
                "        }\n" +
                "        return digits;\n" +
                "    }\n" +
                "\n" +
                "    private static void isVampire(int a, int b, int c, int d, int number) {\n" +
                "        if ((a * 10 + b) * (c * 10 + d) == number)\n" +
                "            System.out.println(number + \" = \" + (a * 10 + b) + \" * \" + (c * 10 + d));\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public void getResult() {\n" +
                "        super.getResult();\n" +
                "        int[] temArr;\n" +
                "        for (int i = 1000; i < 9999; i++) {\n" +
                "            temArr = makeDigits(i);\n" +
                "            isVampire(temArr[0], temArr[1], temArr[2], temArr[3], i);\n" +
                "            isVampire(temArr[0], temArr[1], temArr[3], temArr[2], i);\n" +
                "            isVampire(temArr[1], temArr[0], temArr[2], temArr[3], i);\n" +
                "            isVampire(temArr[1], temArr[0], temArr[3], temArr[2], i);\n" +
                "            isVampire(temArr[0], temArr[2], temArr[1], temArr[3], i);\n" +
                "            isVampire(temArr[0], temArr[2], temArr[3], temArr[1], i);\n" +
                "            isVampire(temArr[2], temArr[0], temArr[1], temArr[3], i);\n" +
                "            isVampire(temArr[2], temArr[0], temArr[3], temArr[1], i);\n" +
                "            isVampire(temArr[0], temArr[3], temArr[1], temArr[2], i);\n" +
                "            isVampire(temArr[0], temArr[3], temArr[2], temArr[1], i);\n" +
                "            isVampire(temArr[3], temArr[0], temArr[1], temArr[2], i);\n" +
                "            isVampire(temArr[3], temArr[0], temArr[2], temArr[1], i);\n" +
                "        }\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "}");

    }
}
