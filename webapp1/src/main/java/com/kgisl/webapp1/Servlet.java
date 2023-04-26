package com.kgisl.webapp1;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = getServletContext();
        String driverName = context.getInitParameter("dname");
        System.out.println(driverName);

        ServletConfig config = getServletConfig();
        String name = config.getInitParameter("uname");
        System.out.println(name);

    }
    
}
