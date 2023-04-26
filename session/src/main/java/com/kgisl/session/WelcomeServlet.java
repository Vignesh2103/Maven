package com.kgisl.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(false);
        if (session != null) {
            String username = (String) session.getAttribute("username");
            String email = (String) session.getAttribute("email");
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("Welcome " + username + "<br>");
            out.println("Email: " + email + "<br>");
            out.println("<a href='logout'>Logout</a>");
        } else {
            response.sendRedirect("login.jsp");
        }

    }

}
