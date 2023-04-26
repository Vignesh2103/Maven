package com.kgisl.webapp1;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Hello extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        System.out.println("Hello Servlet doGet() calling");
        String uname = req.getParameter("uname");
        String pass = req.getParameter("pass");
        req.setAttribute("uname", uname);
        req.setAttribute("pass", pass);
        System.out.println(uname);
        System.out.println(pass);
        ServletContext context = getServletContext();
        String driverName = context.getInitParameter("dname");
        System.out.println(driverName);

        ServletConfig config = getServletConfig();
        String name = config.getInitParameter("uname");
        System.out.println(name);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");  
        PrintWriter out = resp.getWriter();  
        String uname = req.getParameter("uname");
        String pass = req.getParameter("pass");
        req.setAttribute("uname", uname);
        req.setAttribute("pass", pass);

        if(uname.equals("Hari")){  
            RequestDispatcher rd=req.getRequestDispatcher("menu.jsp");  
            rd.forward(req, resp);  
        }  
        else{  
            out.print("Sorry UserName or Password Error!");  
            RequestDispatcher rd=req.getRequestDispatcher("index.jsp");  
            rd.include(req, resp);  
                          
            }  
    }

}
