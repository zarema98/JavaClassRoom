package EverythingIsAnObject.exercise14;

import com.company.Exercise;

public class Exercise14 extends Exercise {
    private String name = "Задание 14.";

    @Override
    public void exerciseName() {
        System.out.println(name);
    }

    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("    Добавьте список HTML к документации, создаваемой в упражнении 13. ");

    }

    @Override
    public void getResult() {
        super.getResult();
        System.out.println(new Documentation().getI());
    }

    @Override
    public void getCode() {
        super.getCode();
        System.out.println("--Documentation.java--");
        System.out.println("// object/Documentation.java\n" +
                "/**\n" +
                " *  @author  Zarema Halilova\n" +
                " *  @version 1.0\n" +
                " *  @since   2018-12-23\n" +
                " * Можно <em> даже </em> вставить список:\n" +
                " * <ol>\n" +
                " * <li> Пункт первый\n" +
                " * <li> Пункт второй\n" +
                " * <li> Пункт третий\n" +
                " * </ol>\n" +
                " */\n" +
                "public class Documentation {\n" +
                "    /**\n" +
                "     * Test list\n" +
                "     * <ol>\n" +
                "     * <li> First\n" +
                "     * <li> Second\n" +
                "     * <li> Third\n" +
                "     * </ol>\n" +
                "     */\n" +
                "    public int i = 2;\n" +
                "\n" +
                "    public int getI() {\n" +
                "        return i;\n" +
                "    }\n" +
                "}");
        System.out.println("--Exercise14.java--");
        System.out.println("public class Exercise14 extends Exercise {\n" +
                "    private String name = \"Задание 14.\";\n" +
                "\n" +
                "    @Override\n" +
                "    public void getResult() {\n" +
                "        super.getResult();\n" +
                "        System.out.println(new Documentation().getI());\n" +
                "    }\n" +
                "\n" +
                "}");

    }
}
