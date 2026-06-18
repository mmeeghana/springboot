package com.meghanab.springboot.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.meghanab.springboot.models.User;

@Service
public class UserService {
    private List<User> allUsers;

    private int curId = 3;
    public UserService() {
        allUsers =new ArrayList<>();
        allUsers.add(new User(1, "john", "male", "/images/image.png"));
        allUsers.add(new User(2, "jane", "female", "/images/image-2.png"));
    }
    public List<User> getAllUsers() {
        return allUsers;
    }
    public User getUserById(int id) {
        for (int i=0;i<allUsers.size();i++) {
            if (allUsers.get(i).getId() == id) {
                return allUsers.get(i);
            }
        }
        return null; // Return null if user not found
    }

    public User addUser(User user) {
        user.setId(curId);
        curId++;
        allUsers.add(user);
        return user;
    }

}
