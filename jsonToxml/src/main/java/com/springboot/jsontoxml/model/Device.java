package com.springboot.jsontoxml.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Device {

    @JacksonXmlProperty(localName = "did")
    @JsonProperty("did")
    private String did;

    @JacksonXmlProperty(localName = "deviceName")
    @JsonProperty("device_name")
    private String deviceName;

    @JacksonXmlProperty(localName = "ip")
    @JsonProperty("ip")
    private String ip;


    public String getDid(){
        return did;
    }
    public String getDeviceName(){
        return deviceName;
    }
    public String getIp(){
        return ip;
    }

    public void setDid(String did){
        this.did = did;
    }
    public void setDeviceName(String deviceName){
        this.deviceName = deviceName;
    }
    public void setIp(String ip){
        this.ip = ip;
    }
}
