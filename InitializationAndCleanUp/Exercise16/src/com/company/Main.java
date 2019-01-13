package com.company;
//: initialization/Main.java
// создание массива объектов String
// и последующий вывод содержимого массива
public class Main {

    public static void main(String[] args) {
        String [] animals = new String[] {"dog", "cat", "frog"};

        for(String str : animals)
            System.out.println(str);
    }
}
