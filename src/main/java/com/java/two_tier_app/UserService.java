package com.java.two_tier_app;

import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User saveUser(User user);
}
