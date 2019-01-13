package EverythingIsAnObject.exercise11;

import com.company.Exercise;

public class Exercise11 extends Exercise {
    private String name = "Задание 11.";

    @Override
    public void exerciseName() {
        System.out.println(name);
    }

    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("    Преобразуйте пример с классом AllTheColorsOfTheRainbow в работающую программу. ");

    }

    @Override
    public void getResult() {
        super.getResult();
        AllTheColorsOfTheRainbow colorsOfTheRainbow = new AllTheColorsOfTheRainbow(11);
        colorsOfTheRainbow.changeTheHueOfTheColor(3);
        System.out.println(colorsOfTheRainbow);
    }

    @Override
    public void getCode() {
        super.getCode();
        System.out.println("AllTheColorsOfTheRainbow.java");
        System.out.println("public class AllTheColorsOfTheRainbow {\n" +
                "   private int anIntegerRepresentingColors;\n" +
                "\n" +
                "    public AllTheColorsOfTheRainbow(int anIntegerRepresentingColors) {\n" +
                "        this.anIntegerRepresentingColors = anIntegerRepresentingColors;\n" +
                "    }\n" +
                "\n" +
                "    public void changeTheHueOfTheColor(int newHue){\n" +
                "        anIntegerRepresentingColors = newHue;\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public String toString() {\n" +
                "        return \"AllTheColorsOfTheRainbow.\" +\n" +
                "                \"anIntegerRepresentingColors = \" + anIntegerRepresentingColors;\n" +
                "    }\n" +
                "}\n");
        System.out.println("--Exercise11.java--");
        System.out.println("public class Exercise11 extends Exercise {\n" +
                "    private String name = \"Задание 11.\";\n" +
                "\n" +
                "    @Override\n" +
                "    public void getResult() {\n" +
                "        super.getResult();\n" +
                "        AllTheColorsOfTheRainbow colorsOfTheRainbow = new AllTheColorsOfTheRainbow(11);\n" +
                "        colorsOfTheRainbow.changeTheHueOfTheColor(3);\n" +
                "        System.out.println(colorsOfTheRainbow);\n" +
                "    }\n" +
                "\n" +
                "}");

    }
}
