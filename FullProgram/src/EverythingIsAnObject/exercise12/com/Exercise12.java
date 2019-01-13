package EverythingIsAnObject.exercise12.com;
//: object/Exercise12.java
import com.company.Exercise;

import java.util.*;

/** Первая программа-пример книги.
 * Выводит строку и текущую дату.
 * @author Zarema Halilova
 * @version 4.0
 */
public class Exercise12 extends Exercise {
    private String name = "Задание 12.";

    @Override
    public void exerciseName() {
        System.out.println(name);
    }

    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("    Найдите вторую версию программы HelloDate.java, представляющую " + "\n" +
                "пример простой документации в комментариях. Выполните команду javadoc для " + "\n" +
                "этого файла и посмотрите результаты в браузере. ");
    }

    @Override
    public void getResult() {
        super.getResult();
        System.out.print("Hi, today: ");
        System.out.println(new Date());

    }

    @Override
    public void getCode() {
        super.getCode();
        System.out.println("--Exercise12.java--");
        System.out.println("//: object/Exercise12.java\n" +
                "\n" +
                "/** Первая программа-пример книги.\n" +
                " * Выводит строку и текущую дату.\n" +
                " * @author Zarema Halilova\n" +
                " * @version 4.0\n" +
                " */\n" +
                "public class Exercise12 extends Exercise {\n" +
                "    private String name = \"Задание 12.\";\n" +
                "\n" +
                "    @Override\n" +
                "    public void getResult() {\n" +
                "        super.getResult();\n" +
                "        System.out.print(\"Hi, today: \");\n" +
                "        System.out.println(new Date());\n" +
                "\n" +
                "    }\n" +
                "} /* Output: (55% match)\n" +
                "     Hi, today. Wed Oct 05 14:39:36 MDT 2018\n" +
                "     *///:~");

    }
} /* Output: (55% match)
     Hi, today. Wed Oct 05 14:39:36 MDT 2018
     *///:~



