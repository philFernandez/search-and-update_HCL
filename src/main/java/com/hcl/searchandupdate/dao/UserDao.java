package com.hcl.searchandupdate.dao;

import com.hcl.searchandupdate.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User, Long> {
    
}
