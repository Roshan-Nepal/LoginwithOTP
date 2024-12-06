package com.roshan.otpz.user;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class UserServiceImplementation implements UserService {
    private final UserRepository userRepository;

    public UserServiceImplementation(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public Optional<User> loginUser(String email, String password) {
        return userRepository.getUsers().stream().filter(user -> Objects.equals(user.getEmail(), email) && Objects.equals(user.getPassword(), password)).findFirst();
    }
    @Override
    public List<User> getAllUsers() {
        return userRepository.getUsers();
    }
}
