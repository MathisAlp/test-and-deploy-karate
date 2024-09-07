package com.mathisalp.testdeploy.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mathisalp.testdeploy.entity.User;

@Service
public class UserServiceImpl implements UserService{
    List<User> users = new ArrayList<>(
            List.of(new User(1L, "Mathis", "mathis@alp.com", "123456"),
                    new User(2L, "Elsy", "elsy@gba.com", "123456"),
                    new User(3L, "Eddy", "eddy@gba.com", "123456"))
    );

    /**
     * @param user
     * @return User
     */
    @Override
    public User saveUser(User user) {
        users.add(user);
        return user;
    }

    /**
     * @param id
     * @return User
     */
    @Override
    public User fetchUserById(Long id) {
        return users.stream().filter(user -> user.getId().equals(id)).findFirst().orElseThrow(() -> new RuntimeException("User not found"));
    }

    /**
     * @return
     */
    @Override
    public List<User> findAllUsers() {
        return users;
    }
    
}
