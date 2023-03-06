package com.netcracker.userservice.service;

import com.netcracker.userservice.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    User saveUser(User user);

    List<User> getUsers();

    User getUserById(Integer id);

}
