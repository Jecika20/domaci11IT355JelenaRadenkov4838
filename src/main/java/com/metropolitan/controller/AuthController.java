package com.metropolitan.controller;


import com.metropolitan.models.JwtResponse;
import com.metropolitan.models.User;
import com.metropolitan.sevices.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<?> register (@RequestBody User user) {
         User newUser= userService.saveUser(user);
         return new ResponseEntity<>(newUser, HttpStatus.CREATED);

    }
}
