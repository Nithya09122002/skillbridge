// Dummy content for com/skillbridge/servlets/RequestSessionServlet.java
package com.skillbridge.servlets;

import com.skillbridge.dao.SessionDAO;
import com.skillbridge.model.SessionRequest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/RequestSessionServlet")
public class RequestSessionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int skillId = Integer.parseInt(request.getParameter("skillId"));
        int trainerId = Integer.parseInt(request.getParameter("trainerId"));
        HttpSession session = request.getSession();
        User learner = (User) session.getAttribute("user");

        SessionRequest sessionRequest = new SessionRequest(learner.getUserId(), trainerId, skillId);
        SessionDAO sessionDAO = new SessionDAO();

        if (sessionDAO.requestSession(sessionRequest)) {
            response.sendRedirect("session_requests.jsp");
        } else {
            response.sendRedirect("search_skill.jsp?error=true");
        }
    }
}
