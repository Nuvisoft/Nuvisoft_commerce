package com.nuvissoft.commerce.authorizationserver.client;

import com.nuvissoft.commerce.authorizationserver.model.SimpleUser;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "service-user")
public interface FeignClientService {
    
    @GetMapping("/api/user/findByUserName")
    public SimpleUser finByUsername(@RequestParam String username);

}
