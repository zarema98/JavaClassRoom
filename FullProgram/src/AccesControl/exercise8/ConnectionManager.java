package AccesControl.exercise8;

public class ConnectionManager {
    public static int hasConn = 2;
    public static Connection [] pool = new Connection[hasConn];

    public ConnectionManager() {
        for(Connection conn : pool) {
            conn = Connection.makeConnection();
            System.out.println(conn);
        }
    }

    public  Connection getConnections () {
       if (hasConn > 0)
           return pool[--hasConn];
       else {
           System.out.println("No connections..");
           return null;
       }
    }
}

