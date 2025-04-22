package com.springboot.jsontoxml.rest;

import com.springboot.jsontoxml.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DataController {
    @Autowired
    private DataService dataService;

    @GetMapping(value = "/data/xml", produces = MediaType.APPLICATION_XML_VALUE)
    public  String getXmlData() throws Exception {
        return dataService.convertJsonToXml();
    }
}
