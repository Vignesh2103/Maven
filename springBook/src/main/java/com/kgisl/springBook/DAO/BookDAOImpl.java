package com.kgisl.springBook.DAO;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kgisl.springBook.Model.Book;

@Repository
public class BookDAOImpl implements BookDAO {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Book> getAllBooks() {
        String sql = "SELECT * FROM book";
        List<Book> books = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Book.class));
        return books;
    }

   

    @Override
    public int addBook(Book book) {
        String sql = "INSERT INTO book (id,title, author, price) VALUES (?,?, ?, ?)";
        int result = jdbcTemplate.update(sql,book.getId(), book.getTitle(), book.getAuthor(), book.getPrice());
        return result;
    }

    @Override
    public int updateBook(Book book) {
        String sql = "UPDATE book SET title = ?, author = ?, price = ? WHERE id = ?";
        int result = jdbcTemplate.update(sql, book.getTitle(), book.getAuthor(), book.getPrice(), book.getId());
        return result;
    }

    @Override
    public int deleteBook(int id) {
        String sql = "DELETE FROM book WHERE id = ?";
        int result = jdbcTemplate.update(sql, id);
        return result;
    }

    @Override
    public Book getBookById(int id) {
        String sql = "SELECT * FROM book WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, (rs, rowNum) -> {
            Book book = new Book();
            book.setId((int) rs.getLong("id"));
            book.setTitle(rs.getString("title"));
            book.setAuthor(rs.getString("author"));
            book.setPrice(rs.getString("price"));
            // set other properties
            return book;
        }, id);
    }
}
