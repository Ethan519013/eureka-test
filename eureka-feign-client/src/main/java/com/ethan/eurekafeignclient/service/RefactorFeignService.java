package com.ethan.eurekafeignclient.service;

import com.ethan.dmcommonmodule.service.FeignService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;

@Service
@FeignClient("eureka-provider")
public interface RefactorFeignService extends FeignService {
}
