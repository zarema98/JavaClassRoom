package InitializationAndCleanup.exercise16;

import com.company.Exercise;

//: initialization/Exercise16.java
// создание массива объектов String
// и последующий вывод содержимого массива
public class Exercise16 extends Exercise {
    private String name = "Задание 16.";

    @Override
    public void exerciseName() {
        System.out.println(name);
    }

    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("    Создайте массив объектов String. Присвойте объект String каждому элементу. " + "\n" +
                "Выведите содержимое массива в цикле for. ");
    }

    @Override
    public void getResult() {
        super.getResult();
        String [] animals = new String[] {"dog", "cat", "frog"};

        for(String str : animals)
            System.out.println(str);
    }

    @Override
    public void getCode() {
        super.getCode();
        System.out.println("--Exercise16.java--");
        System.out.println("//: initialization/Exercise16.java\n" +
                "// создание массива объектов String\n" +
                "// и последующий вывод содержимого массива\n" +
                "public class Exercise16 extends Exercise {\n" +
                "    private String name = \"Задание 16.\";\n" +
                "\n" +
                "    @Override\n" +
                "    public void getResult() {\n" +
                "        super.getResult();\n" +
                "        String[] animals = new String[]{\"dog\", \"cat\", \"frog\"};\n" +
                "\n" +
                "        for (String str : animals)\n" +
                "            System.out.println(str);\n" +
                "    }\n" +
                "\n" +
                "}");
    }
}
