package com.example.wipro.controllers;

import com.example.wipro.entities.Notification;
import com.example.wipro.services.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/notifications")
@RequiredArgsConstructor
public class NotificationController {

    private final NotificationService notificationService;

    @PostMapping("/payment/{paymentId}")
    @ResponseStatus(HttpStatus.CREATED)
    public Notification createNotification(@PathVariable Long paymentId) {
        return notificationService.createNotificationForPayment(paymentId);
    }
}
