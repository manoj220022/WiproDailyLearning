package com.example.wipro.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@FeignClient(name = "PaymentService", url = "http://localhost:8081") 
public interface PaymentClient {

    @GetMapping("/api/v1/payments/{id}")
    PaymentResponse getPaymentById(@PathVariable("id") Long id);

    record PaymentResponse(
            Long id,
            Long propertyId,
            String propertyName,
            Long userId,
            BigDecimal amount,
            String status,
            LocalDateTime paymentDate
    ) {}
}
