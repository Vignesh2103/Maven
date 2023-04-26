package com.kgisl.ServletAnnotaion;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
/**
 * ServletConfigDemo
 */
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
    urlPatterns = "/serv1",
    initParams = {
        @WebInitParam(name = "username", value ="vignesh")
    }

)
public class ServletConfigDemo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        resp.setContentType("text/html");  
        PrintWriter out = resp.getWriter();
        System.out.println("DO Get Method");
        // ServletConfig config = getServletConfig();
        // String username = config.getInitParameter("username");
        // req.setAttribute("username", username);
        String username = getInitParameter("username");
        System.out.println(username);
        out.print(username);
        RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
        rd.include(req, resp);;
    }

    
}