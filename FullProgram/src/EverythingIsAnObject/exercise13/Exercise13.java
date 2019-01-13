package EverythingIsAnObject.exercise13;

import com.company.Exercise;


public class Exercise13 extends Exercise {
    private String name = "Задание 13.";

    @Override
    public void exerciseName() {
        System.out.println(name);
    }

    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("    Запустите программы Documentation1.java, Documentation2.java и " + "\n" +
                "Documentation3.java в javadoc. Просмотрите результаты в браузере. ");

    }

    @Override
    public void getResult() {
        super.getResult();
        Documentation1 doc1 = new Documentation1();
        doc1.f();
        Documentation2 doc2 = new Documentation2();
        doc2.showDate();
    }

    @Override
    public void getCode() {
        super.getCode();
        System.out.println("--Documentation1.java--");
        System.out.println("//: object/Documentation1.java\n" +
                "\n" +
                "/**\n" +
                " * <h1>Documentation1</h1>\n" +
                " * Вывод содержимого переменной на экран\n" +
                " * @author  Zarema Halilova\n" +
                " * @version 1.0\n" +
                " * @since   2018-12-23\n" +
                " */\n" +
                "public class Documentation1 {\n" +
                "\n" +
                "    private int i = 5;\n" +
                "\n" +
                "    public void f() {\n" +
                "        System.out.println(i);\n" +
                "    }\n" +
                "}");
        System.out.println("--Documentation2.java--");
        System.out.println("//: object/Documentation2.java\n" +
                "\n" +
                "import java.util.Date;\n" +
                "\n" +
                "/**\n" +
                " * <h1>Documentation2</h1>\n" +
                " *  * <pre>\n" +
                " *  * Uses\n" +
                " *  * System.out.println(new Date());\n" +
                " *  * </pre>\n" +
                " * Вывод текущей даты на экран\n" +
                " * @author  Zarema Halilova\n" +
                " * @version 1.0\n" +
                " * @since   2018-12-23\n" +
                " */\n" +
                "\n" +
                "public class Documentation2 {\n" +
                "    Date d = new Date();\n" +
                "    void showDate() {\n" +
                "        System.out.println(\"Date = \" + d);\n" +
                "    }\n" +
                "}");
        System.out.println("--Documentation3.java--");
        System.out.println("// object/Documentation3.java\n" +
                "/**\n" +
                " * Можно <em> даже </em> вставить список:\n" +
                " * <ol>\n" +
                " * <li> Пункт первый\n" +
                " * <li> Пункт второй\n" +
                " * <li> Пункт третий\n" +
                " * </ol>\n" +
                " */\n" +
                "public class Documentation3 {\n" +
                "}");
        System.out.println("--Exercise13.java--");
        System.out.println("public class Exercise13 extends Exercise {\n" +
                "    private String name = \"Задание 13.\";\n" +
                "\n" +
                "    @Override\n" +
                "    public void getResult() {\n" +
                "        super.getResult();\n" +
                "        Documentation1 doc1 = new Documentation1();\n" +
                "        doc1.f();\n" +
                "        Documentation2 doc2 = new Documentation2();\n" +
                "        doc2.showDate();\n" +
                "    }\n" +
                "\n" +
                "}");

    }
}
