package com.company;
//: initialization/Student.java
//пример вызова метода с ключевым словом this и без
public class Student {
    private void info (String name) {
        System.out.println(name + " is a student");
    }

    public void displayInfo (String name) {
        System.out.println("--------INFO--------");
        info(name);
        this.info(name);
    }
}
