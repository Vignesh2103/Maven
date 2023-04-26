package com.kgisl.carCRUD;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CarServlet extends HttpServlet{
     private CarDAO carDao;

    @Override
    public void init(){
        String jdbcURL="jdbc:mysql://localhost:3306/carstore?serverTimezone=UTC";
        String jdbcUsername="root";
        String jdbcPassword="";

        carDao = new CarDAO(jdbcURL, jdbcUsername, jdbcPassword, null);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    }
    
}
