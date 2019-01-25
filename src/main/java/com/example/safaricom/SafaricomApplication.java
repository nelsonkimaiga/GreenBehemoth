package com.example.safaricom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SafaricomApplication {

	public static void main(String[] args) {
		SpringApplication.run(SafaricomApplication.class, args);
	}
}
