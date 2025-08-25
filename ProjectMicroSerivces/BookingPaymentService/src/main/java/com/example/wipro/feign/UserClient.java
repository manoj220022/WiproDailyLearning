package com.example.wipro.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;

@FeignClient(name = "UserService", url = "http://localhost:8887")
public interface UserClient {

    @GetMapping("/api/v1/users/{id}")
    Map<String, Object> getUserById(@PathVariable(name = "id") Long id);
}
