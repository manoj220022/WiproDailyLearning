package com.example.wipro.controllers;

import com.example.wipro.dto.PaymentRequest;
import com.example.wipro.dto.PaymentResponse;
import com.example.wipro.services.PaymentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/payments")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;

    @PostMapping("/make")
    @ResponseStatus(HttpStatus.CREATED)
    public PaymentResponse makePayment(@Valid @RequestBody PaymentRequest request) {
        return paymentService.makePayment(
                
                request.getPropertyId(),
                request.getUserId(),
                request.getAmount()
        );
    }
}
