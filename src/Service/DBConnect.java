/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;
import java.sql.*;

/**
 *
 * @author Admin
 */
public class DBConnect {
    public static final String HOSTNAME = "localhost";
    public static final String PORT = "1433";
    public static final String DBNAME = "DuAn1";
    public static final String USERNAME = "sa";
    public static final String PASSWORD = "admin";

    /**
     * Get connection to MSSQL Server
     *
     * @return Connection
     */
    public static Connection getConnection() {

        String connectionUrl = "jdbc:sqlserver://" + HOSTNAME + ":" + PORT + ";"
                + "databaseName=" + DBNAME + ";encrypt=true;trustServerCertificate=true;";

        try {
            //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //conn = DriverManager.getConnection(dbURLSSL, user, passWord);
            return DriverManager.getConnection(connectionUrl, USERNAME, PASSWORD);
        } // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
}
