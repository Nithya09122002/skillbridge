// Dummy content for com/skillbridge/dao/UserDAO.java
package com.skillbridge.dao;

import com.skillbridge.model.User;
import java.sql.*;

public class UserDAO {
    // Method to register a user
    public boolean registerUser(User user) throws SQLException {
        String query = "INSERT INTO users (username, password, email) VALUES (?, ?, ?)";
        try (Connection connection = DBUtil.getConnection();
             PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getEmail());
            return ps.executeUpdate() > 0;
        }
    }

    // Method to get a user by username
    public User getUserByUsername(String username) throws SQLException {
        String query = "SELECT * FROM users WHERE username = ?";
        try (Connection connection = DBUtil.getConnection();
             PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new User(rs.getInt("id"), rs.getString("username"), rs.getString("password"), rs.getString("email"));
            }
        }
        return null;
    }

    // Method to authenticate a user during login
    public boolean authenticateUser(String username, String password) throws SQLException {
        String query = "SELECT * FROM users WHERE username = ? AND password = ?";
        try (Connection connection = DBUtil.getConnection();
             PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            return rs.next();
        }
    }
}
