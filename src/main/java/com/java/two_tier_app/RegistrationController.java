package com.java.two_tier_app;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/register")
public class RegistrationController {
   @Autowired
   private UserService userService;

    @PostMapping("/user")
    public ResponseEntity<String> registerUser(@RequestBody UserRequest userRequest) {
        log.info("Inside registerUser with payload {}", userRequest);
        User user = User.builder().firstName(userRequest.getFirstName()).lastName(userRequest.getLastName()).build();
        User user1 = userService.saveUser(user);
        int id = user1.getId();
        return ResponseEntity.ok().body("User registered successfully: "+id);
    }
}
