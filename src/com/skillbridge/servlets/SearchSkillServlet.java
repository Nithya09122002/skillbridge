// Dummy content for com/skillbridge/servlets/SearchSkillServlet.java
package com.skillbridge.servlets;

import com.skillbridge.dao.SkillDAO;
import com.skillbridge.model.Skill;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/SearchSkillServlet")
public class SearchSkillServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String query = request.getParameter("query");
        SkillDAO skillDAO = new SkillDAO();
        List<Skill> skills = skillDAO.searchSkills(query);

        request.setAttribute("skills", skills);
        request.getRequestDispatcher("search_skill.jsp").forward(request, response);
    }
}
