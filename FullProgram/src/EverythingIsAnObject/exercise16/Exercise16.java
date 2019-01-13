package EverythingIsAnObject.exercise16;
// initialization/Exercise16.java
// Демонстрация перегрузки конструкторов наряду
// с перегрузкой обычных методов

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
        System.out.println("    Найдите в главе 5 пример Overloading.java и добавьте в него " + "\n" +
                "комментарии javadoc. Преобразуйте их в страницу HTML и посмотрите результат в браузере.");
    }

    @Override
    public void getResult() {
        super.getResult();
        for(int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("перегруженный метод");
        }
        // Перегруженный конструктор:
        new Tree();
    }

    @Override
    public void getCode() {
        super.getCode();
        System.out.println("--Exercise16.java--");
        System.out.println("public class Exercise16 extends Exercise {\n" +
                "    private String name = \"Задание 16.\";\n" +
                "    \n" +
                "    @Override\n" +
                "    public void getResult() {\n" +
                "        super.getResult();\n" +
                "        for(int i = 0; i < 5; i++) {\n" +
                "            Tree t = new Tree(i);\n" +
                "            t.info();\n" +
                "            t.info(\"перегруженный метод\");\n" +
                "        }\n" +
                "        // Перегруженный конструктор:\n" +
                "        new Tree();\n" +
                "    }\n" +
                "\n" +
                "}\n" +
                "\n" +
                "/** создание класса Tree с двумя конструкторами и одним методом info\n" +
                " */\n" +
                "class Tree {\n" +
                "\n" +
                "    /**\n" +
                "     * поле для хранения  высоты дерева\n" +
                "     */\n" +
                "    int height;\n" +
                "\n" +
                "    /** конструктор без аргументов\n" +
                "     * присваивание переменной height значения 0 - height = 0\n" +
                "     */\n" +
                "    Tree() {\n" +
                "        System.out.println(\"Сажаем росток\");\n" +
                "        height = 0;\n" +
                "    }\n" +
                "\n" +
                "    /** конструктор с одним аргументом типа int,\n" +
                "     * присваивание перемнной height значения, которое является аргументом конструктора\n" +
                "     */\n" +
                "    Tree(int initialHeight) {\n" +
                "        height = initialHeight;\n" +
                "        System.out.println(\"Создание нового дерева высотой \" + height + \" м.\");\n" +
                "    }\n" +
                "\n" +
                "    /** метод для вывода значения поля height\n" +
                "     */\n" +
                "    void info() {\n" +
                "        System.out.println(\"Дерево высотой \" + height + \"  м.\");\n" +
                "    }\n" +
                "\n" +
                "    /** перегруженный метод для вывода аргумента типа String\n" +
                "     * и значения поля height\n" +
                "     */\n" +
                "    void info(String s) {\n" +
                "        System.out.println(s + \": Дерево высотой \" + height + \" м.\");\n" +
                "    }\n" +
                "}\n");

    }
}

/** создание класса Tree с двумя конструкторами и одним методом info
 */
class Tree {

    /**
     * поле для хранения  высоты дерева
     */
    int height;

    /** конструктор без аргументов
     * присваивание переменной height значения 0 - height = 0
     */
    Tree() {
        System.out.println("Сажаем росток");
        height = 0;
    }

    /** конструктор с одним аргументом типа int,
     * присваивание перемнной height значения, которое является аргументом конструктора
     */
    Tree(int initialHeight) {
        height = initialHeight;
        System.out.println("Создание нового дерева высотой " + height + " м.");
    }

    /** метод для вывода значения поля height
     */
    void info() {
        System.out.println("Дерево высотой " + height + "  м.");
    }

    /** перегруженный метод для вывода аргумента типа String
     * и значения поля height
     */
    void info(String s) {
        System.out.println(s + ": Дерево высотой " + height + " м.");
    }
}

