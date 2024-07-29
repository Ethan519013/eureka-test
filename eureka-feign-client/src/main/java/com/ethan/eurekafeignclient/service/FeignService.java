//package com.ethan.eurekafeignclient.service;
//
//import com.ethan.eurekafeignclient.entity.User;
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.*;
//
//@Service
////@FeignClient(name = "eureka-provider")
//public interface FeignService {
//
//    @GetMapping("/hello")
//    String hello();
//
//    @GetMapping("/hello1")
//    String hello(@RequestParam("name") String name);
//
//    @GetMapping("/hello2")
//    User hello(@RequestParam("name") String name, @RequestHeader("age") Integer age);
//
//    @PostMapping("/hello3")
//    String hello(@RequestBody User user);
//
//}
