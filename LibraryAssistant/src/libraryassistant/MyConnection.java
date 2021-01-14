package libraryassistant;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {

    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/libraryAssistant", "root", "");
        } catch (ClassNotFoundException | SQLException ex) {
        }
        return con;
    }
}
