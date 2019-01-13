package EverythingIsAnObject.exercise3;

import com.company.Exercise;

public class Exercise3 extends Exercise {
    private String name = "Задание 3.";

    @Override
    public void exerciseName() {
        System.out.println(name);
    }

    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("    Найдите фрагмент кода с классом ATypeName и сделайте из него " + "\n" +
                "программу, пригодную для компиляции и запуска. ");

    }

    @Override
    public void getResult() {
        super.getResult();
        ATypeName firstObject =  new ATypeName();
        System.out.println("Class Name: " + firstObject.getClass().getSimpleName());
    }

    @Override
    public void getCode() {
        super.getCode();
        System.out.println("--ATypeName.java--");
        System.out.println("public class ATypeName {\n" +
                "    public ATypeName() {\n" +
                "        System.out.println(\"ATypeName constructor\");\n" +
                "    }\n" +
                "}");
        System.out.println("--Exercise3.java--");
        System.out.println("public class Exercise3 extends Exercise {\n" +
                "    private String name = \"Задание 3.\";\n" +
                "\n" +
                "    @Override\n" +
                "    public void getResult() {\n" +
                "        super.getResult();\n" +
                "        ATypeName firstObject = new ATypeName();\n" +
                "        System.out.println(\"Class Name: \" + firstObject.getClass().getSimpleName());\n" +
                "    }\n" +
                "\n" +
                "}");


    }
}
