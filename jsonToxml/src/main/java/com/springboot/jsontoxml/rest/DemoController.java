package com.springboot.jsontoxml.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/")
    public String welcome(){
        return "Go to this url to see XML data. link: http://localhost:8080/api/data/xml";
    }
}
