package com.ethan.eurekahystrixprovider.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HystrixController {

    @GetMapping("/hi")
    public String hi(String id) {
        return String.format("<h1>Hello World, I'm Hystrix! %s </h1>", id);
    }
}
