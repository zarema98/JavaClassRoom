package Operators.exercise12;

import com.company.Exercise;

public class Exercise12 extends Exercise {
    private String name = "Задание 12";
    private static  final int AMOUNT_OF_BIT = 32;

    @Override
    public void exerciseName() {
        System.out.println(name);
    }

    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("    Начните с числа, состоящего из двоичных единиц. Сдвиньте его влево, " + "\n" +
                "а затем используйте беззнаковый оператор сдвига вправо по всем двоимчным " + "\n" +
                "позициям, с выводом всех промежуточных результатов.  ");
    }

    @Override
    public void getResult() {
        super.getResult();
        int number = -1;
        System.out.println("number to binary: " + Integer.toBinaryString(number));
        number <<=2;
        System.out.println("number << 2 " + Integer.toBinaryString(number));

        for(int i=0; i < AMOUNT_OF_BIT; i ++) {
            number >>>= 1;
            System.out.println("number >>> 1 " + Integer.toBinaryString(number));
        }
    }

    @Override
    public void getCode() {
        super.getCode();
        System.out.println("--Exercise12.java--");
        System.out.println("public class Exercise12 extends Exercise {\n" +
                "    private String name = \"Задание 12\";\n" +
                "    private static final int AMOUNT_OF_BIT = 32;\n" +
                "\n" +
                "    @Override\n" +
                "    public void getResult() {\n" +
                "        super.getResult();\n" +
                "        int number = -1;\n" +
                "        System.out.println(\"number to binary: \" + Integer.toBinaryString(number));\n" +
                "        number <<= 2;\n" +
                "        System.out.println(\"number << 2 \" + Integer.toBinaryString(number));\n" +
                "\n" +
                "        for (int i = 0; i < AMOUNT_OF_BIT; i++) {\n" +
                "            number >>>= 1;\n" +
                "            System.out.println(\"number >>> 1 \" + Integer.toBinaryString(number));\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "}");

    }
}
