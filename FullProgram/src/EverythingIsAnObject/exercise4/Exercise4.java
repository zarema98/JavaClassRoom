package EverythingIsAnObject.exercise4;

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
        System.out.println("    Сделайте то же для кода с использованием класса DataOnly. ");
    }

    @Override
    public void getResult() {
        super.getResult();
        new DataOnly(12, 12.1, false).show();
    }

    @Override
    public void getCode() {
        super.getCode();
        System.out.println("--DataOnly.java--");
        System.out.println("public class DataOnly {\n" +
                "    public int i;\n" +
                "    public double d;\n" +
                "    public boolean b;\n" +
                "\n" +
                "    public DataOnly (int i, double d, boolean b) {\n" +
                "        this.i = i;\n" +
                "        this.d = d;\n" +
                "        this.b = b;\n" +
                "    }\n" +
                "\n" +
                "    public void show () {\n" +
                "        System.out.println(\"i = \" + i + \"\\n\" +\n" +
                "                            \"d = \" + d + \"\\n\" +\n" +
                "                            \"b = \" + b);\n" +
                "    }\n" +
                "}\n");
        System.out.println("--Exercise4.java--");
        System.out.println("public class Exercise4 extends Exercise {\n" +
                "    private String name = \"Задание 4.\";\n" +
                "\n" +
                "    @Override\n" +
                "    public void getResult() {\n" +
                "        super.getResult();\n" +
                "        new DataOnly(12, 12.1, false).show();\n" +
                "    }\n" +
                "}\n");


    }
}
