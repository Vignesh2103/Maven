package com.kgisl.webapp1;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Main extends HttpServlet {
    @Override
    public void init() throws ServletException {
        // TODO Auto-generated method stub
        System.out.println("init");
    }
    @Override
    protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
        // TODO Auto-generated method stub
        System.out.println("service");
    }
    @Override
    public void destroy() {
        // TODO Auto-generated method stub
       System.out.println("Destroy");
    }

}
