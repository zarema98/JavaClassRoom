package com.company;

public class FinalOverridingIllusionEx {

    public static void main(String[] args) {
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
}
