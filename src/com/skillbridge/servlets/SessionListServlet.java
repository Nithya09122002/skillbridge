// Dummy content for com/skillbridge/servlets/SessionListServlet.java
package com.skillbridge.servlets;

import com.skillbridge.dao.SessionDAO;
import com.skillbridge.model.SessionRequest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/SessionListServlet")
public class SessionListServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");

        SessionDAO sessionDAO = new SessionDAO();
        List<SessionRequest> sessions = sessionDAO.getSessionsByUser(user.getUserId());

        request.setAttribute("sessions", sessions);
        request.getRequestDispatcher("session_requests.jsp").forward(request, response);
    }
}
