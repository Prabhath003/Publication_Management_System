package com.swe.pms.web;

import org.springframework.web.bind.annotation.RestController;

import com.swe.pms.domain.User;
import com.swe.pms.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/users")
public class UserController {
    
    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User createUser = userService.createUser(user);
        return ResponseEntity.ok().body(createUser);
    }
    
    // Other controller methods ...
}
