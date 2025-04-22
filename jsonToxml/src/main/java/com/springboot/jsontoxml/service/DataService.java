package com.springboot.jsontoxml.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.springboot.jsontoxml.model.User;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.List;

@Service
public class DataService {
    public String convertJsonToXml() throws Exception {
        ObjectMapper objMapper = new ObjectMapper();
        InputStream inputStream = getClass().getResourceAsStream("/util/data.json");

        List<User> users = objMapper.readValue(inputStream, new TypeReference<List<User>>() {});

        XmlMapper xmlmapper = new XmlMapper();
        return  xmlmapper.writeValueAsString(users);
    }
}
