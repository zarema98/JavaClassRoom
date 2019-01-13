package com.company;

public class OverridingPrivate2 extends OverridingPrivate {
    //! @Override //данный метод не переопределяет метод из суперкласса
    public final void f() {
        System.out.println("OverridingPrivate2.f()");
    }

    //! @Override //данный метод не переопределяет метод из суперкласса
    public void g() {
        System.out.println("OverridingPrivate2.g()");
    }
}
