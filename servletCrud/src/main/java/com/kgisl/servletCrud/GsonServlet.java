package com.kgisl.servletCrud;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

@WebServlet(urlPatterns = "/gson")
public class GsonServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // List<String> list = new ArrayList<>();
        // list.add("Vignesh");
        // list.add("Dinesh");
        // list.add("Hari");
        // list.add("sumith");
        // list.add("Susinder");
        // String g1 = new Gson().toJson(list);
        // resp.getWriter().print(g1);
        RequestDispatcher rd = req.getRequestDispatcher("Gson.jsp");
        rd.forward(req, resp);
        

    }

   protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("insert method");
        String requestData = req.getReader().lines().collect(Collectors.joining());
       
        // Gson g = new Gson();
        // Book neworder = g.fromJson(requestData, Book.class);
        // JSONObject json = new JSONObject(requestData);   
    //     System.out.println(neworder.getId() + " " + neworder.getTitle() + " " + neworder.getAuthor() + " "
    // + neworder.getPrice() + "," + neworder.getPrice());
    }

   
}
