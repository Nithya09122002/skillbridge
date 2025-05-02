// Dummy content for com/skillbridge/dao/SessionDAO.java
package com.skillbridge.dao;

import com.skillbridge.model.SessionRequest;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SessionDAO {
    // Method to create a session request
    public boolean requestSession(SessionRequest sessionRequest) throws SQLException {
        String query = "INSERT INTO session_requests (user_id, skill_id, request_status) VALUES (?, ?, ?)";
        try (Connection connection = DBUtil.getConnection();
             PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(1, sessionRequest.getUserId());
            ps.setInt(2, sessionRequest.getSkillId());
            ps.setString(3, sessionRequest.getRequestStatus());
            return ps.executeUpdate() > 0;
        }
    }

    // Method to get session requests for a user
    public List<SessionRequest> getSessionRequestsByUserId(int userId) throws SQLException {
        String query = "SELECT * FROM session_requests WHERE user_id = ?";
        List<SessionRequest> sessionRequests = new ArrayList<>();
        try (Connection connection = DBUtil.getConnection();
             PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(1, userId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                sessionRequests.add(new SessionRequest(rs.getInt("id"), rs.getInt("user_id"), rs.getInt("skill_id"), rs.getString("request_status")));
            }
        }
        return sessionRequests;
    }
}
