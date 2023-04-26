package com.kgisl.webPage;



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
// import javax.servlet.annotation.WebListener;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
// import javax.servlet.http.HttpSessionEvent;
// import javax.servlet.http.HttpSessionListener;

@WebServlet(
    urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username.equals("admin") && password.equals("admin123")) {
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            response.sendRedirect("welcome.jsp");
        } else {
            out.println("Invalid username or password");
            request.getRequestDispatcher("login.html").include(request, response);
        }

    }

}
