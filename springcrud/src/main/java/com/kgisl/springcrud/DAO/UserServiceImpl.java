package com.kgisl.springcrud.DAO;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kgisl.springcrud.Pojo.User;

@Service
public class UserServiceImpl  {
    @Autowired
    private UserDao userDao;

    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    // public User getUserById(int id) {
    //     return userDao.getUserById(id);
    // }

    public void addUser(User user) {
        userDao.addUser(user);
    }

    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }

    
}
