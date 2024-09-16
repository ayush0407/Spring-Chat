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

        if (signUpRepository.existsById(user.getUserId())) {
            throw new UserException("The user is already present in the application.");
        }
        if (signUpRepository.countByPhoneNumber(user.getUserId().getPhoneNumber())>0) {
            throw new UserException("The phone number is already associated with another user.");
        }

        signUpRepository.save(user);
        return "User added successfully.";
    }

    public boolean checkIfUserIsSignedUp(String phoneNumber) {
        return signUpRepository.countByPhoneNumber(phoneNumber) >0;
    }
}
