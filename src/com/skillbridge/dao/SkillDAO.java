// Dummy content for com/skillbridge/dao/SkillDAO.java
package com.skillbridge.dao;

import com.skillbridge.model.Skill;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SkillDAO {
    // Method to add a skill
    public boolean addSkill(Skill skill) throws SQLException {
        String query = "INSERT INTO skills (skill_name, description, user_id) VALUES (?, ?, ?)";
        try (Connection connection = DBUtil.getConnection();
             PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, skill.getSkillName());
            ps.setString(2, skill.getDescription());
            ps.setInt(3, skill.getUserId());
            return ps.executeUpdate() > 0;
        }
    }

    // Method to search for skills
    public List<Skill> searchSkills(String keyword) throws SQLException {
        String query = "SELECT * FROM skills WHERE skill_name LIKE ?";
        List<Skill> skills = new ArrayList<>();
        try (Connection connection = DBUtil.getConnection();
             PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, "%" + keyword + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                skills.add(new Skill(rs.getInt("id"), rs.getString("skill_name"), rs.getString("description"), rs.getInt("user_id")));
            }
        }
        return skills;
    }
}
