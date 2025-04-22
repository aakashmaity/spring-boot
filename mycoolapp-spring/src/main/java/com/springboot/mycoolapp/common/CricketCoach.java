package com.springboot.mycoolapp.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {


    @Override
    public String getDailyworkout() {
        return "Practice fast bowling for 1 hour :)";
    }
}
