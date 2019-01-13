package EverythingIsAnObject.exercise15;

import com.company.Exercise;


/**
 * Класс содержит метод, необходимый для вывода сообщения на экран
 * @version 1.0
 * @author  Zarema Halilova
 * @since   2018-12-23
 */
public class Exercise15 extends Exercise {
    private String name = "Задание 15.";

    @Override
    public void exerciseName() {
        System.out.println(name);
    }

    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("    Возьмите программу из упражнения 2 и добавьте к ней " + "\n" +
                "документацию в комментариях. Извлеките эту документацию в HTML-файл с " + "\n" +
                "помощью javadoc. ");

    }

    /**
     * Вывод сообщения "Hello, world" на экран
     */
    @Override
    public void getResult() {
        super.getResult();
        System.out.println("Hello, world!");
    }

    @Override
    public void getCode() {
        super.getCode();
        System.out.println("--Exercise15.java--");
        System.out.println("/**\n" +
                " * Класс содержит метод, необходимый для вывода сообщения на экран\n" +
                " * @version 1.0\n" +
                " * @author  Zarema Halilova\n" +
                " * @since   2018-12-23\n" +
                " */\n" +
                "public class Exercise15 extends Exercise {\n" +
                "    private String name = \"Задание 15.\";\n" +
                "    @Override\n" +
                "    public void getResult() {\n" +
                "        super.getResult();\n" +
                "        System.out.println(\"Hello, world!\");\n" +
                "    }\n" +
                "\n" +
                "}");

    }
}
