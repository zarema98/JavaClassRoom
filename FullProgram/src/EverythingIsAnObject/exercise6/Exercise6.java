package EverythingIsAnObject.exercise6;

import com.company.Exercise;

public class Exercise6 extends Exercise {
    private String name = "Задание 6.";

    @Override
    public void exerciseName() {
        System.out.println(name);
    }

    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("    Напишите программу, включающую метод storage(), приведенный ранее в этой главе. ");
    }

    @Override
    public void getResult() {
        super.getResult();
        Storage doubledStorage = new Storage();
        int length = doubledStorage.storage("Some storage");
        System.out.println("Doubled length of string: " + length);
    }

    @Override
    public void getCode() {
        super.getCode();
        System.out.println("--Storage.java--");
        System.out.println("public class Storage {\n" +
                "\n" +
                "    public int storage (String s) {\n" +
                "        return s.length() * 2;\n" +
                "    }\n" +
                "}\n");
        System.out.println("--Exercise6.java--");
        System.out.println("public class Exercise6 extends Exercise {\n" +
                "    private String name = \"Задание 6.\";\n" +
                "\n" +
                "    @Override\n" +
                "    public void getResult() {\n" +
                "        super.getResult();\n" +
                "        Storage doubledStorage = new Storage();\n" +
                "        int length = doubledStorage.storage(\"Some storage\");\n" +
                "        System.out.println(\"Doubled length of string: \" + length);\n" +
                "    }\n" +
                "\n" +
                "}");
    }
}
