package com.ethan.eurekaprovideranother.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PortController {
    @Value("${server.port}")
    String port;

    @RequestMapping("port")
    public String getPort() {
        return "Hello World, I'm from port:" + port;
    }
}
