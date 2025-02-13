package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
		@RestController
		class HelloController {
			@GetMapping("/")
			public String hello() {
				return "Hello, Spring Boot! Docker image updated! 무중단 배포 테스트 수정 수정";

			}
		}

}
