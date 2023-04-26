package com.kgisl.springBook.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kgisl.springBook.DAO.BookDAO;
import com.kgisl.springBook.Model.Book;


@Controller
public class HomeController {
    @Autowired
    private BookDAO bookDAO;    
    @GetMapping("/")
    public String showPage() {
        
        return "index";
    }
    @GetMapping("/list")
    public String listBook(Model model){
        List<Book> bookList=bookDAO.getAllBooks();
        model.addAttribute("books", bookList);
        return "list-book";
    }

    @GetMapping("/showForm")
    public String showForm(Model model){
        model.addAttribute("book", new Book());
        return "book-form";
    }
    
    @PostMapping("/saveCustomer")
    public String saveCustomer(@ModelAttribute("book") Book book){
        bookDAO.addBook(book);
        return "redirect:/list";
    }

    
    @GetMapping("/updateForm")
    public String showFormForUpdate(@RequestParam("bookId") int id,Model model) {
       Book book = bookDAO.getBookById(id);
       model.addAttribute("book", book); 
        return "update-form";
    }

    @PostMapping("/update")
    public String updateBook(@ModelAttribute("book") Book book ,int id,Model model){
        bookDAO.updateBook(book);
        return "redirect:/list";
    }

    @GetMapping("/delete")
    public String deleteCustomer(@RequestParam("bookId") int id, Model model) {
        bookDAO.deleteBook(id);
        return "redirect:/list";
    }
}
