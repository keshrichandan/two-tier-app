package com.java.two_tier_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public User saveUser(User user) {
        User existUser = userRepository.findByName(user.getFirstName(), user.getLastName());
        if (existUser != null) {
            System.out.println("User already exists! "+user.getFirstName()+" "+user.getLastName());
            return existUser;
        }
        User newUser = userRepository.save(user);
        System.out.println("newUser.getId() = " + newUser.getId());
        return newUser;
    }
}
