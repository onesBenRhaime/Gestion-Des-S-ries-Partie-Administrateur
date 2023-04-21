
package DAO;


import java.sql.*;

public class MyConnection {

    private static Connection conn; //DB Credations

  
    String url = "jdbc:oracle:thin:@localhost:1521:xe";
    String user = "TEST";
    String pwd = "test";
    private static MyConnection instance;

    private MyConnection() {
        try {
             Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(url, user, pwd);
            System.out.println("Connexion etablie");
        } catch (Exception ex) {
            System.out.println("Probleme de connexion");
            ex.printStackTrace();
        }
    }

    public static MyConnection getInstance() {
        if (instance == null) {
            instance = new MyConnection();
        }
        return instance;
    }

    public Connection getCon() {
        return MyConnection.getInstance().conn;
    }

}
