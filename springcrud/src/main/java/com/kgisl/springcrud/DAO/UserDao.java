package com.kgisl.springcrud.DAO;

import java.util.List;

import javax.sql.DataSource;

import com.kgisl.springcrud.Pojo.User;

public interface UserDao {
    public List<User> getAllUsers();
    // public User getUserById(int id);
    public void addUser(User user);
    public void setDataSource(DataSource ds);
    public void updateUser(User user);
    public void deleteUser(int id);

    
}
