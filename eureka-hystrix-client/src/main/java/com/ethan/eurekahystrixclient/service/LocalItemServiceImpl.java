package com.ethan.eurekahystrixclient.service;

import org.springframework.stereotype.Component;

@Component
public class LocalItemServiceImpl implements LocalItemService {
    @Override
    public String hi(String id) {
        return String.format("<h1>Hi, your message is : %s but request bad.</h1>", id );
    }
}
