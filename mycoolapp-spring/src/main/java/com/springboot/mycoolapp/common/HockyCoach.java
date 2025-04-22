package com.springboot.mycoolapp.common;

import org.springframework.stereotype.Component;

@Component
public class HockyCoach implements Coach {

    @Override
    public String getDailyworkout(){
        return "Practice penalty strike - hockey";
    }
}
