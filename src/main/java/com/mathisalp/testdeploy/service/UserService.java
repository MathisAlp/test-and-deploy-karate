package com.mathisalp.testdeploy.service;

import java.util.List;

import com.mathisalp.testdeploy.entity.User;

public interface UserService {
    User saveUser(User user) ;
    User fetchUserById(Long id);
    List<User> findAllUsers();
    
} 
