package com.springboot.springsecurity.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class UserRegistrationDetails {
    private String emailId;
    private String password;
    private String firstName;
    private String lastName;
}
