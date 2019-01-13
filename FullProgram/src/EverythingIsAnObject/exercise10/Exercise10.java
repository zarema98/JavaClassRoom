package EverythingIsAnObject.exercise10;

import com.company.Exercise;
import com.company.Main;

public class Exercise10 extends Exercise {
    private String name = "Задание 10.";

    @Override
    public void exerciseName() {
        System.out.println(name);
    }

    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("    Напишите программу, которая выводит три параметра командной строки. ");
    }

    @Override
    public void getResult() {
        super.getResult();
        String []args = Main.comLineArgs;
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = " + args[i]);
        }
    }

    @Override
    public void getCode() {
        super.getCode();
        System.out.println("--Exercise10.java--");
        System.out.println("public class Exercise10 extends Exercise {\n" +
                "    private String name = \"Задание 10.\";\n" +
                "\n" +
                "    @Override\n" +
                "    public void getResult() {\n" +
                "        super.getResult();\n" +
                "        String[] args = Main.comLineArgs;\n" +
                "        for (int i = 0; i < args.length; i++) {\n" +
                "            System.out.println(\"args[\" + i + \"] = \" + args[i]);\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "}");

    }
}
