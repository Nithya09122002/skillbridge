// Dummy content for com/skillbridge/servlets/ChatServlet.java
package com.skillbridge.servlets;

import com.skillbridge.dao.MessageDAO;
import com.skillbridge.model.Message;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/ChatServlet")
public class ChatServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int userId = Integer.parseInt(request.getParameter("userId"));
        int chatWithUserId = Integer.parseInt(request.getParameter("chatWithUserId"));

        MessageDAO messageDAO = new MessageDAO();
        List<Message> messages = messageDAO.getMessages(userId, chatWithUserId);

        request.setAttribute("messages", messages);
        request.getRequestDispatcher("chat.jsp").forward(request, response);
    }
}
