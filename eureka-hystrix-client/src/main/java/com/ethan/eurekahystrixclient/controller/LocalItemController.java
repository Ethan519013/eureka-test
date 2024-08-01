package com.ethan.eurekahystrixclient.controller;

import com.ethan.eurekahystrixclient.service.LocalItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocalItemController {

    @Autowired
    LocalItemService localItemService;

    @RequestMapping("/hi")
    public String hi(String id) {
        return localItemService.hi(id);
    }

}
