package com.company;

public class Main {

    public static void main(String[] args) {
        Frog frog = new Frog();
        frog.sleep();
        frog.jump();
        Amphibian.eat(frog); //восходящее преобразование
    }
}
