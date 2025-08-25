package com.example.wipro;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BookingPaymentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingPaymentServiceApplication.class, args);
	}

}
