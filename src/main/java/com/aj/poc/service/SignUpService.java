package com.aj.poc.service;

import com.aj.poc.entity.User;
import com.aj.poc.exception.UserException;
import com.aj.poc.repository.SignUpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignUpService {

    @Autowired
    private SignUpRepository signUpRepository;

    public String addUser(User user) throws UserException {
        if (!signUpRepository.existsById(user.getId())) {
            signUpRepository.save(user);
            return "User added successfully.";
        } else {
            throw new UserException("The user is already present in the application.");
        }
    }
}
