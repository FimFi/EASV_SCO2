package transactionexampleconsoleapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author smsj
 */
public class DBConnection {

    public final static String DB_DRIVER_CLASS = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    public final static String DB_URL = "jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=BankDB";
    public final static String DB_USERNAME = "dbuser";
    public final static String DB_PASSWORD = "123456";

    /**
     * 
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public static Connection getConnection() throws SQLException, ClassNotFoundException {        
     
        Connection conn = null;
        Class.forName(DB_DRIVER_CLASS);
        conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        return conn;
    }
}
