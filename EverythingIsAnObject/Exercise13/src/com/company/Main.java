package com.company;

import java.io.IOException;

public class Main {

    /**
     *
     * @param args Массив строковых аргументов.
     * @exception IOException On input error.
     * @see IOException
     */
    public static void main(String[] args) throws IOException {
        Documentation1 doc1 = new Documentation1();
        doc1.f();
        Documentation2 doc2 = new Documentation2();
        doc2.showDate();

    }
}
