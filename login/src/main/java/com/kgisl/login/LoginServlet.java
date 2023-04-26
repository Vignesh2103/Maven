package com.kgisl.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * LoginServlet
 */
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String uname = req.getParameter("uname");
        req.setAttribute("uname", uname);
        RequestDispatcher rd = req.getRequestDispatcher("Welcome.jsp");
        rd.forward(req, resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String uname = req.getParameter("uname");
        req.setAttribute("uname", uname);
        RequestDispatcher rd = req.getRequestDispatcher("Welcome.jsp");
        rd.forward(req, resp);
    }

}
