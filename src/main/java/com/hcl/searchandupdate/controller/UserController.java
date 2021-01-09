package com.hcl.searchandupdate.controller;

import com.hcl.searchandupdate.dao.UserDao;
import com.hcl.searchandupdate.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserDao userDao;

    @PostMapping("/add")
    public String newUser(User u) {
        userDao.save(u);
        return ("redirect:/user/search");
    }

    @GetMapping("/add")
    public ModelAndView addNewUser() {
        User u = new User();
        return new ModelAndView("adduser", "userform", u);
    }

    @GetMapping("/search")
    public String searchUser() {
        return "search";
    }
}