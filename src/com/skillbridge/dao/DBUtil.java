// Dummy content for com/skillbridge/dao/DBUtil.java
package com.skillbridge.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    // Database URL, username, and password
    private static final String DB_URL = "jdbc:h2:mem:testdb"; // In-memory H2 database
    private static final String DB_USER = "sa"; // Default user for H2
    private static final String DB_PASSWORD = ""; // No password for H2

    // Method to get a connection to the database
    public static Connection getConnection() throws SQLException {
        try {
            // Load and register MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Return the connection
            return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new SQLException("Database connection error", e);
        }
    }
}
