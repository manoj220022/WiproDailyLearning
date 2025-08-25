package com.example.wipro.dto;

import com.example.wipro.entities.Payment;
import com.example.wipro.enums.PaymentStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record PaymentResponse(
        Long id,
        Long propertyId,
        String propertyName,
        Long userId,
        BigDecimal amount,
        PaymentStatus status,
        LocalDateTime paymentDate
) {
    public static PaymentResponse fromEntity(Payment payment, String propertyName) {
        return new PaymentResponse(
                payment.getId(),
                payment.getPropertyId(),
                propertyName,
                payment.getUserId(),
                payment.getAmount(),
                payment.getStatus(),
                payment.getPaymentDate()
        );
    }
}
