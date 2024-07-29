package com.ethan.eurekafeignclient.controller;

import com.ethan.dmcommonmodule.entity.User;
import com.ethan.eurekafeignclient.service.RefactorFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RefactorFeignController {

    @Autowired
    RefactorFeignService refactorFeignService;

    @GetMapping("/feign-consumer")
    public String feignConsumer() {
        StringBuilder str = new StringBuilder();
        str.append(refactorFeignService.hello("czbk")).append("<BR/>");
        str.append(refactorFeignService.hello(new User("czbk", 30))).append("<BR/>");
        str.append(refactorFeignService.hello("czbk", 30)).append("<BR/>");
        return str.toString();
    }
}
