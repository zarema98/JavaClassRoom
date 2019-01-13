package ReusingClasses.exercise20;

import com.company.Exercise;

public class Exercise20 extends Exercise {
    private String name = "Задание 20.";

    @Override
    public void exerciseName() {
        System.out.println(name);
    }

    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("    Продемонстрируйте, что аннотация @Override решает проблему упомянутую в этом разделе. ");
    }

    @Override
    public void getResult() {
        super.getResult();
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();
        //восходящее преобразование
        OverridingPrivate op = op2;
        //но методы вызвать невозможно
        //! op.f();
        //! op.f();
        //и так же здесь
        WithFinals wf = op2;
        //! wf.f();
        //! wf.g();
    }

    @Override
    public void getCode() {
        super.getCode();
        System.out.println("--WithFinals.java--");
        System.out.println("public class WithFinals {\n" +
                "    private final void f() {\n" +
                "        System.out.println(\"WithFinals.f()\");\n" +
                "    }\n" +
                "\n" +
                "    private void g() {\n" +
                "        System.out.println(\"WithFinals.g()\");\n" +
                "    }\n" +
                "}");
        System.out.println("--OverridingPrivate.java--");
        System.out.println("public class OverridingPrivate extends WithFinals {\n" +
                "\n" +
                "    //! @Override //данный метод не переопределяет метод из суперкласса\n" +
                "    private final void f() {\n" +
                "        System.out.println(\"OverridingPrivate.f()\");\n" +
                "    }\n" +
                "\n" +
                "    //! @Override //данный метод не переопределяет метод из суперкласса\n" +
                "    private void g() {\n" +
                "        System.out.println(\"OverridingPrivate.g()\");\n" +
                "    }\n" +
                "\n" +
                "}");
        System.out.println("--OverridingPrivate2.java--");
        System.out.println("public class OverridingPrivate2 extends OverridingPrivate {\n" +
                "    //! @Override //данный метод не переопределяет метод из суперкласса\n" +
                "    public final void f() {\n" +
                "        System.out.println(\"OverridingPrivate2.f()\");\n" +
                "    }\n" +
                "\n" +
                "    //! @Override //данный метод не переопределяет метод из суперкласса\n" +
                "    public void g() {\n" +
                "        System.out.println(\"OverridingPrivate2.g()\");\n" +
                "    }\n" +
                "}");
        System.out.println("--Exercise20.java--");
        System.out.println("public class Exercise20 extends Exercise {\n" +
                "    private String name = \"Задание 20.\";\n" +
                "\n" +
                "    @Override\n" +
                "    public void getResult() {\n" +
                "        super.getResult();\n" +
                "        OverridingPrivate2 op2 = new OverridingPrivate2();\n" +
                "        op2.f();\n" +
                "        op2.g();\n" +
                "        //восходящее преобразование\n" +
                "        OverridingPrivate op = op2;\n" +
                "        //но методы вызвать невозможно\n" +
                "        //! op.f();\n" +
                "        //! op.f();\n" +
                "        //и так же здесь\n" +
                "        WithFinals wf = op2;\n" +
                "        //! wf.f();\n" +
                "        //! wf.g();\n" +
                "    }\n" +
                "\n" +
                "}");
    }
}
