// Dummy content for com/skillbridge/servlets/PostSkillServlet.java
package com.skillbridge.servlets;

import com.skillbridge.dao.SkillDAO;
import com.skillbridge.model.Skill;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/PostSkillServlet")
public class PostSkillServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String skillName = request.getParameter("skillName");
        String skillDescription = request.getParameter("skillDescription");
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");

        Skill skill = new Skill(user.getUserId(), skillName, skillDescription);
        SkillDAO skillDAO = new SkillDAO();

        if (skillDAO.postSkill(skill)) {
            response.sendRedirect("dashboard.jsp");
        } else {
            response.sendRedirect("post_skill.jsp?error=true");
        }
    }
}
