package com.company;
//: object/Documentation2.java

import java.util.Date;

/**
 * <h1>Documentation2</h1>
 *  * <pre>
 *  * Uses
 *  * System.out.println(new Date());
 *  * </pre>
 * Вывод текущей даты на экран
 * @author  Zarema Halilova
 * @version 1.0
 * @since   2018-12-23
 */

public class Documentation2 {
    Date d = new Date();
    void showDate() {
        System.out.println("Date = " + d);
    }
}
