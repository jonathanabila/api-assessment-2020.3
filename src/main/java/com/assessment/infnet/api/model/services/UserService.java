package com.assessment.infnet.api.model.services;

import com.assessment.infnet.api.model.models.User;
import com.assessment.infnet.api.model.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private IUserRepository userRepository;

    public boolean userExists(String userName) {
        return userRepository.findByUserName(userName) != null;
    }

    public User authenticate(String userName, String password) {
        return userRepository.authenticate(userName, password);
    }

    public void addUser(User user) {
        userRepository.save(user);
    }
}