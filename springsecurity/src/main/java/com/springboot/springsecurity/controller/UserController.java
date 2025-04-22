package com.springboot.springsecurity.controller;

import com.springboot.springsecurity.domain.UserRegistrationDetails;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/user")
public class UserController {

//    Logger logger = LoggerFactory.getLogger(UserController.class);


    @PostMapping("/register")
    public ResponseEntity<UserRegistrationDetails> registerUser(UserRegistrationDetails userRegistrationDetails) {

//        log.info("Request received to register user: {}", userRegistrationDetails.getClass());
        return ResponseEntity.ok(userRegistrationDetails);

    }

    // POST user login /login


    // GET user name, email, user id


    // PATCH update user details


    // DELETE user
}
