package com.kgisl.login;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginFilter implements Filter {

    
    

    @Override
    public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
            throws IOException, ServletException {
                arg1.setContentType("text/html");
                PrintWriter out = arg1.getWriter();
                String uname = arg0.getParameter("uname");
                if(uname.equalsIgnoreCase("vignesh")){
                    // RequestDispatcher rd = arg0.getRequestDispatcher("Welcome.jsp");
                    // rd.forward(arg0, arg1);
                    arg2.doFilter(arg0, arg1);
                }
                else{
                    out.print("username or password error!");  
                    RequestDispatcher rd = arg0.getRequestDispatcher("index.jsp");
                    rd.include(arg0, arg1);
                }



        
    }
   

    @Override
    public void init(FilterConfig arg0) throws ServletException {
        // TODO Auto-generated method stub
        
        
    }

    @Override
    public void destroy() {
        // TODO Auto-generated method stub
        
    }

    

    
}