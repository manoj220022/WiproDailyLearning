package com.example.wipro.entities;

import com.example.wipro.enums.NotificationType;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "notifications")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long paymentId;
    private Long userId;
    private String message;

    @Enumerated(EnumType.STRING)
    private NotificationType type;

    private LocalDateTime createdAt;
}
