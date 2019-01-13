package ControllingExecution.exercise20;

import com.company.Exercise;

public class Exercise20 extends Exercise {
    private String name = "Задание 20.";


    private static int ifElse2 (int begin, int end, int testVal) {
        if(end < begin)
            return 0;
        else if(testVal >= begin && testVal <= end)
            return 1;
        else return -1;
    }


    @Override
    public void exerciseName() {
        System.out.println(name);

    }

    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("    Измените метод test() так, чтобы он получал два дополнительных " + "\n" +
                "аргумента begin и end, а значение testval проверялось на принадлежность " + "\n" +
                "к диапазону [begin, end]. ");

    }

    @Override
    public void getResult() {
        super.getResult();
        System.out.println(ifElse2(2,10, 11));
        System.out.println(ifElse2(1,20, 14));
        System.out.println(ifElse2(22,15, 12));
        System.out.println(ifElse2(22,15, 41));
    }

    @Override
    public void getCode() {
        super.getCode();
        System.out.println("--Exercise24.java--");
        System.out.println("public class Exercise20 extends Exercise {\n" +
                "    private String name = \"Задание 20.\";\n" +
                "\n" +
                "\n" +
                "    private static int ifElse2(int begin, int end, int testVal) {\n" +
                "        if (end < begin)\n" +
                "            return 0;\n" +
                "        else if (testVal >= begin && testVal <= end)\n" +
                "            return 1;\n" +
                "        else return -1;\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public void getResult() {\n" +
                "        super.getResult();\n" +
                "        System.out.println(ifElse2(2, 10, 11));\n" +
                "        System.out.println(ifElse2(1, 20, 14));\n" +
                "        System.out.println(ifElse2(22, 15, 12));\n" +
                "        System.out.println(ifElse2(22, 15, 41));\n" +
                "    }\n" +
                "\n" +
                "}");
    }
}
