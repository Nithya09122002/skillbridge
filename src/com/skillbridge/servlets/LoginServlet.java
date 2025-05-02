// Dummy content for com/skillbridge/servlets/LoginServlet.java
package com.skillbridge.servlets;

import com.skillbridge.dao.MessageDAO;
import com.skillbridge.model.Message;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/SendMessageServlet")
public class SendMessageServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int senderId = Integer.parseInt(request.getParameter("senderId"));
        int receiverId = Integer.parseInt(request.getParameter("receiverId"));
        String messageText = request.getParameter("message");

        Message message = new Message(senderId, receiverId, messageText);
        MessageDAO messageDAO = new MessageDAO();

        if (messageDAO.sendMessage(message)) {
            response.sendRedirect("chat.jsp");
        } else {
            response.sendRedirect("chat.jsp?error=true");
        }
    }
}
