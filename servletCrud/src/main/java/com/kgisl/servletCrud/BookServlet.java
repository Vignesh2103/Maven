package com.kgisl.servletCrud;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
@WebServlet(
    urlPatterns = "/books"
)
public class BookServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // get all books from the database
        List<Book> books = getbooksFromDatabase();

        // convert the list of books to JSON format
        String json = new Gson().toJson(books);

        // set the content type and send the response
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().write(json);
    }

    private List<Book> getbooksFromDatabase() {
        
        return null;
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         // read the book data from the request body
         String json = req.getReader().lines().collect(Collectors.joining(System.lineSeparator()));
         Book book = new Gson().fromJson(json, Book.class);
 
         // insert the book into the database
         addbookToDatabase(book);
 
         // set the response status code to 201 Created
         resp.setStatus(201);
    }
    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         // read the book data from the request body
         String json = req.getReader().lines().collect(Collectors.joining(System.lineSeparator()));
        Book book = new Gson().fromJson(json, Book.class);
 
         // update the book in the database
         updatebookInDatabase(book);
 
         // set the response status code to 204 No Content
         resp.setStatus(204);
    }
    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         // read the book id from the request parameter
         int id = Integer.parseInt(req.getParameter("id"));

         // delete the book from the database
         deletebookFromDatabase(id);
 
         // set the response status code to 204 No Content
         resp.setStatus(204);
    }

    private void deletebookFromDatabase(int id) {
    }

    private void updatebookInDatabase(Book book) {
    }

    private void addbookToDatabase(Book book) {
    }
    
}
