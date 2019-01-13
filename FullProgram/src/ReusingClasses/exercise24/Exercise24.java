package ReusingClasses.exercise24;

import com.company.Exercise;

public class Exercise24 extends Exercise {
    private String name = "Задание 24.";

    @Override
    public void exerciseName() {
        System.out.println(name);
    }

    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("    В файле Beetle.java создайте еще один тип производный от Beetle, в таком же формате, " + "\n" +
                "как и у других классов. Проследите за работой программы и объясните результат. ");
    }

    @Override
    public void getResult() {
        super.getResult();
        System.out.println("GroundBeetle constructor");
        new GroundBeetle();
    }

    @Override
    public void getCode() {
        super.getCode();
        System.out.println("--Insect.java--");
        System.out.println("public class Insect {\n" +
                "    private int i = 9;\n" +
                "    protected int j;\n" +
                "    Insect() {\n" +
                "        System.out.println(\"i = \" + i + \", j = \" + j);\n" +
                "        j = 39;\n" +
                "    }\n" +
                "    private static int x1 = printInit(\"static Insect.x1 initialized\");\n" +
                "    static int printInit(String s) {\n" +
                "        System.out.println(s);\n" +
                "        return 47;\n" +
                "    }\n" +
                "}");
        System.out.println("--Beetle.java--");
        System.out.println("public class Beetle extends Insect {\n" +
                "    private int k = printInit(\"Beetle.k initialized\");\n" +
                "    public Beetle() {\n" +
                "        System.out.println(\"k = \" + k);\n" +
                "        System.out.println(\"j = \" + j);\n" +
                "    }\n" +
                "    private static int x2 = printInit(\"static Beetle.x2 initialized\");\n" +
                "}");
        System.out.println("--GroundBeetle.java--");
        System.out.println("public class GroundBeetle extends Beetle {\n" +
                "    private int a = printInit(\"GroundBeetle.a initialized\");\n" +
                "    public GroundBeetle() {\n" +
                "        System.out.println(\"a = \" + a);\n" +
                "        System.out.println(\"j = \" + j);\n" +
                "    }\n" +
                "    private static int x3 = printInit(\"static GroundBeetle.x3 initialized\");\n" +
                "}\n");
        System.out.println("--Exercise24.java--");
        System.out.println("public class Exercise24 extends Exercise {\n" +
                "    private String name = \"Задание 24.\";\n" +
                "\n" +
                "    @Override\n" +
                "    public void getResult() {\n" +
                "        super.getResult();\n" +
                "        System.out.println(\"GroundBeetle constructor\");\n" +
                "        new GroundBeetle();\n" +
                "    }\n" +
                "\n" +
                "}");
    }
}
