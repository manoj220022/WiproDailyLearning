package com.example.wipro.services;

import com.example.wipro.entities.Notification;
import com.example.wipro.enums.NotificationType;
import com.example.wipro.feign.PaymentClient;
import com.example.wipro.repositories.NotificationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class NotificationService {

    private final NotificationRepository notificationRepository;
    private final PaymentClient paymentClient;

    public Notification createNotificationForPayment(Long paymentId) {
        PaymentClient.PaymentResponse payment = paymentClient.getPaymentById(paymentId);

        NotificationType type;
        String message;

        switch (payment.status().toUpperCase()) {
            case "SUCCESS" -> {
                type = NotificationType.PAYMENT_SUCCESS;
                message = "Your payment for property " + payment.propertyName() + " was successful.";
            }
            case "PROCESSING" -> {
                type = NotificationType.PAYMENT_PROCESSING;
                message = "Your payment for property " + payment.propertyName() + " is being processed.";
            }
            case "CANCELLED" -> {
                type = NotificationType.PAYMENT_CANCELLED;
                message = "Your payment for property " + payment.propertyName() + " has been cancelled.";
            }
            default -> throw new IllegalArgumentException("Unknown payment status: " + payment.status());
        }

        Notification notification = Notification.builder()
                .paymentId(payment.id())
                .userId(payment.userId())
                .message(message)
                .type(type)
                .createdAt(LocalDateTime.now())
                .build();

        return notificationRepository.save(notification);
    }
}
