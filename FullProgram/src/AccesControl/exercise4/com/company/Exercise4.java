package AccesControl.exercise4.com.company;

import com.company.Exercise;

public class Exercise4 extends Exercise {
    private String name = "Задание 4.";

    @Override
    public void exerciseName() {
        System.out.println(name);
    }

    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("    Покажите, что методы со спецификатором доступа protected " + "\n" +
                "обладают доступом в пределах пакета, но не являются открытыми. ");
    }

    @Override
    public void getResult() {
        super.getResult();
        new Student().getInfo("Zarema");
    }

    @Override
    public void getCode() {
        super.getCode();
        System.out.println("--Student.java--");
        System.out.println("package AccesControl.exercise4.com.company;\n" +
                "public  class Student {\n" +
                "\n" +
                "    protected void getInfo (String name) {\n" +
                "        System.out.println(name + \" is a student\");\n" +
                "    }\n" +
                "}");
        System.out.println("--TestProtectedAccess.java--");
        System.out.println("package AccesControl.exercise4.net.learning;\n" +
                "import AccesControl.exercise4.com.company.Student;\n" +
                "\n" +
                "public class TestProtectedAccess {\n" +
                "        Student student = new Student();\n" +
                "\n" +
                "        public void info () {\n" +
                "            //!  student.getInfo(); // нет доступа к защищенным методам,\n" +
                "            // объявленным в пределах другого пакета\n" +
                "        }\n" +
                "}");
        System.out.println("--Exercise4.java--");
        System.out.println(" public class Exercise4 extends Exercise {\n" +
                "    private String name = \"Задание 4.\";\n" +
                "\n" +
                "    @Override\n" +
                "    public void getResult() {\n" +
                "        super.getResult();\n" +
                "        new Student().getInfo(\"Zarema\");\n" +
                "    }\n" +
                "\n" +
                "}");
    }

}
