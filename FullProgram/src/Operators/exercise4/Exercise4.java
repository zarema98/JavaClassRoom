package Operators.exercise4;

import com.company.Exercise;

public class Exercise4 extends Exercise {
    private String name = "Задание 4";

    public static float getV (float S, float T) {
        if(T == 0) return 0f;
        else return S/T;
    }

    @Override
    public void exerciseName() {
        System.out.println(name);
    }

    @Override
    public void getDescription() {
      super.getDescription();
        System.out.println("    Напишите программу, которая вычисляет скорость для постоянных значений расстояния и времени. ");
    }

    @Override
    public void getResult() {
        super.getResult();
        final float S = 120.0f;
        final float T = 2.0f;
        float V =  getV(S, T);
        System.out.println("V = S / T = " + S + " / " + T + " = " + V);
    }

    @Override
    public void getCode() {
        super.getCode();
        System.out.println("--Exercise4.java--");
        System.out.println("public class Exercise4 extends Exercise {\n" +
                "    private String name = \"Задание 4\";\n" +
                "\n" +
                "    public static float getV(float S, float T) {\n" +
                "        if (T == 0) return 0f;\n" +
                "        else return S / T;\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public void getResult() {\n" +
                "        super.getResult();\n" +
                "        final float S = 120.0f;\n" +
                "        final float T = 2.0f;\n" +
                "        float V = getV(S, T);\n" +
                "        System.out.println(\"V = S / T = \" + S + \" / \" + T + \" = \" + V);\n" +
                "    }\n" +
                "\n" +
                "}");

    }
}
