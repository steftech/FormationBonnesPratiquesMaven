package chap1.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionBillPugh {
    private Connection cnx;
    private static final  String url = "jdbc:mysql://localhost:3306/test";
    private static final  String user = "root";
    private static final String password = "root";

    private DBConnectionBillPugh() {
        // no op
        try {
            cnx = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
            cnx = null;
        }
    }

    public static class SingletonHolder {
        private static final DBConnectionBillPugh INSTANCE = new DBConnectionBillPugh();
    }

    public static DBConnectionBillPugh getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public Connection getConnection() {
        return cnx;
    }

}

class DBConnectionBillPughTest {
    static void main(String[] args) throws SQLException {
        Connection db = DBConnectionBillPugh.getInstance().getConnection();
    }
}
