package com.ethan.eurekahystrixclient.service;

import com.ethan.eurekahystrixclient.config.HystrixConfig;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Service
@FeignClient(name = "eureka-hystrix-provider", configuration = HystrixConfig.class, fallback = LocalItemServiceImpl.class)
public interface LocalItemService {

    @GetMapping("/hi")
    String hi(@RequestParam("id") String id);

}



//@Service
//public class LocalItemService {
//    @Autowired
//    RestTemplate restTemplate;
//
//    @HystrixCommand(fallbackMethod = "hiError")
//    public String hi(String id) {
//        return restTemplate.getForObject("http://eureka-hystrix-provider/hi?id=" + id, String.class);
//    }
//
//    public String hiError(String id) {
//        return String.format("Hi, your message is : %s but request bad.", id);
//    }
//}
