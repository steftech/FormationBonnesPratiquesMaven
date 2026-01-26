package chap1.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String url  = "jdbc:mysql://localhost:3306/test";
    private static final String user = "root";
    private static final String password = "root";

    private static Connection cnx = null;
    private DBConnection() {
        try {
            cnx = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
            cnx = null;
        }
    }

    public static  Connection getConnection() throws SQLException {
        if ( cnx == null) {
            // Renvoyer la connexion
            new DBConnection();
        }
        return cnx;
    }

}

class DBConnexionTest {
    public static void main(String[] args) throws SQLException {
        Connection db  = DBConnection.getConnection();
    }
}
