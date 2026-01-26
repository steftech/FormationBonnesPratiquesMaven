package chap1.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public enum DBConnexionEnum {
    connection;
    private Connection cnx;
    DBConnexionEnum(){
        try {
            cnx =  DriverManager.getConnection("url", "user", "password");
        } catch (SQLException e) {
            e.printStackTrace();
            cnx = null;
        }
    }
    public Connection getConnection(){
        return cnx;
    }
}

class DBConnexionEnumTest{
    void main(){
        Connection cnx = DBConnexionEnum.connection.getConnection();
    }
}
