package com.kgisl.jsoncrud;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.stream.Collectors;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.gson.Gson;

@WebServlet("/books")
public class BookServlet extends HttpServlet {
    private Connection conn;
    String jdbcURL = "jdbc:mysql://localhost:3306/bookstore";
    String jdbcUsername = "root";
    String jdbcPassword = "";


    static ArrayList<Book> bookList = new ArrayList<Book>();
    @Override    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("DoGet called");
        bookList.clear();
        try {
             conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bookstore",
                    "root", "");
            Statement stmt = conn.createStatement();
            String strSelect = "select * from book";
            ResultSet rset = stmt.executeQuery(strSelect);
            while (rset.next()) { // Repeatedly process each row                int id = rset.getInt("id"); // retrieve a 'String'-cell in the row                String title = rset.getString("title"); // retrieve a 'String'-cell in the row                String author = rset.getString("author"); // retrieve a 'String'-cell in the row                Float price = rset.getFloat("price"); // retrieve a 'double'-cell in the row                int qty = rset.getInt("qty"); // retrieve a 'double'-cell in the row                // System.out.println(title + ", " + price + ", " + qty);                bookList.add(new Book(id, title, author, price, qty));
            }
            System.out.println(bookList.size());
            bookList.forEach(System.out::println);
            String g1 = new Gson().toJson(bookList);
            resp.getWriter().print(g1);
        } catch (SQLException e){
                   e.printStackTrace();
        }
    } 
    @Override    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost called");
        String requestData = req.getReader().lines().collect(Collectors.joining());
        Gson g = new Gson();
        Book newBook = g.fromJson(requestData, Book.class);
        System.out.println(newBook.getId() + " " + newBook.getAuthor() + " " + newBook.getPrice() + " "+ newBook.getQty() );
        try {
            if(insertBook(newBook)){
                System.out.println("Inserted successfully");
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       

    }
    public boolean insertBook(Book book) throws SQLException {
        String sql = "INSERT INTO book (title, author, price) VALUES (?, ?, ?)";
        connect();
         
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, book.getTitle());
        statement.setString(2, book.getAuthor());
        statement.setFloat(3, book.getPrice());
         
        boolean rowInserted = statement.executeUpdate() > 0;
        statement.close();
        disconnect();
        return rowInserted;
    }
    @Override    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPut called");
    }
    @Override    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doDelete called");
    }
    protected void connect() throws SQLException {
        if (conn == null || conn.isClosed()) {
            try {
                Class.forName( "com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                throw new SQLException(e);
            }
            conn = DriverManager.getConnection(
                                        jdbcURL, jdbcUsername, jdbcPassword);
        }
    }
     
    protected void disconnect() throws SQLException {
        if (conn != null && !conn.isClosed()) {
            conn.close();
        }
    }
    
}