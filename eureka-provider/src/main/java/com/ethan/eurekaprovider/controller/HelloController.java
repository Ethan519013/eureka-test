package com.ethan.eurekaprovider.controller;

import com.ethan.eurekaprovider.entity.User;
import org.springframework.web.bind.annotation.*;

//@RestController
public class HelloController {

    @GetMapping("/hello1")
    public String hello(@RequestParam String name) {
        return "hello" + name;
    }

    @GetMapping("/hello2")
    public User hello(@RequestParam String name, @RequestHeader Integer age) {
        return new User(name, age);
    }

    @PostMapping("/hello3")
    public String hello(@RequestBody User user) {
        return "hello" + user.getName() + " " + user.getAge();
    }
}
