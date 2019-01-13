package AccesControl.exercise8;

import com.company.Exercise;

public class Exercise8  extends Exercise {
    private String name = "Задание 8.";

    @Override
    public void exerciseName() {
        System.out.println(name);
    }


    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("    По образцу примера Lunch.java создайте класс с именем " + "\n" +
                "ConnectionManager, который управляет фикированным массивом объектов Connection. " + "\n" +
                "Программист клиент не должен напрямую создавать объекты Connection, а может " + "\n" +
                "получать их только с помощью статического метода в классе ConnectionManager. " + "\n" +
                "Когда запас объектов у класса ConnectionManager будет исчерпан, он должен " + "\n" +
                "вернуть ссылку null. ");
    }

    @Override
    public void getResult() {
        super.getResult();
        ConnectionManager manager = new ConnectionManager();
        System.out.println(ConnectionManager.hasConn);
        manager.getConnections();
        System.out.println(ConnectionManager.hasConn);
        manager.getConnections();
        System.out.println(ConnectionManager.hasConn);
        manager.getConnections();
    }

    @Override
    public void getCode() {
        super.getCode();
        System.out.println("--Connection.java--");
        System.out.println("public class Connection {\n" +
                "    private static int connAmount = 0;\n" +
                "    private Connection () {\n" +
                "        System.out.println(\"Connected...\");\n" +
                "    }\n" +
                "    public static Connection makeConnection () {\n" +
                "        connAmount++;\n" +
                "        return new Connection();\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public String toString() {\n" +
                "        return \"Connection: \" + connAmount;\n" +
                "    }\n" +
                "}");
        System.out.println("--ConnectionManager.java--");
        System.out.println("public class ConnectionManager {\n" +
                "    public static int hasConn = 2;\n" +
                "    public static Connection [] pool = new Connection[hasConn];\n" +
                "\n" +
                "    public ConnectionManager() {\n" +
                "        for(Connection conn : pool) {\n" +
                "            conn = Connection.makeConnection();\n" +
                "            System.out.println(conn);\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    public  Connection getConnections () {\n" +
                "       if (hasConn > 0)\n" +
                "           return pool[--hasConn];\n" +
                "       else {\n" +
                "           System.out.println(\"No connections..\");\n" +
                "           return null;\n" +
                "       }\n" +
                "    }\n" +
                "}");
        System.out.println("--Exercise8.java--");
        System.out.println("public class Exercise8  extends Exercise {\n" +
                "    private String name = \"Задание 8.\";\n" +
                "\n" +
                "    @Override\n" +
                "    public void getResult() {\n" +
                "        super.getResult();\n" +
                "        ConnectionManager manager = new ConnectionManager();\n" +
                "        System.out.println(ConnectionManager.hasConn);\n" +
                "        manager.getConnections();\n" +
                "        System.out.println(ConnectionManager.hasConn);\n" +
                "        manager.getConnections();\n" +
                "        System.out.println(ConnectionManager.hasConn);\n" +
                "        manager.getConnections();\n" +
                "    }\n" +
                "\n" +
                "}");
    }
}
