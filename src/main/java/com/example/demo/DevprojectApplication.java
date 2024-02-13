package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevprojectApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(DevprojectApplication.class, args);
		System.out.println("Hello world");
	}

}
