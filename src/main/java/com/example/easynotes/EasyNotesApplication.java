package com.example.easynotes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.easynotes"})
public class EasyNotesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasyNotesApplication.class, args);
	}
}
