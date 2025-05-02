// Dummy content for com/skillbridge/servlets/FeedbackServlet.java
package com.skillbridge.servlets;

import com.skillbridge.dao.FeedbackDAO;
import com.skillbridge.model.Feedback;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/FeedbackServlet")
public class FeedbackServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int sessionId = Integer.parseInt(request.getParameter("sessionId"));
        int rating = Integer.parseInt(request.getParameter("rating"));
        String comments = request.getParameter("comments");

        Feedback feedback = new Feedback(sessionId, rating, comments);
        FeedbackDAO feedbackDAO = new FeedbackDAO();

        if (feedbackDAO.submitFeedback(feedback)) {
            response.sendRedirect("dashboard.jsp");
        } else {
            response.sendRedirect("feedback.jsp?error=true");
        }
    }
}
