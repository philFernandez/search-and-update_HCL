package com.hcl.searchandupdate.controller;

import java.util.Map;
import com.hcl.searchandupdate.dao.UserDao;
import com.hcl.searchandupdate.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
        return new ModelAndView("adduser", "user", new User());
    }

    @GetMapping("/search")
    public String searchUser() {
        return "search";
    }

    @PostMapping("/search")
    public ModelAndView searchResult(@RequestParam(value = "id") long id,
            @RequestParam(value = "name") String name,
            @RequestParam(value = "email") String email,
            @RequestParam(value = "password") String password) {
        User user = new User();
        userDao.deleteById(id);
        user.setEmail(email);
        user.setName(name);
        user.setPassword(password);
        userDao.save(user);
        return new ModelAndView("display", "user", user);
    }


}
