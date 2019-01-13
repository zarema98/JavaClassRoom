package EverythingIsAnObject.exercise9;

import com.company.Exercise;

public class Exercise9 extends Exercise {
    private String name = "Задание 9.";
    public static void getType(int i) {
        System.out.println(i + " is int");
    }

    private void getType(Integer i) {
        System.out.println(i + " is Integer");
    }

    @Override
    public void exerciseName() {
        System.out.println(name);
    }

    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("    Напишите программу, демонстрирующую автоматическую упаковку примитивных типов. ");
    }

    @Override
    public void getResult() {
        super.getResult();
        Integer wrapperInteger = 45;
        int primitiveInt = wrapperInteger;

        Double wrapperDouble = 23.12;
        double primitiveDouble = wrapperDouble;

        getType(wrapperInteger);
        getType(primitiveInt);
    }

    @Override
    public void getCode() {
        super.getCode();
        System.out.println("--Exercise9.java--");
        System.out.println("public class Exercise9 extends Exercise {\n" +
                "    private String name = \"Задание 9.\";\n" +
                "\n" +
                "    public static void getType(int i) {\n" +
                "        System.out.println(i + \" is int\");\n" +
                "    }\n" +
                "\n" +
                "    private void getType(Integer i) {\n" +
                "        System.out.println(i + \" is Integer\");\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public void getResult() {\n" +
                "        super.getResult();\n" +
                "        Integer wrapperInteger = 45;\n" +
                "        int primitiveInt = wrapperInteger;\n" +
                "\n" +
                "        Double wrapperDouble = 23.12;\n" +
                "        double primitiveDouble = wrapperDouble;\n" +
                "\n" +
                "        getType(wrapperInteger);\n" +
                "        getType(primitiveInt);\n" +
                "    }\n" +
                "\n" +
                "}");

    }
}
