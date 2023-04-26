package com.kgisl.webapp2;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class ServletConf extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = getServletContext();
        String dname= context.getInitParameter("dname");
        req.setAttribute("dname", dname);
        
        ServletConfig config = getServletConfig();
        String pname = config.getInitParameter("pname");
        req.setAttribute("pname", pname);
        RequestDispatcher rd=req.getRequestDispatcher("jsp1.jsp");  
        rd.forward(req, resp);
    }
    
}
