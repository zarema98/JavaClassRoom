package ReusingClasses.exercise12;

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
        System.out.println("    Включите иерархию методов dispose() во все классы из упражнения 9. ");
    }

    @Override
    public void getResult() {
        super.getResult();
        Stem stem = new Stem();
        try {
            //Код и обработка исключений ....
        } finally {
            stem.dispose();
        }
    }

    @Override
    public void getCode() {
        super.getCode();
        System.out.println("--Component1.java--");
        System.out.println("   public class Component1 {\n" +
                "\n" +
                "    public Component1() {\n" +
                "        System.out.println(\"Component1 constructor\");\n" +
                "    }\n" +
                "\n" +
                "    public void dispose () {\n" +
                "        System.out.println(\"Completion Component1\");\n" +
                "    }\n" +
                "}");
        System.out.println("--Component2.java--");
        System.out.println("public class Component2 {\n" +
                "    public Component2() {\n" +
                "        System.out.println(\"Component2 constructor\");\n" +
                "    }\n" +
                "\n" +
                "    public void dispose () {\n" +
                "        System.out.println(\"Completion Component2\");\n" +
                "    }\n" +
                "}");
        System.out.println("--Component3.java--");
        System.out.println("public class Component3 {\n" +
                "    public Component3() {\n" +
                "        System.out.println(\"Component3 constructor\");\n" +
                "    }\n" +
                "\n" +
                "    public void dispose () {\n" +
                "        System.out.println(\"Completion Component3\");\n" +
                "    }\n" +
                "}");
        System.out.println("--Root.java--");
        System.out.println("public class Root {\n" +
                "    private Component1 component1;\n" +
                "    private Component2 component2;\n" +
                "    private Component3 component3;\n" +
                "    public Root() {\n" +
                "        System.out.println(\"Root constructor\");\n" +
                "        component1 = new Component1();\n" +
                "        component2 = new Component2();\n" +
                "        component3 = new Component3();\n" +
                "    }\n" +
                "    public void dispose () {\n" +
                "        component3.dispose();\n" +
                "        component2.dispose();\n" +
                "        component1.dispose();\n" +
                "        System.out.println(\"Completion of Root...\");\n" +
                "    }\n" +
                "}");
        System.out.println("--Stem.java--");
        System.out.println("public class Stem extends Root {\n" +
                "    private Component1 component1;\n" +
                "    private Component2 component2;\n" +
                "    private Component3 component3;\n" +
                "    public Stem() {\n" +
                "        super();\n" +
                "        System.out.println(\"Stem constructor\");\n" +
                "        component1 = new Component1();\n" +
                "        component2 = new Component2();\n" +
                "        component3 = new Component3();\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public void dispose() {\n" +
                "        component3.dispose();\n" +
                "        component2.dispose();\n" +
                "        component1.dispose();\n" +
                "        super.dispose();\n" +
                "        System.out.println(\"Completion of Stem... \");\n" +
                "\n" +
                "    }\n" +
                "}");
        System.out.println("--Exercise12.java--");
        System.out.println("public class Exercise12 extends Exercise {\n" +
                "    private String name = \"Задание 12.\";\n" +
                "\n" +
                "    @Override\n" +
                "    public void getResult() {\n" +
                "        super.getResult();\n" +
                "        Stem stem = new Stem();\n" +
                "        try {\n" +
                "            //Код и обработка исключений ....\n" +
                "        } finally {\n" +
                "            stem.dispose();\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "}");
    }
}
