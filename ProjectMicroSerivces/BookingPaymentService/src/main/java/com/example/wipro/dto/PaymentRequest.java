package com.example.wipro.dto;

import lombok.Data;

import java.math.BigDecimal;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;

@Data
public class PaymentRequest {
    private Long propertyId;
    private Long userId;
    
    @NotNull(message = "Amount is required")
    @DecimalMin(value = "0.01", message = "Amount must be greater than 0")
    private BigDecimal amount;

}
