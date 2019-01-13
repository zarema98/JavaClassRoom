package com.company;

public abstract class Exercise {

    public abstract void exerciseName ();
    public  void getCode() {
        System.out.printf("%35s%n","--ИСХОДНЫЙ КОД--");
    }

    public  void getDescription() {
        System.out.printf("%35s%n", "--ОПИСАНИЕ-- ");
    }

    public  void getResult () {
        System.out.println("--РЕЗУЛЬТАТ ВЫПОЛНЕНИЯ--");
    }


}
