// Dummy content for com/skillbridge/dao/MessageDAO.java
package com.skillbridge.dao;

import com.skillbridge.model.Message;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MessageDAO {
    // Method to send a message
    public boolean sendMessage(Message message) throws SQLException {
        String query = "INSERT INTO messages (sender_id, receiver_id, message_content, timestamp) VALUES (?, ?, ?, ?)";
        try (Connection connection = DBUtil.getConnection();
             PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(1, message.getSenderId());
            ps.setInt(2, message.getReceiverId());
            ps.setString(3, message.getMessageContent());
            ps.setString(4, message.getTimestamp());
            return ps.executeUpdate() > 0;
        }
    }

    // Method to get messages between users
    public List<Message> getMessagesByUserId(int userId) throws SQLException {
        String query = "SELECT * FROM messages WHERE sender_id = ? OR receiver_id = ?";
        List<Message> messages = new ArrayList<>();
        try (Connection connection = DBUtil.getConnection();
             PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(1, userId);
            ps.setInt(2, userId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                messages.add(new Message(rs.getInt("id"), rs.getInt("sender_id"), rs.getInt("receiver_id"), rs.getString("message_content"), rs.getString("timestamp")));
            }
        }
        return messages;
    }
}
