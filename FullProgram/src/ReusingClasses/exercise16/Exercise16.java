package ReusingClasses.exercise16;

import com.company.Exercise;

public class Exercise16 extends Exercise {
    private String name = "Задание 16.";

    @Override
    public void exerciseName() {
        System.out.println(name);
    }

    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("    Создайте класс с именем Amphibian. Объявите производный от него класс " + "\n" +
                "с именем Frog. Разместите в базовом классе несколько методов. Создайте объект Frog, " + "\n" +
                "преобразуйте его в Amphibian и продемонстрируйте, что все методы работают. ");
    }

    @Override
    public void getResult() {
        super.getResult();
        Frog frog = new Frog();
        frog.sleep();
        frog.jump();
        Amphibian.eat(frog); //восходящее преобразование
    }


    @Override
    public void getCode() {
        super.getCode();
        System.out.println("--Amphibian.java--");
        System.out.println("public class Amphibian {\n" +
                "\n" +
                "    public void sleep () {\n" +
                "        System.out.println(\"Amphibian is sleeping\");\n" +
                "    }\n" +
                "\n" +
                "    public void jump () {\n" +
                "        System.out.println(\"Amphibian jumps\");\n" +
                "    }\n" +
                "\n" +
                "    public static void eat (Amphibian amphibian) {\n" +
                "        System.out.println(\"Amphibian is eating\");\n" +
                "        amphibian.sleep();\n" +
                "    }\n" +
                "}");
        System.out.println("--Frog.java--");
        System.out.println("public class Frog extends Amphibian {\n" +
                "\n" +
                "}");
        System.out.println("--Exercise16.java--");
        System.out.println("public class Exercise16 extends Exercise {\n" +
                "    private String name = \"Задание 16.\";\n" +
                "\n" +
                "    @Override\n" +
                "    public void getResult() {\n" +
                "        super.getResult();\n" +
                "        Frog frog = new Frog();\n" +
                "        frog.sleep();\n" +
                "        frog.jump();\n" +
                "        Amphibian.eat(frog); //восходящее преобразование\n" +
                "    }\n" +
                "\n" +
                "}");
    }
}
