package com.hcl.searchandupdate.controller;

import java.util.List;
import com.hcl.searchandupdate.dao.UserDao;
import com.hcl.searchandupdate.entity.User;
import com.hcl.searchandupdate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public String newUser(User user) {
        userService.saveUser(user);
        return ("redirect:/user/list");
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
    public ModelAndView updateSearchResult(@RequestParam(value = "id") long id,
            @RequestParam(value = "name") String name,
            @RequestParam(value = "email") String email,
            @RequestParam(value = "password") String password) {
        User user = userService.updateUser(id, name, email, password);
        return new ModelAndView("display", "user", user);
    }

    @GetMapping("/list")
    public ModelAndView listUsers() {
        List<User> users = userService.getAllUsers();
        return new ModelAndView("listUsers", "users", users);
    }

    
}
