// Dummy content for com/skillbridge/servlets/RegisterServlet.java
package com.skillbridge.servlets;

import com.skillbridge.dao.UserDAO;
import com.skillbridge.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String userType = request.getParameter("userType");

        User user = new User(username, password, email, userType);
        UserDAO userDAO = new UserDAO();

        if (userDAO.registerUser(user)) {
            response.sendRedirect("login.jsp");
        } else {
            response.sendRedirect("register.jsp?error=true");
        }
    }
}
