package InitializationAndCleanup.exercise12;

import com.company.Exercise;

public class Exercise12 extends Exercise {
    private String name = "Задание 12.";

    @Override
    public void exerciseName() {
        System.out.println(name);
    }

    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("    Включите в класс с именем Tank, который можно наполнить и опустошить. Условие " + "\n" +
                "\"готовности\" требует, чтобы он был пуст перед чисткой. Напишите метод finalize(), " + "\n" +
                "проверяющий это условие. Протестируйте возможные способы использования вашего класса. ");
    }

    @Override
    public void getResult() {
        super.getResult();
        Tank tank1 = new Tank();
        Tank tank2 = new Tank(6);
        Tank tank3 = new Tank(2);

        tank2.clean();

        new Tank(11);
        System.out.println("Current tanks:");
        System.out.println("Tank 1: ");
        tank1.checkHowFull();
        System.out.println("Tank 2: ");
        tank2.checkHowFull();
        System.out.println("Tank 3: ");
        tank3.checkHowFull();
        System.out.println("gc():");
        System.gc();

        System.out.println("gc():");
        System.gc();
    }

    @Override
    public void getCode() {
        super.getCode();
        System.out.println("--Tank.java--");
        System.out.println("public class Tank {\n" +
                "    private int capacity;\n" +
                "    public Tank() {\n" +
                "        this(0);\n" +
                "    }\n" +
                "    public Tank(int fullness) {\n" +
                "        capacity = fullness;\n" +
                "    }\n" +
                "\n" +
                "    public void checkHowFull() {\n" +
                "        if(capacity == 0) System.out.println(\"Tank is empty\");\n" +
                "        else System.out.println(\"Tank capacity = \" + capacity);\n" +
                "    }\n" +
                "    public void clean() {\n" +
                "        capacity = 0;\n" +
                "    }\n" +
                "    protected void finalize() {\n" +
                "        if(capacity != 0)\n" +
                "            System.out.println(\"Error: Tank is not empty\");\n" +
                "    }\n" +
                "}\n");
        System.out.println("--Exercise12.java--");
        System.out.println("public class Exercise12 extends Exercise {\n" +
                "    private String name = \"Задание 12.\";\n" +
                "\n" +
                "    @Override\n" +
                "    public void getResult() {\n" +
                "        super.getResult();\n" +
                "        Tank tank1 = new Tank();\n" +
                "        Tank tank2 = new Tank(6);\n" +
                "        Tank tank3 = new Tank(2);\n" +
                "\n" +
                "        tank2.clean();\n" +
                "\n" +
                "        new Tank(11);\n" +
                "        System.out.println(\"Current tanks:\");\n" +
                "        System.out.println(\"Tank 1: \");\n" +
                "        tank1.checkHowFull();\n" +
                "        System.out.println(\"Tank 2: \");\n" +
                "        tank2.checkHowFull();\n" +
                "        System.out.println(\"Tank 3: \");\n" +
                "        tank3.checkHowFull();\n" +
                "        System.out.println(\"gc():\");\n" +
                "        System.gc();\n" +
                "\n" +
                "        System.out.println(\"gc():\");\n" +
                "        System.gc();\n" +
                "    }\n" +
                "\n" +
                "}");
    }
}
