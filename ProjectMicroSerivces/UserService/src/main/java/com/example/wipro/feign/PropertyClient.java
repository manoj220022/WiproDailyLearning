package com.example.wipro.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Map;

@FeignClient(name = "PropertyHouseService")
public interface PropertyClient {

    @GetMapping("/api/v1/houses")
    List<Map<String, Object>> getAllProperties();

    @GetMapping("/api/v1/houses/{id}")
    Map<String, Object> getPropertyById(@PathVariable("id") Long id);
}
