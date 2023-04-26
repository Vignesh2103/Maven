package com.kgisl.springBook.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kgisl.springBook.DAO.BookDAO;
import com.kgisl.springBook.Model.Book;

@Service
public class BookServiceImpl implements BookService{
  @Autowired
  private BookDAO bookDAO;
   
  public List<Book> getAllBooks() {
    return bookDAO.getAllBooks();
  }

  public Book getBookById(int id) {
    return bookDAO.getBookById(id);
  }

  public int addBook(Book book) {
    return bookDAO.addBook(book);
  }

  public int updateBook(Book book) {
    return bookDAO.updateBook(book);
  }

  public int deleteBook(int id) {
    return bookDAO.deleteBook(id);
  }
}

