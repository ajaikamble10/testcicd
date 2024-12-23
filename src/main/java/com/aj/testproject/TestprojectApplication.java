package com.aj.testproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TestprojectApplication {

	@GetMapping("/")
	public String getMessage(){
		return "Welcome to Spring Boot.";
	}

	public static void main(String[] args) {
		SpringApplication.run(TestprojectApplication.class, args);
	}

}
