package com.kgisl.springBook.Model;

public class Book {

    protected int id;
    protected String title;
    protected String author;
    protected String price;
  
    public Book(){}
    public Book(int id, String title, String author, String price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id=id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    
    @Override
    public String toString() {
        return "Book [id=" + id + ", title=" + title + ", author=" + author + ", price=" + price + "]";
    }

    

    
}
