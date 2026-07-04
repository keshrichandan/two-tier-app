package com.java.two_tier_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public User saveUser(User user) {
        User user1 = userRepository.save(user);
        System.out.println("user1.getId() = " + user1.getId());
        return user1;
    }
}
