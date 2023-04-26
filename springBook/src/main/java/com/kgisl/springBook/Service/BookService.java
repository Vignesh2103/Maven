package com.kgisl.springBook.Service;

import java.util.List;

import com.kgisl.springBook.Model.Book;

public interface BookService {
    public List<Book> getAllBooks();
    public Book getBookById(int id);
    public int addBook(Book book);
    public int updateBook(Book book);
    public int deleteBook(int id);
    
    
}
