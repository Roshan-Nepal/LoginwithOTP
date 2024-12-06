package com.roshan.otpz.user;

import java.util.List;
import java.util.Optional;

public interface UserService {
    Optional<User> loginUser(String email, String password);
    List<User> getAllUsers();
}
