package Operators.exercise8;

import com.company.Exercise;

public class Exercise8 extends Exercise {
    private String name = "Задание 8";


    @Override
    public void exerciseName() {
        System.out.println(name);
    }

    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("    Покажите, что шестнадцатиричная и восьмеричная записи " +
                "могут использоваться с типом long. ");
    }

    @Override
    public void getResult() {
        super.getResult();
        long hexadecimal = 0x2fL;
        long octal = 0177L;

        System.out.println("hexadecimal (to binary): " + Long.toBinaryString(hexadecimal));
        System.out.println("octal (to binary): " + Long.toBinaryString(octal));
    }

    @Override
    public void getCode() {
        super.getCode();
        System.out.println("--Exercise8.java--");
        System.out.println("public class Exercise8 extends Exercise {\n" +
                "    private String name = \"Задание 8\";\n" +
                "\n" +
                "    @Override\n" +
                "    public void getResult() {\n" +
                "        super.getResult();\n" +
                "        long hexadecimal = 0x2fL;\n" +
                "        long octal = 0177L;\n" +
                "\n" +
                "        System.out.println(\"hexadecimal (to binary): \" + Long.toBinaryString(hexadecimal));\n" +
                "        System.out.println(\"octal (to binary): \" + Long.toBinaryString(octal));\n" +
                "    }\n" +
                "\n" +
                "}");

    }
}
