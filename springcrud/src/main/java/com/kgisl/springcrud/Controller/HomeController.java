package com.kgisl.springcrud.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kgisl.springcrud.DAO.UserDao;
import com.kgisl.springcrud.Pojo.User;

@Controller
public class HomeController {

    private UserDao userDao;

    // Inject UserDao dependency using constructor injection
    @Autowired
    public HomeController(UserDao userDao) {
        this.userDao = userDao;
    }

    @RequestMapping("/")
    public String showPage(Model model) {
        List<User> users = userDao.getAllUsers();
        model.addAttribute("users", users);
        return "home";
    }
}
