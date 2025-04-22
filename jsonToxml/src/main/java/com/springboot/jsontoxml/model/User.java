package com.springboot.jsontoxml.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

public class User {
    @JacksonXmlProperty(localName = "Uid")
    @JsonProperty("uid")
    private int uid;

    @JacksonXmlProperty(localName = "Name")
    @JsonProperty("name")
    private  String name;

    @JacksonXmlProperty(localName = "State")
    @JsonProperty("state")
    private String state;


    @JacksonXmlElementWrapper(localName = "devices")
    @JsonProperty("devices")
    private List<Device> devices;

    public int getUid(){
        return uid;
    }
    public String getName(){
        return name;
    }
    public String getState(){
        return state;
    }
    public List<Device> getDevices(){
        return devices;
    }


    public void setUid(int uid){
        this.uid = uid;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setState(String state) {
        this.state = state;
    }
    public void setDevices(List<Device> devices){
        this.devices = devices;
    }
}
