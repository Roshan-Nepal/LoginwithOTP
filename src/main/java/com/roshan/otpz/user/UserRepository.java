package com.roshan.otpz.user;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    private List<User> users = new ArrayList<User>();
    @PostConstruct
    public void init() {
        users.add(new User("Roshan","roshan@gmail.com","roshan@123"));
        users.add(new User("Jack","jack@gmail.com","jack@123"));
        users.add(new User("Jane","jane@gmail.com","jane@123"));

    }
    public List<User> getUsers() {
        return users;
    }
}
