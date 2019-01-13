package EverythingIsAnObject.exercise5;

import com.company.Exercise;

import java.util.Random;

public class Exercise5 extends Exercise {
    private String name = "Задание 5.";

    @Override
    public void exerciseName() {
        System.out.println(name);
    }

    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("    Измените упражнение 4 так, чтобы данным класса DataOnly " + "\n" +
                "присваивались значения, а затем распечатайте их в методе main(). ");

    }

    @Override
    public void getResult() {
        super.getResult();
        DataOnly data = new DataOnly(new Random().nextInt(10), 23.4, false);
        System.out.println("i = " + data.getI() + '\n'
                + "d = " + data.getD() + '\n'
                + "b = " + data.getB()
        );
    }

    @Override
    public void getCode() {
        super.getCode();
        System.out.println("--DataOnly.java--");
        System.out.println("public class DataOnly {\n" +
                "   private int i;\n" +
                "   private   double d;\n" +
                "   private   boolean b;\n" +
                "\n" +
                "    public DataOnly(int i, double d, boolean b) {\n" +
                "        this.i = i;\n" +
                "        this.d = d;\n" +
                "        this.b = b;\n" +
                "    }\n" +
                "\n" +
                "    public int getI() {\n" +
                "        return i;\n" +
                "    }\n" +
                "\n" +
                "    public double getD() {\n" +
                "        return d;\n" +
                "    }\n" +
                "\n" +
                "    public boolean getB() {\n" +
                "        return b;\n" +
                "    }\n" +
                "}");
        System.out.println("Exercise5.java");
        System.out.println("public class Exercise5 extends Exercise {\n" +
                "    private String name = \"Задание 5.\";\n" +
                "\n" +
                "    @Override\n" +
                "    public void getResult() {\n" +
                "        super.getResult();\n" +
                "        DataOnly data = new DataOnly(new Random().nextInt(10), 23.4, false);\n" +
                "        System.out.println(\"i = \" + data.getI() + '\\n'\n" +
                "                + \"d = \" + data.getD() + '\\n'\n" +
                "                + \"b = \" + data.getB()\n" +
                "        );\n" +
                "    }\n" +
                "\n" +
                "}");

    }
}
