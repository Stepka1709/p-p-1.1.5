package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/my_db";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "12345678";

    public static Connection getConnection() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return connection;
    }
}
