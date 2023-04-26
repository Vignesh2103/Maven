package com.kgisl.spring1.controller;

import java.util.List;

import javax.activation.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;





public class StudentJDBCTemp implements StudentDAO {
 
    // Class data members
     DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;
 
    // Method 1
    public void setDataSource(DataSource dataSource)
    {
        // This keyword refers to current instance itself
        this.dataSource = dataSource;
        this.jdbcTemplateObject
            = new JdbcTemplate((javax.sql.DataSource) dataSource);
    }
 
    // Method 2
    public List<Student> listStudents()
    {
        // Custom SQL query
        String SQL = "select * from Student";
        List<Student> students = jdbcTemplateObject.query(
            SQL, new Student());
 
        return students;
    }
}