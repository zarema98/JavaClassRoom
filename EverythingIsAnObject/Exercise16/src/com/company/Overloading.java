package com.company;
// initialization/Overloading.java
// Демонстрация перегрузки конструкторов наряду
// с перегрузкой обычных методов

/** создание класса Tree с двумя конструкторами и одним методом info
 */
class Tree {

    /**
     * поле для хранения  высоты дерева
     */
    int height;

    /** конструктор без аргументов
     * присваивание переменной height значения 0 - height = 0
     */
    Tree() {
        System.out.println("Сажаем росток");
        height = 0;
    }

    /** конструктор с одним аргументом типа int,
     * присваивание перемнной height значения, которое является аргументом конструктора
     */
    Tree(int initialHeight) {
        height = initialHeight;
        System.out.println("Создание нового дерева высотой " + height + " м.");
    }

    /** метод для вывода значения поля height
     */
    void info() {
        System.out.println("Дерево высотой " + height + "  м.");
    }

    /** перегруженный метод для вывода аргумента типа String
     * и значения поля height
     */
    void info(String s) {
        System.out.println(s + ": Дерево высотой " + height + " м.");
    }
}

public class Overloading {

    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("перегруженный метод");
        }
        // Перегруженный конструктор:
        new Tree();
    }
}
