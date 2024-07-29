//package com.ethan.eurekafeignclient.controller;
//
//import com.ethan.eurekafeignclient.entity.User;
//import com.ethan.eurekafeignclient.service.FeignService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//public class FeignController {
//
//    @Autowired
//    FeignService feignService;
//
//    @GetMapping("/helloUser")
//    public String helloUser() {
//        StringBuilder str = new StringBuilder();
//        str.append(feignService.hello("czbk")).append("<BR/>");
//        str.append(feignService.hello(new User("czbk", 30))).append("<BR/>");
//        str.append(feignService.hello("czbk", 30)).append("<BR/>");
//        return str.toString();
//    }
//}
