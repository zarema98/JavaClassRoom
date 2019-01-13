package EverythingIsAnObject.exercise2;

import com.company.Exercise;

public class Exercise2 extends Exercise {
    private String name = "Задание 2.";

    @Override
    public void exerciseName() {
        System.out.println(name);
    }

    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("    На основании примера HelloDate.java в этой главе напишите программу " + "\n" +
                "\"Привет мир\", которая просто выводит это сообщение. ");

    }

    @Override
    public void getResult() {
        super.getResult();
        System.out.println("Hello, world!");
    }

    @Override
    public void getCode() {
        super.getCode();
        System.out.println("--Exercise2.java--");
        System.out.println("public class Exercise2 extends Exercise {\n" +
                "    private String name = \"Задание 2.\";\n" +
                "\n" +
                "    @Override\n" +
                "    public void getResult() {\n" +
                "        super.getResult();\n" +
                "        System.out.println(\"Hello, world!\");\n" +
                "    }\n" +
                "\n" +
                "}");

    }
}
