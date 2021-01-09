package com.hcl.searchandupdate.service;

import com.hcl.searchandupdate.dao.UserDao;
import com.hcl.searchandupdate.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User updateUser(long id, String name, String email, String password) {
        User user = userDao.findById(id).get();
        if (isNotEmpty(name)) user.setName(name);
        if (isNotEmpty(email)) user.setEmail(email);
        if (isNotEmpty(password)) user.setPassword(password);
        userDao.save(user);
        return user;
    }

    public void saveUser(User user) {
        userDao.save(user);
    }
    
    private boolean isNotEmpty(String s) {
        return s != "";
    }


}
