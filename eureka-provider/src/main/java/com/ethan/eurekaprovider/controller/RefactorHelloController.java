package com.ethan.eurekaprovider.controller;

import com.ethan.dmcommonmodule.entity.User;
import com.ethan.dmcommonmodule.service.FeignService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RefactorHelloController implements FeignService {

    @Value("${server.port}")
    String port;

    @Override
    public String hello() {
        return "Hello";
    }

    @Override
    public String hello(@RequestParam("name") String name) {
        return "Hello " + name + " " + port;
    }

    @Override
    public User hello(@RequestParam("name")String name, @RequestHeader("age") Integer age) {
        return new User(name + " " + port, age);
    }

    @Override
    public String hello(@RequestBody User user) {
        return "Hello " + user.getName() + " " + user.getAge() + " " + port;
    }
}
