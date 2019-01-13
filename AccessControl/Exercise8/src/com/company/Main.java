package com.company;

public class Main {

    public static void main(String[] args) {
        ConnectionManager manager = new ConnectionManager();
        System.out.println(ConnectionManager.hasConn);
        manager.getConnections();
        System.out.println(ConnectionManager.hasConn);
        manager.getConnections();
        System.out.println(ConnectionManager.hasConn);
        manager.getConnections();


    }
}
