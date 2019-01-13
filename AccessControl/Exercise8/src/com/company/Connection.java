package com.company;

public class Connection {
    private static int connAmount = 0;
    private Connection () {
        System.out.println("Connected...");
    }
    public static Connection makeConnection () {
        connAmount++;
        return new Connection();
    }

    @Override
    public String toString() {
        return "Connection: " + connAmount;
    }
}
