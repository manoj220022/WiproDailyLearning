package com.example.wipro.feign;

import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.math.BigDecimal;

@FeignClient(name = "PropertyHouseService", url = "http://localhost:8888")

public interface PropertyClient {

    @GetMapping("/api/v1/houses/{id}")
    PropertyResponse getPropertyById(@PathVariable(name = "id") Long id);

    record PropertyResponse(Long id, String name, BigDecimal pricePerDay) {}
}
