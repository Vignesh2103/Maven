package com.kgisl.webapp2;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Hello extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        resp.setContentType("text/html");  
        PrintWriter out = resp.getWriter(); 
        
        ServletConfig config = getServletConfig();
        String pname = config.getInitParameter("pname");
        
        String uname = req.getParameter("uname");
        String pass = req.getParameter("pass");
        
        req.setAttribute("uname", uname);
        req.setAttribute("pass", pass);
     
        if(uname.length()>0){  
            RequestDispatcher rd=req.getRequestDispatcher("menu.jsp");  
            rd.forward(req, resp);  
        }  
        else{  
            out.print("Sorry Please Enter the User name");  
            RequestDispatcher rd=req.getRequestDispatcher("index.jsp");  
            rd.include(req, resp);  
                          
            } 
            
        

    }
    
}
