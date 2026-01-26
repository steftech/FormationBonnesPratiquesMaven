package chap1.singleton;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public enum DBConnexionEnumFile {
    connection;
    private Connection cnx;
    DBConnexionEnumFile(){
        try {
            Properties prop = new Properties();
            try (FileInputStream fis = new FileInputStream("config.properties"))        {
                prop.load(fis);
            } catch ( IOException e){
                e.printStackTrace();
            }
            final String URL = prop.getProperty("url");
            final String USER = prop.getProperty("user");
            final String PASSWORD = prop.getProperty("password");
            cnx =  DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            cnx = null;
        }
    }
    public Connection getConnection(){
        return cnx;
    }
}

class DBConnexionEnumFileTest{
    void main(){
        Connection cnx = DBConnexionEnumFile.connection.getConnection();
    }
}
