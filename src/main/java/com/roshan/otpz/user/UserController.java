package com.roshan.otpz.user;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/test")
public class UserController {
    private final UserService userServiceImplementation;
    public UserController(UserServiceImplementation userServiceImplementation) {
        this.userServiceImplementation = userServiceImplementation;
    }

    @GetMapping("/register")
    public String userRegister(){
        return "Welcome to register page";
    }


    @PostMapping("/register")
    public Optional<User> userRegister(@RequestBody UserLoginDto userLoginDto){
         return userServiceImplementation.loginUser(userLoginDto.getEmail(),userLoginDto.getPassword());
    }
    @GetMapping("/login")
    public List<User> userLogin(){
        return userServiceImplementation.getAllUsers();
    }

    @PostMapping("/login")
    public Optional<User> userLogin(@RequestBody UserLoginDto userLoginDto){
        return userServiceImplementation.loginUser(userLoginDto.getEmail(),userLoginDto.getPassword());
    }

}
