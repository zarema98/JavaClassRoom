package Polymorphism.exercise8;

import com.company.Exercise;

public class Exercise8  extends Exercise {
    private String name = "Задание 8";
    public static RandomInstrumentGenerator rand = new RandomInstrumentGenerator();

    @Override
    public void exerciseName() {
        System.out.println(name);
    }

    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("    Измените программу Music3.java, чтобы в ней случайны образом генерировались " + "\n" +
                "объекты Instrument, как в программе Shapes.java. ");
    }

    @Override
    public void getResult() {
        super.getResult();
        Instrument []instruments = new Instrument[10];
        for(int i=0; i < instruments.length; i++) {
            instruments[i] = rand.next();
        }

        Music.tuneAll(instruments);
    }

    @Override
    public void getCode() {
        super.getCode();
        System.out.println("--Note.java--");
        System.out.println("public enum Note {\n" +
                "    MIIDLE_C, C_SHARP, B_FLAT;\n" +
                "}\n");
        System.out.println("--Music.java--");
        System.out.println("public class Music {\n" +
                "    public static void tune (Instrument i) {\n" +
                "        i.play(Note.MIIDLE_C);\n" +
                "    }\n" +
                "    public static void tuneAll (Instrument [] instruments) {\n" +
                "        for(Instrument i :instruments)\n" +
                "            tune(i);\n" +
                "    }\n" +
                "}\n" +
                "class Instrument {\n" +
                "    public void play (Note note) {\n" +
                "        System.out.println(\"Instrument.play() \" + note);\n" +
                "    }\n" +
                "\n" +
                "    public String what() {\n" +
                "        return \"Instrument\";\n" +
                "    }\n" +
                "\n" +
                "    public void adjust() {\n" +
                "        System.out.println(\"Adjusting Instrument\");\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "class Wind extends Instrument {\n" +
                "    @Override\n" +
                "    public void play (Note note) {\n" +
                "        System.out.println(\"Wind.play() \" + note);\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public String what() {\n" +
                "        return \"Wind\";\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public void adjust() {\n" +
                "        System.out.println(\"Adjusting Wind\");\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "class Percussion extends Instrument {\n" +
                "    @Override\n" +
                "    public void play (Note note) {\n" +
                "        System.out.println(\"Percussion.play() \" + note);\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public String what() {\n" +
                "        return \"Percussion\";\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public void adjust() {\n" +
                "        System.out.println(\"Adjusting Percussion\");\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "class Stringed extends Instrument {\n" +
                "    @Override\n" +
                "    public void play (Note note) {\n" +
                "        System.out.println(\"Stringed.play() \" + note);\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public String what() {\n" +
                "        return \"Stringed\";\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public void adjust() {\n" +
                "        System.out.println(\"Adjusting Stringed\");\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "class Brass extends Wind {\n" +
                "    @Override\n" +
                "    public void play (Note note) {\n" +
                "        System.out.println(\"Brass.play() \" + note);\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public void adjust() {\n" +
                "        System.out.println(\"Adjusting Brass\");\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "class Woodwind extends Wind {\n" +
                "    @Override\n" +
                "    public void play (Note note) {\n" +
                "        System.out.println(\"Woodwind.play() \" + note);\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public void adjust() {\n" +
                "        System.out.println(\"Adjusting Woodwind\");\n" +
                "    }\n" +
                "}");
        System.out.println("--RandomInstrumentGenerator.java--");
        System.out.println("public class RandomInstrumentGenerator {\n" +
                "    Random rand = new Random(47);\n" +
                "\n" +
                "    public Instrument next () {\n" +
                "        switch (rand.nextInt(5)) {\n" +
                "            default:\n" +
                "            case 0: return new Wind();\n" +
                "            case 1: return new Percussion();\n" +
                "            case 2: return new Stringed();\n" +
                "            case 3: return new Woodwind();\n" +
                "            case 4: return new Brass();\n" +
                "        }\n" +
                "    }\n" +
                "}");
        System.out.println("--Exercise8.java--");
        System.out.println("public class Exercise8  extends Exercise {\n" +
                "    private String name = \"Задание 8\";\n" +
                "    public static RandomInstrumentGenerator rand = new RandomInstrumentGenerator();\n" +
                "\n" +
                "    @Override\n" +
                "    public void getResult() {\n" +
                "        super.getResult();\n" +
                "        Instrument[] instruments = new Instrument[10];\n" +
                "        for (int i = 0; i < instruments.length; i++) {\n" +
                "            instruments[i] = rand.next();\n" +
                "        }\n" +
                "\n" +
                "        Music.tuneAll(instruments);\n" +
                "    }\n" +
                "\n" +
                "}");
    }
}
