package com.example.wipro.services;

import com.example.wipro.dto.PaymentResponse;
import com.example.wipro.entities.Payment;
import com.example.wipro.enums.PaymentStatus;
import com.example.wipro.exceptions.ResourceNotFoundException;
import com.example.wipro.feign.PropertyClient;
import com.example.wipro.feign.UserClient;
import com.example.wipro.repos.PaymentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class PaymentService {

    private final PaymentRepository paymentRepository;
    private final PropertyClient propertyClient;

    public PaymentResponse makePayment(Long propertyId, Long userId, BigDecimal amount) {
        // Fetch property details from Property Service
        PropertyClient.PropertyResponse propertyResponse =
                propertyClient.getPropertyById(propertyId);

        if (propertyResponse == null || propertyResponse.pricePerDay() == null) {
            throw new ResourceNotFoundException("Property not found or price not set for ID: " + propertyId);
        }

        Payment payment = new Payment();
        payment.setPropertyId(propertyId);
        payment.setUserId(userId);
        payment.setAmount(amount);
        payment.setStatus(PaymentStatus.COMPLETED);
        payment.setPaymentDate(LocalDateTime.now());

        paymentRepository.save(payment);

        // Pass property name in response
        return PaymentResponse.fromEntity(payment, propertyResponse.name());
    }
}
