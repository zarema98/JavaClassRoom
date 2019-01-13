package EverythingIsAnObject.exercise1;

import com.company.Exercise;

public class Exercise1 extends Exercise {

    private String name = "Задание 1.";

   @Override
   public void  exerciseName (){
        System.out.println(this.name);
    }

    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println( "   Создайте класс с полями int и char, которые не " + "\n" +
                "инициализируются в программе. Выведите их значения, чтобы" + "\n" +
                "убедиться в том, что Java выполняет инициализацию по умолчанию. ");
    }

    @Override
    public void getResult () {
        super.getResult();
        new MyClass();
    }

    @Override
    public void getCode() {
        super.getCode();
        System.out.println("--MyClass.java--");
        System.out.println("public class MyClass {\n" +
                "    public int number;\n" +
                "    public char symbol;\n" +
                "\n" +
                "    public MyClass() {\n" +
                "        System.out.println(\"number: \" + this.number);\n" +
                "        System.out.println(\"symbol: \" + this.symbol);\n" +
                "    }\n" +
                "\n" +
                "    public int getNumber() {\n" +
                "        return number;\n" +
                "    }\n" +
                "\n" +
                "    public char getSymbol() {\n" +
                "        return symbol;\n" +
                "    }\n" +
                "}");
        System.out.println("--Exercise1.java--");
        System.out.println("public class Exercise1 extends Exercise {\n" +
                "\n" +
                "    private String name = \"Задание 1.\";\n" +
                "\n" +
                "    @Override\n" +
                "    public void getResult() {\n" +
                "        super.getResult();\n" +
                "        new MyClass();\n" +
                "    }\n" +
                "}");
    }


}
