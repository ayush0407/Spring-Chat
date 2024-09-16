package com.aj.poc.controller;

import com.aj.poc.entity.User;
import com.aj.poc.exception.UserException;
import com.aj.poc.service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignUpController {

    @Autowired
    private SignUpService signUpService;

    @PostMapping("/signup")
    public ResponseEntity<String> signUp(@RequestBody User user) {
        try {
            return ResponseEntity.ok(signUpService.addUser(user));
        } catch (UserException ue) {
            return ResponseEntity.ofNullable(ue.getMessage());
        }

    }
}
