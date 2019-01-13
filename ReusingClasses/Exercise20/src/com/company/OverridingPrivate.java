package com.company;

public class OverridingPrivate extends WithFinals {

    //! @Override //данный метод не переопределяет метод из суперкласса
    private final void f() {
        System.out.println("OverridingPrivate.f()");
    }

    //! @Override //данный метод не переопределяет метод из суперкласса
    private void g() {
        System.out.println("OverridingPrivate.g()");
    }

}
