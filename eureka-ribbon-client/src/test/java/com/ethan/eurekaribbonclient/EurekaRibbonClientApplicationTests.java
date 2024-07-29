package com.ethan.eurekaribbonclient;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@SpringBootTest
class EurekaRibbonClientApplicationTests {

    @Autowired
    DiscoveryClient discoveryClient;

    @Autowired
    RestTemplate restTemplate;

    @Test
    public void test02() {

    }

    @Test
    public void test01() {
        List<String> services = discoveryClient.getServices();
        System.out.println(services);

//        List<ServiceInstance> instances = discoveryClient.getInstances("eureka-provider");
//        ServiceInstance instance = instances.get(0);
//        System.out.println(instance);
//        String url = "http://" + instance.getHost() + ":" + instance.getPort() + "/port";
//        System.out.println(url);
//        ResponseEntity<String> response = restTemplate.exchange(
//                url, HttpMethod.GET, null, new ParameterizedTypeReference<String>() {});
//        System.out.println(response.getBody());
    }

}
